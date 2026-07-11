package f0P;

import LdY.Ml;
import QmE.j;
import WzY.C1487z;
import YgZ.uQga.IYJfqUyym;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Region;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ImageButton;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.Fragment;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.view.ComponentActivity;
import com.alightcreative.app.motion.activities.edit.widgets.OutlineScrollerView;
import com.alightcreative.app.motion.scene.CBKnot;
import com.alightcreative.app.motion.scene.CBSegment;
import com.alightcreative.app.motion.scene.ControlHandle;
import com.alightcreative.app.motion.scene.CubicBSpline;
import com.alightcreative.app.motion.scene.CubicBSplineKt;
import com.alightcreative.app.motion.scene.GeometryKt;
import com.alightcreative.app.motion.scene.Keyable;
import com.alightcreative.app.motion.scene.KeyableCBKnot;
import com.alightcreative.app.motion.scene.KeyableCompoundCubicBSpline;
import com.alightcreative.app.motion.scene.KeyableCubicBSpline;
import com.alightcreative.app.motion.scene.KeyableKt;
import com.alightcreative.app.motion.scene.KeyableVector2D;
import com.alightcreative.app.motion.scene.Keyframe;
import com.alightcreative.app.motion.scene.OptionalKeyableVector2D;
import com.alightcreative.app.motion.scene.OptionalVector2D;
import com.alightcreative.app.motion.scene.Scene;
import com.alightcreative.app.motion.scene.SceneElement;
import com.alightcreative.app.motion.scene.SceneElementKt;
import com.alightcreative.app.motion.scene.SceneHolder;
import com.alightcreative.app.motion.scene.SceneSelection;
import com.alightcreative.app.motion.scene.TimeKt;
import com.alightcreative.app.motion.scene.Transform;
import com.alightcreative.app.motion.scene.TransformKt;
import com.alightcreative.app.motion.scene.Vector2D;
import com.alightcreative.snap.SnapGuide;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.firebase.installations.ktx.Bq.YjqZUJsVmhcjko;
import f0P.P;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import mfo.CLVG.aNrWBQYwFf;
import yc.InterfaceC2452g;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 Á\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0005Â\u0001[´\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\bJ\u000f\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\bJ\u000f\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\bJ\u000f\u0010\u000f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\bJ\u000f\u0010\u0010\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\bJ\u000f\u0010\u0011\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\bJ+\u0010\u0017\u001a\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0014\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00160\u00150\u0013\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0019\u0010\bJ\u000f\u0010\u001a\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001a\u0010\bJ\u000f\u0010\u001b\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001b\u0010\bJ\u000f\u0010\u001c\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001c\u0010\bJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002¢\u0006\u0004\b \u0010!J3\u0010&\u001a\u00020%2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\"\u001a\u00020\u001f2\b\b\u0002\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b&\u0010'J\u001f\u0010+\u001a\u00020\t2\u0006\u0010(\u001a\u00020\u00142\u0006\u0010*\u001a\u00020)H\u0003¢\u0006\u0004\b+\u0010,J)\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d0/2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u001d0-H\u0002¢\u0006\u0004\b0\u00101J'\u00103\u001a\u00020\u001d*\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d0/2\u0006\u00102\u001a\u00020\u001dH\u0002¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\tH\u0002¢\u0006\u0004\b5\u0010\bJ\u001f\u00108\u001a\u00020\t2\u0006\u00106\u001a\u00020\u001d2\u0006\u00107\u001a\u00020\u001dH\u0002¢\u0006\u0004\b8\u00109J\u0017\u0010<\u001a\u00020\t2\u0006\u0010;\u001a\u00020:H\u0002¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\tH\u0002¢\u0006\u0004\b>\u0010\bJ+\u0010F\u001a\u00020E2\u0006\u0010@\u001a\u00020?2\b\u0010B\u001a\u0004\u0018\u00010A2\b\u0010D\u001a\u0004\u0018\u00010CH\u0016¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\tH\u0016¢\u0006\u0004\bH\u0010\bJ\u0017\u0010K\u001a\u00020\t2\u0006\u0010J\u001a\u00020IH\u0016¢\u0006\u0004\bK\u0010LJ\u000f\u0010M\u001a\u00020\u001fH\u0016¢\u0006\u0004\bM\u0010NJ!\u0010P\u001a\u00020\t2\u0006\u0010O\u001a\u00020E2\b\u0010D\u001a\u0004\u0018\u00010CH\u0017¢\u0006\u0004\bP\u0010QJ\u000f\u0010R\u001a\u00020\tH\u0016¢\u0006\u0004\bR\u0010\bJ\r\u0010S\u001a\u00020\t¢\u0006\u0004\bS\u0010\bJ\r\u0010T\u001a\u00020\t¢\u0006\u0004\bT\u0010\bJ\r\u0010U\u001a\u00020\t¢\u0006\u0004\bU\u0010\bJ\r\u0010V\u001a\u00020\t¢\u0006\u0004\bV\u0010\bJ\r\u0010W\u001a\u00020\t¢\u0006\u0004\bW\u0010\bJ\u000f\u0010X\u001a\u00020\tH\u0016¢\u0006\u0004\bX\u0010\bJ\u0017\u0010[\u001a\u00020#2\u0006\u0010Z\u001a\u00020YH\u0016¢\u0006\u0004\b[\u0010\\J\u000f\u0010]\u001a\u00020\tH\u0016¢\u0006\u0004\b]\u0010\bJ)\u0010^\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0014\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00160\u00150\u00130\u0012H\u0016¢\u0006\u0004\b^\u0010\u0018J\u000f\u0010_\u001a\u00020\u001fH\u0016¢\u0006\u0004\b_\u0010NJ\u000f\u0010`\u001a\u00020\tH\u0016¢\u0006\u0004\b`\u0010\bR\u0018\u0010d\u001a\u0004\u0018\u00010a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\"\u0010l\u001a\u00020e8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\"\u0010t\u001a\u00020m8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bn\u0010o\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR\"\u0010|\u001a\u00020u8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bv\u0010w\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R\u0019\u0010\u0080\u0001\u001a\u0004\u0018\u00010}8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u001c\u0010\u0084\u0001\u001a\u0005\u0018\u00010\u0081\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0018\u0010\u0086\u0001\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0085\u0001\u0010fR\u0018\u0010\u0088\u0001\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0087\u0001\u0010fR\u0018\u0010\u008a\u0001\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0089\u0001\u0010fR\u0019\u0010\u008d\u0001\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0019\u0010\u008f\u0001\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008c\u0001R\u0019\u0010\u0091\u0001\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u008c\u0001R\u0019\u0010\u0093\u0001\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u008c\u0001R\u001a\u0010\u0097\u0001\u001a\u00030\u0094\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0018\u0010\u0099\u0001\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0098\u0001\u0010fR\u001f\u0010\u009d\u0001\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0006\b\u009a\u0001\u0010\u009b\u0001\u001a\u0005\b\u009c\u0001\u0010NR\u001a\u0010¡\u0001\u001a\u00030\u009e\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R\u0018\u0010£\u0001\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¢\u0001\u0010fR\u0018\u0010¥\u0001\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¤\u0001\u0010fR%\u0010¨\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d0/8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¦\u0001\u0010§\u0001R%\u0010ª\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d0/8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b©\u0001\u0010§\u0001R\u0019\u00102\u001a\u00030«\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¬\u0001\u0010\u00ad\u0001R\u001a\u0010¯\u0001\u001a\u00030«\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b®\u0001\u0010\u00ad\u0001R\u0019\u0010±\u0001\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b°\u0001\u0010\u008c\u0001R\u0019\u0010³\u0001\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b²\u0001\u0010\u008c\u0001R\u0017\u0010¶\u0001\u001a\u00020a8BX\u0082\u0004¢\u0006\b\u001a\u0006\b´\u0001\u0010µ\u0001R\u001a\u0010º\u0001\u001a\u0005\u0018\u00010·\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b¸\u0001\u0010¹\u0001R\u0018\u0010¾\u0001\u001a\u00030»\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b¼\u0001\u0010½\u0001R\u0018\u0010À\u0001\u001a\u00030»\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b¿\u0001\u0010½\u0001¨\u0006Ã\u0001"}, d2 = {"Lf0P/Wqz;", "Lyc/H;", "Lyc/Buf;", "Lyc/QhI;", "Lyc/tpM;", "Lyc/g;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "", "Aum", "Lp6", "Vvq", "EF", "ENe", "mx", "vl", "EN", "", "LoA/j;", "Lcom/alightcreative/app/motion/scene/SceneElement;", "Lcom/alightcreative/app/motion/scene/Keyable;", "", "lNy", "()Ljava/util/List;", "I4p", "Co", "hu", "y", "", "x", "", "I9f", "(FF)I", "overrideContour", "", "mainHandlesOnly", "Lf0P/Wqz$n;", "D76", "(FFIZ)Lf0P/Wqz$n;", "el", "Lcom/alightcreative/app/motion/scene/SceneSelection;", "sel", "kR", "(Lcom/alightcreative/app/motion/scene/SceneElement;Lcom/alightcreative/app/motion/scene/SceneSelection;)V", "Ljava/util/SortedSet;", "snaps", "Ljava/util/TreeMap;", "SR", "(Ljava/util/SortedSet;)Ljava/util/TreeMap;", "accum", "H6M", "(Ljava/util/TreeMap;F)F", "JI", "dx", "dy", "qva", "(FF)V", "Landroid/view/MotionEvent;", com.safedk.android.analytics.events.a.f62811a, "bZm", "(Landroid/view/MotionEvent;)V", "XNZ", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", TtmlNode.RUBY_CONTAINER, "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onDestroyView", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "t", "()I", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "Bha", "w", "WH", "A", "q9", "onDestroy", "Lyc/a;", "motionEvent", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(Lyc/a;)Z", "nr", "rl", "O", "gh", "LSJ0/N;", "o", "LSJ0/N;", "_binding", "LkgE/fuX;", "Z", "LkgE/fuX;", "Fp", "()LkgE/fuX;", "setIapManager", "(LkgE/fuX;)V", "iapManager", "LQmE/iF;", "S", "LQmE/iF;", "rxp", "()LQmE/iF;", "setEventLogger", "(LQmE/iF;)V", "eventLogger", "LxAo/I28;", "g", "LxAo/I28;", "LPV", "()LxAo/I28;", "setCrisperManager", "(LxAo/I28;)V", "crisperManager", "LLdY/Ml$j;", "E2", "LLdY/Ml$j;", "undoBatch", "Lcom/alightcreative/app/motion/scene/KeyableCompoundCubicBSpline;", "e", "Lcom/alightcreative/app/motion/scene/KeyableCompoundCubicBSpline;", "pendingAddPointSpline", "X", "editKeyframeMode", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "lockHandleAngle", "N", "lockHandleDistance", "v", "F", "dragStartRawX", "Xw", "dragStartRawY", "jB", "dragStartX", "U", "dragStartY", "Lf0P/Wqz$w6;", "P5", "Lf0P/Wqz$w6;", "touchMode", "M7", "recognizedDrag", "p5", "Lkotlin/Lazy;", "Ro", "touchSlop", "LWzY/z;", "eF", "LWzY/z;", "lasso", "E", "activeKeyframeAtCurrentTime", "M", "mixedActiveKeyframeAtCurrentTime", "FX", "Ljava/util/TreeMap;", "snapX", "B", "snapY", "Lcom/alightcreative/app/motion/scene/Vector2D;", "J", "Lcom/alightcreative/app/motion/scene/Vector2D;", "D", "prevSnapAccum", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "accumDx", "I", "accumDy", "j", "()LSJ0/N;", "binding", "Lf0P/fi;", "QgZ", "()Lf0P/fi;", "actionBarFragment", "Landroid/widget/ImageButton;", "waP", "()Landroid/widget/ImageButton;", "buttonDistanceLock", "H", "buttonAngleLock", "GR", "w6", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nEditPointsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditPointsFragment.kt\ncom/alightcreative/app/motion/activities/edit/fragments/EditPointsFragment\n+ 2 FragmentTrackingActivity.kt\ncom/alightcreative/app/motion/activities/interfaces/FragmentTrackingActivityKt\n+ 3 Lens.kt\ncom/alightcreative/lens/LensKt\n+ 4 CubicBSpline.kt\ncom/alightcreative/app/motion/scene/CubicBSplineKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1971:1\n12#2:1972\n148#3:1973\n143#3:1974\n124#3,9:1975\n148#3:1984\n143#3:1985\n124#3,9:1986\n148#3:1995\n143#3:1996\n124#3,9:1997\n148#3:2008\n143#3:2009\n124#3,9:2010\n132#3:2022\n124#3:2023\n148#3:2025\n143#3:2026\n124#3,9:2027\n124#3:2036\n124#3:2037\n124#3:2038\n148#3:2053\n143#3:2054\n124#3,9:2055\n148#3:2064\n143#3:2065\n124#3,9:2066\n148#3:2168\n143#3:2169\n124#3,9:2170\n148#3:2179\n143#3:2180\n124#3,9:2181\n148#3:2190\n143#3:2191\n124#3,9:2192\n132#3:2204\n124#3:2205\n132#3:2207\n124#3:2208\n124#3:2209\n124#3:2210\n148#3:2211\n143#3:2212\n124#3,9:2213\n132#3:2222\n124#3:2223\n124#3:2224\n124#3:2225\n124#3:2226\n124#3:2227\n148#3:2228\n143#3:2229\n124#3,9:2230\n148#3:2239\n143#3:2240\n124#3,9:2241\n148#3:2250\n143#3:2251\n124#3,9:2252\n148#3:2276\n143#3:2277\n124#3,9:2278\n148#3:2287\n143#3:2288\n124#3,9:2289\n148#3:2311\n143#3:2312\n124#3,9:2313\n148#3:2322\n143#3:2323\n124#3,9:2324\n148#3:2345\n143#3:2346\n124#3,9:2347\n148#3:2356\n143#3:2357\n124#3,9:2358\n148#3:2374\n143#3:2375\n124#3,9:2376\n148#3:2385\n143#3:2386\n124#3,9:2387\n148#3:2396\n143#3:2397\n124#3,9:2398\n148#3:2407\n143#3:2408\n124#3,9:2409\n148#3:2418\n143#3:2419\n124#3,9:2420\n148#3:2429\n143#3:2430\n124#3,9:2431\n148#3:2445\n143#3:2446\n124#3,9:2447\n132#3:2456\n124#3:2457\n81#4:2006\n81#4:2007\n81#4:2085\n81#4:2086\n81#4:2261\n81#4:2262\n81#4:2263\n81#4:2264\n81#4:2265\n81#4:2266\n81#4:2267\n81#4:2367\n81#4:2368\n1557#5:2019\n1628#5,2:2020\n1630#5:2024\n1734#5,3:2039\n1557#5:2042\n1628#5,2:2043\n1557#5:2045\n1628#5,3:2046\n1630#5:2049\n1734#5,3:2050\n1872#5,3:2075\n1872#5,2:2078\n1874#5:2081\n1872#5,3:2082\n1872#5,3:2087\n1557#5:2090\n1628#5,2:2091\n1557#5:2093\n1628#5,3:2094\n1630#5:2097\n1734#5,3:2098\n785#5:2101\n796#5:2102\n1872#5,2:2103\n797#5,2:2105\n1874#5:2107\n799#5:2108\n1557#5:2109\n1628#5,3:2110\n1782#5,3:2113\n1755#5,3:2116\n1785#5:2119\n1755#5,3:2120\n1782#5,4:2123\n1567#5:2127\n1598#5,4:2128\n774#5:2132\n865#5,2:2133\n1863#5:2135\n1368#5:2136\n1454#5,5:2137\n1863#5,2:2142\n1864#5:2144\n785#5:2145\n796#5:2146\n1872#5,2:2147\n797#5,2:2149\n1874#5:2151\n799#5:2152\n1557#5:2153\n1628#5,3:2154\n1557#5:2157\n1628#5,3:2158\n1557#5:2161\n1628#5,3:2162\n1755#5,3:2165\n1557#5:2201\n1628#5,2:2202\n1630#5:2206\n1872#5,3:2268\n1567#5:2271\n1598#5,4:2272\n1567#5:2298\n1598#5,3:2299\n295#5,2:2302\n1601#5:2304\n295#5,2:2305\n295#5,2:2307\n295#5,2:2309\n1567#5:2333\n1598#5,3:2334\n2632#5,3:2337\n1601#5:2340\n1557#5:2341\n1628#5,3:2342\n1567#5:2369\n1598#5,4:2370\n1567#5:2440\n1598#5,4:2441\n1#6:2080\n*S KotlinDebug\n*F\n+ 1 EditPointsFragment.kt\ncom/alightcreative/app/motion/activities/edit/fragments/EditPointsFragment\n*L\n139#1:1972\n179#1:1973\n179#1:1974\n179#1:1975,9\n191#1:1984\n191#1:1985\n191#1:1986,9\n207#1:1995\n207#1:1996\n207#1:1997,9\n965#1:2008\n965#1:2009\n965#1:2010,9\n967#1:2022\n967#1:2023\n970#1:2025\n970#1:2026\n970#1:2027,9\n975#1:2036\n979#1:2037\n982#1:2038\n1083#1:2053\n1083#1:2054\n1083#1:2055,9\n1084#1:2064\n1084#1:2065\n1084#1:2066,9\n1847#1:2168\n1847#1:2169\n1847#1:2170,9\n1865#1:2179\n1865#1:2180\n1865#1:2181,9\n1919#1:2190\n1919#1:2191\n1919#1:2192,9\n1922#1:2204\n1922#1:2205\n1933#1:2207\n1935#1:2208\n1936#1:2209\n1937#1:2210\n1947#1:2211\n1947#1:2212\n1947#1:2213,9\n1949#1:2222\n1949#1:2223\n198#1:2224\n202#1:2225\n210#1:2226\n211#1:2227\n296#1:2228\n296#1:2229\n296#1:2230,9\n299#1:2239\n299#1:2240\n299#1:2241,9\n302#1:2250\n302#1:2251\n302#1:2252,9\n772#1:2276\n772#1:2277\n772#1:2278,9\n787#1:2287\n787#1:2288\n787#1:2289,9\n827#1:2311\n827#1:2312\n827#1:2313,9\n852#1:2322\n852#1:2323\n852#1:2324,9\n920#1:2345\n920#1:2346\n920#1:2347,9\n936#1:2356\n936#1:2357\n936#1:2358,9\n1321#1:2374\n1321#1:2375\n1321#1:2376,9\n1331#1:2385\n1331#1:2386\n1331#1:2387,9\n1339#1:2396\n1339#1:2397\n1339#1:2398,9\n1349#1:2407\n1349#1:2408\n1349#1:2409,9\n1356#1:2418\n1356#1:2419\n1356#1:2420,9\n1366#1:2429\n1366#1:2430\n1366#1:2431,9\n1821#1:2445\n1821#1:2446\n1821#1:2447,9\n1838#1:2456\n1838#1:2457\n233#1:2006\n235#1:2007\n1399#1:2085\n1401#1:2086\n357#1:2261\n359#1:2262\n534#1:2263\n556#1:2264\n566#1:2265\n583#1:2266\n589#1:2267\n1111#1:2367\n1134#1:2368\n966#1:2019\n966#1:2020,2\n966#1:2024\n1000#1:2039,3\n1007#1:2042\n1007#1:2043,2\n1008#1:2045\n1008#1:2046,3\n1007#1:2049\n1010#1:2050,3\n1176#1:2075,3\n1188#1:2078,2\n1188#1:2081\n1208#1:2082,3\n1427#1:2087,3\n1488#1:2090\n1488#1:2091,2\n1489#1:2093\n1489#1:2094,3\n1488#1:2097\n1491#1:2098,3\n1561#1:2101\n1561#1:2102\n1561#1:2103,2\n1561#1:2105,2\n1561#1:2107\n1561#1:2108\n1561#1:2109\n1561#1:2110,3\n1562#1:2113,3\n1563#1:2116,3\n1562#1:2119\n1586#1:2120,3\n1676#1:2123,4\n1678#1:2127\n1678#1:2128,4\n1702#1:2132\n1702#1:2133,2\n1725#1:2135\n1728#1:2136\n1728#1:2137,5\n1728#1:2142,2\n1725#1:2144\n1741#1:2145\n1741#1:2146\n1741#1:2147,2\n1741#1:2149,2\n1741#1:2151\n1741#1:2152\n1742#1:2153\n1742#1:2154,3\n1743#1:2157\n1743#1:2158,3\n1744#1:2161\n1744#1:2162,3\n1813#1:2165,3\n1921#1:2201\n1921#1:2202,2\n1921#1:2206\n470#1:2268,3\n774#1:2271\n774#1:2272,4\n829#1:2298\n829#1:2299,3\n832#1:2302,2\n829#1:2304\n857#1:2305,2\n873#1:2307,2\n890#1:2309,2\n922#1:2333\n922#1:2334,3\n925#1:2337,3\n922#1:2340\n934#1:2341\n934#1:2342,3\n1322#1:2369\n1322#1:2370,4\n1824#1:2440\n1824#1:2441,4\n*E\n"})
public final class Wqz extends t5 implements yc.H, yc.Buf, yc.QhI, yc.tpM, InterfaceC2452g {
    public static final int Nxk = 8;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private static final n f64954Y = new n(-1, -1.0f, ControlHandle.MAIN);

    /* JADX INFO: renamed from: E, reason: collision with root package name and from kotlin metadata */
    private boolean activeKeyframeAtCurrentTime;

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    private Ml.j undoBatch;

    /* JADX INFO: renamed from: I, reason: collision with root package name and from kotlin metadata */
    private float accumDy;

    /* JADX INFO: renamed from: M, reason: collision with root package name and from kotlin metadata */
    private boolean mixedActiveKeyframeAtCurrentTime;

    /* JADX INFO: renamed from: M7, reason: from kotlin metadata */
    private boolean recognizedDrag;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    public QmE.iF eventLogger;

    /* JADX INFO: renamed from: T, reason: collision with root package name and from kotlin metadata */
    private boolean lockHandleAngle;

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
    private float dragStartY;

    /* JADX INFO: renamed from: X, reason: collision with root package name and from kotlin metadata */
    private boolean editKeyframeMode;

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    private float dragStartRawY;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    public kgE.fuX iapManager;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private float accumDx;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private KeyableCompoundCubicBSpline pendingAddPointSpline;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public xAo.I28 crisperManager;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private float dragStartX;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private SJ0.N _binding;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private float dragStartRawX;

    /* JADX INFO: renamed from: N, reason: collision with root package name and from kotlin metadata */
    private boolean lockHandleDistance = true;

    /* JADX INFO: renamed from: P5, reason: from kotlin metadata */
    private w6 touchMode = w6.f65064O;

    /* JADX INFO: renamed from: p5, reason: from kotlin metadata */
    private final Lazy touchSlop = LazyKt.lazy(new Function0() { // from class: f0P.I5
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(Wqz.YE(this.f64345n));
        }
    });

    /* JADX INFO: renamed from: eF, reason: from kotlin metadata */
    private C1487z lasso = new C1487z();

    /* JADX INFO: renamed from: FX, reason: collision with root package name and from kotlin metadata */
    private TreeMap snapX = new TreeMap();

    /* JADX INFO: renamed from: B, reason: collision with root package name and from kotlin metadata */
    private TreeMap snapY = new TreeMap();

    /* JADX INFO: renamed from: J, reason: collision with root package name and from kotlin metadata */
    private Vector2D accum = GeometryKt.Vector2D();

    /* JADX INFO: renamed from: D, reason: collision with root package name and from kotlin metadata */
    private Vector2D prevSnapAccum = GeometryKt.Vector2D();

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    private static final class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f65044n;
        private final float rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final ControlHandle f65045t;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return this.f65044n == nVar.f65044n && Float.compare(this.rl, nVar.rl) == 0 && this.f65045t == nVar.f65045t;
        }

        public n(int i2, float f3, ControlHandle bestHandle) {
            Intrinsics.checkNotNullParameter(bestHandle, "bestHandle");
            this.f65044n = i2;
            this.rl = f3;
            this.f65045t = bestHandle;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.f65044n) * 31) + Float.hashCode(this.rl)) * 31) + this.f65045t.hashCode();
        }

        public final int n() {
            return this.f65044n;
        }

        public final float rl() {
            return this.rl;
        }

        public final ControlHandle t() {
            return this.f65045t;
        }

        public String toString() {
            return "FindHandleResult(bestIdx=" + this.f65044n + ", bestDist=" + this.rl + ", bestHandle=" + this.f65045t + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    private static final class w6 {
        private static final /* synthetic */ w6[] J2;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f65066r;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final w6 f65065n = new w6("DragPoint", 0);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final w6 f65067t = new w6("Lasso", 1);

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final w6 f65064O = new w6("None", 2);

        static {
            w6[] w6VarArrN = n();
            J2 = w6VarArrN;
            f65066r = EnumEntriesKt.enumEntries(w6VarArrN);
        }

        private static final /* synthetic */ w6[] n() {
            return new w6[]{f65065n, f65067t, f65064O};
        }

        public static w6 valueOf(String str) {
            return (w6) Enum.valueOf(w6.class, str);
        }

        public static w6[] values() {
            return (w6[]) J2.clone();
        }

        private w6(String str, int i2) {
        }
    }

    private final void Co() {
    }

    private final TreeMap SR(SortedSet snaps) {
        int i2;
        int i3 = 0;
        if (snaps == null || !snaps.isEmpty()) {
            Iterator it = snaps.iterator();
            i2 = 0;
            while (it.hasNext()) {
                if (((Float) it.next()).floatValue() < 0.0f && (i2 = i2 + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        } else {
            i2 = 0;
        }
        float f3 = i2 + (snaps.contains(Float.valueOf(0.0f)) ? 0.5f : 0.0f);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(snaps, 10));
        for (Object obj : snaps) {
            int i5 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Float f4 = (Float) obj;
            arrayList.add(CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(Float.valueOf(f4.floatValue() + ((i3 - f3) * 25.0f)), f4), TuplesKt.to(Float.valueOf(f4.floatValue() + ((i5 - f3) * 25.0f)), f4)}));
            i3 = i5;
        }
        return new TreeMap(MapsKt.toMap(CollectionsKt.flatten(arrayList)));
    }

    public final void A() {
        this.editKeyframeMode = false;
        Bha();
        ENe();
    }

    public final void q9() {
        this.editKeyframeMode = true;
        Bha();
        ENe();
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    public /* synthetic */ class Ml {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ControlHandle.values().length];
            try {
                iArr[ControlHandle.MAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ControlHandle.IN.ordinal()] = 2;
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement C7B(int i2, int i3, final float f3, final Vector2D vector2D, final Scene scene, final SceneElement el) {
        Intrinsics.checkNotNullParameter(scene, "scene");
        Intrinsics.checkNotNullParameter(el, "el");
        xuv xuvVar = new PropertyReference1Impl() { // from class: f0P.Wqz.xuv
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((SceneElement) obj).getOutline();
            }
        };
        c7r c7rVar = new PropertyReference1Impl() { // from class: f0P.Wqz.c7r
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((KeyableCompoundCubicBSpline) obj).getContours();
            }
        };
        oA.aC aCVar = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), c7rVar.getReturnType(), new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), xuvVar.getReturnType(), xuvVar), c7rVar);
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SceneElement.class);
        KType type = aCVar.nr().getArguments().get(0).getType();
        Intrinsics.checkNotNull(type);
        oA.w6 w6Var = new oA.w6(orCreateKotlinClass, type, aCVar, i2);
        C2011t c2011t = new PropertyReference1Impl() { // from class: f0P.Wqz.t
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((KeyableCubicBSpline) obj).getKnots();
            }
        };
        oA.aC aCVar2 = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), c2011t.getReturnType(), w6Var, c2011t);
        KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(SceneElement.class);
        KType type2 = aCVar2.nr().getArguments().get(0).getType();
        Intrinsics.checkNotNull(type2);
        oA.w6 w6Var2 = new oA.w6(orCreateKotlinClass2, type2, aCVar2, i3);
        cA cAVar = new PropertyReference1Impl() { // from class: f0P.Wqz.cA
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((KeyableCBKnot) obj).getCurveIn();
            }
        };
        return (SceneElement) new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), cAVar.getReturnType(), w6Var2, cAVar).t(el, new Function1() { // from class: f0P.RP
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Wqz.wYi(scene, el, f3, vector2D, (OptionalKeyableVector2D) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Vector2D GH3(Vector2D vector2D, float f3, Vector2D it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return GeometryKt.times(GeometryKt.normalize(vector2D), -f3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KeyableCBKnot GRh(KeyableCBKnot keyableCBKnot, float f3, Vector2D vector2D, Vector2D vector2D2, KeyableCBKnot it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return KeyableCBKnot.copy$default(it, null, KeyableKt.keyable((OptionalVector2D) GeometryKt.minus(GeometryKt.minus((Vector2D) KeyableKt.valueAtTime(keyableCBKnot.getP(), f3), vector2D), vector2D2)), KeyableKt.keyable((OptionalVector2D) GeometryKt.minus(GeometryKt.plus((Vector2D) KeyableKt.valueAtTime(keyableCBKnot.getP(), f3), vector2D), vector2D2)), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GT(final SceneElement sceneElement, final int i2, final SceneHolder sceneHolder, final Wqz wqz, final KeyableCubicBSpline keyableCubicBSpline, com.alightcreative.widget.eO group) {
        Intrinsics.checkNotNullParameter(group, "$this$group");
        if (sceneElement.getOutline().getContours().get(i2).getClosed()) {
            group.nr(new Function1() { // from class: f0P.qW
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Wqz.Vd(sceneHolder, sceneElement, i2, wqz, (com.alightcreative.widget.QJ) obj);
                }
            });
        } else {
            group.nr(new Function1() { // from class: f0P.JF
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Wqz.WKb(sceneElement, i2, sceneHolder, (com.alightcreative.widget.QJ) obj);
                }
            });
        }
        group.nr(new Function1() { // from class: f0P.r6h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Wqz.jE(keyableCubicBSpline, i2, sceneHolder, sceneElement, (com.alightcreative.widget.QJ) obj);
            }
        });
        group.nr(new Function1() { // from class: f0P.aXh
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Wqz.i7(keyableCubicBSpline, i2, wqz, (com.alightcreative.widget.QJ) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Vector2D HE(Vector2D vector2D, Vector2D vector) {
        Intrinsics.checkNotNullParameter(vector, "vector");
        return GeometryKt.plus(vector, vector2D);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement HFS(int i2, int i3, final float f3, final Vector2D vector2D, final Scene scene, final SceneElement el) {
        Intrinsics.checkNotNullParameter(scene, "scene");
        Intrinsics.checkNotNullParameter(el, "el");
        qYU qyu = new PropertyReference1Impl() { // from class: f0P.Wqz.qYU
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((SceneElement) obj).getOutline();
            }
        };
        RGN rgn = new PropertyReference1Impl() { // from class: f0P.Wqz.RGN
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((KeyableCompoundCubicBSpline) obj).getContours();
            }
        };
        oA.aC aCVar = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), rgn.getReturnType(), new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), qyu.getReturnType(), qyu), rgn);
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SceneElement.class);
        KType type = aCVar.nr().getArguments().get(0).getType();
        Intrinsics.checkNotNull(type);
        oA.w6 w6Var = new oA.w6(orCreateKotlinClass, type, aCVar, i2);
        B b2 = new PropertyReference1Impl() { // from class: f0P.Wqz.B
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((KeyableCubicBSpline) obj).getKnots();
            }
        };
        oA.aC aCVar2 = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), b2.getReturnType(), w6Var, b2);
        KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(SceneElement.class);
        KType type2 = aCVar2.nr().getArguments().get(0).getType();
        Intrinsics.checkNotNull(type2);
        return (SceneElement) new oA.w6(orCreateKotlinClass2, type2, aCVar2, i3).t(el, new Function1() { // from class: f0P.Pta
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Wqz.eb(scene, el, f3, vector2D, (KeyableCBKnot) obj);
            }
        });
    }

    private final int I9f(float x2, float y2) {
        SceneHolder sceneHolderE;
        float fNY = HW.C.nY(this) * 25.0f;
        SceneElement sceneElementNHg = HW.C.nHg(this);
        int i2 = -1;
        if (sceneElementNHg == null || (sceneHolderE = HW.C.e(this)) == null) {
            return -1;
        }
        Scene scene = sceneHolderE.getScene();
        int i3 = 0;
        Region region = new Region(0, 0, scene.getWidth(), scene.getHeight());
        Integer selectedContour = sceneHolderE.getSelection().getSelectedContour();
        int iIntValue = selectedContour != null ? selectedContour.intValue() : 0;
        float fFractionalTime = SceneElementKt.fractionalTime(sceneElementNHg, HW.C.WPU(this));
        Transform transformValueAtTime = sceneElementNHg.getTransform().valueAtTime(fFractionalTime);
        Region region2 = new Region();
        float f3 = -1.0f;
        int i5 = -1;
        int i7 = 0;
        for (Object obj : sceneElementNHg.getOutline().getContours()) {
            int i8 = i7 + 1;
            if (i7 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            int i9 = i2;
            float fRl = D76(x2, y2, i7, true).rl();
            if (i5 < 0 || fRl < f3) {
                i5 = i7;
                f3 = fRl;
            }
            i7 = i8;
            i2 = i9;
        }
        int i10 = i2;
        if (f3 < fNY && i5 >= 0) {
            return i5;
        }
        for (Object obj2 : sceneElementNHg.getOutline().getContours()) {
            int i11 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Path pathT = CubicBSplineKt.toPath(CubicBSplineKt.valueAtTime((KeyableCubicBSpline) obj2, fFractionalTime)).t();
            TransformKt.transform(pathT, transformValueAtTime);
            region2.setPath(pathT, region);
            if (region2.contains((int) x2, (int) y2) && i3 != iIntValue) {
                return i3;
            }
            i3 = i11;
        }
        return i10;
    }

    private final void JI() {
        SceneHolder sceneHolderE;
        KeyableVector2D keyableVector2D;
        Vector2D pendingAddPoint;
        List listEmptyList;
        SceneElement sceneElement;
        SceneElement sceneElementNHg = HW.C.nHg(this);
        if (sceneElementNHg == null || (sceneHolderE = HW.C.e(this)) == null) {
            return;
        }
        float fAYN = HW.C.aYN(this);
        ControlHandle selectedHandle = sceneHolderE.getSelection().getSelectedHandle();
        if (selectedHandle == null) {
            return;
        }
        Integer selectedContour = sceneHolderE.getSelection().getSelectedContour();
        int iIntValue = selectedContour != null ? selectedContour.intValue() : 0;
        Set<Integer> multiSelectPoints = sceneHolderE.getSelection().getMultiSelectPoints();
        if (multiSelectPoints.isEmpty()) {
            Integer selectedPoint = sceneHolderE.getSelection().getSelectedPoint();
            if (selectedPoint == null) {
                return;
            }
            Set of = SetsKt.setOf(selectedPoint);
            ArrayList arrayList = new ArrayList();
            for (Object obj : of) {
                int iIntValue2 = ((Number) obj).intValue();
                if (iIntValue2 >= 0 && iIntValue2 < sceneElementNHg.getOutline().getContours().get(iIntValue).getKnots().size()) {
                    arrayList.add(obj);
                }
            }
            multiSelectPoints = arrayList;
        }
        if (sceneHolderE.getSelection().getPendingAddPoint() == null && (multiSelectPoints.isEmpty() || sceneElementNHg.getOutline().getContours().get(iIntValue).getKnots().isEmpty())) {
            return;
        }
        Vector2D vector2DPlus = null;
        if (selectedHandle == ControlHandle.CURVE_OUT) {
            pendingAddPoint = sceneHolderE.getSelection().getPendingAddPoint();
            Intrinsics.checkNotNull(pendingAddPoint);
        } else {
            Iterator it = multiSelectPoints.iterator();
            while (true) {
                if (!it.hasNext()) {
                    keyableVector2D = null;
                    break;
                }
                Object obj2 = CubicBSplineKt.get(sceneElementNHg.getOutline().getContours().get(iIntValue).getKnots().get(((Number) it.next()).intValue()), selectedHandle);
                keyableVector2D = obj2 instanceof KeyableVector2D ? (KeyableVector2D) obj2 : null;
                if (keyableVector2D != null) {
                    break;
                }
            }
            if (keyableVector2D == null || (pendingAddPoint = (Vector2D) KeyableKt.valueAtTime(keyableVector2D, fAYN)) == null) {
                return;
            }
        }
        Transform transformValueAtTime = sceneElementNHg.getTransform().valueAtTime(fAYN);
        final Vector2D vector2DTimes = GeometryKt.times(GeometryKt.rot(pendingAddPoint, -transformValueAtTime.getRotation()), GeometryKt.recip(transformValueAtTime.getScale()));
        Vector2D vector2DTimes2 = GeometryKt.times(pendingAddPoint, transformValueAtTime.getMatrix());
        Set<Integer> multiSelectPoints2 = sceneHolderE.getSelection().getMultiSelectPoints();
        float f3 = -1.0f;
        for (SceneElement sceneElement2 : sceneHolderE.getScene().getElements()) {
            if (sceneElement2.getId() != sceneElementNHg.getId()) {
                Matrix matrix = sceneElement2.getTransform().valueAtTime(SceneElementKt.fractionalTime(sceneElement2, HW.C.WPU(this))).getMatrix();
                List<KeyableCubicBSpline> contours = sceneElement2.getOutline().getContours();
                ArrayList arrayList2 = new ArrayList();
                Iterator<T> it2 = contours.iterator();
                while (it2.hasNext()) {
                    CollectionsKt.addAll(arrayList2, ((KeyableCubicBSpline) it2.next()).getKnots());
                    sceneElementNHg = sceneElementNHg;
                }
                sceneElement = sceneElementNHg;
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    Vector2D vector2DMinus = GeometryKt.minus(GeometryKt.times((Vector2D) KeyableKt.valueAtTime(((KeyableCBKnot) it3.next()).getP(), fAYN), matrix), vector2DTimes2);
                    float length = GeometryKt.getLength(vector2DMinus);
                    if (f3 < 0.0f || length < f3) {
                        vector2DPlus = GeometryKt.plus(vector2DMinus, vector2DTimes);
                        f3 = length;
                    }
                }
            } else {
                sceneElement = sceneElementNHg;
            }
            sceneElementNHg = sceneElement;
        }
        List<KeyableCBKnot> knots = sceneElementNHg.getOutline().getContours().get(iIntValue).getKnots();
        ArrayList arrayList3 = new ArrayList();
        int i2 = 0;
        for (Object obj3 : knots) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            if ((!multiSelectPoints.contains(Integer.valueOf(i2)) && !multiSelectPoints2.contains(Integer.valueOf(i2))) || selectedHandle == ControlHandle.CURVE_OUT) {
                arrayList3.add(obj3);
            }
            i2 = i3;
        }
        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            arrayList4.add(GeometryKt.times(GeometryKt.rot((Vector2D) KeyableKt.valueAtTime(((KeyableCBKnot) it4.next()).getP(), fAYN), -transformValueAtTime.getRotation()), GeometryKt.recip(transformValueAtTime.getScale())));
        }
        if (vector2DPlus == null || (listEmptyList = CollectionsKt.listOf(vector2DPlus)) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        final List listPlus = CollectionsKt.plus((Collection) arrayList4, (Iterable) listEmptyList);
        ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listPlus, 10));
        Iterator it5 = listPlus.iterator();
        while (it5.hasNext()) {
            arrayList5.add(Float.valueOf(((Vector2D) it5.next()).getX() - vector2DTimes.getX()));
        }
        final SortedSet sortedSet = CollectionsKt.toSortedSet(arrayList5);
        sortedSet.add(Float.valueOf(-100000.0f));
        sortedSet.add(Float.valueOf(100000.0f));
        ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listPlus, 10));
        Iterator it6 = listPlus.iterator();
        while (it6.hasNext()) {
            arrayList6.add(Float.valueOf(((Vector2D) it6.next()).getY() - vector2DTimes.getY()));
        }
        final SortedSet sortedSet2 = CollectionsKt.toSortedSet(arrayList6);
        sortedSet2.add(Float.valueOf(-100000.0f));
        sortedSet2.add(Float.valueOf(100000.0f));
        this.snapX = SR(sortedSet);
        this.snapY = SR(sortedSet2);
        XoT.C.Uo(this, new Function0() { // from class: f0P.JT
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Wqz.Of6(listPlus, vector2DTimes, sortedSet, sortedSet2, this);
            }
        });
        Vector2D.Companion companion = Vector2D.INSTANCE;
        this.accum = companion.getZERO();
        this.prevSnapAccum = companion.getZERO();
        this.accumDx = 0.0f;
        this.accumDy = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Vector2D L(Vector2D vector2D, Vector2D vector) {
        Intrinsics.checkNotNullParameter(vector, "vector");
        return GeometryKt.plus(vector, vector2D);
    }

    private final void Lp6() {
        SceneElement sceneElementNHg;
        SceneHolder sceneHolderE = HW.C.e(this);
        if (sceneHolderE == null || (sceneElementNHg = HW.C.nHg(this)) == null) {
            return;
        }
        Integer selectedContour = sceneHolderE.getSelection().getSelectedContour();
        final int iIntValue = selectedContour != null ? selectedContour.intValue() : 0;
        if (sceneElementNHg.getOutline().getContours().get(iIntValue).getKnots().size() <= 1 || sceneHolderE.getSelection().getMultiSelectPoints().size() >= sceneElementNHg.getOutline().getContours().get(iIntValue).getKnots().size()) {
            if (sceneElementNHg.getOutline().getContours().size() > 1) {
                HW.C.D(this, new Function2() { // from class: f0P.xMz
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return Wqz.g6(iIntValue, (Scene) obj, (SceneElement) obj2);
                    }
                });
                w();
                return;
            }
            return;
        }
        if (!sceneHolderE.getSelection().getMultiSelectPoints().isEmpty()) {
            s4 s4Var = new PropertyReference1Impl() { // from class: f0P.Wqz.s4
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public Object get(Object obj) {
                    return ((SceneElement) obj).getOutline();
                }
            };
            UGc uGc = new PropertyReference1Impl() { // from class: f0P.Wqz.UGc
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public Object get(Object obj) {
                    return ((KeyableCompoundCubicBSpline) obj).getContours();
                }
            };
            oA.aC aCVar = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), uGc.getReturnType(), new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), s4Var.getReturnType(), s4Var), uGc);
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SceneElement.class);
            KType type = aCVar.nr().getArguments().get(0).getType();
            Intrinsics.checkNotNull(type);
            final oA.w6 w6Var = new oA.w6(orCreateKotlinClass, type, aCVar, iIntValue);
            final SceneSelection selection = sceneHolderE.getSelection();
            sceneHolderE.setSelection(SceneSelection.copy$default(sceneHolderE.getSelection(), null, null, null, null, SetsKt.emptySet(), null, null, null, false, null, null, null, 4079, null));
            HW.C.D(this, new Function2() { // from class: f0P.ca
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Wqz.Mh(w6Var, selection, (Scene) obj, (SceneElement) obj2);
                }
            });
            return;
        }
        Integer selectedPoint = sceneHolderE.getSelection().getSelectedPoint();
        int iIntValue2 = selectedPoint != null ? selectedPoint.intValue() : 0;
        ControlHandle selectedHandle = sceneHolderE.getSelection().getSelectedHandle();
        if (selectedHandle == null) {
            selectedHandle = ControlHandle.IN;
        }
        ci ciVar = new PropertyReference1Impl() { // from class: f0P.Wqz.ci
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((SceneElement) obj).getOutline();
            }
        };
        g9s g9sVar = new PropertyReference1Impl() { // from class: f0P.Wqz.g9s
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((KeyableCompoundCubicBSpline) obj).getContours();
            }
        };
        oA.aC aCVar2 = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), g9sVar.getReturnType(), new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), ciVar.getReturnType(), ciVar), g9sVar);
        KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(SceneElement.class);
        KType type2 = aCVar2.nr().getArguments().get(0).getType();
        Intrinsics.checkNotNull(type2);
        oA.w6 w6Var2 = new oA.w6(orCreateKotlinClass2, type2, aCVar2, iIntValue);
        afx afxVar = new PropertyReference1Impl() { // from class: f0P.Wqz.afx
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((KeyableCubicBSpline) obj).getKnots();
            }
        };
        oA.aC aCVar3 = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), afxVar.getReturnType(), w6Var2, afxVar);
        KClass orCreateKotlinClass3 = Reflection.getOrCreateKotlinClass(SceneElement.class);
        KType type3 = aCVar3.nr().getArguments().get(0).getType();
        Intrinsics.checkNotNull(type3);
        final oA.w6 w6Var3 = new oA.w6(orCreateKotlinClass3, type3, aCVar3, iIntValue2);
        int i2 = Ml.$EnumSwitchMapping$0[selectedHandle.ordinal()];
        if (i2 == 1) {
            HW.C.D(this, new Function2() { // from class: f0P.Y2e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Wqz.Toy(w6Var3, (Scene) obj, (SceneElement) obj2);
                }
            });
            iIntValue2 = Math.max(0, iIntValue2 - 1);
        } else if (i2 == 2) {
            HW.C.D(this, new Function2() { // from class: f0P.pi
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Wqz.wKp(w6Var3, (Scene) obj, (SceneElement) obj2);
                }
            });
            selectedHandle = ControlHandle.MAIN;
        } else if (i2 == 3) {
            HW.C.D(this, new Function2() { // from class: f0P.w
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Wqz.Th(w6Var3, (Scene) obj, (SceneElement) obj2);
                }
            });
            selectedHandle = ControlHandle.MAIN;
        } else {
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            Q q2 = new PropertyReference1Impl() { // from class: f0P.Wqz.Q
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public Object get(Object obj) {
                    return ((SceneElement) obj).getOutline();
                }
            };
            r rVar = new PropertyReference1Impl() { // from class: f0P.Wqz.r
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public Object get(Object obj) {
                    return ((KeyableCompoundCubicBSpline) obj).getContours();
                }
            };
            oA.aC aCVar4 = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), rVar.getReturnType(), new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), q2.getReturnType(), q2), rVar);
            KClass orCreateKotlinClass4 = Reflection.getOrCreateKotlinClass(SceneElement.class);
            KType type4 = aCVar4.nr().getArguments().get(0).getType();
            Intrinsics.checkNotNull(type4);
            oA.w6 w6Var4 = new oA.w6(orCreateKotlinClass4, type4, aCVar4, iIntValue);
            SPz sPz = new PropertyReference1Impl() { // from class: f0P.Wqz.SPz
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public Object get(Object obj) {
                    return ((KeyableCubicBSpline) obj).getKnots();
                }
            };
            oA.aC aCVar5 = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), sPz.getReturnType(), w6Var4, sPz);
            int size = (iIntValue2 + 1) % sceneElementNHg.getOutline().getContours().get(iIntValue).getKnots().size();
            KClass orCreateKotlinClass5 = Reflection.getOrCreateKotlinClass(SceneElement.class);
            KType type5 = aCVar5.nr().getArguments().get(0).getType();
            Intrinsics.checkNotNull(type5);
            final oA.w6 w6Var5 = new oA.w6(orCreateKotlinClass5, type5, aCVar5, size);
            HW.C.D(this, new Function2() { // from class: f0P.jn
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Wqz.xzo(w6Var3, w6Var5, (Scene) obj, (SceneElement) obj2);
                }
            });
        }
        sceneHolderE.setSelection(SceneSelection.copy$default(sceneHolderE.getSelection(), null, null, null, Integer.valueOf(iIntValue2), null, null, selectedHandle, null, false, null, null, null, 4023, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Keyable Lu(Scene scene, SceneElement sceneElement, float f3, final Vector2D vector2D, Keyable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Keyable keyableCopyWithComputedValueForTime = KeyableKt.copyWithComputedValueForTime(it, scene, sceneElement, f3, new Function1() { // from class: f0P.xe
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Wqz.HE(vector2D, (Vector2D) obj);
            }
        });
        Intrinsics.checkNotNull(keyableCopyWithComputedValueForTime, "null cannot be cast to non-null type com.alightcreative.app.motion.scene.KeyableVector2D");
        return (KeyableVector2D) keyableCopyWithComputedValueForTime;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Vector2D MPw(Vector2D vector2D, Vector2D kf) {
        Intrinsics.checkNotNullParameter(kf, "kf");
        return GeometryKt.plus(kf, vector2D);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement Mh(oA.j jVar, final SceneSelection sceneSelection, Scene scene, SceneElement el) {
        Intrinsics.checkNotNullParameter(scene, "<unused var>");
        Intrinsics.checkNotNullParameter(el, "el");
        return (SceneElement) jVar.t(el, new Function1() { // from class: f0P.USE
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Wqz.jO(sceneSelection, (KeyableCubicBSpline) obj);
            }
        });
    }

    static /* synthetic */ n NP(Wqz wqz, float f3, float f4, int i2, boolean z2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = -1;
        }
        if ((i3 & 8) != 0) {
            z2 = false;
        }
        return wqz.D76(f3, f4, i2, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String Of6(List list, Vector2D vector2D, SortedSet sortedSet, SortedSet sortedSet2, Wqz wqz) {
        return "onStartTrackpadMotion: stopLocations=" + list + " absStartLocation=" + vector2D + " dxlist=" + sortedSet + " dylist=" + sortedSet2 + " snapX=" + wqz.snapX + " snapY=" + wqz.snapY;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement Om(oA.j jVar, float f3, Wqz wqz, final Vector2D vector2D, Scene scene, SceneElement el) {
        Intrinsics.checkNotNullParameter(scene, "scene");
        Intrinsics.checkNotNullParameter(el, "el");
        KeyableCBKnot keyableCBKnot = (KeyableCBKnot) jVar.get(el);
        KeyableCBKnot keyableCBKnotCopy$default = KeyableCBKnot.copy$default(keyableCBKnot, null, null, KeyableKt.copyWithComputedOptionalValueForTime(keyableCBKnot.getCurveOut(), scene, el, f3, new Function1() { // from class: f0P.uuz
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Wqz.t1J(vector2D, (Vector2D) obj);
            }
        }), 3, null);
        OptionalVector2D optionalVector2DOptionalValueAtTime = KeyableKt.optionalValueAtTime(keyableCBKnotCopy$default.getCurveIn(), f3);
        Vector2D vector2D2 = optionalVector2DOptionalValueAtTime instanceof Vector2D ? (Vector2D) optionalVector2DOptionalValueAtTime : null;
        OptionalVector2D optionalVector2DOptionalValueAtTime2 = KeyableKt.optionalValueAtTime(keyableCBKnotCopy$default.getCurveOut(), f3);
        final Vector2D vector2D3 = optionalVector2DOptionalValueAtTime2 instanceof Vector2D ? (Vector2D) optionalVector2DOptionalValueAtTime2 : null;
        if (vector2D2 != null && vector2D3 != null && wqz.lockHandleAngle) {
            final float length = wqz.lockHandleDistance ? GeometryKt.getLength(vector2D3) : GeometryKt.getLength(vector2D2);
            keyableCBKnotCopy$default = KeyableCBKnot.copy$default(keyableCBKnotCopy$default, null, KeyableKt.copyWithComputedOptionalValueForTime(keyableCBKnotCopy$default.getCurveIn(), scene, el, f3, new Function1() { // from class: f0P.G8Q
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Wqz.GH3(vector2D3, length, (Vector2D) obj);
                }
            }), null, 5, null);
        }
        return (SceneElement) jVar.rl(el, keyableCBKnotCopy$default);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KeyableCBKnot Rc(KeyableCBKnot it) {
        Intrinsics.checkNotNullParameter(it, "it");
        OptionalKeyableVector2D.NONE none = OptionalKeyableVector2D.NONE.INSTANCE;
        return KeyableCBKnot.copy$default(it, null, none, none, 1, null);
    }

    private final int Ro() {
        return ((Number) this.touchSlop.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Vector2D Sax(Vector2D vector2D, Vector2D kf) {
        Intrinsics.checkNotNullParameter(kf, "kf");
        return GeometryKt.plus(kf, vector2D);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Vector2D TVk(Vector2D vector2D, Vector2D kf) {
        Intrinsics.checkNotNullParameter(kf, "kf");
        return GeometryKt.plus(kf, vector2D);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement Th(oA.j jVar, Scene scene, SceneElement el) {
        Intrinsics.checkNotNullParameter(scene, "<unused var>");
        Intrinsics.checkNotNullParameter(el, "el");
        QJ qj = new PropertyReference1Impl() { // from class: f0P.Wqz.QJ
            {
                String str = aNrWBQYwFf.sxFgrzntCgEZiPZ;
            }

            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((KeyableCBKnot) obj).getCurveOut();
            }
        };
        return (SceneElement) new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), qj.getReturnType(), jVar, qj).rl(el, OptionalKeyableVector2D.NONE.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement Toy(oA.j jVar, Scene scene, SceneElement el) {
        Intrinsics.checkNotNullParameter(scene, "<unused var>");
        Intrinsics.checkNotNullParameter(el, "el");
        return (SceneElement) jVar.n(el);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean UR(Wqz wqz, Ref.FloatRef floatRef, Ref.FloatRef floatRef2, View view, MotionEvent motionEvent) {
        SceneHolder sceneHolderE;
        KeyableCompoundCubicBSpline keyableCompoundCubicBSplineCopy;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            wqz.pendingAddPointSpline = null;
            Ml.j jVar = wqz.undoBatch;
            if (jVar != null) {
                jVar.n();
            }
            wqz.undoBatch = HW.C.xMQ(wqz);
            SceneElement sceneElementNHg = HW.C.nHg(wqz);
            boolean z2 = false;
            if (sceneElementNHg == null || (sceneHolderE = HW.C.e(wqz)) == null) {
                return false;
            }
            Integer selectedContour = sceneHolderE.getSelection().getSelectedContour();
            int iIntValue = selectedContour != null ? selectedContour.intValue() : 0;
            Integer selectedPoint = sceneHolderE.getSelection().getSelectedPoint();
            if (selectedPoint == null) {
                return false;
            }
            int iIntValue2 = selectedPoint.intValue();
            int size = sceneElementNHg.getOutline().getContours().get(iIntValue).getKnots().size();
            if (((size < 1 ? 0 : (iIntValue2 + size) % size) == size - 1 || size < 1) && sceneHolderE.getSelection().getSelectedHandle() == ControlHandle.CURVE_OUT && !sceneElementNHg.getOutline().getContours().get(iIntValue).getClosed()) {
                z2 = true;
            }
            if (sceneHolderE.getSelection().getSelectedHandle() == ControlHandle.CURVE_OUT) {
                if (z2) {
                    Float curvePos = sceneHolderE.getSelection().getCurvePos();
                    if ((curvePos != null ? curvePos.floatValue() : 0.0f) < 0.5f) {
                        KeyableCompoundCubicBSpline outline = sceneElementNHg.getOutline();
                        List<KeyableCubicBSpline> contours = outline.getContours();
                        KeyableCubicBSpline keyableCubicBSpline = outline.getContours().get(iIntValue);
                        List<KeyableCBKnot> knots = sceneElementNHg.getOutline().getContours().get(iIntValue).getKnots();
                        Vector2D pendingAddPoint = sceneHolderE.getSelection().getPendingAddPoint();
                        Intrinsics.checkNotNull(pendingAddPoint);
                        keyableCompoundCubicBSplineCopy = outline.copy(HI0.rv6.t(contours, iIntValue, KeyableCubicBSpline.copy$default(keyableCubicBSpline, CollectionsKt.plus((Collection<? extends KeyableCBKnot>) knots, CubicBSplineKt.keyable(new CBKnot(pendingAddPoint, null, null, 6, null))), false, false, 6, null)));
                    } else {
                        KeyableCompoundCubicBSpline outline2 = sceneElementNHg.getOutline();
                        List<KeyableCubicBSpline> contours2 = outline2.getContours();
                        KeyableCubicBSpline keyableCubicBSpline2 = outline2.getContours().get(iIntValue);
                        Vector2D pendingAddPoint2 = sceneHolderE.getSelection().getPendingAddPoint();
                        Intrinsics.checkNotNull(pendingAddPoint2);
                        keyableCompoundCubicBSplineCopy = outline2.copy(HI0.rv6.t(contours2, iIntValue, KeyableCubicBSpline.copy$default(keyableCubicBSpline2, CollectionsKt.plus((Collection) CollectionsKt.listOf(CubicBSplineKt.keyable(new CBKnot(pendingAddPoint2, null, null, 6, null))), (Iterable) sceneElementNHg.getOutline().getContours().get(iIntValue).getKnots()), false, false, 6, null)));
                    }
                    wqz.pendingAddPointSpline = keyableCompoundCubicBSplineCopy;
                } else {
                    wqz.y();
                }
            }
            floatRef.element = motionEvent.getX();
            floatRef2.element = motionEvent.getY();
            wqz.JI();
        } else if (actionMasked == 1) {
            Intrinsics.checkNotNull(motionEvent);
            wqz.bZm(motionEvent);
            Ml.j jVar2 = wqz.undoBatch;
            if (jVar2 != null) {
                jVar2.n();
            }
        } else if (actionMasked == 2) {
            float x2 = motionEvent.getX() - floatRef.element;
            float y2 = motionEvent.getY() - floatRef2.element;
            floatRef.element = motionEvent.getX();
            floatRef2.element = motionEvent.getY();
            wqz.qva(x2, y2);
        } else if (actionMasked == 3) {
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Keyable V5F(Scene scene, SceneElement sceneElement, float f3, final Vector2D vector2D, Keyable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Keyable keyableCopyWithComputedValueForTime = KeyableKt.copyWithComputedValueForTime(it, scene, sceneElement, f3, new Function1() { // from class: f0P.s
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Wqz.sFO(vector2D, (Vector2D) obj);
            }
        });
        Intrinsics.checkNotNull(keyableCopyWithComputedValueForTime, "null cannot be cast to non-null type com.alightcreative.app.motion.scene.KeyableVector2D");
        return (KeyableVector2D) keyableCopyWithComputedValueForTime;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Vd(final SceneHolder sceneHolder, final SceneElement sceneElement, final int i2, final Wqz wqz, com.alightcreative.widget.QJ item) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        item.nr(2131231050);
        item.t(new Function0() { // from class: f0P.PXC
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Wqz.b(sceneHolder, sceneElement, i2, wqz);
            }
        });
        return Unit.INSTANCE;
    }

    private final void Vvq() {
        SceneHolder sceneHolderE;
        Integer selectedPoint;
        KeyableCompoundCubicBSpline keyableCompoundCubicBSplineCopy;
        List<KeyableCubicBSpline> contours;
        KeyableCubicBSpline keyableCubicBSpline;
        List<KeyableCBKnot> knots;
        SceneElement sceneElementNHg = HW.C.nHg(this);
        if (sceneElementNHg == null || (sceneHolderE = HW.C.e(this)) == null || (selectedPoint = sceneHolderE.getSelection().getSelectedPoint()) == null) {
            return;
        }
        int iIntValue = selectedPoint.intValue();
        Integer selectedContour = sceneHolderE.getSelection().getSelectedContour();
        boolean z2 = false;
        int iIntValue2 = selectedContour != null ? selectedContour.intValue() : 0;
        int size = sceneElementNHg.getOutline().getContours().get(iIntValue2).getKnots().size();
        if (((size < 1 ? 0 : (iIntValue + size) % size) == size - 1 || size < 1) && sceneHolderE.getSelection().getSelectedHandle() == ControlHandle.CURVE_OUT && !sceneElementNHg.getOutline().getContours().get(iIntValue2).getClosed()) {
            z2 = true;
        }
        if (sceneHolderE.getSelection().getSelectedHandle() == ControlHandle.CURVE_OUT) {
            if (!z2) {
                y();
                return;
            }
            Float curvePos = sceneHolderE.getSelection().getCurvePos();
            if ((curvePos != null ? curvePos.floatValue() : 0.0f) < 0.5f) {
                KeyableCompoundCubicBSpline outline = sceneElementNHg.getOutline();
                List<KeyableCubicBSpline> contours2 = outline.getContours();
                KeyableCubicBSpline keyableCubicBSpline2 = outline.getContours().get(iIntValue2);
                List<KeyableCBKnot> knots2 = keyableCubicBSpline2.getKnots();
                Vector2D pendingAddPoint = sceneHolderE.getSelection().getPendingAddPoint();
                Intrinsics.checkNotNull(pendingAddPoint);
                keyableCompoundCubicBSplineCopy = outline.copy(HI0.rv6.t(contours2, iIntValue2, KeyableCubicBSpline.copy$default(keyableCubicBSpline2, CollectionsKt.plus((Collection<? extends KeyableCBKnot>) knots2, CubicBSplineKt.keyable(new CBKnot(pendingAddPoint, null, null, 6, null))), false, false, 6, null)));
            } else {
                KeyableCompoundCubicBSpline outline2 = sceneElementNHg.getOutline();
                List<KeyableCubicBSpline> contours3 = outline2.getContours();
                KeyableCubicBSpline keyableCubicBSpline3 = outline2.getContours().get(iIntValue2);
                Vector2D pendingAddPoint2 = sceneHolderE.getSelection().getPendingAddPoint();
                Intrinsics.checkNotNull(pendingAddPoint2);
                keyableCompoundCubicBSplineCopy = outline2.copy(HI0.rv6.t(contours3, iIntValue2, KeyableCubicBSpline.copy$default(keyableCubicBSpline3, CollectionsKt.plus((Collection) CollectionsKt.listOf(CubicBSplineKt.keyable(new CBKnot(pendingAddPoint2, null, null, 6, null))), (Iterable) keyableCubicBSpline3.getKnots()), false, false, 6, null)));
            }
            this.pendingAddPointSpline = keyableCompoundCubicBSplineCopy;
            SceneSelection selection = sceneHolderE.getSelection();
            KeyableCompoundCubicBSpline keyableCompoundCubicBSpline = this.pendingAddPointSpline;
            sceneHolderE.setSelection(SceneSelection.copy$default(selection, null, null, null, (keyableCompoundCubicBSpline == null || (contours = keyableCompoundCubicBSpline.getContours()) == null || (keyableCubicBSpline = contours.get(iIntValue2)) == null || (knots = keyableCubicBSpline.getKnots()) == null) ? null : Integer.valueOf(CollectionsKt.getLastIndex(knots)), null, null, null, null, false, null, null, null, 4087, null));
            KeyableCompoundCubicBSpline keyableCompoundCubicBSpline2 = this.pendingAddPointSpline;
            Intrinsics.checkNotNull(keyableCompoundCubicBSpline2);
            sceneHolderE.update(SceneElement.copy$default(sceneElementNHg, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, keyableCompoundCubicBSpline2, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -8193, 127, null));
            this.pendingAddPointSpline = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit W5k(Wqz wqz, OutlineScrollerView.n selInfo) {
        Intrinsics.checkNotNullParameter(selInfo, "selInfo");
        if (wqz.getView() == null) {
            return Unit.INSTANCE;
        }
        SceneElement sceneElementNHg = HW.C.nHg(wqz);
        if (sceneElementNHg == null) {
            return Unit.INSTANCE;
        }
        SceneHolder sceneHolderE = HW.C.e(wqz);
        if (sceneHolderE == null) {
            return Unit.INSTANCE;
        }
        ControlHandle controlHandleT = selInfo.t();
        ControlHandle controlHandle = ControlHandle.CURVE_OUT;
        if (controlHandleT != controlHandle) {
            int iNr = selInfo.nr();
            Integer selectedPoint = sceneHolderE.getSelection().getSelectedPoint();
            if (selectedPoint != null && iNr == selectedPoint.intValue() && selInfo.t() == sceneHolderE.getSelection().getSelectedHandle()) {
                return Unit.INSTANCE;
            }
        }
        Integer selectedContour = sceneHolderE.getSelection().getSelectedContour();
        int iIntValue = selectedContour != null ? selectedContour.intValue() : 0;
        int size = sceneElementNHg.getOutline().getContours().get(iIntValue).getKnots().size();
        wqz.j().f9242r.setMultiselectMode(false);
        if (size < 1) {
            sceneHolderE.setSelection(SceneSelection.copy$default(sceneHolderE.getSelection(), null, null, null, 0, SetsKt.emptySet(), null, controlHandle, null, false, null, Float.valueOf(0.3f), Vector2D.INSTANCE.getZERO(), 903, null));
            return Unit.INSTANCE;
        }
        boolean z2 = (selInfo.nr() + size) % size == size - 1 && selInfo.t() == controlHandle && !sceneElementNHg.getOutline().getContours().get(iIntValue).getClosed();
        SceneSelection selection = sceneHolderE.getSelection();
        int iNr2 = selInfo.nr();
        ControlHandle controlHandleT2 = selInfo.t();
        float fO = selInfo.O();
        Set setEmptySet = SetsKt.emptySet();
        if (z2) {
            Float curvePos = sceneHolderE.getSelection().getCurvePos();
            pendingAddPoint = (((curvePos != null ? curvePos.floatValue() : 0.0f) > 0.5f ? 1 : ((curvePos != null ? curvePos.floatValue() : 0.0f) == 0.5f ? 0 : -1)) < 0) == (selInfo.O() < 0.5f) ? sceneHolderE.getSelection().getPendingAddPoint() : null;
            if (pendingAddPoint == null) {
                pendingAddPoint = selInfo.O() < 0.5f ? (Vector2D) KeyableKt.valueAtTime(((KeyableCBKnot) CollectionsKt.last((List) sceneElementNHg.getOutline().getContours().get(iIntValue).getKnots())).getP(), SceneElementKt.fractionalTime(sceneElementNHg, HW.C.WPU(wqz))) : (Vector2D) KeyableKt.valueAtTime(((KeyableCBKnot) CollectionsKt.first((List) sceneElementNHg.getOutline().getContours().get(iIntValue).getKnots())).getP(), SceneElementKt.fractionalTime(sceneElementNHg, HW.C.WPU(wqz)));
            }
        }
        sceneHolderE.setSelection(SceneSelection.copy$default(selection, null, null, null, Integer.valueOf(iNr2), setEmptySet, null, controlHandleT2, null, false, null, Float.valueOf(fO), pendingAddPoint, 903, null));
        wqz.hu();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WKb(final SceneElement sceneElement, final int i2, final SceneHolder sceneHolder, com.alightcreative.widget.QJ item) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        item.nr(2131231051);
        if (sceneElement.getOutline().getContours().get(i2).getKnots().size() > 2) {
            item.t(new Function0() { // from class: f0P.Xtu
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Wqz.ZwA(sceneHolder, sceneElement, i2);
                }
            });
        } else {
            item.Uo();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement XUb(SceneHolder sceneHolder, int i2, int i3, final float f3, final Vector2D vector2D, final Scene scene, final SceneElement el) {
        Intrinsics.checkNotNullParameter(scene, "scene");
        Intrinsics.checkNotNullParameter(el, "el");
        final Set<Integer> multiSelectPoints = sceneHolder.getSelection().getMultiSelectPoints();
        if (!multiSelectPoints.isEmpty()) {
            FKk fKk = new PropertyReference1Impl() { // from class: f0P.Wqz.FKk
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public Object get(Object obj) {
                    return ((SceneElement) obj).getOutline();
                }
            };
            Fl fl = new PropertyReference1Impl() { // from class: f0P.Wqz.Fl
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public Object get(Object obj) {
                    return ((KeyableCompoundCubicBSpline) obj).getContours();
                }
            };
            oA.aC aCVar = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), fl.getReturnType(), new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), fKk.getReturnType(), fKk), fl);
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SceneElement.class);
            KType type = aCVar.nr().getArguments().get(0).getType();
            Intrinsics.checkNotNull(type);
            oA.w6 w6Var = new oA.w6(orCreateKotlinClass, type, aCVar, i2);
            R6 r6 = new PropertyReference1Impl() { // from class: f0P.Wqz.R6
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public Object get(Object obj) {
                    return ((KeyableCubicBSpline) obj).getKnots();
                }
            };
            return (SceneElement) new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), r6.getReturnType(), w6Var, r6).t(el, new Function1() { // from class: f0P.QGL
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Wqz.rR(multiSelectPoints, scene, el, f3, vector2D, (List) obj);
                }
            });
        }
        RzR rzR = new PropertyReference1Impl() { // from class: f0P.Wqz.RzR
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((SceneElement) obj).getOutline();
            }
        };
        pq pqVar = new PropertyReference1Impl() { // from class: f0P.Wqz.pq
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((KeyableCompoundCubicBSpline) obj).getContours();
            }
        };
        oA.aC aCVar2 = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), pqVar.getReturnType(), new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), rzR.getReturnType(), rzR), pqVar);
        KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(SceneElement.class);
        KType type2 = aCVar2.nr().getArguments().get(0).getType();
        Intrinsics.checkNotNull(type2);
        oA.w6 w6Var2 = new oA.w6(orCreateKotlinClass2, type2, aCVar2, i2);
        kO4 ko4 = new PropertyReference1Impl() { // from class: f0P.Wqz.kO4
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((KeyableCubicBSpline) obj).getKnots();
            }
        };
        oA.aC aCVar3 = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), ko4.getReturnType(), w6Var2, ko4);
        KClass orCreateKotlinClass3 = Reflection.getOrCreateKotlinClass(SceneElement.class);
        KType type3 = aCVar3.nr().getArguments().get(0).getType();
        Intrinsics.checkNotNull(type3);
        oA.w6 w6Var3 = new oA.w6(orCreateKotlinClass3, type3, aCVar3, i3);
        hQ hQVar = new PropertyReference1Impl() { // from class: f0P.Wqz.hQ
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((KeyableCBKnot) obj).getP();
            }
        };
        return (SceneElement) new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), hQVar.getReturnType(), w6Var3, hQVar).t(el, new Function1() { // from class: f0P.hWw
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Wqz.V5F(scene, el, f3, vector2D, (Keyable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Vector2D Xli(Vector2D vector2D, Vector2D kf) {
        Intrinsics.checkNotNullParameter(kf, "kf");
        return GeometryKt.plus(kf, vector2D);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement YiW(int i2, int i3, final float f3, final Vector2D vector2D, final Scene scene, final SceneElement el) {
        Intrinsics.checkNotNullParameter(scene, "scene");
        Intrinsics.checkNotNullParameter(el, "el");
        crp crpVar = new PropertyReference1Impl() { // from class: f0P.Wqz.crp
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((SceneElement) obj).getOutline();
            }
        };
        Ogx ogx = new PropertyReference1Impl() { // from class: f0P.Wqz.Ogx
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((KeyableCompoundCubicBSpline) obj).getContours();
            }
        };
        oA.aC aCVar = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), ogx.getReturnType(), new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), crpVar.getReturnType(), crpVar), ogx);
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SceneElement.class);
        KType type = aCVar.nr().getArguments().get(0).getType();
        Intrinsics.checkNotNull(type);
        oA.w6 w6Var = new oA.w6(orCreateKotlinClass, type, aCVar, i2);
        DC dc = new PropertyReference1Impl() { // from class: f0P.Wqz.DC
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((KeyableCubicBSpline) obj).getKnots();
            }
        };
        oA.aC aCVar2 = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), dc.getReturnType(), w6Var, dc);
        KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(SceneElement.class);
        KType type2 = aCVar2.nr().getArguments().get(0).getType();
        Intrinsics.checkNotNull(type2);
        oA.w6 w6Var2 = new oA.w6(orCreateKotlinClass2, type2, aCVar2, i3);
        T t3 = new PropertyReference1Impl() { // from class: f0P.Wqz.T
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((KeyableCBKnot) obj).getCurveOut();
            }
        };
        return (SceneElement) new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), t3.getReturnType(), w6Var2, t3).t(el, new Function1() { // from class: f0P.asi
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Wqz.c(scene, el, f3, vector2D, (OptionalKeyableVector2D) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement Zn(Wqz wqz, int i2, Ref.IntRef intRef, KeyableCBKnot keyableCBKnot, float f3, KeyableCBKnot keyableCBKnot2, Scene scene, SceneElement el) {
        Intrinsics.checkNotNullParameter(scene, "<unused var>");
        Intrinsics.checkNotNullParameter(el, "el");
        float fFractionalTime = SceneElementKt.fractionalTime(el, HW.C.WPU(wqz));
        KeyableCompoundCubicBSpline outline = el.getOutline();
        List<KeyableCubicBSpline> contours = outline.getContours();
        KeyableCubicBSpline keyableCubicBSpline = outline.getContours().get(i2);
        return SceneElement.copy$default(el, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, outline.copy(HI0.rv6.t(contours, i2, KeyableCubicBSpline.copy$default(keyableCubicBSpline, HI0.rv6.n(keyableCubicBSpline.getKnots(), intRef.element + 1, CubicBSplineKt.keyable(new CBKnot(GeometryKt.plus(GeometryKt.times((Vector2D) KeyableKt.valueAtTime(keyableCBKnot.getP(), fFractionalTime), 1 - f3), GeometryKt.times((Vector2D) KeyableKt.valueAtTime(keyableCBKnot2.getP(), fFractionalTime), f3)), null, null, 6, null))), false, false, 6, null))), null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -8193, 127, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ZwA(SceneHolder sceneHolder, SceneElement sceneElement, int i2) {
        KeyableCompoundCubicBSpline outline = sceneElement.getOutline();
        sceneHolder.update(SceneElement.copy$default(sceneElement, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, outline.copy(HI0.rv6.t(outline.getContours(), i2, KeyableCubicBSpline.copy$default(outline.getContours().get(i2), null, true, false, 5, null))), null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -8193, 127, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(SceneHolder sceneHolder, SceneElement sceneElement, int i2, Wqz wqz) {
        ControlHandle selectedHandle = sceneHolder.getSelection().getSelectedHandle();
        ControlHandle controlHandle = ControlHandle.CURVE_OUT;
        Float fValueOf = Float.valueOf(0.7f);
        if (selectedHandle != controlHandle || sceneElement.getOutline().getContours().get(i2).getKnots().size() <= 2) {
            sceneHolder.setSelection(SceneSelection.copy$default(sceneHolder.getSelection(), null, null, null, Integer.valueOf(CollectionsKt.getLastIndex(sceneElement.getOutline().getContours().get(i2).getKnots())), SetsKt.emptySet(), null, controlHandle, null, false, null, fValueOf, null, 2983, null));
            KeyableCompoundCubicBSpline outline = sceneElement.getOutline();
            sceneHolder.update(SceneElement.copy$default(sceneElement, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, outline.copy(HI0.rv6.t(outline.getContours(), i2, KeyableCubicBSpline.copy$default(outline.getContours().get(i2), null, false, false, 5, null))), null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -8193, 127, null));
        } else {
            Integer selectedPoint = sceneHolder.getSelection().getSelectedPoint();
            int iIntValue = (selectedPoint != null ? selectedPoint.intValue() : 0) % sceneElement.getOutline().getContours().get(i2).getKnots().size();
            KeyableCompoundCubicBSpline outline2 = sceneElement.getOutline();
            int i3 = iIntValue + 1;
            sceneHolder.update(SceneElement.copy$default(sceneElement, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, outline2.copy(HI0.rv6.t(outline2.getContours(), i2, KeyableCubicBSpline.copy$default(outline2.getContours().get(i2), CollectionsKt.plus((Collection) CollectionsKt.drop(sceneElement.getOutline().getContours().get(i2).getKnots(), i3), (Iterable) CollectionsKt.take(sceneElement.getOutline().getContours().get(i2).getKnots(), i3)), false, false, 4, null))), null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -8193, 127, null));
            SceneElement sceneElementNHg = HW.C.nHg(wqz);
            if (sceneElementNHg == null) {
                return Unit.INSTANCE;
            }
            sceneHolder.setSelection(SceneSelection.copy$default(sceneHolder.getSelection(), null, null, null, Integer.valueOf(CollectionsKt.getLastIndex(sceneElementNHg.getOutline().getContours().get(i2).getKnots())), SetsKt.emptySet(), null, controlHandle, null, false, null, fValueOf, null, 2983, null));
        }
        return Unit.INSTANCE;
    }

    private final void bZm(MotionEvent event) {
        SceneElement sceneElementNHg;
        List<KeyableCubicBSpline> contours;
        KeyableCubicBSpline keyableCubicBSpline;
        List<KeyableCBKnot> knots;
        SceneHolder sceneHolderE = HW.C.e(this);
        if (sceneHolderE == null || (sceneElementNHg = HW.C.nHg(this)) == null) {
            return;
        }
        Integer selectedContour = sceneHolderE.getSelection().getSelectedContour();
        int iIntValue = selectedContour != null ? selectedContour.intValue() : 0;
        sceneHolderE.setSelection(SceneSelection.copy$default(sceneHolderE.getSelection(), null, null, null, null, null, null, null, null, false, CollectionsKt.emptyList(), null, null, 3583, null));
        if (this.pendingAddPointSpline == null || event.getEventTime() - event.getDownTime() >= ViewConfiguration.getTapTimeout() || this.accumDx >= 20.0f || this.accumDy >= 20.0f) {
            return;
        }
        SceneSelection selection = sceneHolderE.getSelection();
        KeyableCompoundCubicBSpline keyableCompoundCubicBSpline = this.pendingAddPointSpline;
        sceneHolderE.setSelection(SceneSelection.copy$default(selection, null, null, null, (keyableCompoundCubicBSpline == null || (contours = keyableCompoundCubicBSpline.getContours()) == null || (keyableCubicBSpline = contours.get(iIntValue)) == null || (knots = keyableCubicBSpline.getKnots()) == null) ? null : Integer.valueOf(CollectionsKt.getLastIndex(knots)), null, null, null, null, false, null, null, null, 4087, null));
        KeyableCompoundCubicBSpline keyableCompoundCubicBSpline2 = this.pendingAddPointSpline;
        Intrinsics.checkNotNull(keyableCompoundCubicBSpline2);
        sceneHolderE.update(SceneElement.copy$default(sceneElementNHg, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, keyableCompoundCubicBSpline2, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -8193, 127, null));
        this.pendingAddPointSpline = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionalKeyableVector2D c(Scene scene, SceneElement sceneElement, float f3, final Vector2D vector2D, OptionalKeyableVector2D it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return KeyableKt.copyWithComputedOptionalValueForTime(it, scene, sceneElement, f3, new Function1() { // from class: f0P.tl
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Wqz.Sax(vector2D, (Vector2D) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Vector2D c32(Vector2D vector2D, Vector2D it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return GeometryKt.plus(it, vector2D);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement d(SceneHolder sceneHolder, int i2, int i3, final float f3, final Vector2D vector2D, final Scene scene, final SceneElement el) {
        Intrinsics.checkNotNullParameter(scene, "scene");
        Intrinsics.checkNotNullParameter(el, "el");
        final Set<Integer> multiSelectPoints = sceneHolder.getSelection().getMultiSelectPoints();
        gnv gnvVar = new PropertyReference1Impl() { // from class: f0P.Wqz.gnv
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((SceneElement) obj).getOutline();
            }
        };
        fg fgVar = new PropertyReference1Impl() { // from class: f0P.Wqz.fg
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((KeyableCompoundCubicBSpline) obj).getContours();
            }
        };
        oA.aC aCVar = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), fgVar.getReturnType(), new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), gnvVar.getReturnType(), gnvVar), fgVar);
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SceneElement.class);
        KType type = aCVar.nr().getArguments().get(0).getType();
        Intrinsics.checkNotNull(type);
        oA.w6 w6Var = new oA.w6(orCreateKotlinClass, type, aCVar, i2);
        KH kh = new PropertyReference1Impl() { // from class: f0P.Wqz.KH
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((KeyableCubicBSpline) obj).getKnots();
            }
        };
        oA.aC aCVar2 = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), kh.getReturnType(), w6Var, kh);
        if (!multiSelectPoints.isEmpty()) {
            return (SceneElement) aCVar2.t(el, new Function1() { // from class: f0P.XpT
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Wqz.rT(multiSelectPoints, scene, el, f3, vector2D, (List) obj);
                }
            });
        }
        KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(SceneElement.class);
        KType type2 = aCVar2.nr().getArguments().get(0).getType();
        Intrinsics.checkNotNull(type2);
        oA.w6 w6Var2 = new oA.w6(orCreateKotlinClass2, type2, aCVar2, i3);
        LEl lEl = new PropertyReference1Impl() { // from class: f0P.Wqz.LEl
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((KeyableCBKnot) obj).getP();
            }
        };
        return (SceneElement) new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), lEl.getReturnType(), w6Var2, lEl).t(el, new Function1() { // from class: f0P.ZI
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Wqz.Lu(scene, el, f3, vector2D, (Keyable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit eOa(KeyableCubicBSpline keyableCubicBSpline, int i2, SceneHolder sceneHolder, SceneElement sceneElement) {
        if (keyableCubicBSpline == null || i2 <= 0 || !keyableCubicBSpline.getClosed()) {
            return Unit.INSTANCE;
        }
        KeyableCompoundCubicBSpline outline = sceneElement.getOutline();
        sceneHolder.update(SceneElement.copy$default(sceneElement, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, outline.copy(HI0.rv6.t(outline.getContours(), i2, KeyableCubicBSpline.copy$default(outline.getContours().get(i2), null, false, true, 3, null))), null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -8193, 127, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KeyableCBKnot eb(Scene scene, SceneElement sceneElement, float f3, final Vector2D vector2D, KeyableCBKnot it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return KeyableCBKnot.copy$default(it, null, KeyableKt.copyWithComputedOptionalValueForTime(it.getCurveIn(), scene, sceneElement, f3, new Function1() { // from class: f0P.RQi
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Wqz.Xli(vector2D, (Vector2D) obj);
            }
        }), KeyableKt.copyWithComputedOptionalValueForTime(it.getCurveOut(), scene, sceneElement, f3, new Function1() { // from class: f0P.Dhl
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Wqz.fq(vector2D, (Vector2D) obj);
            }
        }), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List eo(SceneElement sceneElement, SceneSelection sceneSelection, Scene scene, Wqz wqz, int i2, List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(it, 10));
        int i3 = 0;
        for (Object obj : it) {
            int i5 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            KeyableCBKnot keyableCBKnotCopy$default = (KeyableCBKnot) obj;
            double endTime = sceneElement.getEndTime() - sceneElement.getStartTime();
            if (sceneSelection.getMultiSelectPoints().contains(Integer.valueOf(i3))) {
                List keyframesIfKeyed = KeyableKt.getKeyframesIfKeyed(keyableCBKnotCopy$default.getP());
                if (keyframesIfKeyed == null || !keyframesIfKeyed.isEmpty()) {
                    Iterator it2 = keyframesIfKeyed.iterator();
                    while (it2.hasNext()) {
                        if (TimeKt.frameNumberFromTime((int) (((double) sceneElement.getStartTime()) + (((double) ((Keyframe) it2.next()).getTime()) * endTime)), i2) == HW.C.ck(wqz)) {
                            break;
                        }
                    }
                    Keyable keyableCopyAddingNewKeyframe = KeyableKt.copyAddingNewKeyframe(keyableCBKnotCopy$default.getP(), scene, sceneElement, SceneElementKt.fractionalTime(sceneElement, HW.C.WPU(wqz)));
                    Intrinsics.checkNotNull(keyableCopyAddingNewKeyframe, "null cannot be cast to non-null type com.alightcreative.app.motion.scene.KeyableVector2D");
                    keyableCBKnotCopy$default = KeyableCBKnot.copy$default(keyableCBKnotCopy$default, (KeyableVector2D) keyableCopyAddingNewKeyframe, null, null, 6, null);
                } else {
                    Keyable keyableCopyAddingNewKeyframe2 = KeyableKt.copyAddingNewKeyframe(keyableCBKnotCopy$default.getP(), scene, sceneElement, SceneElementKt.fractionalTime(sceneElement, HW.C.WPU(wqz)));
                    Intrinsics.checkNotNull(keyableCopyAddingNewKeyframe2, "null cannot be cast to non-null type com.alightcreative.app.motion.scene.KeyableVector2D");
                    keyableCBKnotCopy$default = KeyableCBKnot.copy$default(keyableCBKnotCopy$default, (KeyableVector2D) keyableCopyAddingNewKeyframe2, null, null, 6, null);
                }
            }
            arrayList.add(keyableCBKnotCopy$default);
            i3 = i5;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ex(final Wqz wqz, final SceneHolder sceneHolder, final int i2, final int i3, final float f3, com.alightcreative.widget.eO AlightMenu) {
        Intrinsics.checkNotNullParameter(AlightMenu, "$this$AlightMenu");
        final SceneElement sceneElementNHg = HW.C.nHg(wqz);
        if (sceneElementNHg == null) {
            return Unit.INSTANCE;
        }
        final int size = sceneElementNHg.getOutline().getContours().size();
        final KeyableCubicBSpline keyableCubicBSpline = (KeyableCubicBSpline) CollectionsKt.last((List) sceneElementNHg.getOutline().getContours());
        final float fFractionalTime = SceneElementKt.fractionalTime(sceneElementNHg, HW.C.WPU(wqz));
        Integer selectedContour = sceneHolder.getSelection().getSelectedContour();
        final int i5 = 0;
        final int iCoerceIn = RangesKt.coerceIn(selectedContour != null ? selectedContour.intValue() : 0, 0, size - 1);
        final KeyableCubicBSpline keyableCubicBSpline2 = (KeyableCubicBSpline) CollectionsKt.getOrNull(sceneElementNHg.getOutline().getContours(), iCoerceIn);
        AlightMenu.n(wqz.getResources().getDimensionPixelSize(2131166272));
        AlightMenu.xMQ(false);
        AlightMenu.t(true);
        final Wqz wqz2 = wqz;
        AlightMenu.nr(new Function1() { // from class: f0P.bj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Wqz.poH(keyableCubicBSpline, wqz2, (com.alightcreative.widget.QJ) obj);
            }
        });
        AlightMenu.Uo();
        for (Object obj : CollectionsKt.reversed(sceneElementNHg.getOutline().getContours())) {
            int i7 = i5 + 1;
            if (i5 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            final KeyableCubicBSpline keyableCubicBSpline3 = (KeyableCubicBSpline) obj;
            AlightMenu.nr(new Function1() { // from class: f0P.PS
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return Wqz.pr(size, i5, wqz2, sceneHolder, keyableCubicBSpline3, fFractionalTime, i2, i3, f3, sceneElementNHg, (com.alightcreative.widget.QJ) obj2);
                }
            });
            wqz2 = wqz;
            i5 = i7;
        }
        AlightMenu.KN(true, true, true, new Function1() { // from class: f0P.CnF
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return Wqz.GT(sceneElementNHg, iCoerceIn, sceneHolder, wqz, keyableCubicBSpline2, (com.alightcreative.widget.eO) obj2);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement fW(oA.j jVar, float f3, Wqz wqz, final Vector2D vector2D, Scene scene, SceneElement el) {
        Intrinsics.checkNotNullParameter(scene, "scene");
        Intrinsics.checkNotNullParameter(el, "el");
        KeyableCBKnot keyableCBKnot = (KeyableCBKnot) jVar.get(el);
        KeyableCBKnot keyableCBKnotCopy$default = KeyableCBKnot.copy$default(keyableCBKnot, null, KeyableKt.copyWithComputedOptionalValueForTime(keyableCBKnot.getCurveIn(), scene, el, f3, new Function1() { // from class: f0P.v
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Wqz.c32(vector2D, (Vector2D) obj);
            }
        }), null, 5, null);
        OptionalVector2D optionalVector2DOptionalValueAtTime = KeyableKt.optionalValueAtTime(keyableCBKnotCopy$default.getCurveOut(), f3);
        Vector2D vector2D2 = optionalVector2DOptionalValueAtTime instanceof Vector2D ? (Vector2D) optionalVector2DOptionalValueAtTime : null;
        OptionalVector2D optionalVector2DOptionalValueAtTime2 = KeyableKt.optionalValueAtTime(keyableCBKnotCopy$default.getCurveIn(), f3);
        final Vector2D vector2D3 = optionalVector2DOptionalValueAtTime2 instanceof Vector2D ? (Vector2D) optionalVector2DOptionalValueAtTime2 : null;
        if (vector2D2 != null && vector2D3 != null && wqz.lockHandleAngle) {
            final float length = wqz.lockHandleDistance ? GeometryKt.getLength(vector2D3) : GeometryKt.getLength(vector2D2);
            keyableCBKnotCopy$default = KeyableCBKnot.copy$default(keyableCBKnotCopy$default, null, null, KeyableKt.copyWithComputedOptionalValueForTime(keyableCBKnotCopy$default.getCurveOut(), scene, el, f3, new Function1() { // from class: f0P.F2n
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Wqz.l2(vector2D3, length, (Vector2D) obj);
                }
            }), 3, null);
        }
        return (SceneElement) jVar.rl(el, keyableCBKnotCopy$default);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Vector2D fq(Vector2D vector2D, Vector2D kf) {
        Intrinsics.checkNotNullParameter(kf, "kf");
        return GeometryKt.minus(kf, vector2D);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement g6(int i2, Scene scene, SceneElement el) {
        Intrinsics.checkNotNullParameter(scene, "<unused var>");
        Intrinsics.checkNotNullParameter(el, "el");
        return SceneElement.copy$default(el, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, el.getOutline().copy(HI0.rv6.O(el.getOutline().getContours(), i2)), null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -8193, 127, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Vector2D gxH(Vector2D vector2D, Vector2D kf) {
        Intrinsics.checkNotNullParameter(kf, "kf");
        return GeometryKt.plus(kf, vector2D);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(final Wqz wqz, final SceneSelection sceneSelection, final int i2, final int i3, ComponentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        HW.C.J(activity, new Function2() { // from class: f0P.l3h
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Wqz.l(this.f65750n, sceneSelection, i2, i3, (Scene) obj, (SceneElement) obj2);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i7(KeyableCubicBSpline keyableCubicBSpline, int i2, final Wqz wqz, com.alightcreative.widget.QJ item) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        item.nr(2131231021);
        if (keyableCubicBSpline == null || i2 <= 0) {
            item.Uo();
        } else {
            item.t(new Function0() { // from class: f0P.gW
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Wqz.VK2(this.f65585n);
                }
            });
        }
        return Unit.INSTANCE;
    }

    private final SJ0.N j() {
        SJ0.N n2 = this._binding;
        Intrinsics.checkNotNull(n2);
        return n2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit jE(final KeyableCubicBSpline keyableCubicBSpline, final int i2, final SceneHolder sceneHolder, final SceneElement sceneElement, com.alightcreative.widget.QJ item) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        if (keyableCubicBSpline == null || i2 <= 0 || !keyableCubicBSpline.getClosed()) {
            item.Uo();
        }
        if (keyableCubicBSpline == null || !keyableCubicBSpline.getExclude()) {
            item.nr(2131231739);
            item.t(new Function0() { // from class: f0P.dq
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Wqz.eOa(keyableCubicBSpline, i2, sceneHolder, sceneElement);
                }
            });
        } else {
            item.nr(2131231708);
            item.t(new Function0() { // from class: f0P.FOg
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Wqz.kC(i2, keyableCubicBSpline, sceneHolder, sceneElement);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KeyableCubicBSpline jO(SceneSelection sceneSelection, KeyableCubicBSpline it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return KeyableCubicBSpline.copy$default(it, HI0.rv6.J2(it.getKnots(), sceneSelection.getMultiSelectPoints()), false, false, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit kC(int i2, KeyableCubicBSpline keyableCubicBSpline, SceneHolder sceneHolder, SceneElement sceneElement) {
        if (i2 <= 0 || !keyableCubicBSpline.getClosed()) {
            return Unit.INSTANCE;
        }
        KeyableCompoundCubicBSpline outline = sceneElement.getOutline();
        sceneHolder.update(SceneElement.copy$default(sceneElement, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, outline.copy(HI0.rv6.t(outline.getContours(), i2, KeyableCubicBSpline.copy$default(outline.getContours().get(i2), null, false, false, 3, null))), null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -8193, 127, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String kQ(Set set) {
        return "selIndexes=" + set;
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x05b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void kR(SceneElement el, SceneSelection sel) {
        boolean z2;
        boolean z3;
        List keyframesIfKeyed;
        final int i2;
        ArrayList arrayList;
        if (el.getLiveShape().getId() != null) {
            if (isAdded()) {
                getParentFragmentManager().Zmq();
                return;
            }
            return;
        }
        List listLNy = lNy();
        if (listLNy == null) {
            z2 = false;
            break;
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listLNy, 10));
        Iterator it = listLNy.iterator();
        while (it.hasNext()) {
            List keyframesIfKeyed2 = KeyableKt.getKeyframesIfKeyed((Keyable) ((oA.j) it.next()).get(el));
            if (keyframesIfKeyed2.isEmpty()) {
                keyframesIfKeyed2 = null;
            }
            if (keyframesIfKeyed2 != null) {
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(keyframesIfKeyed2, 10));
                Iterator it2 = keyframesIfKeyed2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(Float.valueOf(((Keyframe) it2.next()).getTime()));
                }
            } else {
                arrayList = null;
            }
            arrayList2.add(arrayList);
        }
        List listDrop = CollectionsKt.drop(arrayList2, 1);
        if (listDrop == null || !listDrop.isEmpty()) {
            Iterator it3 = listDrop.iterator();
            while (it3.hasNext()) {
                if (!Intrinsics.areEqual((List) it3.next(), CollectionsKt.first((List) arrayList2))) {
                    z2 = false;
                    break;
                }
            }
        }
        z2 = true;
        j().gh.setEnabled(z2);
        float fFractionalTime = SceneElementKt.fractionalTime(el, HW.C.WPU(this));
        int size = el.getOutline().getContours().size();
        Integer selectedContour = sel.getSelectedContour();
        int i3 = size - 1;
        int iCoerceIn = RangesKt.coerceIn(selectedContour != null ? selectedContour.intValue() : 0, 0, i3);
        Integer selectedContour2 = sel.getSelectedContour();
        if (selectedContour2 == null || iCoerceIn != selectedContour2.intValue()) {
            SceneHolder sceneHolderE = HW.C.e(this);
            if (sceneHolderE == null) {
                return;
            }
            sceneHolderE.setSelection(SceneSelection.copy$default(sceneHolderE.getSelection(), null, null, Integer.valueOf(iCoerceIn), null, null, null, null, null, false, null, null, null, 4091, null));
            return;
        }
        CubicBSpline cubicBSplineValueAtTime = CubicBSplineKt.valueAtTime(el.getOutline().getContours().get(iCoerceIn), fFractionalTime);
        if (!Intrinsics.areEqual(j().f9242r.getOutline(), cubicBSplineValueAtTime)) {
            j().f9242r.setOutline(cubicBSplineValueAtTime);
            if (sel.getSelectedPoint() != null && sel.getSelectedHandle() != null) {
                OutlineScrollerView outlineScrollerView = j().f9242r;
                int iIntValue = sel.getSelectedPoint().intValue();
                ControlHandle selectedHandle = sel.getSelectedHandle();
                Float curvePos = sel.getCurvePos();
                OutlineScrollerView.S(outlineScrollerView, iIntValue, selectedHandle, curvePos != null ? curvePos.floatValue() : 0.5f, false, 8, null);
            }
        }
        boolean zIsEmpty = ((KeyableCubicBSpline) CollectionsKt.last((List) el.getOutline().getContours())).getKnots().isEmpty();
        if (iCoerceIn < i3) {
            j().ck.setEnabled(true);
            j().ck.setImageResource(2131231843);
            j().ck.setAlpha(1.0f);
        } else if (zIsEmpty) {
            j().ck.setEnabled(false);
            j().ck.setImageResource(2131231843);
            j().ck.setAlpha(0.3f);
        } else {
            j().ck.setEnabled(true);
            j().ck.setImageResource(2131231469);
            j().ck.setAlpha(1.0f);
        }
        if (iCoerceIn <= 0) {
            j().f9241o.setEnabled(false);
            j().f9241o.setAlpha(0.3f);
        } else {
            j().f9241o.setEnabled(true);
            j().f9241o.setAlpha(1.0f);
        }
        j().J2.setText((iCoerceIn + 1) + " / " + size);
        j().f9241o.setVisibility(4);
        j().ck.setVisibility(4);
        j().J2.setVisibility(4);
        Scene sceneIF = HW.C.iF(this);
        if (sceneIF != null) {
            int framesPerHundredSeconds = sceneIF.getFramesPerHundredSeconds();
            double endTime = el.getEndTime() - el.getStartTime();
            if (!sel.getMultiSelectPoints().isEmpty()) {
                List<KeyableCBKnot> knots = el.getOutline().getContours().get(iCoerceIn).getKnots();
                ArrayList arrayList3 = new ArrayList();
                int i5 = 0;
                for (Object obj : knots) {
                    int i7 = i5 + 1;
                    if (i5 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    if (sel.getMultiSelectPoints().contains(Integer.valueOf(i5))) {
                        arrayList3.add(obj);
                    }
                    i5 = i7;
                }
                final ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
                Iterator it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    arrayList4.add(((KeyableCBKnot) it4.next()).getP());
                }
                if (arrayList4.isEmpty()) {
                    i2 = 0;
                } else {
                    Iterator it5 = arrayList4.iterator();
                    i2 = 0;
                    while (it5.hasNext()) {
                        List keyframesIfKeyed3 = KeyableKt.getKeyframesIfKeyed((Keyable) it5.next());
                        if (keyframesIfKeyed3 == null || !keyframesIfKeyed3.isEmpty()) {
                            Iterator it6 = keyframesIfKeyed3.iterator();
                            while (true) {
                                if (it6.hasNext()) {
                                    if (TimeKt.frameNumberFromTime((int) (((double) el.getStartTime()) + (((double) ((Keyframe) it6.next()).getTime()) * endTime)), framesPerHundredSeconds) == HW.C.ck(this)) {
                                        i2++;
                                        if (i2 < 0) {
                                            CollectionsKt.throwCountOverflow();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (i2 <= 0) {
                    this.activeKeyframeAtCurrentTime = false;
                    this.mixedActiveKeyframeAtCurrentTime = false;
                } else if (i2 < arrayList4.size()) {
                    this.activeKeyframeAtCurrentTime = true;
                    this.mixedActiveKeyframeAtCurrentTime = true;
                } else {
                    this.activeKeyframeAtCurrentTime = true;
                    this.mixedActiveKeyframeAtCurrentTime = false;
                }
                XoT.C.Uo(this, new Function0() { // from class: f0P.Z4b
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Wqz.yUZ(arrayList4, i2, this);
                    }
                });
            } else if (sel.getSelectedPoint() == null || sel.getSelectedHandle() == null || sel.getSelectedHandle() == ControlHandle.CURVE_OUT || sel.getSelectedPoint().intValue() >= el.getOutline().getContours().get(iCoerceIn).getKnots().size()) {
                z3 = false;
                this.activeKeyframeAtCurrentTime = z3;
                this.mixedActiveKeyframeAtCurrentTime = false;
            } else {
                Object obj2 = CubicBSplineKt.get(el.getOutline().getContours().get(iCoerceIn).getKnots().get(sel.getSelectedPoint().intValue()), sel.getSelectedHandle());
                KeyableVector2D keyableVector2D = obj2 instanceof KeyableVector2D ? (KeyableVector2D) obj2 : null;
                if (keyableVector2D != null && (keyframesIfKeyed = KeyableKt.getKeyframesIfKeyed(keyableVector2D)) != null && !keyframesIfKeyed.isEmpty()) {
                    Iterator it7 = keyframesIfKeyed.iterator();
                    while (it7.hasNext()) {
                        if (TimeKt.frameNumberFromTime((int) (((double) el.getStartTime()) + (((double) ((Keyframe) it7.next()).getTime()) * endTime)), framesPerHundredSeconds) == HW.C.ck(this)) {
                            z3 = true;
                            break;
                        }
                    }
                    z3 = false;
                    this.activeKeyframeAtCurrentTime = z3;
                    this.mixedActiveKeyframeAtCurrentTime = false;
                }
            }
            ImageButton imageButton = j().rl;
            int i8 = 2131230998;
            if (!this.mixedActiveKeyframeAtCurrentTime && this.activeKeyframeAtCurrentTime) {
                i8 = 2131231022;
            }
            imageButton.setImageResource(i8);
            ControlHandle selectedHandle2 = sel.getSelectedHandle();
            ControlHandle controlHandle = ControlHandle.CURVE_OUT;
            if (selectedHandle2 == controlHandle) {
                j().nr.setImageResource(2131231882);
            } else {
                j().nr.setImageResource(2131231883);
            }
            if (sel.getSelectedPoint() == null || !((sel.getSelectedHandle() == ControlHandle.IN || sel.getSelectedHandle() == ControlHandle.OUT) && CollectionsKt.getIndices(el.getOutline().getContours().get(iCoerceIn).getKnots()).contains(sel.getSelectedPoint().intValue()))) {
                j().f9238O.setActivated(false);
                j().Ik.setActivated(false);
                waP().setEnabled(true);
                waP().setAlpha(1.0f);
                j().Ik.setAlpha(1.0f);
                if (sel.getSelectedPoint() == null || sel.getSelectedHandle() == controlHandle) {
                    j().f9238O.setImageResource(2131231073);
                    j().f9238O.setAlpha(0.3f);
                    j().f9238O.setEnabled(false);
                } else if (CollectionsKt.getIndices(el.getOutline().getContours().get(iCoerceIn).getKnots()).contains(sel.getSelectedPoint().intValue())) {
                    OptionalKeyableVector2D curveIn = el.getOutline().getContours().get(iCoerceIn).getKnots().get(sel.getSelectedPoint().intValue()).getCurveIn();
                    OptionalKeyableVector2D.NONE none = OptionalKeyableVector2D.NONE.INSTANCE;
                    if (curveIn == none && el.getOutline().getContours().get(iCoerceIn).getKnots().get(sel.getSelectedPoint().intValue()).getCurveOut() == none) {
                        j().f9238O.setImageResource(2131231073);
                    } else {
                        j().f9238O.setImageResource(2131231074);
                    }
                    j().f9238O.setAlpha(1.0f);
                    j().f9238O.setEnabled(true);
                }
                j().Ik.setImageResource(2131231630);
                j().Ik.setEnabled(true);
            } else {
                OptionalKeyableVector2D curveIn2 = el.getOutline().getContours().get(iCoerceIn).getKnots().get(sel.getSelectedPoint().intValue()).getCurveIn();
                OptionalKeyableVector2D.NONE none2 = OptionalKeyableVector2D.NONE.INSTANCE;
                if (curveIn2 != none2 && el.getOutline().getContours().get(iCoerceIn).getKnots().get(sel.getSelectedPoint().intValue()).getCurveOut() != none2) {
                    H().setImageResource(2131231884);
                    H().setActivated(this.lockHandleAngle);
                    H().setAlpha(1.0f);
                    waP().setImageResource(2131231887);
                    waP().setActivated(this.lockHandleDistance);
                    waP().setEnabled(this.lockHandleAngle);
                    waP().setAlpha(this.lockHandleAngle ? 1.0f : 0.3f);
                }
            }
            Integer selectedPoint = sel.getSelectedPoint();
            int size2 = el.getOutline().getContours().get(iCoerceIn).getKnots().size();
            j().f9239Z.setText((((size2 < 1 || selectedPoint == null) ? 0 : (selectedPoint.intValue() + size2) % size2) == size2 + (-1) || size2 < 1) && sel.getSelectedHandle() == controlHandle && !el.getOutline().getContours().get(iCoerceIn).getClosed() ? 2132017201 : sel.getSelectedHandle() == controlHandle ? 2132017202 : 2132019639);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement l(final Wqz wqz, final SceneSelection sceneSelection, int i2, final int i3, final Scene scene, final SceneElement el) {
        Intrinsics.checkNotNullParameter(scene, "scene");
        Intrinsics.checkNotNullParameter(el, "el");
        wqz.rxp().n(new j.crp(HW.C.ViF(wqz), rWZ.j.rl(el)));
        if (!sceneSelection.getMultiSelectPoints().isEmpty()) {
            Sis sis = new PropertyReference1Impl() { // from class: f0P.Wqz.Sis
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public Object get(Object obj) {
                    return ((SceneElement) obj).getOutline();
                }
            };
            l4Z l4z = new PropertyReference1Impl() { // from class: f0P.Wqz.l4Z
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public Object get(Object obj) {
                    return ((KeyableCompoundCubicBSpline) obj).getContours();
                }
            };
            oA.aC aCVar = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), l4z.getReturnType(), new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), sis.getReturnType(), sis), l4z);
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SceneElement.class);
            KType type = aCVar.nr().getArguments().get(0).getType();
            Intrinsics.checkNotNull(type);
            oA.w6 w6Var = new oA.w6(orCreateKotlinClass, type, aCVar, i2);
            mz mzVar = new PropertyReference1Impl() { // from class: f0P.Wqz.mz
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public Object get(Object obj) {
                    return ((KeyableCubicBSpline) obj).getKnots();
                }
            };
            final oA.aC aCVar2 = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), mzVar.getReturnType(), w6Var, mzVar);
            final SceneElement sceneElement = (SceneElement) aCVar2.t(el, new Function1() { // from class: f0P.cDu
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Wqz.eo(el, sceneSelection, scene, wqz, i3, (List) obj);
                }
            });
            XoT.C.Uo(wqz, new Function0() { // from class: f0P.Dbq
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Wqz.uQ(aCVar2, sceneElement);
                }
            });
            return sceneElement;
        }
        OU ou2 = new PropertyReference1Impl() { // from class: f0P.Wqz.OU
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((SceneElement) obj).getOutline();
            }
        };
        C2010p c2010p = new PropertyReference1Impl() { // from class: f0P.Wqz.p
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((KeyableCompoundCubicBSpline) obj).getContours();
            }
        };
        oA.aC aCVar3 = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), c2010p.getReturnType(), new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), ou2.getReturnType(), ou2), c2010p);
        KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(SceneElement.class);
        KType type2 = aCVar3.nr().getArguments().get(0).getType();
        Intrinsics.checkNotNull(type2);
        oA.w6 w6Var2 = new oA.w6(orCreateKotlinClass2, type2, aCVar3, i2);
        O o2 = new PropertyReference1Impl() { // from class: f0P.Wqz.O
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((KeyableCubicBSpline) obj).getKnots();
            }
        };
        oA.aC aCVar4 = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), o2.getReturnType(), w6Var2, o2);
        int iIntValue = sceneSelection.getSelectedPoint().intValue();
        KClass orCreateKotlinClass3 = Reflection.getOrCreateKotlinClass(SceneElement.class);
        KType type3 = aCVar4.nr().getArguments().get(0).getType();
        Intrinsics.checkNotNull(type3);
        return (SceneElement) new oA.w6(orCreateKotlinClass3, type3, aCVar4, iIntValue).t(el, new Function1() { // from class: f0P.Zz
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Wqz.wKY(sceneSelection, scene, el, wqz, (KeyableCBKnot) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Vector2D l2(Vector2D vector2D, float f3, Vector2D it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return GeometryKt.times(GeometryKt.normalize(vector2D), -f3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement lRt(int i2, int i3, final float f3, final Vector2D vector2D, final Scene scene, final SceneElement el) {
        Intrinsics.checkNotNullParameter(scene, "scene");
        Intrinsics.checkNotNullParameter(el, "el");
        g9 g9Var = new PropertyReference1Impl() { // from class: f0P.Wqz.g9
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((SceneElement) obj).getOutline();
            }
        };
        L0y l0y = new PropertyReference1Impl() { // from class: f0P.Wqz.L0y
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((KeyableCompoundCubicBSpline) obj).getContours();
            }
        };
        oA.aC aCVar = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), l0y.getReturnType(), new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), g9Var.getReturnType(), g9Var), l0y);
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SceneElement.class);
        KType type = aCVar.nr().getArguments().get(0).getType();
        Intrinsics.checkNotNull(type);
        oA.w6 w6Var = new oA.w6(orCreateKotlinClass, type, aCVar, i2);
        CM cm = new PropertyReference1Impl() { // from class: f0P.Wqz.CM
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((KeyableCubicBSpline) obj).getKnots();
            }
        };
        oA.aC aCVar2 = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), cm.getReturnType(), w6Var, cm);
        KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(SceneElement.class);
        KType type2 = aCVar2.nr().getArguments().get(0).getType();
        Intrinsics.checkNotNull(type2);
        return (SceneElement) new oA.w6(orCreateKotlinClass2, type2, aCVar2, i3).t(el, new Function1() { // from class: f0P.XK
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Wqz.n7u(scene, el, f3, vector2D, (KeyableCBKnot) obj);
            }
        });
    }

    private final void mx() {
        if (!this.activeKeyframeAtCurrentTime || this.mixedActiveKeyframeAtCurrentTime) {
            return;
        }
        new AlertDialog.Builder(getActivity()).setTitle(2132017661).setPositiveButton(2132017650, new DialogInterface.OnClickListener() { // from class: f0P.HI
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                Wqz.lS(this.f64256n, dialogInterface, i2);
            }
        }).setNegativeButton(2132017396, new DialogInterface.OnClickListener() { // from class: f0P.F
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                Wqz.iV(dialogInterface, i2);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KeyableCBKnot n7b(SceneSelection sceneSelection, float f3, KeyableCBKnot knot) {
        Intrinsics.checkNotNullParameter(knot, "knot");
        ControlHandle selectedHandle = sceneSelection.getSelectedHandle();
        int i2 = selectedHandle == null ? -1 : Ml.$EnumSwitchMapping$0[selectedHandle.ordinal()];
        if (i2 == 1) {
            return knot.getP().getKeyed() ? KeyableCBKnot.copy$default(knot, KeyableKt.keyable((Vector2D) KeyableKt.valueAtTime(knot.getP(), f3)), null, null, 6, null) : knot;
        }
        if (i2 != 2 && i2 != 3) {
            if (i2 == 4) {
                return knot;
            }
            throw new NoWhenBranchMatchedException();
        }
        if ((knot.getCurveIn() instanceof KeyableVector2D) && ((KeyableVector2D) knot.getCurveIn()).getKeyed()) {
            knot = KeyableCBKnot.copy$default(knot, null, KeyableKt.keyable((Vector2D) KeyableKt.valueAtTime((Keyable) knot.getCurveIn(), f3)), null, 5, null);
        }
        KeyableCBKnot keyableCBKnot = knot;
        return ((keyableCBKnot.getCurveOut() instanceof KeyableVector2D) && ((KeyableVector2D) keyableCBKnot.getCurveOut()).getKeyed()) ? KeyableCBKnot.copy$default(keyableCBKnot, null, null, KeyableKt.keyable((Vector2D) KeyableKt.valueAtTime((Keyable) keyableCBKnot.getCurveOut(), f3)), 3, null) : keyableCBKnot;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KeyableCBKnot n7u(Scene scene, SceneElement sceneElement, float f3, final Vector2D vector2D, KeyableCBKnot it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return KeyableCBKnot.copy$default(it, null, KeyableKt.copyWithComputedOptionalValueForTime(it.getCurveIn(), scene, sceneElement, f3, new Function1() { // from class: f0P.BLY
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Wqz.yA(vector2D, (Vector2D) obj);
            }
        }), KeyableKt.copyWithComputedOptionalValueForTime(it.getCurveOut(), scene, sceneElement, f3, new Function1() { // from class: f0P.BNf
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Wqz.gxH(vector2D, (Vector2D) obj);
            }
        }), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement nO(int i2, List list, Scene scene, SceneElement sceneElement) {
        Intrinsics.checkNotNullParameter(scene, "<unused var>");
        Intrinsics.checkNotNullParameter(sceneElement, YjqZUJsVmhcjko.jIyuysyH);
        KeyableCompoundCubicBSpline outline = sceneElement.getOutline();
        return SceneElement.copy$default(sceneElement, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, outline.copy(HI0.rv6.t(outline.getContours(), i2, KeyableCubicBSpline.copy$default(outline.getContours().get(i2), list, false, false, 6, null))), null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -8193, 127, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ni(int i2, int i3, SceneElement sceneElement, SceneHolder sceneHolder, Wqz wqz) {
        int iCoerceAtMost = RangesKt.coerceAtMost(i2, i3 - 1);
        if (sceneElement.getOutline().getContours().get(iCoerceAtMost).getKnots().isEmpty()) {
            sceneHolder.setSelection(SceneSelection.copy$default(sceneHolder.getSelection(), null, null, Integer.valueOf(iCoerceAtMost), 0, SetsKt.emptySet(), null, ControlHandle.CURVE_OUT, null, false, null, Float.valueOf(0.3f), Vector2D.INSTANCE.getZERO(), 931, null));
        } else {
            sceneHolder.setSelection(SceneSelection.copy$default(sceneHolder.getSelection(), null, null, Integer.valueOf(iCoerceAtMost), 0, SetsKt.emptySet(), null, ControlHandle.MAIN, null, false, null, null, null, 4003, null));
        }
        wqz.Bha();
        wqz.ENe();
        wqz.kR(sceneElement, sceneHolder.getSelection());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List o9(SceneSelection sceneSelection, float f3, List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(it, 10));
        int i2 = 0;
        for (Object obj : it) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            KeyableCBKnot keyableCBKnotCopy$default = (KeyableCBKnot) obj;
            if (sceneSelection.getMultiSelectPoints().contains(Integer.valueOf(i2)) && keyableCBKnotCopy$default.getP().getKeyed()) {
                keyableCBKnotCopy$default = KeyableCBKnot.copy$default(keyableCBKnotCopy$default, KeyableKt.keyable((Vector2D) KeyableKt.valueAtTime(keyableCBKnotCopy$default.getP(), f3)), null, null, 6, null);
            }
            arrayList.add(keyableCBKnotCopy$default);
            i2 = i3;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement oz(Scene scene, SceneElement el) {
        Intrinsics.checkNotNullParameter(scene, "<unused var>");
        Intrinsics.checkNotNullParameter(el, "el");
        return SceneElement.copy$default(el, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, el.getOutline().copy(CollectionsKt.plus((Collection<? extends KeyableCubicBSpline>) el.getOutline().getContours(), CubicBSplineKt.keyable(new CubicBSpline(CollectionsKt.emptyList(), false, false, 4, null)))), null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -8193, 127, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement pS(final SceneSelection sceneSelection, int i2, final Wqz wqz, final Scene scene, final SceneElement el) {
        Intrinsics.checkNotNullParameter(scene, "scene");
        Intrinsics.checkNotNullParameter(el, "el");
        if (!sceneSelection.getMultiSelectPoints().isEmpty()) {
            Zs zs = new PropertyReference1Impl() { // from class: f0P.Wqz.Zs
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public Object get(Object obj) {
                    return ((SceneElement) obj).getOutline();
                }
            };
            P p2 = new PropertyReference1Impl() { // from class: f0P.Wqz.P
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public Object get(Object obj) {
                    return ((KeyableCompoundCubicBSpline) obj).getContours();
                }
            };
            oA.aC aCVar = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), p2.getReturnType(), new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), zs.getReturnType(), zs), p2);
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SceneElement.class);
            KType type = aCVar.nr().getArguments().get(0).getType();
            Intrinsics.checkNotNull(type);
            oA.w6 w6Var = new oA.w6(orCreateKotlinClass, type, aCVar, i2);
            C2008m c2008m = new PropertyReference1Impl() { // from class: f0P.Wqz.m
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public Object get(Object obj) {
                    return ((KeyableCubicBSpline) obj).getKnots();
                }
            };
            return (SceneElement) new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), c2008m.getReturnType(), w6Var, c2008m).t(el, new Function1() { // from class: f0P.vi
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Wqz.tEO(sceneSelection, el, scene, wqz, (List) obj);
                }
            });
        }
        iF iFVar = new PropertyReference1Impl() { // from class: f0P.Wqz.iF
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((SceneElement) obj).getOutline();
            }
        };
        yg ygVar = new PropertyReference1Impl() { // from class: f0P.Wqz.yg
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((KeyableCompoundCubicBSpline) obj).getContours();
            }
        };
        oA.aC aCVar2 = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), ygVar.getReturnType(), new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), iFVar.getReturnType(), iFVar), ygVar);
        KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(SceneElement.class);
        KType type2 = aCVar2.nr().getArguments().get(0).getType();
        Intrinsics.checkNotNull(type2);
        oA.w6 w6Var2 = new oA.w6(orCreateKotlinClass2, type2, aCVar2, i2);
        pO pOVar = new PropertyReference1Impl() { // from class: f0P.Wqz.pO
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((KeyableCubicBSpline) obj).getKnots();
            }
        };
        oA.aC aCVar3 = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), pOVar.getReturnType(), w6Var2, pOVar);
        int iIntValue = sceneSelection.getSelectedPoint().intValue();
        KClass orCreateKotlinClass3 = Reflection.getOrCreateKotlinClass(SceneElement.class);
        KType type3 = aCVar3.nr().getArguments().get(0).getType();
        Intrinsics.checkNotNull(type3);
        return (SceneElement) new oA.w6(orCreateKotlinClass3, type3, aCVar3, iIntValue).t(el, new Function1() { // from class: f0P.ab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Wqz.yAc(sceneSelection, el, scene, wqz, (KeyableCBKnot) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit poH(KeyableCubicBSpline keyableCubicBSpline, final Wqz wqz, com.alightcreative.widget.QJ item) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        item.J2(2132017205);
        item.nr(2131231484);
        if (keyableCubicBSpline.getKnots().isEmpty()) {
            item.Uo();
        }
        item.t(new Function0() { // from class: f0P.BW
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Wqz.W1c(this.f64093n);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit pr(final int i2, int i3, final Wqz wqz, final SceneHolder sceneHolder, KeyableCubicBSpline keyableCubicBSpline, float f3, int i5, int i7, float f4, final SceneElement sceneElement, com.alightcreative.widget.QJ item) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        final int i8 = (i2 - 1) - i3;
        String string = wqz.getString(2132017501, Integer.valueOf(i8 + 1));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        item.rl(string);
        Integer selectedContour = sceneHolder.getSelection().getSelectedContour();
        boolean z2 = selectedContour != null && i8 == selectedContour.intValue();
        if (z2) {
            item.n(com.alightcreative.widget.oXP.f47462t);
        }
        CubicBSpline cubicBSplineCenteredAtOrigin = CubicBSplineKt.centeredAtOrigin(CubicBSplineKt.valueAtTime(keyableCubicBSpline, f3));
        CubicBSpline cubicBSplineTimes = CubicBSplineKt.times(cubicBSplineCenteredAtOrigin, CubicBSplineKt.fitInScale(cubicBSplineCenteredAtOrigin, i5, i5));
        int i9 = i5 + i7;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i9, i9, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        Resources resources = wqz.getResources();
        int i10 = z2 ? 2131099769 : 2131099755;
        Context context = wqz.getContext();
        paint.setColor(resources.getColor(i10, context != null ? context.getTheme() : null));
        paint.setAlpha(100);
        float f5 = (i5 / 2.0f) + f4;
        canvas.drawPath(CubicBSplineKt.toPath(CubicBSplineKt.plus(cubicBSplineTimes, new Vector2D(f5, f5))).t(), paint);
        paint.setStyle(Paint.Style.STROKE);
        Resources resources2 = wqz.getResources();
        int i11 = z2 ? 2131099769 : 2131099755;
        Context context2 = wqz.getContext();
        paint.setColor(resources2.getColor(i11, context2 != null ? context2.getTheme() : null));
        paint.setStrokeWidth(i7);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        canvas.drawPath(CubicBSplineKt.toPath(CubicBSplineKt.plus(cubicBSplineTimes, new Vector2D(f5, f5))).t(), paint);
        item.KN(bitmapCreateBitmap);
        item.t(new Function0() { // from class: f0P.f0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Wqz.ni(i8, i2, sceneElement, sceneHolder, wqz);
            }
        });
        return Unit.INSTANCE;
    }

    private final void qva(float dx, float dy) {
        final SceneHolder sceneHolderE;
        Integer selectedPoint;
        float x2;
        float y2;
        this.accumDx += dx;
        this.accumDy += dy;
        SceneElement sceneElementNHg = HW.C.nHg(this);
        if (sceneElementNHg == null || (sceneHolderE = HW.C.e(this)) == null || (selectedPoint = sceneHolderE.getSelection().getSelectedPoint()) == null) {
            return;
        }
        final int iIntValue = selectedPoint.intValue();
        ControlHandle selectedHandle = sceneHolderE.getSelection().getSelectedHandle();
        if (selectedHandle == null) {
            return;
        }
        final float fFractionalTime = SceneElementKt.fractionalTime(sceneElementNHg, HW.C.WPU(this));
        Transform transformValueAtTime = sceneElementNHg.getTransform().valueAtTime(fFractionalTime);
        Vector2D vector2DTimes = GeometryKt.times(GeometryKt.rot(new Vector2D(dx, dy), -transformValueAtTime.getRotation()), GeometryKt.recip(transformValueAtTime.getScale()));
        Vector2D pendingAddPoint = sceneHolderE.getSelection().getPendingAddPoint();
        Integer selectedContour = sceneHolderE.getSelection().getSelectedContour();
        int iIntValue2 = selectedContour != null ? selectedContour.intValue() : 0;
        List<KeyableCBKnot> knots = sceneElementNHg.getOutline().getContours().get(iIntValue2).getKnots();
        if (pendingAddPoint == null && knots.isEmpty()) {
            return;
        }
        this.accum = GeometryKt.plus(this.accum, vector2DTimes);
        Vector2D vector2D = new Vector2D(H6M(this.snapX, this.accum.getX()), H6M(this.snapY, this.accum.getY()));
        final Vector2D vector2DMinus = GeometryKt.minus(vector2D, this.prevSnapAccum);
        this.prevSnapAccum = vector2D;
        try {
            ControlHandle controlHandle = ControlHandle.CURVE_OUT;
            if (selectedHandle == controlHandle) {
                Intrinsics.checkNotNull(pendingAddPoint);
                x2 = TransformKt.transformPoint(transformValueAtTime, pendingAddPoint).getX();
            } else {
                Object obj = CubicBSplineKt.get(knots.get(iIntValue), selectedHandle);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.alightcreative.app.motion.scene.KeyableVector2D");
                x2 = TransformKt.transformPoint(transformValueAtTime, (Vector2D) KeyableKt.valueAtTime((KeyableVector2D) obj, fFractionalTime)).getX();
            }
            if (selectedHandle == controlHandle) {
                Intrinsics.checkNotNull(pendingAddPoint);
                y2 = TransformKt.transformPoint(transformValueAtTime, pendingAddPoint).getY();
            } else {
                Object obj2 = CubicBSplineKt.get(knots.get(iIntValue), selectedHandle);
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type com.alightcreative.app.motion.scene.KeyableVector2D");
                y2 = TransformKt.transformPoint(transformValueAtTime, (Vector2D) KeyableKt.valueAtTime((KeyableVector2D) obj2, fFractionalTime)).getY();
            }
            SceneSelection selection = sceneHolderE.getSelection();
            sceneHolderE.setSelection(SceneSelection.copy$default(sceneHolderE.getSelection(), null, null, null, null, null, null, null, null, false, CollectionsKt.listOfNotNull((Object[]) new SnapGuide[]{(this.snapX.values().contains(Float.valueOf(vector2D.getX())) && vector2DMinus.getX() == 0.0f) ? new SnapGuide(b1P.w6.f43148n, x2, b1P.Wre.f43137n) : null, (this.snapY.values().contains(Float.valueOf(vector2D.getY())) && vector2DMinus.getY() == 0.0f) ? new SnapGuide(b1P.w6.f43149t, y2, b1P.Wre.f43137n) : null}), null, null, 3583, null));
            List<SnapGuide> snapGuides = sceneHolderE.getSelection().getSnapGuides();
            if (snapGuides == null || !snapGuides.isEmpty()) {
                Iterator<T> it = snapGuides.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (!selection.getSnapGuides().contains((SnapGuide) it.next())) {
                        com.alightcreative.widget.LEl.t(this).n();
                        break;
                    }
                }
            }
            if (Intrinsics.areEqual(vector2DMinus, Vector2D.INSTANCE.getZERO())) {
                return;
            }
            int i2 = Ml.$EnumSwitchMapping$0[selectedHandle.ordinal()];
            if (i2 == 1) {
                final int i3 = iIntValue2;
                HW.C.D(this, new Function2() { // from class: f0P.rCj
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        return Wqz.d(sceneHolderE, i3, iIntValue, fFractionalTime, vector2DMinus, (Scene) obj3, (SceneElement) obj4);
                    }
                });
                return;
            }
            if (i2 == 2) {
                Mf mf = new PropertyReference1Impl() { // from class: f0P.Wqz.Mf
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj3) {
                        return ((SceneElement) obj3).getOutline();
                    }
                };
                o7q o7qVar = new PropertyReference1Impl() { // from class: f0P.Wqz.o7q
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj3) {
                        return ((KeyableCompoundCubicBSpline) obj3).getContours();
                    }
                };
                oA.aC aCVar = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), o7qVar.getReturnType(), new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), mf.getReturnType(), mf), o7qVar);
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SceneElement.class);
                KType type = aCVar.nr().getArguments().get(0).getType();
                Intrinsics.checkNotNull(type);
                oA.w6 w6Var = new oA.w6(orCreateKotlinClass, type, aCVar, iIntValue2);
                xZD xzd = new PropertyReference1Impl() { // from class: f0P.Wqz.xZD
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj3) {
                        return ((KeyableCubicBSpline) obj3).getKnots();
                    }
                };
                oA.aC aCVar2 = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), xzd.getReturnType(), w6Var, xzd);
                KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(SceneElement.class);
                KType type2 = aCVar2.nr().getArguments().get(0).getType();
                Intrinsics.checkNotNull(type2);
                final oA.w6 w6Var2 = new oA.w6(orCreateKotlinClass2, type2, aCVar2, iIntValue);
                HW.C.D(this, new Function2() { // from class: f0P.LIz
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        return Wqz.fW(w6Var2, fFractionalTime, this, vector2DMinus, (Scene) obj3, (SceneElement) obj4);
                    }
                });
                return;
            }
            if (i2 != 3) {
                if (i2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                if (pendingAddPoint != null) {
                    sceneHolderE.setSelection(SceneSelection.copy$default(sceneHolderE.getSelection(), null, null, null, null, null, null, null, null, false, null, null, GeometryKt.plus(pendingAddPoint, vector2DMinus), 2047, null));
                    return;
                }
                return;
            }
            M5 m5 = new PropertyReference1Impl() { // from class: f0P.Wqz.M5
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public Object get(Object obj3) {
                    return ((SceneElement) obj3).getOutline();
                }
            };
            YzO yzO = new PropertyReference1Impl() { // from class: f0P.Wqz.YzO
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public Object get(Object obj3) {
                    return ((KeyableCompoundCubicBSpline) obj3).getContours();
                }
            };
            oA.aC aCVar3 = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), yzO.getReturnType(), new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), m5.getReturnType(), m5), yzO);
            KClass orCreateKotlinClass3 = Reflection.getOrCreateKotlinClass(SceneElement.class);
            KType type3 = aCVar3.nr().getArguments().get(0).getType();
            Intrinsics.checkNotNull(type3);
            oA.w6 w6Var3 = new oA.w6(orCreateKotlinClass3, type3, aCVar3, iIntValue2);
            QaP qaP = new PropertyReference1Impl() { // from class: f0P.Wqz.QaP
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public Object get(Object obj3) {
                    return ((KeyableCubicBSpline) obj3).getKnots();
                }
            };
            oA.aC aCVar4 = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), qaP.getReturnType(), w6Var3, qaP);
            KClass orCreateKotlinClass4 = Reflection.getOrCreateKotlinClass(SceneElement.class);
            KType type4 = aCVar4.nr().getArguments().get(0).getType();
            Intrinsics.checkNotNull(type4);
            final oA.w6 w6Var4 = new oA.w6(orCreateKotlinClass4, type4, aCVar4, iIntValue);
            HW.C.D(this, new Function2() { // from class: f0P.nKE
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return Wqz.Om(w6Var4, fFractionalTime, this, vector2DMinus, (Scene) obj3, (SceneElement) obj4);
                }
            });
        } catch (ClassCastException e2) {
            throw new RuntimeException("ClassCastException on Controlpad: sh=" + selectedHandle + " pap=" + pendingAddPoint + " sp=" + iIntValue + " knots=" + CollectionsKt.joinToString$default(knots, ",", null, null, 0, null, null, 62, null), e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List rR(Set set, Scene scene, SceneElement sceneElement, float f3, final Vector2D vector2D, List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(it, 10));
        int i2 = 0;
        for (Object obj : it) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            KeyableCBKnot keyableCBKnotCopy$default = (KeyableCBKnot) obj;
            if (set.contains(Integer.valueOf(i2))) {
                Keyable keyableCopyWithComputedValueForTime = KeyableKt.copyWithComputedValueForTime(keyableCBKnotCopy$default.getP(), scene, sceneElement, f3, new Function1() { // from class: f0P.dB
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return Wqz.MPw(vector2D, (Vector2D) obj2);
                    }
                });
                Intrinsics.checkNotNull(keyableCopyWithComputedValueForTime, "null cannot be cast to non-null type com.alightcreative.app.motion.scene.KeyableVector2D");
                keyableCBKnotCopy$default = KeyableCBKnot.copy$default(keyableCBKnotCopy$default, (KeyableVector2D) keyableCopyWithComputedValueForTime, null, null, 6, null);
            }
            arrayList.add(keyableCBKnotCopy$default);
            i2 = i3;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List rT(Set set, Scene scene, SceneElement sceneElement, float f3, final Vector2D vector2D, List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(it, 10));
        int i2 = 0;
        for (Object obj : it) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            KeyableCBKnot keyableCBKnotCopy$default = (KeyableCBKnot) obj;
            if (set.contains(Integer.valueOf(i2))) {
                Keyable keyableCopyWithComputedValueForTime = KeyableKt.copyWithComputedValueForTime(keyableCBKnotCopy$default.getP(), scene, sceneElement, f3, new Function1() { // from class: f0P.WE7
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return Wqz.L(vector2D, (Vector2D) obj2);
                    }
                });
                Intrinsics.checkNotNull(keyableCopyWithComputedValueForTime, "null cannot be cast to non-null type com.alightcreative.app.motion.scene.KeyableVector2D");
                keyableCBKnotCopy$default = KeyableCBKnot.copy$default(keyableCBKnotCopy$default, (KeyableVector2D) keyableCopyWithComputedValueForTime, null, null, 6, null);
            }
            arrayList.add(keyableCBKnotCopy$default);
            i2 = i3;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement s(int i2, Scene scene, SceneElement el) {
        Intrinsics.checkNotNullParameter(scene, "<unused var>");
        Intrinsics.checkNotNullParameter(el, "el");
        return SceneElement.copy$default(el, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, el.getOutline().copy(HI0.rv6.O(el.getOutline().getContours(), i2)), null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -8193, 127, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Vector2D sFO(Vector2D vector2D, Vector2D kf) {
        Intrinsics.checkNotNullParameter(kf, "kf");
        return GeometryKt.plus(kf, vector2D);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Vector2D t1J(Vector2D vector2D, Vector2D it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return GeometryKt.plus(it, vector2D);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List tEO(SceneSelection sceneSelection, SceneElement sceneElement, Scene scene, Wqz wqz, List it) {
        Object next;
        Intrinsics.checkNotNullParameter(it, "it");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(it, 10));
        int i2 = 0;
        for (Object obj : it) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            KeyableCBKnot keyableCBKnot = (KeyableCBKnot) obj;
            if (sceneSelection.getMultiSelectPoints().contains(Integer.valueOf(i2)) && keyableCBKnot.getP().getKeyed()) {
                Iterator<T> it2 = keyableCBKnot.getP().getKeyframes().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    if (TimeKt.frameNumberFromTime((int) (((double) sceneElement.getStartTime()) + ((double) (((Keyframe) next).getTime() * (sceneElement.getEndTime() - sceneElement.getStartTime())))), scene.getFramesPerHundredSeconds()) == HW.C.ck(wqz)) {
                        break;
                    }
                }
                Keyframe keyframe = (Keyframe) next;
                if (keyframe != null) {
                    Keyable keyableCopyRemovingKeyframe = KeyableKt.copyRemovingKeyframe(keyableCBKnot.getP(), scene, sceneElement, keyframe.getTime());
                    Intrinsics.checkNotNull(keyableCopyRemovingKeyframe, "null cannot be cast to non-null type com.alightcreative.app.motion.scene.KeyableVector2D");
                    KeyableCBKnot keyableCBKnotCopy$default = KeyableCBKnot.copy$default(keyableCBKnot, (KeyableVector2D) keyableCopyRemovingKeyframe, null, null, 6, null);
                    if (keyableCBKnotCopy$default != null) {
                        keyableCBKnot = keyableCBKnotCopy$default;
                    }
                }
            }
            arrayList.add(keyableCBKnot);
            i2 = i3;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement tdZ(Wqz wqz, KeyableCBKnot keyableCBKnot, KeyableCBKnot keyableCBKnot2, final KeyableCBKnot keyableCBKnot3, oA.j jVar, Scene scene, SceneElement el) {
        Intrinsics.checkNotNullParameter(scene, "<unused var>");
        Intrinsics.checkNotNullParameter(el, "el");
        final float fFractionalTime = SceneElementKt.fractionalTime(el, HW.C.WPU(wqz));
        final Vector2D vector2DDiv = GeometryKt.div(GeometryKt.times(GeometryKt.minus((Vector2D) KeyableKt.valueAtTime(keyableCBKnot.getP(), fFractionalTime), (Vector2D) KeyableKt.valueAtTime(keyableCBKnot2.getP(), fFractionalTime)), 3), 8);
        final Vector2D vector2D = (Vector2D) KeyableKt.valueAtTime(keyableCBKnot3.getP(), fFractionalTime);
        return (SceneElement) jVar.t(el, new Function1() { // from class: f0P.E6O
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Wqz.GRh(keyableCBKnot3, fFractionalTime, vector2DDiv, vector2D, (KeyableCBKnot) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement uG(Scene scene, SceneElement el) {
        Intrinsics.checkNotNullParameter(scene, "<unused var>");
        Intrinsics.checkNotNullParameter(el, "el");
        return SceneElement.copy$default(el, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, el.getOutline().copy(CollectionsKt.plus((Collection<? extends KeyableCubicBSpline>) el.getOutline().getContours(), CubicBSplineKt.keyable(new CubicBSpline(CollectionsKt.emptyList(), false, false, 4, null)))), null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -8193, 127, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement v0j(final SceneSelection sceneSelection, int i2, final float f3, Scene scene, SceneElement el) {
        Intrinsics.checkNotNullParameter(scene, "<unused var>");
        Intrinsics.checkNotNullParameter(el, "el");
        if (!sceneSelection.getMultiSelectPoints().isEmpty()) {
            C c2 = new PropertyReference1Impl() { // from class: f0P.Wqz.C
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public Object get(Object obj) {
                    return ((SceneElement) obj).getOutline();
                }
            };
            C2009o c2009o = new PropertyReference1Impl() { // from class: f0P.Wqz.o
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public Object get(Object obj) {
                    return ((KeyableCompoundCubicBSpline) obj).getContours();
                }
            };
            oA.aC aCVar = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), c2009o.getReturnType(), new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), c2.getReturnType(), c2), c2009o);
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SceneElement.class);
            KType type = aCVar.nr().getArguments().get(0).getType();
            Intrinsics.checkNotNull(type);
            oA.w6 w6Var = new oA.w6(orCreateKotlinClass, type, aCVar, i2);
            qz qzVar = new PropertyReference1Impl() { // from class: f0P.Wqz.qz
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public Object get(Object obj) {
                    return ((KeyableCubicBSpline) obj).getKnots();
                }
            };
            return (SceneElement) new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), qzVar.getReturnType(), w6Var, qzVar).t(el, new Function1() { // from class: f0P.r4t
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Wqz.o9(sceneSelection, f3, (List) obj);
                }
            });
        }
        Pl pl = new PropertyReference1Impl() { // from class: f0P.Wqz.Pl
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((SceneElement) obj).getOutline();
            }
        };
        Xo xo = new PropertyReference1Impl() { // from class: f0P.Wqz.Xo
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((KeyableCompoundCubicBSpline) obj).getContours();
            }
        };
        oA.aC aCVar2 = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), xo.getReturnType(), new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), pl.getReturnType(), pl), xo);
        KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(SceneElement.class);
        KType type2 = aCVar2.nr().getArguments().get(0).getType();
        Intrinsics.checkNotNull(type2);
        oA.w6 w6Var2 = new oA.w6(orCreateKotlinClass2, type2, aCVar2, i2);
        eO eOVar = new PropertyReference1Impl() { // from class: f0P.Wqz.eO
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((KeyableCubicBSpline) obj).getKnots();
            }
        };
        oA.aC aCVar3 = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), eOVar.getReturnType(), w6Var2, eOVar);
        int iIntValue = sceneSelection.getSelectedPoint().intValue();
        KClass orCreateKotlinClass3 = Reflection.getOrCreateKotlinClass(SceneElement.class);
        KType type3 = aCVar3.nr().getArguments().get(0).getType();
        Intrinsics.checkNotNull(type3);
        return (SceneElement) new oA.w6(orCreateKotlinClass3, type3, aCVar3, iIntValue).t(el, new Function1() { // from class: f0P.Xq
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Wqz.n7b(sceneSelection, f3, (KeyableCBKnot) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KeyableCBKnot wKY(SceneSelection sceneSelection, Scene scene, SceneElement sceneElement, Wqz wqz, KeyableCBKnot it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ControlHandle selectedHandle = sceneSelection.getSelectedHandle();
        int i2 = selectedHandle == null ? -1 : Ml.$EnumSwitchMapping$0[selectedHandle.ordinal()];
        if (i2 == 1) {
            Keyable keyableCopyAddingNewKeyframe = KeyableKt.copyAddingNewKeyframe(it.getP(), scene, sceneElement, SceneElementKt.fractionalTime(sceneElement, HW.C.WPU(wqz)));
            Intrinsics.checkNotNull(keyableCopyAddingNewKeyframe, "null cannot be cast to non-null type com.alightcreative.app.motion.scene.KeyableVector2D");
            return KeyableCBKnot.copy$default(it, (KeyableVector2D) keyableCopyAddingNewKeyframe, null, null, 6, null);
        }
        if (i2 != 2 && i2 != 3) {
            if (i2 == 4) {
                return it;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (it.getCurveIn() instanceof KeyableVector2D) {
            OptionalKeyableVector2D curveIn = it.getCurveIn();
            Intrinsics.checkNotNull(curveIn, "null cannot be cast to non-null type com.alightcreative.app.motion.scene.KeyableVector2D");
            Keyable keyableCopyAddingNewKeyframe2 = KeyableKt.copyAddingNewKeyframe((KeyableVector2D) curveIn, scene, sceneElement, SceneElementKt.fractionalTime(sceneElement, HW.C.WPU(wqz)));
            Intrinsics.checkNotNull(keyableCopyAddingNewKeyframe2, "null cannot be cast to non-null type com.alightcreative.app.motion.scene.KeyableVector2D");
            it = KeyableCBKnot.copy$default(it, null, (KeyableVector2D) keyableCopyAddingNewKeyframe2, null, 5, null);
        }
        KeyableCBKnot keyableCBKnot = it;
        if (!(keyableCBKnot.getCurveOut() instanceof KeyableVector2D)) {
            return keyableCBKnot;
        }
        OptionalKeyableVector2D curveOut = keyableCBKnot.getCurveOut();
        Intrinsics.checkNotNull(curveOut, "null cannot be cast to non-null type com.alightcreative.app.motion.scene.KeyableVector2D");
        Keyable keyableCopyAddingNewKeyframe3 = KeyableKt.copyAddingNewKeyframe((KeyableVector2D) curveOut, scene, sceneElement, SceneElementKt.fractionalTime(sceneElement, HW.C.WPU(wqz)));
        Intrinsics.checkNotNull(keyableCopyAddingNewKeyframe3, "null cannot be cast to non-null type com.alightcreative.app.motion.scene.KeyableVector2D");
        return KeyableCBKnot.copy$default(keyableCBKnot, null, null, (KeyableVector2D) keyableCopyAddingNewKeyframe3, 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement wKp(oA.j jVar, Scene scene, SceneElement el) {
        Intrinsics.checkNotNullParameter(scene, "<unused var>");
        Intrinsics.checkNotNullParameter(el, "el");
        C2012z c2012z = new PropertyReference1Impl() { // from class: f0P.Wqz.z
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((KeyableCBKnot) obj).getCurveIn();
            }
        };
        return (SceneElement) new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), c2012z.getReturnType(), jVar, c2012z).rl(el, OptionalKeyableVector2D.NONE.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionalKeyableVector2D wYi(Scene scene, SceneElement sceneElement, float f3, final Vector2D vector2D, OptionalKeyableVector2D it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return KeyableKt.copyWithComputedOptionalValueForTime(it, scene, sceneElement, f3, new Function1() { // from class: f0P.GC
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Wqz.TVk(vector2D, (Vector2D) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement xzo(oA.j jVar, oA.j jVar2, Scene scene, SceneElement el) {
        Intrinsics.checkNotNullParameter(scene, "<unused var>");
        Intrinsics.checkNotNullParameter(el, "el");
        C2007c c2007c = new PropertyReference1Impl() { // from class: f0P.Wqz.c
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((KeyableCBKnot) obj).getCurveOut();
            }
        };
        oA.aC aCVar = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), c2007c.getReturnType(), jVar, c2007c);
        OptionalKeyableVector2D.NONE none = OptionalKeyableVector2D.NONE.INSTANCE;
        SceneElement sceneElement = (SceneElement) aCVar.rl(el, none);
        l3D l3d = new PropertyReference1Impl() { // from class: f0P.Wqz.l3D
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((KeyableCBKnot) obj).getCurveIn();
            }
        };
        return (SceneElement) new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), l3d.getReturnType(), jVar2, l3d).rl(sceneElement, none);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Vector2D yA(Vector2D vector2D, Vector2D kf) {
        Intrinsics.checkNotNullParameter(kf, "kf");
        return GeometryKt.minus(kf, vector2D);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final KeyableCBKnot yAc(SceneSelection sceneSelection, SceneElement sceneElement, Scene scene, Wqz wqz, KeyableCBKnot knot) {
        KeyableCBKnot keyableCBKnot;
        Object next;
        Intrinsics.checkNotNullParameter(knot, "knot");
        ControlHandle selectedHandle = sceneSelection.getSelectedHandle();
        int i2 = selectedHandle == null ? -1 : Ml.$EnumSwitchMapping$0[selectedHandle.ordinal()];
        Object obj = null;
        if (i2 == 1) {
            if (!knot.getP().getKeyed()) {
                return knot;
            }
            Iterator<T> it = knot.getP().getKeyframes().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next2 = it.next();
                if (TimeKt.frameNumberFromTime((int) (((double) sceneElement.getStartTime()) + ((double) (((Keyframe) next2).getTime() * (sceneElement.getEndTime() - sceneElement.getStartTime())))), scene.getFramesPerHundredSeconds()) == HW.C.ck(wqz)) {
                    obj = next2;
                    break;
                }
            }
            Keyframe keyframe = (Keyframe) obj;
            if (keyframe == null) {
                return knot;
            }
            Keyable keyableCopyRemovingKeyframe = KeyableKt.copyRemovingKeyframe(knot.getP(), scene, sceneElement, keyframe.getTime());
            Intrinsics.checkNotNull(keyableCopyRemovingKeyframe, "null cannot be cast to non-null type com.alightcreative.app.motion.scene.KeyableVector2D");
            KeyableCBKnot keyableCBKnotCopy$default = KeyableCBKnot.copy$default(knot, (KeyableVector2D) keyableCopyRemovingKeyframe, null, null, 6, null);
            return keyableCBKnotCopy$default != null ? keyableCBKnotCopy$default : knot;
        }
        if (i2 != 2 && i2 != 3) {
            if (i2 == 4) {
                return knot;
            }
            throw new NoWhenBranchMatchedException();
        }
        if ((knot.getCurveIn() instanceof KeyableVector2D) && ((KeyableVector2D) knot.getCurveIn()).getKeyed()) {
            Iterator<T> it2 = ((KeyableVector2D) knot.getCurveIn()).getKeyframes().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (TimeKt.frameNumberFromTime((int) (((double) sceneElement.getStartTime()) + ((double) (((Keyframe) next).getTime() * (sceneElement.getEndTime() - sceneElement.getStartTime())))), scene.getFramesPerHundredSeconds()) == HW.C.ck(wqz)) {
                    break;
                }
            }
            Keyframe keyframe2 = (Keyframe) next;
            if (keyframe2 != null) {
                Keyable keyableCopyRemovingKeyframe2 = KeyableKt.copyRemovingKeyframe((Keyable) knot.getCurveIn(), scene, sceneElement, keyframe2.getTime());
                Intrinsics.checkNotNull(keyableCopyRemovingKeyframe2, "null cannot be cast to non-null type com.alightcreative.app.motion.scene.KeyableVector2D");
                keyableCBKnot = knot;
                KeyableCBKnot keyableCBKnotCopy$default2 = KeyableCBKnot.copy$default(keyableCBKnot, null, (KeyableVector2D) keyableCopyRemovingKeyframe2, null, 5, null);
                if (keyableCBKnotCopy$default2 != null) {
                    keyableCBKnot = keyableCBKnotCopy$default2;
                }
            }
        } else {
            keyableCBKnot = knot;
        }
        if ((keyableCBKnot.getCurveOut() instanceof KeyableVector2D) && ((KeyableVector2D) keyableCBKnot.getCurveOut()).getKeyed()) {
            Iterator<T> it3 = ((KeyableVector2D) keyableCBKnot.getCurveOut()).getKeyframes().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Object next3 = it3.next();
                if (TimeKt.frameNumberFromTime((int) (((double) sceneElement.getStartTime()) + ((double) (((Keyframe) next3).getTime() * (sceneElement.getEndTime() - sceneElement.getStartTime())))), scene.getFramesPerHundredSeconds()) == HW.C.ck(wqz)) {
                    obj = next3;
                    break;
                }
            }
            Keyframe keyframe3 = (Keyframe) obj;
            if (keyframe3 != null) {
                Keyable keyableCopyRemovingKeyframe3 = KeyableKt.copyRemovingKeyframe((Keyable) keyableCBKnot.getCurveOut(), scene, sceneElement, keyframe3.getTime());
                Intrinsics.checkNotNull(keyableCopyRemovingKeyframe3, "null cannot be cast to non-null type com.alightcreative.app.motion.scene.KeyableVector2D");
                KeyableCBKnot keyableCBKnotCopy$default3 = KeyableCBKnot.copy$default(keyableCBKnot, null, null, (KeyableVector2D) keyableCopyRemovingKeyframe3, 3, null);
                if (keyableCBKnotCopy$default3 != null) {
                    return keyableCBKnotCopy$default3;
                }
            }
        }
        return keyableCBKnot;
    }

    public final kgE.fuX Fp() {
        kgE.fuX fux = this.iapManager;
        if (fux != null) {
            return fux;
        }
        Intrinsics.throwUninitializedPropertyAccessException("iapManager");
        return null;
    }

    public final xAo.I28 LPV() {
        xAo.I28 i28 = this.crisperManager;
        if (i28 != null) {
            return i28;
        }
        Intrinsics.throwUninitializedPropertyAccessException("crisperManager");
        return null;
    }

    public final void WH() {
        SceneElement sceneElementNHg;
        SceneHolder sceneHolderE = HW.C.e(this);
        if (sceneHolderE == null || (sceneElementNHg = HW.C.nHg(this)) == null) {
            return;
        }
        Integer selectedContour = sceneHolderE.getSelection().getSelectedContour();
        int iIntValue = selectedContour != null ? selectedContour.intValue() : 0;
        int size = sceneElementNHg.getOutline().getContours().size();
        KeyableCompoundCubicBSpline outline = sceneElementNHg.getOutline();
        int i2 = iIntValue + 1;
        if (i2 >= size) {
            KeyableCubicBSpline keyableCubicBSpline = (KeyableCubicBSpline) CollectionsKt.last((List) outline.getContours());
            if (!keyableCubicBSpline.getClosed() || !keyableCubicBSpline.getKnots().isEmpty()) {
                HW.C.D(this, new Function2() { // from class: f0P.y
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return Wqz.oz((Scene) obj, (SceneElement) obj2);
                    }
                });
                sceneHolderE.setSelection(SceneSelection.copy$default(sceneHolderE.getSelection(), null, null, Integer.valueOf(size), 0, SetsKt.emptySet(), null, ControlHandle.CURVE_OUT, null, false, null, Float.valueOf(0.3f), Vector2D.INSTANCE.getZERO(), 931, null));
            }
        } else {
            int iCoerceAtMost = RangesKt.coerceAtMost(i2, size - 1);
            if (sceneElementNHg.getOutline().getContours().get(iCoerceAtMost).getKnots().isEmpty()) {
                sceneHolderE.setSelection(SceneSelection.copy$default(sceneHolderE.getSelection(), null, null, Integer.valueOf(iCoerceAtMost), 0, SetsKt.emptySet(), null, ControlHandle.CURVE_OUT, null, false, null, Float.valueOf(0.3f), Vector2D.INSTANCE.getZERO(), 931, null));
            } else {
                sceneHolderE.setSelection(SceneSelection.copy$default(sceneHolderE.getSelection(), null, null, Integer.valueOf(iCoerceAtMost), 0, SetsKt.emptySet(), null, ControlHandle.MAIN, null, false, null, null, null, 4003, null));
            }
        }
        Bha();
        ENe();
        kR(sceneElementNHg, sceneHolderE.getSelection());
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0354  */
    @Override // yc.Buf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean n(final yc.a motionEvent) {
        final SceneHolder sceneHolderE;
        Integer selectedContour;
        Integer selectedPoint;
        KeyableCompoundCubicBSpline keyableCompoundCubicBSplineCopy;
        SceneHolder sceneHolderE2;
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        SceneElement sceneElementNHg = HW.C.nHg(this);
        if (sceneElementNHg == null || (sceneHolderE = HW.C.e(this)) == null) {
            return false;
        }
        Vector2D vector2DRl = motionEvent.rl();
        float x2 = vector2DRl.getX();
        float y2 = vector2DRl.getY();
        int actionMasked = motionEvent.n().getActionMasked();
        if (actionMasked == 0) {
            this.dragStartX = x2;
            this.dragStartY = y2;
            this.dragStartRawX = motionEvent.n().getRawX();
            this.dragStartRawY = motionEvent.n().getRawY();
            this.touchMode = w6.f65064O;
            this.recognizedDrag = false;
            n nVarNP = NP(this, x2, y2, 0, false, 12, null);
            final int iN = nVarNP.n();
            final float fRl = nVarNP.rl();
            final ControlHandle controlHandleT = nVarNP.t();
            final float fNY = HW.C.nY(this) * 25.0f;
            XoT.C.Uo(this, new Function0() { // from class: f0P.Y
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Wqz.x(motionEvent, iN, fRl, controlHandleT, fNY, this);
                }
            });
            if (iN < 0 || fRl > fNY) {
                int iI9f = I9f(x2, y2);
                if (iI9f >= 0 && iI9f < sceneElementNHg.getOutline().getContours().size() && ((selectedContour = sceneHolderE.getSelection().getSelectedContour()) == null || iI9f != selectedContour.intValue())) {
                    n nVarNP2 = NP(this, x2, y2, iI9f, false, 8, null);
                    sceneHolderE.setSelection(SceneSelection.copy$default(sceneHolderE.getSelection(), null, null, Integer.valueOf(iI9f), Integer.valueOf(nVarNP2.n()), SetsKt.emptySet(), null, nVarNP2.t(), null, false, null, null, null, 4003, null));
                }
            } else if (!sceneHolderE.getSelection().getMultiSelectPoints().isEmpty() && sceneHolderE.getSelection().getMultiSelectPoints().contains(Integer.valueOf(iN))) {
                this.touchMode = w6.f65065n;
                sceneHolderE.setSelection(SceneSelection.copy$default(sceneHolderE.getSelection(), null, null, null, Integer.valueOf(iN), null, null, null, null, false, null, null, null, 4087, null));
            } else if (sceneHolderE.getSelection().getMultiSelectPoints().isEmpty() && (selectedPoint = sceneHolderE.getSelection().getSelectedPoint()) != null && selectedPoint.intValue() == iN && sceneHolderE.getSelection().getSelectedHandle() == controlHandleT) {
                this.touchMode = w6.f65065n;
            } else {
                sceneHolderE.setSelection(SceneSelection.copy$default(sceneHolderE.getSelection(), null, null, null, Integer.valueOf(iN), SetsKt.emptySet(), null, controlHandleT, null, false, null, null, null, 4007, null));
                hu();
                j().f9242r.setMultiselectMode(false);
                j().f9242r.Z(iN, controlHandleT, 0.5f, false);
            }
        } else if (actionMasked == 1) {
            SceneHolder sceneHolderE3 = HW.C.e(this);
            if (sceneHolderE3 != null) {
                sceneHolderE3.setEditMode(2131362623);
                Unit unit = Unit.INSTANCE;
            }
            w6 w6Var = this.touchMode;
            if (w6Var == w6.f65067t) {
                if (sceneHolderE.getSelection().getMultiSelectPoints().size() == 1) {
                    int iIntValue = ((Number) CollectionsKt.first(sceneHolderE.getSelection().getMultiSelectPoints())).intValue();
                    j().f9242r.setMultiselectMode(false);
                    sceneHolderE.setSelection(SceneSelection.copy$default(sceneHolderE.getSelection(), null, null, null, null, SetsKt.emptySet(), null, null, null, false, null, null, null, 4047, null));
                    j().f9242r.Z(iIntValue, ControlHandle.MAIN, 0.5f, false);
                } else if (sceneHolderE.getSelection().getMultiSelectPoints().isEmpty()) {
                    j().f9242r.setMultiselectMode(false);
                    sceneHolderE.setSelection(SceneSelection.copy$default(sceneHolderE.getSelection(), null, null, null, null, null, null, null, null, false, null, null, null, 4063, null));
                } else {
                    rxp().n(new j.fuX("edit_points_lasso", null, 2, null));
                    OutlineScrollerView outlineScrollerView = j().f9242r;
                    Object objMinOrNull = CollectionsKt.minOrNull((Iterable<? extends Object>) sceneHolderE.getSelection().getMultiSelectPoints());
                    Intrinsics.checkNotNull(objMinOrNull);
                    outlineScrollerView.Z(((Number) objMinOrNull).intValue(), ControlHandle.MAIN, 0.5f, false);
                    sceneHolderE.setSelection(SceneSelection.copy$default(sceneHolderE.getSelection(), null, null, null, null, null, null, null, null, false, null, null, null, 4063, null));
                }
            } else if (w6Var == w6.f65065n && !sceneHolderE.getSelection().getMultiSelectPoints().isEmpty() && !this.recognizedDrag) {
                sceneHolderE.setSelection(SceneSelection.copy$default(sceneHolderE.getSelection(), null, null, null, null, SetsKt.emptySet(), null, null, null, false, null, null, null, 4079, null));
            }
            Ml.j jVar = this.undoBatch;
            if (jVar != null) {
                jVar.n();
                Unit unit2 = Unit.INSTANCE;
            }
            this.undoBatch = null;
            this.touchMode = w6.f65064O;
        } else if (actionMasked == 2) {
            w6 w6Var2 = this.touchMode;
            if (w6Var2 == w6.f65065n) {
                if (this.recognizedDrag) {
                    float f3 = x2 - this.dragStartX;
                    float f4 = y2 - this.dragStartY;
                    this.dragStartX = x2;
                    this.dragStartY = y2;
                    Integer selectedPoint2 = (Integer) CollectionsKt.minOrNull((Iterable) sceneHolderE.getSelection().getMultiSelectPoints());
                    if (selectedPoint2 == null && (selectedPoint2 = sceneHolderE.getSelection().getSelectedPoint()) == null) {
                        return false;
                    }
                    final int iIntValue2 = selectedPoint2.intValue();
                    ControlHandle selectedHandle = !sceneHolderE.getSelection().getMultiSelectPoints().isEmpty() ? ControlHandle.MAIN : sceneHolderE.getSelection().getSelectedHandle();
                    if (selectedHandle == null) {
                        return false;
                    }
                    final float fFractionalTime = SceneElementKt.fractionalTime(sceneElementNHg, HW.C.WPU(this));
                    Transform transformValueAtTime = sceneElementNHg.getTransform().valueAtTime(fFractionalTime);
                    final Vector2D vector2DTimes = GeometryKt.times(GeometryKt.rot(new Vector2D(f3, f4), -transformValueAtTime.getRotation()), GeometryKt.recip(transformValueAtTime.getScale()));
                    Integer selectedContour2 = sceneHolderE.getSelection().getSelectedContour();
                    iIntValue = selectedContour2 != null ? selectedContour2.intValue() : 0;
                    Vector2D pendingAddPoint = sceneHolderE.getSelection().getPendingAddPoint();
                    if (!Intrinsics.areEqual(vector2DTimes, Vector2D.INSTANCE.getZERO())) {
                        int i2 = Ml.$EnumSwitchMapping$0[selectedHandle.ordinal()];
                        if (i2 == 1) {
                            final int i3 = iIntValue;
                            HW.C.D(this, new Function2() { // from class: f0P.d
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return Wqz.XUb(sceneHolderE, i3, iIntValue2, fFractionalTime, vector2DTimes, (Scene) obj, (SceneElement) obj2);
                                }
                            });
                            Unit unit3 = Unit.INSTANCE;
                        } else if (i2 == 2) {
                            if (this.lockHandleAngle) {
                                HW.C.D(this, new Function2() { // from class: f0P.FdJ
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return Wqz.HFS(iIntValue, iIntValue2, fFractionalTime, vector2DTimes, (Scene) obj, (SceneElement) obj2);
                                    }
                                });
                            } else {
                                HW.C.D(this, new Function2() { // from class: f0P.EB1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return Wqz.C7B(iIntValue, iIntValue2, fFractionalTime, vector2DTimes, (Scene) obj, (SceneElement) obj2);
                                    }
                                });
                            }
                            Unit unit4 = Unit.INSTANCE;
                        } else if (i2 == 3) {
                            if (this.lockHandleAngle) {
                                HW.C.D(this, new Function2() { // from class: f0P.S0R
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return Wqz.lRt(iIntValue, iIntValue2, fFractionalTime, vector2DTimes, (Scene) obj, (SceneElement) obj2);
                                    }
                                });
                            } else {
                                HW.C.D(this, new Function2() { // from class: f0P.dip
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return Wqz.YiW(iIntValue, iIntValue2, fFractionalTime, vector2DTimes, (Scene) obj, (SceneElement) obj2);
                                    }
                                });
                            }
                            Unit unit5 = Unit.INSTANCE;
                        } else {
                            if (i2 != 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                            if (pendingAddPoint != null) {
                                sceneHolderE.setSelection(SceneSelection.copy$default(sceneHolderE.getSelection(), null, null, null, null, null, null, null, null, false, null, null, GeometryKt.plus(pendingAddPoint, vector2DTimes), 2047, null));
                            }
                            Unit unit6 = Unit.INSTANCE;
                        }
                    }
                } else {
                    float rawX = this.dragStartRawX - motionEvent.n().getRawX();
                    float rawY = this.dragStartRawY - motionEvent.n().getRawY();
                    if (Math.abs(rawX) > Ro() || Math.abs(rawY) > Ro()) {
                        this.recognizedDrag = true;
                        if (sceneHolderE.getSelection().getPendingAddPoint() == null && (sceneHolderE2 = HW.C.e(this)) != null) {
                            sceneHolderE2.setEditMode(2131362616);
                            Unit unit7 = Unit.INSTANCE;
                        }
                        this.undoBatch = HW.C.xMQ(this);
                        this.dragStartX = x2;
                        this.dragStartY = y2;
                        Integer selectedPoint3 = sceneHolderE.getSelection().getSelectedPoint();
                        if (selectedPoint3 == null) {
                            return false;
                        }
                        int iIntValue3 = selectedPoint3.intValue();
                        Integer selectedContour3 = sceneHolderE.getSelection().getSelectedContour();
                        int iIntValue4 = selectedContour3 != null ? selectedContour3.intValue() : 0;
                        int size = sceneElementNHg.getOutline().getContours().get(iIntValue4).getKnots().size();
                        if (((size < 1 ? 0 : (iIntValue3 + size) % size) == size - 1 || size < 1) && sceneHolderE.getSelection().getSelectedHandle() == ControlHandle.CURVE_OUT && !sceneElementNHg.getOutline().getContours().get(iIntValue4).getClosed()) {
                            iIntValue = 1;
                        }
                        if (sceneHolderE.getSelection().getSelectedHandle() == ControlHandle.CURVE_OUT) {
                            if (iIntValue != 0) {
                                Float curvePos = sceneHolderE.getSelection().getCurvePos();
                                if ((curvePos != null ? curvePos.floatValue() : 0.0f) < 0.5f) {
                                    KeyableCompoundCubicBSpline outline = sceneElementNHg.getOutline();
                                    List<KeyableCubicBSpline> contours = outline.getContours();
                                    KeyableCubicBSpline keyableCubicBSpline = outline.getContours().get(iIntValue4);
                                    List<KeyableCBKnot> knots = keyableCubicBSpline.getKnots();
                                    Vector2D pendingAddPoint2 = sceneHolderE.getSelection().getPendingAddPoint();
                                    Intrinsics.checkNotNull(pendingAddPoint2);
                                    keyableCompoundCubicBSplineCopy = outline.copy(HI0.rv6.t(contours, iIntValue4, KeyableCubicBSpline.copy$default(keyableCubicBSpline, CollectionsKt.plus((Collection<? extends KeyableCBKnot>) knots, CubicBSplineKt.keyable(new CBKnot(pendingAddPoint2, null, null, 6, null))), false, false, 6, null)));
                                } else {
                                    KeyableCompoundCubicBSpline outline2 = sceneElementNHg.getOutline();
                                    List<KeyableCubicBSpline> contours2 = outline2.getContours();
                                    KeyableCubicBSpline keyableCubicBSpline2 = outline2.getContours().get(iIntValue4);
                                    Vector2D pendingAddPoint3 = sceneHolderE.getSelection().getPendingAddPoint();
                                    Intrinsics.checkNotNull(pendingAddPoint3);
                                    keyableCompoundCubicBSplineCopy = outline2.copy(HI0.rv6.t(contours2, iIntValue4, KeyableCubicBSpline.copy$default(keyableCubicBSpline2, CollectionsKt.plus((Collection) CollectionsKt.listOf(CubicBSplineKt.keyable(new CBKnot(pendingAddPoint3, null, null, 6, null))), (Iterable) keyableCubicBSpline2.getKnots()), false, false, 6, null)));
                                }
                                this.pendingAddPointSpline = keyableCompoundCubicBSplineCopy;
                            } else {
                                y();
                            }
                        }
                    }
                }
            } else if (w6Var2 == w6.f65064O && !this.recognizedDrag) {
                List<KeyableCubicBSpline> contours3 = sceneElementNHg.getOutline().getContours();
                Integer selectedContour4 = sceneHolderE.getSelection().getSelectedContour();
                if (!contours3.get(selectedContour4 != null ? selectedContour4.intValue() : 0).getKnots().isEmpty()) {
                    float rawX2 = this.dragStartRawX - motionEvent.n().getRawX();
                    float rawY2 = this.dragStartRawY - motionEvent.n().getRawY();
                    if (Math.abs(rawX2) > Ro() || Math.abs(rawY2) > Ro()) {
                        this.recognizedDrag = true;
                        this.touchMode = w6.f65067t;
                        C1487z c1487z = new C1487z();
                        this.lasso = c1487z;
                        c1487z.Y(x2, y2);
                    }
                    j().f9242r.setMultiselectMode(true);
                }
            } else if (this.touchMode == w6.f65067t) {
                this.lasso.J(x2, y2);
                final LinkedHashSet linkedHashSet = new LinkedHashSet();
                Region region = new Region();
                region.setPath(this.lasso.t(), new Region(0, 0, sceneHolderE.getScene().getWidth(), sceneHolderE.getScene().getHeight()));
                float fAYN = HW.C.aYN(this);
                Integer selectedContour5 = sceneHolderE.getSelection().getSelectedContour();
                int iIntValue5 = selectedContour5 != null ? selectedContour5.intValue() : 0;
                Matrix matrix = sceneElementNHg.getTransform().valueAtTime(fAYN).getMatrix();
                for (Object obj : sceneElementNHg.getOutline().getContours().get(iIntValue5).getKnots()) {
                    int i5 = iIntValue + 1;
                    if (iIntValue < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    Vector2D vector2DTimes2 = GeometryKt.times((Vector2D) KeyableKt.valueAtTime(((KeyableCBKnot) obj).getP(), fAYN), matrix);
                    if (region.contains((int) vector2DTimes2.getX(), (int) vector2DTimes2.getY())) {
                        linkedHashSet.add(Integer.valueOf(iIntValue));
                    }
                    iIntValue = i5;
                }
                XoT.C.Uo(this, new Function0() { // from class: f0P.ou
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Wqz.kQ(linkedHashSet);
                    }
                });
                if (Intrinsics.areEqual(sceneHolderE.getSelection().getMultiSelectPoints(), linkedHashSet)) {
                    sceneHolderE.setSelection(SceneSelection.copy$default(sceneHolderE.getSelection(), null, null, null, null, null, this.lasso.C(), ControlHandle.MAIN, null, false, null, null, null, 3999, null));
                } else {
                    sceneHolderE.setSelection(SceneSelection.copy$default(sceneHolderE.getSelection(), null, null, null, (Integer) CollectionsKt.minOrNull((Iterable) linkedHashSet), linkedHashSet, this.lasso.C(), ControlHandle.MAIN, null, false, null, null, null, 3975, null));
                }
            }
        }
        return true;
    }

    @Override // f0P.t5, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        rxp().n(new j.fuX("edit_points", null, 2, null));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this._binding = SJ0.N.t(inflater, container, false);
        ConstraintLayout root = j().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        SceneHolder sceneHolderE;
        KeyableCompoundCubicBSpline outline;
        List<KeyableCubicBSpline> contours;
        List<KeyableCBKnot> knots;
        SceneSelection selection;
        Integer selectedContour;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        j().f9243t.setOnClickListener(new View.OnClickListener() { // from class: f0P.kJ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Wqz.jX(this.f65730n, view2);
            }
        });
        View movePointTrackpad = j().HI;
        Intrinsics.checkNotNullExpressionValue(movePointTrackpad, "movePointTrackpad");
        HI0.o7q.gh(movePointTrackpad);
        SceneHolder sceneHolderE2 = HW.C.e(this);
        int size = 0;
        if (sceneHolderE2 != null) {
            sceneHolderE2.setSelection(SceneSelection.copy$default(sceneHolderE2.getSelection(), null, null, 0, 0, SetsKt.emptySet(), null, ControlHandle.MAIN, null, false, null, null, null, 4003, null));
        }
        j().nr.setOnClickListener(new View.OnClickListener() { // from class: f0P.fmn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Wqz.iu(this.f65564n, view2);
            }
        });
        j().f9238O.setOnClickListener(new View.OnClickListener() { // from class: f0P.Q6T
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Wqz.Qg8(this.f64620n, view2);
            }
        });
        final Ref.FloatRef floatRef = new Ref.FloatRef();
        final Ref.FloatRef floatRef2 = new Ref.FloatRef();
        j().HI.setOnTouchListener(new View.OnTouchListener() { // from class: f0P.z2
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return Wqz.UR(this.f66389n, floatRef, floatRef2, view2, motionEvent);
            }
        });
        j().f9242r.setSelectionChangeListener(new Function1() { // from class: f0P.E
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Wqz.W5k(this.f64159n, (OutlineScrollerView.n) obj);
            }
        });
        j().Ik.setOnClickListener(new View.OnClickListener() { // from class: f0P.mf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Wqz.NC9(this.f65786n, view2);
            }
        });
        SceneElement sceneElementNHg = HW.C.nHg(this);
        if (sceneElementNHg != null && (outline = sceneElementNHg.getOutline()) != null && (contours = outline.getContours()) != null) {
            SceneHolder sceneHolderE3 = HW.C.e(this);
            KeyableCubicBSpline keyableCubicBSpline = contours.get((sceneHolderE3 == null || (selection = sceneHolderE3.getSelection()) == null || (selectedContour = selection.getSelectedContour()) == null) ? 0 : selectedContour.intValue());
            if (keyableCubicBSpline != null && (knots = keyableCubicBSpline.getKnots()) != null) {
                size = knots.size();
            }
        }
        if (size < 1 && (sceneHolderE = HW.C.e(this)) != null) {
            sceneHolderE.setSelection(SceneSelection.copy$default(sceneHolderE.getSelection(), null, null, null, 0, SetsKt.emptySet(), null, ControlHandle.CURVE_OUT, null, false, null, Float.valueOf(0.3f), Vector2D.INSTANCE.getZERO(), 903, null));
        }
        view.post(new Runnable() { // from class: f0P.cv
            @Override // java.lang.Runnable
            public final void run() {
                Wqz.R3E(this.f65472n);
            }
        });
        ENe();
        j().ty.setOnClickListener(new View.OnClickListener() { // from class: f0P.kO
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Wqz.Yq(this.f65731n, view2);
            }
        });
        j().gh.setOnClickListener(new View.OnClickListener() { // from class: f0P.G
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Wqz.G(this.f64224n, view2);
            }
        });
        j().rl.setOnClickListener(new View.OnClickListener() { // from class: f0P.hzY
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Wqz.f11(this.f65627n, view2);
            }
        });
        j().rl.setOnLongClickListener(new View.OnLongClickListener() { // from class: f0P.X
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                return Wqz.cAB(this.f65077n, view2);
            }
        });
    }

    public final QmE.iF rxp() {
        QmE.iF iFVar = this.eventLogger;
        if (iFVar != null) {
            return iFVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    private final void Aum() {
        SceneElement sceneElementNHg;
        final int iIntValue;
        SceneHolder sceneHolderE = HW.C.e(this);
        if (sceneHolderE != null && (sceneElementNHg = HW.C.nHg(this)) != null) {
            Integer selectedContour = sceneHolderE.getSelection().getSelectedContour();
            if (selectedContour != null) {
                iIntValue = selectedContour.intValue();
            } else {
                iIntValue = 0;
            }
            if (sceneElementNHg.getOutline().getContours().size() > 1) {
                w();
                HW.C.D(this, new Function2() { // from class: f0P.nBa
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return Wqz.s(iIntValue, (Scene) obj, (SceneElement) obj2);
                    }
                });
            }
        }
    }

    private final n D76(float x2, float y2, int overrideContour, boolean mainHandlesOnly) {
        int iIntValue;
        SceneElement sceneElementNHg = HW.C.nHg(this);
        if (sceneElementNHg == null) {
            return f64954Y;
        }
        SceneHolder sceneHolderE = HW.C.e(this);
        if (sceneHolderE == null) {
            return f64954Y;
        }
        int i2 = 0;
        if (overrideContour >= 0) {
            iIntValue = overrideContour;
        } else {
            Integer selectedContour = sceneHolderE.getSelection().getSelectedContour();
            if (selectedContour != null) {
                iIntValue = selectedContour.intValue();
            } else {
                iIntValue = 0;
            }
        }
        float fFractionalTime = SceneElementKt.fractionalTime(sceneElementNHg, HW.C.WPU(this));
        Transform transformValueAtTime = sceneElementNHg.getTransform().valueAtTime(fFractionalTime);
        ControlHandle controlHandle = ControlHandle.MAIN;
        Integer selectedPoint = sceneHolderE.getSelection().getSelectedPoint();
        float f3 = -1.0f;
        int iIntValue2 = -1;
        for (Object obj : sceneElementNHg.getOutline().getContours().get(iIntValue).getKnots()) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Vector2D vector2DTimes = GeometryKt.times((Vector2D) KeyableKt.valueAtTime(((KeyableCBKnot) obj).getP(), fFractionalTime), transformValueAtTime.getMatrix());
            float x3 = vector2DTimes.getX() - x2;
            float y3 = vector2DTimes.getY() - y2;
            float f4 = (x3 * x3) + (y3 * y3);
            if (iIntValue2 == -1 || f4 < f3) {
                iIntValue2 = i2;
                f3 = f4;
            }
            i2 = i3;
        }
        if (!mainHandlesOnly && !sceneElementNHg.getOutline().getContours().get(iIntValue).getKnots().isEmpty() && sceneHolderE.getSelection().getSelectedHandle() != ControlHandle.CURVE_OUT && selectedPoint != null && selectedPoint.intValue() >= 0 && selectedPoint.intValue() < sceneElementNHg.getOutline().getContours().get(iIntValue).getKnots().size() && sceneHolderE.getSelection().getMultiSelectPoints().isEmpty()) {
            Vector2D vector2D = (Vector2D) KeyableKt.valueAtTime(sceneElementNHg.getOutline().getContours().get(iIntValue).getKnots().get(selectedPoint.intValue()).getP(), fFractionalTime);
            Object curveIn = sceneElementNHg.getOutline().getContours().get(iIntValue).getKnots().get(selectedPoint.intValue()).getCurveIn();
            Object curveOut = sceneElementNHg.getOutline().getContours().get(iIntValue).getKnots().get(selectedPoint.intValue()).getCurveOut();
            if (curveIn instanceof KeyableVector2D) {
                Vector2D vector2DTimes2 = GeometryKt.times(GeometryKt.plus((Vector2D) KeyableKt.valueAtTime((Keyable) curveIn, fFractionalTime), vector2D), transformValueAtTime.getMatrix());
                float x4 = vector2DTimes2.getX() - x2;
                float y4 = vector2DTimes2.getY() - y2;
                float f5 = (x4 * x4) + (y4 * y4);
                if (iIntValue2 == -1 || f5 < f3) {
                    iIntValue2 = selectedPoint.intValue();
                    controlHandle = ControlHandle.IN;
                    f3 = f5;
                }
            }
            if (curveOut instanceof KeyableVector2D) {
                Vector2D vector2DTimes3 = GeometryKt.times(GeometryKt.plus((Vector2D) KeyableKt.valueAtTime((Keyable) curveOut, fFractionalTime), vector2D), transformValueAtTime.getMatrix());
                float x5 = vector2DTimes3.getX() - x2;
                float y5 = vector2DTimes3.getY() - y2;
                float f6 = (y5 * y5) + (x5 * x5);
                if (iIntValue2 == -1 || f6 < f3) {
                    iIntValue2 = selectedPoint.intValue();
                    controlHandle = ControlHandle.OUT;
                    f3 = f6;
                }
            }
        }
        return new n(iIntValue2, (float) Math.sqrt(f3), controlHandle);
    }

    private final void EF() {
        SceneElement sceneElementNHg;
        SceneHolder sceneHolderE = HW.C.e(this);
        if (sceneHolderE != null && (sceneElementNHg = HW.C.nHg(this)) != null) {
            int size = sceneElementNHg.getOutline().getContours().size();
            KeyableCubicBSpline keyableCubicBSpline = (KeyableCubicBSpline) CollectionsKt.last((List) sceneElementNHg.getOutline().getContours());
            if (keyableCubicBSpline.getClosed() && keyableCubicBSpline.getKnots().isEmpty()) {
                return;
            }
            HW.C.D(this, new Function2() { // from class: f0P.ua
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Wqz.uG((Scene) obj, (SceneElement) obj2);
                }
            });
            sceneHolderE.setSelection(SceneSelection.copy$default(sceneHolderE.getSelection(), null, null, Integer.valueOf(size), 0, SetsKt.emptySet(), null, ControlHandle.CURVE_OUT, null, false, null, Float.valueOf(0.3f), Vector2D.INSTANCE.getZERO(), 931, null));
        }
    }

    private final void EN() {
        final SceneSelection selection;
        final int iIntValue;
        Scene sceneIF;
        KeyableCompoundCubicBSpline outline;
        List<KeyableCubicBSpline> contours;
        KeyableCubicBSpline keyableCubicBSpline;
        List<KeyableCBKnot> knots;
        SceneHolder sceneHolderE = HW.C.e(this);
        if (sceneHolderE != null && (selection = sceneHolderE.getSelection()) != null && selection.getSelectedPoint() != null && selection.getSelectedHandle() != null) {
            Integer selectedContour = selection.getSelectedContour();
            int size = 0;
            if (selectedContour != null) {
                iIntValue = selectedContour.intValue();
            } else {
                iIntValue = 0;
            }
            SceneElement sceneElementNHg = HW.C.nHg(this);
            if (sceneElementNHg != null && (outline = sceneElementNHg.getOutline()) != null && (contours = outline.getContours()) != null && (keyableCubicBSpline = contours.get(iIntValue)) != null && (knots = keyableCubicBSpline.getKnots()) != null) {
                size = knots.size();
            }
            if (size >= 1 && (sceneIF = HW.C.iF(this)) != null) {
                final int framesPerHundredSeconds = sceneIF.getFramesPerHundredSeconds();
                if (this.activeKeyframeAtCurrentTime && !this.mixedActiveKeyframeAtCurrentTime) {
                    HW.C.D(this, new Function2() { // from class: f0P.A
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return Wqz.pS(selection, iIntValue, this, (Scene) obj, (SceneElement) obj2);
                        }
                    });
                } else {
                    LPV().r(xAo.Dsr.f75227n, new Function1() { // from class: f0P.Al
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Wqz.h(this.f64078n, selection, iIntValue, framesPerHundredSeconds, (ComponentActivity) obj);
                        }
                    });
                }
            }
        }
    }

    private final void ENe() {
        int i2;
        int i3;
        int i5;
        int i7;
        ImageButton imageButton = j().nr;
        int i8 = 0;
        if (!this.editKeyframeMode) {
            i2 = 0;
        } else {
            i2 = 4;
        }
        imageButton.setVisibility(i2);
        ImageButton imageButton2 = j().f9238O;
        if (!this.editKeyframeMode) {
            i3 = 0;
        } else {
            i3 = 4;
        }
        imageButton2.setVisibility(i3);
        ImageButton imageButton3 = j().Ik;
        if (!this.editKeyframeMode) {
            i5 = 0;
        } else {
            i5 = 4;
        }
        imageButton3.setVisibility(i5);
        j().ty.setVisibility(4);
        ImageButton imageButton4 = j().gh;
        if (this.editKeyframeMode) {
            i7 = 0;
        } else {
            i7 = 4;
        }
        imageButton4.setVisibility(i7);
        ImageButton imageButton5 = j().rl;
        if (!this.editKeyframeMode) {
            i8 = 4;
        }
        imageButton5.setVisibility(i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(Wqz wqz, View view) {
        wqz.I4p();
    }

    private final ImageButton H() {
        ImageButton openCloseOutlineButton = j().Ik;
        Intrinsics.checkNotNullExpressionValue(openCloseOutlineButton, "openCloseOutlineButton");
        return openCloseOutlineButton;
    }

    private final float H6M(TreeMap treeMap, float f3) {
        Map.Entry entryFloorEntry = treeMap.floorEntry(Float.valueOf(f3));
        if (entryFloorEntry != null) {
            Float f4 = (Float) entryFloorEntry.getKey();
            Float f5 = (Float) entryFloorEntry.getValue();
            Map.Entry entryCeilingEntry = treeMap.ceilingEntry(Float.valueOf(f3));
            if (entryCeilingEntry != null) {
                Float f6 = (Float) entryCeilingEntry.getKey();
                Float f7 = (Float) entryCeilingEntry.getValue();
                Intrinsics.checkNotNull(f4);
                float fFloatValue = (f3 - f4.floatValue()) / Math.max(1.0f, f6.floatValue() - f4.floatValue());
                float fFloatValue2 = f7.floatValue();
                Intrinsics.checkNotNull(f5);
                return (fFloatValue * (fFloatValue2 - f5.floatValue())) + f5.floatValue();
            }
        }
        return f3;
    }

    private final void I4p() {
        SceneHolder sceneHolderE;
        List listLNy;
        SceneElement sceneElementNHg = HW.C.nHg(this);
        if (sceneElementNHg != null && (sceneHolderE = HW.C.e(this)) != null && sceneHolderE.getSelection() != null && (listLNy = lNy()) != null) {
            if (!listLNy.isEmpty()) {
                Iterator it = listLNy.iterator();
                while (it.hasNext()) {
                    if (KeyableKt.getKeyframesIfKeyed((Keyable) ((oA.j) it.next()).get(sceneElementNHg)).size() < 2) {
                        HI0.fuX.Uo(this, 2132019750, 2132019749);
                        return;
                    }
                }
            }
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listLNy, 10));
            Iterator it2 = listLNy.iterator();
            while (it2.hasNext()) {
                List keyframesIfKeyed = KeyableKt.getKeyframesIfKeyed((Keyable) ((oA.j) it2.next()).get(sceneElementNHg));
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(keyframesIfKeyed, 10));
                Iterator it3 = keyframesIfKeyed.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(Float.valueOf(((Keyframe) it3.next()).getTime()));
                }
                arrayList.add(arrayList2);
            }
            List listDrop = CollectionsKt.drop(arrayList, 1);
            if (listDrop == null || !listDrop.isEmpty()) {
                Iterator it4 = listDrop.iterator();
                while (it4.hasNext()) {
                    if (!Intrinsics.areEqual((List) it4.next(), CollectionsKt.first((List) arrayList))) {
                        return;
                    }
                }
            }
            if (isAdded()) {
                getParentFragmentManager().o().rl(2131362650, P.Companion.rl(f0P.P.INSTANCE, listLNy, false, false, 6, null)).KN(null).mUb();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void NC9(final Wqz wqz, View view) {
        final SceneHolder sceneHolderE = HW.C.e(wqz);
        if (sceneHolderE == null) {
            return;
        }
        if (sceneHolderE.getSelection().getSelectedHandle() != ControlHandle.IN && sceneHolderE.getSelection().getSelectedHandle() != ControlHandle.OUT) {
            final int i2 = 14;
            final float f3 = 14 / 2.0f;
            Context context = wqz.j().Ik.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            kgE.fuX fuxFp = wqz.Fp();
            final int i3 = com.safedk.android.internal.d.f62986a;
            com.alightcreative.widget.Pl pl = new com.alightcreative.widget.Pl(context, fuxFp, new Function1() { // from class: f0P.KA
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Wqz.ex(this.f64417n, sceneHolderE, i3, i2, f3, (com.alightcreative.widget.eO) obj);
                }
            });
            ImageButton openCloseOutlineButton = wqz.j().Ik;
            Intrinsics.checkNotNullExpressionValue(openCloseOutlineButton, "openCloseOutlineButton");
            com.alightcreative.widget.Pl.Z(pl, openCloseOutlineButton, 0, 0, null, false, 30, null);
            return;
        }
        wqz.lockHandleAngle = !wqz.lockHandleAngle;
        wqz.XNZ();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Qg8(final Wqz wqz, View view) {
        SceneElement sceneElementNHg;
        int iIntValue;
        int iIntValue2;
        SceneHolder sceneHolderE = HW.C.e(wqz);
        if (sceneHolderE != null && (sceneElementNHg = HW.C.nHg(wqz)) != null) {
            Integer selectedContour = sceneHolderE.getSelection().getSelectedContour();
            if (selectedContour != null) {
                iIntValue = selectedContour.intValue();
            } else {
                iIntValue = 0;
            }
            if (!sceneElementNHg.getOutline().getContours().get(iIntValue).getKnots().isEmpty()) {
                ControlHandle selectedHandle = sceneHolderE.getSelection().getSelectedHandle();
                ControlHandle controlHandle = ControlHandle.IN;
                if (selectedHandle != controlHandle && sceneHolderE.getSelection().getSelectedHandle() != ControlHandle.OUT) {
                    Integer selectedPoint = sceneHolderE.getSelection().getSelectedPoint();
                    if (selectedPoint != null) {
                        iIntValue2 = selectedPoint.intValue();
                    } else {
                        iIntValue2 = 0;
                    }
                    ControlHandle selectedHandle2 = sceneHolderE.getSelection().getSelectedHandle();
                    if (selectedHandle2 == null) {
                        selectedHandle2 = controlHandle;
                    }
                    if (selectedHandle2 == ControlHandle.CURVE_OUT) {
                        return;
                    }
                    int size = (iIntValue2 + 1) % sceneElementNHg.getOutline().getContours().get(iIntValue).getKnots().size();
                    V1 v1 = new PropertyReference1Impl() { // from class: f0P.Wqz.V1
                        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                        public Object get(Object obj) {
                            return ((SceneElement) obj).getOutline();
                        }
                    };
                    oXP oxp = new PropertyReference1Impl() { // from class: f0P.Wqz.oXP
                        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                        public Object get(Object obj) {
                            return ((KeyableCompoundCubicBSpline) obj).getContours();
                        }
                    };
                    oA.aC aCVar = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), oxp.getReturnType(), new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), v1.getReturnType(), v1), oxp);
                    KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SceneElement.class);
                    KType type = aCVar.nr().getArguments().get(0).getType();
                    Intrinsics.checkNotNull(type);
                    oA.w6 w6Var = new oA.w6(orCreateKotlinClass, type, aCVar, iIntValue);
                    U4 u4 = new PropertyReference1Impl() { // from class: f0P.Wqz.U4
                        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                        public Object get(Object obj) {
                            return ((KeyableCubicBSpline) obj).getKnots();
                        }
                    };
                    oA.aC aCVar2 = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), u4.getReturnType(), w6Var, u4);
                    KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(SceneElement.class);
                    KType type2 = aCVar2.nr().getArguments().get(0).getType();
                    Intrinsics.checkNotNull(type2);
                    oA.w6 w6Var2 = new oA.w6(orCreateKotlinClass2, type2, aCVar2, size);
                    h6y h6yVar = new PropertyReference1Impl() { // from class: f0P.Wqz.h6y
                        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                        public Object get(Object obj) {
                            return ((SceneElement) obj).getOutline();
                        }
                    };
                    lS lSVar = new PropertyReference1Impl() { // from class: f0P.Wqz.lS
                        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                        public Object get(Object obj) {
                            return ((KeyableCompoundCubicBSpline) obj).getContours();
                        }
                    };
                    oA.aC aCVar3 = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), lSVar.getReturnType(), new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), h6yVar.getReturnType(), h6yVar), lSVar);
                    KClass orCreateKotlinClass3 = Reflection.getOrCreateKotlinClass(SceneElement.class);
                    KType type3 = aCVar3.nr().getArguments().get(0).getType();
                    Intrinsics.checkNotNull(type3);
                    oA.w6 w6Var3 = new oA.w6(orCreateKotlinClass3, type3, aCVar3, iIntValue);
                    tI tIVar = new PropertyReference1Impl() { // from class: f0P.Wqz.tI
                        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                        public Object get(Object obj) {
                            return ((KeyableCubicBSpline) obj).getKnots();
                        }
                    };
                    oA.aC aCVar4 = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), tIVar.getReturnType(), w6Var3, tIVar);
                    int size2 = ((sceneElementNHg.getOutline().getContours().get(iIntValue).getKnots().size() + iIntValue2) - 1) % sceneElementNHg.getOutline().getContours().get(iIntValue).getKnots().size();
                    KClass orCreateKotlinClass4 = Reflection.getOrCreateKotlinClass(SceneElement.class);
                    KType type4 = aCVar4.nr().getArguments().get(0).getType();
                    Intrinsics.checkNotNull(type4);
                    oA.w6 w6Var4 = new oA.w6(orCreateKotlinClass4, type4, aCVar4, size2);
                    Pmq pmq = new PropertyReference1Impl() { // from class: f0P.Wqz.Pmq
                        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                        public Object get(Object obj) {
                            return ((SceneElement) obj).getOutline();
                        }
                    };
                    mrQ mrq = new PropertyReference1Impl() { // from class: f0P.Wqz.mrQ
                        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                        public Object get(Object obj) {
                            return ((KeyableCompoundCubicBSpline) obj).getContours();
                        }
                    };
                    oA.aC aCVar5 = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), mrq.getReturnType(), new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), pmq.getReturnType(), pmq), mrq);
                    KClass orCreateKotlinClass5 = Reflection.getOrCreateKotlinClass(SceneElement.class);
                    KType type5 = aCVar5.nr().getArguments().get(0).getType();
                    Intrinsics.checkNotNull(type5);
                    oA.w6 w6Var5 = new oA.w6(orCreateKotlinClass5, type5, aCVar5, iIntValue);
                    i iVar = new PropertyReference1Impl() { // from class: f0P.Wqz.i
                        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                        public Object get(Object obj) {
                            return ((KeyableCubicBSpline) obj).getKnots();
                        }
                    };
                    oA.aC aCVar6 = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), iVar.getReturnType(), w6Var5, iVar);
                    KClass orCreateKotlinClass6 = Reflection.getOrCreateKotlinClass(SceneElement.class);
                    KType type6 = aCVar6.nr().getArguments().get(0).getType();
                    Intrinsics.checkNotNull(type6);
                    final oA.w6 w6Var6 = new oA.w6(orCreateKotlinClass6, type6, aCVar6, iIntValue2);
                    final KeyableCBKnot keyableCBKnot = (KeyableCBKnot) w6Var4.get(sceneElementNHg);
                    final KeyableCBKnot keyableCBKnot2 = (KeyableCBKnot) w6Var6.get(sceneElementNHg);
                    final KeyableCBKnot keyableCBKnot3 = (KeyableCBKnot) w6Var2.get(sceneElementNHg);
                    OptionalKeyableVector2D curveOut = keyableCBKnot2.getCurveOut();
                    OptionalKeyableVector2D.NONE none = OptionalKeyableVector2D.NONE.INSTANCE;
                    if (Intrinsics.areEqual(curveOut, none) && Intrinsics.areEqual(keyableCBKnot2.getCurveIn(), none)) {
                        HW.C.D(wqz, new Function2() { // from class: f0P.jjk
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return Wqz.tdZ(this.f65696n, keyableCBKnot3, keyableCBKnot, keyableCBKnot2, w6Var6, (Scene) obj, (SceneElement) obj2);
                            }
                        });
                        sceneHolderE.setSelection(SceneSelection.copy$default(sceneHolderE.getSelection(), null, null, null, null, null, null, controlHandle, null, false, null, null, null, 4031, null));
                        wqz.hu();
                        return;
                    } else {
                        sceneHolderE.update((SceneElement) w6Var6.t(sceneElementNHg, new Function1() { // from class: f0P.hl
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return Wqz.Rc((KeyableCBKnot) obj);
                            }
                        }));
                        sceneHolderE.setSelection(SceneSelection.copy$default(sceneHolderE.getSelection(), null, null, null, null, null, null, ControlHandle.MAIN, null, false, null, null, null, 4031, null));
                        return;
                    }
                }
                wqz.lockHandleDistance = !wqz.lockHandleDistance;
                wqz.XNZ();
            }
        }
    }

    private final fi QgZ() {
        HW.n nVar;
        KeyEventDispatcher.Component activity = getActivity();
        Fragment fragmentHI = null;
        if (activity == null) {
            return null;
        }
        if (activity instanceof HW.n) {
            nVar = (HW.n) activity;
        } else {
            nVar = null;
        }
        if (nVar != null) {
            fragmentHI = nVar.HI(fi.class);
        }
        return (fi) fragmentHI;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R3E(Wqz wqz) {
        wqz.Bha();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VK2(Wqz wqz) {
        wqz.Aum();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit W1c(Wqz wqz) {
        wqz.EF();
        return Unit.INSTANCE;
    }

    private final void XNZ() {
        SceneSelection selection;
        if (isAdded() && getView() != null) {
            SceneElement sceneElementNHg = HW.C.nHg(this);
            SceneHolder sceneHolderE = HW.C.e(this);
            if (sceneHolderE != null) {
                selection = sceneHolderE.getSelection();
            } else {
                selection = null;
            }
            if (sceneElementNHg != null && selection != null) {
                kR(sceneElementNHg, selection);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int YE(Wqz wqz) {
        return ViewConfiguration.get(wqz.requireContext()).getScaledTouchSlop();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Yq(Wqz wqz, View view) {
        wqz.Co();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean cAB(Wqz wqz, View view) {
        wqz.mx();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f11(Wqz wqz, View view) {
        wqz.EN();
    }

    private final void hu() {
        SceneHolder sceneHolderE;
        SceneSelection selection;
        ControlHandle selectedHandle;
        SceneHolder sceneHolderE2;
        SceneSelection selection2;
        Integer selectedPoint;
        int iIntValue;
        Vector2D vector2D;
        SceneSelection selection3;
        Integer selectedContour;
        SceneElement sceneElementNHg = HW.C.nHg(this);
        if (sceneElementNHg != null && (sceneHolderE = HW.C.e(this)) != null && (selection = sceneHolderE.getSelection()) != null && (selectedHandle = selection.getSelectedHandle()) != null && (sceneHolderE2 = HW.C.e(this)) != null && (selection2 = sceneHolderE2.getSelection()) != null && (selectedPoint = selection2.getSelectedPoint()) != null) {
            int iIntValue2 = selectedPoint.intValue();
            SceneHolder sceneHolderE3 = HW.C.e(this);
            if (sceneHolderE3 != null && (selection3 = sceneHolderE3.getSelection()) != null && (selectedContour = selection3.getSelectedContour()) != null) {
                iIntValue = selectedContour.intValue();
            } else {
                iIntValue = 0;
            }
            boolean z2 = this.lockHandleAngle;
            boolean z3 = this.lockHandleDistance;
            float fFractionalTime = SceneElementKt.fractionalTime(sceneElementNHg, HW.C.WPU(this));
            if (selectedHandle == ControlHandle.IN || selectedHandle == ControlHandle.OUT) {
                KeyableCBKnot keyableCBKnot = sceneElementNHg.getOutline().getContours().get(iIntValue).getKnots().get(iIntValue2);
                OptionalVector2D optionalVector2DOptionalValueAtTime = KeyableKt.optionalValueAtTime(keyableCBKnot.getCurveIn(), fFractionalTime);
                Vector2D vector2D2 = null;
                if (optionalVector2DOptionalValueAtTime instanceof Vector2D) {
                    vector2D = (Vector2D) optionalVector2DOptionalValueAtTime;
                } else {
                    vector2D = null;
                }
                OptionalVector2D optionalVector2DOptionalValueAtTime2 = KeyableKt.optionalValueAtTime(keyableCBKnot.getCurveOut(), fFractionalTime);
                if (optionalVector2DOptionalValueAtTime2 instanceof Vector2D) {
                    vector2D2 = (Vector2D) optionalVector2DOptionalValueAtTime2;
                }
                if (vector2D != null && vector2D2 != null) {
                    if (Math.abs(GeometryKt.plus(vector2D, vector2D2).getX()) < 5.0E-5f && Math.abs(GeometryKt.plus(vector2D, vector2D2).getY()) < 5.0E-5f) {
                        this.lockHandleAngle = true;
                        this.lockHandleDistance = true;
                    } else if (Math.abs(GeometryKt.plus(GeometryKt.normalize(vector2D), GeometryKt.normalize(vector2D2)).getX()) < 5.0E-5f && Math.abs(GeometryKt.plus(GeometryKt.normalize(vector2D), GeometryKt.normalize(vector2D2)).getY()) < 5.0E-5f) {
                        this.lockHandleAngle = true;
                        this.lockHandleDistance = false;
                    } else {
                        this.lockHandleAngle = false;
                        this.lockHandleDistance = false;
                    }
                }
            }
            if (z2 != this.lockHandleAngle || z3 != this.lockHandleDistance) {
                XNZ();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void iV(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void iu(Wqz wqz, View view) {
        SceneHolder sceneHolderE = HW.C.e(wqz);
        if (sceneHolderE == null) {
            return;
        }
        if (sceneHolderE.getSelection().getSelectedHandle() == ControlHandle.CURVE_OUT) {
            wqz.Vvq();
        } else {
            wqz.Lp6();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void jX(Wqz wqz, View view) {
        ControlHandle selectedHandle;
        SceneSelection selection;
        SceneHolder sceneHolderE = HW.C.e(wqz);
        if (sceneHolderE != null && (selection = sceneHolderE.getSelection()) != null) {
            selectedHandle = selection.getSelectedHandle();
        } else {
            selectedHandle = null;
        }
        if (sceneHolderE != null && (selectedHandle == ControlHandle.IN || selectedHandle == ControlHandle.OUT)) {
            sceneHolderE.setSelection(SceneSelection.copy$default(sceneHolderE.getSelection(), null, null, null, null, null, null, ControlHandle.MAIN, null, false, null, null, null, 4031, null));
        } else if (wqz.isAdded()) {
            wqz.getParentFragmentManager().Zmq();
        }
    }

    private final List lNy() {
        SceneHolder sceneHolderE;
        SceneSelection selection;
        int iIntValue;
        int i2;
        oA.aC aCVar;
        SceneElement sceneElementNHg = HW.C.nHg(this);
        if (sceneElementNHg != null && (sceneHolderE = HW.C.e(this)) != null && (selection = sceneHolderE.getSelection()) != null) {
            Integer selectedContour = selection.getSelectedContour();
            if (selectedContour != null) {
                iIntValue = selectedContour.intValue();
            } else {
                iIntValue = 0;
            }
            if (!selection.getMultiSelectPoints().isEmpty()) {
                u uVar = new PropertyReference1Impl() { // from class: f0P.Wqz.u
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return ((SceneElement) obj).getOutline();
                    }
                };
                qf qfVar = new PropertyReference1Impl() { // from class: f0P.Wqz.qf
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return ((KeyableCompoundCubicBSpline) obj).getContours();
                    }
                };
                oA.aC aCVar2 = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), qfVar.getReturnType(), new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), uVar.getReturnType(), uVar), qfVar);
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SceneElement.class);
                KType type = aCVar2.nr().getArguments().get(0).getType();
                Intrinsics.checkNotNull(type);
                oA.w6 w6Var = new oA.w6(orCreateKotlinClass, type, aCVar2, iIntValue);
                Ln ln2 = new PropertyReference1Impl() { // from class: f0P.Wqz.Ln
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return ((KeyableCubicBSpline) obj).getKnots();
                    }
                };
                oA.aC aCVar3 = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), ln2.getReturnType(), w6Var, ln2);
                Set<Integer> multiSelectPoints = selection.getMultiSelectPoints();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(multiSelectPoints, 10));
                Iterator<T> it = multiSelectPoints.iterator();
                while (it.hasNext()) {
                    int iIntValue2 = ((Number) it.next()).intValue();
                    KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(SceneElement.class);
                    KType type2 = aCVar3.nr().getArguments().get(0).getType();
                    Intrinsics.checkNotNull(type2);
                    oA.w6 w6Var2 = new oA.w6(orCreateKotlinClass2, type2, aCVar3, iIntValue2);
                    Z z2 = new PropertyReference1Impl() { // from class: f0P.Wqz.Z
                        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                        public Object get(Object obj) {
                            return ((KeyableCBKnot) obj).getP();
                        }
                    };
                    arrayList.add(new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), z2.getReturnType(), w6Var2, z2));
                }
                return arrayList;
            }
            if (selection.getSelectedPoint() != null && selection.getSelectedHandle() != null && selection.getPendingAddPoint() == null && selection.getSelectedPoint().intValue() < sceneElementNHg.getOutline().getContours().get(iIntValue).getKnots().size()) {
                lej lejVar = new PropertyReference1Impl() { // from class: f0P.Wqz.lej
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return ((SceneElement) obj).getOutline();
                    }
                };
                iwV iwv = new PropertyReference1Impl() { // from class: f0P.Wqz.iwV
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return ((KeyableCompoundCubicBSpline) obj).getContours();
                    }
                };
                oA.aC aCVar4 = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), iwv.getReturnType(), new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), lejVar.getReturnType(), lejVar), iwv);
                KClass orCreateKotlinClass3 = Reflection.getOrCreateKotlinClass(SceneElement.class);
                KType type3 = aCVar4.nr().getArguments().get(0).getType();
                Intrinsics.checkNotNull(type3);
                oA.w6 w6Var3 = new oA.w6(orCreateKotlinClass3, type3, aCVar4, iIntValue);
                M m2 = new PropertyReference1Impl() { // from class: f0P.Wqz.M
                    {
                        String str = IYJfqUyym.DssFLkB;
                    }

                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return ((KeyableCubicBSpline) obj).getKnots();
                    }
                };
                oA.aC aCVar5 = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), m2.getReturnType(), w6Var3, m2);
                int iIntValue3 = selection.getSelectedPoint().intValue();
                KClass orCreateKotlinClass4 = Reflection.getOrCreateKotlinClass(SceneElement.class);
                KType type4 = aCVar5.nr().getArguments().get(0).getType();
                Intrinsics.checkNotNull(type4);
                oA.w6 w6Var4 = new oA.w6(orCreateKotlinClass4, type4, aCVar5, iIntValue3);
                ControlHandle selectedHandle = selection.getSelectedHandle();
                if (selectedHandle == null) {
                    i2 = -1;
                } else {
                    i2 = Ml.$EnumSwitchMapping$0[selectedHandle.ordinal()];
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 == 4) {
                                return null;
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        if (!(((KeyableCBKnot) w6Var4.get(sceneElementNHg)).getCurveOut() instanceof KeyableVector2D)) {
                            return null;
                        }
                        DAz dAz = new PropertyReference1Impl() { // from class: f0P.Wqz.DAz
                            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                            public Object get(Object obj) {
                                return ((KeyableCBKnot) obj).getCurveOut();
                            }
                        };
                        aCVar = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), dAz.getReturnType(), w6Var4, dAz);
                    } else {
                        if (!(((KeyableCBKnot) w6Var4.get(sceneElementNHg)).getCurveIn() instanceof KeyableVector2D)) {
                            return null;
                        }
                        Ew ew = new PropertyReference1Impl() { // from class: f0P.Wqz.Ew
                            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                            public Object get(Object obj) {
                                return ((KeyableCBKnot) obj).getCurveIn();
                            }
                        };
                        aCVar = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), ew.getReturnType(), w6Var4, ew);
                    }
                } else {
                    nKK nkk = new PropertyReference1Impl() { // from class: f0P.Wqz.nKK
                        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                        public Object get(Object obj) {
                            return ((KeyableCBKnot) obj).getP();
                        }
                    };
                    aCVar = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), nkk.getReturnType(), w6Var4, nkk);
                }
                return CollectionsKt.listOf(aCVar);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lS(Wqz wqz, DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
        wqz.vl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String uQ(oA.j jVar, SceneElement sceneElement) {
        String str;
        Iterable<KeyableCBKnot> iterable = (Iterable) jVar.get(sceneElement);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (KeyableCBKnot keyableCBKnot : iterable) {
            if (keyableCBKnot.getP().getKeyed()) {
                List<Keyframe<Vector2D>> keyframes = keyableCBKnot.getP().getKeyframes();
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(keyframes, 10));
                Iterator<T> it = keyframes.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Float.valueOf(((Keyframe) it.next()).getTime()));
                }
                str = "(" + CollectionsKt.joinToString$default(arrayList2, ",", null, null, 0, null, null, 62, null) + ")";
            } else {
                str = "(NOT-KEYED)";
            }
            arrayList.add(str);
        }
        return "AddMultiKFUpdate: " + arrayList;
    }

    private final void vl() {
        final SceneSelection selection;
        final int iIntValue;
        SceneHolder sceneHolderE = HW.C.e(this);
        if (sceneHolderE != null && (selection = sceneHolderE.getSelection()) != null && selection.getSelectedPoint() != null && selection.getSelectedHandle() != null) {
            Integer selectedContour = selection.getSelectedContour();
            if (selectedContour != null) {
                iIntValue = selectedContour.intValue();
            } else {
                iIntValue = 0;
            }
            SceneElement sceneElementNHg = HW.C.nHg(this);
            if (sceneElementNHg != null) {
                final float fFractionalTime = SceneElementKt.fractionalTime(sceneElementNHg, HW.C.WPU(this));
                HW.C.D(this, new Function2() { // from class: f0P.KA5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return Wqz.v0j(selection, iIntValue, fFractionalTime, (Scene) obj, (SceneElement) obj2);
                    }
                });
            }
        }
    }

    private final ImageButton waP() {
        ImageButton buttonCurveType = j().f9238O;
        Intrinsics.checkNotNullExpressionValue(buttonCurveType, "buttonCurveType");
        return buttonCurveType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String x(yc.a aVar, int i2, float f3, ControlHandle controlHandle, float f4, Wqz wqz) {
        return "EditPoints:onPreviewClick( " + aVar + ".sceneX, " + aVar + ".sceneY ) bestIdx=" + i2 + " bestDist=" + f3 + ", bestHandle=" + controlHandle + " touchRadius=" + f4 + " projectPixelsPerDp=" + HW.C.nY(wqz);
    }

    private final void y() {
        SceneElement sceneElementNHg;
        int iIntValue;
        int iIntValue2;
        float fFloatValue;
        final Wqz wqz;
        SceneHolder sceneHolderE = HW.C.e(this);
        if (sceneHolderE == null || (sceneElementNHg = HW.C.nHg(this)) == null) {
            return;
        }
        final Ref.IntRef intRef = new Ref.IntRef();
        Integer selectedPoint = sceneHolderE.getSelection().getSelectedPoint();
        if (selectedPoint != null) {
            iIntValue = selectedPoint.intValue();
        } else {
            iIntValue = 0;
        }
        intRef.element = iIntValue;
        Integer selectedContour = sceneHolderE.getSelection().getSelectedContour();
        if (selectedContour != null) {
            iIntValue2 = selectedContour.intValue();
        } else {
            iIntValue2 = 0;
        }
        int size = (intRef.element + 1) % sceneElementNHg.getOutline().getContours().get(iIntValue2).getKnots().size();
        ControlHandle selectedHandle = sceneHolderE.getSelection().getSelectedHandle();
        if (selectedHandle == null) {
            selectedHandle = ControlHandle.IN;
        }
        Float curvePos = sceneHolderE.getSelection().getCurvePos();
        if (curvePos != null) {
            fFloatValue = curvePos.floatValue();
        } else {
            fFloatValue = 0.5f;
        }
        fuX fux = new PropertyReference1Impl() { // from class: f0P.Wqz.fuX
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((SceneElement) obj).getOutline();
            }
        };
        Dsr dsr = new PropertyReference1Impl() { // from class: f0P.Wqz.Dsr
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((KeyableCompoundCubicBSpline) obj).getContours();
            }
        };
        oA.aC aCVar = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), dsr.getReturnType(), new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), fux.getReturnType(), fux), dsr);
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SceneElement.class);
        KType type = aCVar.nr().getArguments().get(0).getType();
        Intrinsics.checkNotNull(type);
        oA.w6 w6Var = new oA.w6(orCreateKotlinClass, type, aCVar, iIntValue2);
        aC aCVar2 = new PropertyReference1Impl() { // from class: f0P.Wqz.aC
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((KeyableCubicBSpline) obj).getKnots();
            }
        };
        oA.aC aCVar3 = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), aCVar2.getReturnType(), w6Var, aCVar2);
        int i2 = intRef.element;
        KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(SceneElement.class);
        KType type2 = aCVar3.nr().getArguments().get(0).getType();
        Intrinsics.checkNotNull(type2);
        oA.w6 w6Var2 = new oA.w6(orCreateKotlinClass2, type2, aCVar3, i2);
        I28 i28 = new PropertyReference1Impl() { // from class: f0P.Wqz.I28
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((SceneElement) obj).getOutline();
            }
        };
        Wre wre = new PropertyReference1Impl() { // from class: f0P.Wqz.Wre
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((KeyableCompoundCubicBSpline) obj).getContours();
            }
        };
        oA.aC aCVar4 = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), wre.getReturnType(), new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), i28.getReturnType(), i28), wre);
        KClass orCreateKotlinClass3 = Reflection.getOrCreateKotlinClass(SceneElement.class);
        KType type3 = aCVar4.nr().getArguments().get(0).getType();
        Intrinsics.checkNotNull(type3);
        oA.w6 w6Var3 = new oA.w6(orCreateKotlinClass3, type3, aCVar4, iIntValue2);
        CN3 cn3 = new PropertyReference1Impl() { // from class: f0P.Wqz.CN3
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((KeyableCubicBSpline) obj).getKnots();
            }
        };
        oA.aC aCVar5 = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), cn3.getReturnType(), w6Var3, cn3);
        KClass orCreateKotlinClass4 = Reflection.getOrCreateKotlinClass(SceneElement.class);
        KType type4 = aCVar5.nr().getArguments().get(0).getType();
        Intrinsics.checkNotNull(type4);
        oA.w6 w6Var4 = new oA.w6(orCreateKotlinClass4, type4, aCVar5, size);
        final KeyableCBKnot keyableCBKnot = (KeyableCBKnot) w6Var2.get(sceneElementNHg);
        final KeyableCBKnot keyableCBKnot2 = (KeyableCBKnot) w6Var4.get(sceneElementNHg);
        int i3 = Ml.$EnumSwitchMapping$0[selectedHandle.ordinal()];
        if (i3 != 1 && i3 != 2 && i3 != 3) {
            if (i3 == 4) {
                OptionalKeyableVector2D curveOut = keyableCBKnot.getCurveOut();
                OptionalKeyableVector2D.NONE none = OptionalKeyableVector2D.NONE.INSTANCE;
                if (Intrinsics.areEqual(curveOut, none) && Intrinsics.areEqual(keyableCBKnot2.getCurveIn(), none)) {
                    final float f3 = fFloatValue;
                    final int i5 = iIntValue2;
                    wqz = this;
                    HW.C.D(wqz, new Function2() { // from class: f0P.hg
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return Wqz.Zn(this.f65613n, i5, intRef, keyableCBKnot, f3, keyableCBKnot2, (Scene) obj, (SceneElement) obj2);
                        }
                    });
                    intRef.element++;
                    selectedHandle = ControlHandle.MAIN;
                } else {
                    final int i7 = iIntValue2;
                    wqz = this;
                    float fFractionalTime = SceneElementKt.fractionalTime(sceneElementNHg, HW.C.WPU(wqz));
                    Pair<CBSegment, CBSegment> pairSplitCubicBezierSegment = CubicBSplineKt.splitCubicBezierSegment(fFloatValue, CubicBSplineKt.segmentBetween(keyableCBKnot, keyableCBKnot2, fFractionalTime));
                    CBSegment cBSegmentComponent1 = pairSplitCubicBezierSegment.component1();
                    CBSegment cBSegmentComponent2 = pairSplitCubicBezierSegment.component2();
                    final List mutableList = CollectionsKt.toMutableList((Collection) sceneElementNHg.getOutline().getContours().get(i7).getKnots());
                    int i8 = intRef.element;
                    mutableList.set(i8, KeyableCBKnot.copy$default((KeyableCBKnot) mutableList.get(i8), null, null, KeyableKt.keyable((OptionalVector2D) GeometryKt.minus(cBSegmentComponent1.getP2(), (Vector2D) KeyableKt.valueAtTime(((KeyableCBKnot) mutableList.get(intRef.element)).getP(), fFractionalTime))), 3, null));
                    mutableList.set(size, KeyableCBKnot.copy$default((KeyableCBKnot) mutableList.get(size), null, KeyableKt.keyable((OptionalVector2D) GeometryKt.minus(cBSegmentComponent2.getP3(), (Vector2D) KeyableKt.valueAtTime(((KeyableCBKnot) mutableList.get(size)).getP(), fFractionalTime))), null, 5, null));
                    mutableList.add(intRef.element + 1, CubicBSplineKt.keyable(new CBKnot(cBSegmentComponent1.getP4(), cBSegmentComponent1.getP3(), cBSegmentComponent2.getP2())));
                    HW.C.D(wqz, new Function2() { // from class: f0P.yLi
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return Wqz.nO(i7, mutableList, (Scene) obj, (SceneElement) obj2);
                        }
                    });
                    intRef.element++;
                    selectedHandle = ControlHandle.MAIN;
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            wqz = this;
        }
        ControlHandle controlHandle = selectedHandle;
        sceneHolderE.setSelection(SceneSelection.copy$default(sceneHolderE.getSelection(), null, null, null, Integer.valueOf(intRef.element), SetsKt.emptySet(), null, controlHandle, null, false, null, null, null, 4007, null));
        OutlineScrollerView.S(wqz.j().f9242r, intRef.element, controlHandle, 0.0f, false, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String yUZ(List list, int i2, Wqz wqz) {
        return "EditPointsFragment.refresh:  selectedKnots=" + list.size() + " keyedKnotsAtCurrentTime=" + i2 + " activeKeyframeAtCurrentTime=" + wqz.activeKeyframeAtCurrentTime + " mixedActiveKeyframeAtCurrentTime=" + wqz.mixedActiveKeyframeAtCurrentTime;
    }

    public final void Bha() {
        fi fiVarQgZ = QgZ();
        if (fiVarQgZ != null) {
            fiVarQgZ.N(this.editKeyframeMode, false, false, false);
        }
    }

    @Override // yc.tpM
    public int O() {
        SceneSelection selection;
        SceneHolder sceneHolderE = HW.C.e(this);
        if (sceneHolderE != null) {
            selection = sceneHolderE.getSelection();
        } else {
            selection = null;
        }
        if (selection == null) {
            return 0;
        }
        if (!selection.getMultiSelectPoints().isEmpty()) {
            return selection.getMultiSelectPoints().size();
        }
        if (selection.getSelectedPoint() == null) {
            return 0;
        }
        return 1;
    }

    @Override // yc.InterfaceC2452g
    public void gh() {
        KeyableCompoundCubicBSpline outline;
        SceneElement sceneElementNHg = HW.C.nHg(this);
        if (sceneElementNHg != null && (outline = sceneElementNHg.getOutline()) != null && CubicBSplineKt.getKeyed(outline)) {
            XNZ();
        }
    }

    @Override // yc.H
    public void nr() {
        XNZ();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        SceneHolder sceneHolderE = HW.C.e(this);
        if (sceneHolderE == null) {
            return;
        }
        sceneHolderE.setSelection(SceneSelection.copy$default(sceneHolderE.getSelection(), null, null, null, null, SetsKt.emptySet(), null, null, null, false, null, null, null, 899, null));
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this._binding = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        Bha();
        super.onResume();
    }

    @Override // yc.tpM
    public List rl() {
        SceneSelection selection;
        int iIntValue;
        int i2;
        SceneElement sceneElementNHg = HW.C.nHg(this);
        if (sceneElementNHg == null) {
            return CollectionsKt.emptyList();
        }
        SceneHolder sceneHolderE = HW.C.e(this);
        if (sceneHolderE != null && (selection = sceneHolderE.getSelection()) != null) {
            Integer selectedContour = selection.getSelectedContour();
            if (selectedContour != null) {
                iIntValue = selectedContour.intValue();
            } else {
                iIntValue = 0;
            }
            K k2 = new PropertyReference1Impl() { // from class: f0P.Wqz.K
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public Object get(Object obj) {
                    return ((SceneElement) obj).getOutline();
                }
            };
            psW psw = new PropertyReference1Impl() { // from class: f0P.Wqz.psW
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public Object get(Object obj) {
                    return ((KeyableCompoundCubicBSpline) obj).getContours();
                }
            };
            oA.aC aCVar = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), psw.getReturnType(), new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), k2.getReturnType(), k2), psw);
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SceneElement.class);
            KType type = aCVar.nr().getArguments().get(0).getType();
            Intrinsics.checkNotNull(type);
            oA.w6 w6Var = new oA.w6(orCreateKotlinClass, type, aCVar, iIntValue);
            Md md = new PropertyReference1Impl() { // from class: f0P.Wqz.Md
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public Object get(Object obj) {
                    return ((KeyableCubicBSpline) obj).getKnots();
                }
            };
            oA.aC aCVar2 = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), md.getReturnType(), w6Var, md);
            if (!selection.getMultiSelectPoints().isEmpty()) {
                Set<Integer> multiSelectPoints = selection.getMultiSelectPoints();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(multiSelectPoints, 10));
                Iterator<T> it = multiSelectPoints.iterator();
                while (it.hasNext()) {
                    int iIntValue2 = ((Number) it.next()).intValue();
                    KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(SceneElement.class);
                    KType type2 = aCVar2.nr().getArguments().get(0).getType();
                    Intrinsics.checkNotNull(type2);
                    oA.w6 w6Var2 = new oA.w6(orCreateKotlinClass2, type2, aCVar2, iIntValue2);
                    rv6 rv6Var = new PropertyReference1Impl() { // from class: f0P.Wqz.rv6
                        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                        public Object get(Object obj) {
                            return ((KeyableCBKnot) obj).getP();
                        }
                    };
                    arrayList.add(new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), rv6Var.getReturnType(), w6Var2, rv6Var));
                }
                return arrayList;
            }
            if (selection.getSelectedPoint() != null && selection.getSelectedHandle() != null && selection.getSelectedHandle() != ControlHandle.CURVE_OUT && selection.getSelectedPoint().intValue() < sceneElementNHg.getOutline().getContours().get(iIntValue).getKnots().size()) {
                if (!(CubicBSplineKt.get(sceneElementNHg.getOutline().getContours().get(iIntValue).getKnots().get(selection.getSelectedPoint().intValue()), selection.getSelectedHandle()) instanceof KeyableVector2D)) {
                    return CollectionsKt.emptyList();
                }
                int iIntValue3 = selection.getSelectedPoint().intValue();
                KClass orCreateKotlinClass3 = Reflection.getOrCreateKotlinClass(SceneElement.class);
                KType type3 = aCVar2.nr().getArguments().get(0).getType();
                Intrinsics.checkNotNull(type3);
                oA.w6 w6Var3 = new oA.w6(orCreateKotlinClass3, type3, aCVar2, iIntValue3);
                ControlHandle selectedHandle = selection.getSelectedHandle();
                if (selectedHandle == null) {
                    i2 = -1;
                } else {
                    i2 = Ml.$EnumSwitchMapping$0[selectedHandle.ordinal()];
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            return CollectionsKt.emptyList();
                        }
                        h hVar = new PropertyReference1Impl() { // from class: f0P.Wqz.h
                            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                            public Object get(Object obj) {
                                return ((KeyableCBKnot) obj).getCurveOut();
                            }
                        };
                        return CollectionsKt.listOf(new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), hVar.getReturnType(), w6Var3, hVar));
                    }
                    vd vdVar = new PropertyReference1Impl() { // from class: f0P.Wqz.vd
                        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                        public Object get(Object obj) {
                            return ((KeyableCBKnot) obj).getCurveIn();
                        }
                    };
                    return CollectionsKt.listOf(new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), vdVar.getReturnType(), w6Var3, vdVar));
                }
                Lu lu = new PropertyReference1Impl() { // from class: f0P.Wqz.Lu
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return ((KeyableCBKnot) obj).getP();
                    }
                };
                return CollectionsKt.listOf(new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), lu.getReturnType(), w6Var3, lu));
            }
            return CollectionsKt.emptyList();
        }
        return CollectionsKt.emptyList();
    }

    @Override // yc.QhI
    public int t() {
        return 2131362623;
    }

    public final void w() {
        int iIntValue;
        SceneHolder sceneHolderE = HW.C.e(this);
        if (sceneHolderE != null) {
            Integer selectedContour = sceneHolderE.getSelection().getSelectedContour();
            if (selectedContour != null) {
                iIntValue = selectedContour.intValue();
            } else {
                iIntValue = 0;
            }
            SceneSelection selection = sceneHolderE.getSelection();
            int iCoerceAtLeast = RangesKt.coerceAtLeast(iIntValue - 1, 0);
            sceneHolderE.setSelection(SceneSelection.copy$default(selection, null, null, Integer.valueOf(iCoerceAtLeast), 0, SetsKt.emptySet(), null, ControlHandle.MAIN, null, false, null, null, null, 4003, null));
            SceneElement sceneElementNHg = HW.C.nHg(this);
            if (sceneElementNHg == null) {
                return;
            }
            kR(sceneElementNHg, sceneHolderE.getSelection());
        }
    }
}
