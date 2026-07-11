package com.fyber.inneractive.sdk.player.exoplayer2.text.webvtt;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f55995a = Pattern.compile("^NOTE(( |\t).*)?$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f55996b = Pattern.compile("^\ufeff?WEBVTT(( |\t).*)?$");

    public static long a(String str) {
        String[] strArrSplit = str.split("\\.", 2);
        long j2 = 0;
        for (String str2 : strArrSplit[0].split(":")) {
            j2 = (j2 * 60) + Long.parseLong(str2);
        }
        return (Long.parseLong(strArrSplit[1]) + (j2 * 1000)) * 1000;
    }
}
