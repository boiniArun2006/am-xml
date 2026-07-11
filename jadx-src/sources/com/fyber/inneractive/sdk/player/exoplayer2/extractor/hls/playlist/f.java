package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BufferedReader f54935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Queue f54936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f54937c;

    public final boolean a() throws IOException {
        String strTrim;
        if (this.f54937c != null) {
            return true;
        }
        if (!this.f54936b.isEmpty()) {
            this.f54937c = (String) this.f54936b.poll();
            return true;
        }
        do {
            String line = this.f54935a.readLine();
            this.f54937c = line;
            if (line == null) {
                return false;
            }
            strTrim = line.trim();
            this.f54937c = strTrim;
        } while (strTrim.isEmpty());
        return true;
    }

    public f(LinkedList linkedList, BufferedReader bufferedReader) {
        this.f54936b = linkedList;
        this.f54935a = bufferedReader;
    }
}
