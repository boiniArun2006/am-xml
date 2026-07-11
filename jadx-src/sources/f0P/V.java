package f0P;

import LdY.Ml;
import QmE.j;
import ScC.FuwU.XIvb;
import ScC.FuwU.pTYaLzzmJSGAPQ;
import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.RectEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.Size;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.alightcreative.app.motion.activities.ColorPickerActivity;
import com.alightcreative.app.motion.activities.EditActivity;
import com.alightcreative.app.motion.activities.edit.ColorView;
import com.alightcreative.app.motion.activities.edit.widgets.ColorPickerWidget;
import com.alightcreative.app.motion.scene.ColorKt;
import com.alightcreative.app.motion.scene.EdgeDecorationDirection;
import com.alightcreative.app.motion.scene.EdgeDecorationType;
import com.alightcreative.app.motion.scene.GeometryKt;
import com.alightcreative.app.motion.scene.Keyable;
import com.alightcreative.app.motion.scene.KeyableEdgeDecoration;
import com.alightcreative.app.motion.scene.KeyableKt;
import com.alightcreative.app.motion.scene.KeyableSolidColor;
import com.alightcreative.app.motion.scene.Quaternion;
import com.alightcreative.app.motion.scene.Scene;
import com.alightcreative.app.motion.scene.SceneElement;
import com.alightcreative.app.motion.scene.SceneElementKt;
import com.alightcreative.app.motion.scene.SceneHolder;
import com.alightcreative.app.motion.scene.SolidColor;
import com.alightcreative.app.motion.scene.StrokeCap;
import com.alightcreative.app.motion.scene.StrokeEnd;
import com.alightcreative.app.motion.scene.StrokeJoin;
import com.alightcreative.app.motion.scene.TimeKt;
import com.alightcreative.app.motion.scene.Vector2D;
import com.alightcreative.app.motion.scene.Vector3D;
import com.alightcreative.app.motion.scene.animators.AnimatorOf;
import com.alightcreative.app.motion.scene.userparam.ChoiceInfo;
import com.alightcreative.app.motion.scene.userparam.DataType;
import com.alightcreative.app.motion.scene.userparam.KeyableUserParameterValue;
import com.alightcreative.app.motion.scene.userparam.PointType;
import com.alightcreative.app.motion.scene.userparam.SelectorStyle;
import com.alightcreative.app.motion.scene.userparam.SliderType;
import com.alightcreative.app.motion.scene.userparam.UserParameter;
import com.alightcreative.app.motion.scene.userparam.UserParameterKt;
import com.alightcreative.widget.ValueSpinner;
import com.google.android.gms.ads.identifier.Ov.YmsTEL;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.AppLovinBridge;
import com.safedk.android.utils.Logger;
import com.vungle.ads.internal.protos.Sdk;
import f0P.Ny;
import f0P.V;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.text.StringsKt;
import r.C2348n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0003J\u0090\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J-\u0010\r\u001a\u0018\u0012\u0004\u0012\u00020\n\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u000f\u001a\f\u0012\u0006\b\u0001\u0012\u00020\f\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u0018H\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0013H\u0002¢\u0006\u0004\b#\u0010\u0006J\u000f\u0010$\u001a\u00020\u0013H\u0002¢\u0006\u0004\b$\u0010\u0006J\u001f\u0010(\u001a\u00020\u00132\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u0018H\u0002¢\u0006\u0004\b(\u0010)J\u001f\u0010+\u001a\u00020\u00132\u0006\u0010*\u001a\u00020\n2\u0006\u0010'\u001a\u00020\u0018H\u0002¢\u0006\u0004\b+\u0010,J\u001f\u0010/\u001a\u00020\u00112\u0006\u0010-\u001a\u00020\u001c2\u0006\u0010.\u001a\u00020\u001cH\u0002¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0013H\u0002¢\u0006\u0004\b1\u0010\u0006J\u000f\u00102\u001a\u00020\u0018H\u0016¢\u0006\u0004\b2\u00103J\u0017\u00106\u001a\u00020\u00132\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u0011H\u0016¢\u0006\u0004\b8\u0010\u0017J\u0017\u00109\u001a\u00020\u00132\u0006\u0010*\u001a\u00020\nH\u0015¢\u0006\u0004\b9\u0010:J!\u0010>\u001a\u00020\u00132\u0006\u0010;\u001a\u00020%2\b\u0010=\u001a\u0004\u0018\u00010<H\u0017¢\u0006\u0004\b>\u0010?J\u0017\u0010A\u001a\u00020\u00132\u0006\u0010@\u001a\u00020\u0018H\u0014¢\u0006\u0004\bA\u0010\u001bJ)\u0010F\u001a\u00020\u00132\u0006\u0010B\u001a\u00020\u00182\u0006\u0010C\u001a\u00020\u00182\b\u0010E\u001a\u0004\u0018\u00010DH\u0017¢\u0006\u0004\bF\u0010GJ\u0017\u0010J\u001a\u00020\u00112\u0006\u0010I\u001a\u00020HH\u0016¢\u0006\u0004\bJ\u0010KR\u001b\u0010Q\u001a\u00020L8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\u001a\u0010U\u001a\u00020\u00188\u0014X\u0094D¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u00103R\u0018\u0010Y\u001a\u0004\u0018\u00010V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0016\u0010\\\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u001a\u0010`\u001a\u00060]R\u00020\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b^\u0010_R\u0018\u0010c\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u0016\u0010g\u001a\u00020d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR \u0010l\u001a\u000e\u0012\u0004\u0012\u00020i\u0012\u0004\u0012\u00020\u00180h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\"\u0010o\u001a\u00020\u00118\u0014@\u0014X\u0094\u000e¢\u0006\u0012\n\u0004\bA\u0010[\u001a\u0004\bm\u0010\u0017\"\u0004\bn\u0010\u0015R\u0018\u0010r\u001a\u0004\u0018\u00010p8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010qR3\u0010y\u001a\u001f\u0012\u0013\u0012\u00110\u0011¢\u0006\f\bt\u0012\b\bu\u0012\u0004\b\b(v\u0012\u0004\u0012\u00020\u0013\u0018\u00010s8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010xR\u0016\u0010{\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010[R\u0016\u0010\u007f\u001a\u00020|8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010~R\u0018\u0010\u0083\u0001\u001a\u00030\u0080\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0019\u0010\u0086\u0001\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0019\u0010\u0088\u0001\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0085\u0001R\u001f\u0010\u008d\u0001\u001a\n\u0012\u0005\u0012\u00030\u008a\u00010\u0089\u00018TX\u0094\u0004¢\u0006\b\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R\u001e\u0010\u008f\u0001\u001a\n\u0012\u0005\u0012\u00030\u008e\u00010\u0089\u00018TX\u0094\u0004¢\u0006\u0007\u001a\u0005\bZ\u0010\u008c\u0001¨\u0006\u0091\u0001"}, d2 = {"Lf0P/V;", "Lyc/QhI;", "Lf0P/NO;", "Lyc/DAz;", "Lyc/Buf;", "<init>", "()V", "Lcom/alightcreative/app/motion/scene/userparam/UserParameter;", "param", "LoA/j;", "Lcom/alightcreative/app/motion/scene/SceneElement;", "Lcom/alightcreative/app/motion/scene/Keyable;", "", "WH", "(Lcom/alightcreative/app/motion/scene/userparam/UserParameter;)LoA/j;", "A", "(Lcom/alightcreative/app/motion/scene/userparam/UserParameter;)Lcom/alightcreative/app/motion/scene/Keyable;", "", "isStart", "", "x", "(Z)V", "bZm", "()Z", "", "newColor", "W5k", "(I)V", "", "width", "ex", "(F)I", "progress", "Of6", "(I)F", "l2", "oz", "Landroid/view/View;", "listEntryView", "position", "d", "(Landroid/view/View;I)V", "el", "UR", "(Lcom/alightcreative/app/motion/scene/SceneElement;I)V", "dx", "dy", "HE", "(FF)Z", "I4p", "t", "()I", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "onBackPressed", "piY", "(Lcom/alightcreative/app/motion/scene/SceneElement;)V", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "tabId", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "Lyc/a;", "motionEvent", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(Lyc/a;)Z", "LSJ0/tI;", "p5", "Lkotlin/Lazy;", "q9", "()LSJ0/tI;", "contentBinding", "eF", "I", "M7", "layoutResource", "", "E", "Ljava/lang/String;", "paramName", "M", "Z", "gestureInProgress", "Lf0P/V$n;", "FX", "Lf0P/V$n;", "borderAdapter", "B", "Ljava/lang/Integer;", "selectedBorderPosition", "Lcom/alightcreative/app/motion/activities/EditActivity$Wre;", "J", "Lcom/alightcreative/app/motion/activities/EditActivity$Wre;", "guideDuration", "", "Lcom/alightcreative/app/motion/scene/StrokeEnd;", "D", "Ljava/util/Map;", "endStyleMapLong", "v", "setAutoTabSpacing", "autoTabSpacing", "Landroid/animation/ValueAnimator;", "Landroid/animation/ValueAnimator;", "revealAnimation", "Lkotlin/Function1;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "animated", "GR", "Lkotlin/jvm/functions/Function1;", "panelCloser", "Nxk", "isClosed", "LLdY/Ml$j;", "Y", "LLdY/Ml$j;", "undoBatch", "", "k", "[I", "progressToWidthTable", "dR0", "F", "prevX", "z", "prevY", "", "Lf0P/F8;", "lLA", "()Ljava/util/List;", "keyableSettings", "Lf0P/Ny$j;", "tabs", "j", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBorderAndShadowFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BorderAndShadowFragment.kt\ncom/alightcreative/app/motion/activities/edit/fragments/BorderAndShadowFragment\n+ 2 Lens.kt\ncom/alightcreative/lens/LensKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 6 ShowKeypad.kt\ncom/alightcreative/app/motion/numerickeypad/ShowKeypadKt\n+ 7 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 8 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 9 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,1576:1\n143#2:1577\n132#2:1578\n124#2:1579\n143#2:1580\n132#2:1581\n124#2:1582\n143#2:1583\n124#2:1584\n143#2:1585\n124#2:1586\n143#2:1587\n124#2:1588\n143#2:1589\n124#2:1590\n148#2:1591\n143#2:1592\n124#2:1593\n148#2:1594\n143#2:1595\n124#2:1596\n143#2:1610\n132#2:1611\n124#2:1612\n143#2:1613\n132#2:1614\n124#2:1615\n143#2:1632\n124#2:1633\n143#2:1634\n124#2:1635\n143#2:1636\n124#2:1637\n143#2:1638\n124#2:1639\n148#2:1643\n143#2:1644\n124#2:1645\n148#2:1646\n143#2:1647\n124#2:1648\n143#2:1663\n143#2:1664\n132#2:1665\n124#2:1672\n148#2:1673\n143#2:1674\n124#2:1675\n148#2:1676\n143#2:1677\n124#2:1678\n124#2:1766\n774#3:1597\n865#3,2:1598\n1611#3,9:1600\n1863#3:1609\n1864#3:1617\n1620#3:1618\n774#3:1619\n865#3,2:1620\n1611#3,9:1622\n1863#3:1631\n1864#3:1641\n1620#3:1642\n1863#3,2:1649\n1863#3,2:1651\n1863#3,2:1653\n1863#3,2:1655\n295#3,2:1666\n295#3,2:1668\n295#3,2:1670\n1#4:1616\n1#4:1640\n1#4:1765\n1826#5,6:1657\n36#6,8:1679\n68#6,23:1687\n92#6,7:1715\n48#6:1722\n61#6,30:1723\n92#6,7:1758\n30#7:1710\n30#7:1753\n53#8,3:1711\n53#8,3:1754\n33#9:1714\n33#9:1757\n*S KotlinDebug\n*F\n+ 1 BorderAndShadowFragment.kt\ncom/alightcreative/app/motion/activities/edit/fragments/BorderAndShadowFragment\n*L\n120#1:1577\n120#1:1578\n120#1:1579\n121#1:1580\n121#1:1581\n121#1:1582\n127#1:1583\n127#1:1584\n130#1:1585\n130#1:1586\n132#1:1587\n132#1:1588\n135#1:1589\n135#1:1590\n143#1:1591\n143#1:1592\n143#1:1593\n149#1:1594\n149#1:1595\n149#1:1596\n166#1:1610\n166#1:1611\n166#1:1612\n167#1:1613\n167#1:1614\n167#1:1615\n175#1:1632\n175#1:1633\n178#1:1634\n178#1:1635\n180#1:1636\n180#1:1637\n183#1:1638\n183#1:1639\n193#1:1643\n193#1:1644\n193#1:1645\n199#1:1646\n199#1:1647\n199#1:1648\n766#1:1663\n891#1:1664\n891#1:1665\n936#1:1672\n517#1:1673\n517#1:1674\n517#1:1675\n530#1:1676\n530#1:1677\n530#1:1678\n940#1:1766\n164#1:1597\n164#1:1598,2\n164#1:1600,9\n164#1:1609\n164#1:1617\n164#1:1618\n173#1:1619\n173#1:1620,2\n173#1:1622,9\n173#1:1631\n173#1:1641\n173#1:1642\n271#1:1649,2\n275#1:1651,2\n663#1:1653,2\n664#1:1655,2\n901#1:1666,2\n929#1:1668,2\n931#1:1670,2\n164#1:1616\n173#1:1640\n711#1:1657,6\n532#1:1679,8\n532#1:1687,23\n532#1:1715,7\n532#1:1722\n570#1:1723,30\n570#1:1758,7\n532#1:1710\n570#1:1753\n532#1:1711,3\n570#1:1754,3\n532#1:1714\n570#1:1757\n*E\n"})
public final class V extends NO implements yc.QhI, yc.DAz, yc.Buf {

    /* JADX INFO: renamed from: B, reason: collision with root package name and from kotlin metadata */
    private Integer selectedBorderPosition;

    /* JADX INFO: renamed from: E, reason: collision with root package name and from kotlin metadata */
    private String paramName;

    /* JADX INFO: renamed from: FX, reason: collision with root package name and from kotlin metadata */
    private n borderAdapter;

    /* JADX INFO: renamed from: GR, reason: collision with root package name and from kotlin metadata */
    private Function1 panelCloser;

    /* JADX INFO: renamed from: I, reason: collision with root package name and from kotlin metadata */
    private ValueAnimator revealAnimation;

    /* JADX INFO: renamed from: M, reason: collision with root package name and from kotlin metadata */
    private boolean gestureInProgress;

    /* JADX INFO: renamed from: Nxk, reason: from kotlin metadata */
    private boolean isClosed;

    /* JADX INFO: renamed from: dR0, reason: from kotlin metadata */
    private float prevX;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private float prevY;

    /* JADX INFO: renamed from: p5, reason: from kotlin metadata */
    private final Lazy contentBinding = LazyKt.lazy(new Function0() { // from class: f0P.R6
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return V.Co(this.f64646n);
        }
    });

    /* JADX INFO: renamed from: eF, reason: from kotlin metadata */
    private final int layoutResource = 2131558590;

    /* JADX INFO: renamed from: J, reason: collision with root package name and from kotlin metadata */
    private EditActivity.Wre guideDuration = EditActivity.Wre.f44461t;

    /* JADX INFO: renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final Map endStyleMapLong = MapsKt.mapOf(TuplesKt.to(StrokeEnd.None, 2131232005), TuplesKt.to(StrokeEnd.Arrow, 2131231989), TuplesKt.to(StrokeEnd.TLine, 2131232000), TuplesKt.to(StrokeEnd.Square, 2131231999), TuplesKt.to(StrokeEnd.FilledSquare, 2131231995), TuplesKt.to(StrokeEnd.Diamond, 2131231991), TuplesKt.to(StrokeEnd.FilledDiamond, 2131231994), TuplesKt.to(StrokeEnd.HollowCircle, 2131231990), TuplesKt.to(StrokeEnd.FilledCircle, 2131231993), TuplesKt.to(StrokeEnd.HollowArrow, 2131231997), TuplesKt.to(StrokeEnd.FilledArrow, 2131231992), TuplesKt.to(StrokeEnd.HollowTeardrop, 2131231998), TuplesKt.to(StrokeEnd.FilledTeardrop, 2131231996));

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private boolean autoTabSpacing = true;

    /* JADX INFO: renamed from: Y, reason: collision with root package name and from kotlin metadata */
    private Ml.j undoBatch = LdY.Ml.Ik.n();

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final int[] progressToWidthTable = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 22, 24, 26, 28, 30, 33, 36, 40, 45, 50, 60, 70, 80, 90, 100, com.safedk.android.analytics.brandsafety.b.f61769v, 140, 160, 180, 200, 250, com.safedk.android.internal.d.f62986a};

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    /* synthetic */ class K extends FunctionReferenceImpl implements Function0 {
        K(Object obj) {
            super(0, obj, V.class, "closePanel", "closePanel()Z", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(((V) this.receiver).bZm());
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    /* synthetic */ class Lu extends FunctionReferenceImpl implements Function0 {
        Lu(Object obj) {
            super(0, obj, V.class, "onAddBorderClick", "onAddBorderClick()V", 0);
        }

        public final void n() {
            ((V) this.receiver).oz();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            n();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public static final class Md implements ColorPickerWidget.n {
        public static void safedk_Fragment_startActivityForResult_6fd6bf7695baae8f1a141a4d4340bbe1(Fragment p0, Intent p1, int p2) {
            Logger.d("SafeDK-Special|SafeDK: Call> Landroidx/fragment/app/Fragment;->startActivityForResult(Landroid/content/Intent;I)V");
            if (p1 == null) {
                return;
            }
            p0.startActivityForResult(p1, p2);
        }

        Md() {
        }

        @Override // com.alightcreative.app.motion.activities.edit.widgets.ColorPickerWidget.n
        public void n(int i2) {
            Object string;
            if (V.this.getCurrentTabId() == 2131363826) {
                j jVar = new PropertyReference1Impl() { // from class: f0P.V.Md.j
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return ((SceneElement) obj).getStroke();
                    }
                };
                n nVar = new PropertyReference1Impl() { // from class: f0P.V.Md.n
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return ((KeyableEdgeDecoration) obj).getColor();
                    }
                };
                string = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), nVar.getReturnType(), new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), jVar.getReturnType(), jVar), nVar).toString();
            } else {
                string = Unit.INSTANCE;
            }
            V v2 = V.this;
            Pair[] pairArr = {TuplesKt.to("CURRENT_COLOR", Integer.valueOf(i2)), TuplesKt.to("COLOR_LENS", string)};
            FragmentActivity fragmentActivityRequireActivity = v2.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            Pair[] pairArr2 = (Pair[]) Arrays.copyOf(pairArr, 2);
            Intent intent = new Intent(fragmentActivityRequireActivity, (Class<?>) ColorPickerActivity.class);
            intent.putExtras(BundleKt.n((Pair[]) Arrays.copyOf(pairArr2, pairArr2.length)));
            safedk_Fragment_startActivityForResult_6fd6bf7695baae8f1a141a4d4340bbe1(v2, intent, 100);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public static final class Sis extends ItemTouchHelper.SimpleCallback {
        private int J2;
        private int Uo;

        Sis() {
            super(3, 4);
            this.J2 = -1;
            this.Uo = -1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SceneElement T(int i2, Scene scene, SceneElement el) {
            Intrinsics.checkNotNullParameter(scene, "<unused var>");
            Intrinsics.checkNotNullParameter(el, "el");
            return SceneElement.copy$default(el, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, CollectionsKt.minus(el.getBorders(), el.getBorders().get(i2)), null, false, null, null, false, null, null, Integer.MAX_VALUE, 127, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SceneElement X(Sis sis, Scene scene, SceneElement element) {
            Intrinsics.checkNotNullParameter(scene, "<unused var>");
            Intrinsics.checkNotNullParameter(element, "element");
            return SceneElement.copy$default(element, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, HI0.rv6.rl(element.getBorders(), sis.J2, sis.Uo), null, false, null, null, false, null, null, Integer.MAX_VALUE, 127, null);
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public boolean ViF(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
            Intrinsics.checkNotNullParameter(target, "target");
            SceneElement sceneElementNHg = HW.C.nHg(V.this);
            if (sceneElementNHg == null) {
                return false;
            }
            if (this.J2 == -1) {
                this.J2 = viewHolder.getBindingAdapterPosition();
            }
            this.Uo = RangesKt.coerceAtMost(target.getBindingAdapterPosition(), CollectionsKt.getLastIndex(sceneElementNHg.getBorders()));
            RecyclerView.Adapter adapter = V.this.q9().rl.getAdapter();
            j jVar = adapter instanceof j ? (j) adapter : null;
            if (jVar != null) {
                return jVar.S(viewHolder.getBindingAdapterPosition(), target.getBindingAdapterPosition());
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.SimpleCallback, androidx.recyclerview.widget.ItemTouchHelper.Callback
        public int gh(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
            j.C0864j c0864j = viewHolder instanceof j.C0864j ? (j.C0864j) viewHolder : null;
            if ((c0864j != null ? c0864j.nr() : null) instanceof SJ0.FKk) {
                return 0;
            }
            return super.gh(recyclerView, viewHolder);
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public void t(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            int i2;
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
            SceneElement sceneElementNHg = HW.C.nHg(V.this);
            if (sceneElementNHg != null && this.J2 != -1) {
                int size = sceneElementNHg.getBorders().size();
                int i3 = this.J2;
                if (i3 >= 0 && i3 < size && (i2 = this.Uo) != -1 && i3 != i2) {
                    HW.C.D(V.this, new Function2() { // from class: f0P.l
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return V.Sis.X(this.f65747n, (Scene) obj, (SceneElement) obj2);
                        }
                    });
                }
            }
            this.J2 = -1;
            this.Uo = -1;
            super.t(recyclerView, viewHolder);
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public void te(RecyclerView.ViewHolder viewHolder, int i2) {
            List<KeyableEdgeDecoration> listEmptyList;
            Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
            final int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
            RecyclerView.Adapter adapter = V.this.q9().rl.getAdapter();
            j jVar = adapter instanceof j ? (j) adapter : null;
            if (jVar != null) {
                jVar.XQ(bindingAdapterPosition);
            }
            HW.C.D(V.this, new Function2() { // from class: f0P.jL
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return V.Sis.T(bindingAdapterPosition, (Scene) obj, (SceneElement) obj2);
                }
            });
            RecyclerView.Adapter adapter2 = V.this.q9().rl.getAdapter();
            Intrinsics.checkNotNull(adapter2, "null cannot be cast to non-null type com.alightcreative.app.motion.activities.edit.fragments.BorderAndShadowFragment.BorderListAdapter");
            j jVar2 = (j) adapter2;
            SceneElement sceneElementNHg = HW.C.nHg(V.this);
            if (sceneElementNHg == null || (listEmptyList = sceneElementNHg.getBorders()) == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            jVar2.WPU(listEmptyList);
            jVar2.notifyDataSetChanged();
            V.this.s7N();
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    /* synthetic */ class h extends FunctionReferenceImpl implements Function2 {
        h(Object obj) {
            super(2, obj, V.class, "onBorderSettingsClick", "onBorderSettingsClick(Landroid/view/View;I)V", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            n((View) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        public final void n(View p0, int i2) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((V) this.receiver).d(p0, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    final class j extends RecyclerView.Adapter {
        final /* synthetic */ V J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private int f64824O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Context f64825n;
        private final Function2 nr;
        private List rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Function0 f64826t;

        /* JADX INFO: renamed from: f0P.V$j$j, reason: collision with other inner class name */
        public final class C0864j extends RecyclerView.ViewHolder {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final ViewBinding f64827n;
            final /* synthetic */ j rl;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0864j(j jVar, ViewBinding itemBinding) {
                super(itemBinding.getRoot());
                Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
                this.rl = jVar;
                this.f64827n = itemBinding;
            }

            public final ViewBinding nr() {
                return this.f64827n;
            }
        }

        public /* synthetic */ class n {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EdgeDecorationDirection.values().length];
                try {
                    iArr[EdgeDecorationDirection.INSIDE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EdgeDecorationDirection.CENTERED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EdgeDecorationDirection.OUTSIDE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public j(V v2, Context context, List borders, Function0 onAddBorderClickListener, Function2 onBorderSettingsClickListener) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(borders, "borders");
            Intrinsics.checkNotNullParameter(onAddBorderClickListener, "onAddBorderClickListener");
            Intrinsics.checkNotNullParameter(onBorderSettingsClickListener, "onBorderSettingsClickListener");
            this.J2 = v2;
            this.f64825n = context;
            this.rl = borders;
            this.f64826t = onAddBorderClickListener;
            this.nr = onBorderSettingsClickListener;
            this.f64824O = -1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void o(j jVar, C0864j c0864j, int i2) {
            Function2 function2 = jVar.nr;
            View itemView = c0864j.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            function2.invoke(itemView, Integer.valueOf(i2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void r(j jVar, C0864j c0864j, int i2, View view) {
            Function2 function2 = jVar.nr;
            View itemView = c0864j.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            function2.invoke(itemView, Integer.valueOf(i2));
        }

        public final void HI() {
            this.f64826t.invoke();
            this.f64824O = this.rl.size() - 1;
            notifyDataSetChanged();
        }

        public final boolean S(int i2, int i3) {
            if (i2 >= this.rl.size() || i3 >= this.rl.size()) {
                return false;
            }
            HI0.rv6.rl(this.rl, i2, i3);
            notifyItemMoved(i2, i3);
            return true;
        }

        public final void WPU(List list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.rl = list;
        }

        public final boolean XQ(int i2) {
            if (i2 >= this.rl.size()) {
                return false;
            }
            notifyItemRemoved(i2);
            return true;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
        public C0864j onCreateViewHolder(ViewGroup parent, int i2) {
            ViewBinding viewBindingT;
            Intrinsics.checkNotNullParameter(parent, "parent");
            if (i2 == 2131558496) {
                viewBindingT = SJ0.pO.t(LayoutInflater.from(parent.getContext()), parent, false);
                Intrinsics.checkNotNull(viewBindingT);
            } else {
                if (i2 != 2131558545) {
                    throw new UnsupportedOperationException();
                }
                viewBindingT = SJ0.FKk.t(LayoutInflater.from(parent.getContext()), parent, false);
                Intrinsics.checkNotNull(viewBindingT);
            }
            return new C0864j(this, viewBindingT);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: ck, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(final C0864j holder, final int i2) {
            String string;
            Intrinsics.checkNotNullParameter(holder, "holder");
            ViewBinding viewBindingNr = holder.nr();
            if (viewBindingNr instanceof SJ0.FKk) {
                if (getItemCount() >= 9) {
                    ((SJ0.FKk) holder.nr()).rl.setEnabled(false);
                    ((SJ0.FKk) holder.nr()).f9127t.setColorFilter(this.f64825n.getResources().getColor(2131100120, null));
                    ((SJ0.FKk) holder.nr()).nr.setTextColor(this.f64825n.getResources().getColor(2131100120, null));
                } else {
                    ((SJ0.FKk) holder.nr()).rl.setEnabled(true);
                    ((SJ0.FKk) holder.nr()).f9127t.setColorFilter(-1);
                    ((SJ0.FKk) holder.nr()).nr.setTextColor(-1);
                }
                ((SJ0.FKk) holder.nr()).nr.setText(this.f64825n.getResources().getString(2132017204));
                holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: f0P.dT
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        V.j.Ik(this.f65486n, view);
                    }
                });
                return;
            }
            if (viewBindingNr instanceof SJ0.pO) {
                KeyableEdgeDecoration keyableEdgeDecoration = (KeyableEdgeDecoration) this.rl.get(i2);
                int i3 = n.$EnumSwitchMapping$0[keyableEdgeDecoration.getDirection().ordinal()];
                if (i3 == 1) {
                    string = this.f64825n.getResources().getString(2132017358);
                } else if (i3 == 2) {
                    string = this.f64825n.getResources().getString(2132017357);
                } else {
                    if (i3 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    string = this.f64825n.getResources().getString(2132017359);
                }
                Intrinsics.checkNotNull(string);
                SceneElement sceneElementNHg = HW.C.nHg(this.J2);
                if (sceneElementNHg == null) {
                    return;
                }
                float fFractionalTime = SceneElementKt.fractionalTime(sceneElementNHg, HW.C.WPU(this.J2));
                int iFloatValue = (int) ((Number) KeyableKt.valueAtTime(keyableEdgeDecoration.getSize(), fFractionalTime)).floatValue();
                ((SJ0.pO) holder.nr()).rl.setColor(ColorKt.toInt((SolidColor) KeyableKt.valueAtTime(keyableEdgeDecoration.getColor(), fFractionalTime)));
                ((SJ0.pO) holder.nr()).nr.setText(iFloatValue + "px");
                ((SJ0.pO) holder.nr()).f9589O.setText(string);
                holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: f0P.AZy
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        V.j.r(this.f64071n, holder, i2, view);
                    }
                });
                if (this.f64824O == i2) {
                    this.f64824O = -1;
                    holder.itemView.post(new Runnable() { // from class: f0P.S
                        @Override // java.lang.Runnable
                        public final void run() {
                            V.j.o(this.f64665n, holder, i2);
                        }
                    });
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.rl.size() + 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i2) {
            return i2 >= this.rl.size() ? 2131558545 : 2131558496;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void Ik(j jVar, View view) {
            jVar.HI();
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    /* synthetic */ class l4Z extends FunctionReferenceImpl implements Function0 {
        l4Z(Object obj) {
            super(0, obj, V.class, "borderUpdateListener", "borderUpdateListener()V", 0);
        }

        public final void n() {
            ((V) this.receiver).I4p();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            n();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public static final class lej extends AnimatorListenerAdapter {
        lej() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            if (V.this.isAdded()) {
                V.this.q9().rl.setVisibility(0);
                V.this.q9().nr.setVisibility(4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    final class n extends RecyclerView.Adapter {
        private View J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private TextView f64832O;
        final /* synthetic */ V Uo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final oA.j f64833n;
        private final int nr;
        private final List rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Function0 f64834t;

        public final class j extends RecyclerView.ViewHolder {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final ViewBinding f64835n;
            final /* synthetic */ n rl;

            public static final class Ml implements ColorPickerWidget.w6 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ V f64840n;

                @Override // com.alightcreative.app.motion.activities.edit.widgets.ColorPickerWidget.w6
                public void nr() {
                }

                @Override // com.alightcreative.app.motion.activities.edit.widgets.ColorPickerWidget.w6
                public void rl() {
                }

                Ml(V v2) {
                    this.f64840n = v2;
                }

                @Override // com.alightcreative.app.motion.activities.edit.widgets.ColorPickerWidget.w6
                public void n() {
                    SceneHolder sceneHolderE = HW.C.e(this.f64840n);
                    if (sceneHolderE != null) {
                        sceneHolderE.setEditMode(2131362629);
                    }
                }

                @Override // com.alightcreative.app.motion.activities.edit.widgets.ColorPickerWidget.w6
                public void t() {
                    SceneHolder sceneHolderE = HW.C.e(this.f64840n);
                    if (sceneHolderE != null) {
                        sceneHolderE.setEditMode(2131362630);
                    }
                }
            }

            public static final class Pl implements Function1 {
                final /* synthetic */ UserParameter J2;

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                final /* synthetic */ Object f64841O;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ Ref.ObjectRef f64842n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                final /* synthetic */ oA.j f64843o;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ Fragment f64844r;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ r.UGc f64845t;

                /* JADX INFO: renamed from: f0P.V$n$j$Pl$j, reason: collision with other inner class name */
                public static final class C0865j implements Function2 {

                    /* JADX INFO: renamed from: O, reason: collision with root package name */
                    final /* synthetic */ Object f64846O;

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    final /* synthetic */ oA.j f64847n;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    final /* synthetic */ Fragment f64848t;

                    /* JADX INFO: renamed from: f0P.V$n$j$Pl$j$j, reason: collision with other inner class name */
                    public static final class C0866j implements Function1 {
                        final /* synthetic */ Object J2;

                        /* JADX INFO: renamed from: O, reason: collision with root package name */
                        final /* synthetic */ Fragment f64849O;

                        /* JADX INFO: renamed from: n, reason: collision with root package name */
                        final /* synthetic */ Scene f64850n;

                        /* JADX INFO: renamed from: t, reason: collision with root package name */
                        final /* synthetic */ SceneElement f64851t;

                        public C0866j(Scene scene, SceneElement sceneElement, Fragment fragment, Object obj) {
                            this.f64850n = scene;
                            this.f64851t = sceneElement;
                            this.f64849O = fragment;
                            this.J2 = obj;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                        public final Keyable invoke(Keyable it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            return KeyableKt.copyWithValueForTime(it, this.f64850n, this.f64851t, HW.C.aYN(this.f64849O), this.J2);
                        }
                    }

                    public C0865j(oA.j jVar, Fragment fragment, Object obj) {
                        this.f64847n = jVar;
                        this.f64848t = fragment;
                        this.f64846O = obj;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                    public final SceneElement invoke(Scene scene, SceneElement el) {
                        Intrinsics.checkNotNullParameter(scene, "scene");
                        Intrinsics.checkNotNullParameter(el, "el");
                        return (SceneElement) this.f64847n.t(el, new C0866j(scene, el, this.f64848t, this.f64846O));
                    }
                }

                public Pl(Ref.ObjectRef objectRef, r.UGc uGc, Object obj, UserParameter userParameter, Fragment fragment, oA.j jVar) {
                    this.f64842n = objectRef;
                    this.f64845t = uGc;
                    this.f64841O = obj;
                    this.J2 = userParameter;
                    this.f64844r = fragment;
                    this.f64843o = jVar;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    n((List) obj);
                    return Unit.INSTANCE;
                }

                /* JADX WARN: Type inference failed for: r1v13, types: [LdY.Ml$j, T] */
                public final void n(List valueList) {
                    Float fValueOf;
                    Intrinsics.checkNotNullParameter(valueList, "valueList");
                    Ref.ObjectRef objectRef = this.f64842n;
                    if (objectRef.element == 0) {
                        objectRef.element = HW.C.xMQ(this.f64845t);
                    }
                    Object obj = this.f64841O;
                    UserParameter userParameter = this.J2;
                    if (obj instanceof Quaternion) {
                        Object objFromEulerAngles = Quaternion.INSTANCE.fromEulerAngles(((Number) valueList.get(0)).floatValue(), ((Number) valueList.get(1)).floatValue(), ((Number) valueList.get(2)).floatValue());
                        if (objFromEulerAngles == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
                        }
                        fValueOf = (Float) objFromEulerAngles;
                    } else if (obj instanceof Vector2D) {
                        fValueOf = (Float) new Vector2D(((Number) valueList.get(0)).floatValue(), ((Number) valueList.get(1)).floatValue());
                    } else if (obj instanceof Vector3D) {
                        fValueOf = (Float) new Vector3D(((Number) valueList.get(0)).floatValue(), ((Number) valueList.get(1)).floatValue(), ((Number) valueList.get(2)).floatValue());
                    } else if (!(obj instanceof Float)) {
                        Object obj2 = valueList.get(0);
                        if (obj2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
                        }
                        fValueOf = (Float) obj2;
                    } else if (userParameter instanceof UserParameter.Spinner) {
                        UserParameter.Spinner spinner = (UserParameter.Spinner) userParameter;
                        fValueOf = Float.valueOf(UserParameterKt.calcSliderTypeValueForSaving(spinner.getSliderType(), ((Number) valueList.get(0)).floatValue() / spinner.getMultiplier()));
                    } else if (userParameter instanceof UserParameter.Slider) {
                        fValueOf = Float.valueOf(UserParameterKt.calcSliderTypeValueForSaving(((UserParameter.Slider) userParameter).getSliderType(), ((Number) valueList.get(0)).floatValue()));
                    } else {
                        Object obj3 = valueList.get(0);
                        if (obj3 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
                        }
                        fValueOf = (Float) obj3;
                    }
                    Fragment fragment = this.f64844r;
                    HW.C.D(fragment, new C0865j(this.f64843o, fragment, fValueOf));
                }
            }

            public static final class Xo implements Function1 {
                final /* synthetic */ UserParameter J2;

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                final /* synthetic */ Object f64853O;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ Ref.ObjectRef f64854n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                final /* synthetic */ oA.j f64855o;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ Fragment f64856r;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ r.UGc f64857t;

                /* JADX INFO: renamed from: f0P.V$n$j$Xo$j, reason: collision with other inner class name */
                public static final class C0867j implements Function2 {

                    /* JADX INFO: renamed from: O, reason: collision with root package name */
                    final /* synthetic */ Object f64858O;

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    final /* synthetic */ oA.j f64859n;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    final /* synthetic */ Fragment f64860t;

                    /* JADX INFO: renamed from: f0P.V$n$j$Xo$j$j, reason: collision with other inner class name */
                    public static final class C0868j implements Function1 {
                        final /* synthetic */ Object J2;

                        /* JADX INFO: renamed from: O, reason: collision with root package name */
                        final /* synthetic */ Fragment f64861O;

                        /* JADX INFO: renamed from: n, reason: collision with root package name */
                        final /* synthetic */ Scene f64862n;

                        /* JADX INFO: renamed from: t, reason: collision with root package name */
                        final /* synthetic */ SceneElement f64863t;

                        public C0868j(Scene scene, SceneElement sceneElement, Fragment fragment, Object obj) {
                            this.f64862n = scene;
                            this.f64863t = sceneElement;
                            this.f64861O = fragment;
                            this.J2 = obj;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                        public final Keyable invoke(Keyable it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            return KeyableKt.copyWithValueForTime(it, this.f64862n, this.f64863t, HW.C.aYN(this.f64861O), this.J2);
                        }
                    }

                    public C0867j(oA.j jVar, Fragment fragment, Object obj) {
                        this.f64859n = jVar;
                        this.f64860t = fragment;
                        this.f64858O = obj;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                    public final SceneElement invoke(Scene scene, SceneElement el) {
                        Intrinsics.checkNotNullParameter(scene, "scene");
                        Intrinsics.checkNotNullParameter(el, "el");
                        return (SceneElement) this.f64859n.t(el, new C0868j(scene, el, this.f64860t, this.f64858O));
                    }
                }

                public Xo(Ref.ObjectRef objectRef, r.UGc uGc, Object obj, UserParameter userParameter, Fragment fragment, oA.j jVar) {
                    this.f64854n = objectRef;
                    this.f64857t = uGc;
                    this.f64853O = obj;
                    this.J2 = userParameter;
                    this.f64856r = fragment;
                    this.f64855o = jVar;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    n((List) obj);
                    return Unit.INSTANCE;
                }

                /* JADX WARN: Type inference failed for: r1v13, types: [LdY.Ml$j, T] */
                public final void n(List valueList) {
                    Vector2D vector2D;
                    Intrinsics.checkNotNullParameter(valueList, "valueList");
                    Ref.ObjectRef objectRef = this.f64854n;
                    if (objectRef.element == 0) {
                        objectRef.element = HW.C.xMQ(this.f64857t);
                    }
                    Object obj = this.f64853O;
                    UserParameter userParameter = this.J2;
                    if (obj instanceof Quaternion) {
                        Object objFromEulerAngles = Quaternion.INSTANCE.fromEulerAngles(((Number) valueList.get(0)).floatValue(), ((Number) valueList.get(1)).floatValue(), ((Number) valueList.get(2)).floatValue());
                        if (objFromEulerAngles == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.Vector2D");
                        }
                        vector2D = (Vector2D) objFromEulerAngles;
                    } else if (obj instanceof Vector2D) {
                        vector2D = new Vector2D(((Number) valueList.get(0)).floatValue(), ((Number) valueList.get(1)).floatValue());
                    } else if (obj instanceof Vector3D) {
                        vector2D = (Vector2D) new Vector3D(((Number) valueList.get(0)).floatValue(), ((Number) valueList.get(1)).floatValue(), ((Number) valueList.get(2)).floatValue());
                    } else if (!(obj instanceof Float)) {
                        Object obj2 = valueList.get(0);
                        if (obj2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.Vector2D");
                        }
                        vector2D = (Vector2D) obj2;
                    } else if (userParameter instanceof UserParameter.Spinner) {
                        UserParameter.Spinner spinner = (UserParameter.Spinner) userParameter;
                        vector2D = (Vector2D) Float.valueOf(UserParameterKt.calcSliderTypeValueForSaving(spinner.getSliderType(), ((Number) valueList.get(0)).floatValue() / spinner.getMultiplier()));
                    } else if (userParameter instanceof UserParameter.Slider) {
                        vector2D = (Vector2D) Float.valueOf(UserParameterKt.calcSliderTypeValueForSaving(((UserParameter.Slider) userParameter).getSliderType(), ((Number) valueList.get(0)).floatValue()));
                    } else {
                        Object obj3 = valueList.get(0);
                        if (obj3 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.Vector2D");
                        }
                        vector2D = (Vector2D) obj3;
                    }
                    Fragment fragment = this.f64856r;
                    HW.C.D(fragment, new C0867j(this.f64855o, fragment, vector2D));
                }
            }

            /* JADX INFO: renamed from: f0P.V$n$j$n, reason: collision with other inner class name */
            public static final class C0870n implements ColorPickerWidget.j {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ View f64867n;
                final /* synthetic */ V rl;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ n f64868t;

                C0870n(View view, V v2, n nVar) {
                    this.f64867n = view;
                    this.rl = v2;
                    this.f64868t = nVar;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Keyable O(Scene scene, SceneElement sceneElement, V v2, int i2, Keyable newColor) {
                    Intrinsics.checkNotNullParameter(newColor, "newColor");
                    return KeyableKt.copyWithValueForTime(newColor, scene, sceneElement, HW.C.aYN(v2), HI0.qf.t(i2));
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final SceneElement nr(n nVar, final V v2, final int i2, final Scene scene, final SceneElement el) {
                    Intrinsics.checkNotNullParameter(scene, "scene");
                    Intrinsics.checkNotNullParameter(el, "el");
                    oA.j jVarQie = nVar.qie();
                    C0871j c0871j = new PropertyReference1Impl() { // from class: f0P.V.n.j.n.j
                        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                        public Object get(Object obj) {
                            return ((KeyableEdgeDecoration) obj).getColor();
                        }
                    };
                    return (SceneElement) new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), c0871j.getReturnType(), jVarQie, c0871j).t(el, new Function1() { // from class: f0P.ys8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return V.n.j.C0870n.O(scene, el, v2, i2, (Keyable) obj);
                        }
                    });
                }

                @Override // com.alightcreative.app.motion.activities.edit.widgets.ColorPickerWidget.j
                public void n(final int i2) {
                    ((ColorView) this.f64867n).setColor(i2);
                    final V v2 = this.rl;
                    final n nVar = this.f64868t;
                    HW.C.D(v2, new Function2() { // from class: f0P.oJ
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return V.n.j.C0870n.nr(nVar, v2, i2, (Scene) obj, (SceneElement) obj2);
                        }
                    });
                }
            }

            public static final class qz implements Function1 {
                final /* synthetic */ UserParameter J2;

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                final /* synthetic */ Object f64871O;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ Ref.ObjectRef f64872n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                final /* synthetic */ oA.j f64873o;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ Fragment f64874r;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ r.UGc f64875t;

                /* JADX INFO: renamed from: f0P.V$n$j$qz$j, reason: collision with other inner class name */
                public static final class C0872j implements Function2 {

                    /* JADX INFO: renamed from: O, reason: collision with root package name */
                    final /* synthetic */ Object f64876O;

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    final /* synthetic */ oA.j f64877n;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    final /* synthetic */ Fragment f64878t;

                    /* JADX INFO: renamed from: f0P.V$n$j$qz$j$j, reason: collision with other inner class name */
                    public static final class C0873j implements Function1 {
                        final /* synthetic */ Object J2;

                        /* JADX INFO: renamed from: O, reason: collision with root package name */
                        final /* synthetic */ Fragment f64879O;

                        /* JADX INFO: renamed from: n, reason: collision with root package name */
                        final /* synthetic */ Scene f64880n;

                        /* JADX INFO: renamed from: t, reason: collision with root package name */
                        final /* synthetic */ SceneElement f64881t;

                        public C0873j(Scene scene, SceneElement sceneElement, Fragment fragment, Object obj) {
                            this.f64880n = scene;
                            this.f64881t = sceneElement;
                            this.f64879O = fragment;
                            this.J2 = obj;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                        public final Keyable invoke(Keyable it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            return KeyableKt.copyWithValueForTime(it, this.f64880n, this.f64881t, HW.C.aYN(this.f64879O), this.J2);
                        }
                    }

                    public C0872j(oA.j jVar, Fragment fragment, Object obj) {
                        this.f64877n = jVar;
                        this.f64878t = fragment;
                        this.f64876O = obj;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                    public final SceneElement invoke(Scene scene, SceneElement el) {
                        Intrinsics.checkNotNullParameter(scene, "scene");
                        Intrinsics.checkNotNullParameter(el, "el");
                        return (SceneElement) this.f64877n.t(el, new C0873j(scene, el, this.f64878t, this.f64876O));
                    }
                }

                public qz(Ref.ObjectRef objectRef, r.UGc uGc, Object obj, UserParameter userParameter, Fragment fragment, oA.j jVar) {
                    this.f64872n = objectRef;
                    this.f64875t = uGc;
                    this.f64871O = obj;
                    this.J2 = userParameter;
                    this.f64874r = fragment;
                    this.f64873o = jVar;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    n((List) obj);
                    return Unit.INSTANCE;
                }

                /* JADX WARN: Type inference failed for: r1v13, types: [LdY.Ml$j, T] */
                public final void n(List valueList) {
                    Vector2D vector2D;
                    Intrinsics.checkNotNullParameter(valueList, "valueList");
                    Ref.ObjectRef objectRef = this.f64872n;
                    if (objectRef.element == 0) {
                        objectRef.element = HW.C.xMQ(this.f64875t);
                    }
                    Object obj = this.f64871O;
                    UserParameter userParameter = this.J2;
                    if (obj instanceof Quaternion) {
                        Object objFromEulerAngles = Quaternion.INSTANCE.fromEulerAngles(((Number) valueList.get(0)).floatValue(), ((Number) valueList.get(1)).floatValue(), ((Number) valueList.get(2)).floatValue());
                        if (objFromEulerAngles == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.Vector2D");
                        }
                        vector2D = (Vector2D) objFromEulerAngles;
                    } else if (obj instanceof Vector2D) {
                        vector2D = new Vector2D(((Number) valueList.get(0)).floatValue(), ((Number) valueList.get(1)).floatValue());
                    } else if (obj instanceof Vector3D) {
                        vector2D = (Vector2D) new Vector3D(((Number) valueList.get(0)).floatValue(), ((Number) valueList.get(1)).floatValue(), ((Number) valueList.get(2)).floatValue());
                    } else if (!(obj instanceof Float)) {
                        Object obj2 = valueList.get(0);
                        if (obj2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.Vector2D");
                        }
                        vector2D = (Vector2D) obj2;
                    } else if (userParameter instanceof UserParameter.Spinner) {
                        UserParameter.Spinner spinner = (UserParameter.Spinner) userParameter;
                        vector2D = (Vector2D) Float.valueOf(UserParameterKt.calcSliderTypeValueForSaving(spinner.getSliderType(), ((Number) valueList.get(0)).floatValue() / spinner.getMultiplier()));
                    } else if (userParameter instanceof UserParameter.Slider) {
                        vector2D = (Vector2D) Float.valueOf(UserParameterKt.calcSliderTypeValueForSaving(((UserParameter.Slider) userParameter).getSliderType(), ((Number) valueList.get(0)).floatValue()));
                    } else {
                        Object obj3 = valueList.get(0);
                        if (obj3 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.Vector2D");
                        }
                        vector2D = (Vector2D) obj3;
                    }
                    Fragment fragment = this.f64874r;
                    HW.C.D(fragment, new C0872j(this.f64873o, fragment, vector2D));
                }
            }

            public static final class w6 implements ColorPickerWidget.n {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ V f64882n;
                final /* synthetic */ yU.Ml rl;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ n f64883t;

                public static void safedk_Fragment_startActivityForResult_6fd6bf7695baae8f1a141a4d4340bbe1(Fragment p0, Intent p1, int p2) {
                    Logger.d("SafeDK-Special|SafeDK: Call> Landroidx/fragment/app/Fragment;->startActivityForResult(Landroid/content/Intent;I)V");
                    if (p1 == null) {
                        return;
                    }
                    p0.startActivityForResult(p1, p2);
                }

                w6(V v2, yU.Ml ml, n nVar) {
                    this.f64882n = v2;
                    this.rl = ml;
                    this.f64883t = nVar;
                }

                @Override // com.alightcreative.app.motion.activities.edit.widgets.ColorPickerWidget.n
                public void n(int i2) {
                    V v2 = this.f64882n;
                    Pair pair = TuplesKt.to("CURRENT_COLOR", Integer.valueOf(i2));
                    Pair pair2 = TuplesKt.to("ALLOW_ALPHA", Boolean.valueOf(this.rl.nr().getAllowAlpha()));
                    oA.j jVarQie = this.f64883t.qie();
                    C0874j c0874j = new PropertyReference1Impl() { // from class: f0P.V.n.j.w6.j
                        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                        public Object get(Object obj) {
                            return ((KeyableEdgeDecoration) obj).getColor();
                        }
                    };
                    Pair[] pairArr = {pair, pair2, TuplesKt.to("COLOR_LENS", new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), c0874j.getReturnType(), jVarQie, c0874j).toString())};
                    FragmentActivity fragmentActivityRequireActivity = v2.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                    Pair[] pairArr2 = (Pair[]) Arrays.copyOf(pairArr, 3);
                    Intent intent = new Intent(fragmentActivityRequireActivity, (Class<?>) ColorPickerActivity.class);
                    intent.putExtras(BundleKt.n((Pair[]) Arrays.copyOf(pairArr2, pairArr2.length)));
                    safedk_Fragment_startActivityForResult_6fd6bf7695baae8f1a141a4d4340bbe1(v2, intent, 100);
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit v(float f3, final UserParameter userParameter, final V v2, j jVar, TextView textView, final n nVar, int i2) {
                float f4 = i2 * f3;
                UserParameter.Spinner spinner = (UserParameter.Spinner) userParameter;
                final float fCoerceIn = RangesKt.coerceIn(f4, spinner.getMinValue(), spinner.getMaxValue());
                M(v2, userParameter, jVar, textView, fCoerceIn);
                HW.C.D(v2, new Function2() { // from class: f0P.s6u
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return V.n.j.rV9(userParameter, nVar, v2, fCoerceIn, (Scene) obj, (SceneElement) obj2);
                    }
                });
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: f0P.V$n$j$j, reason: collision with other inner class name */
            public /* synthetic */ class C0869j {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;
                public static final /* synthetic */ int[] $EnumSwitchMapping$1;
                public static final /* synthetic */ int[] $EnumSwitchMapping$2;

                static {
                    int[] iArr = new int[EdgeDecorationDirection.values().length];
                    try {
                        iArr[EdgeDecorationDirection.INSIDE.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[EdgeDecorationDirection.CENTERED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[EdgeDecorationDirection.OUTSIDE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                    int[] iArr2 = new int[SelectorStyle.values().length];
                    try {
                        iArr2[SelectorStyle.RADIO.ordinal()] = 1;
                    } catch (NoSuchFieldError unused4) {
                    }
                    $EnumSwitchMapping$1 = iArr2;
                    int[] iArr3 = new int[SliderType.values().length];
                    try {
                        iArr3[SliderType.FLOAT.ordinal()] = 1;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr3[SliderType.RELATIVE_FLOAT.ordinal()] = 2;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr3[SliderType.ANGLE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused7) {
                    }
                    try {
                        iArr3[SliderType.ANGLE_RANGE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused8) {
                    }
                    try {
                        iArr3[SliderType.INTEGER.ordinal()] = 5;
                    } catch (NoSuchFieldError unused9) {
                    }
                    try {
                        iArr3[SliderType.RPM.ordinal()] = 6;
                    } catch (NoSuchFieldError unused10) {
                    }
                    try {
                        iArr3[SliderType.f46339HZ.ordinal()] = 7;
                    } catch (NoSuchFieldError unused11) {
                    }
                    try {
                        iArr3[SliderType.PERCENT.ordinal()] = 8;
                    } catch (NoSuchFieldError unused12) {
                    }
                    try {
                        iArr3[SliderType.RELATIVE_PERCENT.ordinal()] = 9;
                    } catch (NoSuchFieldError unused13) {
                    }
                    try {
                        iArr3[SliderType.SECONDS.ordinal()] = 10;
                    } catch (NoSuchFieldError unused14) {
                    }
                    try {
                        iArr3[SliderType.FRAMES.ordinal()] = 11;
                    } catch (NoSuchFieldError unused15) {
                    }
                    try {
                        iArr3[SliderType.KELVIN.ordinal()] = 12;
                    } catch (NoSuchFieldError unused16) {
                    }
                    $EnumSwitchMapping$2 = iArr3;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public j(n nVar, ViewBinding itemBinding) {
                super(itemBinding.getRoot());
                Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
                this.rl = nVar;
                this.f64835n = itemBinding;
            }

            private static final void M(V v2, UserParameter userParameter, j jVar, TextView textView, float f3) {
                String strValueOf;
                double d2;
                String str;
                StringBuilder sb;
                Scene sceneIF = HW.C.iF(v2);
                int framesPerHundredSeconds = sceneIF != null ? sceneIF.getFramesPerHundredSeconds() : 30;
                UserParameter.Spinner spinner = (UserParameter.Spinner) userParameter;
                float multiplier = spinner.getMultiplier() * f3;
                float step = spinner.getStep() * spinner.getMultiplier();
                AppCompatTextView appCompatTextView = ((SJ0.c7r) jVar.f64835n).f9418O;
                switch (C0869j.$EnumSwitchMapping$2[spinner.getSliderType().ordinal()]) {
                    case 1:
                    case 2:
                        double d4 = step;
                        if (d4 < 9.0E-5d) {
                            strValueOf = String.format("%.5f", Arrays.copyOf(new Object[]{Float.valueOf(multiplier)}, 1));
                            Intrinsics.checkNotNullExpressionValue(strValueOf, "format(...)");
                        } else if (d4 < 9.0E-4d) {
                            strValueOf = String.format("%.4f", Arrays.copyOf(new Object[]{Float.valueOf(multiplier)}, 1));
                            Intrinsics.checkNotNullExpressionValue(strValueOf, "format(...)");
                        } else if (d4 < 0.009d) {
                            strValueOf = String.format("%.3f", Arrays.copyOf(new Object[]{Float.valueOf(multiplier)}, 1));
                            Intrinsics.checkNotNullExpressionValue(strValueOf, "format(...)");
                        } else if (d4 < 0.09d) {
                            strValueOf = String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(multiplier)}, 1));
                            Intrinsics.checkNotNullExpressionValue(strValueOf, "format(...)");
                        } else if (d4 >= 0.9d) {
                            strValueOf = String.valueOf(MathKt.roundToInt(multiplier));
                        } else {
                            strValueOf = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(multiplier)}, 1));
                            Intrinsics.checkNotNullExpressionValue(strValueOf, "format(...)");
                        }
                        break;
                    case 3:
                    case 4:
                        SliderType sliderType = spinner.getSliderType();
                        SliderType sliderType2 = SliderType.ANGLE_RANGE;
                        String str2 = (sliderType != sliderType2 || multiplier < -360.0f || multiplier > 360.0f) ? "" : "±";
                        if (multiplier > 360.0f) {
                            float f4 = multiplier % 360;
                            d2 = 0.09d;
                            int iFloor = (int) Math.floor(multiplier / r10);
                            textView.setVisibility(0);
                            if (spinner.getSliderType() == sliderType2) {
                                sb = new StringBuilder();
                                sb.append("±");
                            } else {
                                sb = new StringBuilder();
                            }
                            sb.append(iFloor);
                            sb.append("× + ");
                            textView.setText(sb.toString());
                            multiplier = f4;
                        } else {
                            d2 = 0.09d;
                            if (multiplier < -360.0f) {
                                textView.setVisibility(0);
                                textView.setText("-" + ((int) Math.floor(r2 / r3)) + "×");
                                multiplier = -((-multiplier) % 360);
                            } else {
                                textView.setVisibility(8);
                            }
                        }
                        double d5 = step;
                        if (d5 < 9.0E-5d) {
                            str = String.format("%.5fº", Arrays.copyOf(new Object[]{Float.valueOf(multiplier)}, 1));
                            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                        } else if (d5 < 9.0E-4d) {
                            str = String.format("%.4fº", Arrays.copyOf(new Object[]{Float.valueOf(multiplier)}, 1));
                            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                        } else if (d5 < 0.009d) {
                            str = String.format("%.3fº", Arrays.copyOf(new Object[]{Float.valueOf(multiplier)}, 1));
                            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                        } else if (d5 < d2) {
                            str = String.format("%.2fº", Arrays.copyOf(new Object[]{Float.valueOf(multiplier)}, 1));
                            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                        } else if (d5 < 0.9d) {
                            str = String.format("%.1fº", Arrays.copyOf(new Object[]{Float.valueOf(multiplier)}, 1));
                            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                        } else {
                            str = MathKt.roundToInt(multiplier) + "º";
                        }
                        strValueOf = str2 + str;
                        break;
                    case 5:
                        strValueOf = String.valueOf(MathKt.roundToInt(multiplier));
                        break;
                    case 6:
                        strValueOf = String.valueOf(MathKt.roundToInt(multiplier));
                        break;
                    case 7:
                        strValueOf = String.format("%.2fHz", Arrays.copyOf(new Object[]{Float.valueOf(multiplier)}, 1));
                        Intrinsics.checkNotNullExpressionValue(strValueOf, "format(...)");
                        break;
                    case 8:
                    case 9:
                        double d6 = step;
                        if (d6 >= 0.009d) {
                            strValueOf = d6 >= 0.09d ? d6 >= 9.9d ? MathKt.roundToInt(multiplier) + "%" : MathKt.roundToInt(multiplier * 10.0f) + "%" : MathKt.roundToInt(multiplier * 100.0f) + "%";
                        } else {
                            strValueOf = String.format("%.1f%%", Arrays.copyOf(new Object[]{Float.valueOf(multiplier * 100.0f)}, 1));
                            Intrinsics.checkNotNullExpressionValue(strValueOf, "format(...)");
                        }
                        break;
                    case 10:
                        strValueOf = String.format("%.2fs", Arrays.copyOf(new Object[]{Float.valueOf(multiplier)}, 1));
                        Intrinsics.checkNotNullExpressionValue(strValueOf, "format(...)");
                        break;
                    case 11:
                        strValueOf = TimeKt.formatFrameNumber(MathKt.roundToInt((multiplier * framesPerHundredSeconds) / 100.0f), framesPerHundredSeconds, "s:ff");
                        break;
                    case 12:
                        strValueOf = MathKt.roundToInt(multiplier * 1000.0f) + "K";
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                appCompatTextView.setText(strValueOf);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit P5(Ref.ObjectRef objectRef, V v2) {
                Ml.j jVar = (Ml.j) objectRef.element;
                if (jVar != null) {
                    jVar.n();
                }
                v2.gestureInProgress = false;
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void X(j jVar) {
                ((SJ0.kO4) jVar.f64835n).nr.setColorWidget(null);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Keyable Xw(Scene scene, SceneElement sceneElement, V v2, float f3, Keyable it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return KeyableKt.copyWithValueForTime(it, scene, sceneElement, HW.C.aYN(v2), Float.valueOf(f3));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Keyable bzg(Scene scene, SceneElement sceneElement, V v2, float f3, Keyable it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return KeyableKt.copyWithValueForTime(it, scene, sceneElement, HW.C.aYN(v2), Float.valueOf(f3));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Keyable eF(Scene scene, SceneElement sceneElement, V v2, Vector2D vector2D, Keyable it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return KeyableKt.copyWithValueForTime(it, scene, sceneElement, HW.C.aYN(v2), vector2D);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final EdgeDecorationDirection fD(ChoiceInfo choiceInfo, EdgeDecorationDirection it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return EdgeDecorationDirection.values()[choiceInfo.getValue()];
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final SceneElement iF(n nVar, final ChoiceInfo choiceInfo, Scene scene, SceneElement el) {
                Intrinsics.checkNotNullParameter(scene, "<unused var>");
                Intrinsics.checkNotNullParameter(el, "el");
                oA.j jVarQie = nVar.qie();
                C c2 = new PropertyReference1Impl() { // from class: f0P.V.n.j.C
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return ((KeyableEdgeDecoration) obj).getDirection();
                    }
                };
                return (SceneElement) new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), c2.getReturnType(), jVarQie, c2).t(el, new Function1() { // from class: f0P.D
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return V.n.j.fD(choiceInfo, (EdgeDecorationDirection) obj);
                    }
                });
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Multi-variable type inference failed */
            public static final void jB(n nVar, V v2, UserParameter userParameter, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, ValueSpinner valueSpinner, TextView textView, View view, String str, View view2) {
                Vector2D defaultValue;
                Keyable<Vector2D> offset;
                KeyableEdgeDecoration keyableEdgeDecorationTy = nVar.ty();
                if (keyableEdgeDecorationTy == null || (offset = keyableEdgeDecorationTy.getOffset()) == null || (defaultValue = (Vector2D) KeyableKt.valueAtTime(offset, HW.C.aYN(v2))) == null) {
                    defaultValue = ((UserParameter.Point) userParameter).getDefaultValue();
                }
                Vector2D vector2D = defaultValue;
                if (!appCompatTextView.isActivated()) {
                    appCompatTextView2.setActivated(false);
                    appCompatTextView.setActivated(true);
                    valueSpinner.setNeedleColor(-1);
                    valueSpinner.setValue(MathKt.roundToInt(vector2D.getY()));
                    valueSpinner.invalidate();
                    return;
                }
                E(v2, userParameter, nVar, textView, view, str);
                oA.j jVarQie = nVar.qie();
                fuX fux = new PropertyReference1Impl() { // from class: f0P.V.n.j.fuX
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return ((KeyableEdgeDecoration) obj).getOffset();
                    }
                };
                oA.aC aCVar = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), fux.getReturnType(), jVarQie, fux);
                if (v2.getContext() != null) {
                    List listListOf = CollectionsKt.listOf((Object[]) new String[]{v2.getString(2132019803), v2.getString(2132019805), v2.getString(2132019804)});
                    ArrayList arrayList = new ArrayList();
                    if (userParameter instanceof UserParameter.FloatValue) {
                        Intrinsics.checkNotNull(vector2D, "null cannot be cast to non-null type kotlin.Float");
                        arrayList.add(new C2348n(((Float) vector2D).floatValue(), ((UserParameter.FloatValue) userParameter).getValue(), -1.0f, -1.0f, listListOf.isEmpty() ? "" : (String) listListOf.get(0), false));
                    } else if (userParameter instanceof UserParameter.Angle) {
                        Intrinsics.checkNotNull(vector2D, "null cannot be cast to non-null type kotlin.Float");
                        UserParameter.Angle angle = (UserParameter.Angle) userParameter;
                        arrayList.add(new C2348n(((Float) vector2D).floatValue(), angle.getDefaultValue(), angle.getMinValue(), angle.getMaxValue(), listListOf.isEmpty() ? "" : (String) listListOf.get(0), false));
                    } else {
                        if (userParameter instanceof UserParameter.Point) {
                            if (vector2D != 0) {
                                UserParameter.Point point = (UserParameter.Point) userParameter;
                                arrayList.add(new C2348n(vector2D.getX(), point.getDefaultValue().getX(), point.getMinOffset().getX(), point.getMaxOffset().getX(), listListOf.isEmpty() ? "X" : (String) listListOf.get(0), false));
                                arrayList.add(new C2348n(vector2D.getY(), point.getDefaultValue().getY(), point.getMinOffset().getY(), point.getMaxOffset().getY(), listListOf.size() >= 2 ? (String) listListOf.get(1) : "Y", true));
                            }
                        } else if (!(userParameter instanceof UserParameter.Orientation) && !(userParameter instanceof UserParameter.XYZ) && !(userParameter instanceof UserParameter.Spinner)) {
                            boolean z2 = userParameter instanceof UserParameter.Slider;
                        }
                    }
                    Ref.ObjectRef objectRef = new Ref.ObjectRef();
                    r.UGc uGc = new r.UGc();
                    uGc.v(arrayList);
                    uGc.bzg(new Xo(objectRef, uGc, vector2D, userParameter, v2, aCVar));
                    uGc.rV9(new r.Ln(objectRef));
                    FragmentActivity activity = v2.getActivity();
                    SurfaceView surfaceView = activity != null ? (SurfaceView) activity.findViewById(2131363442) : null;
                    if (surfaceView != null) {
                        Resources resources = v2.getResources();
                        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                        int[] iArr = new int[2];
                        surfaceView.getLocationInWindow(iArr);
                        int identifier = resources.getIdentifier("status_bar_height", "dimen", AppLovinBridge.f61290h);
                        float dimensionPixelSize = iArr[1];
                        if (identifier > 0) {
                            dimensionPixelSize -= resources.getDimensionPixelSize(identifier);
                        }
                        uGc.Xw(RectKt.t(Offset.O((((long) Float.floatToRawIntBits(iArr[0])) << 32) | (((long) Float.floatToRawIntBits(dimensionPixelSize)) & 4294967295L)), Size.nr((((long) Float.floatToRawIntBits(surfaceView.getWidth())) << 32) | (((long) Float.floatToRawIntBits(surfaceView.getHeight())) & 4294967295L))));
                    }
                    v2.getParentFragmentManager().o().KN("NumericKeypad").o(R.id.content, uGc).mUb();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void nHg(V v2, UserParameter userParameter, n nVar, TextView textView, View view, String str, oA.j jVar, View view2) {
                SceneElement sceneElementNHg;
                String string;
                boolean z2;
                CharSequence text;
                E(v2, userParameter, nVar, textView, view, str);
                if (v2.getContext() == null || (sceneElementNHg = HW.C.nHg(v2)) == null) {
                    return;
                }
                float fFloatValue = ((Number) KeyableKt.valueAtTime((Keyable) jVar.get(sceneElementNHg), HW.C.aYN(v2))).floatValue();
                Float fValueOf = Float.valueOf(fFloatValue);
                TextView textViewIk = nVar.Ik();
                if (textViewIk == null || (text = textViewIk.getText()) == null || (string = text.toString()) == null) {
                    string = "";
                }
                List listListOf = CollectionsKt.listOf(string);
                ArrayList arrayList = new ArrayList();
                if (userParameter instanceof UserParameter.FloatValue) {
                    z2 = false;
                    arrayList.add(new C2348n(fFloatValue, ((UserParameter.FloatValue) userParameter).getValue(), -1.0f, -1.0f, listListOf.isEmpty() ? "" : (String) listListOf.get(0), true));
                } else {
                    boolean z3 = false;
                    if (userParameter instanceof UserParameter.Angle) {
                        UserParameter.Angle angle = (UserParameter.Angle) userParameter;
                        arrayList.add(new C2348n(fFloatValue, angle.getDefaultValue(), angle.getMinValue(), angle.getMaxValue(), listListOf.isEmpty() ? "" : (String) listListOf.get(0), true));
                        z2 = z3;
                    } else {
                        z2 = z3;
                        if (!(userParameter instanceof UserParameter.Point)) {
                            z2 = z3;
                            if (!(userParameter instanceof UserParameter.Orientation)) {
                                z2 = z3;
                                if (!(userParameter instanceof UserParameter.XYZ)) {
                                    if (userParameter instanceof UserParameter.Spinner) {
                                        UserParameter.Spinner spinner = (UserParameter.Spinner) userParameter;
                                        float fFloatValue2 = fValueOf.floatValue() * spinner.getMultiplier();
                                        SliderType sliderType = spinner.getSliderType();
                                        arrayList.add(new C2348n(UserParameterKt.calcSliderTypeValueForViewing(sliderType, fFloatValue2), UserParameterKt.calcSliderTypeValueForViewing(sliderType, spinner.getDefaultValue() * spinner.getMultiplier()), UserParameterKt.calcSliderTypeValueForViewing(sliderType, spinner.getMinValue() * spinner.getMultiplier()), UserParameterKt.calcSliderTypeValueForViewing(sliderType, spinner.getMaxValue() * spinner.getMultiplier()), listListOf.isEmpty() ? spinner.getLabel() : (String) listListOf.get(0), true));
                                        z2 = z3;
                                    } else {
                                        z2 = z3;
                                        if (userParameter instanceof UserParameter.Slider) {
                                            UserParameter.Slider slider = (UserParameter.Slider) userParameter;
                                            arrayList.add(new C2348n(UserParameterKt.calcSliderTypeValueForViewing(slider.getSliderType(), fValueOf.floatValue()), UserParameterKt.calcSliderTypeValueForViewing(slider.getSliderType(), slider.getDefaultValue()), UserParameterKt.calcSliderTypeValueForViewing(slider.getSliderType(), slider.getMinValue()), UserParameterKt.calcSliderTypeValueForViewing(slider.getSliderType(), slider.getMaxValue()), listListOf.isEmpty() ? slider.getLabel() : (String) listListOf.get(0), true));
                                            z2 = z3;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                r.UGc uGc = new r.UGc();
                uGc.v(arrayList);
                boolean z4 = z2;
                uGc.bzg(new Pl(objectRef, uGc, fValueOf, userParameter, v2, jVar));
                uGc.rV9(new r.Ln(objectRef));
                FragmentActivity activity = v2.getActivity();
                SurfaceView surfaceView = activity != null ? (SurfaceView) activity.findViewById(2131363442) : null;
                if (surfaceView != null) {
                    Resources resources = v2.getResources();
                    Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                    int[] iArr = new int[2];
                    surfaceView.getLocationInWindow(iArr);
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", AppLovinBridge.f61290h);
                    float dimensionPixelSize = iArr[1];
                    if (identifier > 0) {
                        dimensionPixelSize -= resources.getDimensionPixelSize(identifier);
                    }
                    uGc.Xw(RectKt.t(Offset.O((((long) Float.floatToRawIntBits(iArr[z4 ? 1 : 0])) << 32) | (((long) Float.floatToRawIntBits(dimensionPixelSize)) & 4294967295L)), Size.nr((((long) Float.floatToRawIntBits(surfaceView.getWidth())) << 32) | (((long) Float.floatToRawIntBits(surfaceView.getHeight())) & 4294967295L))));
                }
                v2.getParentFragmentManager().o().KN("NumericKeypad").o(R.id.content, uGc).mUb();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final SceneElement p5(n nVar, final V v2, final Vector2D vector2D, final Scene scene, final SceneElement el) {
                Intrinsics.checkNotNullParameter(scene, "scene");
                Intrinsics.checkNotNullParameter(el, "el");
                oA.j jVarQie = nVar.qie();
                Dsr dsr = new PropertyReference1Impl() { // from class: f0P.V.n.j.Dsr
                    {
                        String str = XIvb.UWf;
                    }

                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return ((KeyableEdgeDecoration) obj).getOffset();
                    }
                };
                return (SceneElement) new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), dsr.getReturnType(), jVarQie, dsr).t(el, new Function1() { // from class: f0P.IE
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return V.n.j.eF(scene, el, v2, vector2D, (Keyable) obj);
                    }
                });
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final SceneElement rV9(UserParameter userParameter, n nVar, final V v2, final float f3, final Scene scene, final SceneElement el) {
                Intrinsics.checkNotNullParameter(scene, "scene");
                Intrinsics.checkNotNullParameter(el, "el");
                if (((UserParameter.Spinner) userParameter).getSliderType() == SliderType.PERCENT) {
                    oA.j jVarQie = nVar.qie();
                    I28 i28 = new PropertyReference1Impl() { // from class: f0P.V.n.j.I28
                        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                        public Object get(Object obj) {
                            return ((KeyableEdgeDecoration) obj).getAlpha();
                        }
                    };
                    return (SceneElement) new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), i28.getReturnType(), jVarQie, i28).t(el, new Function1() { // from class: f0P.W
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return V.n.j.bzg(scene, el, v2, f3, (Keyable) obj);
                        }
                    });
                }
                oA.j jVarQie2 = nVar.qie();
                Wre wre = new PropertyReference1Impl() { // from class: f0P.V.n.j.Wre
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return ((KeyableEdgeDecoration) obj).getSize();
                    }
                };
                return (SceneElement) new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), wre.getReturnType(), jVarQie2, wre).t(el, new Function1() { // from class: f0P.U
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return V.n.j.Xw(scene, el, v2, f3, (Keyable) obj);
                    }
                });
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit wTp(Ref.ObjectRef objectRef, V v2) {
                Ml.j jVar = (Ml.j) objectRef.element;
                if (jVar != null) {
                    jVar.n();
                }
                v2.gestureInProgress = false;
                return Unit.INSTANCE;
            }

            public final void nY(final UserParameter userParameter) {
                oA.aC aCVar;
                final int defaultChoice;
                Vector2D defaultValue;
                Keyable<Vector2D> offset;
                KeyableUserParameterValue defaultKeyableUserParameterValue;
                DataType dataType;
                UserParameter userParameter2 = userParameter;
                Intrinsics.checkNotNullParameter(userParameter2, "userParameter");
                final TextView textView = (TextView) this.itemView.findViewById(2131363477);
                View viewFindViewById = this.itemView.findViewById(2131363060);
                if (viewFindViewById != null) {
                    Keyable keyableA = this.rl.Uo.A(userParameter2);
                    viewFindViewById.setVisibility((keyableA == null || !keyableA.getKeyed()) ? 4 : 0);
                }
                String label = userParameter2.getLabel();
                Resources resources = this.rl.Uo.getResources();
                int iAz = this.rl.az();
                Context context = this.rl.Uo.getContext();
                textView.setBackground(resources.getDrawable(iAz, context != null ? context.getTheme() : null));
                textView.setText(label);
                if (StringsKt.isBlank(label) && ((defaultKeyableUserParameterValue = UserParameterKt.getDefaultKeyableUserParameterValue(userParameter2)) == null || (dataType = defaultKeyableUserParameterValue.getDataType()) == null || !dataType.getIsKeyable())) {
                    textView.setVisibility(8);
                } else {
                    textView.setVisibility(0);
                }
                if (Intrinsics.areEqual(userParameter2.getName(), this.rl.Uo.paramName)) {
                    textView.setActivated(true);
                    if (viewFindViewById != null) {
                        viewFindViewById.setActivated(true);
                    }
                    this.rl.S(textView);
                    this.rl.XQ(viewFindViewById);
                } else {
                    textView.setActivated(false);
                    if (viewFindViewById != null) {
                        viewFindViewById.setActivated(false);
                    }
                    if (Intrinsics.areEqual(this.rl.Ik(), textView)) {
                        this.rl.S(null);
                        this.rl.XQ(null);
                    }
                }
                final View view = viewFindViewById;
                if (this.rl.Uo.paramName == null) {
                    n nVar = this.rl;
                    E(nVar.Uo, userParameter2, nVar, textView, view, label);
                    userParameter2 = userParameter2;
                    textView = textView;
                    view = view;
                    label = label;
                }
                if (userParameter2 instanceof UserParameter.Point) {
                    ViewBinding viewBinding = this.f64835n;
                    Intrinsics.checkNotNull(viewBinding, "null cannot be cast to non-null type com.alightcreative.app.motion.databinding.EffectSettingPosBinding");
                    final n nVar2 = this.rl;
                    final TextView textView2 = textView;
                    final V v2 = nVar2.Uo;
                    final String str = label;
                    textView2.setOnClickListener(new View.OnClickListener() { // from class: f0P.Qik
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            V.n.j.g(v2, userParameter, nVar2, textView2, view, str, view2);
                        }
                    });
                    KeyableEdgeDecoration keyableEdgeDecorationTy = this.rl.ty();
                    if (keyableEdgeDecorationTy == null || (offset = keyableEdgeDecorationTy.getOffset()) == null || (defaultValue = (Vector2D) KeyableKt.valueAtTime(offset, HW.C.aYN(this.rl.Uo))) == null) {
                        defaultValue = ((UserParameter.Point) userParameter).getDefaultValue();
                    }
                    final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                    final AppCompatTextView propertyValueX = ((SJ0.RGN) this.f64835n).f9292O;
                    Intrinsics.checkNotNullExpressionValue(propertyValueX, "propertyValueX");
                    final AppCompatTextView propertyValueY = ((SJ0.RGN) this.f64835n).J2;
                    Intrinsics.checkNotNullExpressionValue(propertyValueY, "propertyValueY");
                    final ValueSpinner pointSpinner = ((SJ0.RGN) this.f64835n).f9294t;
                    Intrinsics.checkNotNullExpressionValue(pointSpinner, "pointSpinner");
                    final int color = this.itemView.getResources().getColor(2131099798, this.itemView.getContext().getTheme());
                    propertyValueX.setText(String.valueOf(MathKt.roundToInt(defaultValue.getX())));
                    propertyValueY.setText(String.valueOf(MathKt.roundToInt(defaultValue.getY())));
                    pointSpinner.setShowZeroLine(true);
                    if (propertyValueX.isActivated() == propertyValueY.isActivated()) {
                        propertyValueX.setActivated(true);
                        propertyValueY.setActivated(false);
                    }
                    if (propertyValueX.isActivated()) {
                        pointSpinner.setValue(MathKt.roundToInt(defaultValue.getX()));
                    } else {
                        pointSpinner.setValue(MathKt.roundToInt(defaultValue.getY()));
                    }
                    final n nVar3 = this.rl;
                    final View view2 = view;
                    final V v3 = nVar3.Uo;
                    propertyValueX.setOnClickListener(new View.OnClickListener() { // from class: f0P.Sw
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view3) {
                            V.n.j.N(nVar3, v3, userParameter, propertyValueX, propertyValueY, pointSpinner, color, textView2, view2, str, view3);
                        }
                    });
                    final n nVar4 = this.rl;
                    final V v4 = nVar4.Uo;
                    propertyValueY.setOnClickListener(new View.OnClickListener() { // from class: f0P.xq
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view3) {
                            V.n.j.jB(nVar4, v4, userParameter, propertyValueY, propertyValueX, pointSpinner, textView2, view2, str, view3);
                        }
                    });
                    final n nVar5 = this.rl;
                    final V v5 = nVar5.Uo;
                    pointSpinner.setOnStartTrackingTouch(new Function0() { // from class: f0P.rfW
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return V.n.j.U(objectRef, v5, userParameter, nVar5, textView2, view2, str);
                        }
                    });
                    final V v6 = this.rl.Uo;
                    pointSpinner.setOnStopTrackingTouch(new Function0() { // from class: f0P.tmw
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return V.n.j.P5(objectRef, v6);
                        }
                    });
                    final n nVar6 = this.rl;
                    final V v7 = nVar6.Uo;
                    pointSpinner.setOnSpinAbs(new Function1() { // from class: f0P.tpM
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return V.n.j.M7(nVar6, v7, propertyValueX, propertyValueY, ((Integer) obj).intValue());
                        }
                    });
                    return;
                }
                if (userParameter2 instanceof UserParameter.Selector) {
                    ViewBinding viewBinding2 = this.f64835n;
                    Intrinsics.checkNotNull(viewBinding2, "null cannot be cast to non-null type com.alightcreative.app.motion.databinding.EffectSettingSelectorBinding");
                    UserParameter.Selector selector = (UserParameter.Selector) userParameter2;
                    if (C0869j.$EnumSwitchMapping$1[selector.getStyle().ordinal()] == 1) {
                        ((SJ0.B) this.f64835n).gh.setVisibility(0);
                        ((SJ0.B) this.f64835n).f9086t.setVisibility(8);
                        ViewBinding viewBinding3 = this.f64835n;
                        Button[] buttonArr = {((SJ0.B) viewBinding3).nr, ((SJ0.B) viewBinding3).f9084O, ((SJ0.B) viewBinding3).J2, ((SJ0.B) viewBinding3).Uo, ((SJ0.B) viewBinding3).KN, ((SJ0.B) viewBinding3).xMQ, ((SJ0.B) viewBinding3).mUb};
                        for (int i2 = 0; i2 < 7; i2++) {
                            buttonArr[i2].setVisibility(8);
                        }
                        if (this.rl.ty() != null) {
                            KeyableEdgeDecoration keyableEdgeDecorationTy2 = this.rl.ty();
                            Intrinsics.checkNotNull(keyableEdgeDecorationTy2);
                            int i3 = C0869j.$EnumSwitchMapping$0[keyableEdgeDecorationTy2.getDirection().ordinal()];
                            if (i3 == 1) {
                                defaultChoice = EdgeDecorationDirection.INSIDE.ordinal();
                            } else if (i3 == 2) {
                                defaultChoice = EdgeDecorationDirection.CENTERED.ordinal();
                            } else {
                                if (i3 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                defaultChoice = EdgeDecorationDirection.OUTSIDE.ordinal();
                            }
                        } else {
                            defaultChoice = selector.getDefaultChoice();
                        }
                        List<ChoiceInfo> choices = selector.getChoices();
                        final n nVar7 = this.rl;
                        final V v10 = nVar7.Uo;
                        int i5 = 0;
                        for (Object obj : choices) {
                            int i7 = i5 + 1;
                            if (i5 < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            final ChoiceInfo choiceInfo = (ChoiceInfo) obj;
                            Button button = buttonArr[i5];
                            Intrinsics.checkNotNullExpressionValue(button, "get(...)");
                            if (selector.getChoices().size() - 1 == i5) {
                                ViewGroup.LayoutParams layoutParams = button.getLayoutParams();
                                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                                if (marginLayoutParams != null) {
                                    marginLayoutParams.setMarginEnd(0);
                                } else {
                                    marginLayoutParams = null;
                                }
                                button.setLayoutParams(marginLayoutParams);
                            }
                            button.setVisibility(0);
                            button.setActivated(choiceInfo.getValue() == defaultChoice);
                            button.setText(choiceInfo.getLabel());
                            button.setOnClickListener(new View.OnClickListener() { // from class: f0P.z3w
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view3) {
                                    V.n.j.te(choiceInfo, defaultChoice, v10, nVar7, view3);
                                }
                            });
                            i5 = i7;
                        }
                        return;
                    }
                    return;
                }
                if (userParameter2 instanceof UserParameter.Color) {
                    ViewBinding viewBinding4 = this.f64835n;
                    Intrinsics.checkNotNull(viewBinding4, "null cannot be cast to non-null type com.alightcreative.app.motion.databinding.EffectSettingColorBinding");
                    final n nVar8 = this.rl;
                    final TextView textView3 = textView;
                    final V v11 = nVar8.Uo;
                    final String str2 = label;
                    textView3.setOnClickListener(new View.OnClickListener() { // from class: f0P.OA
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view3) {
                            V.n.j.E2(v11, userParameter, nVar8, textView3, view, str2, view3);
                        }
                    });
                    SceneElement sceneElementNHg = HW.C.nHg(this.rl.Uo);
                    if (sceneElementNHg == null) {
                        return;
                    }
                    oA.j jVarQie = this.rl.qie();
                    o oVar = new PropertyReference1Impl() { // from class: f0P.V.n.j.o
                        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                        public Object get(Object obj2) {
                            return ((KeyableEdgeDecoration) obj2).getColor();
                        }
                    };
                    SolidColor solidColor = (SolidColor) KeyableKt.valueAtTime((Keyable) new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), oVar.getReturnType(), jVarQie, oVar).get(sceneElementNHg), HW.C.aYN(this.rl.Uo));
                    ((SJ0.kO4) this.f64835n).nr.setColor(ColorKt.toInt(solidColor));
                    float f3 = 255;
                    ((SJ0.kO4) this.f64835n).rl.setText(((int) (solidColor.getR() * f3)) + " " + ((int) (solidColor.getG() * f3)) + " " + ((int) (solidColor.getB() * f3)));
                    ColorView colorView = ((SJ0.kO4) this.f64835n).nr;
                    final n nVar9 = this.rl;
                    final V v12 = nVar9.Uo;
                    final View view3 = view;
                    colorView.setOnClickListener(new View.OnClickListener() { // from class: f0P.Mo
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view4) {
                            V.n.j.e(v12, this, userParameter, nVar9, textView3, view3, str2, view4);
                        }
                    });
                    return;
                }
                final View view4 = view;
                if (userParameter2 instanceof UserParameter.Spinner) {
                    ViewBinding viewBinding5 = this.f64835n;
                    Intrinsics.checkNotNull(viewBinding5, "null cannot be cast to non-null type com.alightcreative.app.motion.databinding.EffectSettingSpinnerBinding");
                    final n nVar10 = this.rl;
                    final V v13 = nVar10.Uo;
                    final UserParameter userParameter3 = userParameter2;
                    final String str3 = label;
                    textView.setOnClickListener(new View.OnClickListener() { // from class: f0P.HcS
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view5) {
                            V.n.j.T(v13, userParameter3, nVar10, textView, view4, str3, view5);
                        }
                    });
                    SceneElement sceneElementNHg2 = HW.C.nHg(this.rl.Uo);
                    if (sceneElementNHg2 == null) {
                        return;
                    }
                    UserParameter.Spinner spinner = (UserParameter.Spinner) userParameter3;
                    if (spinner.getSliderType() == SliderType.PERCENT) {
                        oA.j jVarQie2 = this.rl.qie();
                        eO eOVar = new PropertyReference1Impl() { // from class: f0P.V.n.j.eO
                            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                            public Object get(Object obj2) {
                                return ((KeyableEdgeDecoration) obj2).getAlpha();
                            }
                        };
                        aCVar = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), eOVar.getReturnType(), jVarQie2, eOVar);
                    } else {
                        oA.j jVarQie3 = this.rl.qie();
                        z zVar = new PropertyReference1Impl() { // from class: f0P.V.n.j.z
                            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                            public Object get(Object obj2) {
                                return ((KeyableEdgeDecoration) obj2).getSize();
                            }
                        };
                        aCVar = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), zVar.getReturnType(), jVarQie3, zVar);
                    }
                    float fFloatValue = ((Number) KeyableKt.valueAtTime((Keyable) aCVar.get(sceneElementNHg2), HW.C.aYN(this.rl.Uo))).floatValue();
                    final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                    final TextView textView4 = (TextView) this.itemView.findViewById(2131363485);
                    if (spinner.getSliderType() != SliderType.ANGLE && spinner.getSliderType() != SliderType.ANGLE_RANGE) {
                        textView4.setVisibility(8);
                    }
                    M(this.rl.Uo, userParameter3, this, textView4, fFloatValue);
                    AppCompatTextView appCompatTextView = ((SJ0.c7r) this.f64835n).f9418O;
                    final String str4 = label;
                    final oA.aC aCVar2 = aCVar;
                    final n nVar11 = this.rl;
                    final V v14 = nVar11.Uo;
                    appCompatTextView.setOnClickListener(new View.OnClickListener() { // from class: f0P.t6
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view5) {
                            V.n.j.nHg(v14, userParameter, nVar11, textView, view4, str4, aCVar2, view5);
                        }
                    });
                    final float step = spinner.getStep();
                    ValueSpinner valueSpinner = (ValueSpinner) this.itemView.findViewById(2131363492);
                    valueSpinner.setValue(MathKt.roundToInt(fFloatValue / step));
                    valueSpinner.setMinValue(MathKt.roundToInt(spinner.getMinValue() / step));
                    valueSpinner.setMaxValue(MathKt.roundToInt(spinner.getMaxValue() / step));
                    valueSpinner.setLimitRange(true);
                    List<Float> tickMarks = spinner.getTickMarks();
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(tickMarks, 10));
                    Iterator<T> it = tickMarks.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Integer.valueOf(MathKt.roundToInt(((Number) it.next()).floatValue() / step)));
                    }
                    valueSpinner.setBrightMarks(arrayList);
                    final TextView textView5 = textView;
                    final n nVar12 = this.rl;
                    final V v15 = nVar12.Uo;
                    valueSpinner.setOnStartTrackingTouch(new Function0() { // from class: f0P.zpl
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return V.n.j.s7N(objectRef2, v15, userParameter, nVar12, textView5, view4, str4);
                        }
                    });
                    final V v16 = this.rl.Uo;
                    valueSpinner.setOnStopTrackingTouch(new Function0() { // from class: f0P.ibE
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return V.n.j.wTp(objectRef2, v16);
                        }
                    });
                    final n nVar13 = this.rl;
                    final V v17 = nVar13.Uo;
                    valueSpinner.setOnSpinAbs(new Function1() { // from class: f0P.DT
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return V.n.j.v(step, userParameter, v17, this, textView4, nVar13, ((Integer) obj2).intValue());
                        }
                    });
                }
            }

            private static final void E(V v2, UserParameter userParameter, n nVar, TextView textView, View view, String str) {
                KeyableUserParameterValue defaultKeyableUserParameterValue;
                DataType dataType;
                EditActivity editActivity;
                if (!Intrinsics.areEqual(v2.paramName, userParameter.getName()) && (defaultKeyableUserParameterValue = UserParameterKt.getDefaultKeyableUserParameterValue(userParameter)) != null && (dataType = defaultKeyableUserParameterValue.getDataType()) != null && dataType.getIsKeyable()) {
                    v2.paramName = userParameter.getName();
                    TextView textViewIk = nVar.Ik();
                    if (textViewIk != null) {
                        textViewIk.setActivated(false);
                    }
                    View viewCk = nVar.ck();
                    if (viewCk != null) {
                        viewCk.setActivated(false);
                    }
                    nVar.S(textView);
                    nVar.XQ(view);
                    if (view != null) {
                        view.setActivated(true);
                    }
                    textView.setActivated(true);
                    v2.W();
                    if (userParameter.getDataType() == DataType.VEC2) {
                        FragmentActivity activity = v2.getActivity();
                        if (activity instanceof EditActivity) {
                            editActivity = (EditActivity) activity;
                        } else {
                            editActivity = null;
                        }
                        if (editActivity != null) {
                            editActivity.vTq(str, v2.guideDuration);
                        }
                        v2.guideDuration = EditActivity.Wre.f44459n;
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void E2(V v2, UserParameter userParameter, n nVar, TextView textView, View view, String str, View view2) {
                E(v2, userParameter, nVar, textView, view, str);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit M7(final n nVar, final V v2, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, int i2) {
                final Vector2D vector2D;
                oA.j jVarQie = nVar.qie();
                aC aCVar = new PropertyReference1Impl() { // from class: f0P.V.n.j.aC
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return ((KeyableEdgeDecoration) obj).getOffset();
                    }
                };
                oA.aC aCVar2 = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), aCVar.getReturnType(), jVarQie, aCVar);
                SceneElement sceneElementNHg = HW.C.nHg(v2);
                if (sceneElementNHg == null) {
                    return Unit.INSTANCE;
                }
                Vector2D vector2D2 = (Vector2D) KeyableKt.valueAtTime((Keyable) aCVar2.get(sceneElementNHg), SceneElementKt.fractionalTime(sceneElementNHg, HW.C.WPU(v2)));
                if (appCompatTextView.isActivated()) {
                    vector2D = new Vector2D(i2, vector2D2.getY());
                } else {
                    vector2D = new Vector2D(vector2D2.getX(), i2);
                }
                appCompatTextView.setText(String.valueOf(MathKt.roundToInt(vector2D.getX())));
                appCompatTextView2.setText(String.valueOf(MathKt.roundToInt(vector2D.getY())));
                HW.C.D(v2, new Function2() { // from class: f0P.eZk
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return V.n.j.p5(nVar, v2, vector2D, (Scene) obj, (SceneElement) obj2);
                    }
                });
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Multi-variable type inference failed */
            public static final void N(n nVar, V v2, UserParameter userParameter, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, ValueSpinner valueSpinner, int i2, TextView textView, View view, String str, View view2) {
                Vector2D defaultValue;
                SurfaceView surfaceView;
                Keyable<Vector2D> offset;
                KeyableEdgeDecoration keyableEdgeDecorationTy = nVar.ty();
                if (keyableEdgeDecorationTy == null || (offset = keyableEdgeDecorationTy.getOffset()) == null || (defaultValue = (Vector2D) KeyableKt.valueAtTime(offset, HW.C.aYN(v2))) == null) {
                    defaultValue = ((UserParameter.Point) userParameter).getDefaultValue();
                }
                Vector2D vector2D = defaultValue;
                if (appCompatTextView.isActivated()) {
                    E(v2, userParameter, nVar, textView, view, str);
                    oA.j jVarQie = nVar.qie();
                    CN3 cn3 = new PropertyReference1Impl() { // from class: f0P.V.n.j.CN3
                        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                        public Object get(Object obj) {
                            return ((KeyableEdgeDecoration) obj).getOffset();
                        }
                    };
                    oA.aC aCVar = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), cn3.getReturnType(), jVarQie, cn3);
                    if (v2.getContext() != null) {
                        List listListOf = CollectionsKt.listOf((Object[]) new String[]{v2.getString(2132019803), v2.getString(2132019805), v2.getString(2132019804)});
                        ArrayList arrayList = new ArrayList();
                        String str2 = "";
                        if (userParameter instanceof UserParameter.FloatValue) {
                            Intrinsics.checkNotNull(vector2D, "null cannot be cast to non-null type kotlin.Float");
                            float fFloatValue = ((Float) vector2D).floatValue();
                            float value = ((UserParameter.FloatValue) userParameter).getValue();
                            if (!listListOf.isEmpty()) {
                                str2 = (String) listListOf.get(0);
                            }
                            arrayList.add(new C2348n(fFloatValue, value, -1.0f, -1.0f, str2, true));
                        } else if (userParameter instanceof UserParameter.Angle) {
                            Intrinsics.checkNotNull(vector2D, "null cannot be cast to non-null type kotlin.Float");
                            float fFloatValue2 = ((Float) vector2D).floatValue();
                            UserParameter.Angle angle = (UserParameter.Angle) userParameter;
                            float defaultValue2 = angle.getDefaultValue();
                            float minValue = angle.getMinValue();
                            float maxValue = angle.getMaxValue();
                            if (!listListOf.isEmpty()) {
                                str2 = (String) listListOf.get(0);
                            }
                            arrayList.add(new C2348n(fFloatValue2, defaultValue2, minValue, maxValue, str2, true));
                        } else {
                            String str3 = "Y";
                            String str4 = "X";
                            if (userParameter instanceof UserParameter.Point) {
                                if (vector2D != 0) {
                                    float x2 = vector2D.getX();
                                    UserParameter.Point point = (UserParameter.Point) userParameter;
                                    float x3 = point.getDefaultValue().getX();
                                    float x4 = point.getMinOffset().getX();
                                    float x5 = point.getMaxOffset().getX();
                                    if (!listListOf.isEmpty()) {
                                        str4 = (String) listListOf.get(0);
                                    }
                                    arrayList.add(new C2348n(x2, x3, x4, x5, str4, true));
                                    float y2 = vector2D.getY();
                                    float y3 = point.getDefaultValue().getY();
                                    float y4 = point.getMinOffset().getY();
                                    float y5 = point.getMaxOffset().getY();
                                    if (listListOf.size() >= 2) {
                                        str3 = (String) listListOf.get(1);
                                    }
                                    arrayList.add(new C2348n(y2, y3, y4, y5, str3, false));
                                }
                            } else if (!(userParameter instanceof UserParameter.Orientation) && !(userParameter instanceof UserParameter.XYZ) && !(userParameter instanceof UserParameter.Spinner)) {
                                boolean z2 = userParameter instanceof UserParameter.Slider;
                            }
                        }
                        Ref.ObjectRef objectRef = new Ref.ObjectRef();
                        r.UGc uGc = new r.UGc();
                        uGc.v(arrayList);
                        uGc.bzg(new qz(objectRef, uGc, vector2D, userParameter, v2, aCVar));
                        uGc.rV9(new r.Ln(objectRef));
                        FragmentActivity activity = v2.getActivity();
                        if (activity != null) {
                            surfaceView = (SurfaceView) activity.findViewById(2131363442);
                        } else {
                            surfaceView = null;
                        }
                        if (surfaceView != null) {
                            Resources resources = v2.getResources();
                            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                            int[] iArr = new int[2];
                            surfaceView.getLocationInWindow(iArr);
                            int identifier = resources.getIdentifier("status_bar_height", "dimen", AppLovinBridge.f61290h);
                            float dimensionPixelSize = iArr[1];
                            if (identifier > 0) {
                                dimensionPixelSize -= resources.getDimensionPixelSize(identifier);
                            }
                            uGc.Xw(RectKt.t(Offset.O((((long) Float.floatToRawIntBits(iArr[0])) << 32) | (((long) Float.floatToRawIntBits(dimensionPixelSize)) & 4294967295L)), Size.nr((((long) Float.floatToRawIntBits(surfaceView.getWidth())) << 32) | (((long) Float.floatToRawIntBits(surfaceView.getHeight())) & 4294967295L))));
                        }
                        v2.getParentFragmentManager().o().KN("NumericKeypad").o(R.id.content, uGc).mUb();
                        return;
                    }
                    return;
                }
                appCompatTextView.setActivated(true);
                appCompatTextView2.setActivated(false);
                valueSpinner.setNeedleColor(i2);
                valueSpinner.setValue(MathKt.roundToInt(vector2D.getX()));
                valueSpinner.invalidate();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void T(V v2, UserParameter userParameter, n nVar, TextView textView, View view, String str, View view2) {
                E(v2, userParameter, nVar, textView, view, str);
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Type inference failed for: r2v1, types: [LdY.Ml$j, T] */
            public static final Unit U(Ref.ObjectRef objectRef, V v2, UserParameter userParameter, n nVar, TextView textView, View view, String str) {
                E(v2, userParameter, nVar, textView, view, str);
                objectRef.element = HW.C.xMQ(v2);
                v2.gestureInProgress = true;
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void e(V v2, final j jVar, UserParameter userParameter, n nVar, TextView textView, View view, String str, View view2) {
                FragmentActivity activity = v2.getActivity();
                if (activity == null) {
                    return;
                }
                E(v2, userParameter, nVar, textView, view, str);
                Intrinsics.checkNotNull(view2, "null cannot be cast to non-null type com.alightcreative.app.motion.activities.edit.ColorView");
                yU.Ml ml = new yU.Ml(activity, ((ColorView) view2).getAndroidx.media3.extractor.text.ttml.TtmlNode.ATTR_TTS_COLOR java.lang.String());
                ml.nr().setOnColorChangeListener(new C0870n(view2, v2, nVar));
                ml.nr().setPalletteClickListener(new w6(v2, ml, nVar));
                ml.nr().setSpoidEventListener(new Ml(v2));
                ml.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: f0P.yr
                    @Override // android.widget.PopupWindow.OnDismissListener
                    public final void onDismiss() {
                        V.n.j.X(this.f66381n);
                    }
                });
                ml.nr().setSceneHolder(HW.C.e(v2));
                ((SJ0.kO4) jVar.f64835n).nr.setColorWidget(ml.nr());
                ml.KN(view2);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void g(V v2, UserParameter userParameter, n nVar, TextView textView, View view, String str, View view2) {
                E(v2, userParameter, nVar, textView, view, str);
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Type inference failed for: r2v1, types: [LdY.Ml$j, T] */
            public static final Unit s7N(Ref.ObjectRef objectRef, V v2, UserParameter userParameter, n nVar, TextView textView, View view, String str) {
                E(v2, userParameter, nVar, textView, view, str);
                objectRef.element = HW.C.xMQ(v2);
                v2.gestureInProgress = true;
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void te(final ChoiceInfo choiceInfo, int i2, V v2, final n nVar, View view) {
                if (choiceInfo.getValue() != i2) {
                    HW.C.D(v2, new Function2() { // from class: f0P.VoU
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return V.n.j.iF(nVar, choiceInfo, (Scene) obj, (SceneElement) obj2);
                        }
                    });
                    Function0 function0R = nVar.r();
                    if (function0R != null) {
                        function0R.invoke();
                    }
                }
            }
        }

        public n(V v2, oA.j borderLens, List parameters, Function0 function0, int i2) {
            Intrinsics.checkNotNullParameter(borderLens, "borderLens");
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            this.Uo = v2;
            this.f64833n = borderLens;
            this.rl = parameters;
            this.f64834t = function0;
            this.nr = i2;
        }

        public final List HI() {
            return this.rl;
        }

        public final TextView Ik() {
            return this.f64832O;
        }

        public final void S(TextView textView) {
            this.f64832O = textView;
        }

        public final void XQ(View view) {
            this.J2 = view;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
        public j onCreateViewHolder(ViewGroup parent, int i2) {
            ViewBinding viewBindingT;
            Intrinsics.checkNotNullParameter(parent, "parent");
            switch (i2) {
                case 2131558553:
                    viewBindingT = SJ0.kO4.t(LayoutInflater.from(parent.getContext()), parent, false);
                    Intrinsics.checkNotNull(viewBindingT);
                    break;
                case 2131558554:
                case 2131558555:
                default:
                    throw new UnsupportedOperationException();
                case 2131558556:
                    viewBindingT = SJ0.RGN.t(LayoutInflater.from(parent.getContext()), parent, false);
                    Intrinsics.checkNotNull(viewBindingT);
                    break;
                case 2131558557:
                    viewBindingT = SJ0.B.t(LayoutInflater.from(parent.getContext()), parent, false);
                    Intrinsics.checkNotNull(viewBindingT);
                    break;
                case 2131558558:
                    viewBindingT = SJ0.xuv.t(LayoutInflater.from(parent.getContext()), parent, false);
                    Intrinsics.checkNotNull(viewBindingT);
                    break;
                case 2131558559:
                    viewBindingT = SJ0.c7r.t(LayoutInflater.from(parent.getContext()), parent, false);
                    Intrinsics.checkNotNull(viewBindingT);
                    break;
            }
            return new j(this, viewBindingT);
        }

        public final int az() {
            return this.nr;
        }

        public final View ck() {
            return this.J2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.rl.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i2) {
            UserParameter userParameter = (UserParameter) this.rl.get(i2);
            if (userParameter instanceof UserParameter.Selector) {
                return 2131558557;
            }
            if (userParameter instanceof UserParameter.Slider) {
                return 2131558558;
            }
            if (userParameter instanceof UserParameter.Spinner) {
                return 2131558559;
            }
            if (userParameter instanceof UserParameter.Color) {
                return 2131558553;
            }
            if (userParameter instanceof UserParameter.Point) {
                return 2131558556;
            }
            throw new UnsupportedOperationException();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(j holder, int i2) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            holder.nY((UserParameter) this.rl.get(i2));
        }

        public final oA.j qie() {
            return this.f64833n;
        }

        public final Function0 r() {
            return this.f64834t;
        }

        public final KeyableEdgeDecoration ty() {
            SceneElement sceneElementNHg = HW.C.nHg(this.Uo);
            if (sceneElementNHg != null) {
                return (KeyableEdgeDecoration) this.f64833n.get(sceneElementNHg);
            }
            return null;
        }

        public /* synthetic */ n(V v2, oA.j jVar, List list, Function0 function0, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(v2, jVar, list, (i3 & 4) != 0 ? null : function0, (i3 & 8) != 0 ? 2131232234 : i2);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public static final class pO implements Function1 {
        final /* synthetic */ UserParameter J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Object f64888O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef f64889n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ V f64890r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ r.UGc f64891t;

        public pO(Ref.ObjectRef objectRef, r.UGc uGc, Object obj, UserParameter userParameter, V v2) {
            this.f64889n = objectRef;
            this.f64891t = uGc;
            this.f64888O = obj;
            this.J2 = userParameter;
            this.f64890r = v2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            n((List) obj);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference failed for: r1v13, types: [LdY.Ml$j, T] */
        public final void n(List valueList) {
            Float fValueOf;
            Intrinsics.checkNotNullParameter(valueList, "valueList");
            Ref.ObjectRef objectRef = this.f64889n;
            if (objectRef.element == 0) {
                objectRef.element = HW.C.xMQ(this.f64891t);
            }
            Object obj = this.f64888O;
            UserParameter userParameter = this.J2;
            if (obj instanceof Quaternion) {
                Object objFromEulerAngles = Quaternion.INSTANCE.fromEulerAngles(((Number) valueList.get(0)).floatValue(), ((Number) valueList.get(1)).floatValue(), ((Number) valueList.get(2)).floatValue());
                if (objFromEulerAngles == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
                }
                fValueOf = (Float) objFromEulerAngles;
            } else if (obj instanceof Vector2D) {
                fValueOf = (Float) new Vector2D(((Number) valueList.get(0)).floatValue(), ((Number) valueList.get(1)).floatValue());
            } else if (obj instanceof Vector3D) {
                fValueOf = (Float) new Vector3D(((Number) valueList.get(0)).floatValue(), ((Number) valueList.get(1)).floatValue(), ((Number) valueList.get(2)).floatValue());
            } else if (!(obj instanceof Float)) {
                Object obj2 = valueList.get(0);
                if (obj2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
                }
                fValueOf = (Float) obj2;
            } else if (userParameter instanceof UserParameter.Spinner) {
                UserParameter.Spinner spinner = (UserParameter.Spinner) userParameter;
                fValueOf = Float.valueOf(UserParameterKt.calcSliderTypeValueForSaving(spinner.getSliderType(), ((Number) valueList.get(0)).floatValue() / spinner.getMultiplier()));
            } else if (userParameter instanceof UserParameter.Slider) {
                fValueOf = Float.valueOf(UserParameterKt.calcSliderTypeValueForSaving(((UserParameter.Slider) userParameter).getSliderType(), ((Number) valueList.get(0)).floatValue()));
            } else {
                Object obj3 = valueList.get(0);
                if (obj3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
                }
                fValueOf = (Float) obj3;
            }
            HW.C.D(this.f64890r, new vd(fValueOf.floatValue()));
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public static final class psW implements ColorPickerWidget.j {
        psW() {
        }

        @Override // com.alightcreative.app.motion.activities.edit.widgets.ColorPickerWidget.j
        public void n(int i2) {
            V.this.q9().ty.setColor(i2);
            V.this.W5k(i2);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    static final class vd implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ float f64899n;

        vd(float f3) {
            this.f64899n = f3;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final SceneElement invoke(Scene scene, SceneElement el) {
            Intrinsics.checkNotNullParameter(scene, "<unused var>");
            Intrinsics.checkNotNullParameter(el, "el");
            KeyableEdgeDecoration stroke = el.getStroke();
            return SceneElement.copy$default(el, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, stroke.copy((16339 & 1) != 0 ? stroke.type : null, (16339 & 2) != 0 ? stroke.direction : null, (16339 & 4) != 0 ? stroke.enabled : false, (16339 & 8) != 0 ? stroke.color : null, (16339 & 16) != 0 ? stroke.alpha : null, (16339 & 32) != 0 ? stroke.size : null, (16339 & 64) != 0 ? stroke.hardness : null, (16339 & 128) != 0 ? stroke.offset : null, (16339 & 256) != 0 ? stroke.cap : null, (16339 & 512) != 0 ? stroke.join : null, (16339 & 1024) != 0 ? stroke.startStyle : null, (16339 & 2048) != 0 ? stroke.endStyle : null, (16339 & 4096) != 0 ? stroke.endSize : this.f64899n / 100.0f, (16339 & 8192) != 0 ? stroke.borderId : 0), null, null, false, null, null, false, null, null, -1073741825, 127, null);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public static final class yg implements Function1 {
        final /* synthetic */ UserParameter J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Object f64900O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef f64901n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ oA.j f64902o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Fragment f64903r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ r.UGc f64904t;

        public static final class j implements Function2 {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ Object f64905O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ oA.j f64906n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ Fragment f64907t;

            /* JADX INFO: renamed from: f0P.V$yg$j$j, reason: collision with other inner class name */
            public static final class C0875j implements Function1 {
                final /* synthetic */ Object J2;

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                final /* synthetic */ Fragment f64908O;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ Scene f64909n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ SceneElement f64910t;

                public C0875j(Scene scene, SceneElement sceneElement, Fragment fragment, Object obj) {
                    this.f64909n = scene;
                    this.f64910t = sceneElement;
                    this.f64908O = fragment;
                    this.J2 = obj;
                }

                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Keyable invoke(Keyable it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return KeyableKt.copyWithValueForTime(it, this.f64909n, this.f64910t, HW.C.aYN(this.f64908O), this.J2);
                }
            }

            public j(oA.j jVar, Fragment fragment, Object obj) {
                this.f64906n = jVar;
                this.f64907t = fragment;
                this.f64905O = obj;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final SceneElement invoke(Scene scene, SceneElement el) {
                Intrinsics.checkNotNullParameter(scene, "scene");
                Intrinsics.checkNotNullParameter(el, "el");
                return (SceneElement) this.f64906n.t(el, new C0875j(scene, el, this.f64907t, this.f64905O));
            }
        }

        public yg(Ref.ObjectRef objectRef, r.UGc uGc, Object obj, UserParameter userParameter, Fragment fragment, oA.j jVar) {
            this.f64901n = objectRef;
            this.f64904t = uGc;
            this.f64900O = obj;
            this.J2 = userParameter;
            this.f64903r = fragment;
            this.f64902o = jVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            n((List) obj);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference failed for: r1v13, types: [LdY.Ml$j, T] */
        public final void n(List valueList) {
            Float fValueOf;
            Intrinsics.checkNotNullParameter(valueList, "valueList");
            Ref.ObjectRef objectRef = this.f64901n;
            if (objectRef.element == 0) {
                objectRef.element = HW.C.xMQ(this.f64904t);
            }
            Object obj = this.f64900O;
            UserParameter userParameter = this.J2;
            if (obj instanceof Quaternion) {
                Object objFromEulerAngles = Quaternion.INSTANCE.fromEulerAngles(((Number) valueList.get(0)).floatValue(), ((Number) valueList.get(1)).floatValue(), ((Number) valueList.get(2)).floatValue());
                if (objFromEulerAngles == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
                }
                fValueOf = (Float) objFromEulerAngles;
            } else if (obj instanceof Vector2D) {
                fValueOf = (Float) new Vector2D(((Number) valueList.get(0)).floatValue(), ((Number) valueList.get(1)).floatValue());
            } else if (obj instanceof Vector3D) {
                fValueOf = (Float) new Vector3D(((Number) valueList.get(0)).floatValue(), ((Number) valueList.get(1)).floatValue(), ((Number) valueList.get(2)).floatValue());
            } else if (!(obj instanceof Float)) {
                Object obj2 = valueList.get(0);
                if (obj2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
                }
                fValueOf = (Float) obj2;
            } else if (userParameter instanceof UserParameter.Spinner) {
                UserParameter.Spinner spinner = (UserParameter.Spinner) userParameter;
                fValueOf = Float.valueOf(UserParameterKt.calcSliderTypeValueForSaving(spinner.getSliderType(), ((Number) valueList.get(0)).floatValue() / spinner.getMultiplier()));
            } else if (userParameter instanceof UserParameter.Slider) {
                fValueOf = Float.valueOf(UserParameterKt.calcSliderTypeValueForSaving(((UserParameter.Slider) userParameter).getSliderType(), ((Number) valueList.get(0)).floatValue()));
            } else {
                Object obj3 = valueList.get(0);
                if (obj3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
                }
                fValueOf = (Float) obj3;
            }
            Fragment fragment = this.f64903r;
            HW.C.D(fragment, new j(this.f64902o, fragment, fValueOf));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(V v2, final int i2, View view) {
        List<KeyableEdgeDecoration> listEmptyList;
        v2.selectedBorderPosition = null;
        v2.q9().rl.setVisibility(0);
        v2.q9().nr.setVisibility(4);
        v2.W();
        HW.C.D(v2, new Function2() { // from class: f0P.Pmq
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return V.Lu(i2, (Scene) obj, (SceneElement) obj2);
            }
        });
        RecyclerView.Adapter adapter = v2.q9().rl.getAdapter();
        Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.alightcreative.app.motion.activities.edit.fragments.BorderAndShadowFragment.BorderListAdapter");
        j jVar = (j) adapter;
        SceneElement sceneElementNHg = HW.C.nHg(v2);
        if (sceneElementNHg == null || (listEmptyList = sceneElementNHg.getBorders()) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        jVar.WPU(listEmptyList);
        jVar.notifyDataSetChanged();
        v2.s7N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MPw(V v2, boolean z2) {
        v2.revealAnimation = null;
        v2.isClosed = true;
        return Unit.INSTANCE;
    }

    static /* synthetic */ void XUb(V v2, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = true;
        }
        v2.x(z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rT(ConstraintLayout constraintLayout, V v2, Rect rect, Rect rect2, View view, View view2) {
        constraintLayout.setTranslationY(0.0f);
        v2.selectedBorderPosition = null;
        ObjectAnimator duration = ObjectAnimator.ofObject(constraintLayout, "clipBounds", new RectEvaluator(new Rect()), rect, rect2).setDuration(200L);
        duration.addListener(v2.new lej());
        duration.start();
        constraintLayout.animate().translationY((view.getY() - view.getPaddingTop()) - constraintLayout.getPaddingTop()).setDuration(200L).start();
        v2.W();
        v2.s7N();
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public /* synthetic */ class w6 {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DataType.values().length];
            try {
                iArr[DataType.SOLID_COLOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DataType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement C7B(final V v2, final int i2, final Scene scene, final SceneElement el) {
        Intrinsics.checkNotNullParameter(scene, "scene");
        Intrinsics.checkNotNullParameter(el, "el");
        Zs zs = new PropertyReference1Impl() { // from class: f0P.V.Zs
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((SceneElement) obj).getStroke();
            }
        };
        P p2 = new PropertyReference1Impl() { // from class: f0P.V.P
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((KeyableEdgeDecoration) obj).getSize();
            }
        };
        return (SceneElement) new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), p2.getReturnType(), new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), zs.getReturnType(), zs), p2).t(el, new Function1() { // from class: f0P.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return V.wYi(scene, el, v2, i2, (Keyable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement GH3(boolean z2, Scene scene, SceneElement el) {
        Intrinsics.checkNotNullParameter(scene, pTYaLzzmJSGAPQ.EeMiQXWGzJDyd);
        Intrinsics.checkNotNullParameter(el, "el");
        KeyableEdgeDecoration dropShadow = el.getDropShadow();
        return SceneElement.copy$default(el, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, dropShadow.copy((16339 & 1) != 0 ? dropShadow.type : null, (16339 & 2) != 0 ? dropShadow.direction : null, (16339 & 4) != 0 ? dropShadow.enabled : z2, (16339 & 8) != 0 ? dropShadow.color : null, (16339 & 16) != 0 ? dropShadow.alpha : null, (16339 & 32) != 0 ? dropShadow.size : null, (16339 & 64) != 0 ? dropShadow.hardness : null, (16339 & 128) != 0 ? dropShadow.offset : null, (16339 & 256) != 0 ? dropShadow.cap : null, (16339 & 512) != 0 ? dropShadow.join : null, (16339 & 1024) != 0 ? dropShadow.startStyle : null, (16339 & 2048) != 0 ? dropShadow.endStyle : null, (16339 & 4096) != 0 ? dropShadow.endSize : 0.0f, (16339 & 8192) != 0 ? dropShadow.borderId : 0), false, null, null, false, null, null, -1, 126, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void GRh(V v2, final StrokeCap strokeCap, View view) {
        HW.C.D(v2, new Function2() { // from class: f0P.CM
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return V.Rc(strokeCap, (Scene) obj, (SceneElement) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement Lu(int i2, Scene scene, SceneElement el) {
        Intrinsics.checkNotNullParameter(scene, "<unused var>");
        Intrinsics.checkNotNullParameter(el, "el");
        return SceneElement.copy$default(el, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, CollectionsKt.minus(el.getBorders(), el.getBorders().get(i2)), null, false, null, null, false, null, null, Integer.MAX_VALUE, 127, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement NC9(V v2, int i2, Scene scene, SceneElement el) {
        Intrinsics.checkNotNullParameter(scene, "scene");
        Intrinsics.checkNotNullParameter(el, "el");
        KeyableEdgeDecoration stroke = el.getStroke();
        return SceneElement.copy$default(el, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, stroke.copy((16339 & 1) != 0 ? stroke.type : null, (16339 & 2) != 0 ? stroke.direction : null, (16339 & 4) != 0 ? stroke.enabled : false, (16339 & 8) != 0 ? stroke.color : KeyableKt.copyWithValueForTime(el.getStroke().getColor(), scene, el, SceneElementKt.fractionalTime(el, HW.C.WPU(v2)), HI0.qf.t(i2)), (16339 & 16) != 0 ? stroke.alpha : null, (16339 & 32) != 0 ? stroke.size : null, (16339 & 64) != 0 ? stroke.hardness : null, (16339 & 128) != 0 ? stroke.offset : null, (16339 & 256) != 0 ? stroke.cap : null, (16339 & 512) != 0 ? stroke.join : null, (16339 & 1024) != 0 ? stroke.startStyle : null, (16339 & 2048) != 0 ? stroke.endStyle : null, (16339 & 4096) != 0 ? stroke.endSize : 0.0f, (16339 & 8192) != 0 ? stroke.borderId : 0), null, null, false, null, null, false, null, null, -1073741825, 127, null);
    }

    private final float Of6(int progress) {
        int[] iArr = this.progressToWidthTable;
        return iArr[RangesKt.coerceIn(progress, 0, iArr.length - 1)];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Om(V v2, CompoundButton compoundButton, final boolean z2) {
        Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
        int currentTabId = v2.getCurrentTabId();
        if (currentTabId == 2131363824) {
            HW.C.D(v2, new Function2() { // from class: f0P.h6y
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return V.GH3(z2, (Scene) obj, (SceneElement) obj2);
                }
            });
        } else {
            if (currentTabId != 2131363826) {
                return;
            }
            HW.C.D(v2, new Function2() { // from class: f0P.U4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return V.t1J(z2, (Scene) obj, (SceneElement) obj2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Qg8(V v2, List list, SceneElement sceneElement, View view) {
        if (v2.isClosed || v2.panelCloser != null) {
            v2.bZm();
            return;
        }
        if (v2.q9().Ik.getAdapter() != null) {
            RecyclerView.Adapter adapter = v2.q9().Ik.getAdapter();
            Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.alightcreative.app.motion.activities.edit.fragments.EndStyleRecyclerAdapter");
            ((q9) adapter).Ik(0);
            RecyclerView.Adapter adapter2 = v2.q9().Ik.getAdapter();
            Intrinsics.checkNotNull(adapter2, "null cannot be cast to non-null type com.alightcreative.app.motion.activities.edit.fragments.EndStyleRecyclerAdapter");
            ((q9) adapter2).r(list.indexOf(sceneElement.getStroke().getStartStyle()));
            RecyclerView recyclerView = v2.q9().Ik;
            RecyclerView.Adapter adapter3 = v2.q9().Ik.getAdapter();
            Intrinsics.checkNotNull(adapter3, "null cannot be cast to non-null type com.alightcreative.app.motion.activities.edit.fragments.EndStyleRecyclerAdapter");
            recyclerView.scrollToPosition(((q9) adapter3).az());
        }
        XUb(v2, false, 1, null);
        v2.q9().f9653r.setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement Rc(StrokeCap strokeCap, Scene scene, SceneElement el) {
        Intrinsics.checkNotNullParameter(scene, "<unused var>");
        Intrinsics.checkNotNullParameter(el, "el");
        KeyableEdgeDecoration stroke = el.getStroke();
        return SceneElement.copy$default(el, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, stroke.copy((16339 & 1) != 0 ? stroke.type : null, (16339 & 2) != 0 ? stroke.direction : null, (16339 & 4) != 0 ? stroke.enabled : false, (16339 & 8) != 0 ? stroke.color : null, (16339 & 16) != 0 ? stroke.alpha : null, (16339 & 32) != 0 ? stroke.size : null, (16339 & 64) != 0 ? stroke.hardness : null, (16339 & 128) != 0 ? stroke.offset : null, (16339 & 256) != 0 ? stroke.cap : strokeCap, (16339 & 512) != 0 ? stroke.join : null, (16339 & 1024) != 0 ? stroke.startStyle : null, (16339 & 2048) != 0 ? stroke.endStyle : null, (16339 & 4096) != 0 ? stroke.endSize : 0.0f, (16339 & 8192) != 0 ? stroke.borderId : 0), null, null, false, null, null, false, null, null, -1073741825, 127, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement Sax(List list, int i2, Scene scene, SceneElement el) {
        Intrinsics.checkNotNullParameter(scene, "<unused var>");
        Intrinsics.checkNotNullParameter(el, "el");
        KeyableEdgeDecoration stroke = el.getStroke();
        return SceneElement.copy$default(el, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, stroke.copy((16339 & 1) != 0 ? stroke.type : null, (16339 & 2) != 0 ? stroke.direction : null, (16339 & 4) != 0 ? stroke.enabled : false, (16339 & 8) != 0 ? stroke.color : null, (16339 & 16) != 0 ? stroke.alpha : null, (16339 & 32) != 0 ? stroke.size : null, (16339 & 64) != 0 ? stroke.hardness : null, (16339 & 128) != 0 ? stroke.offset : null, (16339 & 256) != 0 ? stroke.cap : null, (16339 & 512) != 0 ? stroke.join : null, (16339 & 1024) != 0 ? stroke.startStyle : (StrokeEnd) list.get(i2), (16339 & 2048) != 0 ? stroke.endStyle : null, (16339 & 4096) != 0 ? stroke.endSize : 0.0f, (16339 & 8192) != 0 ? stroke.borderId : 0), null, null, false, null, null, false, null, null, -1073741825, 127, null);
    }

    private final void UR(SceneElement el, int position) {
        n nVar = null;
        this.paramName = null;
        float fFractionalTime = SceneElementKt.fractionalTime(el, HW.C.WPU(this));
        KeyableEdgeDecoration keyableEdgeDecoration = el.getBorders().get(position);
        SolidColor solidColor = (SolidColor) KeyableKt.valueAtTime(keyableEdgeDecoration.getColor(), fFractionalTime);
        String string = getString(2132018043);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        int iOrdinal = EdgeDecorationDirection.INSIDE.ordinal();
        String string2 = getString(2132017358);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        ChoiceInfo choiceInfo = new ChoiceInfo(iOrdinal, string2, CollectionsKt.emptyList());
        int iOrdinal2 = EdgeDecorationDirection.CENTERED.ordinal();
        String string3 = getString(2132017357);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        ChoiceInfo choiceInfo2 = new ChoiceInfo(iOrdinal2, string3, CollectionsKt.emptyList());
        int iOrdinal3 = EdgeDecorationDirection.OUTSIDE.ordinal();
        String string4 = getString(2132017359);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        UserParameter.Selector selector = new UserParameter.Selector("direction", string, true, CollectionsKt.listOf((Object[]) new ChoiceInfo[]{choiceInfo, choiceInfo2, new ChoiceInfo(iOrdinal3, string4, CollectionsKt.emptyList())}), keyableEdgeDecoration.getDirection().ordinal(), SelectorStyle.RADIO);
        String string5 = getString(2132018077);
        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
        UserParameter.Color color = new UserParameter.Color(TtmlNode.ATTR_TTS_COLOR, string5, true, solidColor, true);
        String string6 = getString(2132018405);
        Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
        List listListOf = CollectionsKt.listOf((Object[]) new UserParameter[]{selector, color, new UserParameter.Spinner("size", string6, true, 0.0f, 300.0f, 1.0f, 5.0f, 5.0f, SliderType.INTEGER, 1.0f, CollectionsKt.emptyList())});
        mz mzVar = new PropertyReference1Impl() { // from class: f0P.V.mz
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((SceneElement) obj).getBorders();
            }
        };
        oA.n nVar2 = new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), mzVar.getReturnType(), mzVar);
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SceneElement.class);
        KType type = nVar2.nr().getArguments().get(0).getType();
        Intrinsics.checkNotNull(type);
        this.borderAdapter = new n(this, new oA.w6(orCreateKotlinClass, type, nVar2, position), listListOf, new l4Z(this), 0, 8, null);
        RecyclerView recyclerView = q9().f9644O;
        n nVar3 = this.borderAdapter;
        if (nVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("borderAdapter");
        } else {
            nVar = nVar3;
        }
        recyclerView.setAdapter(nVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit V5F(final V v2, final boolean z2, boolean z3) {
        ValueAnimator valueAnimator = v2.revealAnimation;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
        v2.revealAnimation = null;
        if (z3) {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(v2.q9().XQ.getWidth(), 0);
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: f0P.lS
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    V.sFO(z2, v2, valueAnimator2);
                }
            });
            Intrinsics.checkNotNull(valueAnimatorOfInt);
            xTb.rl(valueAnimatorOfInt, new Function1() { // from class: f0P.tI
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return V.JI(this.f66215n, ((Boolean) obj).booleanValue());
                }
            });
            valueAnimatorOfInt.setDuration(200L);
            valueAnimatorOfInt.start();
            v2.revealAnimation = valueAnimatorOfInt;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Xli(V v2) {
        v2.undoBatch.n();
        v2.undoBatch = LdY.Ml.Ik.n();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean bZm() {
        if (!this.isClosed || this.panelCloser == null) {
            return false;
        }
        ValueAnimator valueAnimator = this.revealAnimation;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
        this.revealAnimation = null;
        Function1 function1 = this.panelCloser;
        if (function1 != null) {
            function1.invoke(Boolean.TRUE);
        }
        this.panelCloser = null;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Keyable c32(Scene scene, SceneElement sceneElement, V v2, Vector2D vector2D, Keyable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return KeyableKt.copyWithValueForTime(it, scene, sceneElement, HW.C.aYN(v2), vector2D);
    }

    private final int ex(float width) {
        int length = this.progressToWidthTable.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (r0[length] <= width) {
                    return length;
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement fW(oA.j jVar, final V v2, final Vector2D vector2D, final Scene scene, final SceneElement el) {
        Intrinsics.checkNotNullParameter(scene, "scene");
        Intrinsics.checkNotNullParameter(el, "el");
        iwV iwv = new PropertyReference1Impl() { // from class: f0P.V.iwV
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((KeyableEdgeDecoration) obj).getOffset();
            }
        };
        return (SceneElement) new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), iwv.getReturnType(), jVar, iwv).t(el, new Function1() { // from class: f0P.L0y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return V.c32(scene, el, v2, vector2D, (Keyable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fq(final V v2, final int i2) {
        HW.C.D(v2, new Function2() { // from class: f0P.DC
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return V.C7B(this.f64136n, i2, (Scene) obj, (SceneElement) obj2);
            }
        });
        SceneElement sceneElementNHg = HW.C.nHg(v2);
        if (sceneElementNHg != null && v2.isAdded()) {
            AppCompatTextView appCompatTextView = v2.q9().wTp;
            String str = String.format("%.1f", Arrays.copyOf(new Object[]{KeyableKt.valueAtTime(sceneElementNHg.getStroke().getSize(), SceneElementKt.fractionalTime(sceneElementNHg, HW.C.WPU(v2)))}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            appCompatTextView.setText(str);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement gxH(int i2, Scene scene, SceneElement el) {
        Intrinsics.checkNotNullParameter(scene, "<unused var>");
        Intrinsics.checkNotNullParameter(el, "el");
        KeyableEdgeDecoration stroke = el.getStroke();
        return SceneElement.copy$default(el, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, stroke.copy((16339 & 1) != 0 ? stroke.type : null, (16339 & 2) != 0 ? stroke.direction : null, (16339 & 4) != 0 ? stroke.enabled : false, (16339 & 8) != 0 ? stroke.color : null, (16339 & 16) != 0 ? stroke.alpha : null, (16339 & 32) != 0 ? stroke.size : null, (16339 & 64) != 0 ? stroke.hardness : null, (16339 & 128) != 0 ? stroke.offset : null, (16339 & 256) != 0 ? stroke.cap : null, (16339 & 512) != 0 ? stroke.join : null, (16339 & 1024) != 0 ? stroke.startStyle : null, (16339 & 2048) != 0 ? stroke.endStyle : null, (16339 & 4096) != 0 ? stroke.endSize : i2 / 100.0f, (16339 & 8192) != 0 ? stroke.borderId : 0), null, null, false, null, null, false, null, null, -1073741825, 127, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement iu(StrokeJoin strokeJoin, Scene scene, SceneElement el) {
        Intrinsics.checkNotNullParameter(scene, "<unused var>");
        Intrinsics.checkNotNullParameter(el, "el");
        KeyableEdgeDecoration stroke = el.getStroke();
        return SceneElement.copy$default(el, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, stroke.copy((16339 & 1) != 0 ? stroke.type : null, (16339 & 2) != 0 ? stroke.direction : null, (16339 & 4) != 0 ? stroke.enabled : false, (16339 & 8) != 0 ? stroke.color : null, (16339 & 16) != 0 ? stroke.alpha : null, (16339 & 32) != 0 ? stroke.size : null, (16339 & 64) != 0 ? stroke.hardness : null, (16339 & 128) != 0 ? stroke.offset : null, (16339 & 256) != 0 ? stroke.cap : null, (16339 & 512) != 0 ? stroke.join : strokeJoin, (16339 & 1024) != 0 ? stroke.startStyle : null, (16339 & 2048) != 0 ? stroke.endStyle : null, (16339 & 4096) != 0 ? stroke.endSize : 0.0f, (16339 & 8192) != 0 ? stroke.borderId : 0), null, null, false, null, null, false, null, null, -1073741825, 127, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void jX(V v2, final StrokeJoin strokeJoin, View view) {
        HW.C.D(v2, new Function2() { // from class: f0P.B
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return V.iu(strokeJoin, (Scene) obj, (SceneElement) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement kQ(List list, int i2, Scene scene, SceneElement el) {
        Intrinsics.checkNotNullParameter(scene, "<unused var>");
        Intrinsics.checkNotNullParameter(el, "el");
        KeyableEdgeDecoration stroke = el.getStroke();
        return SceneElement.copy$default(el, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, stroke.copy((16339 & 1) != 0 ? stroke.type : null, (16339 & 2) != 0 ? stroke.direction : null, (16339 & 4) != 0 ? stroke.enabled : false, (16339 & 8) != 0 ? stroke.color : null, (16339 & 16) != 0 ? stroke.alpha : null, (16339 & 32) != 0 ? stroke.size : null, (16339 & 64) != 0 ? stroke.hardness : null, (16339 & 128) != 0 ? stroke.offset : null, (16339 & 256) != 0 ? stroke.cap : null, (16339 & 512) != 0 ? stroke.join : null, (16339 & 1024) != 0 ? stroke.startStyle : null, (16339 & 2048) != 0 ? stroke.endStyle : (StrokeEnd) list.get(i2), (16339 & 4096) != 0 ? stroke.endSize : 0.0f, (16339 & 8192) != 0 ? stroke.borderId : 0), null, null, false, null, null, false, null, null, -1073741825, 127, null);
    }

    private final void l2() {
        if (HW.C.nHg(this) == null) {
            return;
        }
        SceneElement sceneElementNHg = HW.C.nHg(this);
        Intrinsics.checkNotNull(sceneElementNHg);
        KeyableEdgeDecoration dropShadow = sceneElementNHg.getDropShadow();
        SceneElement sceneElementNHg2 = HW.C.nHg(this);
        Intrinsics.checkNotNull(sceneElementNHg2);
        SolidColor solidColor = (SolidColor) KeyableKt.valueAtTime(dropShadow.getColor(), SceneElementKt.fractionalTime(sceneElementNHg2, HW.C.WPU(this)));
        String string = getString(2132018077);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        UserParameter.Color color = new UserParameter.Color(TtmlNode.ATTR_TTS_COLOR, string, true, solidColor, true);
        String string2 = getString(2132018405);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        UserParameter.Spinner spinner = new UserParameter.Spinner("size", string2, true, 0.0f, 300.0f, 1.0f, 5.0f, 5.0f, SliderType.INTEGER, 1.0f, CollectionsKt.emptyList());
        String string3 = getString(2132018004);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        UserParameter.Spinner spinner2 = new UserParameter.Spinner("alpha", string3, true, 0.0f, 1.0f, 0.01f, 1.0f, 1.0f, SliderType.PERCENT, 1.0f, CollectionsKt.emptyList());
        String string4 = getString(2132018330);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        List listListOf = CollectionsKt.listOf((Object[]) new UserParameter[]{color, spinner, spinner2, new UserParameter.Point("offset", string4, true, GeometryKt.Vector2D(-9999.0f), GeometryKt.Vector2D(9999.0f), GeometryKt.Vector2D(5.0f), PointType.OFFSET, 1.0f)});
        q9().E2.setVisibility(0);
        rv6 rv6Var = new PropertyReference1Impl() { // from class: f0P.V.rv6
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((SceneElement) obj).getDropShadow();
            }
        };
        this.borderAdapter = new n(this, new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), rv6Var.getReturnType(), rv6Var), listListOf, null, 2131232235, 4, null);
        RecyclerView recyclerView = q9().E2;
        n nVar = this.borderAdapter;
        if (nVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("borderAdapter");
            nVar = null;
        }
        recyclerView.setAdapter(nVar);
        RecyclerView.Adapter adapter = q9().E2.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        s7N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n7u(V v2) {
        v2.undoBatch.n();
        v2.undoBatch = LdY.Ml.Ik.n();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void oz() {
        List<KeyableEdgeDecoration> listEmptyList;
        final KeyableEdgeDecoration keyableEdgeDecoration = new KeyableEdgeDecoration(EdgeDecorationType.BORDER, EdgeDecorationDirection.INSIDE, true, KeyableSolidColor.INSTANCE.getWHITE(), null, KeyableKt.keyable(6.0f), null, null, null, null, null, null, 0.0f, 0, 16336, null);
        HW.C.D(this, new Function2() { // from class: f0P.g9
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return V.qva(keyableEdgeDecoration, (Scene) obj, (SceneElement) obj2);
            }
        });
        RecyclerView.Adapter adapter = q9().rl.getAdapter();
        Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.alightcreative.app.motion.activities.edit.fragments.BorderAndShadowFragment.BorderListAdapter");
        j jVar = (j) adapter;
        SceneElement sceneElementNHg = HW.C.nHg(this);
        if (sceneElementNHg == null || (listEmptyList = sceneElementNHg.getBorders()) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        jVar.WPU(listEmptyList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SJ0.tI q9() {
        return (SJ0.tI) this.contentBinding.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement qva(KeyableEdgeDecoration keyableEdgeDecoration, Scene scene, SceneElement el) {
        Integer num;
        Intrinsics.checkNotNullParameter(scene, "<unused var>");
        Intrinsics.checkNotNullParameter(el, "el");
        List<KeyableEdgeDecoration> borders = el.getBorders();
        Iterator<T> it = el.getBorders().iterator();
        if (it.hasNext()) {
            Integer numValueOf = Integer.valueOf(((KeyableEdgeDecoration) it.next()).getBorderId());
            while (it.hasNext()) {
                Integer numValueOf2 = Integer.valueOf(((KeyableEdgeDecoration) it.next()).getBorderId());
                if (numValueOf.compareTo(numValueOf2) < 0) {
                    numValueOf = numValueOf2;
                }
            }
            num = numValueOf;
        } else {
            num = null;
        }
        return SceneElement.copy$default(el, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, CollectionsKt.plus((Collection<? extends KeyableEdgeDecoration>) borders, keyableEdgeDecoration.copy((16339 & 1) != 0 ? keyableEdgeDecoration.type : null, (16339 & 2) != 0 ? keyableEdgeDecoration.direction : null, (16339 & 4) != 0 ? keyableEdgeDecoration.enabled : false, (16339 & 8) != 0 ? keyableEdgeDecoration.color : null, (16339 & 16) != 0 ? keyableEdgeDecoration.alpha : null, (16339 & 32) != 0 ? keyableEdgeDecoration.size : null, (16339 & 64) != 0 ? keyableEdgeDecoration.hardness : null, (16339 & 128) != 0 ? keyableEdgeDecoration.offset : null, (16339 & 256) != 0 ? keyableEdgeDecoration.cap : null, (16339 & 512) != 0 ? keyableEdgeDecoration.join : null, (16339 & 1024) != 0 ? keyableEdgeDecoration.startStyle : null, (16339 & 2048) != 0 ? keyableEdgeDecoration.endStyle : null, (16339 & 4096) != 0 ? keyableEdgeDecoration.endSize : 0.0f, (16339 & 8192) != 0 ? keyableEdgeDecoration.borderId : (num != null ? num.intValue() : 0) + 1)), null, false, null, null, false, null, null, Integer.MAX_VALUE, 127, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rR(V v2, boolean z2, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (!v2.isAdded()) {
            it.cancel();
            return;
        }
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) animatedValue).intValue();
        if (z2) {
            v2.q9().XQ.setClipBounds(new Rect(0, v2.q9().XQ.getHeight() - ((v2.q9().XQ.getHeight() * iIntValue) / v2.q9().XQ.getWidth()), iIntValue, v2.q9().XQ.getHeight()));
        } else {
            v2.q9().XQ.setClipBounds(new Rect(v2.q9().XQ.getWidth() - iIntValue, v2.q9().XQ.getHeight() - ((v2.q9().XQ.getHeight() * iIntValue) / v2.q9().XQ.getWidth()), v2.q9().XQ.getWidth(), v2.q9().XQ.getHeight()));
        }
        if (v2.q9().XQ.getVisibility() != 4 || iIntValue <= 0) {
            return;
        }
        v2.q9().XQ.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sFO(boolean z2, V v2, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) animatedValue).intValue();
        if (z2) {
            v2.q9().XQ.setClipBounds(new Rect(0, v2.q9().XQ.getHeight() - ((v2.q9().XQ.getHeight() * iIntValue) / v2.q9().XQ.getWidth()), iIntValue, v2.q9().XQ.getHeight()));
        } else {
            v2.q9().XQ.setClipBounds(new Rect(v2.q9().XQ.getWidth() - iIntValue, v2.q9().XQ.getHeight() - ((v2.q9().XQ.getHeight() * iIntValue) / v2.q9().XQ.getWidth()), v2.q9().XQ.getWidth(), v2.q9().XQ.getHeight()));
        }
        if (iIntValue <= 2) {
            v2.q9().XQ.setVisibility(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement t1J(boolean z2, Scene scene, SceneElement el) {
        Intrinsics.checkNotNullParameter(scene, "<unused var>");
        Intrinsics.checkNotNullParameter(el, "el");
        KeyableEdgeDecoration stroke = el.getStroke();
        return SceneElement.copy$default(el, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, stroke.copy((16339 & 1) != 0 ? stroke.type : null, (16339 & 2) != 0 ? stroke.direction : null, (16339 & 4) != 0 ? stroke.enabled : z2, (16339 & 8) != 0 ? stroke.color : null, (16339 & 16) != 0 ? stroke.alpha : null, (16339 & 32) != 0 ? stroke.size : null, (16339 & 64) != 0 ? stroke.hardness : null, (16339 & 128) != 0 ? stroke.offset : null, (16339 & 256) != 0 ? stroke.cap : null, (16339 & 512) != 0 ? stroke.join : null, (16339 & 1024) != 0 ? stroke.startStyle : null, (16339 & 2048) != 0 ? stroke.endStyle : null, (16339 & 4096) != 0 ? stroke.endSize : 0.0f, (16339 & 8192) != 0 ? stroke.borderId : 0), null, null, false, null, null, false, null, null, -1073741825, 127, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void tdZ(V v2, List list, SceneElement sceneElement, View view) {
        if (v2.isClosed || v2.panelCloser != null) {
            v2.bZm();
            return;
        }
        if (v2.q9().Ik.getAdapter() != null) {
            RecyclerView.Adapter adapter = v2.q9().Ik.getAdapter();
            Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.alightcreative.app.motion.activities.edit.fragments.EndStyleRecyclerAdapter");
            ((q9) adapter).Ik(1);
            RecyclerView.Adapter adapter2 = v2.q9().Ik.getAdapter();
            Intrinsics.checkNotNull(adapter2, "null cannot be cast to non-null type com.alightcreative.app.motion.activities.edit.fragments.EndStyleRecyclerAdapter");
            ((q9) adapter2).r(list.indexOf(sceneElement.getStroke().getEndStyle()));
            RecyclerView recyclerView = v2.q9().Ik;
            RecyclerView.Adapter adapter3 = v2.q9().Ik.getAdapter();
            Intrinsics.checkNotNull(adapter3, "null cannot be cast to non-null type com.alightcreative.app.motion.activities.edit.fragments.EndStyleRecyclerAdapter");
            recyclerView.scrollToPosition(((q9) adapter3).az());
        }
        v2.x(false);
        v2.q9().f9643N.setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(final V v2, View view) {
        Intrinsics.checkNotNull(view);
        yU.Ml ml = new yU.Ml(view, ((ColorView) view).getAndroidx.media3.extractor.text.ttml.TtmlNode.ATTR_TTS_COLOR java.lang.String());
        ml.nr().setOnColorChangeListener(v2.new psW());
        ml.nr().setPalletteClickListener(v2.new Md());
        ml.nr().setSceneHolder(HW.C.e(v2));
        ml.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: f0P.T
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                V.HFS(this.f64737n);
            }
        });
        v2.q9().ty.setColorWidget(ml.nr());
        ml.KN(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Keyable wYi(Scene scene, SceneElement sceneElement, V v2, int i2, Keyable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return KeyableKt.copyWithValueForTime(it, scene, sceneElement, SceneElementKt.fractionalTime(sceneElement, HW.C.WPU(v2)), Float.valueOf(i2 / 2.0f));
    }

    private final void x(final boolean isStart) {
        if (this.isClosed || this.panelCloser != null) {
            return;
        }
        ValueAnimator valueAnimator = this.revealAnimation;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
        this.revealAnimation = null;
        q9().f9643N.setActivated(isStart);
        q9().f9653r.setActivated(!isStart);
        q9().f9647X.setRotation(-270.0f);
        q9().HI.setRotation(0.0f);
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, q9().XQ.getWidth());
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: f0P.c7r
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                V.rR(this.f65404n, isStart, valueAnimator2);
            }
        });
        valueAnimatorOfInt.setDuration(200L);
        Intrinsics.checkNotNull(valueAnimatorOfInt);
        xTb.rl(valueAnimatorOfInt, new Function1() { // from class: f0P.t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return V.MPw(this.f66183n, ((Boolean) obj).booleanValue());
            }
        });
        valueAnimatorOfInt.start();
        this.revealAnimation = valueAnimatorOfInt;
        this.panelCloser = new Function1() { // from class: f0P.cA
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return V.V5F(this.f65405n, isStart, ((Boolean) obj).booleanValue());
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit yA(V v2, final int i2) {
        HW.C.D(v2, new Function2() { // from class: f0P.oXP
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return V.gxH(i2, (Scene) obj, (SceneElement) obj2);
            }
        });
        return Unit.INSTANCE;
    }

    @Override // f0P.Ny
    /* JADX INFO: renamed from: M7, reason: from getter */
    protected int getLayoutResource() {
        return this.layoutResource;
    }

    @Override // f0P.NO, f0P.Ny
    protected void a(int tabId) {
        Map mapMapOf = MapsKt.mapOf(TuplesKt.to(2131363826, CollectionsKt.listOf((Object[]) new View[]{q9().ty, q9().az, q9().KN, q9().nY, q9().s7N, q9().f9643N, q9().f9653r, q9().wTp, q9().f9652o, q9().f9648Z, q9().XQ})), TuplesKt.to(2131363807, CollectionsKt.listOf((Object[]) new ViewGroup[]{q9().rl, q9().nr})), TuplesKt.to(2131363824, CollectionsKt.listOf((Object[]) new ViewGroup[]{q9().E2, q9().az})));
        this.selectedBorderPosition = null;
        Iterator it = CollectionsKt.flatten(mapMapOf.values()).iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(4);
        }
        List list = (List) mapMapOf.get(Integer.valueOf(tabId));
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ((View) it2.next()).setVisibility(0);
            }
        }
        if (tabId == 2131363807) {
            q9().nr.setVisibility(4);
        }
        bZm();
        q9().XQ.setVisibility(4);
        if (tabId != 2131363826) {
            q9().ty.setVisibility(8);
        }
        if (tabId == 2131363824) {
            l2();
        }
        super.a(tabId);
        W();
        s7N();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00b6  */
    @Override // yc.Buf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean n(yc.a motionEvent) {
        Object next;
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        if (getCurrentTabId() != 2131363824) {
            return false;
        }
        n nVar = this.borderAdapter;
        Object obj = null;
        if (nVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("borderAdapter");
            nVar = null;
        }
        Iterator it = nVar.HI().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            UserParameter userParameter = (UserParameter) next;
            if (Intrinsics.areEqual(userParameter.getName(), this.paramName) && (userParameter instanceof UserParameter.Point)) {
                break;
            }
        }
        UserParameter userParameter2 = (UserParameter) next;
        if (userParameter2 == null) {
            n nVar2 = this.borderAdapter;
            if (nVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("borderAdapter");
                nVar2 = null;
            }
            Iterator it2 = nVar2.HI().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                if (((UserParameter) next2) instanceof UserParameter.Point) {
                    obj = next2;
                    break;
                }
            }
            userParameter2 = (UserParameter) obj;
            if (userParameter2 == null) {
                return false;
            }
        }
        if (!(userParameter2 instanceof UserParameter.Point)) {
            return false;
        }
        int actionMasked = motionEvent.n().getActionMasked();
        if (actionMasked == 0) {
            this.undoBatch = HW.C.xMQ(this);
            this.prevX = motionEvent.n().getRawX();
            this.prevY = motionEvent.n().getRawY();
        } else if (actionMasked == 1) {
            this.undoBatch.n();
            this.undoBatch = LdY.Ml.Ik.n();
        } else {
            if (actionMasked == 2) {
                float rawX = motionEvent.n().getRawX() - this.prevX;
                float rawY = motionEvent.n().getRawY() - this.prevY;
                this.prevX = motionEvent.n().getRawX();
                this.prevY = motionEvent.n().getRawY();
                return HE(rawX, rawY);
            }
            if (actionMasked == 3) {
            }
        }
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 100) {
            HW.C.wTp(this, resultCode, data, true);
        } else {
            super.onActivityResult(requestCode, resultCode, data);
        }
    }

    @Override // f0P.sK, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        jB().n(new j.fuX("edit_border_and_shadow", null, 2, null));
    }

    @Override // f0P.Ny, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        List<KeyableEdgeDecoration> listEmptyList;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Context context = getContext();
        if (context == null) {
            return;
        }
        q9().f9649e.setVisibility(8);
        q9().J2.setVisibility(8);
        q9().qie.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: f0P.QaP
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                V.Om(this.f64636n, compoundButton, z2);
            }
        });
        q9().ty.setOnClickListener(new View.OnClickListener() { // from class: f0P.V1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                V.w(this.f64912n, view2);
            }
        });
        q9().s7N.setMinValue(0);
        q9().s7N.setMaxValue(Sdk.SDKError.Reason.NATIVE_ASSET_ERROR_VALUE);
        q9().s7N.setLimitRange(true);
        q9().s7N.setOnStartTrackingTouch(new Function0() { // from class: f0P.Pp
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V.eb(this.f64615n);
            }
        });
        q9().s7N.setOnStopTrackingTouch(new Function0() { // from class: f0P.N
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V.Xli(this.f64502n);
            }
        });
        q9().s7N.setOnSpinAbs(new Function1() { // from class: f0P.IG
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return V.fq(this.f64353n, ((Integer) obj).intValue());
            }
        });
        q9().wTp.setOnClickListener(new View.OnClickListener() { // from class: f0P.FPL
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                V.TVk(this.f64206n, view2);
            }
        });
        q9().f9652o.setMinValue(0);
        q9().f9652o.setMaxValue(999);
        q9().f9652o.setLimitRange(true);
        q9().f9652o.setOnStartTrackingTouch(new Function0() { // from class: f0P.Y5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V.lRt(this.f65108n);
            }
        });
        q9().f9652o.setOnStopTrackingTouch(new Function0() { // from class: f0P.nSC
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return V.n7u(this.f65817n);
            }
        });
        q9().f9652o.setOnSpinAbs(new Function1() { // from class: f0P.ozJ
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return V.yA(this.f66021n, ((Integer) obj).intValue());
            }
        });
        q9().f9648Z.setOnClickListener(new View.OnClickListener() { // from class: f0P.FKk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                V.YiW(this.f64197n, view2);
            }
        });
        RecyclerView recyclerView = q9().rl;
        SceneElement sceneElementNHg = HW.C.nHg(this);
        if (sceneElementNHg == null || (listEmptyList = sceneElementNHg.getBorders()) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        recyclerView.setAdapter(new j(this, context, listEmptyList, new Lu(this), new h(this)));
        final List list = CollectionsKt.toList(this.endStyleMapLong.keySet());
        q9().Ik.addItemDecoration(new yc.xq(getResources().getDimensionPixelOffset(2131165410), getResources().getDimensionPixelOffset(2131165410), 0, 0));
        q9().Ik.setAdapter(new q9(context, new Function1() { // from class: f0P.xuv
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return V.c(this.f66347n, list, ((Integer) obj).intValue());
            }
        }, new K(this)));
        new ItemTouchHelper(new Sis()).az(q9().rl);
    }

    @Override // f0P.Ny
    protected void piY(final SceneElement el) {
        boolean enabled;
        Intrinsics.checkNotNullParameter(el, "el");
        float fFractionalTime = SceneElementKt.fractionalTime(el, HW.C.WPU(this));
        int currentTabId = getCurrentTabId();
        String str = YmsTEL.nzLIwNTFerNb;
        n nVar = null;
        n nVar2 = null;
        if (currentTabId != 2131363824) {
            enabled = false;
            if (currentTabId == 2131363826) {
                q9().ty.setColor(ColorKt.toInt((SolidColor) KeyableKt.valueAtTime(el.getStroke().getColor(), fFractionalTime)));
                q9().WPU.setText(getString(2132020258));
                boolean enabled2 = el.getStroke().getEnabled();
                q9().f9649e.setProgress(ex(((Number) KeyableKt.valueAtTime(el.getStroke().getSize(), fFractionalTime)).floatValue()));
                q9().J2.setText(String.valueOf((int) Of6(q9().f9649e.getProgress())));
                List<Pair> listListOf = CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(q9().xMQ, StrokeCap.Butt), TuplesKt.to(q9().mUb, StrokeCap.Round), TuplesKt.to(q9().gh, StrokeCap.Square)});
                List<Pair> listListOf2 = CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(q9().f9650g, StrokeJoin.Bevel), TuplesKt.to(q9().te, StrokeJoin.Miter), TuplesKt.to(q9().iF, StrokeJoin.Round)});
                for (Pair pair : listListOf) {
                    Object objComponent1 = pair.component1();
                    Intrinsics.checkNotNullExpressionValue(objComponent1, "component1(...)");
                    ImageButton imageButton = (ImageButton) objComponent1;
                    final StrokeCap strokeCap = (StrokeCap) pair.component2();
                    imageButton.setActivated(el.getStroke().getCap() == strokeCap);
                    imageButton.setOnClickListener(new View.OnClickListener() { // from class: f0P.RzR
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            V.GRh(this.f64662n, strokeCap, view);
                        }
                    });
                }
                for (Pair pair2 : listListOf2) {
                    Object objComponent12 = pair2.component1();
                    Intrinsics.checkNotNullExpressionValue(objComponent12, "component1(...)");
                    ImageButton imageButton2 = (ImageButton) objComponent12;
                    final StrokeJoin strokeJoin = (StrokeJoin) pair2.component2();
                    imageButton2.setActivated(el.getStroke().getJoin() == strokeJoin);
                    imageButton2.setOnClickListener(new View.OnClickListener() { // from class: f0P.pq
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            V.jX(this.f66046n, strokeJoin, view);
                        }
                    });
                }
                StrokeEnd startStyle = el.getStroke().getStartStyle();
                StrokeEnd strokeEnd = StrokeEnd.None;
                if (startStyle == strokeEnd) {
                    q9().nHg.setVisibility(0);
                    q9().f9646T.setVisibility(8);
                } else {
                    q9().nHg.setVisibility(8);
                    q9().f9646T.setVisibility(0);
                    Object obj = this.endStyleMapLong.get(el.getStroke().getStartStyle());
                    Intrinsics.checkNotNull(obj);
                    q9().f9646T.setImageResource(((Number) obj).intValue());
                }
                if (el.getStroke().getEndStyle() == strokeEnd) {
                    q9().f9645S.setVisibility(0);
                    q9().ck.setVisibility(8);
                } else {
                    q9().f9645S.setVisibility(8);
                    q9().ck.setVisibility(0);
                    Object obj2 = this.endStyleMapLong.get(el.getStroke().getEndStyle());
                    Intrinsics.checkNotNull(obj2);
                    q9().ck.setImageResource(((Number) obj2).intValue());
                }
                final List list = CollectionsKt.toList(this.endStyleMapLong.keySet());
                q9().f9643N.setOnClickListener(new View.OnClickListener() { // from class: f0P.kO4
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        V.Qg8(this.f65733n, list, el, view);
                    }
                });
                q9().f9653r.setOnClickListener(new View.OnClickListener() { // from class: f0P.hQ
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        V.tdZ(this.f65607n, list, el, view);
                    }
                });
                q9().f9648Z.setText(MathKt.roundToInt(el.getStroke().getEndSize() * 100.0f) + "%");
                if (!this.undoBatch.rl()) {
                    q9().f9652o.setValue(MathKt.roundToInt(el.getStroke().getEndSize() * 100.0f));
                }
                enabled = enabled2;
            } else if (this.gestureInProgress || this.selectedBorderPosition == null) {
                RecyclerView.Adapter adapter = q9().rl.getAdapter();
                j jVar = adapter instanceof j ? (j) adapter : null;
                if (jVar == null) {
                    return;
                }
                jVar.WPU(el.getBorders());
                jVar.notifyDataSetChanged();
            } else {
                n nVar3 = this.borderAdapter;
                if (nVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(str);
                } else {
                    nVar2 = nVar3;
                }
                nVar2.notifyDataSetChanged();
            }
        } else {
            if (!this.gestureInProgress) {
                n nVar4 = this.borderAdapter;
                if (nVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(str);
                } else {
                    nVar = nVar4;
                }
                nVar.notifyDataSetChanged();
                q9().ty.setColor(ColorKt.toInt((SolidColor) KeyableKt.valueAtTime(el.getDropShadow().getColor(), fFractionalTime)));
                q9().WPU.setText(getString(2132020121));
            }
            enabled = el.getDropShadow().getEnabled();
        }
        if (enabled != q9().qie.isChecked()) {
            SwitchCompat colorSwitch = q9().qie;
            Intrinsics.checkNotNullExpressionValue(colorSwitch, "colorSwitch");
            ViewParent parent = q9().qie.getParent();
            Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) parent;
            viewGroup.removeView(colorSwitch);
            colorSwitch.setChecked(enabled);
            viewGroup.addView(colorSwitch);
        }
        if (!this.undoBatch.rl()) {
            q9().s7N.setValue((int) (((Number) KeyableKt.valueAtTime(el.getStroke().getSize(), fFractionalTime)).floatValue() * 2));
        }
        AppCompatTextView appCompatTextView = q9().wTp;
        String str2 = String.format("%.1f", Arrays.copyOf(new Object[]{KeyableKt.valueAtTime(el.getStroke().getSize(), fFractionalTime)}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        appCompatTextView.setText(str2);
    }

    @Override // f0P.Ny
    /* JADX INFO: renamed from: v, reason: from getter */
    protected boolean getAutoTabSpacing() {
        return this.autoTabSpacing;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Keyable A(UserParameter param) {
        oA.j jVarWH;
        SceneElement sceneElementNHg = HW.C.nHg(this);
        if (sceneElementNHg == null || (jVarWH = WH(param)) == null) {
            return null;
        }
        return (Keyable) jVarWH.get(sceneElementNHg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SJ0.tI Co(V v2) {
        SJ0.tI tIVarN = SJ0.tI.n(v2.hRu().getChildAt(0));
        Intrinsics.checkNotNullExpressionValue(tIVarN, "bind(...)");
        return tIVarN;
    }

    private final boolean HE(float dx, float dy) {
        Object next;
        SceneElement sceneElementNHg = HW.C.nHg(this);
        if (sceneElementNHg == null) {
            return true;
        }
        n nVar = this.borderAdapter;
        Object obj = null;
        if (nVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("borderAdapter");
            nVar = null;
        }
        final oA.j jVarQie = nVar.qie();
        n nVar2 = this.borderAdapter;
        if (nVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("borderAdapter");
            nVar2 = null;
        }
        Iterator it = nVar2.HI().iterator();
        while (true) {
            if (it.hasNext()) {
                next = it.next();
                UserParameter userParameter = (UserParameter) next;
                if (Intrinsics.areEqual(userParameter.getName(), this.paramName) && (userParameter instanceof UserParameter.Point)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        UserParameter userParameter2 = (UserParameter) next;
        if (userParameter2 == null) {
            n nVar3 = this.borderAdapter;
            if (nVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("borderAdapter");
                nVar3 = null;
            }
            Iterator it2 = nVar3.HI().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                if (((UserParameter) next2) instanceof UserParameter.Point) {
                    obj = next2;
                    break;
                }
            }
            userParameter2 = (UserParameter) obj;
            if (userParameter2 == null) {
                return true;
            }
        }
        if (userParameter2 instanceof UserParameter.Point) {
            M m2 = new PropertyReference1Impl() { // from class: f0P.V.M
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public Object get(Object obj2) {
                    return ((KeyableEdgeDecoration) obj2).getOffset();
                }
            };
            UserParameter.Point point = (UserParameter.Point) userParameter2;
            final Vector2D vector2DCoerceIn = GeometryKt.coerceIn(GeometryKt.plus((Vector2D) KeyableKt.valueAtTime((Keyable) new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), m2.getReturnType(), jVarQie, m2).get(sceneElementNHg), SceneElementKt.fractionalTime(sceneElementNHg, HW.C.WPU(this))), new Vector2D(dx, dy)), point.getMinOffset(), point.getMaxOffset());
            HW.C.D(this, new Function2() { // from class: f0P.Fl
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return V.fW(jVarQie, this, vector2DCoerceIn, (Scene) obj2, (SceneElement) obj3);
                }
            });
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void HFS(V v2) {
        if (v2.isAdded()) {
            v2.q9().ty.setColorWidget(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I4p() {
        List<KeyableEdgeDecoration> listEmptyList;
        if (getCurrentTabId() == 2131363807 && q9().rl.getAdapter() != null) {
            RecyclerView.Adapter adapter = q9().rl.getAdapter();
            Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.alightcreative.app.motion.activities.edit.fragments.BorderAndShadowFragment.BorderListAdapter");
            j jVar = (j) adapter;
            SceneElement sceneElementNHg = HW.C.nHg(this);
            if (sceneElementNHg == null || (listEmptyList = sceneElementNHg.getBorders()) == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            jVar.WPU(listEmptyList);
            RecyclerView.Adapter adapter2 = q9().rl.getAdapter();
            if (adapter2 != null) {
                adapter2.notifyDataSetChanged();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit JI(V v2, boolean z2) {
        if (v2.getCurrentTabId() == 2131363826) {
            v2.q9().f9653r.setVisibility(0);
            v2.q9().f9643N.setVisibility(0);
        }
        v2.q9().f9653r.setActivated(false);
        v2.q9().f9643N.setActivated(false);
        v2.q9().f9647X.setRotation(-90.0f);
        v2.q9().HI.setRotation(180.0f);
        v2.revealAnimation = null;
        v2.panelCloser = null;
        v2.isClosed = false;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TVk(V v2, View view) {
        SurfaceView surfaceView;
        SceneElement sceneElementNHg = HW.C.nHg(v2);
        if (sceneElementNHg == null) {
            return;
        }
        float fFractionalTime = SceneElementKt.fractionalTime(sceneElementNHg, HW.C.WPU(v2));
        C2004m c2004m = new PropertyReference1Impl() { // from class: f0P.V.m
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((SceneElement) obj).getStroke();
            }
        };
        iF iFVar = new PropertyReference1Impl() { // from class: f0P.V.iF
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((KeyableEdgeDecoration) obj).getSize();
            }
        };
        oA.aC aCVar = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), iFVar.getReturnType(), new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), c2004m.getReturnType(), c2004m), iFVar);
        float fFloatValue = ((Number) KeyableKt.valueAtTime(sceneElementNHg.getStroke().getSize(), fFractionalTime)).floatValue();
        List listListOf = CollectionsKt.listOf(new C2348n(fFloatValue, 4.0f, v2.q9().s7N.getMinValue(), v2.q9().s7N.getMaxValue() / 2.0f, "", true));
        Float fValueOf = Float.valueOf(fFloatValue);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        r.UGc uGc = new r.UGc();
        uGc.v(listListOf);
        uGc.bzg(new yg(objectRef, uGc, fValueOf, null, v2, aCVar));
        uGc.rV9(new r.Ln(objectRef));
        FragmentActivity activity = v2.getActivity();
        if (activity != null) {
            surfaceView = (SurfaceView) activity.findViewById(2131363442);
        } else {
            surfaceView = null;
        }
        if (surfaceView != null) {
            Resources resources = v2.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            int[] iArr = new int[2];
            surfaceView.getLocationInWindow(iArr);
            int identifier = resources.getIdentifier("status_bar_height", "dimen", AppLovinBridge.f61290h);
            float dimensionPixelSize = iArr[1];
            if (identifier > 0) {
                dimensionPixelSize -= resources.getDimensionPixelSize(identifier);
            }
            uGc.Xw(RectKt.t(Offset.O((((long) Float.floatToRawIntBits(iArr[0])) << 32) | (((long) Float.floatToRawIntBits(dimensionPixelSize)) & 4294967295L)), Size.nr((((long) Float.floatToRawIntBits(surfaceView.getWidth())) << 32) | (((long) Float.floatToRawIntBits(surfaceView.getHeight())) & 4294967295L))));
        }
        v2.getParentFragmentManager().o().KN("NumericKeypad").o(R.id.content, uGc).mUb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W5k(final int newColor) {
        if (getCurrentTabId() == 2131363826) {
            HW.C.D(this, new Function2() { // from class: f0P.mrQ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return V.NC9(this.f65800n, newColor, (Scene) obj, (SceneElement) obj2);
                }
            });
        }
    }

    private final oA.j WH(UserParameter param) {
        int currentTabId = getCurrentTabId();
        if (currentTabId != 2131363807) {
            if (currentTabId != 2131363824) {
                if (currentTabId != 2131363826) {
                    Dsr dsr = new PropertyReference1Impl() { // from class: f0P.V.Dsr
                        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                        public Object get(Object obj) {
                            return ((SceneElement) obj).getDropShadow();
                        }
                    };
                    aC aCVar = new PropertyReference1Impl() { // from class: f0P.V.aC
                        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                        public Object get(Object obj) {
                            return ((KeyableEdgeDecoration) obj).getSize();
                        }
                    };
                    return new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), aCVar.getReturnType(), new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), dsr.getReturnType(), dsr), aCVar);
                }
                if (HW.C.nHg(this) == null) {
                    return null;
                }
                SceneElement sceneElementNHg = HW.C.nHg(this);
                Intrinsics.checkNotNull(sceneElementNHg);
                if (!sceneElementNHg.getType().getHasStroke()) {
                    return null;
                }
                CN3 cn3 = new PropertyReference1Impl() { // from class: f0P.V.CN3
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return ((SceneElement) obj).getStroke();
                    }
                };
                fuX fux = new PropertyReference1Impl() { // from class: f0P.V.fuX
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return ((KeyableEdgeDecoration) obj).getSize();
                    }
                };
                return new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), fux.getReturnType(), new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), cn3.getReturnType(), cn3), fux);
            }
            if (param instanceof UserParameter.Color) {
                Xo xo = new PropertyReference1Impl() { // from class: f0P.V.Xo
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return ((SceneElement) obj).getDropShadow();
                    }
                };
                oA.n nVar = new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), xo.getReturnType(), xo);
                eO eOVar = new PropertyReference1Impl() { // from class: f0P.V.eO
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return ((KeyableEdgeDecoration) obj).getColor();
                    }
                };
                return new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), eOVar.getReturnType(), nVar, eOVar);
            }
            if (param instanceof UserParameter.Spinner) {
                if (((UserParameter.Spinner) param).getSliderType() == SliderType.PERCENT) {
                    C2005z c2005z = new PropertyReference1Impl() { // from class: f0P.V.z
                        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                        public Object get(Object obj) {
                            return ((SceneElement) obj).getDropShadow();
                        }
                    };
                    oA.n nVar2 = new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), c2005z.getReturnType(), c2005z);
                    QJ qj = new PropertyReference1Impl() { // from class: f0P.V.QJ
                        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                        public Object get(Object obj) {
                            return ((KeyableEdgeDecoration) obj).getAlpha();
                        }
                    };
                    return new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), qj.getReturnType(), nVar2, qj);
                }
                l3D l3d = new PropertyReference1Impl() { // from class: f0P.V.l3D
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return ((SceneElement) obj).getDropShadow();
                    }
                };
                oA.n nVar3 = new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), l3d.getReturnType(), l3d);
                Ml ml = new PropertyReference1Impl() { // from class: f0P.V.Ml
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return ((KeyableEdgeDecoration) obj).getSize();
                    }
                };
                return new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), ml.getReturnType(), nVar3, ml);
            }
            if (!(param instanceof UserParameter.Point)) {
                return null;
            }
            I28 i28 = new PropertyReference1Impl() { // from class: f0P.V.I28
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public Object get(Object obj) {
                    return ((SceneElement) obj).getDropShadow();
                }
            };
            oA.n nVar4 = new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), i28.getReturnType(), i28);
            Wre wre = new PropertyReference1Impl() { // from class: f0P.V.Wre
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public Object get(Object obj) {
                    return ((KeyableEdgeDecoration) obj).getOffset();
                }
            };
            return new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), wre.getReturnType(), nVar4, wre);
        }
        if (this.selectedBorderPosition == null) {
            return null;
        }
        int i2 = w6.$EnumSwitchMapping$0[param.getDataType().ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                return null;
            }
            qz qzVar = new PropertyReference1Impl() { // from class: f0P.V.qz
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public Object get(Object obj) {
                    return ((SceneElement) obj).getBorders();
                }
            };
            oA.n nVar5 = new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), qzVar.getReturnType(), qzVar);
            Integer num = this.selectedBorderPosition;
            Intrinsics.checkNotNull(num);
            int iIntValue = num.intValue();
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SceneElement.class);
            KType type = nVar5.nr().getArguments().get(0).getType();
            Intrinsics.checkNotNull(type);
            oA.w6 w6Var = new oA.w6(orCreateKotlinClass, type, nVar5, iIntValue);
            Pl pl = new PropertyReference1Impl() { // from class: f0P.V.Pl
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public Object get(Object obj) {
                    return ((KeyableEdgeDecoration) obj).getSize();
                }
            };
            return new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), pl.getReturnType(), w6Var, pl);
        }
        C c2 = new PropertyReference1Impl() { // from class: f0P.V.C
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((SceneElement) obj).getBorders();
            }
        };
        oA.n nVar6 = new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), c2.getReturnType(), c2);
        Integer num2 = this.selectedBorderPosition;
        Intrinsics.checkNotNull(num2);
        int iIntValue2 = num2.intValue();
        KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(SceneElement.class);
        KType type2 = nVar6.nr().getArguments().get(0).getType();
        Intrinsics.checkNotNull(type2);
        oA.w6 w6Var2 = new oA.w6(orCreateKotlinClass2, type2, nVar6, iIntValue2);
        o oVar = new PropertyReference1Impl() { // from class: f0P.V.o
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((KeyableEdgeDecoration) obj).getColor();
            }
        };
        return new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), oVar.getReturnType(), w6Var2, oVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void YiW(V v2, View view) {
        SurfaceView surfaceView;
        SceneElement sceneElementNHg = HW.C.nHg(v2);
        if (sceneElementNHg == null) {
            return;
        }
        float endSize = sceneElementNHg.getStroke().getEndSize() * 100.0f;
        List listListOf = CollectionsKt.listOf(new C2348n(endSize, 150.0f, 0.0f, 999.0f, "", true));
        Float fValueOf = Float.valueOf(endSize);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        r.UGc uGc = new r.UGc();
        uGc.v(listListOf);
        uGc.bzg(new pO(objectRef, uGc, fValueOf, null, v2));
        uGc.rV9(new r.Ln(objectRef));
        FragmentActivity activity = v2.getActivity();
        if (activity != null) {
            surfaceView = (SurfaceView) activity.findViewById(2131363442);
        } else {
            surfaceView = null;
        }
        if (surfaceView != null) {
            Resources resources = v2.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            int[] iArr = new int[2];
            surfaceView.getLocationInWindow(iArr);
            int identifier = resources.getIdentifier("status_bar_height", "dimen", AppLovinBridge.f61290h);
            float dimensionPixelSize = iArr[1];
            if (identifier > 0) {
                dimensionPixelSize -= resources.getDimensionPixelSize(identifier);
            }
            uGc.Xw(RectKt.t(Offset.O((((long) Float.floatToRawIntBits(iArr[0])) << 32) | (((long) Float.floatToRawIntBits(dimensionPixelSize)) & 4294967295L)), Size.nr((((long) Float.floatToRawIntBits(surfaceView.getWidth())) << 32) | (((long) Float.floatToRawIntBits(surfaceView.getHeight())) & 4294967295L))));
        }
        v2.getParentFragmentManager().o().KN("NumericKeypad").o(R.id.content, uGc).mUb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(V v2, final List list, final int i2) {
        if (v2.q9().f9643N.getVisibility() == 0) {
            HW.C.D(v2, new Function2() { // from class: f0P.qYU
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return V.Sax(list, i2, (Scene) obj, (SceneElement) obj2);
                }
            });
        } else {
            HW.C.D(v2, new Function2() { // from class: f0P.RGN
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return V.kQ(list, i2, (Scene) obj, (SceneElement) obj2);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(final View listEntryView, final int position) {
        SceneElement sceneElementNHg = HW.C.nHg(this);
        if (sceneElementNHg == null) {
            return;
        }
        this.selectedBorderPosition = Integer.valueOf(position);
        RecyclerView.Adapter adapter = q9().rl.getAdapter();
        Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.alightcreative.app.motion.activities.edit.fragments.BorderAndShadowFragment.BorderListAdapter");
        ((j) adapter).getItemId(position);
        UR(sceneElementNHg, position);
        W();
        q9().rl.setVisibility(4);
        q9().nr.setVisibility(0);
        final ConstraintLayout borderSettingsHolder = q9().nr;
        Intrinsics.checkNotNullExpressionValue(borderSettingsHolder, "borderSettingsHolder");
        final Rect rect = new Rect(0, 0, borderSettingsHolder.getWidth(), listEntryView.getHeight());
        final Rect rect2 = new Rect(0, 0, borderSettingsHolder.getWidth(), borderSettingsHolder.getHeight());
        borderSettingsHolder.setTranslationY((listEntryView.getY() - listEntryView.getPaddingTop()) - borderSettingsHolder.getPaddingTop());
        ObjectAnimator.ofObject(borderSettingsHolder, "clipBounds", new RectEvaluator(new Rect()), rect, rect2).setDuration(200L).start();
        borderSettingsHolder.animate().translationY(0.0f).setDuration(200L).start();
        q9().fD.setText(getString(2132017355));
        q9().f9654t.setOnClickListener(new View.OnClickListener() { // from class: f0P.crp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                V.rT(borderSettingsHolder, this, rect2, rect, listEntryView, view);
            }
        });
        q9().Uo.setOnClickListener(new View.OnClickListener() { // from class: f0P.Ogx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                V.L(this.f64567n, position, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit eb(V v2) {
        v2.undoBatch = HW.C.xMQ(v2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lRt(V v2) {
        v2.undoBatch = HW.C.xMQ(v2);
        return Unit.INSTANCE;
    }

    @Override // f0P.Ny
    /* JADX INFO: renamed from: M */
    protected List getTabs() {
        if (HW.C.nHg(this) != null) {
            SceneElement sceneElementNHg = HW.C.nHg(this);
            Intrinsics.checkNotNull(sceneElementNHg);
            if (sceneElementNHg.getType().getHasStroke()) {
                return CollectionsKt.listOf((Object[]) new Ny.j[]{new Ny.j(2131363826, 2131231066, 0, 0, null, false, 60, null), new Ny.j(2131363807, 2131231012, 0, 0, null, false, 60, null), new Ny.j(2131363824, 2131231059, 0, 0, null, false, 60, null)});
            }
        }
        return CollectionsKt.listOf((Object[]) new Ny.j[]{new Ny.j(2131363807, 2131231012, 0, 0, null, false, 60, null), new Ny.j(2131363824, 2131231059, 0, 0, null, false, 60, null)});
    }

    @Override // f0P.NO
    /* JADX INFO: renamed from: lLA */
    protected List getKeyableSettings() {
        F8 f8;
        F8 f82;
        int currentTabId = getCurrentTabId();
        if (currentTabId != 2131363807) {
            if (currentTabId != 2131363824) {
                if (currentTabId != 2131363826) {
                    AnimatorOf animatorOf = AnimatorOf.Thickness;
                    qf qfVar = new PropertyReference1Impl() { // from class: f0P.V.qf
                        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                        public Object get(Object obj) {
                            return ((SceneElement) obj).getDropShadow();
                        }
                    };
                    Ln ln2 = new PropertyReference1Impl() { // from class: f0P.V.Ln
                        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                        public Object get(Object obj) {
                            return ((KeyableEdgeDecoration) obj).getSize();
                        }
                    };
                    return CollectionsKt.listOf(new F8(animatorOf, new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), ln2.getReturnType(), new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), qfVar.getReturnType(), qfVar), ln2), SetsKt.setOf(2131363824)));
                }
                if (HW.C.nHg(this) == null) {
                    return CollectionsKt.emptyList();
                }
                SceneElement sceneElementNHg = HW.C.nHg(this);
                Intrinsics.checkNotNull(sceneElementNHg);
                if (sceneElementNHg.getType().getHasStroke()) {
                    AnimatorOf animatorOf2 = AnimatorOf.Thickness;
                    DAz dAz = new PropertyReference1Impl() { // from class: f0P.V.DAz
                        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                        public Object get(Object obj) {
                            return ((SceneElement) obj).getStroke();
                        }
                    };
                    u uVar = new PropertyReference1Impl() { // from class: f0P.V.u
                        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                        public Object get(Object obj) {
                            return ((KeyableEdgeDecoration) obj).getSize();
                        }
                    };
                    return CollectionsKt.listOf(new F8(animatorOf2, new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), uVar.getReturnType(), new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), dAz.getReturnType(), dAz), uVar), SetsKt.setOf(2131363826)));
                }
                return CollectionsKt.emptyList();
            }
            n nVar = this.borderAdapter;
            if (nVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("borderAdapter");
                nVar = null;
            }
            List listHI = nVar.HI();
            ArrayList<UserParameter> arrayList = new ArrayList();
            for (Object obj : listHI) {
                if (Intrinsics.areEqual(((UserParameter) obj).getName(), this.paramName)) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (UserParameter userParameter : arrayList) {
                if (userParameter instanceof UserParameter.Color) {
                    AnimatorOf animatorOf3 = AnimatorOf.Color;
                    r rVar = new PropertyReference1Impl() { // from class: f0P.V.r
                        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                        public Object get(Object obj2) {
                            return ((SceneElement) obj2).getDropShadow();
                        }
                    };
                    oA.n nVar2 = new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), rVar.getReturnType(), rVar);
                    SPz sPz = new PropertyReference1Impl() { // from class: f0P.V.SPz
                        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                        public Object get(Object obj2) {
                            return ((KeyableEdgeDecoration) obj2).getColor();
                        }
                    };
                    f82 = new F8(animatorOf3, new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), sPz.getReturnType(), nVar2, sPz), SetsKt.setOf(2131363824));
                } else if (userParameter instanceof UserParameter.Spinner) {
                    if (((UserParameter.Spinner) userParameter).getSliderType() == SliderType.PERCENT) {
                        AnimatorOf animatorOf4 = AnimatorOf.Opacity;
                        ci ciVar = new PropertyReference1Impl() { // from class: f0P.V.ci
                            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                            public Object get(Object obj2) {
                                return ((SceneElement) obj2).getDropShadow();
                            }
                        };
                        oA.n nVar3 = new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), ciVar.getReturnType(), ciVar);
                        g9s g9sVar = new PropertyReference1Impl() { // from class: f0P.V.g9s
                            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                            public Object get(Object obj2) {
                                return ((KeyableEdgeDecoration) obj2).getAlpha();
                            }
                        };
                        f82 = new F8(animatorOf4, new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), g9sVar.getReturnType(), nVar3, g9sVar), SetsKt.setOf(2131363824));
                    } else {
                        AnimatorOf animatorOf5 = AnimatorOf.Thickness;
                        afx afxVar = new PropertyReference1Impl() { // from class: f0P.V.afx
                            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                            public Object get(Object obj2) {
                                return ((SceneElement) obj2).getDropShadow();
                            }
                        };
                        oA.n nVar4 = new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), afxVar.getReturnType(), afxVar);
                        Z z2 = new PropertyReference1Impl() { // from class: f0P.V.Z
                            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                            public Object get(Object obj2) {
                                return ((KeyableEdgeDecoration) obj2).getSize();
                            }
                        };
                        f82 = new F8(animatorOf5, new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), z2.getReturnType(), nVar4, z2), SetsKt.setOf(2131363824));
                    }
                } else if (userParameter instanceof UserParameter.Point) {
                    AnimatorOf animatorOf6 = AnimatorOf.Location;
                    Ew ew = new PropertyReference1Impl() { // from class: f0P.V.Ew
                        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                        public Object get(Object obj2) {
                            return ((SceneElement) obj2).getDropShadow();
                        }
                    };
                    oA.n nVar5 = new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), ew.getReturnType(), ew);
                    nKK nkk = new PropertyReference1Impl() { // from class: f0P.V.nKK
                        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                        public Object get(Object obj2) {
                            return ((KeyableEdgeDecoration) obj2).getOffset();
                        }
                    };
                    f82 = new F8(animatorOf6, new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), nkk.getReturnType(), nVar5, nkk), SetsKt.setOf(2131363824));
                } else {
                    f82 = null;
                }
                if (f82 != null) {
                    arrayList2.add(f82);
                }
            }
            return arrayList2;
        }
        if (this.selectedBorderPosition == null) {
            return CollectionsKt.emptyList();
        }
        n nVar6 = this.borderAdapter;
        if (nVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("borderAdapter");
            nVar6 = null;
        }
        List listHI2 = nVar6.HI();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listHI2) {
            if (Intrinsics.areEqual(((UserParameter) obj2).getName(), this.paramName)) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            int i2 = w6.$EnumSwitchMapping$0[((UserParameter) it.next()).getDataType().ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    f8 = null;
                } else {
                    AnimatorOf animatorOf7 = AnimatorOf.Thickness;
                    UGc uGc = new PropertyReference1Impl() { // from class: f0P.V.UGc
                        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                        public Object get(Object obj3) {
                            return ((SceneElement) obj3).getBorders();
                        }
                    };
                    oA.n nVar7 = new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), uGc.getReturnType(), uGc);
                    Integer num = this.selectedBorderPosition;
                    Intrinsics.checkNotNull(num);
                    int iIntValue = num.intValue();
                    KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SceneElement.class);
                    KType type = nVar7.nr().getArguments().get(0).getType();
                    Intrinsics.checkNotNull(type);
                    oA.w6 w6Var = new oA.w6(orCreateKotlinClass, type, nVar7, iIntValue);
                    Q q2 = new PropertyReference1Impl() { // from class: f0P.V.Q
                        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                        public Object get(Object obj3) {
                            return ((KeyableEdgeDecoration) obj3).getSize();
                        }
                    };
                    f8 = new F8(animatorOf7, new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), q2.getReturnType(), w6Var, q2), SetsKt.setOf(2131363807));
                }
            } else {
                AnimatorOf animatorOf8 = AnimatorOf.Color;
                C2003c c2003c = new PropertyReference1Impl() { // from class: f0P.V.c
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj3) {
                        return ((SceneElement) obj3).getBorders();
                    }
                };
                oA.n nVar8 = new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), c2003c.getReturnType(), c2003c);
                Integer num2 = this.selectedBorderPosition;
                Intrinsics.checkNotNull(num2);
                int iIntValue2 = num2.intValue();
                KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(SceneElement.class);
                KType type2 = nVar8.nr().getArguments().get(0).getType();
                Intrinsics.checkNotNull(type2);
                oA.w6 w6Var2 = new oA.w6(orCreateKotlinClass2, type2, nVar8, iIntValue2);
                s4 s4Var = new PropertyReference1Impl() { // from class: f0P.V.s4
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj3) {
                        return ((KeyableEdgeDecoration) obj3).getColor();
                    }
                };
                f8 = new F8(animatorOf8, new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), s4Var.getReturnType(), w6Var2, s4Var), SetsKt.setOf(2131363807));
            }
            if (f8 != null) {
                arrayList4.add(f8);
            }
        }
        return arrayList4;
    }

    @Override // yc.DAz
    public boolean onBackPressed() {
        return bZm();
    }

    @Override // yc.QhI
    public int t() {
        return 2131362616;
    }
}
