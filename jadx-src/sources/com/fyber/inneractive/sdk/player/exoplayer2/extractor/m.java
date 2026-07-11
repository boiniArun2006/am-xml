package com.fyber.inneractive.sdk.player.exoplayer2.extractor;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f54984c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f54985a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f54986b = -1;

    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.metadata.b bVar) {
        int i2 = 0;
        while (true) {
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.o[] oVarArr = bVar.f55816a;
            if (i2 >= oVarArr.length) {
                return;
            }
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.o oVar = oVarArr[i2];
            if (oVar instanceof com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j) {
                com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j jVar = (com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j) oVar;
                String str = jVar.f55834c;
                String str2 = jVar.f55835d;
                if ("iTunSMPB".equals(str)) {
                    Matcher matcher = f54984c.matcher(str2);
                    if (matcher.find()) {
                        try {
                            int i3 = Integer.parseInt(matcher.group(1), 16);
                            int i5 = Integer.parseInt(matcher.group(2), 16);
                            if (i3 > 0 || i5 > 0) {
                                this.f54985a = i3;
                                this.f54986b = i5;
                                return;
                            }
                        } catch (NumberFormatException unused) {
                            continue;
                        }
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            i2++;
        }
    }
}
