package com.google.android.exoplayer2.upstream.cache;

import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class fuX extends CacheSpan {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Pattern f58452n = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Pattern f58453t = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final Pattern f58451O = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    public static fuX J2(String str, long j2) {
        return new fuX(str, j2, -1L, -9223372036854775807L, null);
    }

    public static File Uo(File file, int i2, long j2, long j3) {
        return new File(file, i2 + "." + j2 + "." + j3 + ".v3.exo");
    }

    public static fuX nr(String str, long j2, long j3) {
        return new fuX(str, j2, j3, -9223372036854775807L, null);
    }

    public static fuX rl(File file, long j2, long j3, I28 i28) {
        String strQie;
        String name = file.getName();
        if (!name.endsWith(".v3.exo")) {
            file = KN(file, i28);
            if (file == null) {
                return null;
            }
            name = file.getName();
        }
        File file2 = file;
        Matcher matcher = f58451O.matcher(name);
        if (!matcher.matches() || (strQie = i28.qie(Integer.parseInt((String) Assertions.checkNotNull(matcher.group(1))))) == null) {
            return null;
        }
        if (j2 == -1) {
            j2 = file2.length();
        }
        long j4 = j2;
        if (j4 == 0) {
            return null;
        }
        return new fuX(strQie, Long.parseLong((String) Assertions.checkNotNull(matcher.group(2))), j4, j3 == -9223372036854775807L ? Long.parseLong((String) Assertions.checkNotNull(matcher.group(3))) : j3, file2);
    }

    public fuX n(File file, long j2) {
        Assertions.checkState(this.isCached);
        return new fuX(this.key, this.position, this.length, j2, file);
    }

    private fuX(String str, long j2, long j3, long j4, File file) {
        super(str, j2, j3, j4, file);
    }

    private static File KN(File file, I28 i28) {
        String strUnescapeFileName;
        String name = file.getName();
        Matcher matcher = f58453t.matcher(name);
        if (matcher.matches()) {
            strUnescapeFileName = Util.unescapeFileName((String) Assertions.checkNotNull(matcher.group(1)));
        } else {
            matcher = f58452n.matcher(name);
            if (matcher.matches()) {
                strUnescapeFileName = (String) Assertions.checkNotNull(matcher.group(1));
            } else {
                strUnescapeFileName = null;
            }
        }
        if (strUnescapeFileName == null) {
            return null;
        }
        File fileUo = Uo((File) Assertions.checkStateNotNull(file.getParentFile()), i28.J2(strUnescapeFileName), Long.parseLong((String) Assertions.checkNotNull(matcher.group(2))), Long.parseLong((String) Assertions.checkNotNull(matcher.group(3))));
        if (!file.renameTo(fileUo)) {
            return null;
        }
        return fileUo;
    }

    public static fuX t(File file, long j2, I28 i28) {
        return rl(file, j2, -9223372036854775807L, i28);
    }
}
