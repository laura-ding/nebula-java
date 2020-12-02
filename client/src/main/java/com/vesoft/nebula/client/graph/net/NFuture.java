/* Copyright (c) 2020 vesoft inc. All rights reserved.
 *
 * This source code is licensed under Apache 2.0 License,
 * attached with Common Clause Condition 1.0, found in the LICENSES directory.
 */

package com.vesoft.nebula.client.graph.net;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class NFuture<T> implements Future<T> {
    private final Object sync = new Object();
    private T result = null;
    private boolean isDone = false;


    @Override
    public boolean cancel(boolean mayInterruptIfRunning) {
        return false;
    }

    @Override
    public boolean isCancelled() {
        return false;
    }

    @Override
    public boolean isDone() {
        return isDone;
    }

    @Override
    public T get() throws InterruptedException, ExecutionException {
        if (!isDone) {
            synchronized (sync) {
                sync.wait();
            }
        }
        return result;
    }

    @Override
    public T get(long timeout, TimeUnit unit)
        throws InterruptedException, TimeoutException {
        if (!isDone) {
            synchronized (sync) {
                sync.wait(unit.toNanos(timeout), 0);
            }
        }

        if (!isDone) {
            throw new TimeoutException("Future get timeout by " + timeout);
        }
        return result;
    }

    public void setResult(T result) {
        this.result = result;
        this.isDone = true;
        synchronized (sync) {
            this.sync.notifyAll();
        }
    }

    public T getResult() {
        return this.result;
    }
}
