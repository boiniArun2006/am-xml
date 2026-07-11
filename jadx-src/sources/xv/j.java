package xv;

import GJW.AbstractC1363t;
import GJW.Dsr;
import GJW.OU;
import GJW.vd;
import LQ.fuX;
import LQ.j;
import android.content.Context;
import android.net.Uri;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.DummyTrackOutput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.source.SampleQueue;
import com.google.android.exoplayer2.upstream.DefaultAllocator;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import uPp.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class j implements PjV.j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final PjV.n f75495n;
    private final Function0 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final CoroutineContext f75496t;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: xv.j$j, reason: collision with other inner class name */
    public static final class C1277j extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final C1277j f75497n = new C1277j();

        C1277j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final SampleQueue invoke() {
            SampleQueue sampleQueueCreateWithoutDrm = SampleQueue.createWithoutDrm(new DefaultAllocator(true, 65536));
            Intrinsics.checkNotNullExpressionValue(sampleQueueCreateWithoutDrm, "createWithoutDrm(Default…ULT_BUFFER_SEGMENT_SIZE))");
            return sampleQueueCreateWithoutDrm;
        }
    }

    private static final class n implements ExtractorOutput {
        private SeekMap J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final DummyTrackOutput f75498O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f75499n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final TrackOutput f75500t;

        @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
        public void endTracks() {
        }

        public n(int i2, TrackOutput trackOutput) {
            Intrinsics.checkNotNullParameter(trackOutput, "trackOutput");
            this.f75499n = i2;
            this.f75500t = trackOutput;
            this.f75498O = new DummyTrackOutput();
        }

        public final SeekMap n() {
            return this.J2;
        }

        @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
        public void seekMap(SeekMap seekMap) {
            Intrinsics.checkNotNullParameter(seekMap, "seekMap");
            this.J2 = seekMap;
        }

        @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
        public TrackOutput track(int i2, int i3) {
            return i2 == this.f75499n ? this.f75500t : this.f75498O;
        }
    }

    static final class w6 extends SuspendLambda implements Function2 {
        final /* synthetic */ int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f75502n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ Uri f75503o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Context f75504r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f75505t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((w6) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w6(int i2, Context context, Uri uri, Continuation continuation) {
            super(2, continuation);
            this.J2 = i2;
            this.f75504r = context;
            this.f75503o = uri;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return j.this.new w6(this.J2, this.f75504r, this.f75503o, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws fuX.j {
            CSs.n nVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f75505t;
            if (i2 != 0) {
                if (i2 == 1) {
                    nVar = (CSs.n) this.f75502n;
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                SampleQueue sampleQueue = (SampleQueue) j.this.rl.invoke();
                n nVar2 = new n(this.J2, sampleQueue);
                CSs.n nVarN = j.this.f75495n.n(this.f75504r, this.f75503o, nVar2);
                j jVar = j.this;
                int i3 = this.J2;
                this.f75502n = nVarN;
                this.f75505t = 1;
                obj = jVar.O(nVarN, sampleQueue, i3, nVar2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                nVar = nVarN;
            }
            LQ.j jVar2 = (LQ.j) obj;
            if (jVar2 instanceof j.n) {
                nVar.release();
                return jVar2;
            }
            boolean z2 = jVar2 instanceof j.w6;
            return jVar2;
        }
    }

    public j(PjV.n extractorAdapterFactory, Function0 sampleQueueFactory, CoroutineContext ioContext) {
        Intrinsics.checkNotNullParameter(extractorAdapterFactory, "extractorAdapterFactory");
        Intrinsics.checkNotNullParameter(sampleQueueFactory, "sampleQueueFactory");
        Intrinsics.checkNotNullParameter(ioContext, "ioContext");
        this.f75495n = extractorAdapterFactory;
        this.rl = sampleQueueFactory;
        this.f75496t = ioContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object O(CSs.n nVar, SampleQueue sampleQueue, int i2, n nVar2, Continuation continuation) throws fuX.j {
        LQ.j nVar3;
        LQ.j nVar4;
        SeekMap seekMapN;
        Format upstreamFormat;
        fuX fux = new fuX();
        try {
            fuX fux2 = new fuX();
            try {
                AbstractC1363t.qie(continuation.get$context());
                while (true) {
                    upstreamFormat = sampleQueue.getUpstreamFormat();
                    if (upstreamFormat != null || !((Boolean) fux2.O(nVar.read())).booleanValue()) {
                        break;
                    }
                    AbstractC1363t.qie(continuation.get$context());
                }
                if (upstreamFormat == null) {
                    AbstractC1363t.qie(continuation.get$context());
                    upstreamFormat = sampleQueue.getUpstreamFormat();
                }
                nVar3 = new j.w6(upstreamFormat);
            } catch (fuX.j e2) {
                if (e2.rl() != fux2) {
                    throw e2;
                }
                nVar3 = new j.n(e2.n());
            }
            Format format = (Format) fux.O(nVar3);
            if (format == null) {
                fux.n(new n.j("Format not found for the track id: " + i2));
                throw new KotlinNothingValueException();
            }
            fuX fux3 = new fuX();
            try {
                AbstractC1363t.qie(continuation.get$context());
                while (true) {
                    seekMapN = nVar2.n();
                    if (seekMapN != null || !((Boolean) fux3.O(nVar.read())).booleanValue()) {
                        break;
                    }
                    AbstractC1363t.qie(continuation.get$context());
                }
                if (seekMapN == null) {
                    AbstractC1363t.qie(continuation.get$context());
                    seekMapN = nVar2.n();
                }
                nVar4 = new j.w6(seekMapN);
            } catch (fuX.j e3) {
                if (e3.rl() != fux3) {
                    throw e3;
                }
                nVar4 = new j.n(e3.n());
            }
            SeekMap seekMap = (SeekMap) fux.O(nVar4);
            if (seekMap != null) {
                return new j.w6(new CC.j(sampleQueue, nVar, seekMap, format));
            }
            fux.n(new n.j("Seek map not found in the given stream"));
            throw new KotlinNothingValueException();
        } catch (fuX.j e4) {
            if (e4.rl() == fux) {
                return new j.n(e4.n());
            }
            throw e4;
        }
    }

    @Override // PjV.j
    public Object n(Context context, Uri uri, int i2, Continuation continuation) {
        return Dsr.Uo(this.f75496t, new w6(i2, context, uri, null), continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ j(PjV.n nVar, Function0 function0, CoroutineContext coroutineContext, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? new xv.n(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0) : nVar, (i2 & 2) != 0 ? C1277j.f75497n : function0, (i2 & 4) != 0 ? OU.rl() : coroutineContext);
    }
}
