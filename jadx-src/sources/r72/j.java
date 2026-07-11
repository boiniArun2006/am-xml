package r72;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class j implements B8O.n {
    private final double J2;
    private final v8.j KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final long f72860O;
    private final long Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Function0 f72861n;
    private final int nr;
    private final sJa.Wre rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final lA5.j f72862t;
    public static final C1149j xMQ = new C1149j(null);
    public static final int mUb = 8;

    /* JADX INFO: renamed from: r72.j$j, reason: collision with other inner class name */
    public static final class C1149j {
        public /* synthetic */ C1149j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1149j() {
        }
    }

    public j(Function0 timestampProvider, sJa.Wre periodicDaemonFactory, lA5.j networkInterface, int i2, long j2, double d2, long j3, v8.j localLogger) {
        Intrinsics.checkNotNullParameter(timestampProvider, "timestampProvider");
        Intrinsics.checkNotNullParameter(periodicDaemonFactory, "periodicDaemonFactory");
        Intrinsics.checkNotNullParameter(networkInterface, "networkInterface");
        Intrinsics.checkNotNullParameter(localLogger, "localLogger");
        this.f72861n = timestampProvider;
        this.rl = periodicDaemonFactory;
        this.f72862t = networkInterface;
        this.nr = i2;
        this.f72860O = j2;
        this.J2 = d2;
        this.Uo = j3;
        this.KN = localLogger;
    }

    @Override // B8O.n
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public n n(AE.j eventRetriever, String userId, boolean z2, raJ.j sampler, Long l2) {
        Intrinsics.checkNotNullParameter(eventRetriever, "eventRetriever");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(sampler, "sampler");
        return new n(eventRetriever, this.nr, this.f72861n, this.f72862t, new fuX(l2 != null ? l2.longValue() : 10000L, q3M.I28.rl(q3M.n.rl, this.f72860O, this.J2, this.Uo)), this.rl, sampler, userId, z2, this.KN);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ j(kotlin.jvm.functions.Function0 r14, sJa.Wre r15, lA5.j r16, int r17, long r18, double r20, long r22, v8.j r24, int r25, kotlin.jvm.internal.DefaultConstructorMarker r26) {
        /*
            r13 = this;
            r0 = r25 & 8
            if (r0 == 0) goto L8
            r0 = 100
            r5 = r0
            goto La
        L8:
            r5 = r17
        La:
            r0 = r25 & 16
            if (r0 == 0) goto L12
            r0 = 2000(0x7d0, double:9.88E-321)
            r6 = r0
            goto L14
        L12:
            r6 = r18
        L14:
            r0 = r25 & 32
            if (r0 == 0) goto L1c
            r0 = 4611686018427387904(0x4000000000000000, double:2.0)
            r8 = r0
            goto L1e
        L1c:
            r8 = r20
        L1e:
            r0 = r25 & 64
            if (r0 == 0) goto L2e
            r0 = 7200000(0x6ddd00, double:3.5572727E-317)
            r10 = r0
            r2 = r14
            r3 = r15
            r4 = r16
            r12 = r24
            r1 = r13
            goto L37
        L2e:
            r10 = r22
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r12 = r24
        L37:
            r1.<init>(r2, r3, r4, r5, r6, r8, r10, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r72.j.<init>(kotlin.jvm.functions.Function0, sJa.Wre, lA5.j, int, long, double, long, v8.j, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
