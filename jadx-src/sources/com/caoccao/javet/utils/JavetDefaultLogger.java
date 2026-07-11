package com.caoccao.javet.utils;

import com.caoccao.javet.interfaces.IJavetLogger;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class JavetDefaultLogger implements IJavetLogger {
    protected Logger logger;
    protected String name;

    @Override // com.caoccao.javet.interfaces.IJavetLogger
    public void error(String str) {
        this.logger.log(Level.SEVERE, str);
    }

    @Override // com.caoccao.javet.interfaces.IJavetLogger
    public void debug(String str) {
        this.logger.log(Level.FINE, str);
    }

    @Override // com.caoccao.javet.interfaces.IJavetLogger
    public void error(String str, Throwable th) {
        this.logger.severe(str);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                PrintStream printStream = new PrintStream(byteArrayOutputStream);
                try {
                    th.printStackTrace(printStream);
                    this.logger.severe(byteArrayOutputStream.toString(StandardCharsets.UTF_8.name()));
                    printStream.close();
                    byteArrayOutputStream.close();
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    public Logger getLogger() {
        return this.logger;
    }

    public String getName() {
        return this.name;
    }

    @Override // com.caoccao.javet.interfaces.IJavetLogger
    public void info(String str) {
        this.logger.info(str);
    }

    @Override // com.caoccao.javet.interfaces.IJavetLogger
    public void warn(String str) {
        this.logger.warning(str);
    }

    public JavetDefaultLogger(String str) {
        this.logger = Logger.getLogger(str);
        this.name = str;
    }
}
