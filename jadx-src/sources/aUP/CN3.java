package aUP;

import GJW.Lu;
import GJW.OU;
import GJW.vd;
import ILs.Q;
import LQ.fuX;
import LQ.j;
import aUP.Ml;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.view.Surface;
import ase.n;
import com.fyber.inneractive.sdk.player.exoplayer2.util.LU.LHbnkhI;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ExceptionsKt;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class CN3 {

    /* JADX INFO: renamed from: aUP.CN3$CN3, reason: collision with other inner class name */
    static final class C0471CN3 extends SuspendLambda implements Function2 {
        final /* synthetic */ LQ.w6 J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private /* synthetic */ Object f12904O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        final /* synthetic */ fOK.Wre f12905S;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ aUP.Ml f12906Z;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Surface f12907g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f12908n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ MediaCodec f12909o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ LQ.CN3 f12910r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f12911t;

        /* JADX INFO: renamed from: aUP.CN3$CN3$j */
        static final class j extends SuspendLambda implements Function2 {
            final /* synthetic */ MediaCodec J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ Surface f12912O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f12913n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ fOK.Wre f12914t;

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(vd vdVar, Continuation continuation) {
                return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(fOK.Wre wre, Surface surface, MediaCodec mediaCodec, Continuation continuation) {
                super(2, continuation);
                this.f12914t = wre;
                this.f12912O = surface;
                this.J2 = mediaCodec;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new j(this.f12914t, this.f12912O, this.J2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f12913n;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    fOK.Wre wre = this.f12914t;
                    Surface surface = this.f12912O;
                    this.f12913n = 1;
                    if (wre.n(surface, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                this.J2.signalEndOfInputStream();
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((C0471CN3) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0471CN3(LQ.w6 w6Var, LQ.CN3 cn3, MediaCodec mediaCodec, aUP.Ml ml, fOK.Wre wre, Surface surface, Continuation continuation) {
            super(2, continuation);
            this.J2 = w6Var;
            this.f12910r = cn3;
            this.f12909o = mediaCodec;
            this.f12906Z = ml;
            this.f12905S = wre;
            this.f12907g = surface;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C0471CN3 c0471cn3 = new C0471CN3(this.J2, this.f12910r, this.f12909o, this.f12906Z, this.f12905S, this.f12907g, continuation);
            c0471cn3.f12904O = obj;
            return c0471cn3;
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x006c, code lost:
        
            if (TFv.fuX.S(r3, r13, r12) == r0) goto L16;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            LQ.CN3 cn3;
            TFv.CN3 cn32;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f12911t;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cn3 = (LQ.CN3) this.f12908n;
                cn32 = (TFv.CN3) this.f12904O;
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                GJW.C.nr((vd) this.f12904O, OU.n(), null, new j(this.f12905S, this.f12907g, this.f12909o, null), 2, null);
                LQ.w6 w6Var = this.J2;
                cn3 = this.f12910r;
                MediaCodec mediaCodec = this.f12909o;
                aUP.Ml ml = this.f12906Z;
                this.f12904O = w6Var;
                this.f12908n = cn3;
                this.f12911t = 1;
                Object objO = CN3.O(mediaCodec, ml, this);
                if (objO != coroutine_suspended) {
                    cn32 = w6Var;
                    obj = objO;
                }
                return coroutine_suspended;
            }
            TFv.Wre wreJ2 = cn3.J2((LQ.n) obj);
            this.f12904O = null;
            this.f12908n = null;
            this.f12911t = 2;
        }
    }

    static final class I28 implements TFv.CN3 {
        final /* synthetic */ LQ.CN3 J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ MediaCodec f12915O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Ref.IntRef f12916n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ aUP.Ml f12917r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ as.CN3 f12918t;

        static final class j extends ContinuationImpl {
            Object J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            Object f12919O;

            /* JADX INFO: renamed from: S, reason: collision with root package name */
            int f12920S;

            /* JADX INFO: renamed from: Z, reason: collision with root package name */
            long f12921Z;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f12922e;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            /* synthetic */ Object f12923g;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f12924n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            Object f12925o;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            Object f12926r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            Object f12927t;

            j(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f12923g = obj;
                this.f12922e |= Integer.MIN_VALUE;
                return I28.this.rl(null, this);
            }
        }

        I28(Ref.IntRef intRef, as.CN3 cn3, MediaCodec mediaCodec, LQ.CN3 cn32, aUP.Ml ml) {
            this.f12916n = intRef;
            this.f12918t = cn3;
            this.f12915O = mediaCodec;
            this.J2 = cn32;
            this.f12917r = ml;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00be  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0096 -> B:26:0x009a). Please report as a decompilation issue!!! */
        @Override // TFv.CN3
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object rl(ByteBuffer byteBuffer, Continuation continuation) {
            j jVar;
            I28 i28;
            if (continuation instanceof j) {
                jVar = (j) continuation;
                int i2 = jVar.f12922e;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    jVar.f12922e = i2 - Integer.MIN_VALUE;
                } else {
                    jVar = new j(continuation);
                }
            }
            Object obj = jVar.f12923g;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = jVar.f12922e;
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                i28 = this;
                if (byteBuffer.hasRemaining()) {
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = jVar.f12920S;
                long jHI = jVar.f12921Z;
                ByteBuffer byteBuffer2 = (ByteBuffer) jVar.f12925o;
                MediaCodec mediaCodec = (MediaCodec) jVar.f12926r;
                Ref.IntRef intRef = (Ref.IntRef) jVar.J2;
                LQ.CN3 cn3 = (LQ.CN3) jVar.f12919O;
                ByteBuffer byteBuffer3 = (ByteBuffer) jVar.f12927t;
                i28 = (I28) jVar.f12924n;
                try {
                    ResultKt.throwOnFailure(obj);
                    intRef.element = w9.w6.qie(i5, ILm.j.n(mediaCodec, byteBuffer2, ((Ml.w6) obj).n(), jHI));
                    byteBuffer = byteBuffer3;
                    if (byteBuffer.hasRemaining()) {
                        jHI = d2n.Ml.HI(d2n.Ml.f63370t.J2(), as.Dsr.f43087n.n(i28.f12916n.element, i28.f12918t));
                        intRef = i28.f12916n;
                        int i7 = intRef.element;
                        mediaCodec = i28.f12915O;
                        cn3 = i28.J2;
                        Q qN = i28.f12917r.n();
                        jVar.f12924n = i28;
                        jVar.f12927t = byteBuffer;
                        jVar.f12919O = cn3;
                        jVar.J2 = intRef;
                        jVar.f12926r = mediaCodec;
                        jVar.f12925o = byteBuffer;
                        jVar.f12921Z = jHI;
                        jVar.f12920S = i7;
                        jVar.f12922e = 1;
                        Object objKN = qN.KN(jVar);
                        if (objKN == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        byteBuffer3 = byteBuffer;
                        i5 = i7;
                        obj = objKN;
                        byteBuffer2 = byteBuffer3;
                        intRef.element = w9.w6.qie(i5, ILm.j.n(mediaCodec, byteBuffer2, ((Ml.w6) obj).n(), jHI));
                        byteBuffer = byteBuffer3;
                        if (byteBuffer.hasRemaining()) {
                            return Unit.INSTANCE;
                        }
                    }
                } catch (MediaCodec.CodecException e2) {
                    cn3.n(new aUP.I28(ExceptionsKt.stackTraceToString(e2)));
                    throw new KotlinNothingValueException();
                }
            }
        }
    }

    static final class Ml extends ContinuationImpl {
        /* synthetic */ Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f12928O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f12929n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f12930r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f12931t;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.J2 = obj;
            this.f12930r |= Integer.MIN_VALUE;
            return CN3.J2(null, null, null, null, this);
        }

        Ml(Continuation continuation) {
            super(continuation);
        }
    }

    public static final class Wre implements LQ.n {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ fOK.Wre f12932O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ List f12933n;
        final /* synthetic */ MediaFormat nr;
        final /* synthetic */ Function2 rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Handler f12934t;

        public static final class j extends ContinuationImpl {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            int f12935O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f12936n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            /* synthetic */ Object f12937t;

            public j(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f12937t = obj;
                this.f12935O |= Integer.MIN_VALUE;
                return Wre.this.n(null, this);
            }
        }

        public static final class n extends SuspendLambda implements Function2 {
            Object E2;
            final /* synthetic */ List J2;

            /* JADX INFO: renamed from: N, reason: collision with root package name */
            Object f12938N;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ LQ.CN3 f12939O;

            /* JADX INFO: renamed from: S, reason: collision with root package name */
            final /* synthetic */ fOK.Wre f12940S;

            /* JADX INFO: renamed from: T, reason: collision with root package name */
            Object f12941T;

            /* JADX INFO: renamed from: X, reason: collision with root package name */
            Object f12942X;
            Object Xw;

            /* JADX INFO: renamed from: Z, reason: collision with root package name */
            final /* synthetic */ MediaFormat f12943Z;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f12944e;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f12945g;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f12946n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ Handler f12947o;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ Function2 f12948r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private /* synthetic */ Object f12949t;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            Object f12950v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public n(LQ.CN3 cn3, Continuation continuation, List list, Function2 function2, Handler handler, MediaFormat mediaFormat, fOK.Wre wre) {
                super(2, continuation);
                this.f12939O = cn3;
                this.J2 = list;
                this.f12948r = function2;
                this.f12947o = handler;
                this.f12943Z = mediaFormat;
                this.f12940S = wre;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                n nVar = new n(this.f12939O, continuation, this.J2, this.f12948r, this.f12947o, this.f12943Z, this.f12940S);
                nVar.f12949t = obj;
                return nVar;
            }

            /* JADX WARN: Can't wrap try/catch for region: R(13:114|43|108|44|132|46|124|47|48|91|(1:93)(1:94)|95|(3:97|100|(2:102|103)(2:104|105))(5:98|19|(5:21|134|22|(24:25|118|26|27|128|28|29|112|30|126|31|32|116|33|34|136|35|36|130|37|38|120|39|(15:42|114|43|108|44|45|132|46|124|47|48|91|(0)(0)|95|(0)(0)))|41)|100|(0)(0))) */
            /* JADX WARN: Code restructure failed: missing block: B:49:0x016b, code lost:
            
                r0 = e;
             */
            /* JADX WARN: Code restructure failed: missing block: B:50:0x016c, code lost:
            
                r17 = true;
                r7 = r8;
                r8 = r9;
                r9 = r10;
                r10 = r11;
                r11 = r12;
                r12 = r13;
             */
            /* JADX WARN: Removed duplicated region for block: B:102:0x0234  */
            /* JADX WARN: Removed duplicated region for block: B:104:0x0237  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x00a7  */
            /* JADX WARN: Removed duplicated region for block: B:42:0x0149  */
            /* JADX WARN: Removed duplicated region for block: B:90:0x01fd  */
            /* JADX WARN: Removed duplicated region for block: B:93:0x020f  */
            /* JADX WARN: Removed duplicated region for block: B:94:0x021b  */
            /* JADX WARN: Removed duplicated region for block: B:97:0x0221  */
            /* JADX WARN: Removed duplicated region for block: B:98:0x0225  */
            /* JADX WARN: Removed duplicated region for block: B:99:0x022f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0149 -> B:114:0x0152). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:90:0x01fd -> B:91:0x020b). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) throws Throwable {
                Ref.BooleanRef booleanRef;
                LQ.w6 w6Var;
                List arrayList;
                Iterator it;
                boolean z2;
                char c2;
                Ref.BooleanRef booleanRef2;
                LQ.CN3 cn3;
                fuX.j e2;
                LQ.w6 w6Var2;
                Ref.BooleanRef booleanRef3;
                List list;
                Iterator it2;
                Ref.BooleanRef booleanRef4;
                MediaCodec mediaCodec;
                Throwable th;
                Throwable th2;
                LQ.CN3 cn32;
                List list2;
                Iterator it3;
                LQ.CN3 cn33;
                LQ.w6 w6Var3;
                Ref.BooleanRef booleanRef5;
                LQ.CN3 fux;
                Object objInvoke;
                MediaCodec mediaCodec2;
                List list3;
                Ref.BooleanRef booleanRef6;
                Iterator it4;
                List list4;
                MediaCodec mediaCodec3;
                Surface surfaceCreateInputSurface;
                Iterator it5;
                List list5;
                MediaCodec mediaCodec4;
                Ref.BooleanRef booleanRef7;
                Ref.BooleanRef booleanRef8;
                C0471CN3 c0471cn3;
                Ref.BooleanRef booleanRef9;
                Ref.BooleanRef booleanRef10;
                List list6;
                Ref.BooleanRef booleanRef11;
                Object nVar;
                boolean z3;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f12946n;
                MediaCrypto mediaCrypto = null;
                char c4 = 2;
                boolean z4 = true;
                z4 = true;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    LQ.Ml ml = new LQ.Ml(this.f12939O, (TFv.CN3) this.f12949t);
                    booleanRef = new Ref.BooleanRef();
                    w6Var = ml;
                    arrayList = new ArrayList();
                    it = this.J2.iterator();
                    if (it.hasNext()) {
                    }
                    if (booleanRef.element) {
                    }
                } else {
                    if (i2 == 1) {
                        LQ.CN3 cn34 = (LQ.CN3) this.f12950v;
                        LQ.CN3 cn35 = (LQ.CN3) this.f12938N;
                        cn3 = (LQ.fuX) this.f12941T;
                        booleanRef2 = (Ref.BooleanRef) this.f12942X;
                        it = (Iterator) this.f12944e;
                        arrayList = (List) this.E2;
                        booleanRef = (Ref.BooleanRef) this.f12945g;
                        w6Var = (LQ.w6) this.f12949t;
                        try {
                            ResultKt.throwOnFailure(obj);
                            cn32 = cn3;
                            booleanRef5 = booleanRef2;
                            w6Var3 = w6Var;
                            booleanRef3 = booleanRef;
                            list2 = arrayList;
                            it3 = it;
                            cn33 = cn35;
                            fux = cn34;
                            objInvoke = obj;
                        } catch (fuX.j e3) {
                            e2 = e3;
                            c2 = 2;
                            z2 = true;
                            if (e2.rl() != cn3) {
                                throw e2;
                            }
                            w6Var2 = w6Var;
                            booleanRef3 = booleanRef;
                            list = arrayList;
                            it2 = it;
                            booleanRef4 = booleanRef2;
                            nVar = new j.n(e2.n());
                            if (nVar instanceof j.n) {
                            }
                            if (!booleanRef4.element) {
                            }
                        }
                        mediaCodec2 = (MediaCodec) fux.O((LQ.j) objInvoke);
                        list3 = list2;
                        aUP.Ml ml2 = new aUP.Ml();
                        mediaCodec2.setCallback(ml2, this.f12947o);
                        cn33.O(qO.n.n(mediaCodec2, this.f12943Z, mediaCrypto));
                        surfaceCreateInputSurface = mediaCodec2.createInputSurface();
                        Intrinsics.checkNotNullExpressionValue(surfaceCreateInputSurface, "codec.createInputSurface()");
                        cn33.O(qO.n.Uo(mediaCodec2));
                        booleanRef5.element = false;
                        booleanRef8 = booleanRef5;
                        booleanRef9 = booleanRef3;
                        it5 = it3;
                        booleanRef11 = booleanRef8;
                        list6 = list3;
                        mediaCodec4 = mediaCodec2;
                        booleanRef10 = booleanRef9;
                        c0471cn3 = new C0471CN3(w6Var3, cn33, mediaCodec4, ml2, this.f12940S, surfaceCreateInputSurface, null);
                        this.f12949t = w6Var3;
                        this.f12945g = booleanRef10;
                        this.E2 = list6;
                        this.f12944e = it5;
                        this.f12942X = booleanRef11;
                        this.f12941T = cn32;
                        this.f12938N = mediaCodec4;
                        this.f12950v = mediaCodec4;
                        this.Xw = surfaceCreateInputSurface;
                        c2 = 2;
                        this.f12946n = 2;
                        if (Lu.J2(c0471cn3, this) != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    }
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Surface surface = (Surface) this.Xw;
                    MediaCodec mediaCodec5 = (MediaCodec) this.f12950v;
                    MediaCodec mediaCodec6 = (MediaCodec) this.f12938N;
                    LQ.CN3 cn36 = (LQ.fuX) this.f12941T;
                    booleanRef4 = (Ref.BooleanRef) this.f12942X;
                    it2 = (Iterator) this.f12944e;
                    list = (List) this.E2;
                    booleanRef3 = (Ref.BooleanRef) this.f12945g;
                    w6Var2 = (LQ.w6) this.f12949t;
                    try {
                        ResultKt.throwOnFailure(obj);
                        c2 = 2;
                        try {
                            try {
                                try {
                                    surface.release();
                                    mediaCodec5.stop();
                                    booleanRef3.element = true;
                                    mediaCodec6.release();
                                    z2 = true;
                                    nVar = new j.w6(Unit.INSTANCE);
                                    if (nVar instanceof j.n) {
                                        list.add((aUP.I28) ((j.n) nVar).n());
                                    } else {
                                        boolean z5 = nVar instanceof j.w6;
                                    }
                                    if (!booleanRef4.element) {
                                        arrayList = list;
                                        booleanRef = booleanRef3;
                                        w6Var = w6Var2;
                                        if (booleanRef.element) {
                                            return Unit.INSTANCE;
                                        }
                                        w6Var.n(new aUP.I28(CN3.Uo(arrayList)));
                                        throw new KotlinNothingValueException();
                                    }
                                    it = it2;
                                    arrayList = list;
                                    booleanRef = booleanRef3;
                                    w6Var = w6Var2;
                                    c4 = c2;
                                    z4 = z2;
                                    mediaCrypto = null;
                                    if (it.hasNext()) {
                                        String str = (String) it.next();
                                        booleanRef2 = new Ref.BooleanRef();
                                        booleanRef2.element = z4;
                                        fux = new LQ.fuX();
                                        try {
                                        } catch (fuX.j e4) {
                                            e2 = e4;
                                            c2 = c4;
                                            z2 = z4 ? 1 : 0;
                                            cn3 = fux;
                                            if (e2.rl() != cn3) {
                                            }
                                        }
                                        Function2 function2 = this.f12948r;
                                        this.f12949t = w6Var;
                                        this.f12945g = booleanRef;
                                        this.E2 = arrayList;
                                        this.f12944e = it;
                                        this.f12942X = booleanRef2;
                                        this.f12941T = fux;
                                        this.f12938N = fux;
                                        this.f12950v = fux;
                                        this.Xw = mediaCrypto;
                                        this.f12946n = z4 ? 1 : 0;
                                        InlineMarker.mark(6);
                                        objInvoke = function2.invoke(str, this);
                                        InlineMarker.mark(7);
                                        if (objInvoke != coroutine_suspended) {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        cn32 = fux;
                                                                        booleanRef5 = booleanRef2;
                                                                        w6Var3 = w6Var;
                                                                        booleanRef3 = booleanRef;
                                                                        list2 = arrayList;
                                                                        it3 = it;
                                                                        cn33 = cn32;
                                                                        try {
                                                                        } catch (fuX.j e5) {
                                                                            e2 = e5;
                                                                            c2 = c4;
                                                                            z2 = z4;
                                                                            Ref.BooleanRef booleanRef12 = booleanRef5;
                                                                            Iterator it6 = it3;
                                                                            arrayList = list2;
                                                                            it = it6;
                                                                            booleanRef = booleanRef3;
                                                                            w6Var = w6Var3;
                                                                            cn3 = cn32;
                                                                            booleanRef2 = booleanRef12;
                                                                            if (e2.rl() != cn3) {
                                                                            }
                                                                        }
                                                                        mediaCodec2 = (MediaCodec) fux.O((LQ.j) objInvoke);
                                                                        aUP.Ml ml22 = new aUP.Ml();
                                                                        mediaCodec2.setCallback(ml22, this.f12947o);
                                                                        cn33.O(qO.n.n(mediaCodec2, this.f12943Z, mediaCrypto));
                                                                        cn33.O(qO.n.Uo(mediaCodec2));
                                                                        booleanRef5.element = false;
                                                                        c0471cn3 = new C0471CN3(w6Var3, cn33, mediaCodec4, ml22, this.f12940S, surfaceCreateInputSurface, null);
                                                                        this.f12949t = w6Var3;
                                                                        this.f12945g = booleanRef10;
                                                                        this.E2 = list6;
                                                                        this.f12944e = it5;
                                                                        this.f12942X = booleanRef11;
                                                                        this.f12941T = cn32;
                                                                        this.f12938N = mediaCodec4;
                                                                        this.f12950v = mediaCodec4;
                                                                        this.Xw = surfaceCreateInputSurface;
                                                                        this.f12946n = 2;
                                                                        if (Lu.J2(c0471cn3, this) != coroutine_suspended) {
                                                                            list = list6;
                                                                            booleanRef4 = booleanRef11;
                                                                            booleanRef3 = booleanRef10;
                                                                            mediaCodec5 = mediaCodec4;
                                                                            mediaCodec6 = mediaCodec5;
                                                                            surface = surfaceCreateInputSurface;
                                                                            it2 = it5;
                                                                            w6Var2 = w6Var3;
                                                                            cn36 = cn32;
                                                                            Unit unit = Unit.INSTANCE;
                                                                            surface.release();
                                                                            mediaCodec5.stop();
                                                                            z3 = true;
                                                                            booleanRef3.element = true;
                                                                            mediaCodec6.release();
                                                                            z2 = true;
                                                                            nVar = new j.w6(Unit.INSTANCE);
                                                                            if (nVar instanceof j.n) {
                                                                            }
                                                                            if (!booleanRef4.element) {
                                                                            }
                                                                        }
                                                                    } catch (Throwable th3) {
                                                                        th = th3;
                                                                        z2 = z4;
                                                                        it4 = it3;
                                                                        list4 = list3;
                                                                        c2 = c4;
                                                                        mediaCodec3 = mediaCodec2;
                                                                        booleanRef6 = booleanRef5;
                                                                        it = it4;
                                                                        booleanRef = booleanRef3;
                                                                        w6Var = w6Var3;
                                                                        mediaCodec = mediaCodec3;
                                                                        cn3 = cn32;
                                                                        arrayList = list4;
                                                                        booleanRef2 = booleanRef6;
                                                                        try {
                                                                            mediaCodec.release();
                                                                            throw th;
                                                                        } catch (fuX.j e6) {
                                                                            e2 = e6;
                                                                            if (e2.rl() != cn3) {
                                                                            }
                                                                        }
                                                                    }
                                                                } catch (Throwable th4) {
                                                                    th2 = th4;
                                                                    z2 = z4;
                                                                    it5 = it3;
                                                                    list5 = list3;
                                                                    c2 = c4;
                                                                    mediaCodec4 = mediaCodec2;
                                                                    booleanRef7 = booleanRef8;
                                                                    list = list5;
                                                                    booleanRef4 = booleanRef7;
                                                                    mediaCodec6 = mediaCodec4;
                                                                    surface = surfaceCreateInputSurface;
                                                                    it2 = it5;
                                                                    w6Var2 = w6Var3;
                                                                    cn36 = cn32;
                                                                    try {
                                                                        surface.release();
                                                                        throw th2;
                                                                    } catch (Throwable th5) {
                                                                        th = th5;
                                                                        mediaCodec = mediaCodec6;
                                                                        cn3 = cn36;
                                                                        booleanRef2 = booleanRef4;
                                                                        it = it2;
                                                                        arrayList = list;
                                                                        booleanRef = booleanRef3;
                                                                        w6Var = w6Var2;
                                                                        mediaCodec.release();
                                                                        throw th;
                                                                    }
                                                                }
                                                                booleanRef8 = booleanRef5;
                                                            } catch (Throwable th6) {
                                                                th2 = th6;
                                                                z2 = true;
                                                                list = list6;
                                                                booleanRef4 = booleanRef11;
                                                                booleanRef3 = booleanRef10;
                                                                mediaCodec6 = mediaCodec4;
                                                                surface = surfaceCreateInputSurface;
                                                                it2 = it5;
                                                                w6Var2 = w6Var3;
                                                                cn36 = cn32;
                                                                surface.release();
                                                                throw th2;
                                                            }
                                                            c2 = 2;
                                                        } catch (Throwable th7) {
                                                            th2 = th7;
                                                            z2 = z4;
                                                            it5 = it3;
                                                            list5 = list3;
                                                            c2 = c4;
                                                            mediaCodec4 = mediaCodec2;
                                                            booleanRef7 = booleanRef5;
                                                        }
                                                        surfaceCreateInputSurface = mediaCodec2.createInputSurface();
                                                        Intrinsics.checkNotNullExpressionValue(surfaceCreateInputSurface, "codec.createInputSurface()");
                                                    } catch (Throwable th8) {
                                                        th = th8;
                                                        c2 = c4;
                                                        z2 = z4;
                                                        booleanRef6 = booleanRef5;
                                                        it4 = it3;
                                                        list4 = list3;
                                                        mediaCodec3 = mediaCodec2;
                                                    }
                                                    list3 = list2;
                                                } catch (Throwable th9) {
                                                    th2 = th9;
                                                    c2 = 2;
                                                }
                                                it5 = it3;
                                                booleanRef11 = booleanRef8;
                                                list6 = list3;
                                                mediaCodec4 = mediaCodec2;
                                                booleanRef10 = booleanRef9;
                                            } catch (Throwable th10) {
                                                th2 = th10;
                                                z2 = z4;
                                                it5 = it3;
                                                mediaCodec4 = mediaCodec2;
                                                booleanRef10 = booleanRef9;
                                                list6 = list3;
                                                c2 = c4;
                                                booleanRef11 = booleanRef8;
                                            }
                                            booleanRef9 = booleanRef3;
                                        }
                                        return coroutine_suspended;
                                    }
                                    if (booleanRef.element) {
                                    }
                                } catch (Throwable th11) {
                                    th = th11;
                                    z3 = true;
                                }
                                Unit unit2 = Unit.INSTANCE;
                            } catch (Throwable th12) {
                                th2 = th12;
                                z2 = true;
                                surface.release();
                                throw th2;
                            }
                        } catch (Throwable th13) {
                            th = th13;
                            z2 = z3;
                            mediaCodec = mediaCodec6;
                            cn3 = cn36;
                            booleanRef2 = booleanRef4;
                            it = it2;
                            arrayList = list;
                            booleanRef = booleanRef3;
                            w6Var = w6Var2;
                            mediaCodec.release();
                            throw th;
                        }
                        z3 = true;
                    } catch (Throwable th14) {
                        th2 = th14;
                        c2 = 2;
                        z2 = true;
                        surface.release();
                        throw th2;
                    }
                }
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(TFv.CN3 cn3, Continuation continuation) {
                return ((n) create(cn3, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public Wre(List list, Function2 function2, Handler handler, MediaFormat mediaFormat, fOK.Wre wre) {
            this.f12933n = list;
            this.rl = function2;
            this.f12934t = handler;
            this.nr = mediaFormat;
            this.f12932O = wre;
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x007b  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // LQ.n
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object n(TFv.CN3 cn3, Continuation continuation) throws fuX.j {
            j jVar;
            fuX.j jVar2;
            LQ.fuX fux;
            if (continuation instanceof j) {
                jVar = (j) continuation;
                int i2 = jVar.f12935O;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    jVar.f12935O = i2 - Integer.MIN_VALUE;
                } else {
                    jVar = new j(continuation);
                }
            }
            Object obj = jVar.f12937t;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = jVar.f12935O;
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                LQ.fuX fux2 = new LQ.fuX();
                try {
                    TFv.Wre wreIF = TFv.fuX.iF(new n(fux2, null, this.f12933n, this.rl, this.f12934t, this.nr, this.f12932O));
                    jVar.f12936n = fux2;
                    jVar.f12935O = 1;
                    if (wreIF.n(cn3, jVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    fux = fux2;
                } catch (fuX.j e2) {
                    jVar2 = e2;
                    fux = fux2;
                    if (jVar2.rl() != fux) {
                        return new j.n(jVar2.n());
                    }
                    throw jVar2;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fux = (LQ.fuX) jVar.f12936n;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (fuX.j e3) {
                    jVar2 = e3;
                    if (jVar2.rl() != fux) {
                    }
                }
            }
            return new j.w6(Unit.INSTANCE);
        }
    }

    public static final class j implements LQ.n {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ TFv.Wre f12951O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function2 f12952n;
        final /* synthetic */ MediaFormat nr;
        final /* synthetic */ String rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Handler f12953t;

        /* JADX INFO: renamed from: aUP.CN3$j$j, reason: collision with other inner class name */
        public static final class C0472j extends ContinuationImpl {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            int f12954O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f12955n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            /* synthetic */ Object f12956t;

            public C0472j(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f12956t = obj;
                this.f12954O |= Integer.MIN_VALUE;
                return j.this.n(null, this);
            }
        }

        public static final class n extends SuspendLambda implements Function2 {
            final /* synthetic */ Function2 J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ LQ.CN3 f12957O;

            /* JADX INFO: renamed from: S, reason: collision with root package name */
            final /* synthetic */ TFv.Wre f12958S;

            /* JADX INFO: renamed from: Z, reason: collision with root package name */
            final /* synthetic */ MediaFormat f12959Z;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f12960g;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f12961n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ Handler f12962o;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ String f12963r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private /* synthetic */ Object f12964t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public n(LQ.CN3 cn3, Continuation continuation, Function2 function2, String str, Handler handler, MediaFormat mediaFormat, TFv.Wre wre) {
                super(2, continuation);
                this.f12957O = cn3;
                this.J2 = function2;
                this.f12963r = str;
                this.f12962o = handler;
                this.f12959Z = mediaFormat;
                this.f12958S = wre;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                n nVar = new n(this.f12957O, continuation, this.J2, this.f12963r, this.f12962o, this.f12959Z, this.f12958S);
                nVar.f12964t = obj;
                return nVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                LQ.w6 ml;
                LQ.w6 w6Var;
                MediaCodec mediaCodec;
                Throwable th;
                MediaCodec mediaCodec2;
                MediaCodec mediaCodec3;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f12961n;
                try {
                    if (i2 != 0) {
                        if (i2 != 1) {
                            if (i2 == 2) {
                                mediaCodec3 = (MediaCodec) this.f12960g;
                                mediaCodec2 = (MediaCodec) this.f12964t;
                                try {
                                    ResultKt.throwOnFailure(obj);
                                    mediaCodec3.stop();
                                    Unit unit = Unit.INSTANCE;
                                    mediaCodec2.release();
                                    return Unit.INSTANCE;
                                } catch (Throwable th2) {
                                    th = th2;
                                    mediaCodec2.release();
                                    throw th;
                                }
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ml = (LQ.w6) this.f12960g;
                        LQ.w6 w6Var2 = (LQ.w6) this.f12964t;
                        ResultKt.throwOnFailure(obj);
                        w6Var = w6Var2;
                    } else {
                        ResultKt.throwOnFailure(obj);
                        ml = new LQ.Ml(this.f12957O, (TFv.CN3) this.f12964t);
                        Function2 function2 = this.J2;
                        String str = this.f12963r;
                        this.f12964t = ml;
                        this.f12960g = ml;
                        this.f12961n = 1;
                        InlineMarker.mark(6);
                        obj = function2.invoke(str, this);
                        InlineMarker.mark(7);
                        if (obj != coroutine_suspended) {
                            w6Var = ml;
                        }
                        return coroutine_suspended;
                    }
                    aUP.Ml ml2 = new aUP.Ml();
                    mediaCodec.setCallback(ml2, this.f12962o);
                    w6Var.O(qO.n.n(mediaCodec, this.f12959Z, null));
                    mediaCodec.start();
                    n nVar = new n(w6Var, mediaCodec, ml2, this.f12959Z, this.f12958S, null);
                    this.f12964t = mediaCodec;
                    this.f12960g = mediaCodec;
                    this.f12961n = 2;
                    if (Lu.J2(nVar, this) != coroutine_suspended) {
                        mediaCodec3 = mediaCodec;
                        mediaCodec2 = mediaCodec3;
                        mediaCodec3.stop();
                        Unit unit2 = Unit.INSTANCE;
                        mediaCodec2.release();
                        return Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                } catch (Throwable th3) {
                    th = th3;
                    mediaCodec2 = mediaCodec;
                    mediaCodec2.release();
                    throw th;
                }
                mediaCodec = (MediaCodec) ml.O((LQ.j) obj);
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(TFv.CN3 cn3, Continuation continuation) {
                return ((n) create(cn3, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public j(Function2 function2, String str, Handler handler, MediaFormat mediaFormat, TFv.Wre wre) {
            this.f12952n = function2;
            this.rl = str;
            this.f12953t = handler;
            this.nr = mediaFormat;
            this.f12951O = wre;
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x007b  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // LQ.n
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object n(TFv.CN3 cn3, Continuation continuation) throws fuX.j {
            C0472j c0472j;
            fuX.j jVar;
            LQ.fuX fux;
            if (continuation instanceof C0472j) {
                c0472j = (C0472j) continuation;
                int i2 = c0472j.f12954O;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c0472j.f12954O = i2 - Integer.MIN_VALUE;
                } else {
                    c0472j = new C0472j(continuation);
                }
            }
            Object obj = c0472j.f12956t;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = c0472j.f12954O;
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                LQ.fuX fux2 = new LQ.fuX();
                try {
                    TFv.Wre wreIF = TFv.fuX.iF(new n(fux2, null, this.f12952n, this.rl, this.f12953t, this.nr, this.f12951O));
                    c0472j.f12955n = fux2;
                    c0472j.f12954O = 1;
                    if (wreIF.n(cn3, c0472j) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    fux = fux2;
                } catch (fuX.j e2) {
                    jVar = e2;
                    fux = fux2;
                    if (jVar.rl() != fux) {
                        return new j.n(jVar.n());
                    }
                    throw jVar;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fux = (LQ.fuX) c0472j.f12955n;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (fuX.j e3) {
                    jVar = e3;
                    if (jVar.rl() != fux) {
                    }
                }
            }
            return new j.w6(Unit.INSTANCE);
        }
    }

    static final class n extends SuspendLambda implements Function2 {
        final /* synthetic */ LQ.w6 J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private /* synthetic */ Object f12965O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        final /* synthetic */ TFv.Wre f12966S;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ MediaFormat f12967Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f12968n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ aUP.Ml f12969o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ MediaCodec f12970r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f12971t;

        static final class j extends SuspendLambda implements Function2 {
            final /* synthetic */ MediaCodec J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ LQ.w6 f12972O;

            /* JADX INFO: renamed from: Z, reason: collision with root package name */
            final /* synthetic */ TFv.Wre f12973Z;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f12974n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ aUP.Ml f12975o;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ MediaFormat f12976r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            int f12977t;

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(vd vdVar, Continuation continuation) {
                return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(LQ.w6 w6Var, MediaCodec mediaCodec, MediaFormat mediaFormat, aUP.Ml ml, TFv.Wre wre, Continuation continuation) {
                super(2, continuation);
                this.f12972O = w6Var;
                this.J2 = mediaCodec;
                this.f12976r = mediaFormat;
                this.f12975o = ml;
                this.f12973Z = wre;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new j(this.f12972O, this.J2, this.f12976r, this.f12975o, this.f12973Z, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws fuX.j {
                LQ.w6 w6Var;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f12977t;
                if (i2 != 0) {
                    if (i2 == 1) {
                        w6Var = (LQ.w6) this.f12974n;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    LQ.w6 w6Var2 = this.f12972O;
                    MediaCodec mediaCodec = this.J2;
                    MediaFormat mediaFormat = this.f12976r;
                    aUP.Ml ml = this.f12975o;
                    TFv.Wre wreRl = TFv.o.rl(this.f12973Z, 0, null, 2, null);
                    this.f12974n = w6Var2;
                    this.f12977t = 1;
                    Object objJ2 = CN3.J2(mediaCodec, mediaFormat, ml, wreRl, this);
                    if (objJ2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    w6Var = w6Var2;
                    obj = objJ2;
                }
                w6Var.O((LQ.j) obj);
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((n) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(LQ.w6 w6Var, MediaCodec mediaCodec, aUP.Ml ml, MediaFormat mediaFormat, TFv.Wre wre, Continuation continuation) {
            super(2, continuation);
            this.J2 = w6Var;
            this.f12970r = mediaCodec;
            this.f12969o = ml;
            this.f12967Z = mediaFormat;
            this.f12966S = wre;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            n nVar = new n(this.J2, this.f12970r, this.f12969o, this.f12967Z, this.f12966S, continuation);
            nVar.f12965O = obj;
            return nVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
        
            if (TFv.fuX.S(r3, r14, r13) == r0) goto L16;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            LQ.w6 w6Var;
            TFv.CN3 cn3;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f12971t;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                w6Var = (LQ.w6) this.f12968n;
                cn3 = (TFv.CN3) this.f12965O;
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                GJW.C.nr((vd) this.f12965O, OU.n(), null, new j(this.J2, this.f12970r, this.f12967Z, this.f12969o, this.f12966S, null), 2, null);
                w6Var = this.J2;
                MediaCodec mediaCodec = this.f12970r;
                aUP.Ml ml = this.f12969o;
                this.f12965O = w6Var;
                this.f12968n = w6Var;
                this.f12971t = 1;
                obj = CN3.O(mediaCodec, ml, this);
                if (obj != coroutine_suspended) {
                    cn3 = w6Var;
                }
                return coroutine_suspended;
            }
            TFv.Wre wreJ2 = w6Var.J2((LQ.n) obj);
            this.f12965O = null;
            this.f12968n = null;
            this.f12971t = 2;
        }
    }

    public static final class w6 implements LQ.n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ aUP.Ml f12978n;
        final /* synthetic */ MediaCodec rl;

        public static final class j extends ContinuationImpl {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            int f12979O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f12980n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            /* synthetic */ Object f12981t;

            public j(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f12981t = obj;
                this.f12979O |= Integer.MIN_VALUE;
                return w6.this.n(null, this);
            }
        }

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
        public static final class n extends SuspendLambda implements Function2 {
            final /* synthetic */ aUP.Ml J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ LQ.CN3 f12982O;

            /* JADX INFO: renamed from: S, reason: collision with root package name */
            Object f12983S;

            /* JADX INFO: renamed from: Z, reason: collision with root package name */
            Object f12984Z;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f12985n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            Object f12986o;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ MediaCodec f12987r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private /* synthetic */ Object f12988t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public n(LQ.CN3 cn3, Continuation continuation, aUP.Ml ml, MediaCodec mediaCodec) {
                super(2, continuation);
                this.f12982O = cn3;
                this.J2 = ml;
                this.f12987r = mediaCodec;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                n nVar = new n(this.f12982O, continuation, this.J2, this.f12987r);
                nVar.f12988t = obj;
                return nVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:26:0x0082  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x008f A[Catch: CodecException -> 0x0028, TryCatch #0 {CodecException -> 0x0028, blocks: (B:8:0x0021, B:42:0x00e6, B:27:0x0087, B:29:0x008f, B:31:0x0099, B:34:0x00b3, B:36:0x00b7, B:38:0x00c6, B:44:0x00f6, B:45:0x0116, B:15:0x0041, B:18:0x0053, B:21:0x0065), top: B:53:0x0009 }] */
            /* JADX WARN: Removed duplicated region for block: B:47:0x0119  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00e3 -> B:42:0x00e6). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0117 -> B:43:0x00f2). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                LQ.CN3 cn3;
                LQ.w6 ml;
                ILs.Dsr it;
                LQ.CN3 cn32;
                LQ.w6 w6Var;
                ILs.Dsr dsr;
                Object objRl;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f12985n;
                try {
                } catch (MediaCodec.CodecException e2) {
                    e = e2;
                }
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 == 3) {
                                Ml.InterfaceC0473Ml interfaceC0473Ml = (Ml.InterfaceC0473Ml) this.f12983S;
                                ILs.Dsr dsr2 = (ILs.Dsr) this.f12984Z;
                                cn3 = (LQ.CN3) this.f12986o;
                                LQ.w6 w6Var2 = (LQ.w6) this.f12988t;
                                ResultKt.throwOnFailure(obj);
                                it = dsr2;
                                w6Var = w6Var2;
                                try {
                                    this.f12987r.releaseOutputBuffer(((Ml.j) interfaceC0473Ml).n(), false);
                                    this.f12988t = ml;
                                    this.f12986o = cn32;
                                    this.f12984Z = it;
                                    this.f12983S = null;
                                    this.f12985n = 1;
                                    objRl = it.rl(this);
                                } catch (MediaCodec.CodecException e3) {
                                    e = e3;
                                    cn3 = cn32;
                                }
                                cn32 = cn3;
                                ml = w6Var;
                                if (objRl != coroutine_suspended) {
                                    LQ.CN3 cn33 = cn32;
                                    dsr = it;
                                    obj = objRl;
                                    w6Var = ml;
                                    cn3 = cn33;
                                    if (!((Boolean) obj).booleanValue()) {
                                        Ml.InterfaceC0473Ml interfaceC0473Ml2 = (Ml.InterfaceC0473Ml) dsr.next();
                                        if (interfaceC0473Ml2 instanceof Ml.n) {
                                            n.C0569n c0569n = new n.C0569n(((Ml.n) interfaceC0473Ml2).n());
                                            this.f12988t = w6Var;
                                            this.f12986o = cn3;
                                            this.f12984Z = dsr;
                                            this.f12985n = 2;
                                            if (w6Var.rl(c0569n, this) == coroutine_suspended) {
                                            }
                                            it = dsr;
                                        } else {
                                            if (interfaceC0473Ml2 instanceof Ml.j) {
                                                ByteBuffer outputBuffer = this.f12987r.getOutputBuffer(((Ml.j) interfaceC0473Ml2).n());
                                                if (outputBuffer != null) {
                                                    n.j jVar = new n.j(outputBuffer, ((Ml.j) interfaceC0473Ml2).rl());
                                                    this.f12988t = w6Var;
                                                    this.f12986o = cn3;
                                                    this.f12984Z = dsr;
                                                    this.f12983S = interfaceC0473Ml2;
                                                    this.f12985n = 3;
                                                    if (w6Var.rl(jVar, this) != coroutine_suspended) {
                                                        ILs.Dsr dsr3 = dsr;
                                                        interfaceC0473Ml = interfaceC0473Ml2;
                                                        it = dsr3;
                                                        this.f12987r.releaseOutputBuffer(((Ml.j) interfaceC0473Ml).n(), false);
                                                    }
                                                } else {
                                                    throw new IllegalStateException(("Unexpected null codec output buffer for index: " + ((Ml.j) interfaceC0473Ml2).n()).toString());
                                                }
                                            }
                                            it = dsr;
                                        }
                                        cn32 = cn3;
                                        ml = w6Var;
                                        this.f12988t = ml;
                                        this.f12986o = cn32;
                                        this.f12984Z = it;
                                        this.f12983S = null;
                                        this.f12985n = 1;
                                        objRl = it.rl(this);
                                        if (objRl != coroutine_suspended) {
                                        }
                                    } else {
                                        return Unit.INSTANCE;
                                    }
                                    cn3.n(new aUP.I28(ExceptionsKt.stackTraceToString(e)));
                                    throw new KotlinNothingValueException();
                                }
                                return coroutine_suspended;
                            }
                            throw new IllegalStateException(LHbnkhI.Qjsoohyu);
                        }
                        dsr = (ILs.Dsr) this.f12984Z;
                        cn3 = (LQ.CN3) this.f12986o;
                        w6Var = (LQ.w6) this.f12988t;
                        ResultKt.throwOnFailure(obj);
                        it = dsr;
                        cn32 = cn3;
                        ml = w6Var;
                        this.f12988t = ml;
                        this.f12986o = cn32;
                        this.f12984Z = it;
                        this.f12983S = null;
                        this.f12985n = 1;
                        objRl = it.rl(this);
                        if (objRl != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    }
                    dsr = (ILs.Dsr) this.f12984Z;
                    cn3 = (LQ.CN3) this.f12986o;
                    w6Var = (LQ.w6) this.f12988t;
                    ResultKt.throwOnFailure(obj);
                    if (!((Boolean) obj).booleanValue()) {
                    }
                    cn3.n(new aUP.I28(ExceptionsKt.stackTraceToString(e)));
                    throw new KotlinNothingValueException();
                }
                ResultKt.throwOnFailure(obj);
                ml = new LQ.Ml(this.f12982O, (TFv.CN3) this.f12988t);
                it = this.J2.rl().iterator();
                cn32 = ml;
                this.f12988t = ml;
                this.f12986o = cn32;
                this.f12984Z = it;
                this.f12983S = null;
                this.f12985n = 1;
                objRl = it.rl(this);
                if (objRl != coroutine_suspended) {
                }
                return coroutine_suspended;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(TFv.CN3 cn3, Continuation continuation) {
                return ((n) create(cn3, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public w6(aUP.Ml ml, MediaCodec mediaCodec) {
            this.f12978n = ml;
            this.rl = mediaCodec;
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x006b  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0075  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // LQ.n
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object n(TFv.CN3 cn3, Continuation continuation) throws fuX.j {
            j jVar;
            fuX.j e2;
            LQ.fuX fux;
            if (continuation instanceof j) {
                jVar = (j) continuation;
                int i2 = jVar.f12979O;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    jVar.f12979O = i2 - Integer.MIN_VALUE;
                } else {
                    jVar = new j(continuation);
                }
            }
            Object obj = jVar.f12981t;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = jVar.f12979O;
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                LQ.fuX fux2 = new LQ.fuX();
                try {
                    TFv.Wre wreIF = TFv.fuX.iF(new n(fux2, null, this.f12978n, this.rl));
                    jVar.f12980n = fux2;
                    jVar.f12979O = 1;
                    if (wreIF.n(cn3, jVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    fux = fux2;
                } catch (fuX.j e3) {
                    e2 = e3;
                    fux = fux2;
                    if (e2.rl() != fux) {
                        return new j.n(e2.n());
                    }
                    throw e2;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fux = (LQ.fuX) jVar.f12980n;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (fuX.j e4) {
                    e2 = e4;
                    if (e2.rl() != fux) {
                    }
                }
            }
            return new j.w6(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0095, code lost:
    
        if (r15 == r1) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r12v0, types: [android.media.MediaFormat] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r14v0, types: [TFv.Wre] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object J2(MediaCodec mediaCodec, MediaFormat mediaFormat, aUP.Ml ml, TFv.Wre wre, Continuation continuation) throws fuX.j {
        Ml ml2;
        fuX.j jVar;
        ?? r12;
        MediaCodec mediaCodec2;
        LQ.fuX fux;
        aUP.Ml ml3;
        if (continuation instanceof Ml) {
            ml2 = (Ml) continuation;
            int i2 = ml2.f12930r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ml2.f12930r = i2 - Integer.MIN_VALUE;
            } else {
                ml2 = new Ml(continuation);
            }
        }
        Object objKN = ml2.J2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = ml2.f12930r;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(objKN);
                LQ.fuX fux2 = new LQ.fuX();
                try {
                    as.CN3 cn3N = qO.w6.n(mediaFormat);
                    Ref.IntRef intRef = new Ref.IntRef();
                    intRef.element = w9.w6.f74806t.n();
                    I28 i28 = new I28(intRef, cn3N, mediaCodec, fux2, ml);
                    ml2.f12929n = mediaCodec;
                    ml2.f12931t = ml;
                    ml2.f12928O = fux2;
                    ml2.f12930r = 1;
                    if (wre.n(i28, ml2) != coroutine_suspended) {
                        mediaCodec2 = mediaCodec;
                        fux = fux2;
                        ml3 = ml;
                    }
                    return coroutine_suspended;
                } catch (fuX.j e2) {
                    jVar = e2;
                    r12 = fux2;
                    if (jVar.rl() == r12) {
                        return new j.n(jVar.n());
                    }
                    throw jVar;
                }
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mediaCodec2 = (MediaCodec) ml2.f12931t;
                LQ.fuX fux3 = (LQ.fuX) ml2.f12929n;
                ResultKt.throwOnFailure(objKN);
                mediaFormat = fux3;
                ILm.j.rl(mediaCodec2, ((Ml.w6) objKN).n());
                return new j.w6(Unit.INSTANCE);
            }
            LQ.fuX fux4 = (LQ.fuX) ml2.f12928O;
            ml3 = (aUP.Ml) ml2.f12931t;
            mediaCodec2 = (MediaCodec) ml2.f12929n;
            ResultKt.throwOnFailure(objKN);
            fux = fux4;
            Q qN = ml3.n();
            ml2.f12929n = fux;
            ml2.f12931t = mediaCodec2;
            ml2.f12928O = null;
            ml2.f12930r = 2;
            objKN = qN.KN(ml2);
            mediaFormat = fux;
        } catch (fuX.j e3) {
            jVar = e3;
            r12 = mediaFormat;
        }
    }

    public static final LQ.n KN(fOK.Wre wre, List codecNames, MediaFormat format, Handler callbackHandler, Function2 codecProvider) {
        Intrinsics.checkNotNullParameter(wre, "<this>");
        Intrinsics.checkNotNullParameter(codecNames, "codecNames");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(callbackHandler, "callbackHandler");
        Intrinsics.checkNotNullParameter(codecProvider, "codecProvider");
        return new Wre(codecNames, codecProvider, callbackHandler, format, wre);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object O(MediaCodec mediaCodec, aUP.Ml ml, Continuation continuation) {
        return new w6(ml, mediaCodec);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String Uo(List list) {
        StringBuilder sb = new StringBuilder();
        sb.append("Codec failures encountered: ");
        Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
        sb.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            sb.append("\tFailure #");
            sb.append(i3);
            sb.append(": ");
            Intrinsics.checkNotNullExpressionValue(sb, "builder.append(\"\\tFailur…d(index + 1).append(\": \")");
            sb.append((aUP.I28) obj);
            Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
            sb.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
            i2 = i3;
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "builder.toString()");
        return string;
    }

    public static final LQ.n nr(TFv.Wre wre, String codecName, MediaFormat format, Handler callbackHandler, Function2 codecProvider) {
        Intrinsics.checkNotNullParameter(wre, "<this>");
        Intrinsics.checkNotNullParameter(codecName, "codecName");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(callbackHandler, "callbackHandler");
        Intrinsics.checkNotNullParameter(codecProvider, "codecProvider");
        return new j(codecProvider, codecName, callbackHandler, format, wre);
    }
}
