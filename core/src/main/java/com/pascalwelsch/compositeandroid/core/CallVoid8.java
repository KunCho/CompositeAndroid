package com.pascalwelsch.compositeandroid.core;

public abstract class CallVoid8<T1, T2, T3, T4, T5, T6, T7, T8> extends NamedSuperCall {

    public CallVoid8(final String methodName) {
        super(methodName);
    }

    public abstract void call(final T1 p1, final T2 p2, final T3 p3, final T4 p4, T5 p5, T6 p6,
            T7 p7, T8 p8);
}
