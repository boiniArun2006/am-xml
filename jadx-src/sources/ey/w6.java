package ey;

import GJW.AbstractC1363t;
import GJW.OU;
import GJW.lej;
import GJW.vd;
import GJW.yg;
import LQ.fuX;
import LQ.j;
import android.content.Context;
import android.media.MediaCodec;
import as.Ml;
import as.aC;
import as.o;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.RendererConfiguration;
import com.google.android.exoplayer2.analytics.PlayerId;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.audio.AudioSink;
import com.google.android.exoplayer2.audio.AuxEffectInfo;
import com.google.android.exoplayer2.audio.MediaCodecAudioRenderer;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.mediacodec.DefaultMediaCodecAdapterFactory;
import com.google.android.exoplayer2.mediacodec.MediaCodecAdapter;
import com.google.android.exoplayer2.mediacodec.MediaCodecSelector;
import com.google.android.exoplayer2.source.SampleStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import uPp.j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class w6 implements F3.j {
    private final Ml J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final I28 f63935O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final lej f63936n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private ey.I28 f63937r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f63938t;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C0860w6 f63934o = new C0860w6(null);

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private static final List f63933Z = CollectionsKt.listOf((Object[]) new Integer[]{3, 2, 536870912, Integer.valueOf(C.ENCODING_PCM_32BIT), 4});

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private static final long f63932S = d2n.j.f63374t.rl(2000);

    static final class CN3 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ ey.I28 f63939O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f63940n;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((CN3) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        CN3(ey.I28 i28, Continuation continuation) {
            super(2, continuation);
            this.f63939O = i28;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return w6.this.new CN3(this.f63939O, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0035 -> B:14:0x0038). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws ExoPlaybackException {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f63940n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                    w6.this.J2.render(0L, 0L);
                    if (this.f63939O.nr()) {
                        this.f63940n = 1;
                        if (yg.rl(3L, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        w6.this.J2.render(0L, 0L);
                        if (this.f63939O.nr()) {
                            return Unit.INSTANCE;
                        }
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                w6.this.J2.render(0L, 0L);
                if (this.f63939O.nr()) {
                }
            }
        }
    }

    public final class I28 implements AudioSink {
        private boolean J2;
        private int KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private ey.j f63942O;
        private ByteBuffer Uo;
        private long gh;
        private boolean mUb;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Function1 f63943n;
        private Q4.Ml nr;
        final /* synthetic */ w6 qie;
        private Q4.Ml rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private Q4.Ml f63944t;
        private d2n.Ml xMQ;

        @Override // com.google.android.exoplayer2.audio.AudioSink
        public void disableTunneling() {
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink
        public void flush() {
            this.J2 = false;
            this.gh = d2n.Ml.f63370t.J2();
            this.xMQ = null;
            this.KN = as.Ml.f43088n.n();
            this.Uo = null;
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink
        public void handleDiscontinuity() {
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink
        public boolean hasPendingData() {
            return true;
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink
        public void pause() {
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink
        public void play() {
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink
        public void setListener(AudioSink.Listener listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
        }

        public /* synthetic */ class j {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Q4.w6.values().length];
                try {
                    iArr[Q4.w6.PCM_8BIT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Q4.w6.PCM_16BIT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Q4.w6.PCM_24BIT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Q4.w6.PCM_32BIT.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[Q4.w6.PCM_FLOAT.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public I28(w6 w6Var, Function1 logger) {
            Intrinsics.checkNotNullParameter(logger, "logger");
            this.qie = w6Var;
            this.f63943n = logger;
            this.KN = as.Ml.f43088n.n();
            this.gh = d2n.Ml.f63370t.J2();
        }

        private final ByteBuffer KN(ByteBuffer byteBuffer) {
            Q4.Ml ml = this.rl;
            if (ml == null) {
                Intrinsics.throwUninitializedPropertyAccessException("inputFormat");
                ml = null;
            }
            int i2 = j.$EnumSwitchMapping$0[ey.n.t(ml).ordinal()];
            if (i2 == 1 || i2 == 2) {
                return byteBuffer;
            }
            if (i2 == 3) {
                return rr.j.f73132n.n(byteBuffer);
            }
            if (i2 == 4) {
                return rr.j.f73132n.rl(byteBuffer);
            }
            if (i2 == 5) {
                return rr.j.f73132n.nr(byteBuffer);
            }
            throw new NoWhenBranchMatchedException();
        }

        private final boolean O() {
            return this.rl != null;
        }

        private final long n(long j2) {
            Q4.Ml ml = this.rl;
            Q4.Ml ml2 = null;
            if (ml == null) {
                Intrinsics.throwUninitializedPropertyAccessException("inputFormat");
                ml = null;
            }
            int iT = as.Ml.t(ml.nr());
            Q4.Ml ml3 = this.rl;
            if (ml3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("inputFormat");
            } else {
                ml2 = ml3;
            }
            return d2n.Ml.ty(j2, aC.rl(iT, ml2.O()));
        }

        private final void rl(ey.I28 i28, ByteBuffer byteBuffer) {
            Q4.Ml ml = this.nr;
            Q4.Ml ml2 = null;
            if (ml == null) {
                Intrinsics.throwUninitializedPropertyAccessException("outputFormat");
                ml = null;
            }
            as.CN3 cn3O = ml.J2().O();
            if (cn3O != null) {
                ey.Ml.nr(i28, new as.n(byteBuffer, cn3O));
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid output format ");
            Q4.Ml ml3 = this.nr;
            if (ml3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("outputFormat");
            } else {
                ml2 = ml3;
            }
            sb.append(ml2);
            throw new IllegalStateException(sb.toString().toString());
        }

        private final ByteBuffer xMQ(ByteBuffer byteBuffer) {
            Q4.Ml ml = this.f63944t;
            if (ml == null) {
                Intrinsics.throwUninitializedPropertyAccessException("accumulatorFormat");
                ml = null;
            }
            int i2 = j.$EnumSwitchMapping$0[ey.n.t(ml).ordinal()];
            if (i2 == 1) {
                return rr.j.f73132n.t(byteBuffer);
            }
            if (i2 == 2) {
                return byteBuffer;
            }
            throw new IllegalStateException("Unexpected accumulator format");
        }

        public final long J2() {
            return this.gh;
        }

        public Void Uo() {
            throw new UnsupportedOperationException("Unexpected method call");
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink
        /* JADX INFO: renamed from: az, reason: merged with bridge method [inline-methods] */
        public Void setSkipSilenceEnabled(boolean z2) {
            throw new UnsupportedOperationException("Unexpected method call");
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink
        public void configure(Format inputFormat, int i2, int[] iArr) throws AudioSink.ConfigurationException {
            Q4.Ml mlRl;
            Intrinsics.checkNotNullParameter(inputFormat, "inputFormat");
            if (!Intrinsics.areEqual(inputFormat.sampleMimeType, "audio/raw") || !w6.f63934o.n().contains(Integer.valueOf(inputFormat.pcmEncoding))) {
                throw new AudioSink.ConfigurationException("Unhandled input audio format!", inputFormat);
            }
            Q4.Ml mlJ2 = ey.Ml.J2(inputFormat);
            Q4.Ml ml = null;
            if (O()) {
                Q4.Ml ml2 = this.rl;
                if (ml2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("inputFormat");
                    ml2 = null;
                }
                if (!Intrinsics.areEqual(ml2, mlJ2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Received a new input format which is different than the previous one.\nPrevious: ");
                    Q4.Ml ml3 = this.rl;
                    if (ml3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("inputFormat");
                    } else {
                        ml = ml3;
                    }
                    sb.append(ml);
                    sb.append("\nNew: ");
                    sb.append(inputFormat);
                    throw new IllegalStateException(sb.toString().toString());
                }
            }
            this.rl = mlJ2;
            this.nr = Q4.Ml.rl(mlJ2, 0, 0, Q4.n.n(new as.CN3(mlJ2.t(), mlJ2.O(), null)), 2, null);
            if (o.n(mlJ2.J2().n(), as.j.f43098n.rl()) < 0) {
                mlRl = Q4.Ml.rl(mlJ2, 0, 0, null, 6, null);
            } else {
                mlRl = this.nr;
                if (mlRl == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("outputFormat");
                    mlRl = null;
                }
            }
            this.f63944t = mlRl;
            Q4.Ml ml4 = this.f63944t;
            if (ml4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("accumulatorFormat");
            } else {
                ml = ml4;
            }
            this.f63942O = new ey.j(ml);
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink
        public AudioAttributes getAudioAttributes() {
            throw new UnsupportedOperationException("Unexpected method call");
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink
        public int getFormatSupport(Format format) {
            Intrinsics.checkNotNullParameter(format, "format");
            if (Intrinsics.areEqual(format.sampleMimeType, "audio/raw") && w6.f63934o.n().contains(Integer.valueOf(format.pcmEncoding))) {
                return format.pcmEncoding == 2 ? 2 : 1;
            }
            return 0;
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink
        public PlaybackParameters getPlaybackParameters() {
            PlaybackParameters DEFAULT = PlaybackParameters.DEFAULT;
            Intrinsics.checkNotNullExpressionValue(DEFAULT, "DEFAULT");
            return DEFAULT;
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink
        /* JADX INFO: renamed from: gh, reason: merged with bridge method [inline-methods] */
        public Void setAudioSessionId(int i2) {
            throw new UnsupportedOperationException("Unexpected method call");
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink
        public boolean handleBuffer(ByteBuffer buffer, long j2, int i2) {
            long jIk;
            Intrinsics.checkNotNullParameter(buffer, "buffer");
            long jN = n(d2n.Ml.f63370t.n(j2));
            d2n.Ml ml = this.xMQ;
            if (ml != null) {
                jIk = ml.Ik();
            } else {
                this.xMQ = d2n.Ml.rl(jN);
                jIk = jN;
            }
            int i3 = this.KN;
            Q4.Ml ml2 = this.f63944t;
            ey.j jVar = null;
            if (ml2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("accumulatorFormat");
                ml2 = null;
            }
            long jHI = d2n.Ml.HI(jIk, aC.rl(i3, ml2.O()));
            if (!this.mUb && this.Uo == null && Math.abs(d2n.j.az(d2n.Ml.az(jHI, jN))) > d2n.j.az(w6.f63932S)) {
                this.f63943n.invoke("Received inconsistent timestamp from audio decoder:\n  Expected PTS: " + ((Object) d2n.Ml.ck(jHI)) + "\n  Received PTS: " + ((Object) d2n.Ml.ck(jN)));
                this.mUb = true;
            }
            ey.I28 i28Ck = this.qie.ck();
            if (!i28Ck.nr()) {
                return false;
            }
            ey.j jVar2 = this.f63942O;
            if (jVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("accumulator");
                jVar2 = null;
            }
            HI(jVar2, i28Ck.rl());
            ByteBuffer byteBufferKN = this.Uo;
            if (byteBufferKN == null) {
                byteBufferKN = KN(buffer);
            }
            int iUo = v9.n.Uo(byteBufferKN);
            ey.j jVar3 = this.f63942O;
            if (jVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("accumulator");
                jVar3 = null;
            }
            boolean zN = jVar3.n(byteBufferKN, jHI);
            int iUo2 = v9.n.Uo(byteBufferKN);
            int i5 = this.KN;
            Ml.j jVar4 = as.Ml.f43088n;
            int iMUb = w9.Ml.mUb(iUo2, iUo);
            Q4.Ml ml3 = this.f63944t;
            if (ml3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("accumulatorFormat");
                ml3 = null;
            }
            int iT = ml3.t();
            Q4.Ml ml4 = this.f63944t;
            if (ml4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("accumulatorFormat");
                ml4 = null;
            }
            int iXMQ = as.Ml.xMQ(i5, as.I28.n(jVar4, iMUb, iT, Q4.I28.n(ey.n.t(ml4))));
            this.KN = iXMQ;
            if (!zN) {
                Q4.Ml ml5 = this.f63944t;
                if (ml5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("accumulatorFormat");
                    ml5 = null;
                }
                this.gh = d2n.Ml.HI(jIk, aC.rl(iXMQ, ml5.O()));
                this.Uo = null;
                return true;
            }
            ey.j jVar5 = this.f63942O;
            if (jVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("accumulator");
            } else {
                jVar = jVar5;
            }
            rl(i28Ck, xMQ(jVar.rl()));
            this.gh = i28Ck.rl().nr();
            this.Uo = byteBufferKN;
            return false;
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink
        public boolean isEnded() {
            return this.J2;
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink
        /* JADX INFO: renamed from: mUb, reason: merged with bridge method [inline-methods] */
        public Void setAudioAttributes(AudioAttributes audioAttributes) {
            Intrinsics.checkNotNullParameter(audioAttributes, "audioAttributes");
            throw new UnsupportedOperationException("Unexpected method call");
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink
        /* JADX INFO: renamed from: nr, reason: merged with bridge method [inline-methods] */
        public Void experimentalFlushWithoutAudioTrackRelease() {
            throw new UnsupportedOperationException("Unexpected method call");
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink
        public void playToEndOfStream() {
            ey.I28 i28Ck = this.qie.ck();
            if (i28Ck.nr()) {
                if (!O()) {
                    ey.Ml.O(i28Ck, new j.C1227j("Decoder failed to report its input and output format and skipped all the samples."));
                    return;
                }
                ey.j jVar = this.f63942O;
                ey.j jVar2 = null;
                if (jVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("accumulator");
                    jVar = null;
                }
                HI(jVar, i28Ck.rl());
                ey.j jVar3 = this.f63942O;
                if (jVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("accumulator");
                } else {
                    jVar2 = jVar3;
                }
                rl(i28Ck, jVar2.rl());
            }
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink
        /* JADX INFO: renamed from: qie, reason: merged with bridge method [inline-methods] */
        public Void setAuxEffectInfo(AuxEffectInfo auxEffectInfo) {
            Intrinsics.checkNotNullParameter(auxEffectInfo, "auxEffectInfo");
            throw new UnsupportedOperationException("Unexpected method call");
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink
        public void setPlaybackParameters(PlaybackParameters playbackParameters) {
            Intrinsics.checkNotNullParameter(playbackParameters, "playbackParameters");
            if (!Intrinsics.areEqual(playbackParameters, PlaybackParameters.DEFAULT)) {
                throw new IllegalArgumentException("AudioRenderer does not support playback parameters different than default.");
            }
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink
        public boolean supportsFormat(Format format) {
            Intrinsics.checkNotNullParameter(format, "format");
            return Intrinsics.areEqual("audio/raw", format.sampleMimeType) && w6.f63934o.n().contains(Integer.valueOf(format.pcmEncoding));
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public Void enableTunnelingV21() {
            throw new UnsupportedOperationException("Unexpected method call");
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink
        /* JADX INFO: renamed from: ty, reason: merged with bridge method [inline-methods] */
        public Void setVolume(float f3) {
            throw new UnsupportedOperationException("Unexpected method call");
        }

        private final void HI(ey.j jVar, d2n.Wre wre) {
            if (jVar.t() && Intrinsics.areEqual(wre, jVar.nr())) {
                return;
            }
            jVar.J2(wre);
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink
        public /* bridge */ /* synthetic */ boolean getSkipSilenceEnabled() {
            return ((Boolean) Uo()).booleanValue();
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink
        public void reset() {
            flush();
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink
        public long getCurrentPositionUs(boolean z2) {
            return -9223372036854775807L;
        }
    }

    public final class Ml extends MediaCodecAudioRenderer {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ w6 f63945n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ml(w6 w6Var, Context context, MediaCodecAdapter.Factory adapterFactory, MediaCodecSelector selector, I28 sink) {
            super(context, adapterFactory, selector, false, null, null, sink);
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(adapterFactory, "adapterFactory");
            Intrinsics.checkNotNullParameter(selector, "selector");
            Intrinsics.checkNotNullParameter(sink, "sink");
            this.f63945n = w6Var;
        }

        public final void n(Format format) throws ExoPlaybackException {
            Intrinsics.checkNotNullParameter(format, "format");
            if (shouldUseBypass(format)) {
                return;
            }
            FormatHolder formatHolder = new FormatHolder();
            formatHolder.format = format;
            DecoderReuseEvaluation decoderReuseEvaluationOnInputFormatChanged = onInputFormatChanged(formatHolder);
            if (decoderReuseEvaluationOnInputFormatChanged == null) {
                if (getCodec() == null) {
                    throw new IllegalStateException("Codec initialization failed, unexpected null codec");
                }
            } else {
                throw new IllegalStateException(("Codec initialization with format returned unexpected non-null result. Codec evaluation result: " + decoderReuseEvaluationOnInputFormatChanged).toString());
            }
        }
    }

    static final class Wre extends ContinuationImpl {
        Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f63946O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        int f63947S;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f63949n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f63950o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f63951r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f63952t;

        Wre(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f63950o = obj;
            this.f63947S |= Integer.MIN_VALUE;
            return w6.this.mUb(null, this);
        }
    }

    static final class j extends Lambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f63953n = new j();

        j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            n((String) obj);
            return Unit.INSTANCE;
        }

        public final void n(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            w9.CN3.rl(w6.f63934o, it, null, 2, null);
        }
    }

    private final class n implements SampleStream {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final SampleStream f63954n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ w6 f63955t;

        public n(w6 w6Var, SampleStream wrapped) {
            Intrinsics.checkNotNullParameter(wrapped, "wrapped");
            this.f63955t = w6Var;
            this.f63954n = wrapped;
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public boolean isReady() {
            return this.f63954n.isReady();
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public void maybeThrowError() throws IOException {
            this.f63954n.maybeThrowError();
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public int readData(FormatHolder formatHolder, DecoderInputBuffer buffer, int i2) {
            Intrinsics.checkNotNullParameter(formatHolder, "formatHolder");
            Intrinsics.checkNotNullParameter(buffer, "buffer");
            if (this.f63955t.ck().nr()) {
                return this.f63954n.readData(formatHolder, buffer, i2);
            }
            return -3;
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public int skipData(long j2) {
            return this.f63954n.skipData(j2);
        }
    }

    /* JADX INFO: renamed from: ey.w6$w6, reason: collision with other inner class name */
    public static final class C0860w6 {
        public /* synthetic */ C0860w6(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0860w6() {
        }

        public final List n() {
            return w6.f63933Z;
        }
    }

    public w6(Context context, MediaCodecSelector mediaCodecSelector, MediaCodecAdapter.Factory mediaCodecAdapterFactory, Function1 logger, lej decodingDispatcher) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mediaCodecSelector, "mediaCodecSelector");
        Intrinsics.checkNotNullParameter(mediaCodecAdapterFactory, "mediaCodecAdapterFactory");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(decodingDispatcher, "decodingDispatcher");
        this.f63936n = decodingDispatcher;
        I28 i28 = new I28(this, logger);
        this.f63935O = i28;
        this.J2 = new Ml(this, context, mediaCodecAdapterFactory, mediaCodecSelector, i28);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ey.I28 ck() {
        ey.I28 i28 = this.f63937r;
        if (i28 != null) {
            return i28;
        }
        throw new IllegalStateException("No current request available");
    }

    public boolean HI() {
        return this.J2.getState() == 2;
    }

    @Override // F3.j
    public LQ.j Uo(Format format, SampleStream sampleStream) {
        LQ.j nVar;
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(sampleStream, "sampleStream");
        if (HI()) {
            throw new IllegalStateException(("Cannot call init since isSetup is already " + HI()).toString());
        }
        if (this.f63938t) {
            throw new IllegalStateException("Cannot init after release");
        }
        try {
            this.J2.init(0, PlayerId.UNSET);
            this.J2.enable(RendererConfiguration.DEFAULT, new Format[]{format}, new n(this, sampleStream), 0L, false, false, 0L, 0L);
            this.J2.start();
            this.J2.setCurrentStreamFinal();
            this.J2.n(format);
            nVar = new j.w6(Unit.INSTANCE);
        } catch (ExoPlaybackException e2) {
            nVar = new j.n(VH.j.n(e2));
        }
        if (nVar instanceof j.n) {
            release();
        } else {
            boolean z2 = nVar instanceof j.w6;
        }
        return nVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x010d: MOVE (r8 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]) (LINE:270), block:B:60:0x010d */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d2 A[Catch: all -> 0x003e, TryCatch #9 {all -> 0x003e, blocks: (B:12:0x003a, B:38:0x0099, B:57:0x00fe, B:50:0x00ce, B:52:0x00d2, B:53:0x00dd, B:54:0x00de, B:55:0x00e9, B:56:0x00f4), top: B:77:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00dd A[Catch: all -> 0x003e, TryCatch #9 {all -> 0x003e, blocks: (B:12:0x003a, B:38:0x0099, B:57:0x00fe, B:50:0x00ce, B:52:0x00d2, B:53:0x00dd, B:54:0x00de, B:55:0x00e9, B:56:0x00f4), top: B:77:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4 */
    @Override // F3.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mUb(d2n.Wre wre, Continuation continuation) throws Throwable {
        Wre wre2;
        LQ.fuX fux;
        LQ.fuX fux2;
        w6 w6Var;
        IllegalStateException e2;
        LQ.CN3 cn3;
        IOException e3;
        ExoPlaybackException e4;
        MediaCodec.CodecException e5;
        LQ.CN3 cn32;
        ey.I28 i28;
        LQ.j nVar;
        if (continuation instanceof Wre) {
            wre2 = (Wre) continuation;
            int i2 = wre2.f63947S;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wre2.f63947S = i2 - Integer.MIN_VALUE;
            } else {
                wre2 = new Wre(continuation);
            }
        }
        Object obj = wre2.f63950o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        w6 w6Var2 = wre2.f63947S;
        try {
            try {
                if (w6Var2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (!HI()) {
                        throw new IllegalStateException("AudioDecoder must be initialized before usage");
                    }
                    if (this.f63938t) {
                        throw new IllegalStateException("AudioDecoder cannot be used after release");
                    }
                    fux2 = new LQ.fuX();
                    try {
                        if (this.f63937r != null) {
                            throw new IllegalStateException("Cannot start a new request since the previous request wasn't cleared yet");
                        }
                        ey.I28 i282 = new ey.I28(wre, AbstractC1363t.az(wre2.get$context()));
                        this.f63937r = i282;
                        try {
                            lej lejVar = this.f63936n;
                            CN3 cn33 = new CN3(i282, null);
                            wre2.f63949n = fux2;
                            wre2.f63952t = fux2;
                            wre2.f63946O = this;
                            wre2.J2 = i282;
                            wre2.f63951r = fux2;
                            wre2.f63947S = 1;
                            if (GJW.Dsr.Uo(lejVar, cn33, wre2) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            cn3 = fux2;
                            cn32 = cn3;
                            i28 = i282;
                            w6Var = this;
                        } catch (MediaCodec.CodecException e6) {
                            w6Var = this;
                            e5 = e6;
                            cn3 = fux2;
                            nVar = new j.n(new uPp.C(e5));
                        } catch (ExoPlaybackException e7) {
                            w6Var = this;
                            e4 = e7;
                            cn3 = fux2;
                            nVar = new j.n(new uPp.C(e4));
                        } catch (IOException e8) {
                            w6Var = this;
                            e3 = e8;
                            cn3 = fux2;
                            nVar = new j.n(new uPp.C(e3));
                        } catch (IllegalStateException e9) {
                            w6Var = this;
                            e2 = e9;
                            cn3 = fux2;
                            if (!(e2 instanceof CancellationException)) {
                            }
                        } catch (Throwable th) {
                            th = th;
                            w6Var2 = this;
                            w6Var2.f63937r = null;
                            throw th;
                        }
                    } catch (fuX.j e10) {
                        e = e10;
                        if (e.rl() == fux2) {
                            return new j.n(e.n());
                        }
                        throw e;
                    }
                } else {
                    if (w6Var2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cn3 = (LQ.CN3) wre2.f63951r;
                    i28 = (ey.I28) wre2.J2;
                    w6Var = (w6) wre2.f63946O;
                    cn32 = (LQ.CN3) wre2.f63952t;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (MediaCodec.CodecException e11) {
                        e5 = e11;
                        nVar = new j.n(new uPp.C(e5));
                    } catch (ExoPlaybackException e12) {
                        e4 = e12;
                        nVar = new j.n(new uPp.C(e4));
                    } catch (IOException e13) {
                        e3 = e13;
                        nVar = new j.n(new uPp.C(e3));
                    } catch (IllegalStateException e14) {
                        e2 = e14;
                        if (!(e2 instanceof CancellationException)) {
                            throw e2;
                        }
                        nVar = new j.n(new uPp.C(e2));
                    }
                }
                AbstractC1363t.qie(wre2.get$context());
                nVar = new j.w6((as.n) cn32.O(i28.t()));
                as.n nVar2 = (as.n) cn3.O(nVar);
                w6Var.f63937r = null;
                return new j.w6(nVar2);
            } catch (fuX.j e15) {
                e = e15;
                fux2 = fux;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // F3.j
    public long nr() {
        return this.f63935O.J2();
    }

    @Override // w9.fuX
    public void release() {
        if (this.f63938t) {
            throw new IllegalStateException("Cannot call release twice");
        }
        if (HI()) {
            this.J2.stop();
            this.J2.disable();
        }
        this.J2.reset();
        this.f63935O.reset();
        this.f63938t = true;
    }

    @Override // F3.j
    public LQ.j O() {
        try {
            if (HI()) {
                if (!this.f63938t) {
                    this.J2.resetPosition(0L);
                    this.J2.setCurrentStreamFinal();
                    return new j.w6(Unit.INSTANCE);
                }
                throw new IllegalStateException("AudioDecoder cannot be used after release");
            }
            throw new IllegalStateException("AudioDecoder must be initialized before usage");
        } catch (MediaCodec.CodecException e2) {
            return new j.n(new uPp.C(e2));
        } catch (ExoPlaybackException e3) {
            return new j.n(new uPp.C(e3));
        } catch (IOException e4) {
            return new j.n(new uPp.C(e4));
        } catch (IllegalStateException e5) {
            if (!(e5 instanceof CancellationException)) {
                return new j.n(new uPp.C(e5));
            }
            throw e5;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ w6(Context context, MediaCodecSelector DEFAULT, MediaCodecAdapter.Factory factory, Function1 function1, lej lejVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            DEFAULT = MediaCodecSelector.DEFAULT;
            Intrinsics.checkNotNullExpressionValue(DEFAULT, "DEFAULT");
        }
        this(context, DEFAULT, (i2 & 4) != 0 ? new DefaultMediaCodecAdapterFactory() : factory, (i2 & 8) != 0 ? j.f63953n : function1, (i2 & 16) != 0 ? OU.rl() : lejVar);
    }
}
