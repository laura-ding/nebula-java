/* Copyright (c) 2020 vesoft inc. All rights reserved.
 *
 * This source code is licensed under Apache 2.0 License,
 * attached with Common Clause Condition 1.0, found in the LICENSES directory.
 */

package com.vesoft.nebula.client.graph.net;

import com.vesoft.nebula.client.graph.exception.IOErrorException;

public class RpcResponse<T> {
    private IOErrorException exception = null;
    private T result = null;

    public RpcResponse(IOErrorException exception) {
        this.exception = exception;
    }

    public RpcResponse(T result) {
        this.result = result;
    }

    public boolean hasError() {
        return exception != null;
    }

    public IOErrorException getException() {
        return exception;
    }

    public T getResult() {
        return result;
    }
}
