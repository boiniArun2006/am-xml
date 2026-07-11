package VH;

import GJW.OU;
import GJW.vd;
import LQ.CN3;
import LQ.fuX;
import LQ.j;
import android.content.Context;
import android.net.Uri;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.DummyTrackOutput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import uPp.Dsr;
import uPp.I28;
import uPp.aC;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class n implements aC {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final PjV.n f10845n;
    private final CoroutineContext rl;

    static final class Ml extends SuspendLambda implements Function2 {
        final /* synthetic */ Uri J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Context f10846O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f10847n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ CN3 f10848r;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((Ml) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Ml(Context context, Uri uri, CN3 cn3, Continuation continuation) {
            super(2, continuation);
            this.f10846O = context;
            this.J2 = uri;
            this.f10848r = cn3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return n.this.new Ml(this.f10846O, this.J2, this.f10848r, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            LQ.j nVar;
            Dsr dsrN;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f10847n == 0) {
                ResultKt.throwOnFailure(obj);
                j jVar = new j();
                CSs.n nVarN = n.this.f10845n.n(this.f10846O, this.J2, jVar);
                CN3 cn3 = this.f10848r;
                Uri uri = this.J2;
                try {
                    fuX fux = new fuX();
                    do {
                        try {
                            dsrN = jVar.n();
                            if (dsrN != null) {
                                break;
                            }
                        } catch (fuX.j e2) {
                            if (e2.rl() == fux) {
                                nVar = new j.n(e2.n());
                            } else {
                                throw e2;
                            }
                        }
                    } while (((Boolean) fux.O(nVarN.read())).booleanValue());
                    if (dsrN == null) {
                        dsrN = jVar.n();
                    }
                    nVar = new j.w6(dsrN);
                    Dsr dsr = (Dsr) cn3.O(nVar);
                    if (dsr != null) {
                        w9.Dsr.n(nVarN, null);
                        return dsr;
                    }
                    cn3.n(new I28.w6(new NoSuchElementException("Stream info not found in the stream: " + uri)));
                    throw new KotlinNothingValueException();
                } finally {
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    private static final class j implements ExtractorOutput {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private SeekMap f10850O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f10851n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Map f10852t = new LinkedHashMap();

        @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
        public void endTracks() {
            this.f10851n = true;
        }

        @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
        public TrackOutput track(int i2, int i3) {
            if (i3 != 1 && i3 != 2) {
                return new DummyTrackOutput();
            }
            Map map = this.f10852t;
            Integer numValueOf = Integer.valueOf(i2);
            Object c0385n = map.get(numValueOf);
            if (c0385n == null) {
                c0385n = new C0385n();
                map.put(numValueOf, c0385n);
            }
            return (TrackOutput) c0385n;
        }

        public final Dsr n() {
            SeekMap seekMap;
            if (!this.f10851n || (seekMap = this.f10850O) == null) {
                return null;
            }
            Collection collectionValues = this.f10852t.values();
            if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                Iterator it = collectionValues.iterator();
                while (it.hasNext()) {
                    if (((C0385n) it.next()).n() == null) {
                        return null;
                    }
                }
            }
            d2n.j jVarRl = seekMap.getDurationUs() == -9223372036854775807L ? null : d2n.j.rl(d2n.j.f63374t.rl(seekMap.getDurationUs()));
            Map map = this.f10852t;
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : map.entrySet()) {
                Format formatN = ((C0385n) entry.getValue()).n();
                if (formatN == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                uPp.CN3 cn3O = uPp.fuX.O(formatN, ((Number) entry.getKey()).intValue());
                if (cn3O != null) {
                    arrayList.add(cn3O);
                }
            }
            return new Dsr(jVarRl, CollectionsKt.toSet(arrayList), null);
        }

        @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
        public void seekMap(SeekMap seekMap) {
            Intrinsics.checkNotNullParameter(seekMap, "seekMap");
            this.f10850O = seekMap;
        }
    }

    /* JADX INFO: renamed from: VH.n$n, reason: collision with other inner class name */
    private static final class C0385n implements TrackOutput {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final /* synthetic */ DummyTrackOutput f10853n = new DummyTrackOutput();
        private Format rl;

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public int sampleData(DataReader p0, int i2, boolean z2, int i3) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return this.f10853n.sampleData(p0, i2, z2, i3);
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public void format(Format format) {
            Intrinsics.checkNotNullParameter(format, "format");
            this.rl = format;
        }

        public final Format n() {
            return this.rl;
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public void sampleData(ParsableByteArray p0, int i2, int i3) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            this.f10853n.sampleData(p0, i2, i3);
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public void sampleMetadata(long j2, int i2, int i3, int i5, TrackOutput.CryptoData cryptoData) {
            this.f10853n.sampleMetadata(j2, i2, i3, i5, cryptoData);
        }
    }

    static final class w6 extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f10855n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f10856t;

        w6(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f10856t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return n.this.n(null, null, this);
        }
    }

    public n(PjV.n extractorAdapterFactory, CoroutineContext ioContext) {
        Intrinsics.checkNotNullParameter(extractorAdapterFactory, "extractorAdapterFactory");
        Intrinsics.checkNotNullParameter(ioContext, "ioContext");
        this.f10845n = extractorAdapterFactory;
        this.rl = ioContext;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // uPp.aC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(Context context, Uri uri, Continuation continuation) throws fuX.j {
        w6 w6Var;
        fuX.j jVar;
        fuX fux;
        if (continuation instanceof w6) {
            w6Var = (w6) continuation;
            int i2 = w6Var.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w6Var.J2 = i2 - Integer.MIN_VALUE;
            } else {
                w6Var = new w6(continuation);
            }
        }
        Object objUo = w6Var.f10856t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = w6Var.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objUo);
            fuX fux2 = new fuX();
            try {
                CoroutineContext coroutineContext = this.rl;
                Ml ml = new Ml(context, uri, fux2, null);
                w6Var.f10855n = fux2;
                w6Var.J2 = 1;
                objUo = GJW.Dsr.Uo(coroutineContext, ml, w6Var);
                if (objUo == coroutine_suspended) {
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
            fux = (fuX) w6Var.f10855n;
            try {
                ResultKt.throwOnFailure(objUo);
            } catch (fuX.j e3) {
                jVar = e3;
                if (jVar.rl() != fux) {
                }
            }
        }
        return new j.w6((Dsr) objUo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ n(PjV.n nVar, CoroutineContext coroutineContext, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? new xv.n(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0) : nVar, (i2 & 2) != 0 ? OU.rl() : coroutineContext);
    }
}
