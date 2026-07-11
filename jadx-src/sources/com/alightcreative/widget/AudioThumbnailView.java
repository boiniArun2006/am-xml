package com.alightcreative.widget;

import Di.CN3;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.Trmy.yioUaKMByL;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.events.base.StatsEvent;
import com.safedk.android.internal.SafeDKWebAppInterface;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Delegates;
import kotlin.properties.ObservableProperty;
import kotlin.properties.ReadWriteProperty;
import kotlin.ranges.LongProgression;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0007\u0018\u0000 `2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001aB!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\fJ'\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ7\u0010$\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010 \u001a\u00020\b2\u0006\u0010!\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\b2\u0006\u0010#\u001a\u00020\bH\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u00182\u0006\u0010&\u001a\u00020\u0013H\u0016¢\u0006\u0004\b'\u0010(R/\u00100\u001a\u0004\u0018\u00010)2\b\u0010*\u001a\u0004\u0018\u00010)8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R+\u00107\u001a\u0002012\u0006\u0010*\u001a\u0002018F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b2\u0010+\u001a\u0004\b3\u00104\"\u0004\b5\u00106R+\u0010;\u001a\u0002012\u0006\u0010*\u001a\u0002018F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b8\u0010+\u001a\u0004\b9\u00104\"\u0004\b:\u00106R+\u0010@\u001a\u00020\u00132\u0006\u0010*\u001a\u00020\u00138F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b<\u0010+\u001a\u0004\b=\u0010>\"\u0004\b?\u0010(R\u0014\u0010D\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010H\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010L\u001a\u00020I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010O\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010Q\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010NR\u0016\u0010#\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010NR\u0016\u0010U\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010W\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010TR\u0014\u0010Y\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010NR\u0016\u0010[\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010NR\u0014\u0010]\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010NR\u0014\u0010_\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010N¨\u0006b"}, d2 = {"Lcom/alightcreative/widget/AudioThumbnailView;", "LyU/vd;", "LyU/u;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", TtmlNode.START, TtmlNode.END, "", "", "xMQ", "(II)[[B", "", "az", "(I)Z", "", StatsEvent.f62824A, "", "KN", "(D)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "currentTime", "startTime", "endTime", "framesPerHundredSeconds", "pixelsPerSecond", "rl", "(IIIII)V", SafeDKWebAppInterface.f62917c, com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(Z)V", "Landroid/net/Uri;", "<set-?>", "Lkotlin/properties/ReadWriteProperty;", "getAudioUri", "()Landroid/net/Uri;", "setAudioUri", "(Landroid/net/Uri;)V", "audioUri", "", "t", "getInTime", "()J", "setInTime", "(J)V", "inTime", "O", "getOutTime", "setOutTime", "outTime", "J2", "getLoop", "()Z", "setLoop", "loop", "LDi/CN3;", "r", "LDi/CN3;", "audioGraph", "Landroid/graphics/Paint;", "o", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Rect;", "S", "Landroid/graphics/Rect;", "visibleRect", "g", "I", "firstThumbVisible", "E2", "lastThumbVisible", "e", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "J", "lastDrawingEndX", "N", "lastDrawingStartX", "v", "waveColor", "Xw", "renderedCTS", "jB", "screenWidth", "U", "instanceSerial", "P5", "j", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAudioThumbnailView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AudioThumbnailView.kt\ncom/alightcreative/widget/AudioThumbnailView\n+ 2 Delegates.kt\nkotlin/properties/Delegates\n*L\n1#1,313:1\n33#2,3:314\n33#2,3:317\n33#2,3:320\n33#2,3:323\n*S KotlinDebug\n*F\n+ 1 AudioThumbnailView.kt\ncom/alightcreative/widget/AudioThumbnailView\n*L\n49#1:314,3\n50#1:317,3\n51#1:320,3\n52#1:323,3\n*E\n"})
public final class AudioThumbnailView extends View implements yU.vd, yU.u {
    static final /* synthetic */ KProperty[] M7 = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(AudioThumbnailView.class, "audioUri", "getAudioUri()Landroid/net/Uri;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(AudioThumbnailView.class, "inTime", "getInTime()J", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(AudioThumbnailView.class, "outTime", "getOutTime()J", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(AudioThumbnailView.class, "loop", "getLoop()Z", 0))};

    /* JADX INFO: renamed from: P5, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int p5 = 8;

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    private int lastThumbVisible;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final ReadWriteProperty loop;

    /* JADX INFO: renamed from: N, reason: collision with root package name and from kotlin metadata */
    private long lastDrawingStartX;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final ReadWriteProperty outTime;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private Rect visibleRect;

    /* JADX INFO: renamed from: T, reason: collision with root package name and from kotlin metadata */
    private long lastDrawingEndX;

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
    private final int instanceSerial;

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    private int renderedCTS;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int pixelsPerSecond;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int firstThumbVisible;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private final int screenWidth;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final ReadWriteProperty audioUri;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final Paint paint;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final Di.CN3 audioGraph;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final ReadWriteProperty inTime;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final int waveColor;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    public static final class I28 extends ObservableProperty {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ AudioThumbnailView f47011n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public I28(Object obj, AudioThumbnailView audioThumbnailView) {
            super(obj);
            this.f47011n = audioThumbnailView;
        }

        @Override // kotlin.properties.ObservableProperty
        protected void afterChange(KProperty property, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(property, "property");
            ((Boolean) obj2).getClass();
            ((Boolean) obj).getClass();
            this.f47011n.invalidate();
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    public static final class Ml extends ObservableProperty {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ AudioThumbnailView f47012n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ml(Object obj, AudioThumbnailView audioThumbnailView) {
            super(obj);
            this.f47012n = audioThumbnailView;
        }

        @Override // kotlin.properties.ObservableProperty
        protected void afterChange(KProperty property, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(property, "property");
            ((Number) obj2).longValue();
            ((Number) obj).longValue();
            this.f47012n.invalidate();
        }
    }

    /* JADX INFO: renamed from: com.alightcreative.widget.AudioThumbnailView$j, reason: from kotlin metadata */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void n(List uris) {
            Intrinsics.checkNotNullParameter(uris, "uris");
            List mutableList = CollectionsKt.toMutableList((Collection) psW.rl.keySet());
            mutableList.removeAll(CollectionsKt.toMutableList((Collection) uris));
            Iterator it = mutableList.iterator();
            while (it.hasNext()) {
                psW.rl.remove((Uri) it.next());
            }
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    public static final class n extends ObservableProperty {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ AudioThumbnailView f47013n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Object obj, AudioThumbnailView audioThumbnailView) {
            super(obj);
            this.f47013n = audioThumbnailView;
        }

        @Override // kotlin.properties.ObservableProperty
        protected void afterChange(KProperty property, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(property, "property");
            this.f47013n.invalidate();
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    public static final class w6 extends ObservableProperty {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ AudioThumbnailView f47014n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w6(Object obj, AudioThumbnailView audioThumbnailView) {
            super(obj);
            this.f47014n = audioThumbnailView;
        }

        @Override // kotlin.properties.ObservableProperty
        protected void afterChange(KProperty property, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(property, "property");
            ((Number) obj2).longValue();
            ((Number) obj).longValue();
            this.f47014n.invalidate();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioThumbnailView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Intrinsics.checkNotNullParameter(context, "context");
        Delegates delegates = Delegates.INSTANCE;
        this.audioUri = new n(null, this);
        this.inTime = new w6(0L, this);
        this.outTime = new Ml(0L, this);
        this.loop = new I28(Boolean.FALSE, this);
        this.audioGraph = new Di.CN3(0, 0, 0, 7, null);
        this.paint = new Paint();
        this.visibleRect = new Rect();
        this.firstThumbVisible = -1;
        this.lastThumbVisible = -1;
        this.lastDrawingStartX = Long.MAX_VALUE;
        this.waveColor = getResources().getColor(2131099912, null);
        this.renderedCTS = -1;
        this.screenWidth = context.getResources().getDisplayMetrics().widthPixels;
        int i3 = psW.f47471t;
        psW.f47471t = i3 + 1;
        this.instanceSerial = i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String HI(long j2, long j3) {
        return yioUaKMByL.FxJdgUszVjNrGJU + ((j2 - j3) / ((long) 1000000));
    }

    @Override // yU.u
    public void n(boolean playing) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final byte gh(short s2) {
        return (byte) (s2 / 256);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final byte[] mUb(AudioThumbnailView audioThumbnailView, double d2) throws InterruptedException {
        Di.vd vdVar;
        double d4 = 1000;
        if (audioThumbnailView.az((int) ((d2 * d4) + ((double) 1)))) {
            return new byte[0];
        }
        Hr.Wre wre = new Hr.Wre();
        try {
        } catch (IOException unused) {
            vdVar = null;
        }
        if (audioThumbnailView.getAudioUri() == null) {
            throw new FileNotFoundException();
        }
        Context context = audioThumbnailView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        HI0.Q q2 = new HI0.Q(context);
        Uri audioUri = audioThumbnailView.getAudioUri();
        Intrinsics.checkNotNull(audioUri);
        AssetFileDescriptor assetFileDescriptorNr = q2.nr(audioUri, "r");
        FileDescriptor fileDescriptor = assetFileDescriptorNr.getFileDescriptor();
        Intrinsics.checkNotNullExpressionValue(fileDescriptor, "getFileDescriptor(...)");
        wre.B(fileDescriptor, assetFileDescriptorNr.getStartOffset(), assetFileDescriptorNr.getLength());
        vdVar = new Di.vd(wre, audioThumbnailView.audioGraph, 0.0d, audioThumbnailView.getOutTime() / d4, 0.0d, audioThumbnailView.getOutTime() / d4, audioThumbnailView.getLoop(), null, 128, null);
        byte[] bArrPlus = new byte[0];
        if (vdVar != null) {
            CN3.I28 i28Rl = audioThumbnailView.audioGraph.rl();
            i28Rl.nr(vdVar);
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(audioThumbnailView.audioGraph.J2() * audioThumbnailView.audioGraph.t() * 2);
            i28Rl.n(d2);
            for (int i2 = 0; i2 < 5; i2++) {
                while (byteBufferAllocate.remaining() >= audioThumbnailView.audioGraph.O() * audioThumbnailView.audioGraph.t() * 2) {
                    Intrinsics.checkNotNull(i28Rl, "null cannot be cast to non-null type com.alightcreative.mediacore.audiograph.AudioBufferOutputNode");
                    Intrinsics.checkNotNull(byteBufferAllocate);
                    ((Di.w6) i28Rl).az(byteBufferAllocate);
                }
                byteBufferAllocate.rewind();
                short[] sArr = new short[byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN).asShortBuffer().remaining()];
                byteBufferAllocate.order(ByteOrder.BIG_ENDIAN).asShortBuffer().get(sArr);
                bArrPlus = ArraysKt.plus(bArrPlus, GP.Ml.O(GP.Ml.rl(GP.Ml.nr(GP.Ml.Uo(GP.Ml.nr(GP.Ml.Uo(GP.Ml.n(sArr), audioThumbnailView.audioGraph.t(), audioThumbnailView.audioGraph.t(), false, 4, null)), 50, 50, false, 4, null)), new Function1() { // from class: com.alightcreative.widget.K
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Byte.valueOf(AudioThumbnailView.gh(((Short) obj).shortValue()));
                    }
                })));
                byteBufferAllocate.clear();
            }
            i28Rl.J2(vdVar);
            vdVar.rl();
            audioThumbnailView.audioGraph.Uo();
        }
        return bArrPlus;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit qie(AudioThumbnailView audioThumbnailView, double d2, byte[] output) {
        byte[][] bArr;
        Intrinsics.checkNotNullParameter(output, "output");
        int i2 = 0;
        if (!(output.length == 0)) {
            Map map = psW.rl;
            Uri audioUri = audioThumbnailView.getAudioUri();
            Intrinsics.checkNotNull(audioUri);
            if (map.containsKey(audioUri)) {
                Map map2 = psW.rl;
                Uri audioUri2 = audioThumbnailView.getAudioUri();
                Intrinsics.checkNotNull(audioUri2);
                bArr = (byte[][]) map2.get(audioUri2);
                if (bArr != null) {
                    long j2 = 5000;
                    if (bArr.length < ((int) ((audioThumbnailView.getOutTime() / j2) + 1))) {
                        int outTime = (int) ((audioThumbnailView.getOutTime() / j2) + 1);
                        byte[][] bArr2 = new byte[outTime][];
                        for (int i3 = 0; i3 < outTime; i3++) {
                            bArr2[i3] = null;
                        }
                        int length = bArr.length;
                        while (i2 < length) {
                            bArr2[i2] = bArr[i2];
                            i2++;
                        }
                        bArr = bArr2;
                    }
                }
            } else {
                int outTime2 = (int) ((audioThumbnailView.getOutTime() / ((long) 5000)) + 1);
                byte[][] bArr3 = new byte[outTime2][];
                while (i2 < outTime2) {
                    bArr3[i2] = null;
                    i2++;
                }
                bArr = bArr3;
            }
            double d4 = d2 * ((double) 1000);
            double d5 = 5000;
            int i5 = (int) ((d4 - (d4 % d5)) / d5);
            if (bArr != null && bArr.length > i5) {
                bArr[i5] = output;
                Map map3 = psW.rl;
                Uri audioUri3 = audioThumbnailView.getAudioUri();
                Intrinsics.checkNotNull(audioUri3);
                map3.put(audioUri3, bArr);
                audioThumbnailView.invalidate();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ty(double d2, AudioThumbnailView audioThumbnailView, long j2) {
        return "AudioThumb: startX=" + d2 + " visibleRect=" + audioThumbnailView.visibleRect + " xstep=" + j2 + " outTime=" + audioThumbnailView.getOutTime() + " inTime=" + audioThumbnailView.getInTime() + " width=" + audioThumbnailView.getWidth();
    }

    private final byte[][] xMQ(int start, int end) {
        int i2 = (start - (start % 5000)) / 5000;
        int i3 = (end + (5000 - (end % 5000))) / 5000;
        byte[][] bArr = (byte[][]) psW.rl.get(getAudioUri());
        int i5 = i3 - i2;
        byte[][] bArr2 = new byte[i5][];
        for (int i7 = 0; i7 < i5; i7++) {
            bArr2[i7] = null;
        }
        int i8 = 0;
        while (i2 < i3) {
            int i9 = i8 + 1;
            bArr2[i8] = (bArr == null || bArr.length == 0 || bArr.length <= i2) ? new byte[0] : bArr[i2];
            i2++;
            i8 = i9;
        }
        return bArr2;
    }

    public final Uri getAudioUri() {
        return (Uri) this.audioUri.getValue(this, M7[0]);
    }

    public final long getInTime() {
        return ((Number) this.inTime.getValue(this, M7[1])).longValue();
    }

    public final boolean getLoop() {
        return ((Boolean) this.loop.getValue(this, M7[3])).booleanValue();
    }

    public final long getOutTime() {
        return ((Number) this.outTime.getValue(this, M7[2])).longValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f0 A[LOOP:2: B:60:0x0170->B:77:0x01f0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x020e A[LOOP:0: B:36:0x0126->B:84:0x020e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0219 A[EDGE_INSN: B:91:0x0219->B:85:0x0219 BREAK  A[LOOP:0: B:36:0x0126->B:84:0x020e], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x020a A[EDGE_INSN: B:96:0x020a->B:82:0x020a BREAK  A[LOOP:2: B:60:0x0170->B:77:0x01f0], SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onDraw(Canvas canvas) {
        long j2;
        byte[][] bArr;
        long j3;
        byte[] bArr2;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (XoT.fuX.ty(context)) {
            this.paint.setColor(-1);
            Rect rect = this.visibleRect;
            if (rect.left >= 0 && rect.right >= 0 && getOutTime() > getInTime()) {
                final long jNanoTime = System.nanoTime();
                double inTime = getInTime() + ((((double) this.visibleRect.left) / ((double) getWidth())) * (getOutTime() - getInTime()));
                double inTime2 = getInTime() + ((((double) this.visibleRect.right) / ((double) getWidth())) * (getOutTime() - getInTime()));
                if (inTime2 <= getOutTime() && (inTime >= 0.0d || inTime2 >= 0.0d)) {
                    byte[][] bArrXMQ = xMQ(inTime < 0.0d ? 0 : (int) inTime, (int) inTime2);
                    float height = getHeight() / 2.0f;
                    ArrayList arrayList = new ArrayList();
                    double d2 = 5000;
                    double d4 = inTime - (inTime % d2);
                    final double width = ((d4 - inTime) * ((double) getWidth())) / (getOutTime() - getInTime());
                    final long width2 = (long) ((d2 * ((double) getWidth())) / (getOutTime() - getInTime()));
                    long j4 = 1;
                    if (width2 >= 1) {
                        int i2 = (int) d4;
                        int i3 = i2 < 0 ? i2 / 5000 : 0;
                        float dimensionPixelSize = getResources().getDimensionPixelSize(2131165297);
                        long j5 = width2;
                        XoT.C.Uo(this, new Function0() { // from class: com.alightcreative.widget.rv6
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return AudioThumbnailView.ty(width, this, width2);
                            }
                        });
                        LongProgression longProgressionStep = RangesKt.step(RangesKt.until((long) width, this.visibleRect.right), j5);
                        long first = longProgressionStep.getFirst();
                        long last = longProgressionStep.getLast();
                        long step = longProgressionStep.getStep();
                        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                            while (bArrXMQ.length != 0 && i3 < bArrXMQ.length) {
                                if (i3 >= 0) {
                                    byte[] bArr3 = bArrXMQ[i3];
                                    if (bArr3 == null || bArr3.length == 0) {
                                        j2 = j4;
                                        bArr = bArrXMQ;
                                        j3 = j5;
                                        int i5 = (i3 * 5000) + i2;
                                        if (i5 >= 0) {
                                            arrayList.add(Integer.valueOf(i5));
                                        }
                                        i3++;
                                    } else {
                                        i3++;
                                        float f3 = j5;
                                        float length = f3 / ((float) bArr3.length) >= 1.0f ? f3 / ((float) bArr3.length) > dimensionPixelSize ? 2.0f : f3 / bArr3.length : 1.0f;
                                        long j6 = first + j5;
                                        j2 = j4;
                                        if (first <= j6) {
                                            long j7 = first;
                                            while (true) {
                                                long j9 = j7 - first;
                                                bArr = bArrXMQ;
                                                int length2 = (int) ((((long) bArr3.length) * j9) / j5);
                                                int length3 = (int) (((j9 + j2) * ((long) bArr3.length)) / j5);
                                                if (length2 > bArr3.length || length3 >= bArr3.length) {
                                                    bArr2 = bArr3;
                                                    j3 = j5;
                                                    if (j7 != j6) {
                                                        break;
                                                    }
                                                    j7 += j2;
                                                    j5 = j3;
                                                    bArr3 = bArr2;
                                                    bArrXMQ = bArr;
                                                } else {
                                                    byte bMax = ByteCompanionObject.MIN_VALUE;
                                                    int i7 = 0;
                                                    for (int i8 = length2; i8 < length3; i8++) {
                                                        byte b2 = bArr3[i8];
                                                        i7 += b2;
                                                        bMax = (byte) Math.max((int) bMax, (int) b2);
                                                    }
                                                    if (i7 != 0 || length3 != length2) {
                                                        float height2 = bMax == 0 ? 0.5f : (bMax * (getHeight() / 256.0f)) / 2;
                                                        this.paint.setColor(-1);
                                                        long j10 = ((long) this.visibleRect.left) + j7;
                                                        this.paint.setColor(this.waveColor);
                                                        float f4 = j10;
                                                        j3 = j5;
                                                        bArr2 = bArr3;
                                                        canvas.drawRect(f4, height - height2, f4 + length, height + height2, this.paint);
                                                        this.lastDrawingEndX = Math.max(this.lastDrawingEndX, j7);
                                                        this.lastDrawingStartX = Math.min(this.lastDrawingStartX, j7);
                                                    }
                                                    if (j7 != j6) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if (first != last) {
                                        break;
                                    }
                                    first += step;
                                    j5 = j3;
                                    j4 = j2;
                                    bArrXMQ = bArr;
                                } else {
                                    i3++;
                                    j2 = j4;
                                }
                                bArr = bArrXMQ;
                                j3 = j5;
                                if (first != last) {
                                }
                            }
                        }
                        Iterator it = arrayList.iterator();
                        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
                        while (it.hasNext()) {
                            KN(((double) ((Number) it.next()).intValue()) / ((double) 1000));
                        }
                        Rect rect2 = this.visibleRect;
                        this.firstThumbVisible = rect2.left;
                        this.lastThumbVisible = rect2.right;
                        this.paint.setShader(new LinearGradient(0.0f, 0.0f, getHeight() * 15.0f, 0.0f, -2011164085, 0, Shader.TileMode.CLAMP));
                        canvas.drawRect(0.0f, 0.0f, getHeight() * 15.0f, getHeight(), this.paint);
                        this.paint.setShader(null);
                        final long jNanoTime2 = System.nanoTime();
                        XoT.C.Uo(this, new Function0() { // from class: com.alightcreative.widget.vd
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return AudioThumbnailView.HI(jNanoTime2, jNanoTime);
                            }
                        });
                        super.onDraw(canvas);
                    }
                }
            }
        }
    }

    public final void setAudioUri(Uri uri) {
        this.audioUri.setValue(this, M7[0], uri);
    }

    public final void setInTime(long j2) {
        this.inTime.setValue(this, M7[1], Long.valueOf(j2));
    }

    public final void setLoop(boolean z2) {
        this.loop.setValue(this, M7[3], Boolean.valueOf(z2));
    }

    public final void setOutTime(long j2) {
        this.outTime.setValue(this, M7[2], Long.valueOf(j2));
    }

    private final void KN(final double timestamp) {
        HI0.qz.t(psW.f47470n, new Function0() { // from class: com.alightcreative.widget.Lu
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AudioThumbnailView.mUb(this.f47159n, timestamp);
            }
        }).Uo(new Function1() { // from class: com.alightcreative.widget.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AudioThumbnailView.qie(this.f47414n, timestamp, (byte[]) obj);
            }
        });
    }

    private final boolean az(int start) {
        boolean z2;
        byte[] bArr;
        boolean z3;
        byte[][] bArr2 = (byte[][]) psW.rl.get(getAudioUri());
        if (bArr2 != null && bArr2.length != 0) {
            int i2 = (start - (start % 5000)) / 5000;
            if (bArr2.length < ((int) ((getOutTime() / ((long) 5000)) + 1))) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (i2 >= bArr2.length) {
                return true;
            }
            if (!z2 && (bArr = bArr2[i2]) != null) {
                Intrinsics.checkNotNull(bArr);
                if (bArr.length == 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // yU.vd
    public void rl(int currentTime, int startTime, int endTime, int framesPerHundredSeconds, int pixelsPerSecond) {
        if (getAudioUri() != null) {
            getLocalVisibleRect(this.visibleRect);
            int iMax = Math.max(250, ((this.screenWidth * 1000) / pixelsPerSecond) / 4) + ((this.instanceSerial % 4) * 35);
            if (this.pixelsPerSecond == pixelsPerSecond && Math.abs(this.renderedCTS - currentTime) <= iMax) {
                return;
            }
            this.pixelsPerSecond = pixelsPerSecond;
            this.renderedCTS = currentTime;
            invalidate();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AudioThumbnailView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
