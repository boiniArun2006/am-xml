package androidx.profileinstaller;

import androidx.annotation.RestrictTo;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@RestrictTo
public class ProfileVersion {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final byte[] f40945n = {48, 49, 53, 0};
    static final byte[] rl = {48, 49, 48, 0};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final byte[] f40946t = {48, 48, 57, 0};
    static final byte[] nr = {48, 48, 53, 0};

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    static final byte[] f40944O = {48, 48, 49, 0};
    static final byte[] J2 = {48, 48, 49, 0};
    static final byte[] Uo = {48, 48, 50, 0};

    static String n(byte[] bArr) {
        return (Arrays.equals(bArr, f40944O) || Arrays.equals(bArr, nr)) ? ":" : "!";
    }
}
