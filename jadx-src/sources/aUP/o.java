package aUP;

import GJW.ci;
import GJW.r;
import android.media.MediaMuxer;
import ase.n;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class o {
    public static final j J2 = new j(null);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final int[] f13069O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f13070n;
    private final r nr;
    private final MediaMuxer rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final yB.j f13071t;

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    static final class n extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f13072O;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        int f13073Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f13074n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f13076r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f13077t;

        n(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f13076r = obj;
            this.f13073Z |= Integer.MIN_VALUE;
            return o.this.rl(0, null, this);
        }
    }

    public o(int i2, MediaMuxer mediaMuxer) {
        Intrinsics.checkNotNullParameter(mediaMuxer, "mediaMuxer");
        this.f13070n = i2;
        this.rl = mediaMuxer;
        this.f13071t = yB.CN3.rl(false, 1, null);
        LRC.n.t(i2, "tracksNumber");
        this.nr = ci.t(null, 1, null);
        int[] iArr = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            iArr[i3] = -1;
        }
        this.f13069O = iArr;
    }

    public final void n() {
        if (this.nr.isCompleted()) {
            this.rl.stop();
            return;
        }
        throw new IllegalStateException(("Cannot stop the muxer when some of the track haven't produced the output format: " + this.f13069O + '.').toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0127 A[Catch: all -> 0x0130, TRY_LEAVE, TryCatch #0 {all -> 0x0130, blocks: (B:49:0x0110, B:51:0x0127), top: B:69:0x0110 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0132 A[EDGE_INSN: B:73:0x0132->B:57:0x0132 BREAK  A[LOOP:0: B:50:0x0125->B:53:0x012b], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object rl(int i2, ase.n nVar, Continuation continuation) {
        n nVar2;
        o oVar;
        ase.n nVar3;
        yB.j jVar;
        yB.j jVar2;
        ase.n nVar4;
        o oVar2;
        int i3;
        ase.n nVar5;
        o oVar3;
        int length;
        int i5;
        if (continuation instanceof n) {
            nVar2 = (n) continuation;
            int i7 = nVar2.f13073Z;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                nVar2.f13073Z = i7 - Integer.MIN_VALUE;
            } else {
                nVar2 = new n(continuation);
            }
        }
        Object obj = nVar2.f13076r;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i8 = nVar2.f13073Z;
        boolean z2 = true;
        try {
            if (i8 == 0) {
                ResultKt.throwOnFailure(obj);
                yB.j jVar3 = this.f13071t;
                nVar2.f13074n = this;
                nVar2.f13077t = nVar;
                nVar2.f13072O = jVar3;
                nVar2.J2 = i2;
                nVar2.f13073Z = 1;
                if (jVar3.Z(null, nVar2) != coroutine_suspended) {
                    oVar = this;
                    nVar3 = nVar;
                    jVar = jVar3;
                }
                return coroutine_suspended;
            }
            if (i8 != 1) {
                if (i8 == 2) {
                    i3 = nVar2.J2;
                    nVar5 = (ase.n) nVar2.f13077t;
                    oVar3 = (o) nVar2.f13074n;
                    ResultKt.throwOnFailure(obj);
                    n.j jVar4 = (n.j) nVar5;
                    oVar3.rl.writeSampleData(i3, jVar4.n(), jVar4.rl());
                    return Unit.INSTANCE;
                }
                if (i8 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i2 = nVar2.J2;
                jVar2 = (yB.j) nVar2.f13072O;
                nVar4 = (ase.n) nVar2.f13077t;
                oVar2 = (o) nVar2.f13074n;
                ResultKt.throwOnFailure(obj);
                try {
                    oVar2.f13069O[i2] = oVar2.rl.addTrack(((n.C0569n) nVar4).n());
                    int[] iArr = oVar2.f13069O;
                    length = iArr.length;
                    i5 = 0;
                    while (true) {
                        if (i5 < length) {
                            break;
                        }
                        if (iArr[i5] == -1) {
                            z2 = false;
                            break;
                        }
                        i5++;
                    }
                    if (z2) {
                        oVar2.rl.start();
                        oVar2.nr.eF(Unit.INSTANCE);
                    }
                    return Unit.INSTANCE;
                } finally {
                }
            }
            i2 = nVar2.J2;
            jVar = (yB.j) nVar2.f13072O;
            nVar3 = (ase.n) nVar2.f13077t;
            oVar = (o) nVar2.f13074n;
            ResultKt.throwOnFailure(obj);
            int i9 = oVar.f13069O[i2];
            jVar2.T(null);
            if (!(nVar3 instanceof n.j)) {
                if (nVar3 instanceof n.C0569n) {
                    if (i9 != -1) {
                        throw new IllegalStateException(("The audio track " + i9 + " produced a new output format: " + nVar3).toString());
                    }
                    jVar2 = oVar.f13071t;
                    nVar2.f13074n = oVar;
                    nVar2.f13077t = nVar3;
                    nVar2.f13072O = jVar2;
                    nVar2.J2 = i2;
                    nVar2.f13073Z = 3;
                    if (jVar2.Z(null, nVar2) != coroutine_suspended) {
                        nVar4 = nVar3;
                        oVar2 = oVar;
                        oVar2.f13069O[i2] = oVar2.rl.addTrack(((n.C0569n) nVar4).n());
                        int[] iArr2 = oVar2.f13069O;
                        length = iArr2.length;
                        i5 = 0;
                        while (true) {
                            if (i5 < length) {
                            }
                            i5++;
                        }
                        if (z2) {
                        }
                    }
                }
                return Unit.INSTANCE;
            }
            n.j jVar5 = (n.j) nVar3;
            if (oVe.j.n(jVar5.rl()) || oVe.j.rl(jVar5.rl()) || jVar5.rl().size == 0) {
                return Unit.INSTANCE;
            }
            if (i9 == -1) {
                throw new IllegalStateException(("Output data produced before the format change: " + nVar3).toString());
            }
            r rVar = oVar.nr;
            nVar2.f13074n = oVar;
            nVar2.f13077t = nVar3;
            nVar2.f13072O = null;
            nVar2.J2 = i9;
            nVar2.f13073Z = 2;
            if (rVar.await(nVar2) != coroutine_suspended) {
                i3 = i9;
                nVar5 = nVar3;
                oVar3 = oVar;
                n.j jVar42 = (n.j) nVar5;
                oVar3.rl.writeSampleData(i3, jVar42.n(), jVar42.rl());
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        } finally {
        }
    }
}
