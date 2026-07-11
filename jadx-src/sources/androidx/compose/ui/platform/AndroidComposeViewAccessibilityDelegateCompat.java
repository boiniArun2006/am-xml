package androidx.compose.ui.platform;

import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.text.SpannableString;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.RequiresApi;
import androidx.collection.ArraySet;
import androidx.collection.IntList;
import androidx.collection.IntListKt;
import androidx.collection.IntObjectMap;
import androidx.collection.IntObjectMapKt;
import androidx.collection.IntSetKt;
import androidx.collection.MutableIntIntMap;
import androidx.collection.MutableIntList;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableIntSet;
import androidx.collection.MutableObjectIntMap;
import androidx.collection.MutableScatterMap;
import androidx.collection.ObjectIntMapKt;
import androidx.collection.SparseArrayCompat;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.R;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.HitTestResult;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AccessibilityIterators;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.accessibility.CollectionInfo_androidKt;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.CustomAccessibilityAction;
import androidx.compose.ui.semantics.LiveRegionMode;
import androidx.compose.ui.semantics.ProgressBarRangeInfo;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsNodeKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesAndroid;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.platform.AndroidAccessibilitySpannableString_androidKt;
import androidx.compose.ui.text.platform.URLSpanCache;
import androidx.compose.ui.util.ListUtilsKt;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.view.Lifecycle;
import androidx.view.LifecycleOwner;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import com.safedk.android.analytics.events.a;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000è\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\n³\u0002´\u0002µ\u0002¶\u0002·\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J8\u0010\u000f\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010#\u001a\u0004\u0018\u00010\"*\u00020!H\u0002¢\u0006\u0004\b#\u0010$J\u001f\u0010%\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0012H\u0002¢\u0006\u0004\b%\u0010 J\u0017\u0010&\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\b(\u0010'J=\u0010.\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020\u000b2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010-\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010+H\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00102\u001a\u00020\t2\u0006\u00101\u001a\u000200H\u0002¢\u0006\u0004\b2\u00103J\u001f\u00104\u001a\u0002002\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020\u000bH\u0003¢\u0006\u0004\b4\u00105J?\u0010;\u001a\u0002002\u0006\u0010\u0011\u001a\u00020\u000b2\b\u00106\u001a\u0004\u0018\u00010\u000b2\b\u00107\u001a\u0004\u0018\u00010\u000b2\b\u00108\u001a\u0004\u0018\u00010\u000b2\b\u0010:\u001a\u0004\u0018\u000109H\u0002¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\b=\u0010'J)\u0010A\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010>\u001a\u00020\u000b2\b\u0010@\u001a\u0004\u0018\u00010?H\u0002¢\u0006\u0004\bA\u0010BJ1\u0010D\u001a\u00020\u001c2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00122\u0006\u0010C\u001a\u00020,2\b\u0010@\u001a\u0004\u0018\u00010?H\u0002¢\u0006\u0004\bD\u0010EJ#\u0010J\u001a\u0004\u0018\u00010I2\b\u0010F\u001a\u0004\u0018\u00010\u001a2\u0006\u0010H\u001a\u00020GH\u0002¢\u0006\u0004\bJ\u0010KJ\u0017\u0010L\u001a\u00020\u001c2\u0006\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\bL\u0010MJ/\u0010P\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010N*\u0002092\b\u0010:\u001a\u0004\u0018\u00018\u00002\b\b\u0001\u0010O\u001a\u00020\u000bH\u0002¢\u0006\u0004\bP\u0010QJ\u0017\u0010T\u001a\u00020\u001c2\u0006\u0010S\u001a\u00020RH\u0002¢\u0006\u0004\bT\u0010UJ\u0017\u0010V\u001a\u00020\u001c2\u0006\u0010S\u001a\u00020RH\u0002¢\u0006\u0004\bV\u0010UJ\u001f\u0010Y\u001a\u00020\u001c2\u0006\u0010S\u001a\u00020R2\u0006\u0010X\u001a\u00020WH\u0002¢\u0006\u0004\bY\u0010ZJ\u000f\u0010[\u001a\u00020\u001cH\u0002¢\u0006\u0004\b[\u0010\\J\u000f\u0010]\u001a\u00020\u001cH\u0002¢\u0006\u0004\b]\u0010\\J\u001d\u0010_\u001a\u00020\u001c2\f\u0010^\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b_\u0010`J%\u0010d\u001a\u00020\t2\u0006\u0010a\u001a\u00020\u000b2\f\u0010c\u001a\b\u0012\u0004\u0012\u00020b0+H\u0002¢\u0006\u0004\bd\u0010eJ\u0017\u0010g\u001a\u00020\u001c2\u0006\u0010f\u001a\u00020bH\u0002¢\u0006\u0004\bg\u0010hJ)\u0010k\u001a\u00020\u001c2\u0006\u0010i\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020\u000b2\b\u0010j\u001a\u0004\u0018\u00010,H\u0002¢\u0006\u0004\bk\u0010lJ\u001f\u0010p\u001a\u00020\u001c2\u0006\u0010m\u001a\u00020\u001a2\u0006\u0010o\u001a\u00020nH\u0002¢\u0006\u0004\bp\u0010qJ\u0017\u0010r\u001a\u00020\u000b2\u0006\u0010a\u001a\u00020\u000bH\u0002¢\u0006\u0004\br\u0010sJ/\u0010w\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u001a2\u0006\u0010t\u001a\u00020\u000b2\u0006\u0010u\u001a\u00020\t2\u0006\u0010v\u001a\u00020\tH\u0002¢\u0006\u0004\bw\u0010xJ\u0017\u0010y\u001a\u00020\u001c2\u0006\u0010i\u001a\u00020\u000bH\u0002¢\u0006\u0004\by\u0010MJ/\u0010}\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u001a2\u0006\u0010z\u001a\u00020\u000b2\u0006\u0010{\u001a\u00020\u000b2\u0006\u0010|\u001a\u00020\tH\u0002¢\u0006\u0004\b}\u0010~J\u0018\u0010\u007f\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u001aH\u0002¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\u001a\u0010\u0081\u0001\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u001aH\u0002¢\u0006\u0006\b\u0081\u0001\u0010\u0080\u0001J\u001a\u0010\u0082\u0001\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u001aH\u0002¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J'\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0084\u00012\b\u0010\u0015\u001a\u0004\u0018\u00010\u001a2\u0006\u0010t\u001a\u00020\u000bH\u0002¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\u001e\u0010\u0087\u0001\u001a\u0004\u0018\u00010,2\b\u0010\u0015\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\u0019\u0010\u008a\u0001\u001a\u0004\u0018\u00010!*\u00030\u0089\u0001H\u0002¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J-\u0010\u008c\u0001\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0000ø\u0001\u0000¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J\u001b\u0010\u008f\u0001\u001a\u00020\t2\u0007\u00101\u001a\u00030\u008e\u0001H\u0000¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J&\u0010\u0094\u0001\u001a\u00020\u000b2\b\u0010\u0092\u0001\u001a\u00030\u0091\u00012\b\u0010\u0093\u0001\u001a\u00030\u0091\u0001H\u0001¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J\u001d\u0010\u0099\u0001\u001a\u00030\u0098\u00012\b\u0010\u0097\u0001\u001a\u00030\u0096\u0001H\u0016¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J\u0011\u0010\u009b\u0001\u001a\u00020\u001cH\u0000¢\u0006\u0005\b\u009b\u0001\u0010\\J\u0013\u0010\u009c\u0001\u001a\u00020\u001cH\u0080@¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001J\u0019\u0010\u009e\u0001\u001a\u00020\u001c2\u0006\u0010S\u001a\u00020RH\u0000¢\u0006\u0005\b\u009e\u0001\u0010UR\u001b\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0010\n\u0006\b\u009f\u0001\u0010 \u0001\u001a\u0006\b¡\u0001\u0010¢\u0001R/\u0010©\u0001\u001a\u00020\u000b8\u0000@\u0000X\u0081\u000e¢\u0006\u001e\n\u0006\b£\u0001\u0010¤\u0001\u0012\u0005\b¨\u0001\u0010\\\u001a\u0006\b¥\u0001\u0010¦\u0001\"\u0005\b§\u0001\u0010MR=\u0010²\u0001\u001a\u000f\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\t0ª\u00018\u0000@\u0000X\u0081\u000e¢\u0006\u001f\n\u0006\b«\u0001\u0010¬\u0001\u0012\u0005\b±\u0001\u0010\\\u001a\u0006\b\u00ad\u0001\u0010®\u0001\"\u0006\b¯\u0001\u0010°\u0001R\u0018\u0010¶\u0001\u001a\u00030³\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b´\u0001\u0010µ\u0001R2\u0010¾\u0001\u001a\u00020\t2\u0007\u0010·\u0001\u001a\u00020\t8\u0000@@X\u0080\u000e¢\u0006\u0018\n\u0006\b¸\u0001\u0010¹\u0001\u001a\u0006\bº\u0001\u0010»\u0001\"\u0006\b¼\u0001\u0010½\u0001R*\u0010Æ\u0001\u001a\u00030¿\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÀ\u0001\u0010Á\u0001\u001a\u0006\bÂ\u0001\u0010Ã\u0001\"\u0006\bÄ\u0001\u0010Å\u0001R\u0018\u0010Ê\u0001\u001a\u00030Ç\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÈ\u0001\u0010É\u0001R\u0018\u0010Î\u0001\u001a\u00030Ë\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÌ\u0001\u0010Í\u0001RE\u0010Ô\u0001\u001a.\u0012\u000f\u0012\r Ñ\u0001*\u0005\u0018\u00010Ð\u00010Ð\u0001 Ñ\u0001*\u0015\u0012\u000f\u0012\r Ñ\u0001*\u0005\u0018\u00010Ð\u00010Ð\u0001\u0018\u00010+0Ï\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÒ\u0001\u0010Ó\u0001R\u0018\u0010Ø\u0001\u001a\u00030Õ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÖ\u0001\u0010×\u0001R\u001e\u0010Ü\u0001\u001a\u00070Ù\u0001R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÚ\u0001\u0010Û\u0001R\u0019\u0010Þ\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÝ\u0001\u0010¤\u0001R\u0019\u0010à\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bß\u0001\u0010¤\u0001R\u001b\u0010ã\u0001\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bá\u0001\u0010â\u0001R\u001b\u0010å\u0001\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bä\u0001\u0010â\u0001R\u0019\u0010ç\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bæ\u0001\u0010¹\u0001R\u001f\u0010ë\u0001\u001a\n\u0012\u0005\u0012\u00030é\u00010è\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¹\u0001\u0010ê\u0001R\u001f\u0010í\u0001\u001a\n\u0012\u0005\u0012\u00030é\u00010è\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bì\u0001\u0010ê\u0001R'\u0010ñ\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0004\u0012\u0002090î\u00010î\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bï\u0001\u0010ð\u0001R'\u0010ô\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0004\u0012\u0002090ò\u00010î\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bó\u0001\u0010ð\u0001R\u0019\u0010ö\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bõ\u0001\u0010¤\u0001R\u001b\u0010ù\u0001\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b÷\u0001\u0010ø\u0001R\u001e\u0010ý\u0001\u001a\t\u0012\u0004\u0012\u00020R0ú\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bû\u0001\u0010ü\u0001R\u001e\u0010\u0081\u0002\u001a\t\u0012\u0004\u0012\u00020\u001c0þ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÿ\u0001\u0010\u0080\u0002R\u0019\u0010\u0083\u0002\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0002\u0010¹\u0001R\u001c\u0010\u0087\u0002\u001a\u0005\u0018\u00010\u0084\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0002\u0010\u0086\u0002R&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068B@\u0002X\u0082\u000e¢\u0006\u0010\n\u0006\b\u0088\u0002\u0010\u0089\u0002\u001a\u0006\bÁ\u0001\u0010\u008a\u0002R\u0019\u0010\u008d\u0002\u001a\u00020W8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0002\u0010\u008c\u0002R*\u0010\u0095\u0002\u001a\u00030\u008e\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u008f\u0002\u0010\u0090\u0002\u001a\u0006\b\u0091\u0002\u0010\u0092\u0002\"\u0006\b\u0093\u0002\u0010\u0094\u0002R*\u0010\u0098\u0002\u001a\u00030\u008e\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0096\u0002\u0010\u0090\u0002\u001a\u0006\b¤\u0001\u0010\u0092\u0002\"\u0006\b\u0097\u0002\u0010\u0094\u0002R\u001e\u0010\u009c\u0002\u001a\u00020,8\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\bN\u0010\u0099\u0002\u001a\u0006\b\u009a\u0002\u0010\u009b\u0002R\u001f\u0010\u009f\u0002\u001a\u00020,8\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u009d\u0002\u0010\u0099\u0002\u001a\u0006\b\u009e\u0002\u0010\u009b\u0002R\u0018\u0010£\u0002\u001a\u00030 \u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¡\u0002\u0010¢\u0002R \u0010¥\u0002\u001a\t\u0012\u0004\u0012\u00020n0è\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¤\u0002\u0010ê\u0001R\u0019\u0010¨\u0002\u001a\u00020n8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¦\u0002\u0010§\u0002R\u0018\u0010©\u0002\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bD\u0010¹\u0001R\u0017\u0010¬\u0002\u001a\u00030ª\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0017\u0010«\u0002R\u001e\u0010\u00ad\u0002\u001a\t\u0012\u0004\u0012\u00020b0Ï\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009c\u0001\u0010Ó\u0001R$\u0010®\u0002\u001a\u000f\u0012\u0004\u0012\u00020b\u0012\u0004\u0012\u00020\u001c0ª\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008c\u0001\u0010¬\u0001R\u0017\u0010°\u0002\u001a\u00020\t8BX\u0082\u0004¢\u0006\b\u001a\u0006\b¯\u0002\u0010»\u0001R\u0017\u0010²\u0002\u001a\u00020\t8@X\u0080\u0004¢\u0006\b\u001a\u0006\b±\u0002\u0010»\u0001\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006¸\u0002"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;", "Landroidx/core/view/AccessibilityDelegateCompat;", "Landroidx/compose/ui/platform/AndroidComposeView;", "view", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;)V", "Landroidx/collection/IntObjectMap;", "Landroidx/compose/ui/platform/SemanticsNodeWithAdjustedBounds;", "currentSemanticsNodes", "", "vertical", "", "direction", "Landroidx/compose/ui/geometry/Offset;", "position", "jB", "(Landroidx/collection/IntObjectMap;ZIJ)Z", "virtualViewId", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", "p5", "(I)Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", "node", "Landroid/graphics/Rect;", "rV9", "(Landroidx/compose/ui/platform/SemanticsNodeWithAdjustedBounds;)Landroid/graphics/Rect;", "info", "Landroidx/compose/ui/semantics/SemanticsNode;", "semanticsNode", "", "fcU", "(ILandroidx/core/view/accessibility/AccessibilityNodeInfoCompat;Landroidx/compose/ui/semantics/SemanticsNode;)V", "tUK", "(Landroidx/compose/ui/semantics/SemanticsNode;Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;)V", "Landroidx/compose/ui/text/AnnotatedString;", "Landroid/text/SpannableString;", "W", "(Landroidx/compose/ui/text/AnnotatedString;)Landroid/text/SpannableString;", "lLA", "piY", "(I)Z", "Jk", "eventType", "contentChangeType", "", "", "contentDescription", "GD", "(IILjava/lang/Integer;Ljava/util/List;)Z", "Landroid/view/accessibility/AccessibilityEvent;", a.f62811a, "HV", "(Landroid/view/accessibility/AccessibilityEvent;)Z", "M7", "(II)Landroid/view/accessibility/AccessibilityEvent;", "fromIndex", "toIndex", "itemCount", "", "text", "eF", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/CharSequence;)Landroid/view/accessibility/AccessibilityEvent;", "P5", FileUploadManager.f61572j, "Landroid/os/Bundle;", "arguments", "C", "(IILandroid/os/Bundle;)Z", "extraDataKey", "v", "(ILandroidx/core/view/accessibility/AccessibilityNodeInfoCompat;Ljava/lang/String;Landroid/os/Bundle;)V", "textNode", "Landroidx/compose/ui/geometry/Rect;", "bounds", "Landroid/graphics/RectF;", "kSg", "(Landroidx/compose/ui/semantics/SemanticsNode;Landroidx/compose/ui/geometry/Rect;)Landroid/graphics/RectF;", "QZ6", "(I)V", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "size", "F", "(Ljava/lang/CharSequence;I)Ljava/lang/CharSequence;", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "xg", "(Landroidx/compose/ui/node/LayoutNode;)V", "K", "Landroidx/collection/MutableIntSet;", "subtreeChangedSemanticsNodesIds", CmcdData.OBJECT_TYPE_INIT_SEGMENT, "(Landroidx/compose/ui/node/LayoutNode;Landroidx/collection/MutableIntSet;)V", "U", "()V", "tFV", "newSemanticsNodes", "UhV", "(Landroidx/collection/IntObjectMap;)V", "id", "Landroidx/compose/ui/platform/ScrollObservationScope;", "oldScrollObservationScopes", "n1", "(ILjava/util/List;)Z", "scrollObservationScope", "Rl", "(Landroidx/compose/ui/platform/ScrollObservationScope;)V", "semanticsNodeId", "title", "EWS", "(IILjava/lang/String;)V", "newNode", "Landroidx/compose/ui/platform/SemanticsNodeCopy;", "oldNode", "Org", "(Landroidx/compose/ui/semantics/SemanticsNode;Landroidx/compose/ui/platform/SemanticsNodeCopy;)V", "mYa", "(I)I", "granularity", "forward", "extendSelection", "a63", "(Landroidx/compose/ui/semantics/SemanticsNode;IZZ)Z", "hRu", TtmlNode.START, TtmlNode.END, "traversalMode", "How", "(Landroidx/compose/ui/semantics/SemanticsNode;IIZ)Z", "B", "(Landroidx/compose/ui/semantics/SemanticsNode;)I", "FX", "ijL", "(Landroidx/compose/ui/semantics/SemanticsNode;)Z", "Landroidx/compose/ui/platform/AccessibilityIterators$TextSegmentIterator;", "Y", "(Landroidx/compose/ui/semantics/SemanticsNode;I)Landroidx/compose/ui/platform/AccessibilityIterators$TextSegmentIterator;", "Nxk", "(Landroidx/compose/ui/semantics/SemanticsNode;)Ljava/lang/String;", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "k", "(Landroidx/compose/ui/semantics/SemanticsConfiguration;)Landroidx/compose/ui/text/AnnotatedString;", "Xw", "(ZIJ)Z", "Landroid/view/MotionEvent;", "E", "(Landroid/view/MotionEvent;)Z", "", "x", "y", "z", "(FF)I", "Landroid/view/View;", "host", "Landroidx/core/view/accessibility/AccessibilityNodeProviderCompat;", "rl", "(Landroid/view/View;)Landroidx/core/view/accessibility/AccessibilityNodeProviderCompat;", "ofS", "bzg", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pJg", "nr", "Landroidx/compose/ui/platform/AndroidComposeView;", "dR0", "()Landroidx/compose/ui/platform/AndroidComposeView;", "O", "I", "getHoveredVirtualViewId$ui_release", "()I", "setHoveredVirtualViewId$ui_release", "getHoveredVirtualViewId$ui_release$annotations", "hoveredVirtualViewId", "Lkotlin/Function1;", "J2", "Lkotlin/jvm/functions/Function1;", "getOnSendAccessibilityEvent$ui_release", "()Lkotlin/jvm/functions/Function1;", "setOnSendAccessibilityEvent$ui_release", "(Lkotlin/jvm/functions/Function1;)V", "getOnSendAccessibilityEvent$ui_release$annotations", "onSendAccessibilityEvent", "Landroid/view/accessibility/AccessibilityManager;", "Uo", "Landroid/view/accessibility/AccessibilityManager;", "accessibilityManager", "value", "KN", "Z", "getAccessibilityForceEnabledForTesting$ui_release", "()Z", "setAccessibilityForceEnabledForTesting$ui_release", "(Z)V", "accessibilityForceEnabledForTesting", "", "xMQ", "J", "getSendRecurringAccessibilityEventsIntervalMillis$ui_release", "()J", "ER", "(J)V", "SendRecurringAccessibilityEventsIntervalMillis", "Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;", "mUb", "Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;", "enabledStateListener", "Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;", "gh", "Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;", "touchExplorationStateListener", "", "Landroid/accessibilityservice/AccessibilityServiceInfo;", "kotlin.jvm.PlatformType", "qie", "Ljava/util/List;", "enabledServices", "Landroid/os/Handler;", "az", "Landroid/os/Handler;", "handler", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$ComposeAccessibilityNodeProvider;", "ty", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$ComposeAccessibilityNodeProvider;", "nodeProvider", "HI", "accessibilityFocusedVirtualViewId", "ck", "focusedVirtualViewId", "Ik", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", "currentlyAccessibilityFocusedANI", "r", "currentlyFocusedANI", "o", "sendingFocusAffectingEvent", "Landroidx/collection/MutableIntObjectMap;", "Landroidx/compose/ui/semantics/ScrollAxisRange;", "Landroidx/collection/MutableIntObjectMap;", "pendingHorizontalScrollEvents", "XQ", "pendingVerticalScrollEvents", "Landroidx/collection/SparseArrayCompat;", "S", "Landroidx/collection/SparseArrayCompat;", "actionIdToLabel", "Landroidx/collection/MutableObjectIntMap;", "WPU", "labelToActionId", "aYN", "accessibilityCursorPosition", "ViF", "Ljava/lang/Integer;", "previousTraversedNode", "Landroidx/collection/ArraySet;", "nY", "Landroidx/collection/ArraySet;", "subtreeChangedLayoutNodes", "LILs/CN3;", "g", "LILs/CN3;", "boundsUpdateChannel", "te", "currentSemanticsNodesInvalidated", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$PendingTextTraversedEvent;", "iF", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$PendingTextTraversedEvent;", "pendingTextTraversedEvent", "fD", "Landroidx/collection/IntObjectMap;", "()Landroidx/collection/IntObjectMap;", "E2", "Landroidx/collection/MutableIntSet;", "paneDisplayed", "Landroidx/collection/MutableIntIntMap;", "e", "Landroidx/collection/MutableIntIntMap;", "GR", "()Landroidx/collection/MutableIntIntMap;", "setIdToBeforeMap$ui_release", "(Landroidx/collection/MutableIntIntMap;)V", "idToBeforeMap", "X", "setIdToAfterMap$ui_release", "idToAfterMap", "Ljava/lang/String;", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "()Ljava/lang/String;", "ExtraDataTestTraversalBeforeVal", "N", "D", "ExtraDataTestTraversalAfterVal", "Landroidx/compose/ui/text/platform/URLSpanCache;", "nHg", "Landroidx/compose/ui/text/platform/URLSpanCache;", "urlSpanCache", "s7N", "previousSemanticsNodes", "wTp", "Landroidx/compose/ui/platform/SemanticsNodeCopy;", "previousSemanticsRoot", "checkingForSemanticsChanges", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "semanticsChangeChecker", "scrollObservationScopes", "scheduleScrollEventIfNeededLambda", "eTf", "isTouchExplorationEnabled", "m", "isEnabled", "Api24Impl", "Api29Impl", "Companion", "ComposeAccessibilityNodeProvider", "PendingTextTraversedEvent", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAndroidComposeViewAccessibilityDelegateCompat.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 IntObjectMap.kt\nandroidx/collection/IntObjectMap\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 6 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 7 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 8 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 9 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 10 IntList.kt\nandroidx/collection/IntList\n+ 11 IntList.kt\nandroidx/collection/IntListKt\n+ 12 ObjectIntMap.kt\nandroidx/collection/ObjectIntMap\n+ 13 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 14 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 15 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 16 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 17 AndroidTrace.android.kt\nandroidx/compose/ui/util/AndroidTrace_androidKt\n+ 18 IntSet.kt\nandroidx/collection/IntSet\n+ 19 ScatterMap.kt\nandroidx/collection/ScatterMap\n*L\n1#1,3362:1\n111#2,2:3363\n65#2:3404\n69#2:3407\n65#2:3410\n69#2:3413\n65#2:3472\n69#2:3475\n65#2:3478\n69#2:3481\n397#3,3:3365\n354#3,6:3368\n364#3,3:3375\n367#3,9:3379\n400#3:3388\n425#3:3420\n382#3,4:3531\n354#3,6:3535\n364#3,3:3542\n367#3,9:3546\n386#3:3555\n390#3,3:3556\n354#3,6:3559\n364#3,3:3566\n367#3,2:3570\n370#3,6:3615\n393#3:3621\n425#3:3626\n425#3:3658\n1399#4:3374\n1270#4:3378\n1399#4:3516\n1270#4:3520\n1399#4:3541\n1270#4:3545\n1399#4:3565\n1270#4:3569\n1399#4:3589\n1270#4:3593\n1399#4:3639\n1270#4:3643\n76#5,7:3389\n76#5,7:3572\n30#6:3396\n30#6:3400\n30#6:3464\n30#6:3468\n30#6:3484\n53#7,3:3397\n53#7,3:3401\n60#7:3405\n70#7:3408\n60#7:3411\n70#7:3414\n60#7:3451\n70#7:3454\n53#7,3:3465\n53#7,3:3469\n60#7:3473\n70#7:3476\n60#7:3479\n70#7:3482\n53#7,3:3485\n22#8:3406\n22#8:3409\n22#8:3412\n22#8:3415\n22#8:3452\n22#8:3455\n22#8:3474\n22#8:3477\n22#8:3480\n22#8:3483\n34#9,4:3416\n39#9:3421\n34#9,4:3431\n39#9:3436\n70#9,6:3437\n70#9,6:3443\n34#9,6:3456\n34#9,6:3596\n34#9,6:3602\n34#9,4:3622\n39#9:3627\n34#9,4:3654\n39#9:3659\n65#10:3422\n65#10:3423\n237#10,6:3425\n905#11:3424\n438#12:3435\n1#13:3449\n57#14:3450\n61#14:3453\n37#15,2:3462\n91#16:3488\n91#16:3489\n26#17,5:3490\n26#17,5:3495\n26#17,5:3500\n26#17,5:3660\n26#17,5:3665\n255#18,4:3505\n225#18,7:3509\n236#18,3:3517\n239#18,9:3521\n259#18:3530\n255#18,4:3628\n225#18,7:3632\n236#18,3:3640\n239#18,9:3644\n259#18:3653\n357#19,4:3579\n329#19,6:3583\n339#19,3:3590\n342#19,2:3594\n345#19,6:3608\n361#19:3614\n*S KotlinDebug\n*F\n+ 1 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat\n*L\n468#1:3363,2\n555#1:3404\n556#1:3407\n557#1:3410\n558#1:3413\n1723#1:3472\n1724#1:3475\n1725#1:3478\n1726#1:3481\n477#1:3365,3\n477#1:3368,6\n477#1:3375,3\n477#1:3379,9\n477#1:3388\n616#1:3420\n2087#1:3531,4\n2087#1:3535,6\n2087#1:3542,3\n2087#1:3546,9\n2087#1:3555\n2110#1:3556,3\n2110#1:3559,6\n2110#1:3566,3\n2110#1:3570,2\n2110#1:3615,6\n2110#1:3621\n2578#1:3626\n2596#1:3658\n477#1:3374\n477#1:3378\n2069#1:3516\n2069#1:3520\n2087#1:3541\n2087#1:3545\n2110#1:3565\n2110#1:3569\n2121#1:3589\n2121#1:3593\n2588#1:3639\n2588#1:3643\n530#1:3389,7\n2115#1:3572,7\n550#1:3396\n552#1:3400\n1719#1:3464\n1721#1:3468\n1797#1:3484\n550#1:3397,3\n552#1:3401,3\n555#1:3405\n556#1:3408\n557#1:3411\n558#1:3414\n1415#1:3451\n1450#1:3454\n1719#1:3465,3\n1721#1:3469,3\n1723#1:3473\n1724#1:3476\n1725#1:3479\n1726#1:3482\n1797#1:3485,3\n555#1:3406\n556#1:3409\n557#1:3412\n558#1:3415\n1415#1:3452\n1450#1:3455\n1723#1:3474\n1724#1:3477\n1725#1:3480\n1726#1:3483\n615#1:3416,4\n615#1:3421\n1007#1:3431,4\n1007#1:3436\n1018#1:3437,6\n1025#1:3443,6\n1628#1:3456,6\n2396#1:3596,6\n2398#1:3602,6\n2577#1:3622,4\n2577#1:3627\n2595#1:3654,4\n2595#1:3659\n987#1:3422\n990#1:3423\n1004#1:3425,6\n1003#1:3424\n1008#1:3435\n1415#1:3450\n1450#1:3453\n1690#1:3462,2\n1812#1:3488\n2025#1:3489\n2051#1:3490,5\n2060#1:3495,5\n2063#1:3500,5\n1891#1:3660,5\n1892#1:3665,5\n2069#1:3505,4\n2069#1:3509,7\n2069#1:3517,3\n2069#1:3521,9\n2069#1:3530\n2588#1:3628,4\n2588#1:3632,7\n2588#1:3640,3\n2588#1:3644,9\n2588#1:3653\n2121#1:3579,4\n2121#1:3583,6\n2121#1:3590,3\n2121#1:3594,2\n2121#1:3608,6\n2121#1:3614\n*E\n"})
public final class AndroidComposeViewAccessibilityDelegateCompat extends AccessibilityDelegateCompat {

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    private MutableIntSet paneDisplayed;

    /* JADX INFO: renamed from: HI, reason: from kotlin metadata */
    private int accessibilityFocusedVirtualViewId;

    /* JADX INFO: renamed from: Ik, reason: from kotlin metadata */
    private AccessibilityNodeInfoCompat currentlyAccessibilityFocusedANI;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private boolean accessibilityForceEnabledForTesting;

    /* JADX INFO: renamed from: N, reason: collision with root package name and from kotlin metadata */
    private final String ExtraDataTestTraversalAfterVal;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private SparseArrayCompat actionIdToLabel;

    /* JADX INFO: renamed from: T, reason: collision with root package name and from kotlin metadata */
    private final String ExtraDataTestTraversalBeforeVal;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final android.view.accessibility.AccessibilityManager accessibilityManager;

    /* JADX INFO: renamed from: ViF, reason: from kotlin metadata */
    private Integer previousTraversedNode;

    /* JADX INFO: renamed from: WPU, reason: from kotlin metadata */
    private SparseArrayCompat labelToActionId;

    /* JADX INFO: renamed from: X, reason: collision with root package name and from kotlin metadata */
    private MutableIntIntMap idToAfterMap;

    /* JADX INFO: renamed from: XQ, reason: from kotlin metadata */
    private final MutableIntObjectMap pendingVerticalScrollEvents;

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    private final Function1 scheduleScrollEventIfNeededLambda;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private final MutableIntObjectMap pendingHorizontalScrollEvents;

    /* JADX INFO: renamed from: aYN, reason: from kotlin metadata */
    private int accessibilityCursorPosition;

    /* JADX INFO: renamed from: az, reason: from kotlin metadata */
    private final Handler handler;

    /* JADX INFO: renamed from: bzg, reason: from kotlin metadata */
    private final List scrollObservationScopes;

    /* JADX INFO: renamed from: ck, reason: from kotlin metadata */
    private int focusedVirtualViewId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private MutableIntIntMap idToBeforeMap;

    /* JADX INFO: renamed from: fD, reason: from kotlin metadata */
    private IntObjectMap currentSemanticsNodes;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ILs.CN3 boundsUpdateChannel;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private final AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateListener;

    /* JADX INFO: renamed from: iF, reason: from kotlin metadata */
    private PendingTextTraversedEvent pendingTextTraversedEvent;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private final AccessibilityManager.AccessibilityStateChangeListener enabledStateListener;

    /* JADX INFO: renamed from: nHg, reason: from kotlin metadata */
    private final URLSpanCache urlSpanCache;

    /* JADX INFO: renamed from: nY, reason: from kotlin metadata */
    private final ArraySet subtreeChangedLayoutNodes;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final AndroidComposeView view;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private boolean sendingFocusAffectingEvent;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private List enabledServices;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private AccessibilityNodeInfoCompat currentlyFocusedANI;

    /* JADX INFO: renamed from: rV9, reason: from kotlin metadata */
    private final Runnable semanticsChangeChecker;

    /* JADX INFO: renamed from: s7N, reason: from kotlin metadata */
    private MutableIntObjectMap previousSemanticsNodes;

    /* JADX INFO: renamed from: te, reason: from kotlin metadata */
    private boolean currentSemanticsNodesInvalidated;

    /* JADX INFO: renamed from: ty, reason: from kotlin metadata */
    private ComposeAccessibilityNodeProvider nodeProvider;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private boolean checkingForSemanticsChanges;

    /* JADX INFO: renamed from: wTp, reason: from kotlin metadata */
    private SemanticsNodeCopy previousSemanticsRoot;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private long SendRecurringAccessibilityEventsIntervalMillis;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final int f32741U = 8;
    private static final IntList P5 = IntListKt.nr(R.id.f31087n, R.id.rl, R.id.az, R.id.aYN, R.id.f31086g, R.id.te, R.id.iF, R.id.fD, R.id.E2, R.id.f31085e, R.id.f31090t, R.id.nr, R.id.f31080O, R.id.J2, R.id.Uo, R.id.KN, R.id.xMQ, R.id.mUb, R.id.gh, R.id.qie, R.id.ty, R.id.HI, R.id.ck, R.id.Ik, R.id.f31089r, R.id.f31088o, R.id.f31084Z, R.id.XQ, R.id.f31081S, R.id.WPU, R.id.ViF, R.id.nY);

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private int hoveredVirtualViewId = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private Function1 onSendAccessibilityEvent = new Function1<AccessibilityEvent, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$onSendAccessibilityEvent$1
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(AccessibilityEvent accessibilityEvent) {
            return Boolean.valueOf(this.f32764n.getView().getParent().requestSendAccessibilityEvent(this.f32764n.getView(), accessibilityEvent));
        }
    };

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\b¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$ComposeAccessibilityNodeProvider;", "Landroidx/core/view/accessibility/AccessibilityNodeProviderCompat;", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;)V", "", "virtualViewId", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", "rl", "(I)Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", FileUploadManager.f61572j, "Landroid/os/Bundle;", "arguments", "", "J2", "(IILandroid/os/Bundle;)Z", "info", "", "extraDataKey", "", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(ILandroidx/core/view/accessibility/AccessibilityNodeInfoCompat;Ljava/lang/String;Landroid/os/Bundle;)V", "focus", "nr", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private final class ComposeAccessibilityNodeProvider extends AccessibilityNodeProviderCompat {
        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        public AccessibilityNodeInfoCompat nr(int focus) {
            if (focus == 1) {
                if (AndroidComposeViewAccessibilityDelegateCompat.this.focusedVirtualViewId == Integer.MIN_VALUE) {
                    return null;
                }
                return rl(AndroidComposeViewAccessibilityDelegateCompat.this.focusedVirtualViewId);
            }
            if (focus == 2) {
                return rl(AndroidComposeViewAccessibilityDelegateCompat.this.accessibilityFocusedVirtualViewId);
            }
            throw new IllegalArgumentException("Unknown focus type: " + focus);
        }

        public ComposeAccessibilityNodeProvider() {
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        public boolean J2(int virtualViewId, int action, Bundle arguments) {
            return AndroidComposeViewAccessibilityDelegateCompat.this.C(virtualViewId, action, arguments);
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        public void n(int virtualViewId, AccessibilityNodeInfoCompat info, String extraDataKey, Bundle arguments) {
            AndroidComposeViewAccessibilityDelegateCompat.this.v(virtualViewId, info, extraDataKey, arguments);
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        public AccessibilityNodeInfoCompat rl(int virtualViewId) {
            AccessibilityNodeInfoCompat accessibilityNodeInfoCompatP5 = AndroidComposeViewAccessibilityDelegateCompat.this.p5(virtualViewId);
            AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = AndroidComposeViewAccessibilityDelegateCompat.this;
            if (androidComposeViewAccessibilityDelegateCompat.sendingFocusAffectingEvent) {
                if (virtualViewId == androidComposeViewAccessibilityDelegateCompat.accessibilityFocusedVirtualViewId) {
                    androidComposeViewAccessibilityDelegateCompat.currentlyAccessibilityFocusedANI = accessibilityNodeInfoCompatP5;
                }
                if (virtualViewId == androidComposeViewAccessibilityDelegateCompat.focusedVirtualViewId) {
                    androidComposeViewAccessibilityDelegateCompat.currentlyFocusedANI = accessibilityNodeInfoCompatP5;
                }
            }
            return accessibilityNodeInfoCompatP5;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0010\b\u0002\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\r\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0015\u0010\u0013R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$PendingTextTraversedEvent;", "", "Landroidx/compose/ui/semantics/SemanticsNode;", "node", "", FileUploadManager.f61572j, "granularity", "fromIndex", "toIndex", "", "traverseTime", "<init>", "(Landroidx/compose/ui/semantics/SemanticsNode;IIIIJ)V", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "Landroidx/compose/ui/semantics/SemanticsNode;", "nr", "()Landroidx/compose/ui/semantics/SemanticsNode;", "rl", "I", "()I", "t", "O", "J2", "J", "()J", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class PendingTextTraversedEvent {

        /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
        private final long traverseTime;

        /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
        private final int toIndex;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final SemanticsNode node;

        /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
        private final int fromIndex;

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
        private final int action;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private final int granularity;

        /* JADX INFO: renamed from: J2, reason: from getter */
        public final long getTraverseTime() {
            return this.traverseTime;
        }

        /* JADX INFO: renamed from: O, reason: from getter */
        public final int getToIndex() {
            return this.toIndex;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getAction() {
            return this.action;
        }

        /* JADX INFO: renamed from: nr, reason: from getter */
        public final SemanticsNode getNode() {
            return this.node;
        }

        /* JADX INFO: renamed from: rl, reason: from getter */
        public final int getFromIndex() {
            return this.fromIndex;
        }

        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getGranularity() {
            return this.granularity;
        }

        public PendingTextTraversedEvent(SemanticsNode semanticsNode, int i2, int i3, int i5, int i7, long j2) {
            this.node = semanticsNode;
            this.action = i2;
            this.granularity = i3;
            this.fromIndex = i5;
            this.toIndex = i7;
            this.traverseTime = j2;
        }
    }

    private static final boolean Mx(ScrollAxisRange scrollAxisRange, float f3) {
        if (f3 >= 0.0f || ((Number) scrollAxisRange.getValue().invoke()).floatValue() <= 0.0f) {
            return f3 > 0.0f && ((Number) scrollAxisRange.getValue().invoke()).floatValue() < ((Number) scrollAxisRange.getMaxValue().invoke()).floatValue();
        }
        return true;
    }

    private final String Nxk(SemanticsNode node) {
        AnnotatedString annotatedString;
        if (node == null) {
            return null;
        }
        SemanticsConfiguration unmergedConfig = node.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.f33276n;
        if (unmergedConfig.J2(semanticsProperties.nr())) {
            return ListUtilsKt.O((List) node.getUnmergedConfig().xMQ(semanticsProperties.nr()), ",", null, null, 0, null, null, 62, null);
        }
        if (node.getUnmergedConfig().J2(semanticsProperties.Uo())) {
            AnnotatedString annotatedStringK = k(node.getUnmergedConfig());
            if (annotatedStringK != null) {
                return annotatedStringK.getText();
            }
            return null;
        }
        List list = (List) SemanticsConfigurationKt.n(node.getUnmergedConfig(), semanticsProperties.T());
        if (list == null || (annotatedString = (AnnotatedString) CollectionsKt.firstOrNull(list)) == null) {
            return null;
        }
        return annotatedString.getText();
    }

    /* JADX WARN: Removed duplicated region for block: B:166:0x055b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void UhV(IntObjectMap newSemanticsNodes) {
        ArrayList arrayList;
        int[] iArr;
        int i2;
        int i3;
        int i5;
        ArrayList arrayList2;
        int[] iArr2;
        int i7;
        int i8;
        int i9;
        SemanticsNode semanticsNode;
        boolean zViF;
        int i10;
        Object[] objArr;
        ArrayList arrayList3;
        int i11;
        int i12;
        int[] iArr3;
        int i13;
        Object[] objArr2;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z2;
        boolean z3;
        AccessibilityEvent accessibilityEventEF;
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this;
        IntObjectMap intObjectMap = newSemanticsNodes;
        ArrayList arrayList4 = new ArrayList(androidComposeViewAccessibilityDelegateCompat.scrollObservationScopes);
        androidComposeViewAccessibilityDelegateCompat.scrollObservationScopes.clear();
        int[] iArr4 = intObjectMap.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_KEYS java.lang.String;
        long[] jArr = intObjectMap.metadata;
        int i19 = 2;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i20 = 0;
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat2 = androidComposeViewAccessibilityDelegateCompat;
        while (true) {
            long j2 = jArr[i20];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i21 = 8;
                int i22 = 8 - ((~(i20 - length)) >>> 31);
                long j3 = j2;
                int i23 = 0;
                AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat3 = androidComposeViewAccessibilityDelegateCompat2;
                while (i23 < i22) {
                    if ((j3 & 255) < 128) {
                        int i24 = iArr4[(i20 << 3) + i23];
                        SemanticsNodeCopy semanticsNodeCopy = (SemanticsNodeCopy) androidComposeViewAccessibilityDelegateCompat3.previousSemanticsNodes.rl(i24);
                        if (semanticsNodeCopy == null) {
                            i3 = i23;
                            i5 = i22;
                            arrayList2 = arrayList4;
                            iArr2 = iArr4;
                            i7 = i19;
                        } else {
                            SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) intObjectMap.rl(i24);
                            SemanticsNode semanticsNode2 = semanticsNodeWithAdjustedBounds != null ? semanticsNodeWithAdjustedBounds.getSemanticsNode() : null;
                            if (semanticsNode2 == null) {
                                InlineClassHelperKt.nr("no value for specified key");
                                throw new KotlinNothingValueException();
                            }
                            MutableScatterMap props = semanticsNode2.getUnmergedConfig().getProps();
                            Object[] objArr3 = props.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_KEYS java.lang.String;
                            i7 = i19;
                            Object[] objArr4 = props.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_VALUES java.lang.String;
                            long[] jArr2 = props.metadata;
                            int length2 = jArr2.length - 2;
                            if (length2 >= 0) {
                                int i25 = i21;
                                semanticsNode = semanticsNode2;
                                zViF = false;
                                int i26 = 0;
                                while (true) {
                                    long j4 = jArr2[i26];
                                    long[] jArr3 = jArr2;
                                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i27 = 8 - ((~(i26 - length2)) >>> 31);
                                        long j5 = j4;
                                        int i28 = 0;
                                        while (i28 < i27) {
                                            if ((j5 & 255) < 128) {
                                                int i29 = (i26 << 3) + i28;
                                                Object obj = objArr3[i29];
                                                Object obj2 = objArr4[i29];
                                                SemanticsPropertyKey semanticsPropertyKey = (SemanticsPropertyKey) obj;
                                                SemanticsProperties semanticsProperties = SemanticsProperties.f33276n;
                                                i12 = i23;
                                                if (((Intrinsics.areEqual(semanticsPropertyKey, semanticsProperties.qie()) || Intrinsics.areEqual(semanticsPropertyKey, semanticsProperties.v())) ? androidComposeViewAccessibilityDelegateCompat3.n1(i24, arrayList4) : false) || !Intrinsics.areEqual(obj2, SemanticsConfigurationKt.n(semanticsNodeCopy.getUnmergedConfig(), semanticsPropertyKey))) {
                                                    if (Intrinsics.areEqual(semanticsPropertyKey, semanticsProperties.nY())) {
                                                        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                                                        String str = (String) obj2;
                                                        if (semanticsNodeCopy.getUnmergedConfig().J2(semanticsProperties.nY())) {
                                                            androidComposeViewAccessibilityDelegateCompat3.EWS(i24, i25, str);
                                                        }
                                                    } else {
                                                        if (Intrinsics.areEqual(semanticsPropertyKey, semanticsProperties.e()) ? true : Intrinsics.areEqual(semanticsPropertyKey, semanticsProperties.s7N())) {
                                                            i14 = i28;
                                                            int i30 = i26;
                                                            arrayList3 = arrayList4;
                                                            i11 = i30;
                                                            objArr2 = objArr3;
                                                            i13 = i22;
                                                            i15 = i24;
                                                            Po6(androidComposeViewAccessibilityDelegateCompat3, androidComposeViewAccessibilityDelegateCompat3.mYa(i24), 2048, 64, null, 8, null);
                                                            Po6(androidComposeViewAccessibilityDelegateCompat3, androidComposeViewAccessibilityDelegateCompat3.mYa(i15), 2048, 0, null, 8, null);
                                                        } else {
                                                            int i31 = i26;
                                                            arrayList3 = arrayList4;
                                                            i11 = i31;
                                                            i13 = i22;
                                                            i14 = i28;
                                                            objArr2 = objArr3;
                                                            i15 = i24;
                                                            if (Intrinsics.areEqual(semanticsPropertyKey, semanticsProperties.te())) {
                                                                Po6(androidComposeViewAccessibilityDelegateCompat3, androidComposeViewAccessibilityDelegateCompat3.mYa(i15), 2048, 64, null, 8, null);
                                                                Po6(androidComposeViewAccessibilityDelegateCompat3, androidComposeViewAccessibilityDelegateCompat3.mYa(i15), 2048, 0, null, 8, null);
                                                            } else if (Intrinsics.areEqual(semanticsPropertyKey, semanticsProperties.E2())) {
                                                                Role role = (Role) SemanticsConfigurationKt.n(semanticsNode.getUnmergedConfig(), semanticsProperties.iF());
                                                                if (!(role == null ? false : Role.az(role.getValue(), Role.INSTANCE.KN()))) {
                                                                    Po6(androidComposeViewAccessibilityDelegateCompat3, androidComposeViewAccessibilityDelegateCompat3.mYa(i15), 2048, 64, null, 8, null);
                                                                    Po6(androidComposeViewAccessibilityDelegateCompat3, androidComposeViewAccessibilityDelegateCompat3.mYa(i15), 2048, 0, null, 8, null);
                                                                } else if (Intrinsics.areEqual(SemanticsConfigurationKt.n(semanticsNode.getUnmergedConfig(), semanticsProperties.E2()), Boolean.TRUE)) {
                                                                    AccessibilityEvent accessibilityEventM7 = androidComposeViewAccessibilityDelegateCompat3.M7(androidComposeViewAccessibilityDelegateCompat3.mYa(i15), 4);
                                                                    SemanticsNode semanticsNodeN = semanticsNode.n();
                                                                    List list = (List) SemanticsConfigurationKt.n(semanticsNodeN.ty(), semanticsProperties.nr());
                                                                    String strO = list != null ? ListUtilsKt.O(list, ",", null, null, 0, null, null, 62, null) : null;
                                                                    List list2 = (List) SemanticsConfigurationKt.n(semanticsNodeN.ty(), semanticsProperties.T());
                                                                    String strO2 = list2 != null ? ListUtilsKt.O(list2, ",", null, null, 0, null, null, 62, null) : null;
                                                                    if (strO != null) {
                                                                        accessibilityEventM7.setContentDescription(strO);
                                                                        Unit unit = Unit.INSTANCE;
                                                                    }
                                                                    if (strO2 != null) {
                                                                        accessibilityEventM7.getText().add(strO2);
                                                                    }
                                                                    androidComposeViewAccessibilityDelegateCompat3.HV(accessibilityEventM7);
                                                                } else {
                                                                    Po6(androidComposeViewAccessibilityDelegateCompat3, androidComposeViewAccessibilityDelegateCompat3.mYa(i15), 2048, 0, null, 8, null);
                                                                }
                                                            } else if (Intrinsics.areEqual(semanticsPropertyKey, semanticsProperties.nr())) {
                                                                int iMYa = androidComposeViewAccessibilityDelegateCompat3.mYa(i15);
                                                                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                                                                androidComposeViewAccessibilityDelegateCompat3.GD(iMYa, 2048, 4, (List) obj2);
                                                            } else {
                                                                if (!Intrinsics.areEqual(semanticsPropertyKey, semanticsProperties.Uo())) {
                                                                    iArr3 = iArr4;
                                                                    if (Intrinsics.areEqual(semanticsPropertyKey, semanticsProperties.N())) {
                                                                        AnnotatedString annotatedStringK = androidComposeViewAccessibilityDelegateCompat3.k(semanticsNode.getUnmergedConfig());
                                                                        String str2 = "";
                                                                        if (annotatedStringK != null) {
                                                                            String text = annotatedStringK.getText();
                                                                            str2 = "";
                                                                            if (text != null) {
                                                                                str2 = text;
                                                                            }
                                                                        }
                                                                        long packedValue = ((TextRange) semanticsNode.getUnmergedConfig().xMQ(semanticsProperties.N())).getPackedValue();
                                                                        androidComposeViewAccessibilityDelegateCompat3.HV(androidComposeViewAccessibilityDelegateCompat3.eF(androidComposeViewAccessibilityDelegateCompat3.mYa(i15), Integer.valueOf(TextRange.ty(packedValue)), Integer.valueOf(TextRange.xMQ(packedValue)), Integer.valueOf(str2.length()), androidComposeViewAccessibilityDelegateCompat3.F(str2, 100000)));
                                                                        androidComposeViewAccessibilityDelegateCompat3.hRu(semanticsNode.getId());
                                                                    } else if (Intrinsics.areEqual(semanticsPropertyKey, semanticsProperties.qie()) ? true : Intrinsics.areEqual(semanticsPropertyKey, semanticsProperties.v())) {
                                                                        androidComposeViewAccessibilityDelegateCompat3.xg(semanticsNode.getLayoutNode());
                                                                        ScrollObservationScope scrollObservationScopeN = SemanticsUtils_androidKt.n(androidComposeViewAccessibilityDelegateCompat3.scrollObservationScopes, i15);
                                                                        Intrinsics.checkNotNull(scrollObservationScopeN);
                                                                        scrollObservationScopeN.J2((ScrollAxisRange) SemanticsConfigurationKt.n(semanticsNode.getUnmergedConfig(), semanticsProperties.qie()));
                                                                        scrollObservationScopeN.xMQ((ScrollAxisRange) SemanticsConfigurationKt.n(semanticsNode.getUnmergedConfig(), semanticsProperties.v()));
                                                                        androidComposeViewAccessibilityDelegateCompat3.Rl(scrollObservationScopeN);
                                                                    } else if (Intrinsics.areEqual(semanticsPropertyKey, semanticsProperties.xMQ())) {
                                                                        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                                                                        if (((Boolean) obj2).booleanValue()) {
                                                                            androidComposeViewAccessibilityDelegateCompat3.HV(androidComposeViewAccessibilityDelegateCompat3.M7(androidComposeViewAccessibilityDelegateCompat3.mYa(semanticsNode.getId()), 8));
                                                                        }
                                                                        Po6(androidComposeViewAccessibilityDelegateCompat3, androidComposeViewAccessibilityDelegateCompat3.mYa(semanticsNode.getId()), 2048, 0, null, 8, null);
                                                                    } else {
                                                                        SemanticsActions semanticsActions = SemanticsActions.f33251n;
                                                                        if (Intrinsics.areEqual(semanticsPropertyKey, semanticsActions.nr())) {
                                                                            List list3 = (List) semanticsNode.getUnmergedConfig().xMQ(semanticsActions.nr());
                                                                            List list4 = (List) SemanticsConfigurationKt.n(semanticsNodeCopy.getUnmergedConfig(), semanticsActions.nr());
                                                                            if (list4 != null) {
                                                                                LinkedHashSet linkedHashSet = new LinkedHashSet();
                                                                                int size = list3.size();
                                                                                for (int i32 = 0; i32 < size; i32++) {
                                                                                    linkedHashSet.add(((CustomAccessibilityAction) list3.get(i32)).getLabel());
                                                                                }
                                                                                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                                                                                int size2 = list4.size();
                                                                                for (int i33 = 0; i33 < size2; i33++) {
                                                                                    linkedHashSet2.add(((CustomAccessibilityAction) list4.get(i33)).getLabel());
                                                                                }
                                                                                if (linkedHashSet.containsAll(linkedHashSet2) && linkedHashSet2.containsAll(linkedHashSet)) {
                                                                                    zViF = false;
                                                                                }
                                                                            } else if (!list3.isEmpty()) {
                                                                            }
                                                                            zViF = true;
                                                                        } else if (!(obj2 instanceof AccessibilityAction) || !AndroidComposeViewAccessibilityDelegateCompat_androidKt.az((AccessibilityAction) obj2, SemanticsConfigurationKt.n(semanticsNodeCopy.getUnmergedConfig(), semanticsPropertyKey))) {
                                                                            zViF = true;
                                                                        }
                                                                    }
                                                                } else if (semanticsNode.getUnmergedConfig().J2(SemanticsActions.f33251n.nY())) {
                                                                    AnnotatedString annotatedStringK2 = androidComposeViewAccessibilityDelegateCompat3.k(semanticsNodeCopy.getUnmergedConfig());
                                                                    if (annotatedStringK2 == null) {
                                                                        annotatedStringK2 = "";
                                                                    }
                                                                    AnnotatedString annotatedStringK3 = androidComposeViewAccessibilityDelegateCompat3.k(semanticsNode.getUnmergedConfig());
                                                                    AnnotatedString annotatedString = annotatedStringK3 != null ? annotatedStringK3 : "";
                                                                    CharSequence charSequenceF = androidComposeViewAccessibilityDelegateCompat3.F(annotatedString, 100000);
                                                                    int length3 = annotatedStringK2.length();
                                                                    int length4 = annotatedString.length();
                                                                    int iCoerceAtMost = RangesKt.coerceAtMost(length3, length4);
                                                                    int i34 = 0;
                                                                    while (true) {
                                                                        i16 = length4;
                                                                        if (i34 >= iCoerceAtMost) {
                                                                            i17 = iCoerceAtMost;
                                                                            break;
                                                                        }
                                                                        i17 = iCoerceAtMost;
                                                                        if (annotatedStringK2.charAt(i34) != annotatedString.charAt(i34)) {
                                                                            break;
                                                                        }
                                                                        i34++;
                                                                        length4 = i16;
                                                                        iCoerceAtMost = i17;
                                                                    }
                                                                    int i35 = 0;
                                                                    while (true) {
                                                                        if (i35 >= i17 - i34) {
                                                                            i18 = i35;
                                                                            break;
                                                                        }
                                                                        i18 = i35;
                                                                        if (annotatedStringK2.charAt((length3 - 1) - i35) != annotatedString.charAt((i16 - 1) - i18)) {
                                                                            break;
                                                                        } else {
                                                                            i35 = i18 + 1;
                                                                        }
                                                                    }
                                                                    int i36 = (length3 - i18) - i34;
                                                                    int i37 = (i16 - i18) - i34;
                                                                    SemanticsConfiguration unmergedConfig = semanticsNodeCopy.getUnmergedConfig();
                                                                    SemanticsProperties semanticsProperties2 = SemanticsProperties.f33276n;
                                                                    iArr3 = iArr4;
                                                                    boolean zJ2 = unmergedConfig.J2(semanticsProperties2.g());
                                                                    boolean zJ22 = semanticsNode.getUnmergedConfig().J2(semanticsProperties2.g());
                                                                    boolean zJ23 = semanticsNodeCopy.getUnmergedConfig().J2(semanticsProperties2.Uo());
                                                                    boolean z4 = zJ23 && !zJ2 && zJ22;
                                                                    boolean z5 = zJ23 && zJ2 && !zJ22;
                                                                    if (z4 || z5) {
                                                                        z2 = z5;
                                                                        z3 = z4;
                                                                        accessibilityEventEF = androidComposeViewAccessibilityDelegateCompat3.eF(androidComposeViewAccessibilityDelegateCompat3.mYa(i15), 0, 0, Integer.valueOf(i16), charSequenceF);
                                                                    } else {
                                                                        z2 = z5;
                                                                        z3 = z4;
                                                                        accessibilityEventEF = androidComposeViewAccessibilityDelegateCompat3.M7(androidComposeViewAccessibilityDelegateCompat3.mYa(i15), 16);
                                                                        accessibilityEventEF.setFromIndex(i34);
                                                                        accessibilityEventEF.setRemovedCount(i36);
                                                                        accessibilityEventEF.setAddedCount(i37);
                                                                        accessibilityEventEF.setBeforeText(annotatedStringK2);
                                                                        accessibilityEventEF.getText().add(charSequenceF);
                                                                    }
                                                                    accessibilityEventEF.setClassName("android.widget.EditText");
                                                                    androidComposeViewAccessibilityDelegateCompat3.HV(accessibilityEventEF);
                                                                    if (z3 || z2) {
                                                                        long packedValue2 = ((TextRange) semanticsNode.getUnmergedConfig().xMQ(semanticsProperties2.N())).getPackedValue();
                                                                        accessibilityEventEF.setFromIndex(TextRange.ty(packedValue2));
                                                                        accessibilityEventEF.setToIndex(TextRange.xMQ(packedValue2));
                                                                        androidComposeViewAccessibilityDelegateCompat3.HV(accessibilityEventEF);
                                                                    }
                                                                } else {
                                                                    iArr3 = iArr4;
                                                                    Po6(androidComposeViewAccessibilityDelegateCompat3, androidComposeViewAccessibilityDelegateCompat3.mYa(i15), 2048, Integer.valueOf(i7), null, 8, null);
                                                                }
                                                                j5 >>= 8;
                                                                i28 = i14 + 1;
                                                                ArrayList arrayList5 = arrayList3;
                                                                i26 = i11;
                                                                arrayList4 = arrayList5;
                                                                i25 = 8;
                                                                i24 = i15;
                                                                i23 = i12;
                                                                objArr3 = objArr2;
                                                                i22 = i13;
                                                                iArr4 = iArr3;
                                                            }
                                                        }
                                                        iArr3 = iArr4;
                                                        j5 >>= 8;
                                                        i28 = i14 + 1;
                                                        ArrayList arrayList52 = arrayList3;
                                                        i26 = i11;
                                                        arrayList4 = arrayList52;
                                                        i25 = 8;
                                                        i24 = i15;
                                                        i23 = i12;
                                                        objArr3 = objArr2;
                                                        i22 = i13;
                                                        iArr4 = iArr3;
                                                    }
                                                }
                                                int i38 = i26;
                                                arrayList3 = arrayList4;
                                                i11 = i38;
                                            } else {
                                                int i39 = i26;
                                                arrayList3 = arrayList4;
                                                i11 = i39;
                                                i12 = i23;
                                            }
                                            i13 = i22;
                                            i14 = i28;
                                            objArr2 = objArr3;
                                            iArr3 = iArr4;
                                            i15 = i24;
                                            j5 >>= 8;
                                            i28 = i14 + 1;
                                            ArrayList arrayList522 = arrayList3;
                                            i26 = i11;
                                            arrayList4 = arrayList522;
                                            i25 = 8;
                                            i24 = i15;
                                            i23 = i12;
                                            objArr3 = objArr2;
                                            i22 = i13;
                                            iArr4 = iArr3;
                                        }
                                        int i40 = i26;
                                        arrayList2 = arrayList4;
                                        i10 = i40;
                                        i3 = i23;
                                        i5 = i22;
                                        objArr = objArr3;
                                        iArr2 = iArr4;
                                        i9 = i24;
                                        if (i27 != i25) {
                                            break;
                                        }
                                    } else {
                                        int i41 = i26;
                                        arrayList2 = arrayList4;
                                        i10 = i41;
                                        i3 = i23;
                                        i5 = i22;
                                        objArr = objArr3;
                                        iArr2 = iArr4;
                                        i9 = i24;
                                    }
                                    if (i10 == length2) {
                                        break;
                                    }
                                    int i42 = i10 + 1;
                                    i24 = i9;
                                    arrayList4 = arrayList2;
                                    jArr2 = jArr3;
                                    objArr3 = objArr;
                                    i22 = i5;
                                    iArr4 = iArr2;
                                    i25 = 8;
                                    i26 = i42;
                                    i23 = i3;
                                }
                            } else {
                                i3 = i23;
                                i9 = i24;
                                i5 = i22;
                                semanticsNode = semanticsNode2;
                                arrayList2 = arrayList4;
                                iArr2 = iArr4;
                                zViF = false;
                            }
                            if (!zViF) {
                                zViF = AndroidComposeViewAccessibilityDelegateCompat_androidKt.ViF(semanticsNode, semanticsNodeCopy.getUnmergedConfig());
                            }
                            if (zViF) {
                                Po6(androidComposeViewAccessibilityDelegateCompat3, androidComposeViewAccessibilityDelegateCompat3.mYa(i9), 2048, 0, null, 8, null);
                            }
                        }
                        i8 = 8;
                    } else {
                        i3 = i23;
                        i5 = i22;
                        arrayList2 = arrayList4;
                        iArr2 = iArr4;
                        i7 = i19;
                        i8 = i21;
                    }
                    j3 >>= i8;
                    intObjectMap = newSemanticsNodes;
                    i21 = i8;
                    i19 = i7;
                    arrayList4 = arrayList2;
                    i22 = i5;
                    iArr4 = iArr2;
                    i23 = i3 + 1;
                    androidComposeViewAccessibilityDelegateCompat3 = this;
                }
                arrayList = arrayList4;
                iArr = iArr4;
                i2 = i19;
                if (i22 != i21) {
                    return;
                }
            } else {
                arrayList = arrayList4;
                iArr = iArr4;
                i2 = i19;
            }
            if (i20 == length) {
                return;
            }
            i20++;
            androidComposeViewAccessibilityDelegateCompat2 = this;
            intObjectMap = newSemanticsNodes;
            i19 = i2;
            arrayList4 = arrayList;
            iArr4 = iArr;
        }
    }

    private final AccessibilityIterators.TextSegmentIterator Y(SemanticsNode node, int granularity) {
        String strNxk;
        TextLayoutResult textLayoutResultO;
        if (node == null || (strNxk = Nxk(node)) == null || strNxk.length() == 0) {
            return null;
        }
        if (granularity == 1) {
            AccessibilityIterators.CharacterTextSegmentIterator characterTextSegmentIteratorN = AccessibilityIterators.CharacterTextSegmentIterator.INSTANCE.n(this.view.getContext().getResources().getConfiguration().locale);
            characterTextSegmentIteratorN.O(strNxk);
            return characterTextSegmentIteratorN;
        }
        if (granularity == 2) {
            AccessibilityIterators.WordTextSegmentIterator wordTextSegmentIteratorN = AccessibilityIterators.WordTextSegmentIterator.INSTANCE.n(this.view.getContext().getResources().getConfiguration().locale);
            wordTextSegmentIteratorN.O(strNxk);
            return wordTextSegmentIteratorN;
        }
        if (granularity != 4) {
            if (granularity == 8) {
                AccessibilityIterators.ParagraphTextSegmentIterator paragraphTextSegmentIteratorN = AccessibilityIterators.ParagraphTextSegmentIterator.INSTANCE.n();
                paragraphTextSegmentIteratorN.O(strNxk);
                return paragraphTextSegmentIteratorN;
            }
            if (granularity != 16) {
                return null;
            }
        }
        if (!node.getUnmergedConfig().J2(SemanticsActions.f33251n.xMQ()) || (textLayoutResultO = SemanticsUtils_androidKt.O(node.getUnmergedConfig())) == null) {
            return null;
        }
        if (granularity == 4) {
            AccessibilityIterators.LineTextSegmentIterator lineTextSegmentIteratorN = AccessibilityIterators.LineTextSegmentIterator.INSTANCE.n();
            lineTextSegmentIteratorN.mUb(strNxk, textLayoutResultO);
            return lineTextSegmentIteratorN;
        }
        AccessibilityIterators.PageTextSegmentIterator pageTextSegmentIteratorN = AccessibilityIterators.PageTextSegmentIterator.INSTANCE.n();
        pageTextSegmentIteratorN.mUb(strNxk, textLayoutResultO, node);
        return pageTextSegmentIteratorN;
    }

    private final RectF kSg(SemanticsNode textNode, Rect bounds) {
        if (textNode == null) {
            return null;
        }
        Rect rectTe = bounds.te(textNode.o());
        Rect rectXMQ = textNode.xMQ();
        Rect rectAYN = rectTe.nY(rectXMQ) ? rectTe.aYN(rectXMQ) : null;
        if (rectAYN == null) {
            return null;
        }
        AndroidComposeView androidComposeView = this.view;
        float left = rectAYN.getLeft();
        long jAYN = androidComposeView.aYN(Offset.O((((long) Float.floatToRawIntBits(rectAYN.getTop())) & 4294967295L) | (((long) Float.floatToRawIntBits(left)) << 32)));
        long jAYN2 = this.view.aYN(Offset.O((((long) Float.floatToRawIntBits(rectAYN.getAndroidx.media3.extractor.text.ttml.TtmlNode.RIGHT java.lang.String())) << 32) | (((long) Float.floatToRawIntBits(rectAYN.xMQ())) & 4294967295L)));
        return new RectF(Float.intBitsToFloat((int) (jAYN >> 32)), Float.intBitsToFloat((int) (jAYN & 4294967295L)), Float.intBitsToFloat((int) (jAYN2 >> 32)), Float.intBitsToFloat((int) (jAYN2 & 4294967295L)));
    }

    public final void ofS() {
        this.currentSemanticsNodesInvalidated = true;
        if (!m() || this.checkingForSemanticsChanges) {
            return;
        }
        this.checkingForSemanticsChanges = true;
        this.handler.post(this.semanticsChangeChecker);
    }

    public final void pJg(LayoutNode layoutNode) {
        this.currentSemanticsNodesInvalidated = true;
        if (m()) {
            xg(layoutNode);
        }
    }

    @RequiresApi
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$Api24Impl;", "", "<init>", "()V", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", "info", "Landroidx/compose/ui/semantics/SemanticsNode;", "semanticsNode", "", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;Landroidx/compose/ui/semantics/SemanticsNode;)V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class Api24Impl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final Api24Impl f32754n = new Api24Impl();

        private Api24Impl() {
        }

        public static final void n(AccessibilityNodeInfoCompat info, SemanticsNode semanticsNode) {
            AccessibilityAction accessibilityAction;
            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.HI(semanticsNode) && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.n(semanticsNode.getUnmergedConfig(), SemanticsActions.f33251n.aYN())) != null) {
                info.rl(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.R.id.accessibilityActionSetProgress, accessibilityAction.getLabel()));
            }
        }
    }

    @RequiresApi
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$Api29Impl;", "", "<init>", "()V", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", "info", "Landroidx/compose/ui/semantics/SemanticsNode;", "semanticsNode", "", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;Landroidx/compose/ui/semantics/SemanticsNode;)V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class Api29Impl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final Api29Impl f32755n = new Api29Impl();

        private Api29Impl() {
        }

        public static final void n(AccessibilityNodeInfoCompat info, SemanticsNode semanticsNode) {
            boolean zAz;
            Role role = (Role) SemanticsConfigurationKt.n(semanticsNode.getUnmergedConfig(), SemanticsProperties.f33276n.iF());
            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.HI(semanticsNode)) {
                int iRl = Role.INSTANCE.rl();
                if (role == null) {
                    zAz = false;
                } else {
                    zAz = Role.az(role.getValue(), iRl);
                }
                if (!zAz) {
                    SemanticsConfiguration unmergedConfig = semanticsNode.getUnmergedConfig();
                    SemanticsActions semanticsActions = SemanticsActions.f33251n;
                    AccessibilityAction accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.n(unmergedConfig, semanticsActions.r());
                    if (accessibilityAction != null) {
                        info.rl(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.R.id.accessibilityActionPageUp, accessibilityAction.getLabel()));
                    }
                    AccessibilityAction accessibilityAction2 = (AccessibilityAction) SemanticsConfigurationKt.n(semanticsNode.getUnmergedConfig(), semanticsActions.HI());
                    if (accessibilityAction2 != null) {
                        info.rl(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.R.id.accessibilityActionPageDown, accessibilityAction2.getLabel()));
                    }
                    AccessibilityAction accessibilityAction3 = (AccessibilityAction) SemanticsConfigurationKt.n(semanticsNode.getUnmergedConfig(), semanticsActions.ck());
                    if (accessibilityAction3 != null) {
                        info.rl(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.R.id.accessibilityActionPageLeft, accessibilityAction3.getLabel()));
                    }
                    AccessibilityAction accessibilityAction4 = (AccessibilityAction) SemanticsConfigurationKt.n(semanticsNode.getUnmergedConfig(), semanticsActions.Ik());
                    if (accessibilityAction4 != null) {
                        info.rl(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.R.id.accessibilityActionPageRight, accessibilityAction4.getLabel()));
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:96:0x01ae -> B:97:0x01af). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:97:0x01af
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:226)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:196)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:63)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:125)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.addCases(SwitchRegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:71)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final boolean C(int r18, int r19, android.os.Bundle r20) {
        /*
            Method dump skipped, instruction units count: 1900
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.C(int, int, android.os.Bundle):boolean");
    }

    private final CharSequence F(CharSequence text, int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("size should be greater than 0");
        }
        if (text == null || text.length() == 0 || text.length() <= size) {
            return text;
        }
        int i2 = size - 1;
        if (Character.isHighSurrogate(text.charAt(i2)) && Character.isLowSurrogate(text.charAt(size))) {
            size = i2;
        }
        CharSequence charSequenceSubSequence = text.subSequence(0, size);
        Intrinsics.checkNotNull(charSequenceSubSequence, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
        return charSequenceSubSequence;
    }

    private final boolean GD(int virtualViewId, int eventType, Integer contentChangeType, List contentDescription) {
        if (virtualViewId == Integer.MIN_VALUE || !m()) {
            return false;
        }
        AccessibilityEvent accessibilityEventM7 = M7(virtualViewId, eventType);
        if (contentChangeType != null) {
            accessibilityEventM7.setContentChangeTypes(contentChangeType.intValue());
        }
        if (contentDescription != null) {
            accessibilityEventM7.setContentDescription(ListUtilsKt.O(contentDescription, ",", null, null, 0, null, null, 62, null));
        }
        return HV(accessibilityEventM7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IntObjectMap J() {
        if (this.currentSemanticsNodesInvalidated) {
            this.currentSemanticsNodesInvalidated = false;
            this.currentSemanticsNodes = SemanticsUtils_androidKt.rl(this.view.getSemanticsOwner());
            if (m()) {
                AndroidComposeViewAccessibilityDelegateCompat_androidKt.nY(this.currentSemanticsNodes, this.idToBeforeMap, this.idToAfterMap, this.view.getContext().getResources());
            }
        }
        return this.currentSemanticsNodes;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, boolean z2) {
        androidComposeViewAccessibilityDelegateCompat.enabledServices = z2 ? androidComposeViewAccessibilityDelegateCompat.accessibilityManager.getEnabledAccessibilityServiceList(-1) : CollectionsKt.emptyList();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void Org(SemanticsNode newNode, SemanticsNodeCopy oldNode) {
        MutableIntSet mutableIntSetRl = IntSetKt.rl();
        List listZ = newNode.Z();
        int size = listZ.size();
        for (int i2 = 0; i2 < size; i2++) {
            SemanticsNode semanticsNode = (SemanticsNode) listZ.get(i2);
            if (J().n(semanticsNode.getId())) {
                if (!oldNode.getChildren().n(semanticsNode.getId())) {
                    xg(newNode.getLayoutNode());
                    return;
                }
                mutableIntSetRl.Uo(semanticsNode.getId());
            }
        }
        MutableIntSet children = oldNode.getChildren();
        int[] iArr = children.elements;
        long[] jArr = children.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j2 = jArr[i3];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i7 = 0; i7 < i5; i7++) {
                        if ((255 & j2) < 128 && !mutableIntSetRl.n(iArr[(i3 << 3) + i7])) {
                            xg(newNode.getLayoutNode());
                            return;
                        }
                        j2 >>= 8;
                    }
                    if (i5 != 8) {
                        break;
                    } else if (i3 == length) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        List listZ2 = newNode.Z();
        int size2 = listZ2.size();
        for (int i8 = 0; i8 < size2; i8++) {
            SemanticsNode semanticsNode2 = (SemanticsNode) listZ2.get(i8);
            if (J().n(semanticsNode2.getId())) {
                Object objRl = this.previousSemanticsNodes.rl(semanticsNode2.getId());
                Intrinsics.checkNotNull(objRl);
                Org(semanticsNode2, (SemanticsNodeCopy) objRl);
            }
        }
    }

    static /* synthetic */ boolean Po6(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, int i2, int i3, Integer num, List list, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            num = null;
        }
        if ((i5 & 8) != 0) {
            list = null;
        }
        return androidComposeViewAccessibilityDelegateCompat.GD(i2, i3, num, list);
    }

    private final void QZ6(int virtualViewId) {
        int i2 = this.hoveredVirtualViewId;
        if (i2 == virtualViewId) {
            return;
        }
        this.hoveredVirtualViewId = virtualViewId;
        Po6(this, virtualViewId, 128, null, null, 12, null);
        Po6(this, i2, 256, null, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RQ(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, boolean z2) {
        androidComposeViewAccessibilityDelegateCompat.enabledServices = androidComposeViewAccessibilityDelegateCompat.accessibilityManager.getEnabledAccessibilityServiceList(-1);
    }

    private final void U() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (m()) {
                Org(this.view.getSemanticsOwner().nr(), this.previousSemanticsRoot);
            }
            Unit unit = Unit.INSTANCE;
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                UhV(J());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    tFV();
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final SpannableString W(AnnotatedString annotatedString) {
        return (SpannableString) F(AndroidAccessibilitySpannableString_androidKt.rl(annotatedString, this.view.getDensity(), this.view.getFontFamilyResolver(), this.urlSpanCache), 100000);
    }

    private final AccessibilityEvent eF(int virtualViewId, Integer fromIndex, Integer toIndex, Integer itemCount, CharSequence text) {
        AccessibilityEvent accessibilityEventM7 = M7(virtualViewId, 8192);
        if (fromIndex != null) {
            accessibilityEventM7.setFromIndex(fromIndex.intValue());
        }
        if (toIndex != null) {
            accessibilityEventM7.setToIndex(toIndex.intValue());
        }
        if (itemCount != null) {
            accessibilityEventM7.setItemCount(itemCount.intValue());
        }
        if (text != null) {
            accessibilityEventM7.getText().add(text);
        }
        return accessibilityEventM7;
    }

    private final boolean eTf() {
        if (this.accessibilityForceEnabledForTesting) {
            return true;
        }
        return this.accessibilityManager.isEnabled() && this.accessibilityManager.isTouchExplorationEnabled();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0327  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void fcU(int virtualViewId, AccessibilityNodeInfoCompat info, SemanticsNode semanticsNode) {
        View viewKN;
        boolean zBooleanValue;
        boolean z2 = true;
        Resources resources = this.view.getContext().getResources();
        info.ofS("android.view.View");
        SemanticsConfiguration unmergedConfig = semanticsNode.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.f33276n;
        if (unmergedConfig.J2(semanticsProperties.Uo())) {
            info.ofS("android.widget.EditText");
        }
        if (semanticsNode.getUnmergedConfig().J2(semanticsProperties.T())) {
            info.ofS("android.widget.TextView");
        }
        Role role = (Role) SemanticsConfigurationKt.n(semanticsNode.getUnmergedConfig(), semanticsProperties.iF());
        if (role != null) {
            role.getValue();
            if (semanticsNode.getIsFake() || semanticsNode.Z().isEmpty()) {
                Role.Companion companion = Role.INSTANCE;
                if (Role.az(role.getValue(), companion.KN())) {
                    info.RQ(resources.getString(R.string.f31094r));
                } else if (Role.az(role.getValue(), companion.Uo())) {
                    info.RQ(resources.getString(R.string.Ik));
                } else {
                    String strXMQ = SemanticsUtils_androidKt.xMQ(role.getValue());
                    if (!Role.az(role.getValue(), companion.O()) || semanticsNode.g() || semanticsNode.getUnmergedConfig().getIsMergingSemanticsOfDescendants()) {
                        info.ofS(strXMQ);
                    }
                }
            }
            Unit unit = Unit.INSTANCE;
        }
        info.How(this.view.getContext().getPackageName());
        info.Po6(SemanticsUtils_androidKt.Uo(semanticsNode));
        List listZ = semanticsNode.Z();
        int size = listZ.size();
        for (int i2 = 0; i2 < size; i2++) {
            SemanticsNode semanticsNode2 = (SemanticsNode) listZ.get(i2);
            if (J().n(semanticsNode2.getId())) {
                AndroidViewHolder androidViewHolder = this.view.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(semanticsNode2.getLayoutNode());
                if (semanticsNode2.getId() != -1) {
                    if (androidViewHolder != null) {
                        info.t(androidViewHolder);
                    } else {
                        info.nr(this.view, semanticsNode2.getId());
                    }
                }
            }
        }
        if (virtualViewId == this.accessibilityFocusedVirtualViewId) {
            info.dR0(true);
            info.rl(AccessibilityNodeInfoCompat.AccessibilityActionCompat.qie);
        } else {
            info.dR0(false);
            info.rl(AccessibilityNodeInfoCompat.AccessibilityActionCompat.gh);
        }
        lLA(semanticsNode, info);
        tUK(semanticsNode, info);
        info.T3L(AndroidComposeViewAccessibilityDelegateCompat_androidKt.Z(semanticsNode, resources));
        info.xg(AndroidComposeViewAccessibilityDelegateCompat_androidKt.o(semanticsNode));
        SemanticsConfiguration unmergedConfig2 = semanticsNode.getUnmergedConfig();
        SemanticsProperties semanticsProperties2 = SemanticsProperties.f33276n;
        ToggleableState toggleableState = (ToggleableState) SemanticsConfigurationKt.n(unmergedConfig2, semanticsProperties2.s7N());
        if (toggleableState != null) {
            if (toggleableState == ToggleableState.f33331n) {
                info.pJg(true);
            } else if (toggleableState == ToggleableState.f33333t) {
                info.pJg(false);
            }
            Unit unit2 = Unit.INSTANCE;
        }
        Boolean bool = (Boolean) SemanticsConfigurationKt.n(semanticsNode.getUnmergedConfig(), semanticsProperties2.E2());
        if (bool != null) {
            boolean zBooleanValue2 = bool.booleanValue();
            if (role == null ? false : Role.az(role.getValue(), Role.INSTANCE.KN())) {
                info.QZ6(zBooleanValue2);
            } else {
                info.pJg(zBooleanValue2);
            }
            Unit unit3 = Unit.INSTANCE;
        }
        if (!semanticsNode.getUnmergedConfig().getIsMergingSemanticsOfDescendants() || semanticsNode.Z().isEmpty()) {
            List list = (List) SemanticsConfigurationKt.n(semanticsNode.getUnmergedConfig(), semanticsProperties2.nr());
            info.fcU(list != null ? (String) CollectionsKt.firstOrNull(list) : null);
        }
        String str = (String) SemanticsConfigurationKt.n(semanticsNode.getUnmergedConfig(), semanticsProperties2.X());
        if (str != null) {
            SemanticsNode semanticsNodeR = semanticsNode;
            while (true) {
                if (semanticsNodeR == null) {
                    zBooleanValue = false;
                    break;
                }
                SemanticsConfiguration unmergedConfig3 = semanticsNodeR.getUnmergedConfig();
                SemanticsPropertiesAndroid semanticsPropertiesAndroid = SemanticsPropertiesAndroid.f33294n;
                if (unmergedConfig3.J2(semanticsPropertiesAndroid.n())) {
                    zBooleanValue = ((Boolean) semanticsNodeR.getUnmergedConfig().xMQ(semanticsPropertiesAndroid.n())).booleanValue();
                    break;
                }
                semanticsNodeR = semanticsNodeR.r();
            }
            if (zBooleanValue) {
                info.HBN(str);
            }
        }
        SemanticsConfiguration unmergedConfig4 = semanticsNode.getUnmergedConfig();
        SemanticsProperties semanticsProperties3 = SemanticsProperties.f33276n;
        if (((Unit) SemanticsConfigurationKt.n(unmergedConfig4, semanticsProperties3.mUb())) != null) {
            info.HV(true);
            Unit unit4 = Unit.INSTANCE;
        }
        info.kSg(semanticsNode.getUnmergedConfig().J2(semanticsProperties3.g()));
        info.n1(semanticsNode.getUnmergedConfig().J2(semanticsProperties3.o()));
        Integer num = (Integer) SemanticsConfigurationKt.n(semanticsNode.getUnmergedConfig(), semanticsProperties3.ViF());
        info.i(num != null ? num.intValue() : -1);
        info.Jk(AndroidComposeViewAccessibilityDelegateCompat_androidKt.HI(semanticsNode));
        info.qm(semanticsNode.getUnmergedConfig().J2(semanticsProperties3.xMQ()));
        if (info.jB()) {
            info.mYa(((Boolean) semanticsNode.getUnmergedConfig().xMQ(semanticsProperties3.xMQ())).booleanValue());
            if (info.U()) {
                info.n(2);
                this.focusedVirtualViewId = virtualViewId;
            } else {
                info.n(1);
            }
        }
        info.UF(!SemanticsUtils_androidKt.J2(semanticsNode));
        LiveRegionMode liveRegionMode = (LiveRegionMode) SemanticsConfigurationKt.n(semanticsNode.getUnmergedConfig(), semanticsProperties3.aYN());
        if (liveRegionMode != null) {
            int value = liveRegionMode.getValue();
            LiveRegionMode.Companion companion2 = LiveRegionMode.INSTANCE;
            info.hRu((LiveRegionMode.J2(value, companion2.rl()) || !LiveRegionMode.J2(value, companion2.n())) ? 1 : 2);
            Unit unit5 = Unit.INSTANCE;
        }
        info.C(false);
        SemanticsConfiguration unmergedConfig5 = semanticsNode.getUnmergedConfig();
        SemanticsActions semanticsActions = SemanticsActions.f33251n;
        AccessibilityAction accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.n(unmergedConfig5, semanticsActions.qie());
        if (accessibilityAction != null) {
            boolean zAreEqual = Intrinsics.areEqual(SemanticsConfigurationKt.n(semanticsNode.getUnmergedConfig(), semanticsProperties3.E2()), Boolean.TRUE);
            Role.Companion companion3 = Role.INSTANCE;
            if (!(role == null ? false : Role.az(role.getValue(), companion3.KN()))) {
                boolean z3 = role == null ? false : Role.az(role.getValue(), companion3.J2());
                info.C(!z3 || (z3 && !zAreEqual));
                if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.HI(semanticsNode) && info.v()) {
                    info.rl(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16, accessibilityAction.getLabel()));
                }
                Unit unit6 = Unit.INSTANCE;
            }
        }
        info.UhV(false);
        AccessibilityAction accessibilityAction2 = (AccessibilityAction) SemanticsConfigurationKt.n(semanticsNode.getUnmergedConfig(), semanticsActions.ty());
        if (accessibilityAction2 != null) {
            info.UhV(true);
            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.HI(semanticsNode)) {
                info.rl(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(32, accessibilityAction2.getLabel()));
            }
            Unit unit7 = Unit.INSTANCE;
        }
        AccessibilityAction accessibilityAction3 = (AccessibilityAction) SemanticsConfigurationKt.n(semanticsNode.getUnmergedConfig(), semanticsActions.t());
        if (accessibilityAction3 != null) {
            info.rl(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16384, accessibilityAction3.getLabel()));
            Unit unit8 = Unit.INSTANCE;
        }
        if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.HI(semanticsNode)) {
            AccessibilityAction accessibilityAction4 = (AccessibilityAction) SemanticsConfigurationKt.n(semanticsNode.getUnmergedConfig(), semanticsActions.nY());
            if (accessibilityAction4 != null) {
                info.rl(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(2097152, accessibilityAction4.getLabel()));
                Unit unit9 = Unit.INSTANCE;
            }
            AccessibilityAction accessibilityAction5 = (AccessibilityAction) SemanticsConfigurationKt.n(semanticsNode.getUnmergedConfig(), semanticsActions.az());
            if (accessibilityAction5 != null) {
                info.rl(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.R.id.accessibilityActionImeEnter, accessibilityAction5.getLabel()));
                Unit unit10 = Unit.INSTANCE;
            }
            AccessibilityAction accessibilityAction6 = (AccessibilityAction) SemanticsConfigurationKt.n(semanticsNode.getUnmergedConfig(), semanticsActions.O());
            if (accessibilityAction6 != null) {
                info.rl(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(65536, accessibilityAction6.getLabel()));
                Unit unit11 = Unit.INSTANCE;
            }
            AccessibilityAction accessibilityAction7 = (AccessibilityAction) SemanticsConfigurationKt.n(semanticsNode.getUnmergedConfig(), semanticsActions.o());
            if (accessibilityAction7 != null) {
                if (info.U() && this.view.getClipboardManager().rl()) {
                    info.rl(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(32768, accessibilityAction7.getLabel()));
                }
                Unit unit12 = Unit.INSTANCE;
            }
        }
        String strNxk = Nxk(semanticsNode);
        if (!(strNxk == null || strNxk.length() == 0)) {
            info.p0N(B(semanticsNode), FX(semanticsNode));
            AccessibilityAction accessibilityAction8 = (AccessibilityAction) SemanticsConfigurationKt.n(semanticsNode.getUnmergedConfig(), semanticsActions.ViF());
            info.rl(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(131072, accessibilityAction8 != null ? accessibilityAction8.getLabel() : null));
            info.n(256);
            info.n(512);
            info.K(11);
            List list2 = (List) SemanticsConfigurationKt.n(semanticsNode.getUnmergedConfig(), semanticsProperties3.nr());
            if ((list2 == null || list2.isEmpty()) && semanticsNode.getUnmergedConfig().J2(semanticsActions.xMQ()) && !AndroidComposeViewAccessibilityDelegateCompat_androidKt.ck(semanticsNode)) {
                info.K(info.aYN() | 20);
            }
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 26) {
            ArrayList arrayList = new ArrayList();
            arrayList.add("androidx.compose.ui.semantics.id");
            CharSequence charSequenceIF = info.iF();
            if (!(charSequenceIF == null || charSequenceIF.length() == 0) && semanticsNode.getUnmergedConfig().J2(semanticsActions.xMQ())) {
                arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
            }
            if (semanticsNode.getUnmergedConfig().J2(semanticsProperties3.X())) {
                arrayList.add("androidx.compose.ui.semantics.testTag");
            }
            info.z(arrayList);
        }
        ProgressBarRangeInfo progressBarRangeInfo = (ProgressBarRangeInfo) SemanticsConfigurationKt.n(semanticsNode.getUnmergedConfig(), semanticsProperties3.te());
        if (progressBarRangeInfo != null) {
            if (semanticsNode.getUnmergedConfig().J2(semanticsActions.aYN())) {
                info.ofS("android.widget.SeekBar");
            } else {
                info.ofS("android.widget.ProgressBar");
            }
            if (progressBarRangeInfo != ProgressBarRangeInfo.INSTANCE.n()) {
                info.W(AccessibilityNodeInfoCompat.RangeInfoCompat.n(1, ((Number) progressBarRangeInfo.getRange().getStart()).floatValue(), ((Number) progressBarRangeInfo.getRange().getEndInclusive()).floatValue(), progressBarRangeInfo.getCurrent()));
            }
            if (semanticsNode.getUnmergedConfig().J2(semanticsActions.aYN()) && AndroidComposeViewAccessibilityDelegateCompat_androidKt.HI(semanticsNode)) {
                if (progressBarRangeInfo.getCurrent() < RangesKt.coerceAtLeast(((Number) progressBarRangeInfo.getRange().getEndInclusive()).floatValue(), ((Number) progressBarRangeInfo.getRange().getStart()).floatValue())) {
                    info.rl(AccessibilityNodeInfoCompat.AccessibilityActionCompat.Ik);
                }
                if (progressBarRangeInfo.getCurrent() > RangesKt.coerceAtMost(((Number) progressBarRangeInfo.getRange().getStart()).floatValue(), ((Number) progressBarRangeInfo.getRange().getEndInclusive()).floatValue())) {
                    info.rl(AccessibilityNodeInfoCompat.AccessibilityActionCompat.f36858r);
                }
            }
        }
        Api24Impl.n(info, semanticsNode);
        CollectionInfo_androidKt.nr(semanticsNode, info);
        CollectionInfo_androidKt.O(semanticsNode, info);
        ScrollAxisRange scrollAxisRange = (ScrollAxisRange) SemanticsConfigurationKt.n(semanticsNode.getUnmergedConfig(), semanticsProperties3.qie());
        AccessibilityAction accessibilityAction9 = (AccessibilityAction) SemanticsConfigurationKt.n(semanticsNode.getUnmergedConfig(), semanticsActions.XQ());
        if (scrollAxisRange != null && accessibilityAction9 != null) {
            if (!CollectionInfo_androidKt.rl(semanticsNode)) {
                info.ofS("android.widget.HorizontalScrollView");
            }
            if (((Number) scrollAxisRange.getMaxValue().invoke()).floatValue() > 0.0f) {
                info.F(true);
            }
            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.HI(semanticsNode)) {
                if (ul(scrollAxisRange)) {
                    info.rl(AccessibilityNodeInfoCompat.AccessibilityActionCompat.Ik);
                    info.rl(!AndroidComposeViewAccessibilityDelegateCompat_androidKt.S(semanticsNode) ? AccessibilityNodeInfoCompat.AccessibilityActionCompat.f36855e : AccessibilityNodeInfoCompat.AccessibilityActionCompat.fD);
                }
                if (eWT(scrollAxisRange)) {
                    info.rl(AccessibilityNodeInfoCompat.AccessibilityActionCompat.f36858r);
                    info.rl(!AndroidComposeViewAccessibilityDelegateCompat_androidKt.S(semanticsNode) ? AccessibilityNodeInfoCompat.AccessibilityActionCompat.fD : AccessibilityNodeInfoCompat.AccessibilityActionCompat.f36855e);
                }
            }
        }
        ScrollAxisRange scrollAxisRange2 = (ScrollAxisRange) SemanticsConfigurationKt.n(semanticsNode.getUnmergedConfig(), semanticsProperties3.v());
        if (scrollAxisRange2 != null && accessibilityAction9 != null) {
            if (!CollectionInfo_androidKt.rl(semanticsNode)) {
                info.ofS("android.widget.ScrollView");
            }
            if (((Number) scrollAxisRange2.getMaxValue().invoke()).floatValue() > 0.0f) {
                info.F(true);
            }
            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.HI(semanticsNode)) {
                if (ul(scrollAxisRange2)) {
                    info.rl(AccessibilityNodeInfoCompat.AccessibilityActionCompat.Ik);
                    info.rl(AccessibilityNodeInfoCompat.AccessibilityActionCompat.E2);
                }
                if (eWT(scrollAxisRange2)) {
                    info.rl(AccessibilityNodeInfoCompat.AccessibilityActionCompat.f36858r);
                    info.rl(AccessibilityNodeInfoCompat.AccessibilityActionCompat.iF);
                }
            }
        }
        if (i3 >= 29) {
            Api29Impl.n(info, semanticsNode);
        }
        info.tUK((CharSequence) SemanticsConfigurationKt.n(semanticsNode.getUnmergedConfig(), semanticsProperties3.nY()));
        if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.HI(semanticsNode)) {
            AccessibilityAction accessibilityAction10 = (AccessibilityAction) SemanticsConfigurationKt.n(semanticsNode.getUnmergedConfig(), semanticsActions.Uo());
            if (accessibilityAction10 != null) {
                info.rl(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(262144, accessibilityAction10.getLabel()));
                Unit unit13 = Unit.INSTANCE;
            }
            AccessibilityAction accessibilityAction11 = (AccessibilityAction) SemanticsConfigurationKt.n(semanticsNode.getUnmergedConfig(), semanticsActions.rl());
            if (accessibilityAction11 != null) {
                info.rl(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(524288, accessibilityAction11.getLabel()));
                Unit unit14 = Unit.INSTANCE;
            }
            AccessibilityAction accessibilityAction12 = (AccessibilityAction) SemanticsConfigurationKt.n(semanticsNode.getUnmergedConfig(), semanticsActions.J2());
            if (accessibilityAction12 != null) {
                info.rl(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(1048576, accessibilityAction12.getLabel()));
                Unit unit15 = Unit.INSTANCE;
            }
            if (semanticsNode.getUnmergedConfig().J2(semanticsActions.nr())) {
                List list3 = (List) semanticsNode.getUnmergedConfig().xMQ(semanticsActions.nr());
                int size2 = list3.size();
                IntList intList = P5;
                if (size2 >= intList._size) {
                    throw new IllegalStateException("Can't have more than " + intList._size + " custom actions for one widget");
                }
                SparseArrayCompat sparseArrayCompat = new SparseArrayCompat(0, 1, null);
                MutableObjectIntMap mutableObjectIntMapRl = ObjectIntMapKt.rl();
                if (this.labelToActionId.nr(virtualViewId)) {
                    MutableObjectIntMap mutableObjectIntMap = (MutableObjectIntMap) this.labelToActionId.O(virtualViewId);
                    MutableIntList mutableIntList = new MutableIntList(0, 1, null);
                    int[] iArr = intList.content;
                    int i5 = intList._size;
                    int i7 = 0;
                    while (i7 < i5) {
                        mutableIntList.qie(iArr[i7]);
                        i7++;
                        z2 = z2;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    int size3 = list3.size();
                    for (int i8 = 0; i8 < size3; i8++) {
                        CustomAccessibilityAction customAccessibilityAction = (CustomAccessibilityAction) list3.get(i8);
                        Intrinsics.checkNotNull(mutableObjectIntMap);
                        if (mutableObjectIntMap.n(customAccessibilityAction.getLabel())) {
                            int iT = mutableObjectIntMap.t(customAccessibilityAction.getLabel());
                            sparseArrayCompat.az(iT, customAccessibilityAction.getLabel());
                            mutableObjectIntMapRl.XQ(customAccessibilityAction.getLabel(), iT);
                            mutableIntList.HI(iT);
                            info.rl(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(iT, customAccessibilityAction.getLabel()));
                        } else {
                            arrayList2.add(customAccessibilityAction);
                        }
                    }
                    int size4 = arrayList2.size();
                    for (int i9 = 0; i9 < size4; i9++) {
                        CustomAccessibilityAction customAccessibilityAction2 = (CustomAccessibilityAction) arrayList2.get(i9);
                        int iO = mutableIntList.O(i9);
                        sparseArrayCompat.az(iO, customAccessibilityAction2.getLabel());
                        mutableObjectIntMapRl.XQ(customAccessibilityAction2.getLabel(), iO);
                        info.rl(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(iO, customAccessibilityAction2.getLabel()));
                    }
                } else {
                    int size5 = list3.size();
                    for (int i10 = 0; i10 < size5; i10++) {
                        CustomAccessibilityAction customAccessibilityAction3 = (CustomAccessibilityAction) list3.get(i10);
                        int iO2 = P5.O(i10);
                        sparseArrayCompat.az(iO2, customAccessibilityAction3.getLabel());
                        mutableObjectIntMapRl.XQ(customAccessibilityAction3.getLabel(), iO2);
                        info.rl(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(iO2, customAccessibilityAction3.getLabel()));
                    }
                }
                this.actionIdToLabel.az(virtualViewId, sparseArrayCompat);
                this.labelToActionId.az(virtualViewId, mutableObjectIntMapRl);
            }
        }
        info.a63(AndroidComposeViewAccessibilityDelegateCompat_androidKt.WPU(semanticsNode, resources));
        int iO3 = this.idToBeforeMap.O(virtualViewId, -1);
        if (iO3 != -1) {
            View viewKN2 = SemanticsUtils_androidKt.KN(this.view.getAndroidViewsHandler$ui_release(), iO3);
            if (viewKN2 != null) {
                info.ub(viewKN2);
            } else {
                info.Qu(this.view, iO3);
            }
            v(virtualViewId, info, this.ExtraDataTestTraversalBeforeVal, null);
        }
        int iO4 = this.idToAfterMap.O(virtualViewId, -1);
        if (iO4 == -1 || (viewKN = SemanticsUtils_androidKt.KN(this.view.getAndroidViewsHandler$ui_release(), iO4)) == null) {
            return;
        }
        info.Uf(viewKN);
        v(virtualViewId, info, this.ExtraDataTestTraversalAfterVal, null);
    }

    private final void hRu(int semanticsNodeId) {
        PendingTextTraversedEvent pendingTextTraversedEvent = this.pendingTextTraversedEvent;
        if (pendingTextTraversedEvent != null) {
            if (semanticsNodeId != pendingTextTraversedEvent.getNode().getId()) {
                return;
            }
            if (SystemClock.uptimeMillis() - pendingTextTraversedEvent.getTraverseTime() <= 1000) {
                AccessibilityEvent accessibilityEventM7 = M7(mYa(pendingTextTraversedEvent.getNode().getId()), 131072);
                accessibilityEventM7.setFromIndex(pendingTextTraversedEvent.getFromIndex());
                accessibilityEventM7.setToIndex(pendingTextTraversedEvent.getToIndex());
                accessibilityEventM7.setAction(pendingTextTraversedEvent.getAction());
                accessibilityEventM7.setMovementGranularity(pendingTextTraversedEvent.getGranularity());
                accessibilityEventM7.getText().add(Nxk(pendingTextTraversedEvent.getNode()));
                HV(accessibilityEventM7);
            }
        }
        this.pendingTextTraversedEvent = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean jB(IntObjectMap currentSemanticsNodes, boolean vertical, int direction, long position) {
        SemanticsPropertyKey semanticsPropertyKeyQie;
        ScrollAxisRange scrollAxisRange;
        if (Offset.mUb(position, Offset.INSTANCE.rl()) || (((9223372034707292159L & position) + 36028792732385279L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        if (vertical) {
            semanticsPropertyKeyQie = SemanticsProperties.f33276n.v();
        } else {
            if (vertical) {
                throw new NoWhenBranchMatchedException();
            }
            semanticsPropertyKeyQie = SemanticsProperties.f33276n.qie();
        }
        Object[] objArr = currentSemanticsNodes.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_VALUES java.lang.String;
        long[] jArr = currentSemanticsNodes.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return false;
        }
        int i2 = 0;
        boolean z2 = false;
        while (true) {
            long j2 = jArr[i2];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i5 = 0; i5 < i3; i5++) {
                    if ((j2 & 255) < 128) {
                        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) objArr[(i2 << 3) + i5];
                        if (RectHelper_androidKt.O(semanticsNodeWithAdjustedBounds.getAdjustedBounds()).J2(position) && (scrollAxisRange = (ScrollAxisRange) SemanticsConfigurationKt.n(semanticsNodeWithAdjustedBounds.getSemanticsNode().getUnmergedConfig(), semanticsPropertyKeyQie)) != null) {
                            int i7 = scrollAxisRange.getReverseScrolling() ? -direction : direction;
                            if (direction == 0 && scrollAxisRange.getReverseScrolling()) {
                                i7 = -1;
                            }
                            if (i7 < 0) {
                                if (((Number) scrollAxisRange.getValue().invoke()).floatValue() > 0.0f) {
                                    z2 = true;
                                }
                            } else if (((Number) scrollAxisRange.getValue().invoke()).floatValue() < ((Number) scrollAxisRange.getMaxValue().invoke()).floatValue()) {
                            }
                        }
                    }
                    j2 >>= 8;
                }
                if (i3 != 8) {
                    return z2;
                }
            }
            if (i2 == length) {
                return z2;
            }
            i2++;
        }
    }

    private final AnnotatedString k(SemanticsConfiguration semanticsConfiguration) {
        return (AnnotatedString) SemanticsConfigurationKt.n(semanticsConfiguration, SemanticsProperties.f33276n.Uo());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int mYa(int id) {
        if (id == this.view.getSemanticsOwner().nr().getId()) {
            return -1;
        }
        return id;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final AccessibilityNodeInfoCompat p5(int virtualViewId) {
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycleRegistry;
        AndroidComposeView.ViewTreeOwners viewTreeOwners = this.view.getViewTreeOwners();
        if (((viewTreeOwners == null || (lifecycleOwner = viewTreeOwners.getLifecycleOwner()) == null || (lifecycleRegistry = lifecycleOwner.getLifecycleRegistry()) == null) ? null : lifecycleRegistry.getState()) == Lifecycle.State.f38882n) {
            return null;
        }
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompatD = AccessibilityNodeInfoCompat.D();
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) J().rl(virtualViewId);
        if (semanticsNodeWithAdjustedBounds == null) {
            return null;
        }
        SemanticsNode semanticsNode = semanticsNodeWithAdjustedBounds.getSemanticsNode();
        if (virtualViewId == -1) {
            ViewParent parentForAccessibility = this.view.getParentForAccessibility();
            accessibilityNodeInfoCompatD.ER(parentForAccessibility instanceof View ? (View) parentForAccessibility : null);
        } else {
            SemanticsNode semanticsNodeR = semanticsNode.r();
            Integer numValueOf = semanticsNodeR != null ? Integer.valueOf(semanticsNodeR.getId()) : null;
            if (numValueOf == null) {
                InlineClassHelperKt.nr("semanticsNode " + virtualViewId + " has null parent");
                throw new KotlinNothingValueException();
            }
            int iIntValue = numValueOf.intValue();
            accessibilityNodeInfoCompatD.lLA(this.view, iIntValue != this.view.getSemanticsOwner().nr().getId() ? iIntValue : -1);
        }
        accessibilityNodeInfoCompatD.mI(this.view, virtualViewId);
        accessibilityNodeInfoCompatD.m(rV9(semanticsNodeWithAdjustedBounds));
        fcU(virtualViewId, accessibilityNodeInfoCompatD, semanticsNode);
        return accessibilityNodeInfoCompatD;
    }

    private final boolean piY(int virtualViewId) {
        return this.accessibilityFocusedVirtualViewId == virtualViewId;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void qm(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        Trace.beginSection("measureAndLayout");
        try {
            Owner.t(androidComposeViewAccessibilityDelegateCompat.view, false, 1, null);
            Unit unit = Unit.INSTANCE;
            Trace.endSection();
            Trace.beginSection("checkForSemanticsChanges");
            try {
                androidComposeViewAccessibilityDelegateCompat.U();
                Trace.endSection();
                androidComposeViewAccessibilityDelegateCompat.checkingForSemanticsChanges = false;
            } finally {
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x014e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void tFV() {
        long j2;
        long j3;
        long j4;
        long j5;
        SemanticsConfiguration unmergedConfig;
        MutableIntSet mutableIntSet = new MutableIntSet(0, 1, null);
        MutableIntSet mutableIntSet2 = this.paneDisplayed;
        int[] iArr = mutableIntSet2.elements;
        long[] jArr = mutableIntSet2.metadata;
        int length = jArr.length - 2;
        long j6 = 128;
        long j7 = 255;
        char c2 = 7;
        long j9 = -9187201950435737472L;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j10 = jArr[i2];
                int[] iArr2 = iArr;
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i3) {
                        if ((j10 & j7) < j6) {
                            j4 = j6;
                            int i7 = iArr2[(i2 << 3) + i5];
                            SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) J().rl(i7);
                            SemanticsNode semanticsNode = semanticsNodeWithAdjustedBounds != null ? semanticsNodeWithAdjustedBounds.getSemanticsNode() : null;
                            if (semanticsNode != null) {
                                j5 = j7;
                                if (!semanticsNode.getUnmergedConfig().J2(SemanticsProperties.f33276n.nY())) {
                                }
                            } else {
                                j5 = j7;
                            }
                            mutableIntSet.Uo(i7);
                            SemanticsNodeCopy semanticsNodeCopy = (SemanticsNodeCopy) this.previousSemanticsNodes.rl(i7);
                            EWS(i7, 32, (semanticsNodeCopy == null || (unmergedConfig = semanticsNodeCopy.getUnmergedConfig()) == null) ? null : (String) SemanticsConfigurationKt.n(unmergedConfig, SemanticsProperties.f33276n.nY()));
                        } else {
                            j4 = j6;
                            j5 = j7;
                        }
                        j10 >>= 8;
                        i5++;
                        j6 = j4;
                        j7 = j5;
                    }
                    j2 = j6;
                    j3 = j7;
                    if (i3 != 8) {
                        break;
                    }
                } else {
                    j2 = j6;
                    j3 = j7;
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                iArr = iArr2;
                j6 = j2;
                j7 = j3;
            }
        } else {
            j2 = 128;
            j3 = 255;
        }
        this.paneDisplayed.o(mutableIntSet);
        this.previousSemanticsNodes.Uo();
        IntObjectMap intObjectMapJ = J();
        int[] iArr3 = intObjectMapJ.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_KEYS java.lang.String;
        Object[] objArr = intObjectMapJ.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_VALUES java.lang.String;
        long[] jArr2 = intObjectMapJ.metadata;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i8 = 0;
            while (true) {
                long j11 = jArr2[i8];
                if ((((~j11) << c2) & j11 & j9) != j9) {
                    int i9 = 8 - ((~(i8 - length2)) >>> 31);
                    for (int i10 = 0; i10 < i9; i10++) {
                        if ((j11 & j3) < j2) {
                            int i11 = (i8 << 3) + i10;
                            int i12 = iArr3[i11];
                            SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds2 = (SemanticsNodeWithAdjustedBounds) objArr[i11];
                            SemanticsConfiguration unmergedConfig2 = semanticsNodeWithAdjustedBounds2.getSemanticsNode().getUnmergedConfig();
                            SemanticsProperties semanticsProperties = SemanticsProperties.f33276n;
                            if (unmergedConfig2.J2(semanticsProperties.nY()) && this.paneDisplayed.Uo(i12)) {
                                EWS(i12, 16, (String) semanticsNodeWithAdjustedBounds2.getSemanticsNode().getUnmergedConfig().xMQ(semanticsProperties.nY()));
                            }
                            this.previousSemanticsNodes.r(i12, new SemanticsNodeCopy(semanticsNodeWithAdjustedBounds2.getSemanticsNode(), J()));
                        }
                        j11 >>= 8;
                    }
                    if (i9 != 8) {
                        break;
                    }
                    if (i8 == length2) {
                        break;
                    }
                    i8++;
                    c2 = 7;
                    j9 = -9187201950435737472L;
                }
            }
        }
        this.previousSemanticsRoot = new SemanticsNodeCopy(this.view.getSemanticsOwner().nr(), J());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void xg(LayoutNode layoutNode) {
        if (this.subtreeChangedLayoutNodes.add(layoutNode)) {
            this.boundsUpdateChannel.nr(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final String getExtraDataTestTraversalAfterVal() {
        return this.ExtraDataTestTraversalAfterVal;
    }

    public final void ER(long j2) {
        this.SendRecurringAccessibilityEventsIntervalMillis = j2;
    }

    /* JADX INFO: renamed from: GR, reason: from getter */
    public final MutableIntIntMap getIdToBeforeMap() {
        return this.idToBeforeMap;
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public final MutableIntIntMap getIdToAfterMap() {
        return this.idToAfterMap;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getExtraDataTestTraversalBeforeVal() {
        return this.ExtraDataTestTraversalBeforeVal;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cf, code lost:
    
        if (GJW.yg.rl(r8, r0) == r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007f A[Catch: all -> 0x003a, TryCatch #1 {all -> 0x003a, blocks: (B:13:0x0035, B:25:0x0065, B:29:0x0077, B:31:0x007f, B:33:0x0088, B:35:0x0091, B:36:0x00a2, B:38:0x00a9, B:39:0x00b2, B:20:0x0051), top: B:50:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00cf -> B:14:0x0038). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object bzg(Continuation continuation) {
        AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1 androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1;
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat;
        MutableIntSet mutableIntSet;
        ILs.Dsr it;
        MutableIntSet mutableIntSet2;
        Object objRl;
        if (continuation instanceof AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1) {
            androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1 = (AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1) continuation;
            int i2 = androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.f32761o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.f32761o = i2 - Integer.MIN_VALUE;
            } else {
                androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1 = new AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1(this, continuation);
            }
        }
        Object obj = androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.J2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.f32761o;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                try {
                    mutableIntSet = new MutableIntSet(0, 1, null);
                    it = this.boundsUpdateChannel.iterator();
                    androidComposeViewAccessibilityDelegateCompat = this;
                    androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.f32760n = androidComposeViewAccessibilityDelegateCompat;
                    androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.f32763t = mutableIntSet;
                    androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.f32759O = it;
                    androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.f32761o = 1;
                    objRl = it.rl(androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1);
                    if (objRl != coroutine_suspended) {
                    }
                } catch (Throwable th) {
                    th = th;
                    androidComposeViewAccessibilityDelegateCompat = this;
                    androidComposeViewAccessibilityDelegateCompat.subtreeChangedLayoutNodes.clear();
                    throw th;
                }
            } else if (i3 == 1) {
                it = (ILs.Dsr) androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.f32759O;
                mutableIntSet2 = (MutableIntSet) androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.f32763t;
                androidComposeViewAccessibilityDelegateCompat = (AndroidComposeViewAccessibilityDelegateCompat) androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.f32760n;
                ResultKt.throwOnFailure(obj);
                if (((Boolean) obj).booleanValue()) {
                }
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (ILs.Dsr) androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.f32759O;
                mutableIntSet2 = (MutableIntSet) androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.f32763t;
                androidComposeViewAccessibilityDelegateCompat = (AndroidComposeViewAccessibilityDelegateCompat) androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.f32760n;
                ResultKt.throwOnFailure(obj);
                mutableIntSet = mutableIntSet2;
                androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.f32760n = androidComposeViewAccessibilityDelegateCompat;
                androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.f32763t = mutableIntSet;
                androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.f32759O = it;
                androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.f32761o = 1;
                objRl = it.rl(androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1);
                if (objRl != coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutableIntSet2 = mutableIntSet;
                obj = objRl;
                if (((Boolean) obj).booleanValue()) {
                    androidComposeViewAccessibilityDelegateCompat.subtreeChangedLayoutNodes.clear();
                    return Unit.INSTANCE;
                }
                it.next();
                if (androidComposeViewAccessibilityDelegateCompat.m()) {
                    int size = androidComposeViewAccessibilityDelegateCompat.subtreeChangedLayoutNodes.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        LayoutNode layoutNode = (LayoutNode) androidComposeViewAccessibilityDelegateCompat.subtreeChangedLayoutNodes.az(i5);
                        androidComposeViewAccessibilityDelegateCompat.i(layoutNode, mutableIntSet2);
                        androidComposeViewAccessibilityDelegateCompat.K(layoutNode);
                    }
                    mutableIntSet2.xMQ();
                    if (!androidComposeViewAccessibilityDelegateCompat.checkingForSemanticsChanges) {
                        androidComposeViewAccessibilityDelegateCompat.checkingForSemanticsChanges = true;
                        androidComposeViewAccessibilityDelegateCompat.handler.post(androidComposeViewAccessibilityDelegateCompat.semanticsChangeChecker);
                    }
                }
                androidComposeViewAccessibilityDelegateCompat.subtreeChangedLayoutNodes.clear();
                androidComposeViewAccessibilityDelegateCompat.pendingHorizontalScrollEvents.Uo();
                androidComposeViewAccessibilityDelegateCompat.pendingVerticalScrollEvents.Uo();
                long j2 = androidComposeViewAccessibilityDelegateCompat.SendRecurringAccessibilityEventsIntervalMillis;
                androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.f32760n = androidComposeViewAccessibilityDelegateCompat;
                androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.f32763t = mutableIntSet2;
                androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.f32759O = it;
                androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.f32761o = 2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: dR0, reason: from getter */
    public final AndroidComposeView getView() {
        return this.view;
    }

    public final boolean m() {
        if (this.accessibilityForceEnabledForTesting) {
            return true;
        }
        return this.accessibilityManager.isEnabled() && !this.enabledServices.isEmpty();
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public AccessibilityNodeProviderCompat rl(View host) {
        return this.nodeProvider;
    }

    public final int z(float x2, float y2) {
        int iMYa;
        Owner.t(this.view, false, 1, null);
        HitTestResult hitTestResult = new HitTestResult();
        LayoutNode.How(this.view.getRoot(), Offset.O((((long) Float.floatToRawIntBits(y2)) & 4294967295L) | (Float.floatToRawIntBits(x2) << 32)), hitTestResult, 0, false, 12, null);
        int lastIndex = CollectionsKt.getLastIndex(hitTestResult);
        while (true) {
            iMYa = Integer.MIN_VALUE;
            if (-1 >= lastIndex) {
                break;
            }
            LayoutNode layoutNodeHI = DelegatableNodeKt.HI(hitTestResult.get(lastIndex));
            if (this.view.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(layoutNodeHI) != null) {
                return Integer.MIN_VALUE;
            }
            if (layoutNodeHI.getNodes().Ik(NodeKind.n(8))) {
                iMYa = mYa(layoutNodeHI.getSemanticsId());
                SemanticsNode semanticsNodeN = SemanticsNodeKt.n(layoutNodeHI, false);
                if (SemanticsUtils_androidKt.Uo(semanticsNodeN) && !semanticsNodeN.ty().J2(SemanticsProperties.f33276n.WPU())) {
                    break;
                }
            }
            lastIndex--;
        }
        return iMYa;
    }

    public AndroidComposeViewAccessibilityDelegateCompat(AndroidComposeView androidComposeView) {
        this.view = androidComposeView;
        Object systemService = androidComposeView.getContext().getSystemService("accessibility");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        android.view.accessibility.AccessibilityManager accessibilityManager = (android.view.accessibility.AccessibilityManager) systemService;
        this.accessibilityManager = accessibilityManager;
        this.SendRecurringAccessibilityEventsIntervalMillis = 100L;
        this.enabledStateListener = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: androidx.compose.ui.platform.CN3
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z2) {
                AndroidComposeViewAccessibilityDelegateCompat.M(this.f32869n, z2);
            }
        };
        this.touchExplorationStateListener = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: androidx.compose.ui.platform.fuX
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z2) {
                AndroidComposeViewAccessibilityDelegateCompat.RQ(this.f33182n, z2);
            }
        };
        this.enabledServices = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.handler = new Handler(Looper.getMainLooper());
        this.nodeProvider = new ComposeAccessibilityNodeProvider();
        this.accessibilityFocusedVirtualViewId = Integer.MIN_VALUE;
        this.focusedVirtualViewId = Integer.MIN_VALUE;
        this.pendingHorizontalScrollEvents = new MutableIntObjectMap(0, 1, null);
        this.pendingVerticalScrollEvents = new MutableIntObjectMap(0, 1, null);
        this.actionIdToLabel = new SparseArrayCompat(0, 1, null);
        this.labelToActionId = new SparseArrayCompat(0, 1, null);
        this.accessibilityCursorPosition = -1;
        this.subtreeChangedLayoutNodes = new ArraySet(0, 1, null);
        this.boundsUpdateChannel = ILs.aC.rl(1, null, null, 6, null);
        this.currentSemanticsNodesInvalidated = true;
        this.currentSemanticsNodes = IntObjectMapKt.rl();
        this.paneDisplayed = new MutableIntSet(0, 1, null);
        this.idToBeforeMap = new MutableIntIntMap(0, 1, null);
        this.idToAfterMap = new MutableIntIntMap(0, 1, null);
        this.ExtraDataTestTraversalBeforeVal = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.ExtraDataTestTraversalAfterVal = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.urlSpanCache = new URLSpanCache();
        this.previousSemanticsNodes = IntObjectMapKt.t();
        this.previousSemanticsRoot = new SemanticsNodeCopy(androidComposeView.getSemanticsOwner().nr(), IntObjectMapKt.rl());
        androidComposeView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                android.view.accessibility.AccessibilityManager accessibilityManager2 = AndroidComposeViewAccessibilityDelegateCompat.this.accessibilityManager;
                AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = AndroidComposeViewAccessibilityDelegateCompat.this;
                accessibilityManager2.addAccessibilityStateChangeListener(androidComposeViewAccessibilityDelegateCompat.enabledStateListener);
                accessibilityManager2.addTouchExplorationStateChangeListener(androidComposeViewAccessibilityDelegateCompat.touchExplorationStateListener);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                AndroidComposeViewAccessibilityDelegateCompat.this.handler.removeCallbacks(AndroidComposeViewAccessibilityDelegateCompat.this.semanticsChangeChecker);
                android.view.accessibility.AccessibilityManager accessibilityManager2 = AndroidComposeViewAccessibilityDelegateCompat.this.accessibilityManager;
                AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = AndroidComposeViewAccessibilityDelegateCompat.this;
                accessibilityManager2.removeAccessibilityStateChangeListener(androidComposeViewAccessibilityDelegateCompat.enabledStateListener);
                accessibilityManager2.removeTouchExplorationStateChangeListener(androidComposeViewAccessibilityDelegateCompat.touchExplorationStateListener);
            }
        });
        this.semanticsChangeChecker = new Runnable() { // from class: androidx.compose.ui.platform.Dsr
            @Override // java.lang.Runnable
            public final void run() {
                AndroidComposeViewAccessibilityDelegateCompat.qm(this.f32947n);
            }
        };
        this.scrollObservationScopes = new ArrayList();
        this.scheduleScrollEventIfNeededLambda = new Function1<ScrollObservationScope, Unit>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeededLambda$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ScrollObservationScope scrollObservationScope) {
                n(scrollObservationScope);
                return Unit.INSTANCE;
            }

            public final void n(ScrollObservationScope scrollObservationScope) {
                this.f32767n.Rl(scrollObservationScope);
            }
        };
    }

    private final int B(SemanticsNode node) {
        SemanticsConfiguration unmergedConfig = node.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.f33276n;
        if (!unmergedConfig.J2(semanticsProperties.nr()) && node.getUnmergedConfig().J2(semanticsProperties.N())) {
            return TextRange.ty(((TextRange) node.getUnmergedConfig().xMQ(semanticsProperties.N())).getPackedValue());
        }
        return this.accessibilityCursorPosition;
    }

    private final void EWS(int semanticsNodeId, int contentChangeType, String title) {
        AccessibilityEvent accessibilityEventM7 = M7(mYa(semanticsNodeId), 32);
        accessibilityEventM7.setContentChangeTypes(contentChangeType);
        if (title != null) {
            accessibilityEventM7.getText().add(title);
        }
        HV(accessibilityEventM7);
    }

    private final int FX(SemanticsNode node) {
        SemanticsConfiguration unmergedConfig = node.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.f33276n;
        if (!unmergedConfig.J2(semanticsProperties.nr()) && node.getUnmergedConfig().J2(semanticsProperties.N())) {
            return TextRange.xMQ(((TextRange) node.getUnmergedConfig().xMQ(semanticsProperties.N())).getPackedValue());
        }
        return this.accessibilityCursorPosition;
    }

    private static final float G7(float f3, float f4) {
        if (Math.signum(f3) == Math.signum(f4)) {
            if (Math.abs(f3) < Math.abs(f4)) {
                return f3;
            }
            return f4;
        }
        return 0.0f;
    }

    private final boolean HV(AccessibilityEvent event) {
        if (!m()) {
            return false;
        }
        if (event.getEventType() == 2048 || event.getEventType() == 32768) {
            this.sendingFocusAffectingEvent = true;
        }
        try {
            return ((Boolean) this.onSendAccessibilityEvent.invoke(event)).booleanValue();
        } finally {
            this.sendingFocusAffectingEvent = false;
        }
    }

    private final boolean How(SemanticsNode node, int start, int end, boolean traversalMode) {
        String strNxk;
        Integer numValueOf;
        Integer numValueOf2;
        SemanticsConfiguration unmergedConfig = node.getUnmergedConfig();
        SemanticsActions semanticsActions = SemanticsActions.f33251n;
        boolean z2 = false;
        if (unmergedConfig.J2(semanticsActions.ViF()) && AndroidComposeViewAccessibilityDelegateCompat_androidKt.HI(node)) {
            Function3 function3 = (Function3) ((AccessibilityAction) node.getUnmergedConfig().xMQ(semanticsActions.ViF())).getAction();
            if (function3 == null) {
                return false;
            }
            return ((Boolean) function3.invoke(Integer.valueOf(start), Integer.valueOf(end), Boolean.valueOf(traversalMode))).booleanValue();
        }
        if ((start == end && end == this.accessibilityCursorPosition) || (strNxk = Nxk(node)) == null) {
            return false;
        }
        if (start < 0 || start != end || end > strNxk.length()) {
            start = -1;
        }
        this.accessibilityCursorPosition = start;
        if (strNxk.length() > 0) {
            z2 = true;
        }
        int iMYa = mYa(node.getId());
        Integer numValueOf3 = null;
        if (z2) {
            numValueOf = Integer.valueOf(this.accessibilityCursorPosition);
        } else {
            numValueOf = null;
        }
        if (z2) {
            numValueOf2 = Integer.valueOf(this.accessibilityCursorPosition);
        } else {
            numValueOf2 = null;
        }
        if (z2) {
            numValueOf3 = Integer.valueOf(strNxk.length());
        }
        HV(eF(iMYa, numValueOf, numValueOf2, numValueOf3, strNxk));
        hRu(node.getId());
        return true;
    }

    private final boolean Jk(int virtualViewId) {
        if (!eTf() || piY(virtualViewId)) {
            return false;
        }
        int i2 = this.accessibilityFocusedVirtualViewId;
        if (i2 != Integer.MIN_VALUE) {
            Po6(this, i2, 65536, null, null, 12, null);
        }
        this.accessibilityFocusedVirtualViewId = virtualViewId;
        this.view.invalidate();
        Po6(this, virtualViewId, 32768, null, null, 12, null);
        return true;
    }

    private final void K(LayoutNode layoutNode) {
        if (layoutNode.nr() && !this.view.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(layoutNode)) {
            int semanticsId = layoutNode.getSemanticsId();
            ScrollAxisRange scrollAxisRange = (ScrollAxisRange) this.pendingHorizontalScrollEvents.rl(semanticsId);
            ScrollAxisRange scrollAxisRange2 = (ScrollAxisRange) this.pendingVerticalScrollEvents.rl(semanticsId);
            if (scrollAxisRange == null && scrollAxisRange2 == null) {
                return;
            }
            AccessibilityEvent accessibilityEventM7 = M7(semanticsId, 4096);
            if (scrollAxisRange != null) {
                accessibilityEventM7.setScrollX((int) ((Number) scrollAxisRange.getValue().invoke()).floatValue());
                accessibilityEventM7.setMaxScrollX((int) ((Number) scrollAxisRange.getMaxValue().invoke()).floatValue());
            }
            if (scrollAxisRange2 != null) {
                accessibilityEventM7.setScrollY((int) ((Number) scrollAxisRange2.getValue().invoke()).floatValue());
                accessibilityEventM7.setMaxScrollY((int) ((Number) scrollAxisRange2.getMaxValue().invoke()).floatValue());
            }
            HV(accessibilityEventM7);
        }
    }

    private final AccessibilityEvent M7(int virtualViewId, int eventType) {
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds;
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(eventType);
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName("android.view.View");
        accessibilityEventObtain.setPackageName(this.view.getContext().getPackageName());
        accessibilityEventObtain.setSource(this.view, virtualViewId);
        if (m() && (semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) J().rl(virtualViewId)) != null) {
            accessibilityEventObtain.setPassword(semanticsNodeWithAdjustedBounds.getSemanticsNode().getUnmergedConfig().J2(SemanticsProperties.f33276n.g()));
        }
        return accessibilityEventObtain;
    }

    private final boolean P5(int virtualViewId) {
        if (piY(virtualViewId)) {
            this.accessibilityFocusedVirtualViewId = Integer.MIN_VALUE;
            this.currentlyAccessibilityFocusedANI = null;
            this.view.invalidate();
            Po6(this, virtualViewId, 65536, null, null, 12, null);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Rl(final ScrollObservationScope scrollObservationScope) {
        if (!scrollObservationScope.Vvq()) {
            return;
        }
        this.view.getSnapshotObserver().xMQ(scrollObservationScope, this.scheduleScrollEventIfNeededLambda, new Function0<Unit>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeeded$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                SemanticsNode semanticsNode;
                LayoutNode layoutNode;
                ScrollAxisRange horizontalScrollAxisRange = scrollObservationScope.getHorizontalScrollAxisRange();
                ScrollAxisRange verticalScrollAxisRange = scrollObservationScope.getVerticalScrollAxisRange();
                Float oldXValue = scrollObservationScope.getOldXValue();
                Float oldYValue = scrollObservationScope.getOldYValue();
                float fFloatValue = (horizontalScrollAxisRange == null || oldXValue == null) ? 0.0f : ((Number) horizontalScrollAxisRange.getValue().invoke()).floatValue() - oldXValue.floatValue();
                float fFloatValue2 = (verticalScrollAxisRange == null || oldYValue == null) ? 0.0f : ((Number) verticalScrollAxisRange.getValue().invoke()).floatValue() - oldYValue.floatValue();
                if (fFloatValue != 0.0f || fFloatValue2 != 0.0f) {
                    int iMYa = this.mYa(scrollObservationScope.getSemanticsNodeId());
                    SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) this.J().rl(this.accessibilityFocusedVirtualViewId);
                    if (semanticsNodeWithAdjustedBounds != null) {
                        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this;
                        try {
                            AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = androidComposeViewAccessibilityDelegateCompat.currentlyAccessibilityFocusedANI;
                            if (accessibilityNodeInfoCompat != null) {
                                accessibilityNodeInfoCompat.m(androidComposeViewAccessibilityDelegateCompat.rV9(semanticsNodeWithAdjustedBounds));
                                Unit unit = Unit.INSTANCE;
                            }
                        } catch (IllegalStateException unused) {
                            Unit unit2 = Unit.INSTANCE;
                        }
                    }
                    SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds2 = (SemanticsNodeWithAdjustedBounds) this.J().rl(this.focusedVirtualViewId);
                    if (semanticsNodeWithAdjustedBounds2 != null) {
                        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat2 = this;
                        try {
                            AccessibilityNodeInfoCompat accessibilityNodeInfoCompat2 = androidComposeViewAccessibilityDelegateCompat2.currentlyFocusedANI;
                            if (accessibilityNodeInfoCompat2 != null) {
                                accessibilityNodeInfoCompat2.m(androidComposeViewAccessibilityDelegateCompat2.rV9(semanticsNodeWithAdjustedBounds2));
                                Unit unit3 = Unit.INSTANCE;
                            }
                        } catch (IllegalStateException unused2) {
                            Unit unit4 = Unit.INSTANCE;
                        }
                    }
                    this.getView().invalidate();
                    SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds3 = (SemanticsNodeWithAdjustedBounds) this.J().rl(iMYa);
                    if (semanticsNodeWithAdjustedBounds3 != null && (semanticsNode = semanticsNodeWithAdjustedBounds3.getSemanticsNode()) != null && (layoutNode = semanticsNode.getLayoutNode()) != null) {
                        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat3 = this;
                        if (horizontalScrollAxisRange != null) {
                            androidComposeViewAccessibilityDelegateCompat3.pendingHorizontalScrollEvents.r(iMYa, horizontalScrollAxisRange);
                        }
                        if (verticalScrollAxisRange != null) {
                            androidComposeViewAccessibilityDelegateCompat3.pendingVerticalScrollEvents.r(iMYa, verticalScrollAxisRange);
                        }
                        androidComposeViewAccessibilityDelegateCompat3.xg(layoutNode);
                    }
                }
                if (horizontalScrollAxisRange != null) {
                    scrollObservationScope.Uo((Float) horizontalScrollAxisRange.getValue().invoke());
                }
                if (verticalScrollAxisRange != null) {
                    scrollObservationScope.KN((Float) verticalScrollAxisRange.getValue().invoke());
                }
            }
        });
    }

    private final boolean a63(SemanticsNode node, int granularity, boolean forward, boolean extendSelection) {
        int[] iArrRl;
        int iB;
        int i2;
        int i3;
        int id = node.getId();
        Integer num = this.previousTraversedNode;
        if (num == null || id != num.intValue()) {
            this.accessibilityCursorPosition = -1;
            this.previousTraversedNode = Integer.valueOf(node.getId());
        }
        String strNxk = Nxk(node);
        boolean z2 = false;
        if (strNxk != null && strNxk.length() != 0) {
            AccessibilityIterators.TextSegmentIterator textSegmentIteratorY = Y(node, granularity);
            if (textSegmentIteratorY == null) {
                return false;
            }
            int iFX = FX(node);
            if (iFX == -1) {
                if (forward) {
                    iFX = 0;
                } else {
                    iFX = strNxk.length();
                }
            }
            if (forward) {
                iArrRl = textSegmentIteratorY.n(iFX);
            } else {
                iArrRl = textSegmentIteratorY.rl(iFX);
            }
            if (iArrRl == null) {
                return false;
            }
            int i5 = iArrRl[0];
            z2 = true;
            int i7 = iArrRl[1];
            if (extendSelection && ijL(node)) {
                iB = B(node);
                if (iB == -1) {
                    if (forward) {
                        iB = i5;
                    } else {
                        iB = i7;
                    }
                }
                if (forward) {
                    i2 = i7;
                } else {
                    i2 = i5;
                }
            } else {
                if (forward) {
                    iB = i7;
                } else {
                    iB = i5;
                }
                i2 = iB;
            }
            if (forward) {
                i3 = 256;
            } else {
                i3 = 512;
            }
            this.pendingTextTraversedEvent = new PendingTextTraversedEvent(node, i3, granularity, i5, i7, SystemClock.uptimeMillis());
            How(node, iB, i2, true);
        }
        return z2;
    }

    private static final boolean eWT(ScrollAxisRange scrollAxisRange) {
        if (((Number) scrollAxisRange.getValue().invoke()).floatValue() <= 0.0f || scrollAxisRange.getReverseScrolling()) {
            if (((Number) scrollAxisRange.getValue().invoke()).floatValue() < ((Number) scrollAxisRange.getMaxValue().invoke()).floatValue() && scrollAxisRange.getReverseScrolling()) {
                return true;
            }
            return false;
        }
        return true;
    }

    private final void i(LayoutNode layoutNode, MutableIntSet subtreeChangedSemanticsNodesIds) {
        SemanticsConfiguration semanticsConfigurationD;
        LayoutNode layoutNodeIk;
        if (layoutNode.nr() && !this.view.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(layoutNode)) {
            if (!layoutNode.getNodes().Ik(NodeKind.n(8))) {
                layoutNode = AndroidComposeViewAccessibilityDelegateCompat_androidKt.Ik(layoutNode, new Function1<LayoutNode, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$semanticsNode$1
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                    public final Boolean invoke(LayoutNode layoutNode2) {
                        return Boolean.valueOf(layoutNode2.getNodes().Ik(NodeKind.n(8)));
                    }
                });
            }
            if (layoutNode != null && (semanticsConfigurationD = layoutNode.D()) != null) {
                if (!semanticsConfigurationD.getIsMergingSemanticsOfDescendants() && (layoutNodeIk = AndroidComposeViewAccessibilityDelegateCompat_androidKt.Ik(layoutNode, new Function1<LayoutNode, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$1
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                    public final Boolean invoke(LayoutNode layoutNode2) {
                        SemanticsConfiguration semanticsConfigurationD2 = layoutNode2.D();
                        boolean z2 = false;
                        if (semanticsConfigurationD2 != null && semanticsConfigurationD2.getIsMergingSemanticsOfDescendants()) {
                            z2 = true;
                        }
                        return Boolean.valueOf(z2);
                    }
                })) != null) {
                    layoutNode = layoutNodeIk;
                }
                int semanticsId = layoutNode.getSemanticsId();
                if (subtreeChangedSemanticsNodesIds.Uo(semanticsId)) {
                    Po6(this, mYa(semanticsId), 2048, 1, null, 8, null);
                }
            }
        }
    }

    private final boolean ijL(SemanticsNode node) {
        SemanticsConfiguration unmergedConfig = node.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.f33276n;
        if (!unmergedConfig.J2(semanticsProperties.nr()) && node.getUnmergedConfig().J2(semanticsProperties.Uo())) {
            return true;
        }
        return false;
    }

    private final void lLA(SemanticsNode node, AccessibilityNodeInfoCompat info) {
        SpannableString spannableStringW;
        AnnotatedString annotatedStringXQ = AndroidComposeViewAccessibilityDelegateCompat_androidKt.XQ(node);
        if (annotatedStringXQ != null) {
            spannableStringW = W(annotatedStringXQ);
        } else {
            spannableStringW = null;
        }
        info.Bu(spannableStringW);
    }

    private final boolean n1(int id, List oldScrollObservationScopes) {
        boolean z2;
        ScrollObservationScope scrollObservationScopeN = SemanticsUtils_androidKt.n(oldScrollObservationScopes, id);
        if (scrollObservationScopeN != null) {
            z2 = false;
        } else {
            ScrollObservationScope scrollObservationScope = new ScrollObservationScope(id, this.scrollObservationScopes, null, null, null, null);
            z2 = true;
            scrollObservationScopeN = scrollObservationScope;
        }
        this.scrollObservationScopes.add(scrollObservationScopeN);
        return z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.graphics.Rect rV9(SemanticsNodeWithAdjustedBounds node) {
        android.graphics.Rect adjustedBounds = node.getAdjustedBounds();
        AndroidComposeView androidComposeView = this.view;
        float f3 = adjustedBounds.left;
        long jAYN = androidComposeView.aYN(Offset.O((((long) Float.floatToRawIntBits(adjustedBounds.top)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32)));
        long jAYN2 = this.view.aYN(Offset.O((((long) Float.floatToRawIntBits(adjustedBounds.right)) << 32) | (((long) Float.floatToRawIntBits(adjustedBounds.bottom)) & 4294967295L)));
        return new android.graphics.Rect((int) Math.floor(Float.intBitsToFloat((int) (jAYN >> 32))), (int) Math.floor(Float.intBitsToFloat((int) (jAYN & 4294967295L))), (int) Math.ceil(Float.intBitsToFloat((int) (jAYN2 >> 32))), (int) Math.ceil(Float.intBitsToFloat((int) (jAYN2 & 4294967295L))));
    }

    private final void tUK(SemanticsNode node, AccessibilityNodeInfoCompat info) {
        SemanticsConfiguration unmergedConfig = node.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.f33276n;
        if (unmergedConfig.J2(semanticsProperties.KN())) {
            info.eWT(true);
            info.Rl((CharSequence) SemanticsConfigurationKt.n(node.getUnmergedConfig(), semanticsProperties.KN()));
        }
    }

    private static final boolean ul(ScrollAxisRange scrollAxisRange) {
        if (((Number) scrollAxisRange.getValue().invoke()).floatValue() >= ((Number) scrollAxisRange.getMaxValue().invoke()).floatValue() || scrollAxisRange.getReverseScrolling()) {
            if (((Number) scrollAxisRange.getValue().invoke()).floatValue() > 0.0f && scrollAxisRange.getReverseScrolling()) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(int virtualViewId, AccessibilityNodeInfoCompat info, String extraDataKey, Bundle arguments) {
        SemanticsNode semanticsNode;
        int length;
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) J().rl(virtualViewId);
        if (semanticsNodeWithAdjustedBounds != null && (semanticsNode = semanticsNodeWithAdjustedBounds.getSemanticsNode()) != null) {
            String strNxk = Nxk(semanticsNode);
            if (Intrinsics.areEqual(extraDataKey, this.ExtraDataTestTraversalBeforeVal)) {
                int iO = this.idToBeforeMap.O(virtualViewId, -1);
                if (iO != -1) {
                    info.S().putInt(extraDataKey, iO);
                    return;
                }
                return;
            }
            if (Intrinsics.areEqual(extraDataKey, this.ExtraDataTestTraversalAfterVal)) {
                int iO2 = this.idToAfterMap.O(virtualViewId, -1);
                if (iO2 != -1) {
                    info.S().putInt(extraDataKey, iO2);
                    return;
                }
                return;
            }
            if (semanticsNode.getUnmergedConfig().J2(SemanticsActions.f33251n.xMQ()) && arguments != null && Intrinsics.areEqual(extraDataKey, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
                int i2 = arguments.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
                int i3 = arguments.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
                if (i3 > 0 && i2 >= 0) {
                    if (strNxk != null) {
                        length = strNxk.length();
                    } else {
                        length = Integer.MAX_VALUE;
                    }
                    if (i2 < length) {
                        TextLayoutResult textLayoutResultO = SemanticsUtils_androidKt.O(semanticsNode.getUnmergedConfig());
                        if (textLayoutResultO != null) {
                            ArrayList arrayList = new ArrayList();
                            for (int i5 = 0; i5 < i3; i5++) {
                                int i7 = i2 + i5;
                                if (i7 >= textLayoutResultO.getLayoutInput().getText().length()) {
                                    arrayList.add(null);
                                } else {
                                    arrayList.add(kSg(semanticsNode, textLayoutResultO.nr(i7)));
                                }
                            }
                            info.S().putParcelableArray(extraDataKey, (Parcelable[]) arrayList.toArray(new RectF[0]));
                            return;
                        }
                        return;
                    }
                }
                Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
                return;
            }
            SemanticsConfiguration unmergedConfig = semanticsNode.getUnmergedConfig();
            SemanticsProperties semanticsProperties = SemanticsProperties.f33276n;
            if (unmergedConfig.J2(semanticsProperties.X()) && arguments != null && Intrinsics.areEqual(extraDataKey, "androidx.compose.ui.semantics.testTag")) {
                String str = (String) SemanticsConfigurationKt.n(semanticsNode.getUnmergedConfig(), semanticsProperties.X());
                if (str != null) {
                    info.S().putCharSequence(extraDataKey, str);
                    return;
                }
                return;
            }
            if (Intrinsics.areEqual(extraDataKey, "androidx.compose.ui.semantics.id")) {
                info.S().putInt(extraDataKey, semanticsNode.getId());
            }
        }
    }

    public final boolean E(MotionEvent event) {
        if (!eTf()) {
            return false;
        }
        int action = event.getAction();
        if (action != 7 && action != 9) {
            if (action != 10) {
                return false;
            }
            if (this.hoveredVirtualViewId != Integer.MIN_VALUE) {
                QZ6(Integer.MIN_VALUE);
                return true;
            }
            return this.view.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(event);
        }
        int iZ = z(event.getX(), event.getY());
        boolean zDispatchGenericMotionEvent = this.view.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(event);
        QZ6(iZ);
        if (iZ != Integer.MIN_VALUE) {
            return true;
        }
        return zDispatchGenericMotionEvent;
    }

    public final boolean Xw(boolean vertical, int direction, long position) {
        if (!Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            return false;
        }
        return jB(J(), vertical, direction, position);
    }
}
