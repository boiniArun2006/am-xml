package com.fyber.inneractive.sdk.player.cache;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class j extends ByteArrayOutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f54407a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, int i2) {
        super(i2);
        this.f54407a = kVar;
    }

    @Override // java.io.ByteArrayOutputStream
    public final String toString() {
        int i2 = ((ByteArrayOutputStream) this).count;
        if (i2 > 0) {
            int i3 = i2 - 1;
            if (((ByteArrayOutputStream) this).buf[i3] == 13) {
                i2 = i3;
            }
        }
        try {
            return new String(((ByteArrayOutputStream) this).buf, 0, i2, this.f54407a.f54409b.name());
        } catch (UnsupportedEncodingException e2) {
            throw new AssertionError(e2);
        }
    }
}
