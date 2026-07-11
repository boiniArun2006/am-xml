package com.caoccao.javet.exceptions;

import com.caoccao.javet.interfaces.IJavetEntityError;
import com.caoccao.javet.interop.converters.JavetObjectConverter;
import com.caoccao.javet.values.V8Value;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class JavetScriptingError {
    private static final JavetObjectConverter CONVERTER = new JavetObjectConverter();
    private static final String DETAILED_MESSAGE = "detailedMessage";
    private static final String MESSAGE = "message";
    private static final String STACK = "stack";
    private Object context;
    private String detailedMessage;
    private final int endColumn;
    private final int endPosition;
    private final int lineNumber;
    private final String message;
    private final String resourceName;
    private final String sourceLine;
    private final String stack;
    private final int startColumn;
    private final int startPosition;

    JavetScriptingError(V8Value v8Value, String str, String str2, int i2, int i3, int i5, int i7, int i8) {
        try {
            this.context = CONVERTER.toObject(v8Value, true);
        } catch (JavetException unused) {
            this.context = null;
        }
        Object obj = this.context;
        if (obj instanceof IJavetEntityError) {
            IJavetEntityError iJavetEntityError = (IJavetEntityError) obj;
            this.detailedMessage = iJavetEntityError.getDetailedMessage();
            this.message = iJavetEntityError.getMessage();
            this.stack = iJavetEntityError.getStack();
        } else if (obj instanceof Map) {
            Map map = (Map) obj;
            if (map.containsKey(DETAILED_MESSAGE)) {
                this.detailedMessage = String.valueOf(map.get(DETAILED_MESSAGE));
            } else {
                this.detailedMessage = null;
            }
            this.message = String.valueOf(map.getOrDefault("message", null));
            this.stack = String.valueOf(map.getOrDefault("stack", null));
        } else {
            this.detailedMessage = null;
            this.message = null;
            this.stack = null;
        }
        if (this.detailedMessage == null) {
            this.detailedMessage = this.message;
        }
        this.endColumn = i5;
        this.endPosition = i8;
        this.lineNumber = i2;
        this.resourceName = str;
        this.sourceLine = str2;
        this.startColumn = i3;
        this.startPosition = i7;
    }

    public Object getContext() {
        return this.context;
    }

    public String getDetailedMessage() {
        return this.detailedMessage;
    }

    public int getEndColumn() {
        return this.endColumn;
    }

    public int getEndPosition() {
        return this.endPosition;
    }

    public int getLineNumber() {
        return this.lineNumber;
    }

    public String getMessage() {
        return this.message;
    }

    public String getResourceName() {
        return this.resourceName;
    }

    public String getSourceLine() {
        return this.sourceLine;
    }

    public String getStack() {
        return this.stack;
    }

    public int getStartColumn() {
        return this.startColumn;
    }

    public int getStartPosition() {
        return this.startPosition;
    }

    public String toString() {
        return this.detailedMessage + "\nResource: " + this.resourceName + "\nSource Code: " + this.sourceLine + "\nLine Number: " + this.lineNumber + "\nColumn: " + this.startColumn + ", " + this.endColumn + "\nPosition: " + this.startPosition + ", " + this.endPosition;
    }

    public JavetScriptingError(String str, String str2, String str3) {
        this.detailedMessage = str2;
        this.endColumn = 0;
        this.endPosition = 0;
        this.lineNumber = 0;
        this.message = str;
        this.resourceName = "";
        this.sourceLine = "";
        this.stack = str3;
        this.startColumn = 0;
        this.startPosition = 0;
    }
}
