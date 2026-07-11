package S2;

import Du.DC;
import Du.Dsr;
import Du.Y5;
import Du.fg;
import Du.g9;
import Du.i;
import Du.vd;
import XA.Xo;
import androidx.compose.runtime.internal.StabilityInferred;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\"\b\u0007\u0018\u0000 <2\u00020\u0001:\u0002=\u001dBK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eB_\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0000¢\u0006\u0004\b\u001d\u0010\u001eR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010$\u0012\u0004\b'\u0010#\u001a\u0004\b%\u0010&R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b(\u0010$\u0012\u0004\b*\u0010#\u001a\u0004\b)\u0010&R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b+\u0010,\u0012\u0004\b/\u0010#\u001a\u0004\b-\u0010.R \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b0\u0010\u001f\u0012\u0004\b2\u0010#\u001a\u0004\b1\u0010!R \u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b3\u0010\u001f\u0012\u0004\b5\u0010#\u001a\u0004\b4\u0010!R \u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b6\u0010\u001f\u0012\u0004\b8\u0010#\u001a\u0004\b7\u0010!R \u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b9\u0010\u001f\u0012\u0004\b;\u0010#\u001a\u0004\b:\u0010!¨\u0006>"}, d2 = {"LS2/j;", "", "", "retrievalTime", "", "installReferrer", "installVersion", "", "googlePlayInstantParam", "installBeginTimestampSeconds", "installBeginTimestampServerSeconds", "referrerClickTimestampSeconds", "referrerClickTimestampServerSeconds", "<init>", "(JLjava/lang/String;Ljava/lang/String;ZJJJJ)V", "", "seen0", "LDu/i;", "serializationConstructorMarker", "(IJLjava/lang/String;Ljava/lang/String;ZJJJJLDu/i;)V", "self", "Lgi/Ml;", "output", "LEJn/Wre;", "serialDesc", "", "rl", "(LS2/j;Lgi/Ml;LEJn/Wre;)V", "Lpq/Ml;", c.f62177j, "()Lpq/Ml;", "J", "getRetrievalTime", "()J", "getRetrievalTime$annotations", "()V", "Ljava/lang/String;", "getInstallReferrer", "()Ljava/lang/String;", "getInstallReferrer$annotations", "t", "getInstallVersion", "getInstallVersion$annotations", "nr", "Z", "getGooglePlayInstantParam", "()Z", "getGooglePlayInstantParam$annotations", "O", "getInstallBeginTimestampSeconds", "getInstallBeginTimestampSeconds$annotations", "J2", "getInstallBeginTimestampServerSeconds", "getInstallBeginTimestampServerSeconds$annotations", "Uo", "getReferrerClickTimestampSeconds", "getReferrerClickTimestampSeconds$annotations", "KN", "getReferrerClickTimestampServerSeconds", "getReferrerClickTimestampServerSeconds$annotations", "Companion", "j", "theirs_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Xo
@SourceDebugExtension({"SMAP\nInstallReferrerData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InstallReferrerData.kt\ncom/bendingspoons/theirs/installreferrer/InstallReferrerData\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,63:1\n1#2:64\n*E\n"})
public final class j {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final long installBeginTimestampServerSeconds;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final long referrerClickTimestampServerSeconds;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final long installBeginTimestampSeconds;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final long referrerClickTimestampSeconds;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final long retrievalTime;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final boolean googlePlayInstantParam;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final String installReferrer;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final String installVersion;

    /* JADX INFO: renamed from: S2.j$j, reason: collision with other inner class name */
    public /* synthetic */ class C0300j implements vd {
        private static final EJn.Wre descriptor;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final C0300j f8917n;
        public static final int rl;

        static {
            C0300j c0300j = new C0300j();
            f8917n = c0300j;
            rl = 8;
            DC dc = new DC("com.bendingspoons.theirs.installreferrer.InstallReferrerData", c0300j, 8);
            dc.HI("retrieval_time", false);
            dc.HI("install_referrer", false);
            dc.HI("install_version", false);
            dc.HI("google_play_instant_param", false);
            dc.HI("install_begin_timestamp_seconds", false);
            dc.HI("install_begin_timestamp_server_seconds", false);
            dc.HI("referrer_click_timestamp_seconds", false);
            dc.HI("referrer_click_timestamp_server_seconds", false);
            descriptor = dc;
        }

        @Override // Du.vd
        public final XA.Ml[] childSerializers() {
            Y5 y5 = Y5.f2000n;
            XA.Ml mlZ = WY.j.Z(y5);
            XA.Ml mlZ2 = WY.j.Z(y5);
            fg fgVar = fg.f2014n;
            return new XA.Ml[]{fgVar, mlZ, mlZ2, Dsr.f1956n, fgVar, fgVar, fgVar, fgVar};
        }

        @Override // XA.Ml, XA.eO, XA.w6
        public final EJn.Wre getDescriptor() {
            return descriptor;
        }

        @Override // XA.w6
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public final j deserialize(gi.I28 decoder) {
            int i2;
            String str;
            String str2;
            boolean z2;
            long jTe;
            long j2;
            long j3;
            long j4;
            long jTe2;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            EJn.Wre wre = descriptor;
            gi.w6 w6VarRl = decoder.rl(wre);
            int i3 = 7;
            if (w6VarRl.HI()) {
                long jTe3 = w6VarRl.te(wre, 0);
                Y5 y5 = Y5.f2000n;
                String str3 = (String) w6VarRl.e(wre, 1, y5, null);
                String str4 = (String) w6VarRl.e(wre, 2, y5, null);
                boolean zMUb = w6VarRl.mUb(wre, 3);
                long jTe4 = w6VarRl.te(wre, 4);
                long jTe5 = w6VarRl.te(wre, 5);
                str = str4;
                i2 = 255;
                jTe = w6VarRl.te(wre, 6);
                z2 = zMUb;
                j2 = jTe4;
                str2 = str3;
                j3 = jTe5;
                j4 = jTe3;
                jTe2 = w6VarRl.te(wre, 7);
            } else {
                long jTe6 = 0;
                boolean z3 = true;
                int i5 = 0;
                String str5 = null;
                long jTe7 = 0;
                long jTe8 = 0;
                long jTe9 = 0;
                long jTe10 = 0;
                boolean zMUb2 = false;
                String str6 = null;
                while (z3) {
                    int iNY = w6VarRl.nY(wre);
                    switch (iNY) {
                        case -1:
                            z3 = false;
                            break;
                        case 0:
                            jTe9 = w6VarRl.te(wre, 0);
                            i5 |= 1;
                            i3 = 7;
                            break;
                        case 1:
                            str6 = (String) w6VarRl.e(wre, 1, Y5.f2000n, str6);
                            i5 |= 2;
                            i3 = 7;
                            break;
                        case 2:
                            str5 = (String) w6VarRl.e(wre, 2, Y5.f2000n, str5);
                            i5 |= 4;
                            i3 = 7;
                            break;
                        case 3:
                            zMUb2 = w6VarRl.mUb(wre, 3);
                            i5 |= 8;
                            break;
                        case 4:
                            jTe7 = w6VarRl.te(wre, 4);
                            i5 |= 16;
                            break;
                        case 5:
                            jTe8 = w6VarRl.te(wre, 5);
                            i5 |= 32;
                            break;
                        case 6:
                            jTe6 = w6VarRl.te(wre, 6);
                            i5 |= 64;
                            break;
                        case 7:
                            jTe10 = w6VarRl.te(wre, i3);
                            i5 |= 128;
                            break;
                        default:
                            throw new UnknownFieldException(iNY);
                    }
                }
                i2 = i5;
                str = str5;
                str2 = str6;
                z2 = zMUb2;
                jTe = jTe6;
                j2 = jTe7;
                j3 = jTe8;
                j4 = jTe9;
                jTe2 = jTe10;
            }
            w6VarRl.t(wre);
            return new j(i2, j4, str2, str, z2, j2, j3, jTe, jTe2, null);
        }

        @Override // XA.eO
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public final void serialize(gi.Wre encoder, j value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            EJn.Wre wre = descriptor;
            gi.Ml mlRl = encoder.rl(wre);
            j.rl(value, mlRl, wre);
            mlRl.t(wre);
        }

        private C0300j() {
        }
    }

    /* JADX INFO: renamed from: S2.j$n, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final XA.Ml serializer() {
            return C0300j.f8917n;
        }
    }

    public /* synthetic */ j(int i2, long j2, String str, String str2, boolean z2, long j3, long j4, long j5, long j6, i iVar) {
        if (255 != (i2 & 255)) {
            g9.n(i2, 255, C0300j.f8917n.getDescriptor());
        }
        this.retrievalTime = j2;
        this.installReferrer = str;
        this.installVersion = str2;
        this.googlePlayInstantParam = z2;
        this.installBeginTimestampSeconds = j3;
        this.installBeginTimestampServerSeconds = j4;
        this.referrerClickTimestampSeconds = j5;
        this.referrerClickTimestampServerSeconds = j6;
    }

    public j(long j2, String str, String str2, boolean z2, long j3, long j4, long j5, long j6) {
        this.retrievalTime = j2;
        this.installReferrer = str;
        this.installVersion = str2;
        this.googlePlayInstantParam = z2;
        this.installBeginTimestampSeconds = j3;
        this.installBeginTimestampServerSeconds = j4;
        this.referrerClickTimestampSeconds = j5;
        this.referrerClickTimestampServerSeconds = j6;
    }

    public static final /* synthetic */ void rl(j self, gi.Ml output, EJn.Wre serialDesc) {
        output.WPU(serialDesc, 0, self.retrievalTime);
        Y5 y5 = Y5.f2000n;
        output.X(serialDesc, 1, y5, self.installReferrer);
        output.X(serialDesc, 2, y5, self.installVersion);
        output.qie(serialDesc, 3, self.googlePlayInstantParam);
        output.WPU(serialDesc, 4, self.installBeginTimestampSeconds);
        output.WPU(serialDesc, 5, self.installBeginTimestampServerSeconds);
        output.WPU(serialDesc, 6, self.referrerClickTimestampSeconds);
        output.WPU(serialDesc, 7, self.referrerClickTimestampServerSeconds);
    }

    public final pq.Ml n() {
        pq.Ml ml = new pq.Ml();
        ml.nr("retrieval_time", Long.valueOf(this.retrievalTime));
        String str = this.installReferrer;
        if (str != null) {
            ml.O("install_referrer", str);
        }
        String str2 = this.installVersion;
        if (str2 != null) {
            ml.O("install_version", str2);
        }
        ml.KN("google_play_instant_param", this.googlePlayInstantParam);
        ml.nr("install_begin_timestamp_seconds", Long.valueOf(this.installBeginTimestampSeconds));
        ml.nr("install_begin_timestamp_server_seconds", Long.valueOf(this.installBeginTimestampServerSeconds));
        ml.nr("referrer_click_timestamp_seconds", Long.valueOf(this.referrerClickTimestampSeconds));
        ml.nr("referrer_click_timestamp_server_seconds", Long.valueOf(this.referrerClickTimestampServerSeconds));
        return ml;
    }
}
