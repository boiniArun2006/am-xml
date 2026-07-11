package com.bumptech.glide;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class Registry$NoImageHeaderParserException extends Registry$MissingComponentException {
    /* JADX WARN: Illegal instructions before constructor call */
    public Registry$NoImageHeaderParserException() {
        final String str = "Failed to find image header parser.";
        new RuntimeException(str) { // from class: com.bumptech.glide.Registry$MissingComponentException
        };
    }
}
