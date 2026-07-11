package com.alightcreative.app.motion.scene;

import android.graphics.Path;
import android.graphics.PathMeasure;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.alightcreative.app.motion.easing.CubicBezierEasing;
import com.alightcreative.app.motion.easing.Easing;
import com.alightcreative.app.motion.easing.LinearEasing;
import com.alightcreative.app.motion.scene.Keyable;
import com.alightcreative.app.motion.scene.OptionalKeyableVector2D;
import com.alightcreative.app.motion.scene.OptionalVector2D;
import com.alightcreative.app.motion.scene.animators.Animator;
import com.alightcreative.app.motion.scene.animators.AnimatorEnvironment;
import com.alightcreative.app.motion.scene.animators.AnimatorKt;
import com.caoccao.javet.values.reference.IV8ValueMap;
import com.google.android.gms.ads.RequestConfiguration;
import d.AbstractC1951j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000è\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0013\n\u0002\u0010\u0011\n\u0002\b\u0004\u001a0\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0004\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t\u001a$\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0004\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042\u0006\u0010\f\u001a\u00020\r\u001a\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011\u001a\u0012\u0010\u0017\u001a\u00020\u0018*\u00020\u00142\u0006\u0010\u0019\u001a\u00020\n\u001a6\u0010\u001a\u001a\u00020\u0014*\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\n2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\t\u001a\n\u0010!\u001a\u00020\u0014*\u00020\u0018\u001a\u0012\u0010\"\u001a\u00020#*\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\n\u001aH\u0010$\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0004\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\n2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00030\t\u001aA\u0010%\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0004\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u0002H\u0003¢\u0006\u0002\u0010&\u001a*\u0010'\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0004\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042\f\u0010(\u001a\b\u0012\u0004\u0012\u0002H\u00030)\u001a*\u0010*\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0004\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042\f\u0010(\u001a\b\u0012\u0004\u0012\u0002H\u00030)\u001a,\u0010+\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0004\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r\u001a,\u0010,\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0004\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010-\u001a\u00020\u000f\u001a4\u0010.\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0004\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\n\u001a4\u0010/\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0004\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\n\u001a4\u00100\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0004\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\n\u001a$\u00101\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0002\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042\u0006\u0010\u0019\u001a\u00020\n\u001a\u001c\u00102\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0002\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004\u001a&\u00103\u001a\n\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042\u0006\u0010\u0019\u001a\u00020\n\u001a&\u00104\u001a\n\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042\u0006\u0010\u0019\u001a\u00020\n\u001a&\u00105\u001a\n\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042\u0006\u0010\u0019\u001a\u00020\n\u001a:\u00106\u001a\u001e\u0012\f\u0012\n\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\u0002\u0012\f\u0012\n\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\u000207\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042\u0006\u0010\u0019\u001a\u00020\n\u001a&\u00108\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004*\b\u0012\u0004\u0012\u00020\u00130\u00042\u0006\u00109\u001a\u00020\n2\u0006\u0010:\u001a\u00020\n\u001a-\u00108\u001a\b\u0012\u0004\u0012\u00020;0\u0004*\b\u0012\u0004\u0012\u00020;0\u00042\u0006\u00109\u001a\u00020\n2\u0006\u0010:\u001a\u00020\nH\u0007¢\u0006\u0002\b<\u001a.\u00108\u001a\b\u0012\u0004\u0012\u00020;0\u0004*\b\u0012\u0004\u0012\u00020;0\u00042\u0006\u00109\u001a\u00020\n2\u0006\u0010:\u001a\u00020\n2\u0006\u0010=\u001a\u00020\n\u001a\u001e\u0010>\u001a\b\u0012\u0004\u0012\u00020\n0\u0004*\b\u0012\u0004\u0012\u00020\n0\u00042\u0006\u0010?\u001a\u00020\n\u001a\u001e\u0010@\u001a\b\u0012\u0004\u0012\u00020\n0\u0004*\b\u0012\u0004\u0012\u00020\n0\u00042\u0006\u0010A\u001a\u00020\n\u001a\u001e\u00108\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004*\b\u0012\u0004\u0012\u00020\u00130\u00042\u0006\u0010?\u001a\u00020\u0013\u001a\u001e\u00108\u001a\b\u0012\u0004\u0012\u00020;0\u0004*\b\u0012\u0004\u0012\u00020;0\u00042\u0006\u0010?\u001a\u00020;\u001a>\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004*\b\u0012\u0004\u0012\u00020\u00130\u00042\b\b\u0002\u0010C\u001a\u00020\n2\b\b\u0002\u0010D\u001a\u00020\n2\b\b\u0002\u0010E\u001a\u00020\n2\b\b\u0002\u0010F\u001a\u00020\n\u001a\u001e\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004*\b\u0012\u0004\u0012\u00020\u00130\u00042\u0006\u0010H\u001a\u00020\n\u001a\u0016\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004*\b\u0012\u0004\u0012\u00020\u00130\u0004\u001a\u0016\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004*\b\u0012\u0004\u0012\u00020\u00130\u0004\u001a\u0012\u0010K\u001a\u00020\u0014*\u00020\u00142\u0006\u0010H\u001a\u00020\n\u001aR\u0010B\u001a\b\u0012\u0004\u0012\u00020;0\u0004*\b\u0012\u0004\u0012\u00020;0\u00042\b\b\u0002\u0010C\u001a\u00020\n2\b\b\u0002\u0010D\u001a\u00020\n2\b\b\u0002\u0010L\u001a\u00020\n2\b\b\u0002\u0010E\u001a\u00020\n2\b\b\u0002\u0010F\u001a\u00020\n2\b\b\u0002\u0010M\u001a\u00020\n\u001a\u001a\u00108\u001a\u00020N*\u00020N2\u0006\u00109\u001a\u00020\n2\u0006\u0010:\u001a\u00020\n\u001a#\u0010O\u001a\u0002H\u0003\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042\u0006\u0010\u0019\u001a\u00020\n¢\u0006\u0002\u0010P\u001a\u0018\u0010Y\u001a\u00020\u0013*\b\u0012\u0004\u0012\u00020\u00130\u00042\u0006\u0010Z\u001a\u00020[\u001a#\u0010O\u001a\u0002H\u0003\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042\u0006\u0010Z\u001a\u00020[¢\u0006\u0002\u0010\\\u001a$\u0010]\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0004\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042\u0006\u0010^\u001a\u00020\n\u001a#\u0010_\u001a\u0002H\u0003\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042\u0006\u0010Z\u001a\u00020[¢\u0006\u0002\u0010\\\u001a\u000e\u0010!\u001a\u00020a2\u0006\u0010 \u001a\u00020\n\u001a\u000e\u0010!\u001a\u00020e2\u0006\u0010 \u001a\u00020w\u001a\u000e\u0010!\u001a\u00020N2\u0006\u0010 \u001a\u00020\u0013\u001a\u000e\u0010!\u001a\u00020p2\u0006\u0010 \u001a\u00020;\u001a\u000e\u0010!\u001a\u00020t2\u0006\u0010 \u001a\u00020x\u001a\u000e\u0010!\u001a\u00020y2\u0006\u0010 \u001a\u00020z\u001a\u000e\u0010!\u001a\u00020i2\u0006\u0010 \u001a\u00020{\u001a\u0012\u0010!\u001a\u00020a2\n\u0010|\u001a\u00020T\"\u00020\n\u001a\u0012\u0010!\u001a\u00020e2\n\u0010|\u001a\u00020}\"\u00020w\u001a\u001f\u0010!\u001a\u00020N2\u0012\u0010|\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00130~\"\u00020\u0013¢\u0006\u0002\u0010\u007f\u001a \u0010!\u001a\u00020i2\u0012\u0010|\u001a\n\u0012\u0006\b\u0001\u0012\u00020{0~\"\u00020{¢\u0006\u0003\u0010\u0080\u0001\u001a,\u0010!\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0004\"\u0006\b\u0000\u0010\u0003\u0018\u00012\u0013\u0010\u0081\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0001H\u0086\b\"-\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0001\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\"!\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00020\u0001*\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\"\u000e\u0010Q\u001a\u00020RX\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010S\u001a\u00020TX\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010U\u001a\u00020TX\u0082\u0004¢\u0006\u0002\n\u0000\" \u0010V\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\u0004\u0012\u00020X0WX\u0082\u0004¢\u0006\u0002\n\u0000\"\u0011\u0010`\u001a\u00020a¢\u0006\b\n\u0000\u001a\u0004\bb\u0010c\"\u0011\u0010d\u001a\u00020e¢\u0006\b\n\u0000\u001a\u0004\bf\u0010g\"\u0011\u0010h\u001a\u00020i¢\u0006\b\n\u0000\u001a\u0004\bj\u0010k\"\u0011\u0010l\u001a\u00020N¢\u0006\b\n\u0000\u001a\u0004\bm\u0010n\"\u0011\u0010o\u001a\u00020p¢\u0006\b\n\u0000\u001a\u0004\bq\u0010r\"\u0011\u0010s\u001a\u00020t¢\u0006\b\n\u0000\u001a\u0004\bu\u0010v¨\u0006\u0082\u0001"}, d2 = {"keyframesIfKeyed", "", "Lcom/alightcreative/app/motion/scene/Keyframe;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lcom/alightcreative/app/motion/scene/Keyable;", "getKeyframesIfKeyed", "(Lcom/alightcreative/app/motion/scene/Keyable;)Ljava/util/List;", "copyAdjustingTime", "adjuster", "Lkotlin/Function1;", "", "copyWithEasingToAllKeyframe", "easing", "Lcom/alightcreative/app/motion/easing/Easing;", "smoothingFromSerializedString", "Lcom/alightcreative/app/motion/scene/Smoothing;", CmcdData.STREAMING_FORMAT_SS, "", "keyframesIfExistsAndKeyed", "Lcom/alightcreative/app/motion/scene/Vector2D;", "Lcom/alightcreative/app/motion/scene/OptionalKeyableVector2D;", "getKeyframesIfExistsAndKeyed", "(Lcom/alightcreative/app/motion/scene/OptionalKeyableVector2D;)Ljava/util/List;", "optionalValueAtTime", "Lcom/alightcreative/app/motion/scene/OptionalVector2D;", "t", "copyWithComputedOptionalValueForTime", "scene", "Lcom/alightcreative/app/motion/scene/Scene;", "element", "Lcom/alightcreative/app/motion/scene/SceneElement;", "time", "value", "keyable", "sceneTimeFromLocalTime", "", "copyWithComputedValueForTime", "copyWithValueForTime", "(Lcom/alightcreative/app/motion/scene/Keyable;Lcom/alightcreative/app/motion/scene/Scene;Lcom/alightcreative/app/motion/scene/SceneElement;FLjava/lang/Object;)Lcom/alightcreative/app/motion/scene/Keyable;", "copyAddingAnimator", "animator", "Lcom/alightcreative/app/motion/scene/animators/Animator;", "copyRemovingAnimator", "copyWithEasingForTime", "copyWithSmoothingForTime", "smoothing", "copyAddingNewKeyframe", "copyWithOnlyKeyframe", "copyRemovingKeyframe", "closestToTime", "firstKeyframe", "closestBeforeTime", "closestAfterTime", "closestStrictlyAfterTime", "closestSurroundingTime", "Lkotlin/Pair;", "translatedBy", "dx", "dy", "Lcom/alightcreative/app/motion/scene/Vector3D;", "translatedByVector3D", "dz", "offsetBy", "offset", "scaleBy", "scale", "scaledBy", "sx", "sy", "focusX", "focusY", "rotatedBy", "angle", "flipped", "mirrored", "optionalRotatedBy", "sz", "focusZ", "Lcom/alightcreative/app/motion/scene/KeyableVector2D;", "valueAtTime", "(Lcom/alightcreative/app/motion/scene/Keyable;F)Ljava/lang/Object;", "scratchPathMeasure", "Landroid/graphics/PathMeasure;", "posAry", "", "tanAry", "motionPathInfoCache", "Ljava/util/WeakHashMap;", "Lcom/alightcreative/app/motion/scene/MotionPathInfo;", "smoothedVector2DAtTime", "env", "Lcom/alightcreative/app/motion/scene/animators/AnimatorEnvironment;", "(Lcom/alightcreative/app/motion/scene/Keyable;Lcom/alightcreative/app/motion/scene/animators/AnimatorEnvironment;)Ljava/lang/Object;", "reverseInterpolateFirstFrame", "oneFrameDuration", "valueAtTimeOneFrameEarlier", "KEYABLE_FLOAT_DEFAULT", "Lcom/alightcreative/app/motion/scene/KeyableFloat;", "getKEYABLE_FLOAT_DEFAULT", "()Lcom/alightcreative/app/motion/scene/KeyableFloat;", "KEYABLE_DOUBLE_DEFAULT", "Lcom/alightcreative/app/motion/scene/KeyableDouble;", "getKEYABLE_DOUBLE_DEFAULT", "()Lcom/alightcreative/app/motion/scene/KeyableDouble;", "KEYABLE_SOLID_COLOR_DEFAULT", "Lcom/alightcreative/app/motion/scene/KeyableSolidColor;", "getKEYABLE_SOLID_COLOR_DEFAULT", "()Lcom/alightcreative/app/motion/scene/KeyableSolidColor;", "KEYABLE_VECTOR2D_DEFAULT", "getKEYABLE_VECTOR2D_DEFAULT", "()Lcom/alightcreative/app/motion/scene/KeyableVector2D;", "KEYABLE_VECTOR3D_DEFAULT", "Lcom/alightcreative/app/motion/scene/KeyableVector3D;", "getKEYABLE_VECTOR3D_DEFAULT", "()Lcom/alightcreative/app/motion/scene/KeyableVector3D;", "KEYABLE_VECTOR4D_DEFAULT", "Lcom/alightcreative/app/motion/scene/KeyableVector4D;", "getKEYABLE_VECTOR4D_DEFAULT", "()Lcom/alightcreative/app/motion/scene/KeyableVector4D;", "", "Lcom/alightcreative/app/motion/scene/Vector4D;", "Lcom/alightcreative/app/motion/scene/KeyableQuaternion;", "Lcom/alightcreative/app/motion/scene/Quaternion;", "Lcom/alightcreative/app/motion/scene/SolidColor;", IV8ValueMap.FUNCTION_VALUES, "", "", "([Lcom/alightcreative/app/motion/scene/Vector2D;)Lcom/alightcreative/app/motion/scene/KeyableVector2D;", "([Lcom/alightcreative/app/motion/scene/SolidColor;)Lcom/alightcreative/app/motion/scene/KeyableSolidColor;", "keyframes", "app_productionRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nKeyable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Keyable.kt\ncom/alightcreative/app/motion/scene/KeyableKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 CubicBSpline.kt\ncom/alightcreative/app/motion/scene/CubicBSplineKt\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,654:1\n1557#2:655\n1628#2,3:656\n1557#2:659\n1628#2,3:660\n2341#2,14:663\n2341#2,14:677\n1557#2:747\n1628#2,3:748\n1557#2:751\n1628#2,3:752\n1557#2:755\n1628#2,3:756\n1557#2:759\n1628#2,3:760\n1557#2:763\n1628#2,3:764\n1557#2:767\n1628#2,3:768\n1557#2:771\n1628#2,3:772\n1557#2:775\n1628#2,3:776\n1557#2:779\n1628#2,3:780\n1557#2:783\n1628#2,3:784\n1557#2:787\n1628#2,3:788\n1557#2:792\n1628#2,3:793\n1557#2:796\n1628#2,3:797\n1557#2:800\n1628#2,3:801\n1797#2,3:804\n1053#2:807\n1797#2,3:835\n1797#2,3:838\n1797#2,3:841\n1843#3,14:691\n1843#3,14:705\n1843#3,14:719\n1843#3,14:733\n1#4:791\n257#5,27:808\n11298#6:844\n11424#6,4:845\n11308#6:849\n11437#6,4:850\n11248#6:854\n11359#6,4:855\n11248#6:859\n11359#6,4:860\n*S KotlinDebug\n*F\n+ 1 Keyable.kt\ncom/alightcreative/app/motion/scene/KeyableKt\n*L\n48#1:655\n48#1:656,3\n51#1:659\n51#1:660,3\n380#1:663,14\n381#1:677,14\n403#1:747\n403#1:748,3\n407#1:751\n407#1:752,3\n410#1:755\n410#1:756,3\n413#1:759\n413#1:760,3\n416#1:763\n416#1:764,3\n419#1:767\n419#1:768,3\n422#1:771\n422#1:772,3\n425#1:775\n425#1:776,3\n428#1:779\n428#1:780,3\n432#1:783\n432#1:784,3\n436#1:787\n436#1:788,3\n447#1:792\n447#1:793,3\n459#1:796\n459#1:797,3\n466#1:800\n466#1:801,3\n497#1:804,3\n502#1:807\n549#1:835,3\n572#1:838,3\n623#1:841,3\n394#1:691,14\n395#1:705,14\n397#1:719,14\n398#1:733,14\n502#1:808,27\n640#1:844\n640#1:845,4\n641#1:849\n641#1:850,4\n642#1:854\n642#1:855,4\n643#1:859\n643#1:860,4\n*E\n"})
public final class KeyableKt {
    private static final PathMeasure scratchPathMeasure = new PathMeasure();
    private static final float[] posAry = new float[2];
    private static final float[] tanAry = new float[2];
    private static final WeakHashMap<Keyable<Vector2D>, MotionPathInfo> motionPathInfoCache = new WeakHashMap<>();
    private static final KeyableFloat KEYABLE_FLOAT_DEFAULT = keyable(0.0f);
    private static final KeyableDouble KEYABLE_DOUBLE_DEFAULT = keyable(0.0d);
    private static final KeyableSolidColor KEYABLE_SOLID_COLOR_DEFAULT = keyable(ColorKt.SolidColor());
    private static final KeyableVector2D KEYABLE_VECTOR2D_DEFAULT = keyable(GeometryKt.Vector2D());
    private static final KeyableVector3D KEYABLE_VECTOR3D_DEFAULT = keyable(GeometryKt.Vector3D());
    private static final KeyableVector4D KEYABLE_VECTOR4D_DEFAULT = keyable(GeometryKt.Vector4D());

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Smoothing.values().length];
            try {
                iArr[Smoothing.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Smoothing.Auto.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final OptionalKeyableVector2D keyable(OptionalVector2D optionalVector2D) {
        Intrinsics.checkNotNullParameter(optionalVector2D, "<this>");
        if (Intrinsics.areEqual(optionalVector2D, OptionalVector2D.NONE.INSTANCE)) {
            return OptionalKeyableVector2D.NONE.INSTANCE;
        }
        if (optionalVector2D instanceof Vector2D) {
            return keyable((Vector2D) optionalVector2D);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final Keyable<Vector2D> scaledBy(Keyable<Vector2D> keyable, float f3, float f4, float f5, float f6) {
        Intrinsics.checkNotNullParameter(keyable, "<this>");
        List<Keyframe<Vector2D>> keyframes = keyable.getKeyframes();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(keyframes, 10));
        Iterator<T> it = keyframes.iterator();
        while (it.hasNext()) {
            Keyframe keyframe = (Keyframe) it.next();
            arrayList.add(Keyframe.copy$default(keyframe, new Vector2D(((((Vector2D) keyframe.getValue()).getX() - f5) * f3) + f5, ((((Vector2D) keyframe.getValue()).getY() - f6) * f4) + f6), 0.0f, null, null, 14, null));
        }
        return Keyable.DefaultImpls.copyWith$default(keyable, arrayList, false, null, 6, null);
    }

    public static /* synthetic */ Keyable scaledBy$default(Keyable keyable, float f3, float f4, float f5, float f6, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f3 = 1.0f;
        }
        if ((i2 & 2) != 0) {
            f4 = 1.0f;
        }
        if ((i2 & 4) != 0) {
            f5 = 0.0f;
        }
        if ((i2 & 8) != 0) {
            f6 = 0.0f;
        }
        return scaledBy(keyable, f3, f4, f5, f6);
    }

    public static final Keyable<Vector2D> translatedBy(Keyable<Vector2D> keyable, float f3, float f4) {
        Intrinsics.checkNotNullParameter(keyable, "<this>");
        List<Keyframe<Vector2D>> keyframes = keyable.getKeyframes();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(keyframes, 10));
        Iterator<T> it = keyframes.iterator();
        while (it.hasNext()) {
            Keyframe keyframe = (Keyframe) it.next();
            arrayList.add(Keyframe.copy$default(keyframe, new Vector2D(((Vector2D) keyframe.getValue()).getX() + f3, ((Vector2D) keyframe.getValue()).getY() + f4), 0.0f, null, null, 14, null));
        }
        return Keyable.DefaultImpls.copyWith$default(keyable, arrayList, false, null, 6, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T valueAtTime(Keyable<T> keyable, float f3) {
        T t3;
        Intrinsics.checkNotNullParameter(keyable, "<this>");
        Keyframe keyframeClosestBeforeTime = closestBeforeTime(keyable, f3);
        Keyframe keyframeClosestAfterTime = closestAfterTime(keyable, f3);
        if (keyframeClosestBeforeTime != null) {
            if (keyframeClosestAfterTime != null) {
                return (keyframeClosestBeforeTime == keyframeClosestAfterTime || keyframeClosestAfterTime.getTime() - keyframeClosestBeforeTime.getTime() == 0.0f) ? (T) keyframeClosestBeforeTime.getValue() : (T) keyable.interp(keyframeClosestBeforeTime.getValue(), keyframeClosestAfterTime.getValue(), keyframeClosestAfterTime.getEasing().interpolate((f3 - keyframeClosestBeforeTime.getTime()) / (keyframeClosestAfterTime.getTime() - keyframeClosestBeforeTime.getTime())));
            }
            T t4 = (T) keyframeClosestBeforeTime.getValue();
            if (t4 != null) {
                return t4;
            }
            throw new IllegalStateException();
        }
        if (keyframeClosestAfterTime != null && (t3 = (T) keyframeClosestAfterTime.getValue()) != null) {
            return t3;
        }
        List keyframes = keyable.getKeyframes();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(keyframes, 10));
        Iterator<T> it = keyframes.iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf(((Keyframe) it.next()).getTime()));
        }
        throw new IllegalStateException("before and after kf both null: t=" + f3 + " keyframes=" + CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, null, 62, null));
    }

    public static final <T> Keyframe<T> closestAfterTime(Keyable<T> keyable, final float f3) {
        Keyframe<T> keyframe;
        Intrinsics.checkNotNullParameter(keyable, "<this>");
        Iterator<T> it = SequencesKt.filter(CollectionsKt.asSequence(keyable.getKeyframes()), new Function1() { // from class: com.alightcreative.app.motion.scene.z
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(KeyableKt.closestAfterTime$lambda$4(f3, (Keyframe) obj));
            }
        }).iterator();
        if (it.hasNext()) {
            T next = it.next();
            if (it.hasNext()) {
                float fAbs = Math.abs(f3 - ((Keyframe) next).getTime());
                do {
                    T next2 = it.next();
                    float fAbs2 = Math.abs(f3 - ((Keyframe) next2).getTime());
                    if (Float.compare(fAbs, fAbs2) > 0) {
                        next = next2;
                        fAbs = fAbs2;
                    }
                } while (it.hasNext());
            }
            keyframe = next;
        } else {
            keyframe = null;
        }
        return keyframe;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean closestAfterTime$lambda$4(float f3, Keyframe it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getTime() >= f3;
    }

    public static final <T> Keyframe<T> closestBeforeTime(Keyable<T> keyable, float f3) {
        Intrinsics.checkNotNullParameter(keyable, "<this>");
        Keyframe<T> keyframe = null;
        for (Keyframe<T> keyframe2 : keyable.getKeyframes()) {
            if (keyframe2.getTime() <= f3 && (keyframe == null || f3 - keyframe2.getTime() < f3 - keyframe.getTime())) {
                keyframe = keyframe2;
            }
        }
        return keyframe;
    }

    public static final <T> Keyframe<T> closestStrictlyAfterTime(Keyable<T> keyable, final float f3) {
        Keyframe<T> keyframe;
        Intrinsics.checkNotNullParameter(keyable, "<this>");
        Iterator<T> it = SequencesKt.filter(CollectionsKt.asSequence(keyable.getKeyframes()), new Function1() { // from class: com.alightcreative.app.motion.scene.QJ
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(KeyableKt.closestStrictlyAfterTime$lambda$6(f3, (Keyframe) obj));
            }
        }).iterator();
        if (it.hasNext()) {
            T next = it.next();
            if (it.hasNext()) {
                float fAbs = Math.abs(f3 - ((Keyframe) next).getTime());
                do {
                    T next2 = it.next();
                    float fAbs2 = Math.abs(f3 - ((Keyframe) next2).getTime());
                    if (Float.compare(fAbs, fAbs2) > 0) {
                        next = next2;
                        fAbs = fAbs2;
                    }
                } while (it.hasNext());
            }
            keyframe = next;
        } else {
            keyframe = null;
        }
        return keyframe;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean closestStrictlyAfterTime$lambda$6(float f3, Keyframe it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getTime() > f3;
    }

    public static final <T> Pair<Keyframe<T>, Keyframe<T>> closestSurroundingTime(Keyable<T> keyable, final float f3) {
        T next;
        Intrinsics.checkNotNullParameter(keyable, "<this>");
        Iterator<T> it = SequencesKt.filter(CollectionsKt.asSequence(keyable.getKeyframes()), new Function1() { // from class: com.alightcreative.app.motion.scene.l3D
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(KeyableKt.closestSurroundingTime$lambda$8(f3, (Keyframe) obj));
            }
        }).iterator();
        Object next2 = null;
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float fAbs = Math.abs(f3 - ((Keyframe) next).getTime());
                do {
                    T next3 = it.next();
                    float fAbs2 = Math.abs(f3 - ((Keyframe) next3).getTime());
                    if (Float.compare(fAbs, fAbs2) > 0) {
                        next = next3;
                        fAbs = fAbs2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = (T) null;
        }
        Keyframe keyframe = next;
        Iterator<T> it2 = SequencesKt.filter(CollectionsKt.asSequence(keyable.getKeyframes()), new Function1() { // from class: com.alightcreative.app.motion.scene.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(KeyableKt.closestSurroundingTime$lambda$10(f3, (Keyframe) obj));
            }
        }).iterator();
        if (it2.hasNext()) {
            next2 = it2.next();
            if (it2.hasNext()) {
                float fAbs3 = Math.abs(f3 - ((Keyframe) next2).getTime());
                do {
                    Object next4 = it2.next();
                    float fAbs4 = Math.abs(f3 - ((Keyframe) next4).getTime());
                    if (Float.compare(fAbs3, fAbs4) > 0) {
                        next2 = next4;
                        fAbs3 = fAbs4;
                    }
                } while (it2.hasNext());
            }
        }
        return new Pair<>(keyframe, (Keyframe) next2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean closestSurroundingTime$lambda$10(float f3, Keyframe it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getTime() > f3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean closestSurroundingTime$lambda$8(float f3, Keyframe it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getTime() <= f3;
    }

    public static final <T> Keyframe<T> closestToTime(Keyable<T> keyable, float f3) {
        Keyframe<T> keyframe;
        Intrinsics.checkNotNullParameter(keyable, "<this>");
        Iterator<T> it = keyable.getKeyframes().iterator();
        if (it.hasNext()) {
            T next = it.next();
            if (it.hasNext()) {
                float fAbs = Math.abs(f3 - ((Keyframe) next).getTime());
                do {
                    T next2 = it.next();
                    float fAbs2 = Math.abs(f3 - ((Keyframe) next2).getTime());
                    if (Float.compare(fAbs, fAbs2) > 0) {
                        next = next2;
                        fAbs = fAbs2;
                    }
                } while (it.hasNext());
            }
            keyframe = next;
        } else {
            keyframe = null;
        }
        Keyframe<T> keyframe2 = keyframe;
        return keyframe2 == null ? keyable.getKeyframes().get(0) : keyframe2;
    }

    public static final <T> Keyable<T> copyAddingAnimator(Keyable<T> keyable, Animator<T> animator) {
        Intrinsics.checkNotNullParameter(keyable, "<this>");
        Intrinsics.checkNotNullParameter(animator, "animator");
        return Keyable.DefaultImpls.copyWith$default(keyable, null, false, CollectionsKt.plus((Collection<? extends Animator<T>>) keyable.getAnimators(), animator), 3, null);
    }

    public static final <T> Keyable<T> copyAddingNewKeyframe(Keyable<T> keyable, Scene scene, SceneElement element, float f3) {
        Intrinsics.checkNotNullParameter(keyable, "<this>");
        Intrinsics.checkNotNullParameter(scene, "scene");
        Intrinsics.checkNotNullParameter(element, "element");
        if (!keyable.getKeyed()) {
            return Keyable.DefaultImpls.copyWith$default(keyable, CollectionsKt.listOf(new Keyframe(keyable.getKeyframes().get(0).getValue(), f3, null, null, 12, null)), true, null, 4, null);
        }
        int framesPerHundredSeconds = scene.getFramesPerHundredSeconds();
        Keyframe keyframeClosestBeforeTime = closestBeforeTime(keyable, f3);
        Keyframe keyframeClosestAfterTime = closestAfterTime(keyable, f3);
        int iFrameNumberFromTime = TimeKt.frameNumberFromTime(sceneTimeFromLocalTime(element, f3), framesPerHundredSeconds);
        if ((keyframeClosestBeforeTime != null && iFrameNumberFromTime == TimeKt.frameNumberFromTime(sceneTimeFromLocalTime(element, keyframeClosestBeforeTime.getTime()), framesPerHundredSeconds)) || (keyframeClosestAfterTime != null && iFrameNumberFromTime == TimeKt.frameNumberFromTime(sceneTimeFromLocalTime(element, keyframeClosestAfterTime.getTime()), framesPerHundredSeconds))) {
            return keyable;
        }
        return Keyable.DefaultImpls.copyWith$default(keyable, CollectionsKt.plus((Collection<? extends Keyframe>) keyable.getKeyframes(), new Keyframe(valueAtTime(keyable, f3), f3, null, null, 12, null)), false, null, 6, null);
    }

    public static final <T> Keyable<T> copyAdjustingTime(Keyable<T> keyable, Function1<? super Float, Float> adjuster) {
        Intrinsics.checkNotNullParameter(keyable, "<this>");
        Intrinsics.checkNotNullParameter(adjuster, "adjuster");
        List<Keyframe<T>> keyframes = keyable.getKeyframes();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(keyframes, 10));
        Iterator<T> it = keyframes.iterator();
        while (it.hasNext()) {
            Keyframe keyframe = (Keyframe) it.next();
            arrayList.add(Keyframe.copy$default(keyframe, null, adjuster.invoke(Float.valueOf(keyframe.getTime())).floatValue(), null, null, 13, null));
        }
        return Keyable.DefaultImpls.copyWith$default(keyable, arrayList, false, null, 6, null);
    }

    public static final <T> Keyable<T> copyRemovingAnimator(Keyable<T> keyable, Animator<T> animator) {
        Intrinsics.checkNotNullParameter(keyable, "<this>");
        Intrinsics.checkNotNullParameter(animator, "animator");
        return keyable.getAnimators().contains(animator) ? Keyable.DefaultImpls.copyWith$default(keyable, null, false, CollectionsKt.minus(keyable.getAnimators(), animator), 3, null) : keyable;
    }

    public static final <T> Keyable<T> copyRemovingKeyframe(Keyable<T> keyable, Scene scene, SceneElement element, float f3) {
        Intrinsics.checkNotNullParameter(keyable, "<this>");
        Intrinsics.checkNotNullParameter(scene, "scene");
        Intrinsics.checkNotNullParameter(element, "element");
        if (!keyable.getKeyed()) {
            return keyable;
        }
        int framesPerHundredSeconds = scene.getFramesPerHundredSeconds();
        Keyframe keyframeClosestBeforeTime = closestBeforeTime(keyable, f3);
        Keyframe keyframeClosestAfterTime = closestAfterTime(keyable, f3);
        int iFrameNumberFromTime = TimeKt.frameNumberFromTime(sceneTimeFromLocalTime(element, f3), framesPerHundredSeconds);
        return (keyframeClosestBeforeTime == null || iFrameNumberFromTime != TimeKt.frameNumberFromTime(sceneTimeFromLocalTime(element, keyframeClosestBeforeTime.getTime()), framesPerHundredSeconds)) ? (keyframeClosestAfterTime == null || iFrameNumberFromTime != TimeKt.frameNumberFromTime(sceneTimeFromLocalTime(element, keyframeClosestAfterTime.getTime()), framesPerHundredSeconds)) ? keyable : keyable.getKeyframes().size() == 1 ? Keyable.DefaultImpls.copyWith$default(keyable, null, false, null, 5, null) : Keyable.DefaultImpls.copyWith$default(keyable, CollectionsKt.minus(keyable.getKeyframes(), keyframeClosestAfterTime), false, null, 6, null) : keyable.getKeyframes().size() == 1 ? Keyable.DefaultImpls.copyWith$default(keyable, null, false, null, 5, null) : Keyable.DefaultImpls.copyWith$default(keyable, CollectionsKt.minus(keyable.getKeyframes(), keyframeClosestBeforeTime), false, null, 6, null);
    }

    public static final OptionalKeyableVector2D copyWithComputedOptionalValueForTime(OptionalKeyableVector2D optionalKeyableVector2D, Scene scene, SceneElement element, float f3, Function1<? super Vector2D, Vector2D> value) {
        Intrinsics.checkNotNullParameter(optionalKeyableVector2D, "<this>");
        Intrinsics.checkNotNullParameter(scene, "scene");
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(value, "value");
        KeyableVector2D keyableVector2D = optionalKeyableVector2D instanceof KeyableVector2D ? (KeyableVector2D) optionalKeyableVector2D : null;
        if (keyableVector2D == null) {
            return OptionalKeyableVector2D.NONE.INSTANCE;
        }
        Object objCopyWithComputedValueForTime = copyWithComputedValueForTime(keyableVector2D, scene, element, f3, value);
        Intrinsics.checkNotNull(objCopyWithComputedValueForTime, "null cannot be cast to non-null type com.alightcreative.app.motion.scene.OptionalKeyableVector2D");
        return (OptionalKeyableVector2D) objCopyWithComputedValueForTime;
    }

    public static final <T> Keyable<T> copyWithComputedValueForTime(Keyable<T> keyable, Scene scene, SceneElement element, float f3, Function1<? super T, ? extends T> value) {
        Intrinsics.checkNotNullParameter(keyable, "<this>");
        Intrinsics.checkNotNullParameter(scene, "scene");
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(value, "value");
        if (!keyable.getKeyed()) {
            return Keyable.DefaultImpls.copyWith$default(keyable, CollectionsKt.listOf(new Keyframe(value.invoke(keyable.getKeyframes().get(0).getValue()), 0.0f, null, null, 12, null)), false, null, 6, null);
        }
        int framesPerHundredSeconds = scene.getFramesPerHundredSeconds();
        Keyframe keyframeClosestBeforeTime = closestBeforeTime(keyable, f3);
        Keyframe keyframeClosestAfterTime = closestAfterTime(keyable, f3);
        int iFrameNumberFromTime = TimeKt.frameNumberFromTime(sceneTimeFromLocalTime(element, f3), framesPerHundredSeconds);
        if (keyframeClosestBeforeTime != null && iFrameNumberFromTime == TimeKt.frameNumberFromTime(sceneTimeFromLocalTime(element, keyframeClosestBeforeTime.getTime()), framesPerHundredSeconds)) {
            return Keyable.DefaultImpls.copyWith$default(keyable, CollectionsKt.plus((Collection<? extends Keyframe>) CollectionsKt.minus(keyable.getKeyframes(), keyframeClosestBeforeTime), Keyframe.copy$default(keyframeClosestBeforeTime, value.invoke((Object) keyframeClosestBeforeTime.getValue()), 0.0f, null, null, 14, null)), false, null, 6, null);
        }
        if (keyframeClosestAfterTime != null && iFrameNumberFromTime == TimeKt.frameNumberFromTime(sceneTimeFromLocalTime(element, keyframeClosestAfterTime.getTime()), framesPerHundredSeconds)) {
            return Keyable.DefaultImpls.copyWith$default(keyable, CollectionsKt.plus((Collection<? extends Keyframe>) CollectionsKt.minus(keyable.getKeyframes(), keyframeClosestAfterTime), Keyframe.copy$default(keyframeClosestAfterTime, value.invoke((Object) keyframeClosestAfterTime.getValue()), 0.0f, null, null, 14, null)), false, null, 6, null);
        }
        return Keyable.DefaultImpls.copyWith$default(keyable, CollectionsKt.plus((Collection<? extends Keyframe>) keyable.getKeyframes(), new Keyframe(value.invoke((Object) valueAtTime(keyable, f3)), f3, null, null, 12, null)), false, null, 6, null);
    }

    public static final <T> Keyable<T> copyWithEasingForTime(Keyable<T> keyable, float f3, Easing easing) {
        Keyframe keyframeClosestStrictlyAfterTime;
        Intrinsics.checkNotNullParameter(keyable, "<this>");
        Intrinsics.checkNotNullParameter(easing, "easing");
        return (keyable.getKeyed() && (keyframeClosestStrictlyAfterTime = closestStrictlyAfterTime(keyable, f3)) != null) ? Keyable.DefaultImpls.copyWith$default(keyable, v9.CN3.n(keyable.getKeyframes(), keyframeClosestStrictlyAfterTime, Keyframe.copy$default(keyframeClosestStrictlyAfterTime, null, 0.0f, easing, null, 11, null)), false, null, 6, null) : keyable;
    }

    public static final <T> Keyable<T> copyWithEasingToAllKeyframe(Keyable<T> keyable, Easing easing) {
        Intrinsics.checkNotNullParameter(keyable, "<this>");
        Intrinsics.checkNotNullParameter(easing, "easing");
        List<Keyframe<T>> keyframes = keyable.getKeyframes();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(keyframes, 10));
        Iterator<T> it = keyframes.iterator();
        while (it.hasNext()) {
            Easing easing2 = easing;
            arrayList.add(Keyframe.copy$default((Keyframe) it.next(), null, 0.0f, easing2, null, 11, null));
            easing = easing2;
        }
        return Keyable.DefaultImpls.copyWith$default(keyable, arrayList, false, null, 6, null);
    }

    public static final <T> Keyable<T> copyWithOnlyKeyframe(Keyable<T> keyable, Scene scene, SceneElement element, float f3) {
        Intrinsics.checkNotNullParameter(keyable, "<this>");
        Intrinsics.checkNotNullParameter(scene, "scene");
        Intrinsics.checkNotNullParameter(element, "element");
        if (!keyable.getKeyed()) {
            return keyable;
        }
        int framesPerHundredSeconds = scene.getFramesPerHundredSeconds();
        Keyframe keyframeClosestBeforeTime = closestBeforeTime(keyable, f3);
        Keyframe keyframeClosestAfterTime = closestAfterTime(keyable, f3);
        int iFrameNumberFromTime = TimeKt.frameNumberFromTime(sceneTimeFromLocalTime(element, f3), framesPerHundredSeconds);
        return (keyframeClosestBeforeTime == null || iFrameNumberFromTime != TimeKt.frameNumberFromTime(sceneTimeFromLocalTime(element, keyframeClosestBeforeTime.getTime()), framesPerHundredSeconds)) ? (keyframeClosestAfterTime == null || iFrameNumberFromTime != TimeKt.frameNumberFromTime(sceneTimeFromLocalTime(element, keyframeClosestAfterTime.getTime()), framesPerHundredSeconds)) ? keyable : Keyable.DefaultImpls.copyWith$default(keyable, CollectionsKt.listOf(keyframeClosestAfterTime), false, null, 4, null) : Keyable.DefaultImpls.copyWith$default(keyable, CollectionsKt.listOf(keyframeClosestBeforeTime), false, null, 4, null);
    }

    public static final <T> Keyable<T> copyWithSmoothingForTime(Keyable<T> keyable, float f3, Smoothing smoothing) {
        Keyframe keyframeClosestAfterTime;
        Intrinsics.checkNotNullParameter(keyable, "<this>");
        Intrinsics.checkNotNullParameter(smoothing, "smoothing");
        return (keyable.getKeyed() && (keyframeClosestAfterTime = closestAfterTime(keyable, f3)) != null) ? Keyable.DefaultImpls.copyWith$default(keyable, CollectionsKt.plus((Collection<? extends Keyframe>) CollectionsKt.minus(keyable.getKeyframes(), keyframeClosestAfterTime), Keyframe.copy$default(keyframeClosestAfterTime, null, 0.0f, null, smoothing, 7, null)), false, null, 6, null) : keyable;
    }

    public static final <T> Keyable<T> copyWithValueForTime(Keyable<T> keyable, Scene scene, SceneElement element, float f3, T t3) {
        Intrinsics.checkNotNullParameter(keyable, "<this>");
        Intrinsics.checkNotNullParameter(scene, "scene");
        Intrinsics.checkNotNullParameter(element, "element");
        if (!keyable.getKeyed()) {
            return Keyable.DefaultImpls.copyWith$default(keyable, CollectionsKt.listOf(new Keyframe(t3, 0.0f, null, null, 12, null)), false, null, 6, null);
        }
        int framesPerHundredSeconds = scene.getFramesPerHundredSeconds();
        Keyframe keyframeClosestBeforeTime = closestBeforeTime(keyable, f3);
        Keyframe keyframeClosestAfterTime = closestAfterTime(keyable, f3);
        int iFrameNumberFromTime = TimeKt.frameNumberFromTime(sceneTimeFromLocalTime(element, f3), framesPerHundredSeconds);
        if (keyframeClosestBeforeTime != null && iFrameNumberFromTime == TimeKt.frameNumberFromTime(sceneTimeFromLocalTime(element, keyframeClosestBeforeTime.getTime()), framesPerHundredSeconds)) {
            return Keyable.DefaultImpls.copyWith$default(keyable, CollectionsKt.plus((Collection<? extends Keyframe>) CollectionsKt.minus(keyable.getKeyframes(), keyframeClosestBeforeTime), new Keyframe(t3, keyframeClosestBeforeTime.getTime(), null, null, 12, null)), false, null, 6, null);
        }
        if (keyframeClosestAfterTime == null || iFrameNumberFromTime != TimeKt.frameNumberFromTime(sceneTimeFromLocalTime(element, keyframeClosestAfterTime.getTime()), framesPerHundredSeconds)) {
            return Keyable.DefaultImpls.copyWith$default(keyable, CollectionsKt.plus((Collection<? extends Keyframe>) keyable.getKeyframes(), new Keyframe(t3, f3, null, null, 12, null)), false, null, 6, null);
        }
        return Keyable.DefaultImpls.copyWith$default(keyable, CollectionsKt.plus((Collection<? extends Keyframe>) CollectionsKt.minus(keyable.getKeyframes(), keyframeClosestAfterTime), new Keyframe(t3, keyframeClosestAfterTime.getTime(), null, null, 12, null)), false, null, 6, null);
    }

    public static final <T> Keyframe<T> firstKeyframe(Keyable<T> keyable) {
        Keyframe<T> keyframe;
        Intrinsics.checkNotNullParameter(keyable, "<this>");
        Iterator<T> it = keyable.getKeyframes().iterator();
        if (it.hasNext()) {
            T next = it.next();
            if (it.hasNext()) {
                float time = ((Keyframe) next).getTime();
                do {
                    T next2 = it.next();
                    float time2 = ((Keyframe) next2).getTime();
                    if (Float.compare(time, time2) > 0) {
                        next = next2;
                        time = time2;
                    }
                } while (it.hasNext());
            }
            keyframe = next;
        } else {
            keyframe = null;
        }
        Keyframe<T> keyframe2 = keyframe;
        return keyframe2 == null ? keyable.getKeyframes().get(0) : keyframe2;
    }

    public static final Keyable<Vector2D> flipped(Keyable<Vector2D> keyable) {
        Intrinsics.checkNotNullParameter(keyable, "<this>");
        List<Keyframe<Vector2D>> keyframes = keyable.getKeyframes();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(keyframes, 10));
        Iterator<T> it = keyframes.iterator();
        while (it.hasNext()) {
            Keyframe keyframe = (Keyframe) it.next();
            arrayList.add(Keyframe.copy$default(keyframe, new Vector2D(((Vector2D) keyframe.getValue()).getY(), ((Vector2D) keyframe.getValue()).getX()), 0.0f, null, null, 14, null));
        }
        return Keyable.DefaultImpls.copyWith$default(keyable, arrayList, false, null, 6, null);
    }

    public static final KeyableDouble getKEYABLE_DOUBLE_DEFAULT() {
        return KEYABLE_DOUBLE_DEFAULT;
    }

    public static final KeyableFloat getKEYABLE_FLOAT_DEFAULT() {
        return KEYABLE_FLOAT_DEFAULT;
    }

    public static final KeyableSolidColor getKEYABLE_SOLID_COLOR_DEFAULT() {
        return KEYABLE_SOLID_COLOR_DEFAULT;
    }

    public static final KeyableVector2D getKEYABLE_VECTOR2D_DEFAULT() {
        return KEYABLE_VECTOR2D_DEFAULT;
    }

    public static final KeyableVector3D getKEYABLE_VECTOR3D_DEFAULT() {
        return KEYABLE_VECTOR3D_DEFAULT;
    }

    public static final KeyableVector4D getKEYABLE_VECTOR4D_DEFAULT() {
        return KEYABLE_VECTOR4D_DEFAULT;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final List<Keyframe<Vector2D>> getKeyframesIfExistsAndKeyed(OptionalKeyableVector2D optionalKeyableVector2D) {
        Intrinsics.checkNotNullParameter(optionalKeyableVector2D, "<this>");
        return optionalKeyableVector2D instanceof KeyableVector2D ? getKeyframesIfKeyed((Keyable) optionalKeyableVector2D) : CollectionsKt.emptyList();
    }

    public static final <T> List<Keyframe<T>> getKeyframesIfKeyed(Keyable<T> keyable) {
        Intrinsics.checkNotNullParameter(keyable, "<this>");
        return keyable.getKeyed() ? keyable.getKeyframes() : CollectionsKt.emptyList();
    }

    public static final Keyable<Vector2D> mirrored(Keyable<Vector2D> keyable) {
        Intrinsics.checkNotNullParameter(keyable, "<this>");
        List<Keyframe<Vector2D>> keyframes = keyable.getKeyframes();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(keyframes, 10));
        Iterator<T> it = keyframes.iterator();
        while (it.hasNext()) {
            Keyframe keyframe = (Keyframe) it.next();
            arrayList.add(Keyframe.copy$default(keyframe, GeometryKt.unaryMinus((Vector2D) keyframe.getValue()), 0.0f, null, null, 14, null));
        }
        return Keyable.DefaultImpls.copyWith$default(keyable, arrayList, false, null, 6, null);
    }

    public static final Keyable<Float> offsetBy(Keyable<Float> keyable, float f3) {
        Intrinsics.checkNotNullParameter(keyable, "<this>");
        List<Keyframe<Float>> keyframes = keyable.getKeyframes();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(keyframes, 10));
        Iterator<T> it = keyframes.iterator();
        while (it.hasNext()) {
            Keyframe keyframe = (Keyframe) it.next();
            arrayList.add(Keyframe.copy$default(keyframe, Float.valueOf(((Number) keyframe.getValue()).floatValue() + f3), 0.0f, null, null, 14, null));
        }
        return Keyable.DefaultImpls.copyWith$default(keyable, arrayList, false, null, 6, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final OptionalKeyableVector2D optionalRotatedBy(OptionalKeyableVector2D optionalKeyableVector2D, float f3) {
        Intrinsics.checkNotNullParameter(optionalKeyableVector2D, "<this>");
        if (optionalKeyableVector2D instanceof KeyableVector2D) {
            Keyable<Vector2D> keyableRotatedBy = rotatedBy((Keyable) optionalKeyableVector2D, f3);
            return new KeyableVector2D(keyableRotatedBy.getKeyed(), keyableRotatedBy.getKeyframes(), keyableRotatedBy.getAnimators());
        }
        if (Intrinsics.areEqual(optionalKeyableVector2D, OptionalKeyableVector2D.NONE.INSTANCE)) {
            return optionalKeyableVector2D;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final OptionalVector2D optionalValueAtTime(OptionalKeyableVector2D optionalKeyableVector2D, float f3) {
        Intrinsics.checkNotNullParameter(optionalKeyableVector2D, "<this>");
        if (Intrinsics.areEqual(optionalKeyableVector2D, OptionalKeyableVector2D.NONE.INSTANCE)) {
            return OptionalVector2D.NONE.INSTANCE;
        }
        if (optionalKeyableVector2D instanceof KeyableVector2D) {
            return (OptionalVector2D) valueAtTime((Keyable) optionalKeyableVector2D, f3);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Keyable<T> reverseInterpolateFirstFrame(Keyable<T> keyable, float f3) {
        float fInterpolate;
        Intrinsics.checkNotNullParameter(keyable, "<this>");
        if (keyable.getKeyed()) {
            Keyframe keyframeFirstKeyframe = firstKeyframe(keyable);
            Keyframe keyframeClosestAfterTime = closestAfterTime(keyable, Math.nextUp(keyframeFirstKeyframe.getTime()));
            if (keyframeClosestAfterTime != null && keyframeFirstKeyframe.getTime() >= (-f3) && keyframeFirstKeyframe.getTime() <= f3) {
                float time = keyframeFirstKeyframe.getTime() - (f3 * 2.0f);
                Object value = keyframeFirstKeyframe.getValue();
                Object value2 = keyframeClosestAfterTime.getValue();
                if ((keyframeClosestAfterTime.getEasing() instanceof LinearEasing) || (keyframeClosestAfterTime.getEasing() instanceof CubicBezierEasing)) {
                    fInterpolate = keyframeClosestAfterTime.getEasing().interpolate(time / (keyframeClosestAfterTime.getTime() - keyframeFirstKeyframe.getTime()));
                } else {
                    fInterpolate = ((keyframeClosestAfterTime.getEasing().interpolate(0.02f) - keyframeClosestAfterTime.getEasing().interpolate(0.01f)) / 0.01f) * time;
                }
                return Keyable.DefaultImpls.copyWith$default(keyable, CollectionsKt.plus((Collection) CollectionsKt.listOf(new Keyframe(keyable.interp(value, value2, fInterpolate), time, null, null, 12, null)), (Iterable) keyable.getKeyframes()), false, null, 6, null);
            }
        }
        return keyable;
    }

    public static final Keyable<Vector2D> rotatedBy(Keyable<Vector2D> keyable, float f3) {
        Intrinsics.checkNotNullParameter(keyable, "<this>");
        List<Keyframe<Vector2D>> keyframes = keyable.getKeyframes();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(keyframes, 10));
        Iterator<T> it = keyframes.iterator();
        while (it.hasNext()) {
            Keyframe keyframe = (Keyframe) it.next();
            arrayList.add(Keyframe.copy$default(keyframe, GeometryKt.rot((Vector2D) keyframe.getValue(), f3), 0.0f, null, null, 14, null));
        }
        return Keyable.DefaultImpls.copyWith$default(keyable, arrayList, false, null, 6, null);
    }

    public static final Keyable<Float> scaleBy(Keyable<Float> keyable, float f3) {
        Intrinsics.checkNotNullParameter(keyable, "<this>");
        List<Keyframe<Float>> keyframes = keyable.getKeyframes();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(keyframes, 10));
        Iterator<T> it = keyframes.iterator();
        while (it.hasNext()) {
            Keyframe keyframe = (Keyframe) it.next();
            arrayList.add(Keyframe.copy$default(keyframe, Float.valueOf(((Number) keyframe.getValue()).floatValue() * f3), 0.0f, null, null, 14, null));
        }
        return Keyable.DefaultImpls.copyWith$default(keyable, arrayList, false, null, 6, null);
    }

    public static /* synthetic */ Keyable scaledBy$default(Keyable keyable, float f3, float f4, float f5, float f6, float f7, float f8, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f3 = 1.0f;
        }
        if ((i2 & 2) != 0) {
            f4 = 1.0f;
        }
        if ((i2 & 4) != 0) {
            f5 = 1.0f;
        }
        if ((i2 & 8) != 0) {
            f6 = 0.0f;
        }
        if ((i2 & 16) != 0) {
            f7 = 0.0f;
        }
        if ((i2 & 32) != 0) {
            f8 = 0.0f;
        }
        return scaledBy(keyable, f3, f4, f5, f6, f7, f8);
    }

    public static final int sceneTimeFromLocalTime(SceneElement sceneElement, float f3) {
        Intrinsics.checkNotNullParameter(sceneElement, "<this>");
        return (int) (((double) sceneElement.getStartTime()) + (((double) (sceneElement.getEndTime() - sceneElement.getStartTime())) * ((double) f3)));
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Vector2D smoothedVector2DAtTime(Keyable<Vector2D> keyable, AnimatorEnvironment env) {
        KeyableFloat keyableFloatCopy$default;
        Vector2D vector2DDiv;
        float time;
        Intrinsics.checkNotNullParameter(keyable, "<this>");
        Intrinsics.checkNotNullParameter(env, "env");
        if (keyable.getKeyframes().size() < 2) {
            List<Animator<Vector2D>> animators = keyable.getAnimators();
            Object value = ((Keyframe) CollectionsKt.first((List) keyable.getKeyframes())).getValue();
            Iterator<T> it = animators.iterator();
            while (it.hasNext()) {
                value = (Vector2D) ((Animator) it.next()).animate((Vector2D) value, env);
            }
            return (Vector2D) value;
        }
        MotionPathInfo motionPathInfo = motionPathInfoCache.get(keyable);
        if (motionPathInfo == null) {
            Path path = new Path();
            KeyableFloat keyableFloat = new KeyableFloat(true, CollectionsKt.emptyList(), CollectionsKt.emptyList());
            List listSortedWith = CollectionsKt.sortedWith(keyable.getKeyframes(), new Comparator() { // from class: com.alightcreative.app.motion.scene.KeyableKt$smoothedVector2DAtTime$lambda$30$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t3, T t4) {
                    return ComparisonsKt.compareValues(Float.valueOf(((Keyframe) t3).getTime()), Float.valueOf(((Keyframe) t4).getTime()));
                }
            });
            int size = listSortedWith.size();
            if (size >= 1) {
                KeyableFloat keyableFloatCopy$default2 = keyableFloat;
                int i2 = 0;
                while (i2 < size) {
                    Object obj = i2 == 0 ? null : listSortedWith.get(i2 - 1);
                    int i3 = i2 + 1;
                    Keyframe keyframe = (Keyframe) (i3 >= size ? null : listSortedWith.get(i3));
                    Keyframe keyframe2 = (Keyframe) obj;
                    Keyframe keyframe3 = (Keyframe) listSortedWith.get(i2);
                    if (keyframe2 != null) {
                        if (keyframe != null) {
                            if (keyframe2 == null) {
                                AbstractC1951j.mUb(path, (Vector2D) keyframe3.getValue());
                                scratchPathMeasure.setPath(path, false);
                                keyableFloatCopy$default2 = KeyableFloat.copy$default(keyableFloatCopy$default2, false, CollectionsKt.plus((Collection<? extends Keyframe>) keyableFloatCopy$default2.getKeyframes(), new Keyframe(Float.valueOf(0.0f), keyframe3.getTime(), keyframe3.getEasing(), null, 8, null)), null, 5, null);
                            }
                            KeyableFloat keyableFloat2 = keyableFloatCopy$default2;
                            Smoothing smoothing = keyframe.getSmoothing();
                            int[] iArr = WhenMappings.$EnumSwitchMapping$0;
                            int i5 = iArr[smoothing.ordinal()];
                            if (i5 == 1) {
                                vector2DDiv = (Vector2D) keyframe.getValue();
                            } else {
                                if (i5 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                vector2DDiv = GeometryKt.div(GeometryKt.plus((Vector2D) keyframe3.getValue(), (Vector2D) keyframe.getValue()), 2);
                            }
                            int i7 = iArr[keyframe3.getSmoothing().ordinal()];
                            if (i7 == 1) {
                                AbstractC1951j.xMQ(path, vector2DDiv);
                            } else {
                                if (i7 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                AbstractC1951j.gh(path, (Vector2D) keyframe3.getValue(), vector2DDiv);
                            }
                            int i8 = iArr[keyframe.getSmoothing().ordinal()];
                            if (i8 == 1) {
                                time = keyframe.getTime();
                            } else {
                                if (i8 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                time = keyframe3.getTime() + ((keyframe.getTime() - keyframe3.getTime()) * 0.5f);
                            }
                            float f3 = time;
                            PathMeasure pathMeasure = scratchPathMeasure;
                            pathMeasure.setPath(path, false);
                            keyableFloatCopy$default = KeyableFloat.copy$default(keyableFloat2, false, CollectionsKt.plus((Collection<? extends Keyframe>) keyableFloat2.getKeyframes(), new Keyframe(Float.valueOf(pathMeasure.getLength()), f3, keyframe3.getEasing(), null, 8, null)), null, 5, null);
                        } else if (keyframe2 != null) {
                            AbstractC1951j.xMQ(path, (Vector2D) keyframe3.getValue());
                            PathMeasure pathMeasure2 = scratchPathMeasure;
                            pathMeasure2.setPath(path, false);
                            keyableFloatCopy$default = KeyableFloat.copy$default(keyableFloatCopy$default2, false, CollectionsKt.plus((Collection<? extends Keyframe>) keyableFloatCopy$default2.getKeyframes(), new Keyframe(Float.valueOf(pathMeasure2.getLength()), keyframe3.getTime(), keyframe3.getEasing(), null, 8, null)), null, 5, null);
                        }
                        keyableFloatCopy$default2 = keyableFloatCopy$default;
                    } else {
                        if ((keyframe != null ? keyframe.getSmoothing() : null) == Smoothing.Auto) {
                            AbstractC1951j.mUb(path, (Vector2D) keyframe3.getValue());
                            scratchPathMeasure.setPath(path, false);
                            keyableFloatCopy$default = KeyableFloat.copy$default(keyableFloatCopy$default2, false, CollectionsKt.plus((Collection<? extends Keyframe>) keyableFloatCopy$default2.getKeyframes(), new Keyframe(Float.valueOf(0.0f), keyframe3.getTime(), keyframe3.getEasing(), null, 8, null)), null, 5, null);
                        }
                        keyableFloatCopy$default2 = keyableFloatCopy$default;
                    }
                    i2 = i3;
                }
                keyableFloat = keyableFloatCopy$default2;
            }
            MotionPathInfo motionPathInfo2 = new MotionPathInfo(keyableFloat, path, new PathMeasure(path, false));
            motionPathInfoCache.put(keyable, motionPathInfo2);
            motionPathInfo = motionPathInfo2;
        }
        float fFloatValue = ((Number) valueAtTime(motionPathInfo.getTimeToLengthMap(), env.getTime())).floatValue();
        PathMeasure pathMeasure3 = motionPathInfo.getPathMeasure();
        float[] fArr = posAry;
        pathMeasure3.getPosTan(fFloatValue, fArr, tanAry);
        Vector2D vector2D = new Vector2D(fArr[0], fArr[1]);
        Iterator<T> it2 = keyable.getAnimators().iterator();
        while (it2.hasNext()) {
            vector2D = (Vector2D) ((Animator) it2.next()).animate(vector2D, env);
        }
        return vector2D;
    }

    public static final Smoothing smoothingFromSerializedString(String s2) {
        Intrinsics.checkNotNullParameter(s2, "s");
        String string = StringsKt.trim((CharSequence) s2).toString();
        Locale ENGLISH = Locale.ENGLISH;
        Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
        String lowerCase = string.toLowerCase(ENGLISH);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        if (Intrinsics.areEqual(lowerCase, "none")) {
            return Smoothing.None;
        }
        if (Intrinsics.areEqual(lowerCase, TtmlNode.TEXT_EMPHASIS_AUTO)) {
            return Smoothing.Auto;
        }
        return null;
    }

    @JvmName(name = "translatedByVector3D")
    public static final Keyable<Vector3D> translatedByVector3D(Keyable<Vector3D> keyable, float f3, float f4) {
        Intrinsics.checkNotNullParameter(keyable, "<this>");
        List<Keyframe<Vector3D>> keyframes = keyable.getKeyframes();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(keyframes, 10));
        Iterator<T> it = keyframes.iterator();
        while (it.hasNext()) {
            Keyframe keyframe = (Keyframe) it.next();
            arrayList.add(Keyframe.copy$default(keyframe, new Vector3D(((Vector3D) keyframe.getValue()).getX() + f3, ((Vector3D) keyframe.getValue()).getY() + f4, ((Vector3D) keyframe.getValue()).getZ()), 0.0f, null, null, 14, null));
        }
        return Keyable.DefaultImpls.copyWith$default(keyable, arrayList, false, null, 6, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T valueAtTimeOneFrameEarlier(Keyable<T> keyable, AnimatorEnvironment env) {
        Object value;
        Intrinsics.checkNotNullParameter(keyable, "<this>");
        Intrinsics.checkNotNullParameter(env, "env");
        float previousFrameTime = env.getPreviousFrameTime();
        if (previousFrameTime < 0.0f) {
            return (T) keyable.interp(valueAtTime(keyable, env.getTime()), valueAtTime(keyable, AnimatorKt.getNextFrameTime(env)), -1.0f);
        }
        Keyframe keyframeClosestBeforeTime = closestBeforeTime(keyable, previousFrameTime);
        Keyframe keyframeClosestAfterTime = closestAfterTime(keyable, previousFrameTime);
        if (keyframeClosestBeforeTime == null) {
            if (keyframeClosestAfterTime == null || (value = (T) keyframeClosestAfterTime.getValue()) == null) {
                throw new IllegalStateException();
            }
        } else if (keyframeClosestAfterTime == null) {
            value = keyframeClosestBeforeTime.getValue();
            if (value == null) {
                throw new IllegalStateException();
            }
        } else {
            value = (keyframeClosestBeforeTime == keyframeClosestAfterTime || keyframeClosestAfterTime.getTime() - keyframeClosestBeforeTime.getTime() == 0.0f) ? keyframeClosestBeforeTime.getValue() : keyable.interp(keyframeClosestBeforeTime.getValue(), keyframeClosestAfterTime.getValue(), keyframeClosestAfterTime.getEasing().interpolate((previousFrameTime - keyframeClosestBeforeTime.getTime()) / (keyframeClosestAfterTime.getTime() - keyframeClosestBeforeTime.getTime())));
        }
        Iterator<T> it = keyable.getAnimators().iterator();
        while (it.hasNext()) {
            value = (T) ((Animator) it.next()).animate(value, env);
        }
        return (T) value;
    }

    public static final KeyableFloat keyable(float f3) {
        return new KeyableFloat(false, CollectionsKt.listOf(new Keyframe(Float.valueOf(f3), 0.0f, null, null, 14, null)), CollectionsKt.emptyList());
    }

    public static final KeyableDouble keyable(double d2) {
        return new KeyableDouble(false, CollectionsKt.listOf(new Keyframe(Double.valueOf(d2), 0.0f, null, null, 14, null)), CollectionsKt.emptyList());
    }

    public static final KeyableVector2D keyable(Vector2D value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new KeyableVector2D(false, CollectionsKt.listOf(new Keyframe(value, 0.0f, null, null, 14, null)), CollectionsKt.emptyList());
    }

    public static final KeyableVector3D keyable(Vector3D value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new KeyableVector3D(false, CollectionsKt.listOf(new Keyframe(value, 0.0f, null, null, 14, null)), CollectionsKt.emptyList());
    }

    public static final KeyableVector4D keyable(Vector4D value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new KeyableVector4D(false, CollectionsKt.listOf(new Keyframe(value, 0.0f, null, null, 14, null)), CollectionsKt.emptyList());
    }

    public static final Keyable<Vector3D> scaledBy(Keyable<Vector3D> keyable, float f3, float f4, float f5, float f6, float f7, float f8) {
        Intrinsics.checkNotNullParameter(keyable, "<this>");
        List<Keyframe<Vector3D>> keyframes = keyable.getKeyframes();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(keyframes, 10));
        Iterator<T> it = keyframes.iterator();
        while (it.hasNext()) {
            Keyframe keyframe = (Keyframe) it.next();
            arrayList.add(Keyframe.copy$default(keyframe, new Vector3D(((((Vector3D) keyframe.getValue()).getX() - f6) * f3) + f6, ((((Vector3D) keyframe.getValue()).getY() - f7) * f4) + f7, ((((Vector3D) keyframe.getValue()).getZ() - f8) * f5) + f8), 0.0f, null, null, 14, null));
        }
        return Keyable.DefaultImpls.copyWith$default(keyable, arrayList, false, null, 6, null);
    }

    public static final Keyable<Vector3D> translatedBy(Keyable<Vector3D> keyable, float f3, float f4, float f5) {
        Intrinsics.checkNotNullParameter(keyable, "<this>");
        List<Keyframe<Vector3D>> keyframes = keyable.getKeyframes();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(keyframes, 10));
        Iterator<T> it = keyframes.iterator();
        while (it.hasNext()) {
            Keyframe keyframe = (Keyframe) it.next();
            arrayList.add(Keyframe.copy$default(keyframe, new Vector3D(((Vector3D) keyframe.getValue()).getX() + f3, ((Vector3D) keyframe.getValue()).getY() + f4, ((Vector3D) keyframe.getValue()).getZ() + f5), 0.0f, null, null, 14, null));
        }
        return Keyable.DefaultImpls.copyWith$default(keyable, arrayList, false, null, 6, null);
    }

    public static final KeyableQuaternion keyable(Quaternion value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new KeyableQuaternion(false, CollectionsKt.listOf(new Keyframe(value, 0.0f, null, null, 14, null)), CollectionsKt.emptyList());
    }

    public static final KeyableSolidColor keyable(SolidColor value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new KeyableSolidColor(false, CollectionsKt.listOf(new Keyframe(value, 0.0f, null, null, 14, null)), CollectionsKt.emptyList());
    }

    public static final /* synthetic */ <T> Keyable<T> keyable(List<Keyframe<T>> keyframes) {
        Intrinsics.checkNotNullParameter(keyframes, "keyframes");
        Intrinsics.reifiedOperationMarker(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Float.TYPE))) {
            return new KeyableFloat(true, keyframes, CollectionsKt.emptyList());
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
            return new KeyableDouble(true, keyframes, CollectionsKt.emptyList());
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Vector2D.class))) {
            return new KeyableVector2D(true, keyframes, CollectionsKt.emptyList());
        }
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(SolidColor.class))) {
            return new KeyableSolidColor(true, keyframes, CollectionsKt.emptyList());
        }
        throw new NotImplementedError("An operation is not implemented: Not Implemented");
    }

    public static final Keyable<Vector2D> translatedBy(Keyable<Vector2D> keyable, Vector2D offset) {
        Intrinsics.checkNotNullParameter(keyable, "<this>");
        Intrinsics.checkNotNullParameter(offset, "offset");
        List<Keyframe<Vector2D>> keyframes = keyable.getKeyframes();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(keyframes, 10));
        Iterator<T> it = keyframes.iterator();
        while (it.hasNext()) {
            Keyframe keyframe = (Keyframe) it.next();
            arrayList.add(Keyframe.copy$default(keyframe, new Vector2D(((Vector2D) keyframe.getValue()).getX() + offset.getX(), ((Vector2D) keyframe.getValue()).getY() + offset.getY()), 0.0f, null, null, 14, null));
        }
        return Keyable.DefaultImpls.copyWith$default(keyable, arrayList, false, null, 6, null);
    }

    public static final KeyableFloat keyable(float... values) {
        Intrinsics.checkNotNullParameter(values, "values");
        ArrayList arrayList = new ArrayList(values.length);
        int length = values.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            arrayList.add(new Keyframe(Float.valueOf(values[i2]), i3 / (values.length - 1), null, null, 12, null));
            i2++;
            i3++;
        }
        return new KeyableFloat(true, arrayList, CollectionsKt.emptyList());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T valueAtTime(Keyable<T> keyable, AnimatorEnvironment env) {
        Object value;
        Intrinsics.checkNotNullParameter(keyable, "<this>");
        Intrinsics.checkNotNullParameter(env, "env");
        float time = env.getTime();
        Keyframe keyframeClosestBeforeTime = closestBeforeTime(keyable, time);
        Keyframe keyframeClosestAfterTime = closestAfterTime(keyable, time);
        if (keyframeClosestBeforeTime == null) {
            if (keyframeClosestAfterTime == null || (value = (T) keyframeClosestAfterTime.getValue()) == null) {
                throw new IllegalStateException();
            }
        } else if (keyframeClosestAfterTime == null) {
            value = keyframeClosestBeforeTime.getValue();
            if (value == null) {
                throw new IllegalStateException();
            }
        } else if (keyframeClosestBeforeTime != keyframeClosestAfterTime && keyframeClosestAfterTime.getTime() - keyframeClosestBeforeTime.getTime() != 0.0f) {
            value = keyable.interp(keyframeClosestBeforeTime.getValue(), keyframeClosestAfterTime.getValue(), keyframeClosestAfterTime.getEasing().interpolate((time - keyframeClosestBeforeTime.getTime()) / (keyframeClosestAfterTime.getTime() - keyframeClosestBeforeTime.getTime())));
        } else {
            value = keyframeClosestBeforeTime.getValue();
        }
        Iterator<T> it = keyable.getAnimators().iterator();
        while (it.hasNext()) {
            value = (T) ((Animator) it.next()).animate(value, env);
        }
        return (T) value;
    }

    public static final KeyableDouble keyable(double... values) {
        Intrinsics.checkNotNullParameter(values, "values");
        ArrayList arrayList = new ArrayList(values.length);
        int length = values.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            arrayList.add(new Keyframe(Double.valueOf(values[i2]), i3 / (values.length - 1), null, null, 12, null));
            i2++;
            i3++;
        }
        return new KeyableDouble(true, arrayList, CollectionsKt.emptyList());
    }

    public static final Keyable<Vector3D> translatedBy(Keyable<Vector3D> keyable, Vector3D offset) {
        Intrinsics.checkNotNullParameter(keyable, "<this>");
        Intrinsics.checkNotNullParameter(offset, "offset");
        List<Keyframe<Vector3D>> keyframes = keyable.getKeyframes();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(keyframes, 10));
        Iterator<T> it = keyframes.iterator();
        while (it.hasNext()) {
            Keyframe keyframe = (Keyframe) it.next();
            arrayList.add(Keyframe.copy$default(keyframe, new Vector3D(((Vector3D) keyframe.getValue()).getX() + offset.getX(), ((Vector3D) keyframe.getValue()).getY() + offset.getY(), ((Vector3D) keyframe.getValue()).getZ() + offset.getZ()), 0.0f, null, null, 14, null));
        }
        return Keyable.DefaultImpls.copyWith$default(keyable, arrayList, false, null, 6, null);
    }

    public static final KeyableVector2D keyable(Vector2D... values) {
        Intrinsics.checkNotNullParameter(values, "values");
        ArrayList arrayList = new ArrayList(values.length);
        int length = values.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            arrayList.add(new Keyframe(values[i2], i3 / (values.length - 1), null, null, 12, null));
            i2++;
            i3++;
        }
        return new KeyableVector2D(true, arrayList, CollectionsKt.emptyList());
    }

    public static final KeyableVector2D translatedBy(KeyableVector2D keyableVector2D, float f3, float f4) {
        Intrinsics.checkNotNullParameter(keyableVector2D, "<this>");
        List<Keyframe<Vector2D>> keyframes = keyableVector2D.getKeyframes();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(keyframes, 10));
        Iterator<T> it = keyframes.iterator();
        while (it.hasNext()) {
            Keyframe keyframe = (Keyframe) it.next();
            arrayList.add(Keyframe.copy$default(keyframe, new Vector2D(((Vector2D) keyframe.getValue()).getX() + f3, ((Vector2D) keyframe.getValue()).getY() + f4), 0.0f, null, null, 14, null));
        }
        return (KeyableVector2D) Keyable.DefaultImpls.copyWith$default(keyableVector2D, arrayList, false, null, 6, null);
    }

    public static final KeyableSolidColor keyable(SolidColor... values) {
        Intrinsics.checkNotNullParameter(values, "values");
        ArrayList arrayList = new ArrayList(values.length);
        int length = values.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            arrayList.add(new Keyframe(values[i2], i3 / (values.length - 1), null, null, 12, null));
            i2++;
            i3++;
        }
        return new KeyableSolidColor(true, arrayList, CollectionsKt.emptyList());
    }
}
