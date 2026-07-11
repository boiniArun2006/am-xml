package com.alightcreative.app.motion.scene;

import HI0.AbstractC1373p;
import Hr.CQ.USEaHtCMH;
import WJ.phkN.HFAkacKHsU;
import WzY.C1487z;
import android.graphics.Matrix;
import android.graphics.RectF;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.alightcreative.app.motion.scene.OptionalKeyableVector2D;
import com.alightcreative.app.motion.scene.OptionalVector2D;
import com.alightcreative.app.motion.scene.Rectangle;
import com.alightcreative.app.motion.scene.Vector2D;
import com.alightcreative.app.motion.scene.serializer.MalformedSceneException;
import com.caoccao.javet.exceptions.JavetError;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\u0006\u001a\u00020\u0000*\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001c\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\t\u001a\u00020\bH\u0086\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u001c\u0010\u000b\u001a\u00020\r*\u00020\u00012\u0006\u0010\t\u001a\u00020\bH\u0086\u0002¢\u0006\u0004\b\u000b\u0010\u000e\u001a\u0011\u0010\u0002\u001a\u00020\u0010*\u00020\u000f¢\u0006\u0004\b\u0002\u0010\u0011\u001a\u0011\u0010\u0002\u001a\u00020\u0013*\u00020\u0012¢\u0006\u0004\b\u0002\u0010\u0014\u001a3\u0010\u0019\u001a\u00020\u0013*\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u0017H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0019\u0010\u0006\u001a\u00020\u000f*\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u001b\u001a\u0019\u0010\u0006\u001a\u00020\u0012*\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u001c\u001a+\u0010!\u001a\u00020\u000f2\u0012\u0010\u001e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u001d\"\u00020\u00002\b\b\u0002\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"\u001a%\u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\u00012\u0006\u0010$\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b&\u0010'\u001a)\u0010*\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020%0)2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010(\u001a\u00020%¢\u0006\u0004\b*\u0010+\u001a\u001c\u0010-\u001a\u00020\u0000*\u00020\u00002\u0006\u0010,\u001a\u00020\u0004H\u0086\u0004¢\u0006\u0004\b-\u0010.\u001a\u001c\u00101\u001a\u00020\u0000*\u00020\u00002\u0006\u00100\u001a\u00020/H\u0086\u0002¢\u0006\u0004\b1\u00102\u001a\u001c\u00103\u001a\u00020\u0000*\u00020\u00002\u0006\u00100\u001a\u00020/H\u0086\u0002¢\u0006\u0004\b3\u00102\u001a\u001c\u00104\u001a\u00020\u0000*\u00020\u00002\u0006\u00100\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b4\u0010.\u001a\u001c\u00104\u001a\u00020\u0000*\u00020\u00002\u0006\u00100\u001a\u00020/H\u0086\u0002¢\u0006\u0004\b4\u00102\u001a\u001c\u00104\u001a\u00020\u0000*\u00020\u00002\u0006\u00100\u001a\u000205H\u0086\u0002¢\u0006\u0004\b4\u00106\u001a!\u00109\u001a\u00020\u0000*\u00020\u00002\u0006\u00107\u001a\u00020\u00042\u0006\u00108\u001a\u00020\u0004¢\u0006\u0004\b9\u0010:\u001a!\u0010;\u001a\u00020\u0000*\u00020\u00002\u0006\u00107\u001a\u00020\u00042\u0006\u00108\u001a\u00020\u0004¢\u0006\u0004\b;\u0010:\u001ap\u0010F\u001a\u00020D\"\u0004\b\u0000\u0010<*\b\u0012\u0004\u0012\u00028\u00000=2K\u0010E\u001aG\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b?\u0012\b\b@\u0012\u0004\b\b(A\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b?\u0012\b\b@\u0012\u0004\b\b(B\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b?\u0012\b\b@\u0012\u0004\b\b(C\u0012\u0004\u0012\u00020D0>H\u0086\bø\u0001\u0000¢\u0006\u0004\bF\u0010G\u001a~\u0010I\u001a\u00020D\"\u0004\b\u0000\u0010<*\b\u0012\u0004\u0012\u00028\u00000=2\b\b\u0002\u0010H\u001a\u00020\u001f2O\u0010E\u001aK\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b?\u0012\b\b@\u0012\u0004\b\b(A\u0012\u0015\u0012\u0013\u0018\u00018\u0000¢\u0006\f\b?\u0012\b\b@\u0012\u0004\b\b(B\u0012\u0015\u0012\u0013\u0018\u00018\u0000¢\u0006\f\b?\u0012\b\b@\u0012\u0004\b\b(C\u0012\u0004\u0012\u00020D0>H\u0086\bø\u0001\u0000¢\u0006\u0004\bI\u0010J\u001a\u001c\u00101\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010K\u001a\u00020/H\u0086\u0002¢\u0006\u0004\b1\u0010L\u001a\u001c\u00103\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010K\u001a\u00020/H\u0086\u0002¢\u0006\u0004\b3\u0010L\u001a\u001c\u00104\u001a\u00020\u000f*\u00020\u000f2\u0006\u00100\u001a\u00020/H\u0086\u0002¢\u0006\u0004\b4\u0010L\u001a\u001c\u00104\u001a\u00020\u000f*\u00020\u000f2\u0006\u00100\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b4\u0010M\u001a\u001c\u00104\u001a\u00020\u000f*\u00020\u000f2\u0006\u00100\u001a\u000205H\u0086\u0002¢\u0006\u0004\b4\u0010N\u001a\u001c\u00104\u001a\u00020\u000f*\u00020\u000f2\u0006\u00100\u001a\u00020OH\u0086\u0002¢\u0006\u0004\b4\u0010P\u001a\u001c\u00101\u001a\u00020\u0012*\u00020\u00122\u0006\u0010K\u001a\u00020/H\u0086\u0002¢\u0006\u0004\b1\u0010Q\u001a\u001c\u00103\u001a\u00020\u0012*\u00020\u00122\u0006\u0010K\u001a\u00020/H\u0086\u0002¢\u0006\u0004\b3\u0010Q\u001a\u001c\u00104\u001a\u00020\u0012*\u00020\u00122\u0006\u00100\u001a\u00020/H\u0086\u0002¢\u0006\u0004\b4\u0010Q\u001a\u001c\u00104\u001a\u00020\u0012*\u00020\u00122\u0006\u00100\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b4\u0010R\u001a\u001c\u00104\u001a\u00020\u0012*\u00020\u00122\u0006\u00100\u001a\u000205H\u0086\u0002¢\u0006\u0004\b4\u0010S\u001a\u001c\u00104\u001a\u00020\u0012*\u00020\u00122\u0006\u00100\u001a\u00020OH\u0086\u0002¢\u0006\u0004\b4\u0010T\u001a\u001c\u0010-\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010,\u001a\u00020\u0004H\u0086\u0004¢\u0006\u0004\b-\u0010M\u001a\u0011\u0010U\u001a\u00020\u000f*\u00020\u000f¢\u0006\u0004\bU\u0010V\u001a\u0011\u0010U\u001a\u00020\u0012*\u00020\u0012¢\u0006\u0004\bU\u0010W\u001a\u0011\u0010Y\u001a\u00020X*\u00020\u000f¢\u0006\u0004\bY\u0010Z\u001a\u0011\u0010Y\u001a\u00020X*\u00020\u0012¢\u0006\u0004\bY\u0010[\u001a!\u0010^\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010\\\u001a\u00020\u00152\u0006\u0010]\u001a\u00020\u0015¢\u0006\u0004\b^\u0010_\u001a!\u0010^\u001a\u00020\u0012*\u00020\u00122\u0006\u0010\\\u001a\u00020\u00152\u0006\u0010]\u001a\u00020\u0015¢\u0006\u0004\b^\u0010`\u001a\u0011\u0010a\u001a\u00020\u0012*\u00020\u000f¢\u0006\u0004\ba\u0010b\u001a!\u0010^\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010\\\u001a\u00020\u00042\u0006\u0010]\u001a\u00020\u0004¢\u0006\u0004\b^\u0010c\u001a!\u0010^\u001a\u00020\u0012*\u00020\u00122\u0006\u0010\\\u001a\u00020\u00042\u0006\u0010]\u001a\u00020\u0004¢\u0006\u0004\b^\u0010d\u001a!\u0010e\u001a\u00020\u0004*\u00020\u000f2\u0006\u0010\\\u001a\u00020\u00152\u0006\u0010]\u001a\u00020\u0015¢\u0006\u0004\be\u0010f\u001a!\u0010e\u001a\u00020\u0004*\u00020\u000f2\u0006\u0010\\\u001a\u00020\u00042\u0006\u0010]\u001a\u00020\u0004¢\u0006\u0004\be\u0010g\u001a!\u0010e\u001a\u00020\u0004*\u00020\u00122\u0006\u0010\\\u001a\u00020\u00152\u0006\u0010]\u001a\u00020\u0015¢\u0006\u0004\be\u0010h\u001a!\u0010e\u001a\u00020\u0004*\u00020\u00122\u0006\u0010\\\u001a\u00020\u00042\u0006\u0010]\u001a\u00020\u0004¢\u0006\u0004\be\u0010i\u001a\u0011\u0010k\u001a\u00020j*\u00020\u0012¢\u0006\u0004\bk\u0010l\u001a\u0011\u0010k\u001a\u00020j*\u00020\u000f¢\u0006\u0004\bk\u0010m\u001a\u0019\u0010o\u001a\u00020j*\u00020\u000f2\u0006\u0010n\u001a\u00020\u0015¢\u0006\u0004\bo\u0010p\u001a!\u0010o\u001a\u00020j*\u00020\u00102\u0006\u0010n\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\bo\u0010q\u001a\u0011\u0010s\u001a\u00020r*\u00020\u000f¢\u0006\u0004\bs\u0010t\u001a\u0011\u0010s\u001a\u00020r*\u00020\u0012¢\u0006\u0004\bs\u0010u\u001a\u001f\u0010w\u001a\u00020\u00122\u0006\u0010v\u001a\u00020r2\b\b\u0002\u0010 \u001a\u00020\u001f¢\u0006\u0004\bw\u0010x\u001a\u001f\u0010z\u001a\u00020\u000f2\u0006\u0010y\u001a\u00020r2\b\b\u0002\u0010 \u001a\u00020\u001f¢\u0006\u0004\bz\u0010{\u001a\u0015\u0010}\u001a\u00020\u000f2\u0006\u0010|\u001a\u00020r¢\u0006\u0004\b}\u0010~\u001a\u0016\u0010\u007f\u001a\u00020\u00122\u0006\u0010|\u001a\u00020r¢\u0006\u0005\b\u007f\u0010\u0080\u0001\"$\u0010\u0082\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020X0\u0081\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001\"$\u0010\u0084\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020X0\u0081\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0083\u0001\"\u0017\u0010\u0086\u0001\u001a\u00020X*\u00020\u000f8F¢\u0006\u0007\u001a\u0005\b\u0085\u0001\u0010Z\"\u0017\u0010\u0086\u0001\u001a\u00020X*\u00020\u00128F¢\u0006\u0007\u001a\u0005\b\u0085\u0001\u0010[\"\u0018\u0010\u0089\u0001\u001a\u00020\u001f*\u00020\u00108F¢\u0006\b\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001\"\u0018\u0010\u0089\u0001\u001a\u00020\u001f*\u00020\u00138F¢\u0006\b\u001a\u0006\b\u0087\u0001\u0010\u008a\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u008b\u0001"}, d2 = {"Lcom/alightcreative/app/motion/scene/CBKnot;", "Lcom/alightcreative/app/motion/scene/KeyableCBKnot;", "keyable", "(Lcom/alightcreative/app/motion/scene/CBKnot;)Lcom/alightcreative/app/motion/scene/KeyableCBKnot;", "", "t", "valueAtTime", "(Lcom/alightcreative/app/motion/scene/KeyableCBKnot;F)Lcom/alightcreative/app/motion/scene/CBKnot;", "Lcom/alightcreative/app/motion/scene/ControlHandle;", "handle", "Lcom/alightcreative/app/motion/scene/OptionalVector2D;", "get", "(Lcom/alightcreative/app/motion/scene/CBKnot;Lcom/alightcreative/app/motion/scene/ControlHandle;)Lcom/alightcreative/app/motion/scene/OptionalVector2D;", "", "(Lcom/alightcreative/app/motion/scene/KeyableCBKnot;Lcom/alightcreative/app/motion/scene/ControlHandle;)Ljava/lang/Object;", "Lcom/alightcreative/app/motion/scene/CubicBSpline;", "Lcom/alightcreative/app/motion/scene/KeyableCubicBSpline;", "(Lcom/alightcreative/app/motion/scene/CubicBSpline;)Lcom/alightcreative/app/motion/scene/KeyableCubicBSpline;", "Lcom/alightcreative/app/motion/scene/CompoundCubicBSpline;", "Lcom/alightcreative/app/motion/scene/KeyableCompoundCubicBSpline;", "(Lcom/alightcreative/app/motion/scene/CompoundCubicBSpline;)Lcom/alightcreative/app/motion/scene/KeyableCompoundCubicBSpline;", "", "index", "Lkotlin/Function1;", "updater", "copyUpdatingContour", "(Lcom/alightcreative/app/motion/scene/KeyableCompoundCubicBSpline;ILkotlin/jvm/functions/Function1;)Lcom/alightcreative/app/motion/scene/KeyableCompoundCubicBSpline;", "(Lcom/alightcreative/app/motion/scene/KeyableCubicBSpline;F)Lcom/alightcreative/app/motion/scene/CubicBSpline;", "(Lcom/alightcreative/app/motion/scene/KeyableCompoundCubicBSpline;F)Lcom/alightcreative/app/motion/scene/CompoundCubicBSpline;", "", "knots", "", "closed", "cubicBSplineFromPoints", "([Lcom/alightcreative/app/motion/scene/CBKnot;Z)Lcom/alightcreative/app/motion/scene/CubicBSpline;", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "b", "Lcom/alightcreative/app/motion/scene/CBSegment;", "segmentBetween", "(Lcom/alightcreative/app/motion/scene/KeyableCBKnot;Lcom/alightcreative/app/motion/scene/KeyableCBKnot;F)Lcom/alightcreative/app/motion/scene/CBSegment;", "segment", "Lkotlin/Pair;", "splitCubicBezierSegment", "(FLcom/alightcreative/app/motion/scene/CBSegment;)Lkotlin/Pair;", "degrees", "rot", "(Lcom/alightcreative/app/motion/scene/CBKnot;F)Lcom/alightcreative/app/motion/scene/CBKnot;", "Lcom/alightcreative/app/motion/scene/Vector2D;", InneractiveMediationNameConsts.OTHER, "plus", "(Lcom/alightcreative/app/motion/scene/CBKnot;Lcom/alightcreative/app/motion/scene/Vector2D;)Lcom/alightcreative/app/motion/scene/CBKnot;", "minus", "times", "Landroid/graphics/Matrix;", "(Lcom/alightcreative/app/motion/scene/CBKnot;Landroid/graphics/Matrix;)Lcom/alightcreative/app/motion/scene/CBKnot;", "x", "y", "withInPoint", "(Lcom/alightcreative/app/motion/scene/CBKnot;FF)Lcom/alightcreative/app/motion/scene/CBKnot;", "withOutPoint", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Lkotlin/Function3;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "element", "prevElement", "nextElement", "", FileUploadManager.f61572j, "forEachInContextWrap", "(Ljava/util/List;Lkotlin/jvm/functions/Function3;)V", "wrap", "forEachInContext", "(Ljava/util/List;ZLkotlin/jvm/functions/Function3;)V", "offset", "(Lcom/alightcreative/app/motion/scene/CubicBSpline;Lcom/alightcreative/app/motion/scene/Vector2D;)Lcom/alightcreative/app/motion/scene/CubicBSpline;", "(Lcom/alightcreative/app/motion/scene/CubicBSpline;F)Lcom/alightcreative/app/motion/scene/CubicBSpline;", "(Lcom/alightcreative/app/motion/scene/CubicBSpline;Landroid/graphics/Matrix;)Lcom/alightcreative/app/motion/scene/CubicBSpline;", "Lcom/alightcreative/app/motion/scene/Transform;", "(Lcom/alightcreative/app/motion/scene/CubicBSpline;Lcom/alightcreative/app/motion/scene/Transform;)Lcom/alightcreative/app/motion/scene/CubicBSpline;", "(Lcom/alightcreative/app/motion/scene/CompoundCubicBSpline;Lcom/alightcreative/app/motion/scene/Vector2D;)Lcom/alightcreative/app/motion/scene/CompoundCubicBSpline;", "(Lcom/alightcreative/app/motion/scene/CompoundCubicBSpline;F)Lcom/alightcreative/app/motion/scene/CompoundCubicBSpline;", "(Lcom/alightcreative/app/motion/scene/CompoundCubicBSpline;Landroid/graphics/Matrix;)Lcom/alightcreative/app/motion/scene/CompoundCubicBSpline;", "(Lcom/alightcreative/app/motion/scene/CompoundCubicBSpline;Lcom/alightcreative/app/motion/scene/Transform;)Lcom/alightcreative/app/motion/scene/CompoundCubicBSpline;", "centeredAtOrigin", "(Lcom/alightcreative/app/motion/scene/CubicBSpline;)Lcom/alightcreative/app/motion/scene/CubicBSpline;", "(Lcom/alightcreative/app/motion/scene/CompoundCubicBSpline;)Lcom/alightcreative/app/motion/scene/CompoundCubicBSpline;", "Lcom/alightcreative/app/motion/scene/Rectangle;", "knotBounds", "(Lcom/alightcreative/app/motion/scene/CubicBSpline;)Lcom/alightcreative/app/motion/scene/Rectangle;", "(Lcom/alightcreative/app/motion/scene/CompoundCubicBSpline;)Lcom/alightcreative/app/motion/scene/Rectangle;", "width", "height", "fitIn", "(Lcom/alightcreative/app/motion/scene/CubicBSpline;II)Lcom/alightcreative/app/motion/scene/CubicBSpline;", "(Lcom/alightcreative/app/motion/scene/CompoundCubicBSpline;II)Lcom/alightcreative/app/motion/scene/CompoundCubicBSpline;", "toCompound", "(Lcom/alightcreative/app/motion/scene/CubicBSpline;)Lcom/alightcreative/app/motion/scene/CompoundCubicBSpline;", "(Lcom/alightcreative/app/motion/scene/CubicBSpline;FF)Lcom/alightcreative/app/motion/scene/CubicBSpline;", "(Lcom/alightcreative/app/motion/scene/CompoundCubicBSpline;FF)Lcom/alightcreative/app/motion/scene/CompoundCubicBSpline;", "fitInScale", "(Lcom/alightcreative/app/motion/scene/CubicBSpline;II)F", "(Lcom/alightcreative/app/motion/scene/CubicBSpline;FF)F", "(Lcom/alightcreative/app/motion/scene/CompoundCubicBSpline;II)F", "(Lcom/alightcreative/app/motion/scene/CompoundCubicBSpline;FF)F", "LWzY/z;", "toPath", "(Lcom/alightcreative/app/motion/scene/CompoundCubicBSpline;)LWzY/z;", "(Lcom/alightcreative/app/motion/scene/CubicBSpline;)LWzY/z;", "point", "toPathSegment", "(Lcom/alightcreative/app/motion/scene/CubicBSpline;I)LWzY/z;", "(Lcom/alightcreative/app/motion/scene/KeyableCubicBSpline;IF)LWzY/z;", "", "toSVGPath", "(Lcom/alightcreative/app/motion/scene/CubicBSpline;)Ljava/lang/String;", "(Lcom/alightcreative/app/motion/scene/CompoundCubicBSpline;)Ljava/lang/String;", "svg", "cubicBSplineFromSVGAuto", "(Ljava/lang/String;Z)Lcom/alightcreative/app/motion/scene/CompoundCubicBSpline;", "polygon", "cubicBSplineFromSVGPolygon", "(Ljava/lang/String;Z)Lcom/alightcreative/app/motion/scene/CubicBSpline;", JavetError.PARAMETER_PATH, "cubicBSplineFromSVGPath", "(Ljava/lang/String;)Lcom/alightcreative/app/motion/scene/CubicBSpline;", "compoundCubicBSplineFromSVGPath", "(Ljava/lang/String;)Lcom/alightcreative/app/motion/scene/CompoundCubicBSpline;", "Ljava/util/WeakHashMap;", "boundsCache", "Ljava/util/WeakHashMap;", "compoundBoundsCache", "getBounds", "bounds", "getKeyed", "(Lcom/alightcreative/app/motion/scene/KeyableCubicBSpline;)Z", "keyed", "(Lcom/alightcreative/app/motion/scene/KeyableCompoundCubicBSpline;)Z", "app_productionRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCubicBSpline.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CubicBSpline.kt\ncom/alightcreative/app/motion/scene/CubicBSplineKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 StringParser.kt\ncom/alightcreative/ext/StringParserKt\n*L\n1#1,773:1\n258#1,26:882\n258#1,26:909\n248#1,8:941\n1557#2:774\n1628#2,3:775\n1557#2:778\n1628#2,3:779\n1557#2:782\n1628#2,3:783\n1557#2:786\n1628#2,3:787\n1557#2:804\n1628#2,3:805\n1557#2:808\n1628#2,3:809\n1557#2:812\n1628#2,3:813\n1557#2:816\n1628#2,3:817\n1557#2:820\n1628#2,3:821\n1557#2:824\n1628#2,3:825\n1557#2:828\n1628#2,3:829\n1557#2:832\n1628#2,3:833\n1557#2:836\n1628#2,3:837\n1557#2:840\n1628#2,3:841\n1557#2:844\n1628#2,3:845\n1557#2:848\n1628#2,3:849\n1557#2:852\n1628#2,3:853\n1557#2:856\n1628#2,3:857\n1368#2:860\n1454#2,2:861\n1557#2:863\n1628#2,3:864\n1456#2,3:867\n1557#2:870\n1628#2,3:871\n1368#2:874\n1454#2,5:875\n1863#2:880\n1864#2:908\n1755#2,3:935\n1755#2,3:938\n1567#2:949\n1598#2,4:950\n381#3,7:790\n381#3,7:797\n1#4:881\n19#5,3:954\n19#5,3:957\n*S KotlinDebug\n*F\n+ 1 CubicBSpline.kt\ncom/alightcreative/app/motion/scene/CubicBSplineKt\n*L\n371#1:882,26\n402#1:909,26\n478#1:941,8\n70#1:774\n70#1:775,3\n71#1:778\n71#1:779,3\n101#1:782\n101#1:783,3\n102#1:786\n102#1:787,3\n300#1:804\n300#1:805,3\n301#1:808\n301#1:809,3\n302#1:812\n302#1:813,3\n303#1:816\n303#1:817,3\n304#1:820\n304#1:821,3\n305#1:824\n305#1:825,3\n307#1:828\n307#1:829,3\n308#1:832\n308#1:833,3\n309#1:836\n309#1:837,3\n310#1:840\n310#1:841,3\n311#1:844\n311#1:845,3\n312#1:848\n312#1:849,3\n314#1:852\n314#1:853,3\n324#1:856\n324#1:857,3\n325#1:860\n325#1:861,2\n325#1:863\n325#1:864,3\n325#1:867,3\n333#1:870\n333#1:871,3\n349#1:874\n349#1:875,5\n367#1:880\n367#1:908\n442#1:935,3\n443#1:938,3\n512#1:949\n512#1:950,4\n288#1:790,7\n294#1:797,7\n562#1:954,3\n671#1:957,3\n*E\n"})
public final class CubicBSplineKt {
    private static final WeakHashMap<CubicBSpline, Rectangle> boundsCache = new WeakHashMap<>();
    private static final WeakHashMap<CompoundCubicBSpline, Rectangle> compoundBoundsCache = new WeakHashMap<>();

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ControlHandle.values().length];
            try {
                iArr[ControlHandle.IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ControlHandle.MAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ControlHandle.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ControlHandle.CURVE_OUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final CubicBSpline centeredAtOrigin(CubicBSpline cubicBSpline) {
        Intrinsics.checkNotNullParameter(cubicBSpline, "<this>");
        return minus(cubicBSpline, knotBounds(cubicBSpline).getCenter());
    }

    public static final CubicBSpline fitIn(CubicBSpline cubicBSpline, int i2, int i3) {
        Intrinsics.checkNotNullParameter(cubicBSpline, "<this>");
        return fitIn(cubicBSpline, i2, i3);
    }

    public static final float fitInScale(CubicBSpline cubicBSpline, int i2, int i3) {
        Intrinsics.checkNotNullParameter(cubicBSpline, "<this>");
        return fitInScale(cubicBSpline, i2, i3);
    }

    public static /* synthetic */ void forEachInContext$default(List list, boolean z2, Function3 action, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int size = list.size();
        if (size < 1) {
            return;
        }
        int i3 = 0;
        while (i3 < size) {
            Object obj2 = null;
            Object obj3 = i3 == 0 ? z2 ? list.get(size - 1) : null : list.get(i3 - 1);
            int i5 = i3 + 1;
            if (i5 < size) {
                obj2 = list.get(i5);
            } else if (z2) {
                obj2 = list.get(0);
            }
            action.invoke(list.get(i3), obj3, obj2);
            i3 = i5;
        }
    }

    public static final OptionalVector2D get(CBKnot cBKnot, ControlHandle handle) {
        Intrinsics.checkNotNullParameter(cBKnot, "<this>");
        Intrinsics.checkNotNullParameter(handle, "handle");
        int i2 = WhenMappings.$EnumSwitchMapping$0[handle.ordinal()];
        if (i2 == 1) {
            return cBKnot.getCurveIn();
        }
        if (i2 == 2) {
            return cBKnot.getP();
        }
        if (i2 == 3) {
            return cBKnot.getCurveOut();
        }
        if (i2 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        throw new UnsupportedOperationException();
    }

    public static final Rectangle getBounds(CubicBSpline cubicBSpline) {
        Intrinsics.checkNotNullParameter(cubicBSpline, "<this>");
        WeakHashMap<CubicBSpline, Rectangle> weakHashMap = boundsCache;
        Rectangle rectangle = weakHashMap.get(cubicBSpline);
        if (rectangle == null) {
            RectF rectF = new RectF();
            toPath(cubicBSpline).t().computeBounds(rectF, true);
            rectangle = GeometryKt.toRectangle(rectF);
            weakHashMap.put(cubicBSpline, rectangle);
        }
        Intrinsics.checkNotNullExpressionValue(rectangle, "getOrPut(...)");
        return rectangle;
    }

    public static final boolean getKeyed(KeyableCubicBSpline keyableCubicBSpline) {
        Intrinsics.checkNotNullParameter(keyableCubicBSpline, "<this>");
        List<KeyableCBKnot> knots = keyableCubicBSpline.getKnots();
        if (knots != null && knots.isEmpty()) {
            return false;
        }
        for (KeyableCBKnot keyableCBKnot : knots) {
            if (keyableCBKnot.getP().getKeyed()) {
                return true;
            }
            if ((keyableCBKnot.getCurveIn() instanceof KeyableVector2D) && ((KeyableVector2D) keyableCBKnot.getCurveIn()).getKeyed()) {
                return true;
            }
            if ((keyableCBKnot.getCurveOut() instanceof KeyableVector2D) && ((KeyableVector2D) keyableCBKnot.getCurveOut()).getKeyed()) {
                return true;
            }
        }
        return false;
    }

    public static final KeyableCBKnot keyable(CBKnot cBKnot) {
        Intrinsics.checkNotNullParameter(cBKnot, "<this>");
        return new KeyableCBKnot(KeyableKt.keyable(cBKnot.getP()), KeyableKt.keyable(GeometryKt.minus(cBKnot.getCurveIn(), cBKnot.getP())), KeyableKt.keyable(GeometryKt.minus(cBKnot.getCurveOut(), cBKnot.getP())));
    }

    public static final Rectangle knotBounds(CubicBSpline cubicBSpline) {
        Intrinsics.checkNotNullParameter(cubicBSpline, "<this>");
        Rectangle.Companion companion = Rectangle.INSTANCE;
        List<CBKnot> knots = cubicBSpline.getKnots();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(knots, 10));
        Iterator<T> it = knots.iterator();
        while (it.hasNext()) {
            arrayList.add(((CBKnot) it.next()).getP());
        }
        return companion.enclosing(arrayList);
    }

    public static final CBKnot minus(CBKnot cBKnot, Vector2D other) {
        OptionalVector2D optionalVector2DMinus;
        OptionalVector2D optionalVector2DMinus2;
        Intrinsics.checkNotNullParameter(cBKnot, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Vector2D vector2DMinus = GeometryKt.minus(cBKnot.getP(), other);
        OptionalVector2D curveIn = cBKnot.getCurveIn();
        if (curveIn instanceof Vector2D) {
            optionalVector2DMinus = GeometryKt.minus((Vector2D) cBKnot.getCurveIn(), other);
        } else {
            OptionalVector2D.NONE none = OptionalVector2D.NONE.INSTANCE;
            if (!Intrinsics.areEqual(curveIn, none)) {
                throw new NoWhenBranchMatchedException();
            }
            optionalVector2DMinus = none;
        }
        OptionalVector2D curveOut = cBKnot.getCurveOut();
        if (curveOut instanceof Vector2D) {
            optionalVector2DMinus2 = GeometryKt.minus((Vector2D) cBKnot.getCurveOut(), other);
        } else {
            optionalVector2DMinus2 = OptionalVector2D.NONE.INSTANCE;
            if (!Intrinsics.areEqual(curveOut, optionalVector2DMinus2)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return new CBKnot(vector2DMinus, optionalVector2DMinus, optionalVector2DMinus2);
    }

    public static final CBKnot plus(CBKnot cBKnot, Vector2D other) {
        OptionalVector2D optionalVector2DPlus;
        OptionalVector2D optionalVector2DPlus2;
        Intrinsics.checkNotNullParameter(cBKnot, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Vector2D vector2DPlus = GeometryKt.plus(cBKnot.getP(), other);
        OptionalVector2D curveIn = cBKnot.getCurveIn();
        if (curveIn instanceof Vector2D) {
            optionalVector2DPlus = GeometryKt.plus((Vector2D) cBKnot.getCurveIn(), other);
        } else {
            OptionalVector2D.NONE none = OptionalVector2D.NONE.INSTANCE;
            if (!Intrinsics.areEqual(curveIn, none)) {
                throw new NoWhenBranchMatchedException();
            }
            optionalVector2DPlus = none;
        }
        OptionalVector2D curveOut = cBKnot.getCurveOut();
        if (curveOut instanceof Vector2D) {
            optionalVector2DPlus2 = GeometryKt.plus((Vector2D) cBKnot.getCurveOut(), other);
        } else {
            optionalVector2DPlus2 = OptionalVector2D.NONE.INSTANCE;
            if (!Intrinsics.areEqual(curveOut, optionalVector2DPlus2)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return new CBKnot(vector2DPlus, optionalVector2DPlus, optionalVector2DPlus2);
    }

    public static final CBKnot rot(CBKnot cBKnot, float f3) {
        OptionalVector2D optionalVector2DRot;
        OptionalVector2D optionalVector2DRot2;
        Intrinsics.checkNotNullParameter(cBKnot, "<this>");
        Vector2D vector2DRot = GeometryKt.rot(cBKnot.getP(), f3);
        OptionalVector2D curveIn = cBKnot.getCurveIn();
        if (curveIn instanceof Vector2D) {
            optionalVector2DRot = GeometryKt.rot((Vector2D) cBKnot.getCurveIn(), f3);
        } else {
            OptionalVector2D.NONE none = OptionalVector2D.NONE.INSTANCE;
            if (!Intrinsics.areEqual(curveIn, none)) {
                throw new NoWhenBranchMatchedException();
            }
            optionalVector2DRot = none;
        }
        OptionalVector2D curveOut = cBKnot.getCurveOut();
        if (curveOut instanceof Vector2D) {
            optionalVector2DRot2 = GeometryKt.rot((Vector2D) cBKnot.getCurveOut(), f3);
        } else {
            optionalVector2DRot2 = OptionalVector2D.NONE.INSTANCE;
            if (!Intrinsics.areEqual(curveOut, optionalVector2DRot2)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return new CBKnot(vector2DRot, optionalVector2DRot, optionalVector2DRot2);
    }

    public static final CBKnot times(CBKnot cBKnot, float f3) {
        Intrinsics.checkNotNullParameter(cBKnot, "<this>");
        return times(cBKnot, new Vector2D(f3, f3));
    }

    public static final C1487z toPath(CompoundCubicBSpline compoundCubicBSpline) {
        Intrinsics.checkNotNullParameter(compoundCubicBSpline, "<this>");
        C1487z c1487z = new C1487z();
        if (!compoundCubicBSpline.getContours().isEmpty()) {
            for (CubicBSpline cubicBSpline : compoundCubicBSpline.getContours()) {
                List<CBKnot> knots = cubicBSpline.getKnots();
                if (!knots.isEmpty()) {
                    Vector2D p2 = ((CBKnot) CollectionsKt.first((List) knots)).getP();
                    c1487z.Y(p2.getX(), p2.getY());
                    boolean closed = cubicBSpline.getClosed();
                    int size = knots.size();
                    if (size >= 1) {
                        int i2 = 0;
                        while (i2 < size) {
                            CBKnot cBKnot = null;
                            CBKnot cBKnot2 = i2 == 0 ? closed ? knots.get(size - 1) : null : knots.get(i2 - 1);
                            int i3 = i2 + 1;
                            if (i3 < size) {
                                cBKnot = knots.get(i3);
                            } else if (closed) {
                                cBKnot = knots.get(0);
                            }
                            CBKnot cBKnot3 = cBKnot;
                            CBKnot cBKnot4 = knots.get(i2);
                            if (cBKnot3 != null) {
                                OptionalVector2D curveOut = cBKnot4.getCurveOut();
                                OptionalVector2D.NONE none = OptionalVector2D.NONE.INSTANCE;
                                if (Intrinsics.areEqual(curveOut, none) && Intrinsics.areEqual(cBKnot3.getCurveIn(), none)) {
                                    c1487z.J(cBKnot3.getP().getX(), cBKnot3.getP().getY());
                                } else if ((cBKnot4.getCurveOut() instanceof Vector2D) && (cBKnot3.getCurveIn() instanceof Vector2D)) {
                                    c1487z.te(((Vector2D) cBKnot4.getCurveOut()).getX(), ((Vector2D) cBKnot4.getCurveOut()).getY(), ((Vector2D) cBKnot3.getCurveIn()).getX(), ((Vector2D) cBKnot3.getCurveIn()).getY(), cBKnot3.getP().getX(), cBKnot3.getP().getY());
                                } else if (Intrinsics.areEqual(cBKnot4.getCurveOut(), none) && (cBKnot3.getCurveIn() instanceof Vector2D)) {
                                    c1487z.te(cBKnot4.getP().getX(), cBKnot4.getP().getY(), ((Vector2D) cBKnot3.getCurveIn()).getX(), ((Vector2D) cBKnot3.getCurveIn()).getY(), cBKnot3.getP().getX(), cBKnot3.getP().getY());
                                } else {
                                    if (!(cBKnot4.getCurveOut() instanceof Vector2D) || !Intrinsics.areEqual(cBKnot3.getCurveIn(), none)) {
                                        throw new IllegalStateException();
                                    }
                                    c1487z.te(((Vector2D) cBKnot4.getCurveOut()).getX(), ((Vector2D) cBKnot4.getCurveOut()).getY(), cBKnot3.getP().getX(), cBKnot3.getP().getY(), cBKnot3.getP().getX(), cBKnot3.getP().getY());
                                }
                            }
                            i2 = i3;
                        }
                    }
                    if (cubicBSpline.getClosed()) {
                        if (cubicBSpline.getExclude()) {
                            c1487z.nY();
                        } else {
                            c1487z.g();
                        }
                    }
                }
            }
        }
        return c1487z;
    }

    public static final C1487z toPathSegment(CubicBSpline cubicBSpline, int i2) {
        Intrinsics.checkNotNullParameter(cubicBSpline, "<this>");
        C1487z c1487z = new C1487z();
        if (cubicBSpline.getKnots().isEmpty()) {
            return c1487z;
        }
        CBKnot cBKnot = cubicBSpline.getKnots().get(i2);
        CBKnot cBKnot2 = cubicBSpline.getKnots().get((i2 + 1) % cubicBSpline.getKnots().size());
        Vector2D p2 = cBKnot.getP();
        c1487z.Y(p2.getX(), p2.getY());
        OptionalVector2D curveOut = cBKnot.getCurveOut();
        OptionalVector2D.NONE none = OptionalVector2D.NONE.INSTANCE;
        if (Intrinsics.areEqual(curveOut, none) && Intrinsics.areEqual(cBKnot2.getCurveIn(), none)) {
            c1487z.J(cBKnot2.getP().getX(), cBKnot2.getP().getY());
            return c1487z;
        }
        if ((cBKnot.getCurveOut() instanceof Vector2D) && (cBKnot2.getCurveIn() instanceof Vector2D)) {
            c1487z.te(((Vector2D) cBKnot.getCurveOut()).getX(), ((Vector2D) cBKnot.getCurveOut()).getY(), ((Vector2D) cBKnot2.getCurveIn()).getX(), ((Vector2D) cBKnot2.getCurveIn()).getY(), cBKnot2.getP().getX(), cBKnot2.getP().getY());
            return c1487z;
        }
        if (Intrinsics.areEqual(cBKnot.getCurveOut(), none) && (cBKnot2.getCurveIn() instanceof Vector2D)) {
            c1487z.te(cBKnot.getP().getX(), cBKnot.getP().getY(), ((Vector2D) cBKnot2.getCurveIn()).getX(), ((Vector2D) cBKnot2.getCurveIn()).getY(), cBKnot2.getP().getX(), cBKnot2.getP().getY());
            return c1487z;
        }
        if (!(cBKnot.getCurveOut() instanceof Vector2D) || !Intrinsics.areEqual(cBKnot2.getCurveIn(), none)) {
            throw new IllegalStateException();
        }
        c1487z.te(((Vector2D) cBKnot.getCurveOut()).getX(), ((Vector2D) cBKnot.getCurveOut()).getY(), cBKnot2.getP().getX(), cBKnot2.getP().getY(), cBKnot2.getP().getX(), cBKnot2.getP().getY());
        return c1487z;
    }

    public static final String toSVGPath(CubicBSpline cubicBSpline) {
        String str;
        Intrinsics.checkNotNullParameter(cubicBSpline, "<this>");
        if (cubicBSpline.getKnots().isEmpty()) {
            return "";
        }
        Vector2D p2 = ((CBKnot) CollectionsKt.first((List) cubicBSpline.getKnots())).getP();
        String str2 = ((Object) "") + "M " + p2.getX() + " " + p2.getY();
        List<CBKnot> knots = cubicBSpline.getKnots();
        int size = knots.size();
        if (size >= 1) {
            int i2 = 0;
            while (i2 < size) {
                knots.get(i2 == 0 ? size - 1 : i2 - 1);
                int i3 = i2 + 1;
                CBKnot cBKnot = i3 >= size ? knots.get(0) : knots.get(i3);
                CBKnot cBKnot2 = knots.get(i2);
                OptionalVector2D curveOut = cBKnot2.getCurveOut();
                OptionalVector2D.NONE none = OptionalVector2D.NONE.INSTANCE;
                if (Intrinsics.areEqual(curveOut, none) && Intrinsics.areEqual(cBKnot.getCurveIn(), none)) {
                    str = "L " + cBKnot.getP().getX() + " " + cBKnot.getP().getY();
                } else {
                    boolean z2 = cBKnot2.getCurveOut() instanceof Vector2D;
                    String str3 = HFAkacKHsU.DWjqqw;
                    if (z2 && (cBKnot.getCurveIn() instanceof Vector2D)) {
                        str = "C " + ((Vector2D) cBKnot2.getCurveOut()).getX() + " " + ((Vector2D) cBKnot2.getCurveOut()).getY() + str3 + ((Vector2D) cBKnot.getCurveIn()).getX() + " " + ((Vector2D) cBKnot.getCurveIn()).getY() + str3 + cBKnot.getP().getX() + " " + cBKnot.getP().getY();
                    } else if (Intrinsics.areEqual(cBKnot2.getCurveOut(), none) && (cBKnot.getCurveIn() instanceof Vector2D)) {
                        str = "C " + cBKnot2.getP().getX() + " " + cBKnot2.getP().getY() + str3 + ((Vector2D) cBKnot.getCurveIn()).getX() + " " + ((Vector2D) cBKnot.getCurveIn()).getY() + str3 + cBKnot.getP().getX() + " " + cBKnot.getP().getY();
                    } else {
                        if (!(cBKnot2.getCurveOut() instanceof Vector2D) || !Intrinsics.areEqual(cBKnot.getCurveIn(), none)) {
                            throw new IllegalStateException();
                        }
                        str = "C " + ((Vector2D) cBKnot2.getCurveOut()).getX() + " " + ((Vector2D) cBKnot2.getCurveOut()).getY() + str3 + cBKnot.getP().getX() + " " + cBKnot.getP().getY() + str3 + cBKnot.getP().getX() + " " + cBKnot.getP().getY();
                    }
                }
                str2 = ((Object) str2) + str;
                i2 = i3;
            }
        }
        if (!cubicBSpline.getClosed()) {
            return str2;
        }
        return ((Object) str2) + "Z";
    }

    public static final CBKnot valueAtTime(KeyableCBKnot keyableCBKnot, float f3) {
        Intrinsics.checkNotNullParameter(keyableCBKnot, "<this>");
        Vector2D vector2D = (Vector2D) KeyableKt.valueAtTime(keyableCBKnot.getP(), f3);
        return new CBKnot(vector2D, GeometryKt.plus(KeyableKt.optionalValueAtTime(keyableCBKnot.getCurveIn(), f3), vector2D), GeometryKt.plus(KeyableKt.optionalValueAtTime(keyableCBKnot.getCurveOut(), f3), vector2D));
    }

    public static final CompoundCubicBSpline centeredAtOrigin(CompoundCubicBSpline compoundCubicBSpline) {
        Intrinsics.checkNotNullParameter(compoundCubicBSpline, "<this>");
        return minus(compoundCubicBSpline, knotBounds(compoundCubicBSpline).getCenter());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final CompoundCubicBSpline compoundCubicBSplineFromSVGPath(String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        final ArrayList arrayList = new ArrayList();
        HI0.K k2 = new HI0.K(new HI0.fg() { // from class: com.alightcreative.app.motion.scene.CubicBSplineKt$compoundCubicBSplineFromSVGPath$$inlined$boundaryChecker$1
            @Override // HI0.fg
            public boolean isBoundary(char first, char next) {
                boolean z2;
                boolean z3;
                if (CharsKt.isWhitespace(first) == CharsKt.isWhitespace(next) && (Character.isLetter(first) == Character.isLetter(next) || first == 'E' || first == 'e' || next == 'E' || next == 'e')) {
                    if (!Character.isDigit(first) && first != '.' && first != '-' && first != 'E' && first != 'e') {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (!Character.isDigit(next) && next != '.' && next != '-' && next != 'E' && next != 'e') {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (z2 == z3) {
                        return false;
                    }
                }
                return true;
            }
        }, null, 2, 0 == true ? 1 : 0);
        arrayList.clear();
        final ArrayList arrayList2 = new ArrayList();
        AbstractC1373p.n(k2, path, new Function2() { // from class: com.alightcreative.app.motion.scene.aC
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return CubicBSplineKt.compoundCubicBSplineFromSVGPath$lambda$48(arrayList, arrayList2, (HI0.psW) obj, (String) obj2);
            }
        });
        if (!arrayList.isEmpty()) {
            compoundCubicBSplineFromSVGPath$linkKnotEndsIfNeeded(arrayList);
            arrayList2.add(new CubicBSpline(CollectionsKt.toList(arrayList), false, false, 4, null));
            arrayList.clear();
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add(CubicBSpline.INSTANCE.getEMPTY());
        }
        return new CompoundCubicBSpline(arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
    
        if (r22.equals("M") != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d0, code lost:
    
        if (r22.equals("ZM") != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d6, code lost:
    
        if (r19.isEmpty() != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d8, code lost:
    
        compoundCubicBSplineFromSVGPath$linkKnotEndsIfNeeded(r19);
        r20.add(new com.alightcreative.app.motion.scene.CubicBSpline(kotlin.collections.CollectionsKt.toList(r19), false, false, 4, null));
        r19.clear();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f1, code lost:
    
        r1 = r21.Uo(2, ',');
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f5, code lost:
    
        if (r1 == null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f7, code lost:
    
        r2 = ((java.lang.Number) r1.get(0)).floatValue();
        r1 = ((java.lang.Number) r1.get(1)).floatValue();
        r3 = com.alightcreative.app.motion.scene.OptionalVector2D.NONE.INSTANCE;
        r19.add(new com.alightcreative.app.motion.scene.CBKnot(new com.alightcreative.app.motion.scene.Vector2D(r2, r1), r3, r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0127, code lost:
    
        throw new com.alightcreative.app.motion.scene.serializer.MalformedSceneException("Path 'M' command has wrong number of parameters", null, false, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x012e, code lost:
    
        if (r22.equals("z") != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0135, code lost:
    
        if (r22.equals("Z") != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x013b, code lost:
    
        if (r19.isEmpty() != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x013d, code lost:
    
        compoundCubicBSplineFromSVGPath$linkKnotEndsIfNeeded(r19);
        r20.add(new com.alightcreative.app.motion.scene.CubicBSpline(kotlin.collections.CollectionsKt.toList(r19), true, false, 4, null));
        r19.clear();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0160, code lost:
    
        throw new com.alightcreative.app.motion.scene.serializer.MalformedSceneException("Only supports 'Z' at end of contour", null, false, 6, null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit compoundCubicBSplineFromSVGPath$lambda$48(List list, List list2, HI0.psW parse, String token) throws MalformedSceneException {
        Intrinsics.checkNotNullParameter(parse, "$this$parse");
        Intrinsics.checkNotNullParameter(token, "token");
        boolean z2 = parse.O() || Intrinsics.areEqual(parse.xMQ(), "M") || Intrinsics.areEqual(token, "Z");
        int iHashCode = token.hashCode();
        if (iHashCode != 67) {
            if (iHashCode != 90) {
                if (iHashCode != 122) {
                    if (iHashCode != 2867) {
                        if (iHashCode != 76) {
                            if (iHashCode == 77) {
                            }
                        } else if (token.equals("L")) {
                            if (list.isEmpty()) {
                                throw new MalformedSceneException("Expected 'M' at beginning of contour", null, false, 6, null);
                            }
                            List listUo = parse.Uo(2, ',');
                            if (listUo == null) {
                                throw new MalformedSceneException("Path 'L' command has wrong number of parameters", null, false, 6, null);
                            }
                            Vector2D vector2D = new Vector2D(((Number) listUo.get(0)).floatValue(), ((Number) listUo.get(1)).floatValue());
                            if (!z2 || ((((CBKnot) list.get(0)).getCurveIn() instanceof Vector2D) && !Intrinsics.areEqual(((CBKnot) list.get(0)).getP(), vector2D))) {
                                OptionalVector2D.NONE none = OptionalVector2D.NONE.INSTANCE;
                                list.add(new CBKnot(vector2D, none, none));
                            }
                        }
                    }
                }
                throw new MalformedSceneException("Unexpected token '" + token + "' in path", null, false, 6, null);
            }
            return Unit.INSTANCE;
        }
        if (token.equals("C")) {
            if (list.isEmpty()) {
                throw new MalformedSceneException("Expected 'M' at beginning of contour", null, false, 6, null);
            }
            List listUo2 = parse.Uo(2, ',');
            if (listUo2 == null) {
                throw new MalformedSceneException("Path 'C' command has wrong number of parameters", null, false, 6, null);
            }
            float fFloatValue = ((Number) listUo2.get(0)).floatValue();
            float fFloatValue2 = ((Number) listUo2.get(1)).floatValue();
            parse.KN(',');
            List listUo3 = parse.Uo(2, ',');
            if (listUo3 == null) {
                throw new MalformedSceneException("Path 'C' command has wrong number of parameters", null, false, 6, null);
            }
            float fFloatValue3 = ((Number) listUo3.get(0)).floatValue();
            float fFloatValue4 = ((Number) listUo3.get(1)).floatValue();
            parse.KN(',');
            List listUo4 = parse.Uo(2, ',');
            if (listUo4 == null) {
                throw new MalformedSceneException("Path 'C' command has wrong number of parameters", null, false, 6, null);
            }
            Vector2D vector2D2 = new Vector2D(((Number) listUo4.get(0)).floatValue(), ((Number) listUo4.get(1)).floatValue());
            if (!Intrinsics.areEqual(((CBKnot) list.get(list.size() - 1)).getP(), new Vector2D(fFloatValue, fFloatValue2))) {
                list.set(list.size() - 1, withOutPoint((CBKnot) list.get(list.size() - 1), fFloatValue, fFloatValue2));
            }
            if (!z2 || !Intrinsics.areEqual(((CBKnot) CollectionsKt.first(list)).getP(), vector2D2)) {
                list.add(new CBKnot(vector2D2, Intrinsics.areEqual(vector2D2, new Vector2D(fFloatValue3, fFloatValue4)) ? OptionalVector2D.NONE.INSTANCE : new Vector2D(fFloatValue3, fFloatValue4), OptionalVector2D.NONE.INSTANCE));
            } else if (!Intrinsics.areEqual(((CBKnot) CollectionsKt.first(list)).getP(), new Vector2D(fFloatValue3, fFloatValue4))) {
                list.set(0, withInPoint((CBKnot) list.get(0), fFloatValue3, fFloatValue4));
            }
            return Unit.INSTANCE;
        }
        throw new MalformedSceneException("Unexpected token '" + token + "' in path", null, false, 6, null);
    }

    public static final KeyableCompoundCubicBSpline copyUpdatingContour(KeyableCompoundCubicBSpline keyableCompoundCubicBSpline, int i2, Function1<? super KeyableCubicBSpline, KeyableCubicBSpline> updater) {
        Intrinsics.checkNotNullParameter(keyableCompoundCubicBSpline, "<this>");
        Intrinsics.checkNotNullParameter(updater, "updater");
        return keyableCompoundCubicBSpline.copy(HI0.rv6.t(keyableCompoundCubicBSpline.getContours(), i2, updater.invoke(keyableCompoundCubicBSpline.getContours().get(i2))));
    }

    public static final CubicBSpline cubicBSplineFromPoints(CBKnot[] knots, boolean z2) {
        Intrinsics.checkNotNullParameter(knots, "knots");
        return new CubicBSpline(ArraysKt.toList(knots), z2, false, 4, null);
    }

    public static /* synthetic */ CubicBSpline cubicBSplineFromPoints$default(CBKnot[] cBKnotArr, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = true;
        }
        return cubicBSplineFromPoints(cBKnotArr, z2);
    }

    public static final CompoundCubicBSpline cubicBSplineFromSVGAuto(String svg, boolean z2) throws MalformedSceneException {
        Intrinsics.checkNotNullParameter(svg, "svg");
        char cFirst = StringsKt.first(StringsKt.trim((CharSequence) svg).toString());
        if (!Character.isLetter(cFirst)) {
            if (Character.isDigit(cFirst)) {
                return toCompound(cubicBSplineFromSVGPolygon(svg, z2));
            }
            throw new MalformedSceneException(null, null, false, 7, null);
        }
        CompoundCubicBSpline compoundCubicBSplineCompoundCubicBSplineFromSVGPath = compoundCubicBSplineFromSVGPath(svg);
        List<CubicBSpline> contours = compoundCubicBSplineCompoundCubicBSplineFromSVGPath.getContours();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(contours, 10));
        int i2 = 0;
        for (Object obj : contours) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            arrayList.add(CubicBSpline.copy$default((CubicBSpline) obj, null, false, i2 > 0, 3, null));
            i2 = i3;
        }
        return compoundCubicBSplineCompoundCubicBSplineFromSVGPath.copy(arrayList);
    }

    public static /* synthetic */ CompoundCubicBSpline cubicBSplineFromSVGAuto$default(String str, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = true;
        }
        return cubicBSplineFromSVGAuto(str, z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final CubicBSpline cubicBSplineFromSVGPath(String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        final ArrayList arrayList = new ArrayList();
        HI0.K k2 = new HI0.K(new HI0.fg() { // from class: com.alightcreative.app.motion.scene.CubicBSplineKt$cubicBSplineFromSVGPath$$inlined$boundaryChecker$1
            @Override // HI0.fg
            public boolean isBoundary(char first, char next) {
                boolean z2;
                boolean z3;
                if (CharsKt.isWhitespace(first) == CharsKt.isWhitespace(next) && (Character.isLetter(first) == Character.isLetter(next) || first == 'E' || first == 'e' || next == 'E' || next == 'e')) {
                    if (!Character.isDigit(first) && first != '.' && first != '-' && first != 'E' && first != 'e') {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (!Character.isDigit(next) && next != '.' && next != '-' && next != 'E' && next != 'e') {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (z2 == z3) {
                        return false;
                    }
                }
                return true;
            }
        }, null, 2, 0 == true ? 1 : 0);
        arrayList.clear();
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        AbstractC1373p.n(k2, path, new Function2() { // from class: com.alightcreative.app.motion.scene.Dsr
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return CubicBSplineKt.cubicBSplineFromSVGPath$lambda$46(arrayList, booleanRef, (HI0.psW) obj, (String) obj2);
            }
        });
        if (arrayList.size() > 2 && Intrinsics.areEqual(((CBKnot) CollectionsKt.first((List) arrayList)).getP(), ((CBKnot) CollectionsKt.last((List) arrayList)).getP())) {
            CBKnot cBKnot = (CBKnot) CollectionsKt.last((List) arrayList);
            CBKnot cBKnot2 = (CBKnot) CollectionsKt.first((List) arrayList);
            OptionalVector2D curveOut = cBKnot.getCurveOut();
            OptionalVector2D.NONE none = OptionalVector2D.NONE.INSTANCE;
            if (Intrinsics.areEqual(curveOut, none) && !Intrinsics.areEqual(cBKnot.getCurveIn(), none) && Intrinsics.areEqual(cBKnot2.getCurveIn(), none)) {
                arrayList.set(0, CBKnot.copy$default((CBKnot) arrayList.get(0), null, cBKnot.getCurveIn(), null, 5, null));
                arrayList.remove(CollectionsKt.getLastIndex(arrayList));
            } else if (Intrinsics.areEqual(cBKnot.getCurveIn(), cBKnot2.getCurveIn()) && Intrinsics.areEqual(cBKnot.getCurveOut(), cBKnot2.getCurveOut())) {
                arrayList.remove(CollectionsKt.getLastIndex(arrayList));
            }
        }
        return new CubicBSpline(arrayList, booleanRef.element, false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f3, code lost:
    
        if (r15.equals("z") != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00fc, code lost:
    
        if (r15.equals("Z") != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0102, code lost:
    
        if (r14.O() == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0104, code lost:
    
        r13.element = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0113, code lost:
    
        throw new com.alightcreative.app.motion.scene.serializer.MalformedSceneException("Only supports 'Z' at end of path", null, false, 6, null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit cubicBSplineFromSVGPath$lambda$46(List list, Ref.BooleanRef booleanRef, HI0.psW parse, String token) throws MalformedSceneException {
        CBKnot cBKnot;
        Intrinsics.checkNotNullParameter(parse, "$this$parse");
        Intrinsics.checkNotNullParameter(token, "token");
        int iHashCode = token.hashCode();
        if (iHashCode != 67) {
            if (iHashCode != 90) {
                if (iHashCode != 122) {
                    if (iHashCode != 76) {
                        if (iHashCode == 77 && token.equals("M")) {
                            if (!parse.nr()) {
                                throw new MalformedSceneException("Expected 'M' only at beginning of path", null, false, 6, null);
                            }
                            List listUo = parse.Uo(2, ',');
                            if (listUo == null) {
                                throw new MalformedSceneException("Path 'M' command has wrong number of parameters", null, false, 6, null);
                            }
                            float fFloatValue = ((Number) listUo.get(0)).floatValue();
                            float fFloatValue2 = ((Number) listUo.get(1)).floatValue();
                            OptionalVector2D.NONE none = OptionalVector2D.NONE.INSTANCE;
                            list.add(new CBKnot(new Vector2D(fFloatValue, fFloatValue2), none, none));
                        }
                    } else if (token.equals("L")) {
                        if (parse.nr()) {
                            throw new MalformedSceneException("Expected 'M' at beginning of path", null, false, 6, null);
                        }
                        List listUo2 = parse.Uo(2, ',');
                        if (listUo2 == null) {
                            throw new MalformedSceneException("Path 'L' command has wrong number of parameters", null, false, 6, null);
                        }
                        Vector2D vector2D = new Vector2D(((Number) listUo2.get(0)).floatValue(), ((Number) listUo2.get(1)).floatValue());
                        if (!parse.O() || ((((CBKnot) list.get(0)).getCurveIn() instanceof Vector2D) && !Intrinsics.areEqual(((CBKnot) list.get(0)).getP(), vector2D))) {
                            OptionalVector2D.NONE none2 = OptionalVector2D.NONE.INSTANCE;
                            list.add(new CBKnot(vector2D, none2, none2));
                        }
                    }
                }
                throw new MalformedSceneException("Unexpected token '" + token + "' in path", null, false, 6, null);
            }
            return Unit.INSTANCE;
        }
        if (token.equals("C")) {
            if (parse.nr()) {
                throw new MalformedSceneException("Expected 'M' at beginning of path", null, false, 6, null);
            }
            List listUo3 = parse.Uo(2, ',');
            if (listUo3 == null) {
                throw new MalformedSceneException("Path 'C' command has wrong number of parameters", null, false, 6, null);
            }
            float fFloatValue3 = ((Number) listUo3.get(0)).floatValue();
            float fFloatValue4 = ((Number) listUo3.get(1)).floatValue();
            parse.KN(',');
            List listUo4 = parse.Uo(2, ',');
            if (listUo4 == null) {
                throw new MalformedSceneException("Path 'C' command has wrong number of parameters", null, false, 6, null);
            }
            float fFloatValue5 = ((Number) listUo4.get(0)).floatValue();
            float fFloatValue6 = ((Number) listUo4.get(1)).floatValue();
            parse.KN(',');
            List listUo5 = parse.Uo(2, ',');
            if (listUo5 == null) {
                throw new MalformedSceneException("Path 'C' command has wrong number of parameters", null, false, 6, null);
            }
            Vector2D vector2D2 = new Vector2D(((Number) listUo5.get(0)).floatValue(), ((Number) listUo5.get(1)).floatValue());
            if (!Intrinsics.areEqual(((CBKnot) list.get(list.size() - 1)).getP(), new Vector2D(fFloatValue3, fFloatValue4))) {
                list.set(list.size() - 1, withOutPoint((CBKnot) list.get(list.size() - 1), fFloatValue3, fFloatValue4));
            }
            if (!parse.O() || !Intrinsics.areEqual(((CBKnot) CollectionsKt.first(list)).getP(), vector2D2)) {
                if (Intrinsics.areEqual(vector2D2, new Vector2D(fFloatValue5, fFloatValue6))) {
                    OptionalVector2D.NONE none3 = OptionalVector2D.NONE.INSTANCE;
                    cBKnot = new CBKnot(vector2D2, none3, none3);
                } else {
                    cBKnot = new CBKnot(vector2D2, new Vector2D(fFloatValue5, fFloatValue6), OptionalVector2D.NONE.INSTANCE);
                }
                list.add(cBKnot);
            } else if (!Intrinsics.areEqual(((CBKnot) CollectionsKt.first(list)).getP(), new Vector2D(fFloatValue5, fFloatValue6))) {
                list.set(0, withInPoint((CBKnot) list.get(0), fFloatValue5, fFloatValue6));
            }
            return Unit.INSTANCE;
        }
        throw new MalformedSceneException("Unexpected token '" + token + "' in path", null, false, 6, null);
    }

    public static final CubicBSpline cubicBSplineFromSVGPolygon(String polygon, boolean z2) {
        Intrinsics.checkNotNullParameter(polygon, "polygon");
        return new CubicBSpline(SequencesKt.toList(SequencesKt.chunked(SequencesKt.mapNotNull(StringsKt.splitToSequence$default((CharSequence) polygon, new char[]{',', ' ', '\t', '\n', '\r'}, false, 0, 6, (Object) null), new Function1() { // from class: com.alightcreative.app.motion.scene.Ml
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CubicBSplineKt.cubicBSplineFromSVGPolygon$lambda$43((String) obj);
            }
        }), 2, new Function1() { // from class: com.alightcreative.app.motion.scene.I28
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CubicBSplineKt.cubicBSplineFromSVGPolygon$lambda$44((List) obj);
            }
        })), z2, false, 4, null);
    }

    public static /* synthetic */ CubicBSpline cubicBSplineFromSVGPolygon$default(String str, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = true;
        }
        return cubicBSplineFromSVGPolygon(str, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Float cubicBSplineFromSVGPolygon$lambda$43(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return StringsKt.toFloatOrNull(StringsKt.trim((CharSequence) it).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CBKnot cubicBSplineFromSVGPolygon$lambda$44(List list) {
        Intrinsics.checkNotNullParameter(list, "<destruct>");
        return new CBKnot(new Vector2D(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue()), null, null, 6, null);
    }

    public static final CompoundCubicBSpline fitIn(CompoundCubicBSpline compoundCubicBSpline, int i2, int i3) {
        Intrinsics.checkNotNullParameter(compoundCubicBSpline, "<this>");
        return fitIn(compoundCubicBSpline, i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String fitIn$lambda$23(float f3, float f4, Rectangle rectangle, float f5) {
        return "CubicBSpline.fitIn(" + f3 + ", " + f4 + ") -> bbox=" + rectangle + " scale=" + f5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String fitIn$lambda$24(float f3, float f4, Rectangle rectangle, float f5) {
        return "CubicBSpline.fitIn(" + f3 + ", " + f4 + ") -> bbox=" + rectangle + " scale=" + f5;
    }

    public static final float fitInScale(CubicBSpline cubicBSpline, final float f3, final float f4) {
        Intrinsics.checkNotNullParameter(cubicBSpline, "<this>");
        Rectangle.Companion companion = Rectangle.INSTANCE;
        List<CBKnot> knots = cubicBSpline.getKnots();
        ArrayList arrayList = new ArrayList();
        for (CBKnot cBKnot : knots) {
            CollectionsKt.addAll(arrayList, CollectionsKt.listOf((Object[]) new Vector2D[]{cBKnot.getP(), GeometryKt.orNull(cBKnot.getCurveIn()), GeometryKt.orNull(cBKnot.getCurveOut())}));
        }
        final Rectangle rectangleEnclosing = companion.enclosing(CollectionsKt.filterNotNull(arrayList));
        final float fMin = Math.min(f3 / rectangleEnclosing.getWidth(), f4 / rectangleEnclosing.getHeight());
        XoT.C.Uo(cubicBSpline, new Function0() { // from class: com.alightcreative.app.motion.scene.CN3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CubicBSplineKt.fitInScale$lambda$26(f3, f4, rectangleEnclosing, fMin);
            }
        });
        return fMin;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String fitInScale$lambda$26(float f3, float f4, Rectangle rectangle, float f5) {
        return "CubicBSpline.fitIn(" + f3 + ", " + f4 + ") -> bbox=" + rectangle + " scale=" + f5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String fitInScale$lambda$27(float f3, float f4, Rectangle rectangle, float f5) {
        return "CubicBSpline.fitIn(" + f3 + ", " + f4 + ") -> bbox=" + rectangle + USEaHtCMH.HuMFvDWXUXdJC + f5;
    }

    public static final <T> void forEachInContext(List<? extends T> list, boolean z2, Function3<? super T, ? super T, ? super T, Unit> action) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int size = list.size();
        if (size < 1) {
            return;
        }
        int i2 = 0;
        while (i2 < size) {
            T t3 = null;
            T t4 = i2 == 0 ? z2 ? list.get(size - 1) : null : list.get(i2 - 1);
            int i3 = i2 + 1;
            if (i3 < size) {
                t3 = list.get(i3);
            } else if (z2) {
                t3 = list.get(0);
            }
            action.invoke(list.get(i2), t4, t3);
            i2 = i3;
        }
    }

    public static final <T> void forEachInContextWrap(List<? extends T> list, Function3<? super T, ? super T, ? super T, Unit> action) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int size = list.size();
        if (size < 1) {
            return;
        }
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            action.invoke(list.get(i2), list.get(i2 == 0 ? size - 1 : i2 - 1), i3 >= size ? list.get(0) : list.get(i3));
            i2 = i3;
        }
    }

    public static final KeyableCubicBSpline keyable(CubicBSpline cubicBSpline) {
        Intrinsics.checkNotNullParameter(cubicBSpline, "<this>");
        List<CBKnot> knots = cubicBSpline.getKnots();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(knots, 10));
        Iterator<T> it = knots.iterator();
        while (it.hasNext()) {
            arrayList.add(keyable((CBKnot) it.next()));
        }
        return new KeyableCubicBSpline(arrayList, cubicBSpline.getClosed(), cubicBSpline.getExclude());
    }

    public static final CBSegment segmentBetween(KeyableCBKnot a2, KeyableCBKnot b2, float f3) {
        Intrinsics.checkNotNullParameter(a2, "a");
        Intrinsics.checkNotNullParameter(b2, "b");
        Vector2D vector2D = (Vector2D) KeyableKt.valueAtTime(a2.getP(), f3);
        OptionalVector2D optionalVector2DOptionalValueAtTime = KeyableKt.optionalValueAtTime(a2.getCurveOut(), f3);
        Vector2D.Companion companion = Vector2D.INSTANCE;
        return new CBSegment(vector2D, GeometryKt.plus(GeometryKt.orElse(optionalVector2DOptionalValueAtTime, companion.getZERO()), (Vector2D) KeyableKt.valueAtTime(a2.getP(), f3)), GeometryKt.plus(GeometryKt.orElse(KeyableKt.optionalValueAtTime(b2.getCurveIn(), f3), companion.getZERO()), (Vector2D) KeyableKt.valueAtTime(b2.getP(), f3)), (Vector2D) KeyableKt.valueAtTime(b2.getP(), f3));
    }

    public static final Pair<CBSegment, CBSegment> splitCubicBezierSegment(float f3, CBSegment segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        float x2 = segment.getP1().getX();
        float y2 = segment.getP1().getY();
        float x3 = segment.getP2().getX();
        float y3 = segment.getP2().getY();
        float x4 = segment.getP3().getX();
        float y4 = segment.getP3().getY();
        float x5 = segment.getP4().getX();
        float y5 = segment.getP4().getY();
        float f4 = ((x3 - x2) * f3) + x2;
        float f5 = ((y3 - y2) * f3) + y2;
        float f6 = ((x4 - x3) * f3) + x3;
        float f7 = ((y4 - y3) * f3) + y3;
        float f8 = ((x5 - x4) * f3) + x4;
        float f9 = ((y5 - y4) * f3) + y4;
        float f10 = ((f6 - f4) * f3) + f4;
        float f11 = ((f7 - f5) * f3) + f5;
        float f12 = ((f8 - f6) * f3) + f6;
        float f13 = ((f9 - f7) * f3) + f7;
        float f14 = ((f12 - f10) * f3) + f10;
        float f15 = ((f13 - f11) * f3) + f11;
        return new Pair<>(new CBSegment(x2, y2, f4, f5, f10, f11, f14, f15), new CBSegment(f14, f15, f12, f13, f8, f9, x5, y5));
    }

    public static final CBKnot times(CBKnot cBKnot, Vector2D other) {
        OptionalVector2D optionalVector2DTimes;
        OptionalVector2D optionalVector2DTimes2;
        Intrinsics.checkNotNullParameter(cBKnot, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Vector2D vector2DTimes = GeometryKt.times(cBKnot.getP(), other);
        OptionalVector2D curveIn = cBKnot.getCurveIn();
        if (curveIn instanceof Vector2D) {
            optionalVector2DTimes = GeometryKt.times((Vector2D) cBKnot.getCurveIn(), other);
        } else {
            OptionalVector2D.NONE none = OptionalVector2D.NONE.INSTANCE;
            if (!Intrinsics.areEqual(curveIn, none)) {
                throw new NoWhenBranchMatchedException();
            }
            optionalVector2DTimes = none;
        }
        OptionalVector2D curveOut = cBKnot.getCurveOut();
        if (curveOut instanceof Vector2D) {
            optionalVector2DTimes2 = GeometryKt.times((Vector2D) cBKnot.getCurveOut(), other);
        } else {
            optionalVector2DTimes2 = OptionalVector2D.NONE.INSTANCE;
            if (!Intrinsics.areEqual(curveOut, optionalVector2DTimes2)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return new CBKnot(vector2DTimes, optionalVector2DTimes, optionalVector2DTimes2);
    }

    public static final CompoundCubicBSpline toCompound(CubicBSpline cubicBSpline) {
        Intrinsics.checkNotNullParameter(cubicBSpline, "<this>");
        return new CompoundCubicBSpline(CollectionsKt.listOf(cubicBSpline));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence toSVGPath$lambda$39(CubicBSpline it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return toSVGPath(it);
    }

    public static final CBKnot withInPoint(CBKnot cBKnot, float f3, float f4) {
        Intrinsics.checkNotNullParameter(cBKnot, "<this>");
        return new CBKnot(cBKnot.getP(), new Vector2D(f3, f4), cBKnot.getCurveOut());
    }

    public static final CBKnot withOutPoint(CBKnot cBKnot, float f3, float f4) {
        Intrinsics.checkNotNullParameter(cBKnot, "<this>");
        return new CBKnot(cBKnot.getP(), cBKnot.getCurveIn(), new Vector2D(f3, f4));
    }

    private static final void compoundCubicBSplineFromSVGPath$linkKnotEndsIfNeeded(List<CBKnot> list) {
        if (list.size() > 2 && Intrinsics.areEqual(((CBKnot) CollectionsKt.first((List) list)).getP(), ((CBKnot) CollectionsKt.last((List) list)).getP())) {
            CBKnot cBKnot = (CBKnot) CollectionsKt.last((List) list);
            CBKnot cBKnot2 = (CBKnot) CollectionsKt.first((List) list);
            OptionalVector2D curveOut = cBKnot.getCurveOut();
            OptionalVector2D.NONE none = OptionalVector2D.NONE.INSTANCE;
            if (Intrinsics.areEqual(curveOut, none) && !Intrinsics.areEqual(cBKnot.getCurveIn(), none) && Intrinsics.areEqual(cBKnot2.getCurveIn(), none)) {
                list.set(0, CBKnot.copy$default(list.get(0), null, cBKnot.getCurveIn(), null, 5, null));
                list.remove(CollectionsKt.getLastIndex(list));
            } else if (Intrinsics.areEqual(cBKnot.getCurveIn(), cBKnot2.getCurveIn()) && Intrinsics.areEqual(cBKnot.getCurveOut(), cBKnot2.getCurveOut())) {
                list.remove(CollectionsKt.getLastIndex(list));
            }
        }
    }

    public static final CubicBSpline fitIn(CubicBSpline cubicBSpline, final float f3, final float f4) {
        Intrinsics.checkNotNullParameter(cubicBSpline, "<this>");
        Rectangle.Companion companion = Rectangle.INSTANCE;
        List<CBKnot> knots = cubicBSpline.getKnots();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(knots, 10));
        Iterator<T> it = knots.iterator();
        while (it.hasNext()) {
            arrayList.add(((CBKnot) it.next()).getP());
        }
        final Rectangle rectangleEnclosing = companion.enclosing(arrayList);
        final float fMin = Math.min(f3 / rectangleEnclosing.getWidth(), f4 / rectangleEnclosing.getHeight());
        XoT.C.Uo(cubicBSpline, new Function0() { // from class: com.alightcreative.app.motion.scene.fuX
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CubicBSplineKt.fitIn$lambda$23(f3, f4, rectangleEnclosing, fMin);
            }
        });
        return times(cubicBSpline, fMin);
    }

    public static final boolean getKeyed(KeyableCompoundCubicBSpline keyableCompoundCubicBSpline) {
        Intrinsics.checkNotNullParameter(keyableCompoundCubicBSpline, "<this>");
        List<KeyableCubicBSpline> contours = keyableCompoundCubicBSpline.getContours();
        if (contours != null && contours.isEmpty()) {
            return false;
        }
        Iterator<T> it = contours.iterator();
        while (it.hasNext()) {
            if (getKeyed((KeyableCubicBSpline) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static final Object get(KeyableCBKnot keyableCBKnot, ControlHandle handle) {
        Intrinsics.checkNotNullParameter(keyableCBKnot, "<this>");
        Intrinsics.checkNotNullParameter(handle, "handle");
        int i2 = WhenMappings.$EnumSwitchMapping$0[handle.ordinal()];
        if (i2 == 1) {
            return keyableCBKnot.getCurveIn();
        }
        if (i2 == 2) {
            return keyableCBKnot.getP();
        }
        if (i2 == 3) {
            return keyableCBKnot.getCurveOut();
        }
        if (i2 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        throw new UnsupportedOperationException();
    }

    public static final CubicBSpline valueAtTime(KeyableCubicBSpline keyableCubicBSpline, float f3) {
        Intrinsics.checkNotNullParameter(keyableCubicBSpline, "<this>");
        List<KeyableCBKnot> knots = keyableCubicBSpline.getKnots();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(knots, 10));
        Iterator<T> it = knots.iterator();
        while (it.hasNext()) {
            arrayList.add(valueAtTime((KeyableCBKnot) it.next(), f3));
        }
        return new CubicBSpline(arrayList, keyableCubicBSpline.getClosed(), keyableCubicBSpline.getExclude());
    }

    public static final Rectangle getBounds(CompoundCubicBSpline compoundCubicBSpline) {
        Intrinsics.checkNotNullParameter(compoundCubicBSpline, "<this>");
        WeakHashMap<CompoundCubicBSpline, Rectangle> weakHashMap = compoundBoundsCache;
        Rectangle rectangle = weakHashMap.get(compoundCubicBSpline);
        if (rectangle == null) {
            RectF rectF = new RectF();
            toPath(compoundCubicBSpline).t().computeBounds(rectF, true);
            rectangle = GeometryKt.toRectangle(rectF);
            weakHashMap.put(compoundCubicBSpline, rectangle);
        }
        Intrinsics.checkNotNullExpressionValue(rectangle, "getOrPut(...)");
        return rectangle;
    }

    public static final Rectangle knotBounds(CompoundCubicBSpline compoundCubicBSpline) {
        Intrinsics.checkNotNullParameter(compoundCubicBSpline, "<this>");
        Rectangle.Companion companion = Rectangle.INSTANCE;
        List<CubicBSpline> contours = compoundCubicBSpline.getContours();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = contours.iterator();
        while (it.hasNext()) {
            List<CBKnot> knots = ((CubicBSpline) it.next()).getKnots();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(knots, 10));
            Iterator<T> it2 = knots.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((CBKnot) it2.next()).getP());
            }
            CollectionsKt.addAll(arrayList, arrayList2);
        }
        return companion.enclosing(arrayList);
    }

    public static final KeyableCompoundCubicBSpline keyable(CompoundCubicBSpline compoundCubicBSpline) {
        Intrinsics.checkNotNullParameter(compoundCubicBSpline, "<this>");
        List<CubicBSpline> contours = compoundCubicBSpline.getContours();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(contours, 10));
        Iterator<T> it = contours.iterator();
        while (it.hasNext()) {
            arrayList.add(keyable((CubicBSpline) it.next()));
        }
        return new KeyableCompoundCubicBSpline(arrayList);
    }

    public static final float fitInScale(CompoundCubicBSpline compoundCubicBSpline, int i2, int i3) {
        Intrinsics.checkNotNullParameter(compoundCubicBSpline, "<this>");
        return fitInScale(compoundCubicBSpline, i2, i3);
    }

    public static final float fitInScale(CompoundCubicBSpline compoundCubicBSpline, final float f3, final float f4) {
        Intrinsics.checkNotNullParameter(compoundCubicBSpline, "<this>");
        final Rectangle rectangleKnotBounds = knotBounds(compoundCubicBSpline);
        final float fMin = Math.min(f3 / rectangleKnotBounds.getWidth(), f4 / rectangleKnotBounds.getHeight());
        XoT.C.Uo(compoundCubicBSpline, new Function0() { // from class: com.alightcreative.app.motion.scene.n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CubicBSplineKt.fitInScale$lambda$27(f3, f4, rectangleKnotBounds, fMin);
            }
        });
        return fMin;
    }

    public static final CubicBSpline minus(CubicBSpline cubicBSpline, Vector2D offset) {
        Intrinsics.checkNotNullParameter(cubicBSpline, "<this>");
        Intrinsics.checkNotNullParameter(offset, "offset");
        List<CBKnot> knots = cubicBSpline.getKnots();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(knots, 10));
        Iterator<T> it = knots.iterator();
        while (it.hasNext()) {
            arrayList.add(minus((CBKnot) it.next(), offset));
        }
        return CubicBSpline.copy$default(cubicBSpline, arrayList, false, false, 6, null);
    }

    public static final CubicBSpline plus(CubicBSpline cubicBSpline, Vector2D offset) {
        Intrinsics.checkNotNullParameter(cubicBSpline, "<this>");
        Intrinsics.checkNotNullParameter(offset, "offset");
        List<CBKnot> knots = cubicBSpline.getKnots();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(knots, 10));
        Iterator<T> it = knots.iterator();
        while (it.hasNext()) {
            arrayList.add(plus((CBKnot) it.next(), offset));
        }
        return CubicBSpline.copy$default(cubicBSpline, arrayList, false, false, 6, null);
    }

    public static final CubicBSpline rot(CubicBSpline cubicBSpline, float f3) {
        Intrinsics.checkNotNullParameter(cubicBSpline, "<this>");
        if (Math.abs(f3) < 1.0E-5f) {
            return cubicBSpline;
        }
        List<CBKnot> knots = cubicBSpline.getKnots();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(knots, 10));
        Iterator<T> it = knots.iterator();
        while (it.hasNext()) {
            arrayList.add(rot((CBKnot) it.next(), f3));
        }
        return CubicBSpline.copy$default(cubicBSpline, arrayList, false, false, 6, null);
    }

    public static final CompoundCubicBSpline fitIn(CompoundCubicBSpline compoundCubicBSpline, final float f3, final float f4) {
        Intrinsics.checkNotNullParameter(compoundCubicBSpline, "<this>");
        final Rectangle rectangleKnotBounds = knotBounds(compoundCubicBSpline);
        final float fMin = Math.min(f3 / rectangleKnotBounds.getWidth(), f4 / rectangleKnotBounds.getHeight());
        XoT.C.Uo(compoundCubicBSpline, new Function0() { // from class: com.alightcreative.app.motion.scene.Wre
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CubicBSplineKt.fitIn$lambda$24(f3, f4, rectangleKnotBounds, fMin);
            }
        });
        return times(compoundCubicBSpline, fMin);
    }

    public static final CBKnot times(CBKnot cBKnot, Matrix other) {
        OptionalVector2D optionalVector2DTimes;
        OptionalVector2D optionalVector2DTimes2;
        Intrinsics.checkNotNullParameter(cBKnot, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Vector2D vector2DTimes = GeometryKt.times(cBKnot.getP(), other);
        OptionalVector2D curveIn = cBKnot.getCurveIn();
        if (curveIn instanceof Vector2D) {
            optionalVector2DTimes = GeometryKt.times((Vector2D) cBKnot.getCurveIn(), other);
        } else {
            OptionalVector2D.NONE none = OptionalVector2D.NONE.INSTANCE;
            if (!Intrinsics.areEqual(curveIn, none)) {
                throw new NoWhenBranchMatchedException();
            }
            optionalVector2DTimes = none;
        }
        OptionalVector2D curveOut = cBKnot.getCurveOut();
        if (curveOut instanceof Vector2D) {
            optionalVector2DTimes2 = GeometryKt.times((Vector2D) cBKnot.getCurveOut(), other);
        } else {
            optionalVector2DTimes2 = OptionalVector2D.NONE.INSTANCE;
            if (!Intrinsics.areEqual(curveOut, optionalVector2DTimes2)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return new CBKnot(vector2DTimes, optionalVector2DTimes, optionalVector2DTimes2);
    }

    public static final CompoundCubicBSpline valueAtTime(KeyableCompoundCubicBSpline keyableCompoundCubicBSpline, float f3) {
        Intrinsics.checkNotNullParameter(keyableCompoundCubicBSpline, "<this>");
        List<KeyableCubicBSpline> contours = keyableCompoundCubicBSpline.getContours();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(contours, 10));
        Iterator<T> it = contours.iterator();
        while (it.hasNext()) {
            arrayList.add(valueAtTime((KeyableCubicBSpline) it.next(), f3));
        }
        return new CompoundCubicBSpline(arrayList);
    }

    public static final C1487z toPathSegment(KeyableCubicBSpline keyableCubicBSpline, int i2, float f3) {
        Intrinsics.checkNotNullParameter(keyableCubicBSpline, "<this>");
        C1487z c1487z = new C1487z();
        if (keyableCubicBSpline.getKnots().isEmpty()) {
            return c1487z;
        }
        KeyableCBKnot keyableCBKnot = keyableCubicBSpline.getKnots().get(i2);
        KeyableCBKnot keyableCBKnot2 = keyableCubicBSpline.getKnots().get((i2 + 1) % keyableCubicBSpline.getKnots().size());
        Vector2D vector2D = (Vector2D) KeyableKt.valueAtTime(keyableCBKnot.getP(), f3);
        c1487z.Y(vector2D.getX(), vector2D.getY());
        OptionalKeyableVector2D curveOut = keyableCBKnot.getCurveOut();
        OptionalKeyableVector2D.NONE none = OptionalKeyableVector2D.NONE.INSTANCE;
        if (Intrinsics.areEqual(curveOut, none) && Intrinsics.areEqual(keyableCBKnot2.getCurveIn(), none)) {
            Vector2D vector2D2 = (Vector2D) KeyableKt.valueAtTime(keyableCBKnot2.getP(), f3);
            c1487z.J(vector2D2.getX(), vector2D2.getY());
            return c1487z;
        }
        if ((keyableCBKnot.getCurveOut() instanceof KeyableVector2D) && (keyableCBKnot2.getCurveIn() instanceof KeyableVector2D)) {
            Vector2D vector2D3 = (Vector2D) KeyableKt.valueAtTime(keyableCBKnot2.getP(), f3);
            Vector2D vector2DPlus = GeometryKt.plus((Vector2D) KeyableKt.valueAtTime((Keyable) keyableCBKnot.getCurveOut(), f3), vector2D);
            Vector2D vector2DPlus2 = GeometryKt.plus((Vector2D) KeyableKt.valueAtTime((Keyable) keyableCBKnot2.getCurveIn(), f3), vector2D3);
            c1487z.te(vector2DPlus.getX(), vector2DPlus.getY(), vector2DPlus2.getX(), vector2DPlus2.getY(), vector2D3.getX(), vector2D3.getY());
            return c1487z;
        }
        if (Intrinsics.areEqual(keyableCBKnot.getCurveOut(), none) && (keyableCBKnot2.getCurveIn() instanceof KeyableVector2D)) {
            Vector2D vector2D4 = (Vector2D) KeyableKt.valueAtTime(keyableCBKnot2.getP(), f3);
            Vector2D vector2DPlus3 = GeometryKt.plus((Vector2D) KeyableKt.valueAtTime((Keyable) keyableCBKnot2.getCurveIn(), f3), vector2D4);
            c1487z.te(vector2D.getX(), vector2D.getY(), vector2DPlus3.getX(), vector2DPlus3.getY(), vector2D4.getX(), vector2D4.getY());
            return c1487z;
        }
        if ((keyableCBKnot.getCurveOut() instanceof KeyableVector2D) && Intrinsics.areEqual(keyableCBKnot2.getCurveIn(), none)) {
            Vector2D vector2D5 = (Vector2D) KeyableKt.valueAtTime(keyableCBKnot2.getP(), f3);
            Vector2D vector2DPlus4 = GeometryKt.plus((Vector2D) KeyableKt.valueAtTime((Keyable) keyableCBKnot.getCurveOut(), f3), vector2D);
            c1487z.te(vector2DPlus4.getX(), vector2DPlus4.getY(), vector2D5.getX(), vector2D5.getY(), vector2D5.getX(), vector2D5.getY());
            return c1487z;
        }
        throw new IllegalStateException();
    }

    public static final String toSVGPath(CompoundCubicBSpline compoundCubicBSpline) {
        Intrinsics.checkNotNullParameter(compoundCubicBSpline, "<this>");
        return CollectionsKt.joinToString$default(compoundCubicBSpline.getContours(), "", null, null, 0, null, new Function1() { // from class: com.alightcreative.app.motion.scene.w6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CubicBSplineKt.toSVGPath$lambda$39((CubicBSpline) obj);
            }
        }, 30, null);
    }

    public static final CompoundCubicBSpline minus(CompoundCubicBSpline compoundCubicBSpline, Vector2D offset) {
        Intrinsics.checkNotNullParameter(compoundCubicBSpline, "<this>");
        Intrinsics.checkNotNullParameter(offset, "offset");
        List<CubicBSpline> contours = compoundCubicBSpline.getContours();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(contours, 10));
        Iterator<T> it = contours.iterator();
        while (it.hasNext()) {
            arrayList.add(minus((CubicBSpline) it.next(), offset));
        }
        return compoundCubicBSpline.copy(arrayList);
    }

    public static final CompoundCubicBSpline plus(CompoundCubicBSpline compoundCubicBSpline, Vector2D offset) {
        Intrinsics.checkNotNullParameter(compoundCubicBSpline, "<this>");
        Intrinsics.checkNotNullParameter(offset, "offset");
        List<CubicBSpline> contours = compoundCubicBSpline.getContours();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(contours, 10));
        Iterator<T> it = contours.iterator();
        while (it.hasNext()) {
            arrayList.add(plus((CubicBSpline) it.next(), offset));
        }
        return compoundCubicBSpline.copy(arrayList);
    }

    public static final CubicBSpline times(CubicBSpline cubicBSpline, Vector2D other) {
        Intrinsics.checkNotNullParameter(cubicBSpline, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        List<CBKnot> knots = cubicBSpline.getKnots();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(knots, 10));
        Iterator<T> it = knots.iterator();
        while (it.hasNext()) {
            arrayList.add(times((CBKnot) it.next(), other));
        }
        return CubicBSpline.copy$default(cubicBSpline, arrayList, false, false, 6, null);
    }

    public static final C1487z toPath(CubicBSpline cubicBSpline) {
        CBKnot cBKnot;
        Intrinsics.checkNotNullParameter(cubicBSpline, "<this>");
        C1487z c1487z = new C1487z();
        if (!cubicBSpline.getKnots().isEmpty()) {
            Vector2D p2 = ((CBKnot) CollectionsKt.first((List) cubicBSpline.getKnots())).getP();
            c1487z.Y(p2.getX(), p2.getY());
            List<CBKnot> knots = cubicBSpline.getKnots();
            boolean closed = cubicBSpline.getClosed();
            int size = knots.size();
            if (size >= 1) {
                int i2 = 0;
                while (i2 < size) {
                    CBKnot cBKnot2 = null;
                    if (i2 == 0) {
                        cBKnot = closed ? knots.get(size - 1) : null;
                    } else {
                        cBKnot = knots.get(i2 - 1);
                    }
                    int i3 = i2 + 1;
                    if (i3 < size) {
                        cBKnot2 = knots.get(i3);
                    } else if (closed) {
                        cBKnot2 = knots.get(0);
                    }
                    CBKnot cBKnot3 = cBKnot2;
                    CBKnot cBKnot4 = knots.get(i2);
                    if (cBKnot3 != null) {
                        OptionalVector2D curveOut = cBKnot4.getCurveOut();
                        OptionalVector2D.NONE none = OptionalVector2D.NONE.INSTANCE;
                        if (Intrinsics.areEqual(curveOut, none) && Intrinsics.areEqual(cBKnot3.getCurveIn(), none)) {
                            c1487z.J(cBKnot3.getP().getX(), cBKnot3.getP().getY());
                        } else if ((cBKnot4.getCurveOut() instanceof Vector2D) && (cBKnot3.getCurveIn() instanceof Vector2D)) {
                            c1487z.te(((Vector2D) cBKnot4.getCurveOut()).getX(), ((Vector2D) cBKnot4.getCurveOut()).getY(), ((Vector2D) cBKnot3.getCurveIn()).getX(), ((Vector2D) cBKnot3.getCurveIn()).getY(), cBKnot3.getP().getX(), cBKnot3.getP().getY());
                        } else if (Intrinsics.areEqual(cBKnot4.getCurveOut(), none) && (cBKnot3.getCurveIn() instanceof Vector2D)) {
                            c1487z.te(cBKnot4.getP().getX(), cBKnot4.getP().getY(), ((Vector2D) cBKnot3.getCurveIn()).getX(), ((Vector2D) cBKnot3.getCurveIn()).getY(), cBKnot3.getP().getX(), cBKnot3.getP().getY());
                        } else if ((cBKnot4.getCurveOut() instanceof Vector2D) && Intrinsics.areEqual(cBKnot3.getCurveIn(), none)) {
                            c1487z.te(((Vector2D) cBKnot4.getCurveOut()).getX(), ((Vector2D) cBKnot4.getCurveOut()).getY(), cBKnot3.getP().getX(), cBKnot3.getP().getY(), cBKnot3.getP().getX(), cBKnot3.getP().getY());
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                    i2 = i3;
                }
            }
            if (cubicBSpline.getClosed()) {
                c1487z.ViF();
            }
        }
        return c1487z;
    }

    public static final CubicBSpline times(CubicBSpline cubicBSpline, float f3) {
        Intrinsics.checkNotNullParameter(cubicBSpline, "<this>");
        List<CBKnot> knots = cubicBSpline.getKnots();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(knots, 10));
        Iterator<T> it = knots.iterator();
        while (it.hasNext()) {
            arrayList.add(times((CBKnot) it.next(), new Vector2D(f3, f3)));
        }
        return CubicBSpline.copy$default(cubicBSpline, arrayList, false, false, 6, null);
    }

    public static final CubicBSpline times(CubicBSpline cubicBSpline, Matrix other) {
        Intrinsics.checkNotNullParameter(cubicBSpline, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        List<CBKnot> knots = cubicBSpline.getKnots();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(knots, 10));
        Iterator<T> it = knots.iterator();
        while (it.hasNext()) {
            arrayList.add(times((CBKnot) it.next(), other));
        }
        return CubicBSpline.copy$default(cubicBSpline, arrayList, false, false, 6, null);
    }

    public static final CubicBSpline times(CubicBSpline cubicBSpline, Transform other) {
        Intrinsics.checkNotNullParameter(cubicBSpline, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        List<CBKnot> knots = cubicBSpline.getKnots();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(knots, 10));
        Iterator<T> it = knots.iterator();
        while (it.hasNext()) {
            arrayList.add(times((CBKnot) it.next(), other.getMatrix()));
        }
        return CubicBSpline.copy$default(cubicBSpline, arrayList, false, false, 6, null);
    }

    public static final CompoundCubicBSpline times(CompoundCubicBSpline compoundCubicBSpline, Vector2D other) {
        Intrinsics.checkNotNullParameter(compoundCubicBSpline, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        List<CubicBSpline> contours = compoundCubicBSpline.getContours();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(contours, 10));
        Iterator<T> it = contours.iterator();
        while (it.hasNext()) {
            arrayList.add(times((CubicBSpline) it.next(), other));
        }
        return compoundCubicBSpline.copy(arrayList);
    }

    public static final CompoundCubicBSpline times(CompoundCubicBSpline compoundCubicBSpline, float f3) {
        Intrinsics.checkNotNullParameter(compoundCubicBSpline, "<this>");
        List<CubicBSpline> contours = compoundCubicBSpline.getContours();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(contours, 10));
        Iterator<T> it = contours.iterator();
        while (it.hasNext()) {
            arrayList.add(times((CubicBSpline) it.next(), new Vector2D(f3, f3)));
        }
        return compoundCubicBSpline.copy(arrayList);
    }

    public static final CompoundCubicBSpline times(CompoundCubicBSpline compoundCubicBSpline, Matrix other) {
        Intrinsics.checkNotNullParameter(compoundCubicBSpline, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        List<CubicBSpline> contours = compoundCubicBSpline.getContours();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(contours, 10));
        Iterator<T> it = contours.iterator();
        while (it.hasNext()) {
            arrayList.add(times((CubicBSpline) it.next(), other));
        }
        return compoundCubicBSpline.copy(arrayList);
    }

    public static final CompoundCubicBSpline times(CompoundCubicBSpline compoundCubicBSpline, Transform other) {
        Intrinsics.checkNotNullParameter(compoundCubicBSpline, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        List<CubicBSpline> contours = compoundCubicBSpline.getContours();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(contours, 10));
        Iterator<T> it = contours.iterator();
        while (it.hasNext()) {
            arrayList.add(times((CubicBSpline) it.next(), other.getMatrix()));
        }
        return compoundCubicBSpline.copy(arrayList);
    }
}
