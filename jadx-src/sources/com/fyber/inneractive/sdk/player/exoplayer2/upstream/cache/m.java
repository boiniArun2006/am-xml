package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class m extends g {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Pattern f56077g = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Pattern f56078h = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Pattern f56079i = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ea A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static m a(File file, i iVar) {
        File file2;
        String strGroup;
        File file3;
        h hVarA;
        String name = file.getName();
        if (name.endsWith(".v3.exo")) {
            file2 = file;
        } else {
            String name2 = file.getName();
            Matcher matcher = f56078h.matcher(name2);
            if (matcher.matches()) {
                strGroup = matcher.group(1);
                int i2 = z.f56234a;
                int length = strGroup.length();
                int iEnd = 0;
                int i3 = 0;
                for (int i5 = 0; i5 < length; i5++) {
                    if (strGroup.charAt(i5) == '%') {
                        i3++;
                    }
                }
                if (i3 != 0) {
                    int i7 = length - (i3 * 2);
                    StringBuilder sb = new StringBuilder(i7);
                    Matcher matcher2 = z.f56240g.matcher(strGroup);
                    while (i3 > 0 && matcher2.find()) {
                        char c2 = (char) Integer.parseInt(matcher2.group(1), 16);
                        sb.append((CharSequence) strGroup, iEnd, matcher2.start());
                        sb.append(c2);
                        iEnd = matcher2.end();
                        i3--;
                    }
                    if (iEnd < length) {
                        sb.append((CharSequence) strGroup, iEnd, length);
                    }
                    strGroup = sb.length() != i7 ? null : sb.toString();
                }
                if (strGroup == null) {
                    file3 = null;
                    if (file3 != null) {
                        return null;
                    }
                    name = file3.getName();
                    file2 = file3;
                } else {
                    File parentFile = file.getParentFile();
                    hVarA = (h) iVar.f56060a.get(strGroup);
                    if (hVarA == null) {
                        hVarA = iVar.a(strGroup, -1L);
                    }
                    file3 = new File(parentFile, hVarA.f56056a + "." + Long.parseLong(matcher.group(2)) + "." + Long.parseLong(matcher.group(3)) + ".v3.exo");
                    if (!file.renameTo(file3)) {
                    }
                    if (file3 != null) {
                    }
                }
            } else {
                matcher = f56077g.matcher(name2);
                if (matcher.matches()) {
                    strGroup = matcher.group(1);
                    File parentFile2 = file.getParentFile();
                    hVarA = (h) iVar.f56060a.get(strGroup);
                    if (hVarA == null) {
                    }
                    file3 = new File(parentFile2, hVarA.f56056a + "." + Long.parseLong(matcher.group(2)) + "." + Long.parseLong(matcher.group(3)) + ".v3.exo");
                    if (!file.renameTo(file3)) {
                    }
                    if (file3 != null) {
                    }
                }
                file3 = null;
                if (file3 != null) {
                }
            }
        }
        Matcher matcher3 = f56079i.matcher(name);
        if (!matcher3.matches()) {
            return null;
        }
        long length2 = file2.length();
        String str = (String) iVar.f56061b.get(Integer.parseInt(matcher3.group(1)));
        if (str == null) {
            return null;
        }
        return new m(str, Long.parseLong(matcher3.group(2)), length2, Long.parseLong(matcher3.group(3)), file2);
    }

    public m(String str, long j2, long j3, long j4, File file) {
        super(str, j2, j3, j4, file);
    }
}
