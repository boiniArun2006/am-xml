package com.caoccao.javet.interception.logging;

import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.values.V8Value;
import java.io.PrintStream;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class JavetStandardConsoleInterceptor extends BaseJavetConsoleInterceptor {
    protected PrintStream debug;
    protected PrintStream error;
    protected PrintStream info;
    protected PrintStream log;
    protected PrintStream trace;
    protected PrintStream warn;

    @Override // com.caoccao.javet.interception.logging.BaseJavetConsoleInterceptor
    public void consoleDebug(V8Value... v8ValueArr) {
        this.debug.println(concat(v8ValueArr));
    }

    @Override // com.caoccao.javet.interception.logging.BaseJavetConsoleInterceptor
    public void consoleError(V8Value... v8ValueArr) {
        this.error.println(concat(v8ValueArr));
    }

    @Override // com.caoccao.javet.interception.logging.BaseJavetConsoleInterceptor
    public void consoleInfo(V8Value... v8ValueArr) {
        this.info.println(concat(v8ValueArr));
    }

    @Override // com.caoccao.javet.interception.logging.BaseJavetConsoleInterceptor
    public void consoleLog(V8Value... v8ValueArr) {
        this.log.println(concat(v8ValueArr));
    }

    @Override // com.caoccao.javet.interception.logging.BaseJavetConsoleInterceptor
    public void consoleTrace(V8Value... v8ValueArr) {
        this.trace.println(concat(v8ValueArr));
    }

    @Override // com.caoccao.javet.interception.logging.BaseJavetConsoleInterceptor
    public void consoleWarn(V8Value... v8ValueArr) {
        this.warn.println(concat(v8ValueArr));
    }

    public PrintStream getDebug() {
        return this.debug;
    }

    public PrintStream getError() {
        return this.error;
    }

    public PrintStream getInfo() {
        return this.info;
    }

    public PrintStream getLog() {
        return this.log;
    }

    public PrintStream getTrace() {
        return this.trace;
    }

    public PrintStream getWarn() {
        return this.warn;
    }

    public void setDebug(PrintStream printStream) {
        this.debug = printStream;
    }

    public void setError(PrintStream printStream) {
        this.error = printStream;
    }

    public void setInfo(PrintStream printStream) {
        this.info = printStream;
    }

    public void setLog(PrintStream printStream) {
        this.log = printStream;
    }

    public void setTrace(PrintStream printStream) {
        this.trace = printStream;
    }

    public void setWarn(PrintStream printStream) {
        this.warn = printStream;
    }

    public JavetStandardConsoleInterceptor(V8Runtime v8Runtime) {
        super(v8Runtime);
        PrintStream printStream = System.out;
        this.warn = printStream;
        this.trace = printStream;
        this.log = printStream;
        this.info = printStream;
        this.debug = printStream;
        this.error = System.err;
    }
}
