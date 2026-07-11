package com.fyber.inneractive.sdk.player.exoplayer2.source;

import java.io.EOFException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.i[] f55932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.j f55933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.i f55934c;

    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.i a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) throws a0 {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.i iVar = this.f55934c;
        if (iVar != null) {
            return iVar;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.i[] iVarArr = this.f55932a;
        int length = iVarArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.i iVar2 = iVarArr[i2];
            try {
                if (iVar2.a(bVar)) {
                    this.f55934c = iVar2;
                    bVar.f54728e = 0;
                    break;
                }
                continue;
            } catch (EOFException unused) {
            } catch (Throwable th) {
                bVar.f54728e = 0;
                throw th;
            }
            bVar.f54728e = 0;
            i2++;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.i iVar3 = this.f55934c;
        if (iVar3 != null) {
            iVar3.a(this.f55933b);
            return this.f55934c;
        }
        StringBuilder sb = new StringBuilder("None of the available extractors (");
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.i[] iVarArr2 = this.f55932a;
        int i3 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.f56234a;
        StringBuilder sb2 = new StringBuilder();
        for (int i5 = 0; i5 < iVarArr2.length; i5++) {
            sb2.append(iVarArr2[i5].getClass().getSimpleName());
            if (i5 < iVarArr2.length - 1) {
                sb2.append(", ");
            }
        }
        sb.append(sb2.toString());
        sb.append(") could read the stream.");
        throw new a0(sb.toString());
    }

    public n(com.fyber.inneractive.sdk.player.exoplayer2.extractor.i[] iVarArr, com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar) {
        this.f55932a = iVarArr;
        this.f55933b = jVar;
    }
}
