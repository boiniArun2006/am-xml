package Mms;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.text.Typography;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class qz {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final qz f6734n;
    public static final char[] rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final byte[] f6735t;

    private final void J2() {
        for (int i2 = 0; i2 < 32; i2++) {
            rl(i2, 'u');
        }
        rl(8, 'b');
        rl(9, 't');
        rl(10, 'n');
        rl(12, 'f');
        rl(13, 'r');
        n('/', '/');
        n(Typography.quote, Typography.quote);
        n('\\', '\\');
    }

    private final void O() {
        for (int i2 = 0; i2 < 33; i2++) {
            nr(i2, ByteCompanionObject.MAX_VALUE);
        }
        nr(9, (byte) 3);
        nr(10, (byte) 3);
        nr(13, (byte) 3);
        nr(32, (byte) 3);
        t(',', (byte) 4);
        t(':', (byte) 5);
        t('{', (byte) 6);
        t('}', (byte) 7);
        t('[', (byte) 8);
        t(']', (byte) 9);
        t(Typography.quote, (byte) 1);
        t('\\', (byte) 2);
    }

    static {
        qz qzVar = new qz();
        f6734n = qzVar;
        rl = new char[Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE];
        f6735t = new byte[126];
        qzVar.J2();
        qzVar.O();
    }

    private final void nr(int i2, byte b2) {
        f6735t[i2] = b2;
    }

    private final void rl(int i2, char c2) {
        if (c2 != 'u') {
            rl[c2] = (char) i2;
        }
    }

    private qz() {
    }

    private final void n(char c2, char c4) {
        rl(c2, c4);
    }

    private final void t(char c2, byte b2) {
        nr(c2, b2);
    }
}
