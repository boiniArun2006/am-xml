package com.caoccao.javet.interop.executors;

import com.caoccao.javet.exceptions.JavetError;
import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.utils.SimpleMap;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class V8FileExecutor extends V8StringExecutor {
    protected File scriptFile;

    public File getScriptFile() {
        return this.scriptFile;
    }

    @Override // com.caoccao.javet.interop.executors.V8StringExecutor, com.caoccao.javet.interop.executors.IV8Executor
    public String getScriptString() throws JavetException {
        if (this.scriptString == null) {
            try {
                FileInputStream fileInputStream = new FileInputStream(this.scriptFile);
                try {
                    byte[] bArr = new byte[fileInputStream.available()];
                    fileInputStream.read(bArr);
                    this.scriptString = new String(bArr, StandardCharsets.UTF_8);
                    fileInputStream.close();
                } finally {
                }
            } catch (IOException e2) {
                throw new JavetException(JavetError.FailedToReadPath, SimpleMap.of(JavetError.PARAMETER_PATH, this.scriptFile), e2);
            }
        }
        return this.scriptString;
    }

    public V8FileExecutor(V8Runtime v8Runtime, File file) throws JavetException {
        super(v8Runtime);
        Objects.requireNonNull(file);
        this.scriptFile = file;
        setResourceName(file.getAbsolutePath());
    }
}
