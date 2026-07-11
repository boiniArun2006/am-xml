package com.caoccao.javet.interop.executors;

import com.applovin.shadow.okio.fuX;
import com.caoccao.javet.exceptions.JavetError;
import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.utils.SimpleMap;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class V8PathExecutor extends V8StringExecutor {
    protected Path scriptPath;

    public Path getScriptPath() {
        return this.scriptPath;
    }

    @Override // com.caoccao.javet.interop.executors.V8StringExecutor, com.caoccao.javet.interop.executors.IV8Executor
    public String getScriptString() throws JavetException {
        if (this.scriptString == null) {
            try {
                FileInputStream fileInputStream = new FileInputStream(this.scriptPath.toString());
                try {
                    byte[] bArr = new byte[fileInputStream.available()];
                    fileInputStream.read(bArr);
                    this.scriptString = new String(bArr, StandardCharsets.UTF_8);
                    fileInputStream.close();
                } finally {
                }
            } catch (IOException e2) {
                throw new JavetException(JavetError.FailedToReadPath, SimpleMap.of(JavetError.PARAMETER_PATH, this.scriptPath), e2);
            }
        }
        return this.scriptString;
    }

    public V8PathExecutor(V8Runtime v8Runtime, Path path) throws JavetException {
        super(v8Runtime);
        Objects.requireNonNull(path);
        this.scriptPath = fuX.n(path);
        setResourceName(path.toString());
    }
}
