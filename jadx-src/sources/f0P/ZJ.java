package f0P;

import LdY.Ml;
import QmE.j;
import SJ0.C1464t;
import aT.dE.JLZo;
import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.RectEvaluator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.Trmy.yioUaKMByL;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.PopupWindow;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.Size;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.ComponentActivity;
import androidx.view.LifecycleOwnerKt;
import androidx.view.result.ActivityResult;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.contract.ActivityResultContracts;
import androidx.viewbinding.ViewBinding;
import com.alightcreative.app.motion.activities.ColorPickerActivity;
import com.alightcreative.app.motion.activities.EditActivity;
import com.alightcreative.app.motion.activities.edit.ColorView;
import com.alightcreative.app.motion.activities.edit.widgets.ColorPickerWidget;
import com.alightcreative.app.motion.activities.effectbrowser.EffectBrowserActivity;
import com.alightcreative.app.motion.scene.ColorKt;
import com.alightcreative.app.motion.scene.GeometryKt;
import com.alightcreative.app.motion.scene.Keyable;
import com.alightcreative.app.motion.scene.KeyableKt;
import com.alightcreative.app.motion.scene.Quaternion;
import com.alightcreative.app.motion.scene.Scene;
import com.alightcreative.app.motion.scene.SceneElement;
import com.alightcreative.app.motion.scene.SceneElementKt;
import com.alightcreative.app.motion.scene.SceneElementType;
import com.alightcreative.app.motion.scene.SceneHolder;
import com.alightcreative.app.motion.scene.SolidColor;
import com.alightcreative.app.motion.scene.TimeKt;
import com.alightcreative.app.motion.scene.TrackballKt;
import com.alightcreative.app.motion.scene.Vector2D;
import com.alightcreative.app.motion.scene.Vector3D;
import com.alightcreative.app.motion.scene.animators.AnimatorOf;
import com.alightcreative.app.motion.scene.userparam.ChoiceInfo;
import com.alightcreative.app.motion.scene.userparam.DataType;
import com.alightcreative.app.motion.scene.userparam.KeyableUserParameterValue;
import com.alightcreative.app.motion.scene.userparam.SelectorStyle;
import com.alightcreative.app.motion.scene.userparam.SliderType;
import com.alightcreative.app.motion.scene.userparam.StaticTextStyle;
import com.alightcreative.app.motion.scene.userparam.UserParameter;
import com.alightcreative.app.motion.scene.userparam.UserParameterKt;
import com.alightcreative.app.motion.scene.visualeffect.EffectPreset;
import com.alightcreative.app.motion.scene.visualeffect.EffectType;
import com.alightcreative.app.motion.scene.visualeffect.KeyableVisualEffectRef;
import com.alightcreative.app.motion.scene.visualeffect.VisualEffect;
import com.alightcreative.app.motion.scene.visualeffect.VisualEffectKt;
import com.alightcreative.widget.AlightSlider;
import com.alightcreative.widget.HueDiscView;
import com.alightcreative.widget.ValueSpinner;
import com.alightcreative.widget.YBiasView;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.safedk.android.analytics.AppLovinBridge;
import com.safedk.android.utils.Logger;
import com.vungle.ads.internal.protos.Sdk;
import f0P.SF;
import f0P.ZJ;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kP.InterfaceC2210n;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
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
import kotlin.text.Typography;
import r.C2348n;
import x0X.n;
import xAo.C2423z;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0092\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 ®\u00012\u00020\u00012\u00020\u0002:\u0003G¯\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J-\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\r\u001a\f\u0012\u0006\b\u0001\u0012\u00020\n\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0004J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0019\u001a\u00020\u0011*\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001b\u0010\u0004J1\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0002¢\u0006\u0004\b#\u0010$J\u001f\u0010'\u001a\u00020\u00112\u0006\u0010&\u001a\u00020%2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b'\u0010(J\u001f\u0010)\u001a\u00020\u00112\u0006\u0010&\u001a\u00020%2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b)\u0010(J/\u00101\u001a\u0002002\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020*2\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020-H\u0002¢\u0006\u0004\b1\u00102J\u0017\u00105\u001a\u00020\u00112\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b5\u00106J!\u0010:\u001a\u00020\u00112\u0006\u00107\u001a\u00020%2\b\u00109\u001a\u0004\u0018\u000108H\u0016¢\u0006\u0004\b:\u0010;J\u0017\u0010<\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\bH\u0014¢\u0006\u0004\b<\u0010\u0017J\u001f\u0010A\u001a\u00020\u00112\u0006\u0010>\u001a\u00020=2\b\u0010@\u001a\u0004\u0018\u00010?¢\u0006\u0004\bA\u0010BJ\u0017\u0010C\u001a\u00020\u00112\u0006\u00107\u001a\u00020%H\u0014¢\u0006\u0004\bC\u0010DJ\u0017\u0010G\u001a\u0002002\u0006\u0010F\u001a\u00020EH\u0016¢\u0006\u0004\bG\u0010HJ)\u0010M\u001a\u00020\u00112\u0006\u0010I\u001a\u00020\u000f2\u0006\u0010J\u001a\u00020\u000f2\b\u0010L\u001a\u0004\u0018\u00010KH\u0017¢\u0006\u0004\bM\u0010NR\u001b\u0010T\u001a\u00020O8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\"\u0010\\\u001a\u00020U8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\"\u0010d\u001a\u00020]8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\"\u0010l\u001a\u00020e8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\"\u0010s\u001a\u00020m8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bC\u0010n\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR\u001a\u0010x\u001a\u00020\u000f8\u0014X\u0094D¢\u0006\f\n\u0004\bt\u0010u\u001a\u0004\bv\u0010wR$\u0010{\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020y\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010zR\u0016\u0010~\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010}R\u001b\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u007f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001e\u0010\u0086\u0001\u001a\u00070\u0083\u0001R\u00020\u00008\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001b\u0010\u0089\u0001\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0018\u0010\u008b\u0001\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008a\u0001\u0010}R\u001a\u0010\u008f\u0001\u001a\u00030\u008c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0017\u0010\u0090\u0001\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010}R\u001e\u0010\u0094\u0001\u001a\t\u0012\u0004\u0012\u00020K0\u0091\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0019\u0010\u0097\u0001\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0019\u0010\u0099\u0001\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0096\u0001R\u001a\u0010\u009d\u0001\u001a\u00030\u009a\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R\u001a\u0010¡\u0001\u001a\u00030\u009e\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R\u0017\u0010¤\u0001\u001a\u00020\"8BX\u0082\u0004¢\u0006\b\u001a\u0006\b¢\u0001\u0010£\u0001R\u0017\u0010§\u0001\u001a\u0002008TX\u0094\u0004¢\u0006\b\u001a\u0006\b¥\u0001\u0010¦\u0001R\u0017\u0010©\u0001\u001a\u0002008TX\u0094\u0004¢\u0006\b\u001a\u0006\b¨\u0001\u0010¦\u0001R\u001e\u0010\u00ad\u0001\u001a\t\u0012\u0005\u0012\u00030ª\u00010\u001c8TX\u0094\u0004¢\u0006\b\u001a\u0006\b«\u0001\u0010¬\u0001¨\u0006°\u0001"}, d2 = {"Lf0P/ZJ;", "Lyc/Buf;", "Lf0P/NO;", "<init>", "()V", "Lcom/alightcreative/app/motion/scene/userparam/UserParameter;", "param", "LoA/j;", "Lcom/alightcreative/app/motion/scene/SceneElement;", "Lcom/alightcreative/app/motion/scene/Keyable;", "", "Lu", "(Lcom/alightcreative/app/motion/scene/userparam/UserParameter;)LoA/j;", "L", "(Lcom/alightcreative/app/motion/scene/userparam/UserParameter;)Lcom/alightcreative/app/motion/scene/Keyable;", "", "position", "", "tdZ", "(I)V", "HE", "el", "UR", "(Lcom/alightcreative/app/motion/scene/SceneElement;)V", "Landroid/app/Activity;", "lS", "(Landroid/app/Activity;)V", "fW", "", "Lcom/alightcreative/app/motion/scene/visualeffect/EffectType;", "effectTypes", "", "Lcom/alightcreative/app/motion/scene/visualeffect/EffectAffinity$Type;", "layerAffinity", "", "WH", "(Ljava/util/List;Ljava/util/Set;)Ljava/util/List;", "Landroid/view/View;", "listEntryView", "l2", "(Landroid/view/View;I)V", "Om", "", "dx", "dy", "Lcom/alightcreative/app/motion/scene/Quaternion;", "orientation", "invertedOrientation", "", "sFO", "(FFLcom/alightcreative/app/motion/scene/Quaternion;Lcom/alightcreative/app/motion/scene/Quaternion;)Z", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "piY", "Lcom/alightcreative/app/motion/scene/visualeffect/VisualEffect;", "effect", "Lcom/alightcreative/app/motion/scene/visualeffect/EffectPreset;", "preset", "iV", "(Lcom/alightcreative/app/motion/scene/visualeffect/VisualEffect;Lcom/alightcreative/app/motion/scene/visualeffect/EffectPreset;)V", "D", "(Landroid/view/View;)V", "Lyc/a;", "motionEvent", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(Lyc/a;)Z", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "LSJ0/FPL;", "M", "Lkotlin/Lazy;", "q9", "()LSJ0/FPL;", "contentBinding", "LkgE/fuX;", "FX", "LkgE/fuX;", "qva", "()LkgE/fuX;", "setIapManager", "(LkgE/fuX;)V", "iapManager", "LQ/fuX;", "B", "LQ/fuX;", "A", "()LQ/fuX;", "setFeatureUnlockManager", "(LQ/fuX;)V", "featureUnlockManager", "LnYs/Ml;", "J", "LnYs/Ml;", "oz", "()LnYs/Ml;", "setGetAlightSettingsUseCase", "(LnYs/Ml;)V", "getAlightSettingsUseCase", "LkP/n;", "LkP/n;", "d", "()LkP/n;", "setInjet", "(LkP/n;)V", "injet", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "I", "M7", "()I", "layoutResource", "Lcom/alightcreative/app/motion/scene/visualeffect/KeyableVisualEffectRef;", "LoA/j;", "settingEffectLens", "GR", "Z", "gestureInProgress", "", "Nxk", "Ljava/lang/Long;", "adapterEffectId", "Lf0P/ZJ$n;", "Y", "Lf0P/ZJ$n;", "adapter", "k", "Ljava/lang/String;", "paramName", "dR0", "autoSelectEffect", "Lcom/alightcreative/app/motion/activities/EditActivity$Wre;", "z", "Lcom/alightcreative/app/motion/activities/EditActivity$Wre;", "guideDuration", "showedTrialPopup", "Landroidx/activity/result/ActivityResultLauncher;", "ijL", "Landroidx/activity/result/ActivityResultLauncher;", "addEffectlauncher", "m", "F", "prevX", "eTf", "prevY", "Lcom/alightcreative/app/motion/scene/Vector2D;", "xg", "Lcom/alightcreative/app/motion/scene/Vector2D;", "prevV", "LLdY/Ml$j;", "pJg", "LLdY/Ml$j;", "undoBatch", "rT", "()Ljava/lang/String;", "projectId", "eF", "()Z", "showOverflow", "tUK", "enableOverflow", "Lf0P/F8;", "lLA", "()Ljava/util/List;", "keyableSettings", "ofS", "j", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nEffectsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EffectsFragment.kt\ncom/alightcreative/app/motion/activities/edit/fragments/EffectsFragment\n+ 2 Lens.kt\ncom/alightcreative/lens/LensKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 6 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,2041:1\n124#2:2042\n140#2:2043\n124#2:2044\n140#2:2045\n124#2:2046\n124#2:2047\n140#2:2048\n124#2:2049\n124#2:2050\n140#2:2051\n124#2:2052\n124#2:2053\n140#2:2054\n124#2:2055\n124#2:2056\n140#2:2057\n124#2:2058\n124#2:2072\n140#2:2073\n124#2:2074\n140#2:2075\n124#2:2076\n124#2:2077\n140#2:2078\n124#2:2079\n124#2:2080\n140#2:2081\n124#2:2082\n124#2:2083\n140#2:2084\n124#2:2085\n124#2:2086\n140#2:2087\n124#2:2088\n143#2:2142\n140#2:2143\n124#2:2156\n140#2:2157\n124#2:2158\n140#2:2159\n124#2:2160\n124#2:2210\n124#2:2211\n774#3:2059\n865#3,2:2060\n1611#3,9:2062\n1863#3:2071\n1864#3:2090\n1620#3:2091\n295#3,2:2092\n230#3,2:2096\n1557#3:2099\n1628#3,3:2100\n1611#3,9:2111\n1863#3:2120\n1864#3:2123\n1620#3:2124\n774#3:2125\n865#3,2:2126\n774#3:2128\n865#3:2129\n1734#3,3:2130\n866#3:2133\n774#3:2134\n865#3,2:2135\n1062#3:2137\n1557#3:2138\n1628#3,3:2139\n1755#3,3:2144\n1755#3,3:2147\n295#3,2:2150\n295#3,2:2152\n295#3,2:2154\n295#3,2:2161\n295#3,2:2163\n1611#3,9:2166\n1863#3:2175\n1864#3:2177\n1620#3:2178\n1611#3,9:2180\n1863#3:2189\n1864#3:2191\n1620#3:2192\n295#3,2:2194\n774#3:2196\n865#3,2:2197\n774#3:2199\n865#3,2:2200\n1557#3:2202\n1628#3,3:2203\n1557#3:2206\n1628#3,3:2207\n1#4:2089\n1#4:2121\n1#4:2122\n1#4:2165\n1#4:2176\n1#4:2179\n1#4:2190\n1#4:2193\n188#5,2:2094\n190#5:2098\n37#6:2103\n36#6,3:2104\n37#6:2107\n36#6,3:2108\n*S KotlinDebug\n*F\n+ 1 EffectsFragment.kt\ncom/alightcreative/app/motion/activities/edit/fragments/EffectsFragment\n*L\n216#1:2042\n216#1:2043\n218#1:2044\n218#1:2045\n218#1:2046\n219#1:2047\n219#1:2048\n219#1:2049\n220#1:2050\n220#1:2051\n220#1:2052\n221#1:2053\n221#1:2054\n221#1:2055\n222#1:2056\n222#1:2057\n222#1:2058\n245#1:2072\n245#1:2073\n250#1:2074\n250#1:2075\n250#1:2076\n254#1:2077\n254#1:2078\n254#1:2079\n258#1:2080\n258#1:2081\n258#1:2082\n262#1:2083\n262#1:2084\n262#1:2085\n266#1:2086\n266#1:2087\n266#1:2088\n553#1:2142\n553#1:2143\n803#1:2156\n803#1:2157\n814#1:2158\n814#1:2159\n814#1:2160\n807#1:2210\n819#1:2211\n241#1:2059\n241#1:2060,2\n241#1:2062,9\n241#1:2071\n241#1:2090\n241#1:2091\n399#1:2092,2\n402#1:2096,2\n442#1:2099\n442#1:2100,3\n466#1:2111,9\n466#1:2120\n466#1:2123\n466#1:2124\n469#1:2125\n469#1:2126,2\n477#1:2128\n477#1:2129\n477#1:2130,3\n477#1:2133\n478#1:2134\n478#1:2135,2\n479#1:2137\n485#1:2138\n485#1:2139,3\n683#1:2144,3\n684#1:2147,3\n757#1:2150,2\n797#1:2152,2\n798#1:2154,2\n192#1:2161,2\n193#1:2163,2\n519#1:2166,9\n519#1:2175\n519#1:2177\n519#1:2178\n620#1:2180,9\n620#1:2189\n620#1:2191\n620#1:2192\n649#1:2194,2\n713#1:2196\n713#1:2197,2\n721#1:2199\n721#1:2200,2\n729#1:2202\n729#1:2203,3\n735#1:2206\n735#1:2207,3\n241#1:2089\n466#1:2122\n519#1:2176\n620#1:2190\n401#1:2094,2\n401#1:2098\n442#1:2103\n442#1:2104,3\n443#1:2107\n443#1:2108,3\n*E\n"})
public final class ZJ extends com.alightcreative.app.motion.activities.edit.fragments.j implements yc.Buf {

    /* JADX INFO: renamed from: B, reason: collision with root package name and from kotlin metadata */
    public Q.fuX featureUnlockManager;

    /* JADX INFO: renamed from: D, reason: collision with root package name and from kotlin metadata */
    public InterfaceC2210n injet;

    /* JADX INFO: renamed from: FX, reason: collision with root package name and from kotlin metadata */
    public kgE.fuX iapManager;

    /* JADX INFO: renamed from: GR, reason: collision with root package name and from kotlin metadata */
    private boolean gestureInProgress;

    /* JADX INFO: renamed from: I, reason: collision with root package name and from kotlin metadata */
    private oA.j settingEffectLens;

    /* JADX INFO: renamed from: J, reason: collision with root package name and from kotlin metadata */
    public nYs.Ml getAlightSettingsUseCase;

    /* JADX INFO: renamed from: Nxk, reason: from kotlin metadata */
    private Long adapterEffectId;

    /* JADX INFO: renamed from: Y, reason: collision with root package name and from kotlin metadata */
    private n adapter;

    /* JADX INFO: renamed from: dR0, reason: from kotlin metadata */
    private boolean autoSelectEffect;

    /* JADX INFO: renamed from: eTf, reason: from kotlin metadata */
    private float prevY;

    /* JADX INFO: renamed from: ijL, reason: from kotlin metadata */
    private final ActivityResultLauncher addEffectlauncher;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private String paramName;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private float prevX;

    /* JADX INFO: renamed from: pJg, reason: from kotlin metadata */
    private Ml.j undoBatch;

    /* JADX INFO: renamed from: piY, reason: from kotlin metadata */
    private boolean showedTrialPopup;

    /* JADX INFO: renamed from: xg, reason: from kotlin metadata */
    private Vector2D prevV;

    /* JADX INFO: renamed from: ofS, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final int f65146C = 8;

    /* JADX INFO: renamed from: M, reason: collision with root package name and from kotlin metadata */
    private final Lazy contentBinding = LazyKt.lazy(new Function0() { // from class: f0P.CY
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ZJ.Co(this.f64115n);
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int layoutResource = 2131558598;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private EditActivity.Wre guideDuration = EditActivity.Wre.f44461t;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    public static final class Ew extends AnimatorListenerAdapter {
        Ew() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            if (ZJ.this.isAdded()) {
                ZJ.this.q9().nr.setVisibility(0);
                ZJ.this.q9().J2.setVisibility(4);
            }
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    /* synthetic */ class Lu extends FunctionReferenceImpl implements Function1 {
        Lu(Object obj) {
            super(1, obj, ZJ.class, "onToggleVisibility", "onToggleVisibility(I)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            n(((Number) obj).intValue());
            return Unit.INSTANCE;
        }

        public final void n(int i2) {
            ((ZJ) this.receiver).tdZ(i2);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    /* synthetic */ class M extends FunctionReferenceImpl implements Function0 {
        M(Object obj) {
            super(0, obj, ZJ.class, "keyframeClickListener", "keyframeClickListener()V", 0);
        }

        public final void n() {
            ((ZJ) this.receiver).HE();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            n();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    public static final class Ml implements Comparator {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Set f65166n;

        public Ml(Set set) {
            this.f65166n = set;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ComparisonsKt.compareValues(Integer.valueOf(VisualEffectKt.affinityFor((VisualEffect) obj2, this.f65166n)), Integer.valueOf(VisualEffectKt.affinityFor((VisualEffect) obj, this.f65166n)));
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    /* synthetic */ class h extends FunctionReferenceImpl implements Function2 {
        h(Object obj) {
            super(2, obj, ZJ.class, "onEffectSettingsClick", "onEffectSettingsClick(Landroid/view/View;I)V", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            n((View) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        public final void n(View p0, int i2) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((ZJ) this.receiver).l2(p0, i2);
        }
    }

    /* JADX INFO: renamed from: f0P.ZJ$j, reason: from kotlin metadata */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ZJ n(String projectId) {
            Intrinsics.checkNotNullParameter(projectId, "projectId");
            ZJ zj = new ZJ();
            zj.setArguments(BundleKt.n(TuplesKt.to("projectId", projectId)));
            return zj;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    final class n extends RecyclerView.Adapter {
        private TextView J2;
        private int KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private List f65185O;
        private View Uo;
        final /* synthetic */ ZJ mUb;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private KeyableVisualEffectRef f65186n;
        private final VisualEffect nr;
        private final oA.j rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Set f65187t;
        private Quaternion xMQ;

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
        public final class j extends RecyclerView.ViewHolder {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final ViewBinding f65188n;
            final /* synthetic */ n rl;

            /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
            public static final class K implements SeekBar.OnSeekBarChangeListener {
                final /* synthetic */ TextView J2;
                final /* synthetic */ String KN;

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                final /* synthetic */ Ref.ObjectRef f65195O;
                final /* synthetic */ View Uo;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ ZJ f65196n;
                final /* synthetic */ n nr;
                final /* synthetic */ j rl;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ UserParameter f65197t;

                K(ZJ zj, j jVar, UserParameter userParameter, n nVar, Ref.ObjectRef objectRef, TextView textView, View view, String str) {
                    this.f65196n = zj;
                    this.rl = jVar;
                    this.f65197t = userParameter;
                    this.nr = nVar;
                    this.f65195O = objectRef;
                    this.J2 = textView;
                    this.Uo = view;
                    this.KN = str;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Keyable nr(Scene scene, SceneElement sceneElement, ZJ zj, float f3, Keyable it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return KeyableKt.copyWithValueForTime(it, scene, sceneElement, HW.C.aYN(zj), Float.valueOf(f3));
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final SceneElement t(n nVar, UserParameter userParameter, final ZJ zj, final float f3, final Scene scene, final SceneElement el) {
                    Intrinsics.checkNotNullParameter(scene, "scene");
                    Intrinsics.checkNotNullParameter(el, "el");
                    oA.j jVarAz = nVar.az();
                    C0876j c0876j = new PropertyReference1Impl() { // from class: f0P.ZJ.n.j.K.j
                        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                        public Object get(Object obj) {
                            return Boolean.valueOf(((KeyableVisualEffectRef) obj).getLocallyApplied());
                        }
                    };
                    oA.aC aCVar = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), c0876j.getReturnType(), jVarAz, c0876j);
                    oA.j jVarAz2 = nVar.az();
                    C0877n c0877n = new PropertyReference1Impl() { // from class: f0P.ZJ.n.j.K.n
                        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                        public Object get(Object obj) {
                            return ((KeyableVisualEffectRef) obj).getParameters();
                        }
                    };
                    oA.aC aCVar2 = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), c0877n.getReturnType(), jVarAz2, c0877n);
                    Pair pair = TuplesKt.to(((UserParameter.Slider) userParameter).getName(), new KeyableUserParameterValue(0.0f));
                    KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SceneElement.class);
                    KType type = aCVar2.nr().getArguments().get(0).getType();
                    Intrinsics.checkNotNull(type);
                    oA.I28 i28 = new oA.I28(orCreateKotlinClass, type, aCVar2, pair.getFirst(), pair.getSecond());
                    w6 w6Var = new PropertyReference1Impl() { // from class: f0P.ZJ.n.j.K.w6
                        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                        public Object get(Object obj) {
                            return ((KeyableUserParameterValue) obj).getFloatValue();
                        }
                    };
                    return (SceneElement) new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), w6Var.getReturnType(), i28, w6Var).t((SceneElement) aCVar.rl(el, Boolean.TRUE), new Function1() { // from class: f0P.TfQ
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ZJ.n.j.K.nr(scene, el, zj, f3, (Keyable) obj);
                        }
                    });
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public void onProgressChanged(SeekBar seekBar, int i2, boolean z2) {
                    if (z2 && this.f65196n.gestureInProgress) {
                        final float f3 = i2 / 1000.0f;
                        ((SJ0.xuv) this.rl.lRt()).nr.setText(UserParameterKt.format(((UserParameter.Slider) this.f65197t).getSliderType(), f3));
                        final ZJ zj = this.f65196n;
                        final n nVar = this.nr;
                        final UserParameter userParameter = this.f65197t;
                        HW.C.D(zj, new Function2() { // from class: f0P.Dc
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ZJ.n.j.K.t(nVar, userParameter, zj, f3, (Scene) obj, (SceneElement) obj2);
                            }
                        });
                    }
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [LdY.Ml$j, T] */
                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public void onStartTrackingTouch(SeekBar seekBar) {
                    j.L(this.f65196n, this.f65197t, this.nr, this.J2, this.Uo, this.rl, this.KN);
                    this.f65195O.element = HW.C.xMQ(this.f65196n);
                    this.f65196n.gestureInProgress = true;
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public void onStopTrackingTouch(SeekBar seekBar) {
                    Ml.j jVar = (Ml.j) this.f65195O.element;
                    if (jVar != null) {
                        jVar.n();
                    }
                    this.f65196n.gestureInProgress = false;
                }
            }

            /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
            public static final class OU implements Function1 {
                final /* synthetic */ UserParameter J2;

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                final /* synthetic */ Object f65210O;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ Ref.ObjectRef f65211n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                final /* synthetic */ oA.j f65212o;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ Fragment f65213r;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ r.UGc f65214t;

                /* JADX INFO: renamed from: f0P.ZJ$n$j$OU$j, reason: collision with other inner class name */
                public static final class C0878j implements Function2 {

                    /* JADX INFO: renamed from: O, reason: collision with root package name */
                    final /* synthetic */ Object f65215O;

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    final /* synthetic */ oA.j f65216n;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    final /* synthetic */ Fragment f65217t;

                    /* JADX INFO: renamed from: f0P.ZJ$n$j$OU$j$j, reason: collision with other inner class name */
                    public static final class C0879j implements Function1 {
                        final /* synthetic */ Object J2;

                        /* JADX INFO: renamed from: O, reason: collision with root package name */
                        final /* synthetic */ Fragment f65218O;

                        /* JADX INFO: renamed from: n, reason: collision with root package name */
                        final /* synthetic */ Scene f65219n;

                        /* JADX INFO: renamed from: t, reason: collision with root package name */
                        final /* synthetic */ SceneElement f65220t;

                        public C0879j(Scene scene, SceneElement sceneElement, Fragment fragment, Object obj) {
                            this.f65219n = scene;
                            this.f65220t = sceneElement;
                            this.f65218O = fragment;
                            this.J2 = obj;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                        public final Keyable invoke(Keyable it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            return KeyableKt.copyWithValueForTime(it, this.f65219n, this.f65220t, HW.C.aYN(this.f65218O), this.J2);
                        }
                    }

                    public C0878j(oA.j jVar, Fragment fragment, Object obj) {
                        this.f65216n = jVar;
                        this.f65217t = fragment;
                        this.f65215O = obj;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                    public final SceneElement invoke(Scene scene, SceneElement el) {
                        Intrinsics.checkNotNullParameter(scene, "scene");
                        Intrinsics.checkNotNullParameter(el, "el");
                        return (SceneElement) this.f65216n.t(el, new C0879j(scene, el, this.f65217t, this.f65215O));
                    }
                }

                public OU(Ref.ObjectRef objectRef, r.UGc uGc, Object obj, UserParameter userParameter, Fragment fragment, oA.j jVar) {
                    this.f65211n = objectRef;
                    this.f65214t = uGc;
                    this.f65210O = obj;
                    this.J2 = userParameter;
                    this.f65213r = fragment;
                    this.f65212o = jVar;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    n((List) obj);
                    return Unit.INSTANCE;
                }

                /* JADX WARN: Type inference failed for: r1v13, types: [LdY.Ml$j, T] */
                public final void n(List valueList) {
                    Quaternion quaternionFromEulerAngles;
                    Intrinsics.checkNotNullParameter(valueList, "valueList");
                    Ref.ObjectRef objectRef = this.f65211n;
                    if (objectRef.element == 0) {
                        objectRef.element = HW.C.xMQ(this.f65214t);
                    }
                    Object obj = this.f65210O;
                    UserParameter userParameter = this.J2;
                    if (obj instanceof Quaternion) {
                        quaternionFromEulerAngles = Quaternion.INSTANCE.fromEulerAngles(((Number) valueList.get(0)).floatValue(), ((Number) valueList.get(1)).floatValue(), ((Number) valueList.get(2)).floatValue());
                        if (quaternionFromEulerAngles == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.Quaternion");
                        }
                    } else if (obj instanceof Vector2D) {
                        quaternionFromEulerAngles = (Quaternion) new Vector2D(((Number) valueList.get(0)).floatValue(), ((Number) valueList.get(1)).floatValue());
                    } else if (obj instanceof Vector3D) {
                        quaternionFromEulerAngles = (Quaternion) new Vector3D(((Number) valueList.get(0)).floatValue(), ((Number) valueList.get(1)).floatValue(), ((Number) valueList.get(2)).floatValue());
                    } else if (!(obj instanceof Float)) {
                        Object obj2 = valueList.get(0);
                        if (obj2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.Quaternion");
                        }
                        quaternionFromEulerAngles = (Quaternion) obj2;
                    } else if (userParameter instanceof UserParameter.Spinner) {
                        UserParameter.Spinner spinner = (UserParameter.Spinner) userParameter;
                        quaternionFromEulerAngles = (Quaternion) Float.valueOf(UserParameterKt.calcSliderTypeValueForSaving(spinner.getSliderType(), ((Number) valueList.get(0)).floatValue() / spinner.getMultiplier()));
                    } else if (userParameter instanceof UserParameter.Slider) {
                        quaternionFromEulerAngles = (Quaternion) Float.valueOf(UserParameterKt.calcSliderTypeValueForSaving(((UserParameter.Slider) userParameter).getSliderType(), ((Number) valueList.get(0)).floatValue()));
                    } else {
                        Object obj3 = valueList.get(0);
                        if (obj3 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.Quaternion");
                        }
                        quaternionFromEulerAngles = (Quaternion) obj3;
                    }
                    Fragment fragment = this.f65213r;
                    HW.C.D(fragment, new C0878j(this.f65212o, fragment, quaternionFromEulerAngles));
                }
            }

            /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
            public static final class P implements ColorPickerWidget.n {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ ZJ f65221n;
                final /* synthetic */ UserParameter nr;
                final /* synthetic */ yU.Ml rl;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ n f65222t;

                public static void safedk_Fragment_startActivityForResult_6fd6bf7695baae8f1a141a4d4340bbe1(Fragment p0, Intent p1, int p2) {
                    Logger.d("SafeDK-Special|SafeDK: Call> Landroidx/fragment/app/Fragment;->startActivityForResult(Landroid/content/Intent;I)V");
                    if (p1 == null) {
                        return;
                    }
                    p0.startActivityForResult(p1, p2);
                }

                P(ZJ zj, yU.Ml ml, n nVar, UserParameter userParameter) {
                    this.f65221n = zj;
                    this.rl = ml;
                    this.f65222t = nVar;
                    this.nr = userParameter;
                }

                @Override // com.alightcreative.app.motion.activities.edit.widgets.ColorPickerWidget.n
                public void n(int i2) {
                    ZJ zj = this.f65221n;
                    Pair pair = TuplesKt.to("CURRENT_COLOR", Integer.valueOf(i2));
                    Pair pair2 = TuplesKt.to("ALLOW_ALPHA", Boolean.valueOf(this.rl.nr().getAllowAlpha()));
                    oA.j jVarAz = this.f65222t.az();
                    C0880j c0880j = new PropertyReference1Impl() { // from class: f0P.ZJ.n.j.P.j
                        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                        public Object get(Object obj) {
                            return ((KeyableVisualEffectRef) obj).getParameters();
                        }
                    };
                    oA.aC aCVar = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), c0880j.getReturnType(), jVarAz, c0880j);
                    String name = ((UserParameter.Color) this.nr).getName();
                    KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SceneElement.class);
                    KType type = aCVar.nr().getArguments().get(0).getType();
                    Intrinsics.checkNotNull(type);
                    oA.Ml ml = new oA.Ml(orCreateKotlinClass, type, aCVar, name);
                    C0881n c0881n = new PropertyReference1Impl() { // from class: f0P.ZJ.n.j.P.n
                        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                        public Object get(Object obj) {
                            return ((KeyableUserParameterValue) obj).getColorValue();
                        }
                    };
                    Pair[] pairArr = {pair, pair2, TuplesKt.to("COLOR_LENS", new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), c0881n.getReturnType(), ml, c0881n).toString())};
                    FragmentActivity fragmentActivityRequireActivity = zj.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                    Pair[] pairArr2 = (Pair[]) Arrays.copyOf(pairArr, 3);
                    Intent intent = new Intent(fragmentActivityRequireActivity, (Class<?>) ColorPickerActivity.class);
                    intent.putExtras(BundleKt.n((Pair[]) Arrays.copyOf(pairArr2, pairArr2.length)));
                    safedk_Fragment_startActivityForResult_6fd6bf7695baae8f1a141a4d4340bbe1(zj, intent, 100);
                }
            }

            /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
            public static final class Sis implements Function1 {
                final /* synthetic */ UserParameter J2;

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                final /* synthetic */ Object f65229O;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ Ref.ObjectRef f65230n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                final /* synthetic */ oA.j f65231o;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ Fragment f65232r;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ r.UGc f65233t;

                /* JADX INFO: renamed from: f0P.ZJ$n$j$Sis$j, reason: collision with other inner class name */
                public static final class C0882j implements Function2 {

                    /* JADX INFO: renamed from: O, reason: collision with root package name */
                    final /* synthetic */ Object f65234O;

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    final /* synthetic */ oA.j f65235n;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    final /* synthetic */ Fragment f65236t;

                    /* JADX INFO: renamed from: f0P.ZJ$n$j$Sis$j$j, reason: collision with other inner class name */
                    public static final class C0883j implements Function1 {
                        final /* synthetic */ Object J2;

                        /* JADX INFO: renamed from: O, reason: collision with root package name */
                        final /* synthetic */ Fragment f65237O;

                        /* JADX INFO: renamed from: n, reason: collision with root package name */
                        final /* synthetic */ Scene f65238n;

                        /* JADX INFO: renamed from: t, reason: collision with root package name */
                        final /* synthetic */ SceneElement f65239t;

                        public C0883j(Scene scene, SceneElement sceneElement, Fragment fragment, Object obj) {
                            this.f65238n = scene;
                            this.f65239t = sceneElement;
                            this.f65237O = fragment;
                            this.J2 = obj;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                        public final Keyable invoke(Keyable it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            return KeyableKt.copyWithValueForTime(it, this.f65238n, this.f65239t, HW.C.aYN(this.f65237O), this.J2);
                        }
                    }

                    public C0882j(oA.j jVar, Fragment fragment, Object obj) {
                        this.f65235n = jVar;
                        this.f65236t = fragment;
                        this.f65234O = obj;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                    public final SceneElement invoke(Scene scene, SceneElement el) {
                        Intrinsics.checkNotNullParameter(scene, "scene");
                        Intrinsics.checkNotNullParameter(el, "el");
                        return (SceneElement) this.f65235n.t(el, new C0883j(scene, el, this.f65236t, this.f65234O));
                    }
                }

                public Sis(Ref.ObjectRef objectRef, r.UGc uGc, Object obj, UserParameter userParameter, Fragment fragment, oA.j jVar) {
                    this.f65230n = objectRef;
                    this.f65233t = uGc;
                    this.f65229O = obj;
                    this.J2 = userParameter;
                    this.f65232r = fragment;
                    this.f65231o = jVar;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    n((List) obj);
                    return Unit.INSTANCE;
                }

                /* JADX WARN: Type inference failed for: r1v13, types: [LdY.Ml$j, T] */
                public final void n(List valueList) {
                    Vector3D vector3D;
                    Intrinsics.checkNotNullParameter(valueList, "valueList");
                    Ref.ObjectRef objectRef = this.f65230n;
                    if (objectRef.element == 0) {
                        objectRef.element = HW.C.xMQ(this.f65233t);
                    }
                    Object obj = this.f65229O;
                    UserParameter userParameter = this.J2;
                    if (obj instanceof Quaternion) {
                        Object objFromEulerAngles = Quaternion.INSTANCE.fromEulerAngles(((Number) valueList.get(0)).floatValue(), ((Number) valueList.get(1)).floatValue(), ((Number) valueList.get(2)).floatValue());
                        if (objFromEulerAngles == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.Vector3D");
                        }
                        vector3D = (Vector3D) objFromEulerAngles;
                    } else if (obj instanceof Vector2D) {
                        vector3D = (Vector3D) new Vector2D(((Number) valueList.get(0)).floatValue(), ((Number) valueList.get(1)).floatValue());
                    } else if (obj instanceof Vector3D) {
                        vector3D = new Vector3D(((Number) valueList.get(0)).floatValue(), ((Number) valueList.get(1)).floatValue(), ((Number) valueList.get(2)).floatValue());
                    } else if (!(obj instanceof Float)) {
                        Object obj2 = valueList.get(0);
                        if (obj2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.Vector3D");
                        }
                        vector3D = (Vector3D) obj2;
                    } else if (userParameter instanceof UserParameter.Spinner) {
                        UserParameter.Spinner spinner = (UserParameter.Spinner) userParameter;
                        vector3D = (Vector3D) Float.valueOf(UserParameterKt.calcSliderTypeValueForSaving(spinner.getSliderType(), ((Number) valueList.get(0)).floatValue() / spinner.getMultiplier()));
                    } else if (userParameter instanceof UserParameter.Slider) {
                        vector3D = (Vector3D) Float.valueOf(UserParameterKt.calcSliderTypeValueForSaving(((UserParameter.Slider) userParameter).getSliderType(), ((Number) valueList.get(0)).floatValue()));
                    } else {
                        Object obj3 = valueList.get(0);
                        if (obj3 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.alightcreative.app.motion.scene.Vector3D");
                        }
                        vector3D = (Vector3D) obj3;
                    }
                    Fragment fragment = this.f65232r;
                    HW.C.D(fragment, new C0882j(this.f65231o, fragment, vector3D));
                }
            }

            /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
            public static final class Zs implements ColorPickerWidget.j {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ View f65244n;
                final /* synthetic */ UserParameter nr;
                final /* synthetic */ ZJ rl;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ n f65245t;

                Zs(View view, ZJ zj, n nVar, UserParameter userParameter) {
                    this.f65244n = view;
                    this.rl = zj;
                    this.f65245t = nVar;
                    this.nr = userParameter;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Keyable O(Scene scene, SceneElement sceneElement, ZJ zj, int i2, Keyable newColor) {
                    Intrinsics.checkNotNullParameter(newColor, "newColor");
                    return KeyableKt.copyWithValueForTime(newColor, scene, sceneElement, HW.C.aYN(zj), HI0.qf.t(i2));
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final SceneElement nr(n nVar, UserParameter userParameter, final ZJ zj, final int i2, final Scene scene, final SceneElement el) {
                    Intrinsics.checkNotNullParameter(scene, "scene");
                    Intrinsics.checkNotNullParameter(el, "el");
                    oA.j jVarAz = nVar.az();
                    C0884j c0884j = new PropertyReference1Impl() { // from class: f0P.ZJ.n.j.Zs.j
                        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                        public Object get(Object obj) {
                            return Boolean.valueOf(((KeyableVisualEffectRef) obj).getLocallyApplied());
                        }
                    };
                    oA.aC aCVar = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), c0884j.getReturnType(), jVarAz, c0884j);
                    oA.j jVarAz2 = nVar.az();
                    C0885n c0885n = new PropertyReference1Impl() { // from class: f0P.ZJ.n.j.Zs.n
                        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                        public Object get(Object obj) {
                            return ((KeyableVisualEffectRef) obj).getParameters();
                        }
                    };
                    oA.aC aCVar2 = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), c0885n.getReturnType(), jVarAz2, c0885n);
                    String name = ((UserParameter.Color) userParameter).getName();
                    KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SceneElement.class);
                    KType type = aCVar2.nr().getArguments().get(0).getType();
                    Intrinsics.checkNotNull(type);
                    oA.Ml ml = new oA.Ml(orCreateKotlinClass, type, aCVar2, name);
                    w6 w6Var = new PropertyReference1Impl() { // from class: f0P.ZJ.n.j.Zs.w6
                        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                        public Object get(Object obj) {
                            return ((KeyableUserParameterValue) obj).getColorValue();
                        }
                    };
                    return (SceneElement) new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), w6Var.getReturnType(), ml, w6Var).t((SceneElement) aCVar.rl(el, Boolean.TRUE), new Function1() { // from class: f0P.Ct
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ZJ.n.j.Zs.O(scene, el, zj, i2, (Keyable) obj);
                        }
                    });
                }

                @Override // com.alightcreative.app.motion.activities.edit.widgets.ColorPickerWidget.j
                public void n(final int i2) {
                    ((ColorView) this.f65244n).setColor(i2);
                    final ZJ zj = this.rl;
                    final n nVar = this.f65245t;
                    final UserParameter userParameter = this.nr;
                    HW.C.D(zj, new Function2() { // from class: f0P.VCI
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ZJ.n.j.Zs.nr(nVar, userParameter, zj, i2, (Scene) obj, (SceneElement) obj2);
                        }
                    });
                }
            }

            /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
            public static final class iF {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                private final TextView f65259n;
                private final Function2 nr;
                private final int rl;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                private final Function1 f65260t;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof iF)) {
                        return false;
                    }
                    iF iFVar = (iF) obj;
                    return Intrinsics.areEqual(this.f65259n, iFVar.f65259n) && this.rl == iFVar.rl && Intrinsics.areEqual(this.f65260t, iFVar.f65260t) && Intrinsics.areEqual(this.nr, iFVar.nr);
                }

                public iF(TextView view, int i2, Function1 get, Function2 set) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    Intrinsics.checkNotNullParameter(get, "get");
                    Intrinsics.checkNotNullParameter(set, "set");
                    this.f65259n = view;
                    this.rl = i2;
                    this.f65260t = get;
                    this.nr = set;
                }

                public int hashCode() {
                    return (((((this.f65259n.hashCode() * 31) + Integer.hashCode(this.rl)) * 31) + this.f65260t.hashCode()) * 31) + this.nr.hashCode();
                }

                public final Function1 n() {
                    return this.f65260t;
                }

                public final TextView nr() {
                    return this.f65259n;
                }

                public final int rl() {
                    return this.rl;
                }

                public final Function2 t() {
                    return this.nr;
                }

                public String toString() {
                    return "OrientationPropVal(view=" + this.f65259n + ", needleColor=" + this.rl + ", get=" + this.f65260t + ", set=" + this.nr + ")";
                }
            }

            /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
            public static final class l4Z implements Function1 {
                final /* synthetic */ UserParameter J2;

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                final /* synthetic */ Object f65263O;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ Ref.ObjectRef f65264n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                final /* synthetic */ oA.j f65265o;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ Fragment f65266r;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ r.UGc f65267t;

                /* JADX INFO: renamed from: f0P.ZJ$n$j$l4Z$j, reason: collision with other inner class name */
                public static final class C0887j implements Function2 {

                    /* JADX INFO: renamed from: O, reason: collision with root package name */
                    final /* synthetic */ Object f65268O;

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    final /* synthetic */ oA.j f65269n;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    final /* synthetic */ Fragment f65270t;

                    /* JADX INFO: renamed from: f0P.ZJ$n$j$l4Z$j$j, reason: collision with other inner class name */
                    public static final class C0888j implements Function1 {
                        final /* synthetic */ Object J2;

                        /* JADX INFO: renamed from: O, reason: collision with root package name */
                        final /* synthetic */ Fragment f65271O;

                        /* JADX INFO: renamed from: n, reason: collision with root package name */
                        final /* synthetic */ Scene f65272n;

                        /* JADX INFO: renamed from: t, reason: collision with root package name */
                        final /* synthetic */ SceneElement f65273t;

                        public C0888j(Scene scene, SceneElement sceneElement, Fragment fragment, Object obj) {
                            this.f65272n = scene;
                            this.f65273t = sceneElement;
                            this.f65271O = fragment;
                            this.J2 = obj;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                        public final Keyable invoke(Keyable it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            return KeyableKt.copyWithValueForTime(it, this.f65272n, this.f65273t, HW.C.aYN(this.f65271O), this.J2);
                        }
                    }

                    public C0887j(oA.j jVar, Fragment fragment, Object obj) {
                        this.f65269n = jVar;
                        this.f65270t = fragment;
                        this.f65268O = obj;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                    public final SceneElement invoke(Scene scene, SceneElement el) {
                        Intrinsics.checkNotNullParameter(scene, "scene");
                        Intrinsics.checkNotNullParameter(el, "el");
                        return (SceneElement) this.f65269n.t(el, new C0888j(scene, el, this.f65270t, this.f65268O));
                    }
                }

                public l4Z(Ref.ObjectRef objectRef, r.UGc uGc, Object obj, UserParameter userParameter, Fragment fragment, oA.j jVar) {
                    this.f65264n = objectRef;
                    this.f65267t = uGc;
                    this.f65263O = obj;
                    this.J2 = userParameter;
                    this.f65266r = fragment;
                    this.f65265o = jVar;
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
                    Ref.ObjectRef objectRef = this.f65264n;
                    if (objectRef.element == 0) {
                        objectRef.element = HW.C.xMQ(this.f65267t);
                    }
                    Object obj = this.f65263O;
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
                    Fragment fragment = this.f65266r;
                    HW.C.D(fragment, new C0887j(this.f65265o, fragment, fValueOf));
                }
            }

            /* JADX INFO: renamed from: f0P.ZJ$n$j$m, reason: case insensitive filesystem */
            /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
            public static final class C2016m implements ColorPickerWidget.w6 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ ZJ f65275n;

                @Override // com.alightcreative.app.motion.activities.edit.widgets.ColorPickerWidget.w6
                public void nr() {
                }

                @Override // com.alightcreative.app.motion.activities.edit.widgets.ColorPickerWidget.w6
                public void rl() {
                }

                C2016m(ZJ zj) {
                    this.f65275n = zj;
                }

                @Override // com.alightcreative.app.motion.activities.edit.widgets.ColorPickerWidget.w6
                public void n() {
                    SceneHolder sceneHolderE = HW.C.e(this.f65275n);
                    if (sceneHolderE != null) {
                        sceneHolderE.setEditMode(2131362629);
                    }
                }

                @Override // com.alightcreative.app.motion.activities.edit.widgets.ColorPickerWidget.w6
                public void t() {
                    SceneHolder sceneHolderE = HW.C.e(this.f65275n);
                    if (sceneHolderE != null) {
                        sceneHolderE.setEditMode(2131362630);
                    }
                }
            }

            /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
            public static final class mz implements Function1 {
                final /* synthetic */ UserParameter J2;

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                final /* synthetic */ Object f65276O;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ Ref.ObjectRef f65277n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                final /* synthetic */ oA.j f65278o;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ Fragment f65279r;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ r.UGc f65280t;

                /* JADX INFO: renamed from: f0P.ZJ$n$j$mz$j, reason: collision with other inner class name */
                public static final class C0889j implements Function2 {

                    /* JADX INFO: renamed from: O, reason: collision with root package name */
                    final /* synthetic */ Object f65281O;

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    final /* synthetic */ oA.j f65282n;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    final /* synthetic */ Fragment f65283t;

                    /* JADX INFO: renamed from: f0P.ZJ$n$j$mz$j$j, reason: collision with other inner class name */
                    public static final class C0890j implements Function1 {
                        final /* synthetic */ Object J2;

                        /* JADX INFO: renamed from: O, reason: collision with root package name */
                        final /* synthetic */ Fragment f65284O;

                        /* JADX INFO: renamed from: n, reason: collision with root package name */
                        final /* synthetic */ Scene f65285n;

                        /* JADX INFO: renamed from: t, reason: collision with root package name */
                        final /* synthetic */ SceneElement f65286t;

                        public C0890j(Scene scene, SceneElement sceneElement, Fragment fragment, Object obj) {
                            this.f65285n = scene;
                            this.f65286t = sceneElement;
                            this.f65284O = fragment;
                            this.J2 = obj;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                        public final Keyable invoke(Keyable it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            return KeyableKt.copyWithValueForTime(it, this.f65285n, this.f65286t, HW.C.aYN(this.f65284O), this.J2);
                        }
                    }

                    public C0889j(oA.j jVar, Fragment fragment, Object obj) {
                        this.f65282n = jVar;
                        this.f65283t = fragment;
                        this.f65281O = obj;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                    public final SceneElement invoke(Scene scene, SceneElement el) {
                        Intrinsics.checkNotNullParameter(scene, "scene");
                        Intrinsics.checkNotNullParameter(el, "el");
                        return (SceneElement) this.f65282n.t(el, new C0890j(scene, el, this.f65283t, this.f65281O));
                    }
                }

                public mz(Ref.ObjectRef objectRef, r.UGc uGc, Object obj, UserParameter userParameter, Fragment fragment, oA.j jVar) {
                    this.f65277n = objectRef;
                    this.f65280t = uGc;
                    this.f65276O = obj;
                    this.J2 = userParameter;
                    this.f65279r = fragment;
                    this.f65278o = jVar;
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
                    Ref.ObjectRef objectRef = this.f65277n;
                    if (objectRef.element == 0) {
                        objectRef.element = HW.C.xMQ(this.f65280t);
                    }
                    Object obj = this.f65276O;
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
                    Fragment fragment = this.f65279r;
                    HW.C.D(fragment, new C0889j(this.f65278o, fragment, fValueOf));
                }
            }

            /* JADX INFO: renamed from: f0P.ZJ$n$j$p, reason: case insensitive filesystem */
            /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
            public static final class C2018p implements Function1 {
                final /* synthetic */ UserParameter J2;

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                final /* synthetic */ Object f65290O;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ Ref.ObjectRef f65291n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                final /* synthetic */ oA.j f65292o;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ Fragment f65293r;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ r.UGc f65294t;

                /* JADX INFO: renamed from: f0P.ZJ$n$j$p$j, reason: collision with other inner class name */
                public static final class C0892j implements Function2 {

                    /* JADX INFO: renamed from: O, reason: collision with root package name */
                    final /* synthetic */ Object f65295O;

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    final /* synthetic */ oA.j f65296n;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    final /* synthetic */ Fragment f65297t;

                    /* JADX INFO: renamed from: f0P.ZJ$n$j$p$j$j, reason: collision with other inner class name */
                    public static final class C0893j implements Function1 {
                        final /* synthetic */ Object J2;

                        /* JADX INFO: renamed from: O, reason: collision with root package name */
                        final /* synthetic */ Fragment f65298O;

                        /* JADX INFO: renamed from: n, reason: collision with root package name */
                        final /* synthetic */ Scene f65299n;

                        /* JADX INFO: renamed from: t, reason: collision with root package name */
                        final /* synthetic */ SceneElement f65300t;

                        public C0893j(Scene scene, SceneElement sceneElement, Fragment fragment, Object obj) {
                            this.f65299n = scene;
                            this.f65300t = sceneElement;
                            this.f65298O = fragment;
                            this.J2 = obj;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                        public final Keyable invoke(Keyable it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            return KeyableKt.copyWithValueForTime(it, this.f65299n, this.f65300t, HW.C.aYN(this.f65298O), this.J2);
                        }
                    }

                    public C0892j(oA.j jVar, Fragment fragment, Object obj) {
                        this.f65296n = jVar;
                        this.f65297t = fragment;
                        this.f65295O = obj;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                    public final SceneElement invoke(Scene scene, SceneElement el) {
                        Intrinsics.checkNotNullParameter(scene, "scene");
                        Intrinsics.checkNotNullParameter(el, "el");
                        return (SceneElement) this.f65296n.t(el, new C0893j(scene, el, this.f65297t, this.f65295O));
                    }
                }

                public C2018p(Ref.ObjectRef objectRef, r.UGc uGc, Object obj, UserParameter userParameter, Fragment fragment, oA.j jVar) {
                    this.f65291n = objectRef;
                    this.f65294t = uGc;
                    this.f65290O = obj;
                    this.J2 = userParameter;
                    this.f65293r = fragment;
                    this.f65292o = jVar;
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
                    Ref.ObjectRef objectRef = this.f65291n;
                    if (objectRef.element == 0) {
                        objectRef.element = HW.C.xMQ(this.f65294t);
                    }
                    Object obj = this.f65290O;
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
                    Fragment fragment = this.f65293r;
                    HW.C.D(fragment, new C0892j(this.f65292o, fragment, vector2D));
                }
            }

            /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
            public static final class pO {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                private final TextView f65301n;
                private final Function2 nr;
                private final int rl;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                private final Function1 f65302t;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof pO)) {
                        return false;
                    }
                    pO pOVar = (pO) obj;
                    return Intrinsics.areEqual(this.f65301n, pOVar.f65301n) && this.rl == pOVar.rl && Intrinsics.areEqual(this.f65302t, pOVar.f65302t) && Intrinsics.areEqual(this.nr, pOVar.nr);
                }

                public pO(TextView view, int i2, Function1 get, Function2 set) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    Intrinsics.checkNotNullParameter(get, "get");
                    Intrinsics.checkNotNullParameter(set, "set");
                    this.f65301n = view;
                    this.rl = i2;
                    this.f65302t = get;
                    this.nr = set;
                }

                public int hashCode() {
                    return (((((this.f65301n.hashCode() * 31) + Integer.hashCode(this.rl)) * 31) + this.f65302t.hashCode()) * 31) + this.nr.hashCode();
                }

                public final Function1 n() {
                    return this.f65302t;
                }

                public final TextView nr() {
                    return this.f65301n;
                }

                public final int rl() {
                    return this.rl;
                }

                public final Function2 t() {
                    return this.nr;
                }

                public String toString() {
                    return "XYZPropVal(view=" + this.f65301n + ", needleColor=" + this.rl + ", get=" + this.f65302t + ", set=" + this.nr + ")";
                }
            }

            /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
            public static final class yg {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                private final TextView f65312n;
                private final Function2 nr;
                private final int rl;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                private final Function1 f65313t;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof yg)) {
                        return false;
                    }
                    yg ygVar = (yg) obj;
                    return Intrinsics.areEqual(this.f65312n, ygVar.f65312n) && this.rl == ygVar.rl && Intrinsics.areEqual(this.f65313t, ygVar.f65313t) && Intrinsics.areEqual(this.nr, ygVar.nr);
                }

                public yg(TextView view, int i2, Function1 get, Function2 set) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    Intrinsics.checkNotNullParameter(get, "get");
                    Intrinsics.checkNotNullParameter(set, "set");
                    this.f65312n = view;
                    this.rl = i2;
                    this.f65313t = get;
                    this.nr = set;
                }

                public int hashCode() {
                    return (((((this.f65312n.hashCode() * 31) + Integer.hashCode(this.rl)) * 31) + this.f65313t.hashCode()) * 31) + this.nr.hashCode();
                }

                public final Function1 n() {
                    return this.f65313t;
                }

                public final TextView nr() {
                    return this.f65312n;
                }

                public final int rl() {
                    return this.rl;
                }

                public final Function2 t() {
                    return this.nr;
                }

                public String toString() {
                    return "PointPropVal(view=" + this.f65312n + ", needleColor=" + this.rl + ", get=" + this.f65313t + ", set=" + this.nr + ")";
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit Qu(float f3, final UserParameter userParameter, final ZJ zj, j jVar, TextView textView, final n nVar, int i2) {
                float f4 = i2 * f3;
                UserParameter.Spinner spinner = (UserParameter.Spinner) userParameter;
                final float fCoerceIn = RangesKt.coerceIn(f4, spinner.getMinValue(), spinner.getMaxValue());
                Lu(zj, userParameter, jVar, textView, fCoerceIn);
                HW.C.D(zj, new Function2() { // from class: f0P.x4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ZJ.n.j.HBN(nVar, userParameter, zj, fCoerceIn, (Scene) obj, (SceneElement) obj2);
                    }
                });
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void s(final ZJ zj, final n nVar, final j jVar, final UserParameter userParameter, final TextView textView, final View view, final String str, View view2) {
                L(zj, userParameter, nVar, textView, view, jVar, str);
                FragmentActivity activity = zj.getActivity();
                if (activity == null) {
                    return;
                }
                Intrinsics.checkNotNull(view2, "null cannot be cast to non-null type com.alightcreative.app.motion.activities.edit.ColorView");
                yU.Ml ml = new yU.Ml(activity, ((ColorView) view2).getAndroidx.media3.extractor.text.ttml.TtmlNode.ATTR_TTS_COLOR java.lang.String());
                if (StringsKt.endsWith$default(nVar.qie().getId(), "chromakey", false, 2, (Object) null)) {
                    ml.nr().setAllowAlpha(false);
                }
                ml.nr().setOnColorChangeListener(new Zs(view2, zj, nVar, userParameter));
                ((SJ0.kO4) jVar.f65188n).rl.setOnClickListener(new View.OnClickListener() { // from class: f0P.Hag
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        ZJ.n.j.Lp6(zj, userParameter, nVar, textView, view, jVar, str, view3);
                    }
                });
                ml.nr().setPalletteClickListener(new P(zj, ml, nVar, userParameter));
                ml.nr().setSpoidEventListener(new C2016m(zj));
                ml.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: f0P.dG
                    @Override // android.widget.PopupWindow.OnDismissListener
                    public final void onDismiss() {
                        ZJ.n.j.g6(this.f65485n);
                    }
                });
                ml.nr().setSceneHolder(HW.C.e(zj));
                ((SJ0.kO4) jVar.f65188n).nr.setColorWidget(ml.nr());
                ml.KN(view2);
            }

            public final void lLA(final UserParameter userParameter, final UserParameter.Switch r26, boolean z2) {
                Keyable<Float> floatValue;
                Keyable<Float> floatValue2;
                Vector3D defaultValue;
                Object obj;
                Keyable<Vector3D> vec3DValue;
                Vector2D defaultValue2;
                Object next;
                Keyable<Vector2D> vec2DValue;
                Quaternion defaultValue3;
                Object obj2;
                Keyable<Quaternion> quatValue;
                SolidColor defaultValue4;
                Keyable<SolidColor> colorValue;
                int i2;
                KeyableUserParameterValue defaultKeyableUserParameterValue;
                DataType dataType;
                final j jVar = this;
                final UserParameter userParameter2 = userParameter;
                boolean z3 = true;
                Intrinsics.checkNotNullParameter(userParameter2, "userParameter");
                final TextView textView = (TextView) jVar.itemView.findViewById(2131363477);
                final View viewFindViewById = jVar.itemView.findViewById(2131363060);
                jVar.itemView.setBackgroundColor(jVar.rl.mUb.requireContext().getColor(z2 ? 2131099739 : 2131099748));
                if (viewFindViewById != null) {
                    Keyable keyableL = jVar.rl.mUb.L(userParameter2);
                    viewFindViewById.setVisibility((keyableL == null || !keyableL.getKeyed()) ? 4 : 0);
                    Unit unit = Unit.INSTANCE;
                }
                Iy.n localizedStrings = jVar.rl.qie().getLocalizedStrings();
                Context context = jVar.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                final String strN = Iy.w6.n(localizedStrings, context, userParameter2.getLabel());
                textView.setText(strN);
                if (StringsKt.isBlank(strN) && ((defaultKeyableUserParameterValue = UserParameterKt.getDefaultKeyableUserParameterValue(userParameter2)) == null || (dataType = defaultKeyableUserParameterValue.getDataType()) == null || !dataType.getIsKeyable())) {
                    textView.setVisibility(8);
                } else {
                    textView.setVisibility(0);
                }
                if (Intrinsics.areEqual(userParameter2.getName(), jVar.rl.mUb.paramName)) {
                    textView.setActivated(true);
                    if (viewFindViewById != null) {
                        viewFindViewById.setActivated(true);
                        Unit unit2 = Unit.INSTANCE;
                    }
                    jVar.rl.te(textView);
                    jVar.rl.g(viewFindViewById);
                } else {
                    textView.setActivated(false);
                    if (viewFindViewById != null) {
                        viewFindViewById.setActivated(false);
                        Unit unit3 = Unit.INSTANCE;
                    }
                    if (Intrinsics.areEqual(jVar.rl.r(), textView)) {
                        jVar.rl.te(null);
                        jVar.rl.g(null);
                    }
                }
                if (jVar.rl.mUb.paramName == null) {
                    n nVar = jVar.rl;
                    L(nVar.mUb, userParameter, nVar, textView, viewFindViewById, jVar, strN);
                    userParameter2 = userParameter;
                    jVar = jVar;
                    viewFindViewById = viewFindViewById;
                    textView = textView;
                }
                boolean zIsEnabledByEffectSetting = UserParameterKt.isEnabledByEffectSetting(userParameter2, jVar.rl.ty());
                if (userParameter2 instanceof UserParameter.Switch) {
                    ViewBinding viewBinding = jVar.f65188n;
                    Intrinsics.checkNotNull(viewBinding, "null cannot be cast to non-null type com.alightcreative.app.motion.databinding.EffectSettingSwitchBinding");
                    Switch r02 = ((SJ0.g9) jVar.f65188n).f9449t;
                    UserParameter.Switch r3 = (UserParameter.Switch) userParameter2;
                    KeyableUserParameterValue keyableUserParameterValue = jVar.rl.ty().getParameters().get(r3.getName());
                    r02.setChecked(keyableUserParameterValue != null ? keyableUserParameterValue.getBooleanValue() : r3.getDefaultValue());
                    Switch r03 = ((SJ0.g9) jVar.f65188n).f9449t;
                    final n nVar2 = jVar.rl;
                    final ZJ zj = nVar2.mUb;
                    r03.setOnClickListener(new View.OnClickListener() { // from class: f0P.yU
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            ZJ.n.j.EF(zj, nVar2, userParameter2, jVar, view);
                        }
                    });
                } else if (userParameter2 instanceof UserParameter.Selector) {
                    ViewBinding viewBinding2 = jVar.f65188n;
                    Intrinsics.checkNotNull(viewBinding2, "null cannot be cast to non-null type com.alightcreative.app.motion.databinding.EffectSettingSelectorBinding");
                    UserParameter.Selector selector = (UserParameter.Selector) userParameter2;
                    int i3 = C0886j.$EnumSwitchMapping$0[selector.getStyle().ordinal()];
                    if (i3 == 1) {
                        ((SJ0.B) jVar.f65188n).gh.setVisibility(8);
                        ((SJ0.B) jVar.f65188n).f9086t.setVisibility(0);
                        TextView textView2 = ((SJ0.B) jVar.f65188n).f9086t;
                        Iy.n localizedStrings2 = jVar.rl.qie().getLocalizedStrings();
                        Context context2 = jVar.itemView.getContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                        List<ChoiceInfo> choices = selector.getChoices();
                        n nVar3 = jVar.rl;
                        for (ChoiceInfo choiceInfo : choices) {
                            int value = choiceInfo.getValue();
                            KeyableUserParameterValue keyableUserParameterValue2 = nVar3.ty().getParameters().get(selector.getName());
                            if (value == (keyableUserParameterValue2 != null ? keyableUserParameterValue2.getIntValue() : selector.getDefaultChoice())) {
                                textView2.setText(Iy.w6.n(localizedStrings2, context2, choiceInfo.getLabel()));
                                TextView textView3 = ((SJ0.B) jVar.f65188n).f9086t;
                                final n nVar4 = jVar.rl;
                                final ZJ zj2 = nVar4.mUb;
                                textView3.setOnClickListener(new View.OnClickListener() { // from class: f0P.I7a
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        ZJ.n.j.y(zj2, userParameter2, nVar4, jVar, view);
                                    }
                                });
                                Unit unit4 = Unit.INSTANCE;
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    if (i3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ((SJ0.B) jVar.f65188n).gh.setVisibility(0);
                    ((SJ0.B) jVar.f65188n).f9086t.setVisibility(8);
                    ViewBinding viewBinding3 = jVar.f65188n;
                    Button[] buttonArr = {((SJ0.B) viewBinding3).nr, ((SJ0.B) viewBinding3).f9084O, ((SJ0.B) viewBinding3).J2, ((SJ0.B) viewBinding3).Uo, ((SJ0.B) viewBinding3).KN, ((SJ0.B) viewBinding3).xMQ, ((SJ0.B) viewBinding3).mUb};
                    for (int i5 = 0; i5 < 7; i5++) {
                        buttonArr[i5].setVisibility(8);
                    }
                    KeyableUserParameterValue keyableUserParameterValue3 = jVar.rl.ty().getParameters().get(selector.getName());
                    int intValue = keyableUserParameterValue3 != null ? keyableUserParameterValue3.getIntValue() : selector.getDefaultChoice();
                    List<ChoiceInfo> choices2 = selector.getChoices();
                    final n nVar5 = jVar.rl;
                    final ZJ zj3 = nVar5.mUb;
                    int i7 = 0;
                    for (Object obj3 : choices2) {
                        int i8 = i7 + 1;
                        if (i7 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        final ChoiceInfo choiceInfo2 = (ChoiceInfo) obj3;
                        boolean z4 = z3;
                        Button button = buttonArr[i7];
                        Intrinsics.checkNotNullExpressionValue(button, "get(...)");
                        if (selector.getChoices().size() - 1 == i7) {
                            ViewGroup.LayoutParams layoutParams = button.getLayoutParams();
                            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                            i2 = 0;
                            if (marginLayoutParams != null) {
                                marginLayoutParams.setMarginEnd(0);
                            } else {
                                marginLayoutParams = null;
                            }
                            button.setLayoutParams(marginLayoutParams);
                        } else {
                            i2 = 0;
                        }
                        button.setVisibility(i2);
                        button.setActivated(choiceInfo2.getValue() == intValue ? z4 : false);
                        Iy.n localizedStrings3 = nVar5.qie().getLocalizedStrings();
                        Context context3 = jVar.itemView.getContext();
                        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                        final int i9 = intValue;
                        button.setText(Iy.w6.n(localizedStrings3, context3, choiceInfo2.getLabel()));
                        final UserParameter userParameter3 = userParameter2;
                        userParameter2 = userParameter3;
                        button.setOnClickListener(new View.OnClickListener() { // from class: f0P.qy
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                ZJ.n.j.v0j(choiceInfo2, i9, zj3, nVar5, userParameter3, view);
                            }
                        });
                        i7 = i8;
                        z3 = z4;
                        intValue = i9;
                    }
                    Unit unit5 = Unit.INSTANCE;
                } else if (userParameter2 instanceof UserParameter.Color) {
                    ViewBinding viewBinding4 = jVar.f65188n;
                    Intrinsics.checkNotNull(viewBinding4, "null cannot be cast to non-null type com.alightcreative.app.motion.databinding.EffectSettingColorBinding");
                    final n nVar6 = jVar.rl;
                    final ZJ zj4 = nVar6.mUb;
                    textView.setOnClickListener(new View.OnClickListener() { // from class: f0P.lZ
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            ZJ.n.j.Aum(zj4, userParameter2, nVar6, textView, viewFindViewById, jVar, strN, view);
                        }
                    });
                    UserParameter.Color color = (UserParameter.Color) userParameter;
                    KeyableUserParameterValue keyableUserParameterValue4 = jVar.rl.ty().getParameters().get(color.getName());
                    if (keyableUserParameterValue4 == null || (colorValue = keyableUserParameterValue4.getColorValue()) == null || (defaultValue4 = (SolidColor) KeyableKt.valueAtTime(colorValue, HW.C.aYN(jVar.rl.mUb))) == null) {
                        defaultValue4 = color.getDefaultValue();
                    }
                    ((SJ0.kO4) jVar.f65188n).nr.setColor(ColorKt.toInt(defaultValue4));
                    float f3 = 255;
                    ((SJ0.kO4) jVar.f65188n).rl.setText(((int) (defaultValue4.getR() * f3)) + " " + ((int) (defaultValue4.getG() * f3)) + " " + ((int) (defaultValue4.getB() * f3)));
                    ColorView colorView = ((SJ0.kO4) jVar.f65188n).nr;
                    final n nVar7 = jVar.rl;
                    final ZJ zj5 = nVar7.mUb;
                    final j jVar2 = jVar;
                    final View view = viewFindViewById;
                    final TextView textView4 = textView;
                    View.OnClickListener onClickListener = new View.OnClickListener() { // from class: f0P.cb3
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            ZJ.n.j.s(zj5, nVar7, jVar2, userParameter, textView4, view, strN, view2);
                        }
                    };
                    jVar = jVar2;
                    colorView.setOnClickListener(onClickListener);
                } else if (userParameter2 instanceof UserParameter.StaticText) {
                    UserParameter.StaticText staticText = (UserParameter.StaticText) userParameter2;
                    int i10 = C0886j.$EnumSwitchMapping$1[staticText.getStyle().ordinal()];
                    if (i10 != 1 && i10 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    TextView textView5 = (TextView) jVar.itemView.findViewById(2131363481);
                    Iy.n localizedStrings4 = jVar.rl.qie().getLocalizedStrings();
                    Context context4 = jVar.itemView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                    textView5.setText(Iy.w6.n(localizedStrings4, context4, staticText.getText()));
                    StaticTextStyle style = staticText.getStyle();
                    StaticTextStyle staticTextStyle = StaticTextStyle.SECTION;
                    if (style == staticTextStyle) {
                        final View viewFindViewById2 = jVar.itemView.findViewById(2131362757);
                        viewFindViewById2.setRotation(jVar.rl.HI().contains(staticText.getName()) ? 90.0f : 0.0f);
                        View view2 = jVar.itemView;
                        final n nVar8 = jVar.rl;
                        view2.setOnClickListener(new View.OnClickListener() { // from class: f0P.A56
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view3) {
                                ZJ.n.j.Mh(nVar8, userParameter2, viewFindViewById2, view3);
                            }
                        });
                    } else {
                        jVar.itemView.setOnClickListener(null);
                    }
                    Unit unit6 = Unit.INSTANCE;
                    if (staticText.getStyle() == staticTextStyle) {
                        if (r26 != null) {
                            final View itemView = jVar.itemView;
                            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                            final Switch r04 = (Switch) jVar.itemView.findViewById(2131363627);
                            jVar.itemView.post(new Runnable() { // from class: f0P.E60
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ZJ.n.j.jO(r04, itemView);
                                }
                            });
                            r04.setVisibility(0);
                            KeyableUserParameterValue keyableUserParameterValue5 = jVar.rl.ty().getParameters().get(r26.getName());
                            r04.setChecked(keyableUserParameterValue5 != null ? keyableUserParameterValue5.getBooleanValue() : r26.getDefaultValue());
                            final n nVar9 = jVar.rl;
                            final ZJ zj6 = nVar9.mUb;
                            r04.setOnClickListener(new View.OnClickListener() { // from class: f0P.ih
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view3) {
                                    ZJ.n.j.Toy(zj6, nVar9, r26, r04, view3);
                                }
                            });
                        } else {
                            ((Switch) jVar.itemView.findViewById(2131363627)).setVisibility(8);
                        }
                    }
                } else if (userParameter2 instanceof UserParameter.Orientation) {
                    ViewBinding viewBinding5 = jVar.f65188n;
                    Intrinsics.checkNotNull(viewBinding5, "null cannot be cast to non-null type com.alightcreative.app.motion.databinding.EffectSettingOrientatonBinding");
                    final n nVar10 = jVar.rl;
                    final ZJ zj7 = nVar10.mUb;
                    final String str = strN;
                    textView.setOnClickListener(new View.OnClickListener() { // from class: f0P.rrp
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view3) {
                            ZJ.n.j.xzo(zj7, userParameter2, nVar10, textView, viewFindViewById, jVar, str, view3);
                        }
                    });
                    UserParameter.Orientation orientation = (UserParameter.Orientation) userParameter;
                    KeyableUserParameterValue keyableUserParameterValue6 = jVar.rl.ty().getParameters().get(orientation.getName());
                    if (keyableUserParameterValue6 == null || (quatValue = keyableUserParameterValue6.getQuatValue()) == null || (defaultValue3 = (Quaternion) KeyableKt.valueAtTime(quatValue, HW.C.aYN(jVar.rl.mUb))) == null) {
                        defaultValue3 = orientation.getDefaultValue();
                    }
                    final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                    AppCompatTextView propertyValueX = ((SJ0.qYU) jVar.f65188n).f9597O;
                    Intrinsics.checkNotNullExpressionValue(propertyValueX, "propertyValueX");
                    AppCompatTextView propertyValueY = ((SJ0.qYU) jVar.f65188n).J2;
                    Intrinsics.checkNotNullExpressionValue(propertyValueY, "propertyValueY");
                    AppCompatTextView propertyValueZ = ((SJ0.qYU) jVar.f65188n).Uo;
                    Intrinsics.checkNotNullExpressionValue(propertyValueZ, "propertyValueZ");
                    ValueSpinner valueSpinner = (ValueSpinner) jVar.itemView.findViewById(2131363403);
                    int color2 = jVar.itemView.getResources().getColor(2131099798, jVar.itemView.getContext().getTheme());
                    final TextView textView6 = textView;
                    final List<iF> listListOf = CollectionsKt.listOf((Object[]) new iF[]{new iF(propertyValueX, color2, new Function1() { // from class: f0P.i1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            return Float.valueOf(ZJ.n.j.XNZ((Quaternion) obj4));
                        }
                    }, new Function2() { // from class: f0P.ig3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj4, Object obj5) {
                            return ZJ.n.j.lNy((Quaternion) obj4, ((Float) obj5).floatValue());
                        }
                    }), new iF(propertyValueY, -1, new Function1() { // from class: f0P.XBq
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            return Float.valueOf(ZJ.n.j.I9f((Quaternion) obj4));
                        }
                    }, new Function2() { // from class: f0P.Fj
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj4, Object obj5) {
                            return ZJ.n.j.D76((Quaternion) obj4, ((Float) obj5).floatValue());
                        }
                    }), new iF(propertyValueZ, jVar.itemView.getResources().getColor(2131099803, jVar.itemView.getContext().getTheme()), new Function1() { // from class: f0P.MEJ
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            return Float.valueOf(ZJ.n.j.NP((Quaternion) obj4));
                        }
                    }, new Function2() { // from class: f0P.vt
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj4, Object obj5) {
                            return ZJ.n.j.QgZ((Quaternion) obj4, ((Float) obj5).floatValue());
                        }
                    })});
                    for (iF iFVar : listListOf) {
                        iFVar.nr().setText(String.valueOf(MathKt.roundToInt(((Number) iFVar.n().invoke(defaultValue3)).floatValue())));
                    }
                    Iterator it = listListOf.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        Object next2 = it.next();
                        if (((iF) next2).nr().isActivated()) {
                            obj2 = next2;
                            break;
                        }
                    }
                    iF iFVar2 = (iF) obj2;
                    if (iFVar2 == null) {
                        iFVar2 = (iF) CollectionsKt.first(listListOf);
                    }
                    for (iF iFVar3 : listListOf) {
                        iFVar3.nr().setActivated(Intrinsics.areEqual(iFVar3, iFVar2));
                    }
                    valueSpinner.setValue(MathKt.roundToInt(((Number) iFVar2.n().invoke(defaultValue3)).floatValue()));
                    View view3 = viewFindViewById;
                    final n nVar11 = jVar.rl;
                    final ZJ zj8 = nVar11.mUb;
                    for (final iF iFVar4 : listListOf) {
                        TextView textViewNr = iFVar4.nr();
                        final ValueSpinner valueSpinner2 = valueSpinner;
                        final View view4 = view3;
                        final ZJ zj9 = zj8;
                        final String str2 = str;
                        final int i11 = color2;
                        View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: f0P.Jl
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view5) {
                                ZJ.n.j.j(nVar11, userParameter, iFVar4, zj9, listListOf, valueSpinner2, textView6, view4, this, str2, i11, view5);
                            }
                        };
                        jVar = this;
                        textViewNr.setOnClickListener(onClickListener2);
                        zj8 = zj9;
                        iFVar4.nr().setOnLongClickListener(new View.OnLongClickListener() { // from class: f0P.cY
                            @Override // android.view.View.OnLongClickListener
                            public final boolean onLongClick(View view5) {
                                return ZJ.n.j.H(nVar11, userParameter, zj8, iFVar4, listListOf, view5);
                            }
                        });
                        view3 = view4;
                        valueSpinner = valueSpinner2;
                        str = str2;
                        color2 = i11;
                    }
                    final String str3 = str;
                    ValueSpinner valueSpinner3 = valueSpinner;
                    final View view5 = view3;
                    final n nVar12 = jVar.rl;
                    final ZJ zj10 = nVar12.mUb;
                    final j jVar3 = jVar;
                    jVar = jVar3;
                    valueSpinner3.setOnStartTrackingTouch(new Function0() { // from class: f0P.x2T
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ZJ.n.j.rxp(zj10, nVar12, userParameter, objectRef, textView6, view5, jVar3, str3);
                        }
                    });
                    final ZJ zj11 = jVar.rl.mUb;
                    valueSpinner3.setOnStopTrackingTouch(new Function0() { // from class: f0P.wK
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ZJ.n.j.Fp(objectRef, zj11);
                        }
                    });
                    final n nVar13 = jVar.rl;
                    final ZJ zj12 = nVar13.mUb;
                    valueSpinner3.setOnSpinAbs(new Function1() { // from class: f0P.rMg
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            return ZJ.n.j.Ro(nVar13, userParameter, zj12, listListOf, ((Integer) obj4).intValue());
                        }
                    });
                } else {
                    final String str4 = strN;
                    if (userParameter2 instanceof UserParameter.Point) {
                        ViewBinding viewBinding6 = jVar.f65188n;
                        Intrinsics.checkNotNull(viewBinding6, "null cannot be cast to non-null type com.alightcreative.app.motion.databinding.EffectSettingPosBinding");
                        final n nVar14 = jVar.rl;
                        final ZJ zj13 = nVar14.mUb;
                        textView.setOnClickListener(new View.OnClickListener() { // from class: f0P.x
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view6) {
                                ZJ.n.j.pS(zj13, userParameter2, nVar14, textView, viewFindViewById, jVar, str4, view6);
                            }
                        });
                        UserParameter.Point point = (UserParameter.Point) userParameter2;
                        KeyableUserParameterValue keyableUserParameterValue7 = jVar.rl.ty().getParameters().get(point.getName());
                        if (keyableUserParameterValue7 == null || (vec2DValue = keyableUserParameterValue7.getVec2DValue()) == null || (defaultValue2 = (Vector2D) KeyableKt.valueAtTime(vec2DValue, HW.C.aYN(jVar.rl.mUb))) == null) {
                            defaultValue2 = point.getDefaultValue();
                        }
                        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                        AppCompatTextView propertyValueX2 = ((SJ0.RGN) jVar.f65188n).f9292O;
                        Intrinsics.checkNotNullExpressionValue(propertyValueX2, "propertyValueX");
                        AppCompatTextView propertyValueY2 = ((SJ0.RGN) jVar.f65188n).J2;
                        Intrinsics.checkNotNullExpressionValue(propertyValueY2, "propertyValueY");
                        ValueSpinner pointSpinner = ((SJ0.RGN) jVar.f65188n).f9294t;
                        Intrinsics.checkNotNullExpressionValue(pointSpinner, "pointSpinner");
                        int color3 = jVar.itemView.getResources().getColor(2131099798, jVar.itemView.getContext().getTheme());
                        final TextView textView7 = textView;
                        final List<yg> listListOf2 = CollectionsKt.listOf((Object[]) new yg[]{new yg(propertyValueX2, color3, new Function1() { // from class: f0P.Bu
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                return Float.valueOf(ZJ.n.j.tEO((Vector2D) obj4));
                            }
                        }, new Function2() { // from class: f0P.TP
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj4, Object obj5) {
                                return ZJ.n.j.yAc((Vector2D) obj4, ((Float) obj5).floatValue());
                            }
                        }), new yg(propertyValueY2, -1, new Function1() { // from class: f0P.NB
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                return Float.valueOf(ZJ.n.j.h((Vector2D) obj4));
                            }
                        }, new Function2() { // from class: f0P.Kef
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj4, Object obj5) {
                                return ZJ.n.j.l((Vector2D) obj4, ((Float) obj5).floatValue());
                            }
                        })});
                        for (yg ygVar : listListOf2) {
                            ygVar.nr().setText(kSg(((Number) ygVar.n().invoke(defaultValue2)).floatValue(), userParameter2));
                        }
                        pointSpinner.setShowZeroLine(true);
                        Iterator it2 = listListOf2.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next = it2.next();
                                if (((yg) next).nr().isActivated()) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        yg ygVar2 = (yg) next;
                        if (ygVar2 == null) {
                            ygVar2 = (yg) CollectionsKt.first(listListOf2);
                        }
                        for (yg ygVar3 : listListOf2) {
                            ygVar3.nr().setActivated(Intrinsics.areEqual(ygVar3, ygVar2));
                        }
                        pointSpinner.setValue(MathKt.roundToInt(((Number) ygVar2.n().invoke(defaultValue2)).floatValue() / point.getStep()));
                        pointSpinner.setMinValue(MathKt.roundToInt(((Number) ygVar2.n().invoke(point.getMinOffset())).floatValue() / point.getStep()));
                        pointSpinner.setMaxValue(MathKt.roundToInt(((Number) ygVar2.n().invoke(point.getMaxOffset())).floatValue() / point.getStep()));
                        pointSpinner.setLimitRange(true);
                        pointSpinner.setNeedleColor(ygVar2.rl());
                        final View view6 = viewFindViewById;
                        final n nVar15 = jVar.rl;
                        final ZJ zj14 = nVar15.mUb;
                        for (final yg ygVar4 : listListOf2) {
                            TextView textViewNr2 = ygVar4.nr();
                            final int i12 = color3;
                            final j jVar4 = jVar;
                            final ValueSpinner valueSpinner4 = pointSpinner;
                            final String str5 = str4;
                            View.OnClickListener onClickListener3 = new View.OnClickListener() { // from class: f0P.pm
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view7) {
                                    ZJ.n.j.eo(nVar15, userParameter2, zj14, ygVar4, listListOf2, valueSpinner4, textView7, view6, jVar4, str5, i12, view7);
                                }
                            };
                            jVar = jVar4;
                            textViewNr2.setOnClickListener(onClickListener3);
                            ygVar4.nr().setOnLongClickListener(new View.OnLongClickListener() { // from class: f0P.JC
                                @Override // android.view.View.OnLongClickListener
                                public final boolean onLongClick(View view7) {
                                    return ZJ.n.j.uQ(nVar15, userParameter, zj14, ygVar4, listListOf2, view7);
                                }
                            });
                            pointSpinner = valueSpinner4;
                            color3 = i12;
                            userParameter2 = userParameter;
                            objectRef2 = objectRef2;
                            str4 = str5;
                        }
                        final String str6 = str4;
                        ValueSpinner valueSpinner5 = pointSpinner;
                        final Ref.ObjectRef objectRef3 = objectRef2;
                        final n nVar16 = jVar.rl;
                        final ZJ zj15 = nVar16.mUb;
                        final j jVar5 = jVar;
                        jVar = jVar5;
                        valueSpinner5.setOnStartTrackingTouch(new Function0() { // from class: f0P.AA
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ZJ.n.j.lS(objectRef3, zj15, userParameter, nVar16, textView7, view6, jVar5, str6);
                            }
                        });
                        final ZJ zj16 = jVar.rl.mUb;
                        valueSpinner5.setOnStopTrackingTouch(new Function0() { // from class: f0P.AB
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ZJ.n.j.iV(objectRef3, zj16);
                            }
                        });
                        final n nVar17 = jVar.rl;
                        final ZJ zj17 = nVar17.mUb;
                        valueSpinner5.setOnSpinAbs(new Function1() { // from class: f0P.T3f
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                return ZJ.n.j.I4p(nVar17, userParameter, zj17, listListOf2, ((Integer) obj4).intValue());
                            }
                        });
                    } else if (userParameter2 instanceof UserParameter.XYZ) {
                        ViewBinding viewBinding7 = jVar.f65188n;
                        Intrinsics.checkNotNull(viewBinding7, "null cannot be cast to non-null type com.alightcreative.app.motion.databinding.EffectSettingXyzBinding");
                        final n nVar18 = jVar.rl;
                        final ZJ zj18 = nVar18.mUb;
                        textView.setOnClickListener(new View.OnClickListener() { // from class: f0P.SmR
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view7) {
                                ZJ.n.j.q9(zj18, userParameter2, nVar18, textView, viewFindViewById, jVar, str4, view7);
                            }
                        });
                        UserParameter.XYZ xyz = (UserParameter.XYZ) userParameter;
                        KeyableUserParameterValue keyableUserParameterValue8 = jVar.rl.ty().getParameters().get(xyz.getName());
                        if (keyableUserParameterValue8 == null || (vec3DValue = keyableUserParameterValue8.getVec3DValue()) == null || (defaultValue = (Vector3D) KeyableKt.valueAtTime(vec3DValue, HW.C.aYN(jVar.rl.mUb))) == null) {
                            defaultValue = xyz.getDefaultValue();
                        }
                        final Ref.ObjectRef objectRef4 = new Ref.ObjectRef();
                        AppCompatTextView propertyValueX3 = ((SJ0.CM) jVar.f65188n).f9093O;
                        Intrinsics.checkNotNullExpressionValue(propertyValueX3, "propertyValueX");
                        AppCompatTextView propertyValueY3 = ((SJ0.CM) jVar.f65188n).J2;
                        Intrinsics.checkNotNullExpressionValue(propertyValueY3, "propertyValueY");
                        AppCompatTextView propertyValueZ2 = ((SJ0.CM) jVar.f65188n).Uo;
                        Intrinsics.checkNotNullExpressionValue(propertyValueZ2, "propertyValueZ");
                        ValueSpinner pointSpinner2 = ((SJ0.CM) jVar.f65188n).f9095t;
                        Intrinsics.checkNotNullExpressionValue(pointSpinner2, "pointSpinner");
                        int color4 = jVar.itemView.getResources().getColor(2131099798, jVar.itemView.getContext().getTheme());
                        final TextView textView8 = textView;
                        final List<pO> listListOf3 = CollectionsKt.listOf((Object[]) new pO[]{new pO(propertyValueX3, color4, new Function1() { // from class: f0P.Zvi
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                return Float.valueOf(ZJ.n.j.A((Vector3D) obj4));
                            }
                        }, new Function2() { // from class: f0P.VS
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj4, Object obj5) {
                                return ZJ.n.j.WH((Vector3D) obj4, ((Float) obj5).floatValue());
                            }
                        }), new pO(propertyValueY3, -1, new Function1() { // from class: f0P.RBY
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                return Float.valueOf(ZJ.n.j.oz((Vector3D) obj4));
                            }
                        }, new Function2() { // from class: f0P.oO
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj4, Object obj5) {
                                return ZJ.n.j.qva((Vector3D) obj4, ((Float) obj5).floatValue());
                            }
                        }), new pO(propertyValueZ2, jVar.itemView.getResources().getColor(2131099803, jVar.itemView.getContext().getTheme()), new Function1() { // from class: f0P.itH
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                return Float.valueOf(ZJ.n.j.d((Vector3D) obj4));
                            }
                        }, new Function2() { // from class: f0P.EkF
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj4, Object obj5) {
                                return ZJ.n.j.rT((Vector3D) obj4, ((Float) obj5).floatValue());
                            }
                        })});
                        for (pO pOVar : listListOf3) {
                            pOVar.nr().setText(String.valueOf(MathKt.roundToInt(((Number) pOVar.n().invoke(defaultValue)).floatValue())));
                        }
                        pointSpinner2.setShowZeroLine(true);
                        Iterator it3 = listListOf3.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                obj = null;
                                break;
                            }
                            Object next3 = it3.next();
                            if (((pO) next3).nr().isActivated()) {
                                obj = next3;
                                break;
                            }
                        }
                        pO pOVar2 = (pO) obj;
                        if (pOVar2 == null) {
                            pOVar2 = (pO) CollectionsKt.first(listListOf3);
                        }
                        for (pO pOVar3 : listListOf3) {
                            pOVar3.nr().setActivated(Intrinsics.areEqual(pOVar3, pOVar2));
                        }
                        pointSpinner2.setValue(MathKt.roundToInt(((Number) pOVar2.n().invoke(defaultValue)).floatValue()));
                        pointSpinner2.setNeedleColor(pOVar2.rl());
                        View view7 = viewFindViewById;
                        final n nVar19 = jVar.rl;
                        final ZJ zj19 = nVar19.mUb;
                        for (final pO pOVar4 : listListOf3) {
                            TextView textViewNr3 = pOVar4.nr();
                            final ValueSpinner valueSpinner6 = pointSpinner2;
                            final View view8 = view7;
                            final ZJ zj20 = zj19;
                            final String str7 = str4;
                            final int i13 = color4;
                            View.OnClickListener onClickListener4 = new View.OnClickListener() { // from class: f0P.rL
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view9) {
                                    ZJ.n.j.W(nVar19, userParameter, pOVar4, zj20, listListOf3, valueSpinner6, textView8, view8, this, str7, i13, view9);
                                }
                            };
                            jVar = this;
                            textViewNr3.setOnClickListener(onClickListener4);
                            zj19 = zj20;
                            pOVar4.nr().setOnLongClickListener(new View.OnLongClickListener() { // from class: f0P.Slg
                                @Override // android.view.View.OnLongClickListener
                                public final boolean onLongClick(View view9) {
                                    return ZJ.n.j.RQ(nVar19, userParameter, zj19, pOVar4, listListOf3, view9);
                                }
                            });
                            view7 = view8;
                            pointSpinner2 = valueSpinner6;
                            str4 = str7;
                            color4 = i13;
                        }
                        final String str8 = str4;
                        ValueSpinner valueSpinner7 = pointSpinner2;
                        final View view9 = view7;
                        final n nVar20 = jVar.rl;
                        final ZJ zj21 = nVar20.mUb;
                        final j jVar6 = jVar;
                        jVar = jVar6;
                        valueSpinner7.setOnStartTrackingTouch(new Function0() { // from class: f0P.fZc
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ZJ.n.j.QZ6(objectRef4, zj21, userParameter, nVar20, textView8, view9, jVar6, str8);
                            }
                        });
                        final ZJ zj22 = jVar.rl.mUb;
                        valueSpinner7.setOnStopTrackingTouch(new Function0() { // from class: f0P.xAK
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ZJ.n.j.tFV(objectRef4, zj22);
                            }
                        });
                        final n nVar21 = jVar.rl;
                        final ZJ zj23 = nVar21.mUb;
                        valueSpinner7.setOnSpinAbs(new Function1() { // from class: f0P.Lnn
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                return ZJ.n.j.VwL(nVar21, userParameter, zj23, listListOf3, ((Integer) obj4).intValue());
                            }
                        });
                    } else if (userParameter2 instanceof UserParameter.Spinner) {
                        ViewBinding viewBinding8 = jVar.f65188n;
                        Intrinsics.checkNotNull(viewBinding8, "null cannot be cast to non-null type com.alightcreative.app.motion.databinding.EffectSettingSpinnerBinding");
                        final n nVar22 = jVar.rl;
                        final ZJ zj24 = nVar22.mUb;
                        textView.setOnClickListener(new View.OnClickListener() { // from class: f0P.jV6
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view10) {
                                ZJ.n.j.Bu(zj24, userParameter2, nVar22, textView, viewFindViewById, jVar, str4, view10);
                            }
                        });
                        UserParameter.Spinner spinner = (UserParameter.Spinner) userParameter2;
                        KeyableUserParameterValue keyableUserParameterValue9 = jVar.rl.ty().getParameters().get(spinner.getName());
                        float defaultValue5 = (keyableUserParameterValue9 == null || (floatValue2 = keyableUserParameterValue9.getFloatValue()) == null) ? spinner.getDefaultValue() : ((Number) KeyableKt.valueAtTime(floatValue2, HW.C.aYN(jVar.rl.mUb))).floatValue();
                        final Ref.ObjectRef objectRef5 = new Ref.ObjectRef();
                        final TextView textView9 = (TextView) jVar.itemView.findViewById(2131363485);
                        if (spinner.getSliderType() != SliderType.ANGLE && spinner.getSliderType() != SliderType.ANGLE_RANGE) {
                            textView9.setVisibility(8);
                        }
                        Lu(jVar.rl.mUb, userParameter2, jVar, textView9, defaultValue5);
                        AppCompatTextView appCompatTextView = ((SJ0.c7r) jVar.f65188n).f9418O;
                        final n nVar23 = jVar.rl;
                        final ZJ zj25 = nVar23.mUb;
                        appCompatTextView.setOnClickListener(new View.OnClickListener() { // from class: f0P.hha
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view10) {
                                ZJ.n.j.p0N(zj25, userParameter2, nVar23, textView, viewFindViewById, jVar, str4, view10);
                            }
                        });
                        final float step = spinner.getStep();
                        final ValueSpinner propertyValueSpinner = ((SJ0.c7r) jVar.f65188n).KN;
                        Intrinsics.checkNotNullExpressionValue(propertyValueSpinner, "propertyValueSpinner");
                        propertyValueSpinner.setValue(MathKt.roundToInt(defaultValue5 / step));
                        propertyValueSpinner.setMinValue(MathKt.roundToInt(spinner.getMinValue() / step));
                        propertyValueSpinner.setMaxValue(MathKt.roundToInt(spinner.getMaxValue() / step));
                        propertyValueSpinner.setLimitRange(true);
                        List<Float> tickMarks = spinner.getTickMarks();
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(tickMarks, 10));
                        Iterator<T> it4 = tickMarks.iterator();
                        while (it4.hasNext()) {
                            arrayList.add(Integer.valueOf(MathKt.roundToInt(((Number) it4.next()).floatValue() / step)));
                        }
                        propertyValueSpinner.setBrightMarks(arrayList);
                        final TextView textView10 = textView;
                        final n nVar24 = jVar.rl;
                        final ZJ zj26 = nVar24.mUb;
                        final j jVar7 = jVar;
                        final View view10 = viewFindViewById;
                        propertyValueSpinner.setOnStartTrackingTouch(new Function0() { // from class: f0P.Y6T
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ZJ.n.j.Uf(objectRef5, zj26, userParameter, nVar24, textView10, view10, jVar7, str4);
                            }
                        });
                        final ZJ zj27 = jVar7.rl.mUb;
                        propertyValueSpinner.setOnStopTrackingTouch(new Function0() { // from class: f0P.p6X
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ZJ.n.j.f(propertyValueSpinner, objectRef5, zj27);
                            }
                        });
                        final n nVar25 = jVar7.rl;
                        final ZJ zj28 = nVar25.mUb;
                        Function1<? super Integer, Unit> function1 = new Function1() { // from class: f0P.gI
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                return ZJ.n.j.Qu(step, userParameter, zj28, jVar7, textView9, nVar25, ((Integer) obj4).intValue());
                            }
                        };
                        jVar = jVar7;
                        propertyValueSpinner.setOnSpinAbs(function1);
                    } else if (userParameter2 instanceof UserParameter.Slider) {
                        ViewBinding viewBinding9 = jVar.f65188n;
                        Intrinsics.checkNotNull(viewBinding9, "null cannot be cast to non-null type com.alightcreative.app.motion.databinding.EffectSettingSliderBinding");
                        final n nVar26 = jVar.rl;
                        final ZJ zj29 = nVar26.mUb;
                        textView.setOnClickListener(new View.OnClickListener() { // from class: f0P.xwl
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view11) {
                                ZJ.n.j.X4T(zj29, userParameter2, nVar26, textView, viewFindViewById, jVar, str4, view11);
                            }
                        });
                        AlightSlider propertyValueSlider = ((SJ0.xuv) jVar.f65188n).f9684O;
                        Intrinsics.checkNotNullExpressionValue(propertyValueSlider, "propertyValueSlider");
                        UserParameter.Slider slider = (UserParameter.Slider) userParameter;
                        KeyableUserParameterValue keyableUserParameterValue10 = jVar.rl.ty().getParameters().get(slider.getName());
                        float defaultValue6 = (keyableUserParameterValue10 == null || (floatValue = keyableUserParameterValue10.getFloatValue()) == null) ? slider.getDefaultValue() : ((Number) KeyableKt.valueAtTime(floatValue, HW.C.aYN(jVar.rl.mUb))).floatValue();
                        Ref.ObjectRef objectRef6 = new Ref.ObjectRef();
                        ((SJ0.xuv) jVar.f65188n).nr.setText(UserParameterKt.format(slider.getSliderType(), defaultValue6));
                        AppCompatTextView appCompatTextView2 = ((SJ0.xuv) jVar.f65188n).nr;
                        final n nVar27 = jVar.rl;
                        final ZJ zj30 = nVar27.mUb;
                        appCompatTextView2.setOnClickListener(new View.OnClickListener() { // from class: f0P.UF
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view11) {
                                ZJ.n.j.Zmq(zj30, userParameter, nVar27, textView, viewFindViewById, jVar, str4, view11);
                            }
                        });
                        propertyValueSlider.setMaxValue((int) (slider.getMaxValue() * 1000.0f));
                        propertyValueSlider.setMinValue((int) (slider.getMinValue() * 1000.0f));
                        propertyValueSlider.setStepSize((int) (slider.getStep() * 1000.0f));
                        propertyValueSlider.setValue((int) (defaultValue6 * 1000.0f));
                        propertyValueSlider.setLogScale(slider.getLogScale());
                        propertyValueSlider.setOriginValue((int) (slider.getOriginValue() * 1000.0f));
                        List<Float> tickMarks2 = slider.getTickMarks();
                        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(tickMarks2, 10));
                        Iterator<T> it5 = tickMarks2.iterator();
                        while (it5.hasNext()) {
                            arrayList2.add(Integer.valueOf((int) (((Number) it5.next()).floatValue() * 1000.0f)));
                        }
                        propertyValueSlider.setTickMarkValues(arrayList2);
                        List<Float> snapValues = slider.getSnapValues();
                        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(snapValues, 10));
                        Iterator<T> it6 = snapValues.iterator();
                        while (it6.hasNext()) {
                            arrayList3.add(Integer.valueOf((int) (((Number) it6.next()).floatValue() * 1000.0f)));
                        }
                        propertyValueSlider.setSnapValues(arrayList3);
                        TextView textView11 = textView;
                        n nVar28 = jVar.rl;
                        j jVar8 = jVar;
                        jVar = jVar8;
                        propertyValueSlider.setOnSeekBarChangeListener(new K(nVar28.mUb, jVar8, userParameter, nVar28, objectRef6, textView11, viewFindViewById, str4));
                    }
                }
                if (zIsEnabledByEffectSetting) {
                    jVar.itemView.setEnabled(true);
                    View itemView2 = jVar.itemView;
                    Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
                    HI0.o7q.t(itemView2, new Function1() { // from class: f0P.gU1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            return ZJ.n.j.JVN((View) obj4);
                        }
                    });
                    return;
                }
                jVar.itemView.setEnabled(false);
                View itemView3 = jVar.itemView;
                Intrinsics.checkNotNullExpressionValue(itemView3, "itemView");
                HI0.o7q.t(itemView3, new Function1() { // from class: f0P.KAB
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        return ZJ.n.j.xVH((View) obj4);
                    }
                });
            }

            /* JADX INFO: renamed from: f0P.ZJ$n$j$j, reason: collision with other inner class name */
            /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
            public /* synthetic */ class C0886j {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;
                public static final /* synthetic */ int[] $EnumSwitchMapping$1;
                public static final /* synthetic */ int[] $EnumSwitchMapping$2;

                static {
                    int[] iArr = new int[SelectorStyle.values().length];
                    try {
                        iArr[SelectorStyle.DROPDOWN.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[SelectorStyle.RADIO.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                    int[] iArr2 = new int[StaticTextStyle.values().length];
                    try {
                        iArr2[StaticTextStyle.TIP.ordinal()] = 1;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr2[StaticTextStyle.SECTION.ordinal()] = 2;
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
                this.f65188n = itemBinding;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final float A(Vector3D it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getX();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit C7B(YBiasView yBiasView, final ZJ zj, final UserParameter.HueDisc hueDisc, TextView textView, final n nVar, float f3, float f4) {
                final Vector3D vector3D = new Vector3D(f3, f4, yBiasView.getValue());
                w(hueDisc, textView, vector3D);
                HW.C.D(zj, new Function2() { // from class: f0P.Zgp
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ZJ.n.j.wYi(nVar, hueDisc, zj, vector3D, (Scene) obj, (SceneElement) obj2);
                    }
                });
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Keyable Co(Scene scene, SceneElement sceneElement, ZJ zj, Vector2D vector2D, Keyable it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return KeyableKt.copyWithValueForTime(it, scene, sceneElement, HW.C.aYN(zj), vector2D);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Quaternion D76(Quaternion a2, float f3) {
                Intrinsics.checkNotNullParameter(a2, "a");
                return Quaternion.INSTANCE.fromEulerAngles(a2.getPitch(), f3, a2.getRoll());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void EF(ZJ zj, final n nVar, final UserParameter userParameter, final j jVar, View view) {
                HW.C.D(zj, new Function2() { // from class: f0P.vKj
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ZJ.n.j.uG(nVar, userParameter, jVar, (Scene) obj, (SceneElement) obj2);
                    }
                });
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Keyable EN(Scene scene, SceneElement sceneElement, ZJ zj, Quaternion quaternion, Keyable it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return KeyableKt.copyWithValueForTime(it, scene, sceneElement, HW.C.aYN(zj), quaternion);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Keyable F(Scene scene, SceneElement sceneElement, ZJ zj, Vector3D vector3D, Keyable it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return KeyableKt.copyWithValueForTime(it, scene, sceneElement, HW.C.aYN(zj), vector3D);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit Fp(Ref.ObjectRef objectRef, ZJ zj) {
                Ml.j jVar = (Ml.j) objectRef.element;
                if (jVar != null) {
                    jVar.n();
                }
                zj.gestureInProgress = false;
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final SceneElement HBN(n nVar, UserParameter userParameter, final ZJ zj, final float f3, final Scene scene, final SceneElement el) {
                Intrinsics.checkNotNullParameter(scene, "scene");
                Intrinsics.checkNotNullParameter(el, "el");
                oA.j jVarAz = nVar.az();
                M m2 = new PropertyReference1Impl() { // from class: f0P.ZJ.n.j.M
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return Boolean.valueOf(((KeyableVisualEffectRef) obj).getLocallyApplied());
                    }
                };
                oA.aC aCVar = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), m2.getReturnType(), jVarAz, m2);
                oA.j jVarAz2 = nVar.az();
                rv6 rv6Var = new PropertyReference1Impl() { // from class: f0P.ZJ.n.j.rv6
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return ((KeyableVisualEffectRef) obj).getParameters();
                    }
                };
                oA.aC aCVar2 = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), rv6Var.getReturnType(), jVarAz2, rv6Var);
                Pair pair = TuplesKt.to(((UserParameter.Spinner) userParameter).getName(), new KeyableUserParameterValue(0.0f));
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SceneElement.class);
                KType type = aCVar2.nr().getArguments().get(0).getType();
                Intrinsics.checkNotNull(type);
                oA.I28 i28 = new oA.I28(orCreateKotlinClass, type, aCVar2, pair.getFirst(), pair.getSecond());
                vd vdVar = new PropertyReference1Impl() { // from class: f0P.ZJ.n.j.vd
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return ((KeyableUserParameterValue) obj).getFloatValue();
                    }
                };
                return (SceneElement) new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), vdVar.getReturnType(), i28, vdVar).t((SceneElement) aCVar.rl(el, Boolean.TRUE), new Function1() { // from class: f0P.X2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ZJ.n.j.UF(scene, el, zj, f3, (Keyable) obj);
                    }
                });
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final float I9f(Quaternion it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (float) it.getYaw();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit JVN(View it) {
                Intrinsics.checkNotNullParameter(it, "it");
                it.setEnabled(true);
                it.setAlpha(1.0f);
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Keyable LPV(Scene scene, SceneElement sceneElement, ZJ zj, Quaternion quaternion, Keyable it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return KeyableKt.copyWithValueForTime(it, scene, sceneElement, HW.C.aYN(zj), quaternion);
            }

            private static final void Lu(ZJ zj, UserParameter userParameter, j jVar, TextView textView, float f3) {
                String strValueOf;
                double d2;
                String str;
                StringBuilder sb;
                Scene sceneIF = HW.C.iF(zj);
                int framesPerHundredSeconds = sceneIF != null ? sceneIF.getFramesPerHundredSeconds() : 30;
                UserParameter.Spinner spinner = (UserParameter.Spinner) userParameter;
                float multiplier = spinner.getMultiplier() * f3;
                float step = spinner.getStep() * spinner.getMultiplier();
                AppCompatTextView appCompatTextView = ((SJ0.c7r) jVar.f65188n).f9418O;
                switch (C0886j.$EnumSwitchMapping$2[spinner.getSliderType().ordinal()]) {
                    case 1:
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
                    case 2:
                        double d5 = step;
                        if (d5 < 9.0E-5d) {
                            strValueOf = String.format((f3 >= 0.0f ? "+" : "") + "%.5f", Arrays.copyOf(new Object[]{Float.valueOf(multiplier)}, 1));
                            Intrinsics.checkNotNullExpressionValue(strValueOf, "format(...)");
                        } else if (d5 < 9.0E-4d) {
                            strValueOf = String.format((f3 >= 0.0f ? "+" : "") + "%.4f", Arrays.copyOf(new Object[]{Float.valueOf(multiplier)}, 1));
                            Intrinsics.checkNotNullExpressionValue(strValueOf, "format(...)");
                        } else if (d5 < 0.009d) {
                            strValueOf = String.format((f3 >= 0.0f ? "+" : "") + "%.3f", Arrays.copyOf(new Object[]{Float.valueOf(multiplier)}, 1));
                            Intrinsics.checkNotNullExpressionValue(strValueOf, "format(...)");
                        } else if (d5 < 0.09d) {
                            strValueOf = String.format((f3 >= 0.0f ? "+" : "") + "%.2f", Arrays.copyOf(new Object[]{Float.valueOf(multiplier)}, 1));
                            Intrinsics.checkNotNullExpressionValue(strValueOf, "format(...)");
                        } else if (d5 >= 0.9d) {
                            strValueOf = (f3 >= 0.0f ? "+" : "") + MathKt.roundToInt(multiplier);
                        } else {
                            strValueOf = String.format((f3 >= 0.0f ? "+" : "") + "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(multiplier)}, 1));
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
                            d2 = 9.0E-4d;
                            int iFloor = (int) Math.floor(multiplier / r8);
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
                            d2 = 9.0E-4d;
                            if (multiplier < -360.0f) {
                                textView.setVisibility(0);
                                textView.setText(yioUaKMByL.RFHY + ((int) Math.floor(r2 / r3)) + "×");
                                multiplier = -((-multiplier) % 360);
                            } else {
                                textView.setVisibility(8);
                            }
                        }
                        double d6 = step;
                        if (d6 < 9.0E-5d) {
                            str = String.format("%.5fº", Arrays.copyOf(new Object[]{Float.valueOf(multiplier)}, 1));
                            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                        } else if (d6 < d2) {
                            str = String.format("%.4fº", Arrays.copyOf(new Object[]{Float.valueOf(multiplier)}, 1));
                            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                        } else if (d6 < 0.009d) {
                            str = String.format("%.3fº", Arrays.copyOf(new Object[]{Float.valueOf(multiplier)}, 1));
                            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                        } else if (d6 < 0.09d) {
                            str = String.format("%.2fº", Arrays.copyOf(new Object[]{Float.valueOf(multiplier)}, 1));
                            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                        } else if (d6 < 0.9d) {
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
                        double d7 = step;
                        if (d7 >= 0.009d) {
                            strValueOf = d7 >= 0.09d ? d7 >= 9.9d ? MathKt.roundToInt(multiplier) + "%" : MathKt.roundToInt(multiplier * 10.0f) + "%" : MathKt.roundToInt(multiplier * 100.0f) + "%";
                        } else {
                            strValueOf = String.format("%.1f%%", Arrays.copyOf(new Object[]{Float.valueOf(multiplier * 100.0f)}, 1));
                            Intrinsics.checkNotNullExpressionValue(strValueOf, "format(...)");
                        }
                        break;
                    case 9:
                        double d8 = step;
                        if (d8 < 0.009d) {
                            strValueOf = String.format((f3 >= 0.0f ? "+" : "") + "%.1f%%", Arrays.copyOf(new Object[]{Float.valueOf(multiplier * 100.0f)}, 1));
                            Intrinsics.checkNotNullExpressionValue(strValueOf, "format(...)");
                        } else if (d8 < 0.09d) {
                            strValueOf = (f3 >= 0.0f ? "+" : "") + MathKt.roundToInt(multiplier * 100.0f) + "%";
                        } else if (d8 >= 9.9d) {
                            strValueOf = (f3 >= 0.0f ? "+" : "") + MathKt.roundToInt(multiplier) + "%";
                        } else {
                            strValueOf = (f3 >= 0.0f ? "+" : "") + MathKt.roundToInt(multiplier * 10.0f) + "%";
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
            public static final float NP(Quaternion it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (float) it.getRoll();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Quaternion QgZ(Quaternion a2, float f3) {
                Intrinsics.checkNotNullParameter(a2, "a");
                return Quaternion.INSTANCE.fromEulerAngles(a2.getPitch(), a2.getYaw(), f3);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final SceneElement SR(n nVar, oA.j jVar, final ZJ zj, final Quaternion quaternion, final Scene scene, final SceneElement el) {
                Intrinsics.checkNotNullParameter(scene, "scene");
                Intrinsics.checkNotNullParameter(el, "el");
                oA.j jVarAz = nVar.az();
                Xo xo = new PropertyReference1Impl() { // from class: f0P.ZJ.n.j.Xo
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return Boolean.valueOf(((KeyableVisualEffectRef) obj).getLocallyApplied());
                    }
                };
                return (SceneElement) jVar.t((SceneElement) new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), xo.getReturnType(), jVarAz, xo).rl(el, Boolean.TRUE), new Function1() { // from class: f0P.zP
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ZJ.n.j.EN(scene, el, zj, quaternion, (Keyable) obj);
                    }
                });
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Keyable T3L(Scene scene, SceneElement sceneElement, ZJ zj, Vector3D vector3D, Keyable it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return KeyableKt.copyWithValueForTime(it, scene, sceneElement, HW.C.aYN(zj), vector3D);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Keyable TVk(Scene scene, SceneElement sceneElement, ZJ zj, Vector3D vector3D, Keyable it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return KeyableKt.copyWithValueForTime(it, scene, sceneElement, HW.C.aYN(zj), vector3D);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Map Th(UserParameter.Switch r2, Switch r3, Map it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return MapsKt.plus(it, new Pair(r2.getName(), new KeyableUserParameterValue(r3.isChecked())));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void Toy(ZJ zj, final n nVar, final UserParameter.Switch r2, final Switch r3, View view) {
                HW.C.D(zj, new Function2() { // from class: f0P.CVl
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ZJ.n.j.wKp(nVar, r2, r3, (Scene) obj, (SceneElement) obj2);
                    }
                });
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Keyable UF(Scene scene, SceneElement sceneElement, ZJ zj, float f3, Keyable it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return KeyableKt.copyWithValueForTime(it, scene, sceneElement, HW.C.aYN(zj), Float.valueOf(f3));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Map Vvq(UserParameter userParameter, j jVar, Map it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return MapsKt.plus(it, new Pair(((UserParameter.Switch) userParameter).getName(), new KeyableUserParameterValue(((SJ0.g9) jVar.f65188n).f9449t.isChecked())));
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Removed duplicated region for block: B:82:0x028d  */
            /* JADX WARN: Removed duplicated region for block: B:83:0x0297  */
            /* JADX WARN: Removed duplicated region for block: B:85:0x029a  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public static final void W(n nVar, UserParameter userParameter, pO pOVar, ZJ zj, List list, ValueSpinner valueSpinner, TextView textView, View view, j jVar, String str, int i2, View view2) {
                Vector3D defaultValue;
                char c2;
                SurfaceView surfaceView;
                Keyable<Vector3D> vec3DValue;
                oA.j jVarAz = nVar.az();
                ci ciVar = new PropertyReference1Impl() { // from class: f0P.ZJ.n.j.ci
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return ((KeyableVisualEffectRef) obj).getParameters();
                    }
                };
                oA.aC aCVar = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), ciVar.getReturnType(), jVarAz, ciVar);
                UserParameter.XYZ xyz = (UserParameter.XYZ) userParameter;
                Pair pair = TuplesKt.to(xyz.getName(), new KeyableUserParameterValue(0.0f));
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SceneElement.class);
                KType type = aCVar.nr().getArguments().get(0).getType();
                Intrinsics.checkNotNull(type);
                oA.I28 i28 = new oA.I28(orCreateKotlinClass, type, aCVar, pair.getFirst(), pair.getSecond());
                g9s g9sVar = new PropertyReference1Impl() { // from class: f0P.ZJ.n.j.g9s
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return ((KeyableUserParameterValue) obj).getVec3DValue();
                    }
                };
                oA.aC aCVar2 = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), g9sVar.getReturnType(), i28, g9sVar);
                if (!pOVar.nr().isActivated()) {
                    SceneElement sceneElementNHg = HW.C.nHg(zj);
                    if (sceneElementNHg == null) {
                        return;
                    }
                    Vector3D vector3D = (Vector3D) KeyableKt.valueAtTime((Keyable) aCVar2.get(sceneElementNHg), SceneElementKt.fractionalTime(sceneElementNHg, HW.C.WPU(zj)));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((pO) it.next()).nr().setActivated(false);
                    }
                    pOVar.nr().setActivated(true);
                    valueSpinner.setNeedleColor(pOVar.rl());
                    valueSpinner.setValue(MathKt.roundToInt(((Number) pOVar.n().invoke(vector3D)).floatValue()));
                    valueSpinner.invalidate();
                    L(zj, userParameter, nVar, textView, view, jVar, str);
                    return;
                }
                L(zj, userParameter, nVar, textView, view, jVar, str);
                if (zj.getContext() != null) {
                    KeyableUserParameterValue keyableUserParameterValue = nVar.ty().getParameters().get(xyz.getName());
                    if (keyableUserParameterValue == null || (vec3DValue = keyableUserParameterValue.getVec3DValue()) == null || (defaultValue = (Vector3D) KeyableKt.valueAtTime(vec3DValue, HW.C.aYN(zj))) == null) {
                        defaultValue = xyz.getDefaultValue();
                    }
                    int iRl = pOVar.rl();
                    char c4 = iRl == i2 ? (char) 1 : iRl == -1 ? (char) 2 : (char) 3;
                    List listEmptyList = CollectionsKt.emptyList();
                    ArrayList arrayList = new ArrayList();
                    if (userParameter instanceof UserParameter.FloatValue) {
                        Intrinsics.checkNotNull(defaultValue, "null cannot be cast to non-null type kotlin.Float");
                        arrayList.add(new C2348n(((Float) defaultValue).floatValue(), ((UserParameter.FloatValue) userParameter).getValue(), -1.0f, -1.0f, listEmptyList.isEmpty() ? "" : (String) listEmptyList.get(0), c4 == 1));
                    } else {
                        if (!(userParameter instanceof UserParameter.Angle)) {
                            if (!(userParameter instanceof UserParameter.Point) && !(userParameter instanceof UserParameter.Orientation)) {
                                if (!(userParameter instanceof UserParameter.XYZ)) {
                                    c2 = 0;
                                    if (!(userParameter instanceof UserParameter.Spinner)) {
                                        boolean z2 = userParameter instanceof UserParameter.Slider;
                                    }
                                } else if (defaultValue != null) {
                                    UserParameter.XYZ xyz2 = (UserParameter.XYZ) userParameter;
                                    arrayList.add(new C2348n(defaultValue.getX(), xyz2.getDefaultValue().getX(), xyz2.getMinOffset().getX(), xyz2.getMaxOffset().getX(), listEmptyList.isEmpty() ? "X" : (String) listEmptyList.get(0), c4 == 1));
                                    c2 = 0;
                                    arrayList.add(new C2348n(defaultValue.getY(), xyz2.getDefaultValue().getY(), xyz2.getMinOffset().getY(), xyz2.getMaxOffset().getY(), listEmptyList.size() >= 2 ? (String) listEmptyList.get(1) : "Y", c4 == 2));
                                    arrayList.add(new C2348n(defaultValue.getZ(), xyz2.getDefaultValue().getZ(), xyz2.getMinOffset().getZ(), xyz2.getMaxOffset().getZ(), listEmptyList.size() < 3 ? "Z" : (String) listEmptyList.get(2), c4 == 3));
                                }
                            }
                            Ref.ObjectRef objectRef = new Ref.ObjectRef();
                            r.UGc uGc = new r.UGc();
                            uGc.v(arrayList);
                            uGc.bzg(new Sis(objectRef, uGc, defaultValue, userParameter, zj, aCVar2));
                            uGc.rV9(new r.Ln(objectRef));
                            FragmentActivity activity = zj.getActivity();
                            surfaceView = activity == null ? (SurfaceView) activity.findViewById(2131363442) : null;
                            if (surfaceView != null) {
                                Resources resources = zj.getResources();
                                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                                int[] iArr = new int[2];
                                surfaceView.getLocationInWindow(iArr);
                                int identifier = resources.getIdentifier("status_bar_height", "dimen", AppLovinBridge.f61290h);
                                float dimensionPixelSize = iArr[1];
                                if (identifier > 0) {
                                    dimensionPixelSize -= resources.getDimensionPixelSize(identifier);
                                }
                                uGc.Xw(RectKt.t(Offset.O((((long) Float.floatToRawIntBits(iArr[c2])) << 32) | (((long) Float.floatToRawIntBits(dimensionPixelSize)) & 4294967295L)), Size.nr((((long) Float.floatToRawIntBits(surfaceView.getWidth())) << 32) | (((long) Float.floatToRawIntBits(surfaceView.getHeight())) & 4294967295L))));
                            }
                            zj.getParentFragmentManager().o().KN("NumericKeypad").o(R.id.content, uGc).mUb();
                        }
                        Intrinsics.checkNotNull(defaultValue, "null cannot be cast to non-null type kotlin.Float");
                        UserParameter.Angle angle = (UserParameter.Angle) userParameter;
                        arrayList.add(new C2348n(((Float) defaultValue).floatValue(), angle.getDefaultValue(), angle.getMinValue(), angle.getMaxValue(), listEmptyList.isEmpty() ? "" : (String) listEmptyList.get(0), c4 == 1));
                    }
                    c2 = 0;
                    Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                    r.UGc uGc2 = new r.UGc();
                    uGc2.v(arrayList);
                    uGc2.bzg(new Sis(objectRef2, uGc2, defaultValue, userParameter, zj, aCVar2));
                    uGc2.rV9(new r.Ln(objectRef2));
                    FragmentActivity activity2 = zj.getActivity();
                    if (activity2 == null) {
                    }
                    if (surfaceView != null) {
                    }
                    zj.getParentFragmentManager().o().KN("NumericKeypad").o(R.id.content, uGc2).mUb();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Vector3D WH(Vector3D a2, float f3) {
                Intrinsics.checkNotNullParameter(a2, "a");
                return Vector3D.copy$default(a2, f3, 0.0f, 0.0f, 6, null);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final float XNZ(Quaternion it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (float) it.getPitch();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final SceneElement Xli(HueDiscView hueDiscView, float f3, n nVar, UserParameter.HueDisc hueDisc, TextView textView, final ZJ zj, final Scene scene, final SceneElement el) {
                Intrinsics.checkNotNullParameter(scene, "scene");
                Intrinsics.checkNotNullParameter(el, "el");
                final Vector3D vector3D = new Vector3D(hueDiscView.getHue(), hueDiscView.getStrength(), f3);
                w(hueDisc, textView, vector3D);
                oA.j jVarAz = nVar.az();
                fg fgVar = new PropertyReference1Impl() { // from class: f0P.ZJ.n.j.fg
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return Boolean.valueOf(((KeyableVisualEffectRef) obj).getLocallyApplied());
                    }
                };
                oA.aC aCVar = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), fgVar.getReturnType(), jVarAz, fgVar);
                oA.j jVarAz2 = nVar.az();
                KH kh = new PropertyReference1Impl() { // from class: f0P.ZJ.n.j.KH
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return ((KeyableVisualEffectRef) obj).getParameters();
                    }
                };
                oA.aC aCVar2 = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), kh.getReturnType(), jVarAz2, kh);
                Pair pair = TuplesKt.to(hueDisc.getName(), new KeyableUserParameterValue(0.0f));
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SceneElement.class);
                KType type = aCVar2.nr().getArguments().get(0).getType();
                Intrinsics.checkNotNull(type);
                oA.I28 i28 = new oA.I28(orCreateKotlinClass, type, aCVar2, pair.getFirst(), pair.getSecond());
                Mf mf = new PropertyReference1Impl() { // from class: f0P.ZJ.n.j.Mf
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return ((KeyableUserParameterValue) obj).getVec3DValue();
                    }
                };
                return (SceneElement) new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), mf.getReturnType(), i28, mf).t((SceneElement) aCVar.rl(el, Boolean.TRUE), new Function1() { // from class: f0P.fVn
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ZJ.n.j.fq(scene, el, zj, vector3D, (Keyable) obj);
                    }
                });
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void Zmq(ZJ zj, UserParameter userParameter, n nVar, TextView textView, View view, j jVar, String str, View view2) {
                String string;
                CharSequence text;
                Keyable<Float> floatValue;
                L(zj, userParameter, nVar, textView, view, jVar, str);
                if (zj.getContext() != null) {
                    oA.j jVarAz = nVar.az();
                    Lu lu = new PropertyReference1Impl() { // from class: f0P.ZJ.n.j.Lu
                        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                        public Object get(Object obj) {
                            return ((KeyableVisualEffectRef) obj).getParameters();
                        }
                    };
                    oA.aC aCVar = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), lu.getReturnType(), jVarAz, lu);
                    UserParameter.Slider slider = (UserParameter.Slider) userParameter;
                    Pair pair = TuplesKt.to(slider.getName(), new KeyableUserParameterValue(0.0f));
                    KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SceneElement.class);
                    KType type = aCVar.nr().getArguments().get(0).getType();
                    Intrinsics.checkNotNull(type);
                    oA.I28 i28 = new oA.I28(orCreateKotlinClass, type, aCVar, pair.getFirst(), pair.getSecond());
                    h hVar = new PropertyReference1Impl() { // from class: f0P.ZJ.n.j.h
                        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                        public Object get(Object obj) {
                            return ((KeyableUserParameterValue) obj).getFloatValue();
                        }
                    };
                    oA.aC aCVar2 = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), hVar.getReturnType(), i28, hVar);
                    KeyableUserParameterValue keyableUserParameterValue = nVar.ty().getParameters().get(slider.getName());
                    float defaultValue = (keyableUserParameterValue == null || (floatValue = keyableUserParameterValue.getFloatValue()) == null) ? slider.getDefaultValue() : ((Number) KeyableKt.valueAtTime(floatValue, HW.C.aYN(zj))).floatValue();
                    Float fValueOf = Float.valueOf(defaultValue);
                    TextView textViewR = nVar.r();
                    if (textViewR == null || (text = textViewR.getText()) == null || (string = text.toString()) == null) {
                        string = "";
                    }
                    List listListOf = CollectionsKt.listOf(string);
                    ArrayList arrayList = new ArrayList();
                    if (userParameter instanceof UserParameter.FloatValue) {
                        arrayList.add(new C2348n(defaultValue, ((UserParameter.FloatValue) userParameter).getValue(), -1.0f, -1.0f, listListOf.isEmpty() ? "" : (String) listListOf.get(0), true));
                    } else if (userParameter instanceof UserParameter.Angle) {
                        UserParameter.Angle angle = (UserParameter.Angle) userParameter;
                        arrayList.add(new C2348n(defaultValue, angle.getDefaultValue(), angle.getMinValue(), angle.getMaxValue(), listListOf.isEmpty() ? "" : (String) listListOf.get(0), true));
                    } else if (!(userParameter instanceof UserParameter.Point) && !(userParameter instanceof UserParameter.Orientation) && !(userParameter instanceof UserParameter.XYZ)) {
                        if (userParameter instanceof UserParameter.Spinner) {
                            UserParameter.Spinner spinner = (UserParameter.Spinner) userParameter;
                            float fFloatValue = fValueOf.floatValue() * spinner.getMultiplier();
                            SliderType sliderType = spinner.getSliderType();
                            arrayList.add(new C2348n(UserParameterKt.calcSliderTypeValueForViewing(sliderType, fFloatValue), UserParameterKt.calcSliderTypeValueForViewing(sliderType, spinner.getDefaultValue() * spinner.getMultiplier()), UserParameterKt.calcSliderTypeValueForViewing(sliderType, spinner.getMinValue() * spinner.getMultiplier()), UserParameterKt.calcSliderTypeValueForViewing(sliderType, spinner.getMaxValue() * spinner.getMultiplier()), listListOf.isEmpty() ? spinner.getLabel() : (String) listListOf.get(0), true));
                        } else if (userParameter instanceof UserParameter.Slider) {
                            UserParameter.Slider slider2 = (UserParameter.Slider) userParameter;
                            arrayList.add(new C2348n(UserParameterKt.calcSliderTypeValueForViewing(slider2.getSliderType(), fValueOf.floatValue()), UserParameterKt.calcSliderTypeValueForViewing(slider2.getSliderType(), slider2.getDefaultValue()), UserParameterKt.calcSliderTypeValueForViewing(slider2.getSliderType(), slider2.getMinValue()), UserParameterKt.calcSliderTypeValueForViewing(slider2.getSliderType(), slider2.getMaxValue()), listListOf.isEmpty() ? slider2.getLabel() : (String) listListOf.get(0), true));
                        }
                    }
                    Ref.ObjectRef objectRef = new Ref.ObjectRef();
                    r.UGc uGc = new r.UGc();
                    uGc.v(arrayList);
                    uGc.bzg(new mz(objectRef, uGc, fValueOf, userParameter, zj, aCVar2));
                    uGc.rV9(new r.Ln(objectRef));
                    FragmentActivity activity = zj.getActivity();
                    SurfaceView surfaceView = activity != null ? (SurfaceView) activity.findViewById(2131363442) : null;
                    if (surfaceView != null) {
                        Resources resources = zj.getResources();
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
                    zj.getParentFragmentManager().o().KN("NumericKeypad").o(R.id.content, uGc).mUb();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit Zn(ZJ zj, final n nVar, final UserParameter userParameter, final ChoiceInfo choiceInfo) {
                HW.C.D(zj, new Function2() { // from class: f0P.q
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ZJ.n.j.nO(nVar, userParameter, choiceInfo, (Scene) obj, (SceneElement) obj2);
                    }
                });
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final SceneElement a63(n nVar, oA.j jVar, final ZJ zj, final Vector3D vector3D, final Scene scene, final SceneElement el) {
                Intrinsics.checkNotNullParameter(scene, "scene");
                Intrinsics.checkNotNullParameter(el, "el");
                oA.j jVarAz = nVar.az();
                afx afxVar = new PropertyReference1Impl() { // from class: f0P.ZJ.n.j.afx
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return Boolean.valueOf(((KeyableVisualEffectRef) obj).getLocallyApplied());
                    }
                };
                return (SceneElement) jVar.t((SceneElement) new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), afxVar.getReturnType(), jVarAz, afxVar).rl(el, Boolean.TRUE), new Function1() { // from class: f0P.jO
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ZJ.n.j.F(scene, el, zj, vector3D, (Keyable) obj);
                    }
                });
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final SceneElement bZm(n nVar, oA.j jVar, final ZJ zj, final Vector2D vector2D, final Scene scene, final SceneElement el) {
                Intrinsics.checkNotNullParameter(scene, "scene");
                Intrinsics.checkNotNullParameter(el, "el");
                oA.j jVarAz = nVar.az();
                Q q2 = new PropertyReference1Impl() { // from class: f0P.ZJ.n.j.Q
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return Boolean.valueOf(((KeyableVisualEffectRef) obj).getLocallyApplied());
                    }
                };
                return (SceneElement) jVar.t((SceneElement) new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), q2.getReturnType(), jVarAz, q2).rl(el, Boolean.TRUE), new Function1() { // from class: f0P.pR
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ZJ.n.j.Co(scene, el, zj, vector2D, (Keyable) obj);
                    }
                });
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final float d(Vector3D it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getZ();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit eb(final ZJ zj, final HueDiscView hueDiscView, final n nVar, final UserParameter.HueDisc hueDisc, final TextView textView, final float f3) {
                HW.C.D(zj, new Function2() { // from class: f0P.rU
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ZJ.n.j.Xli(hueDiscView, f3, nVar, hueDisc, textView, zj, (Scene) obj, (SceneElement) obj2);
                    }
                });
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void eo(n nVar, UserParameter userParameter, ZJ zj, yg ygVar, List list, ValueSpinner valueSpinner, TextView textView, View view, j jVar, String str, int i2, View view2) {
                Vector2D defaultValue;
                Keyable<Vector2D> vec2DValue;
                oA.j jVarAz = nVar.az();
                QJ qj = new PropertyReference1Impl() { // from class: f0P.ZJ.n.j.QJ
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return ((KeyableVisualEffectRef) obj).getParameters();
                    }
                };
                oA.aC aCVar = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), qj.getReturnType(), jVarAz, qj);
                UserParameter.Point point = (UserParameter.Point) userParameter;
                Pair pair = TuplesKt.to(point.getName(), new KeyableUserParameterValue(0.0f));
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SceneElement.class);
                KType type = aCVar.nr().getArguments().get(0).getType();
                Intrinsics.checkNotNull(type);
                oA.I28 i28 = new oA.I28(orCreateKotlinClass, type, aCVar, pair.getFirst(), pair.getSecond());
                l3D l3d = new PropertyReference1Impl() { // from class: f0P.ZJ.n.j.l3D
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return ((KeyableUserParameterValue) obj).getVec2DValue();
                    }
                };
                oA.aC aCVar2 = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), l3d.getReturnType(), i28, l3d);
                SceneElement sceneElementNHg = HW.C.nHg(zj);
                if (sceneElementNHg == null) {
                    return;
                }
                if (!ygVar.nr().isActivated()) {
                    Vector2D vector2D = (Vector2D) KeyableKt.valueAtTime((Keyable) aCVar2.get(sceneElementNHg), SceneElementKt.fractionalTime(sceneElementNHg, HW.C.WPU(zj)));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((yg) it.next()).nr().setActivated(false);
                    }
                    ygVar.nr().setActivated(true);
                    valueSpinner.setNeedleColor(ygVar.rl());
                    valueSpinner.setMinValue(MathKt.roundToInt(((Number) ygVar.n().invoke(point.getMinOffset())).floatValue() / point.getStep()));
                    valueSpinner.setMaxValue(MathKt.roundToInt(((Number) ygVar.n().invoke(point.getMaxOffset())).floatValue() / point.getStep()));
                    valueSpinner.setValue(MathKt.roundToInt(((Number) ygVar.n().invoke(vector2D)).floatValue() / point.getStep()));
                    valueSpinner.invalidate();
                    L(zj, userParameter, nVar, textView, view, jVar, str);
                    return;
                }
                L(zj, userParameter, nVar, textView, view, jVar, str);
                if (zj.getContext() != null) {
                    KeyableUserParameterValue keyableUserParameterValue = nVar.ty().getParameters().get(point.getName());
                    if (keyableUserParameterValue == null || (vec2DValue = keyableUserParameterValue.getVec2DValue()) == null || (defaultValue = (Vector2D) KeyableKt.valueAtTime(vec2DValue, HW.C.aYN(zj))) == null) {
                        defaultValue = point.getDefaultValue();
                    }
                    char c2 = ygVar.rl() == i2 ? (char) 1 : (char) 2;
                    List listEmptyList = CollectionsKt.emptyList();
                    ArrayList arrayList = new ArrayList();
                    if (userParameter instanceof UserParameter.FloatValue) {
                        Intrinsics.checkNotNull(defaultValue, "null cannot be cast to non-null type kotlin.Float");
                        arrayList.add(new C2348n(((Float) defaultValue).floatValue(), ((UserParameter.FloatValue) userParameter).getValue(), -1.0f, -1.0f, listEmptyList.isEmpty() ? "" : (String) listEmptyList.get(0), c2 == 1));
                    } else if (userParameter instanceof UserParameter.Angle) {
                        Intrinsics.checkNotNull(defaultValue, "null cannot be cast to non-null type kotlin.Float");
                        UserParameter.Angle angle = (UserParameter.Angle) userParameter;
                        arrayList.add(new C2348n(((Float) defaultValue).floatValue(), angle.getDefaultValue(), angle.getMinValue(), angle.getMaxValue(), listEmptyList.isEmpty() ? "" : (String) listEmptyList.get(0), c2 == 1));
                    } else {
                        if (userParameter instanceof UserParameter.Point) {
                            if (defaultValue != null) {
                                UserParameter.Point point2 = (UserParameter.Point) userParameter;
                                arrayList.add(new C2348n(defaultValue.getX(), point2.getDefaultValue().getX(), point2.getMinOffset().getX(), point2.getMaxOffset().getX(), listEmptyList.isEmpty() ? "X" : (String) listEmptyList.get(0), c2 == 1));
                                arrayList.add(new C2348n(defaultValue.getY(), point2.getDefaultValue().getY(), point2.getMinOffset().getY(), point2.getMaxOffset().getY(), listEmptyList.size() >= 2 ? (String) listEmptyList.get(1) : "Y", c2 == 2));
                            }
                            Unit unit = Unit.INSTANCE;
                        } else if ((userParameter instanceof UserParameter.Orientation) || (userParameter instanceof UserParameter.XYZ) || (userParameter instanceof UserParameter.Spinner)) {
                            Unit unit2 = Unit.INSTANCE;
                        } else {
                            boolean z2 = userParameter instanceof UserParameter.Slider;
                            Unit unit3 = Unit.INSTANCE;
                        }
                    }
                    Ref.ObjectRef objectRef = new Ref.ObjectRef();
                    r.UGc uGc = new r.UGc();
                    uGc.v(arrayList);
                    uGc.bzg(new C2018p(objectRef, uGc, defaultValue, userParameter, zj, aCVar2));
                    uGc.rV9(new r.Ln(objectRef));
                    FragmentActivity activity = zj.getActivity();
                    SurfaceView surfaceView = activity != null ? (SurfaceView) activity.findViewById(2131363442) : null;
                    if (surfaceView != null) {
                        Resources resources = zj.getResources();
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
                    zj.getParentFragmentManager().o().KN("NumericKeypad").o(R.id.content, uGc).mUb();
                    Unit unit4 = Unit.INSTANCE;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit f(ValueSpinner valueSpinner, final Ref.ObjectRef objectRef, final ZJ zj) {
                valueSpinner.post(new Runnable() { // from class: f0P.zjc
                    @Override // java.lang.Runnable
                    public final void run() {
                        ZJ.n.j.ub(objectRef, zj);
                    }
                });
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Keyable fq(Scene scene, SceneElement sceneElement, ZJ zj, Vector3D vector3D, Keyable it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return KeyableKt.copyWithValueForTime(it, scene, sceneElement, HW.C.aYN(zj), vector3D);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void g6(j jVar) {
                ((SJ0.kO4) jVar.f65188n).nr.setColorWidget(null);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final float h(Vector2D it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getY();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit iV(Ref.ObjectRef objectRef, ZJ zj) {
                Ml.j jVar = (Ml.j) objectRef.element;
                if (jVar != null) {
                    jVar.n();
                }
                zj.gestureInProgress = false;
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void j(n nVar, UserParameter userParameter, iF iFVar, ZJ zj, List list, ValueSpinner valueSpinner, TextView textView, View view, j jVar, String str, int i2, View view2) {
                Quaternion defaultValue;
                Keyable<Quaternion> quatValue;
                oA.j jVarAz = nVar.az();
                Wre wre = new PropertyReference1Impl() { // from class: f0P.ZJ.n.j.Wre
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return ((KeyableVisualEffectRef) obj).getParameters();
                    }
                };
                oA.aC aCVar = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), wre.getReturnType(), jVarAz, wre);
                UserParameter.Orientation orientation = (UserParameter.Orientation) userParameter;
                Pair pair = TuplesKt.to(orientation.getName(), new KeyableUserParameterValue(0.0f));
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SceneElement.class);
                KType type = aCVar.nr().getArguments().get(0).getType();
                Intrinsics.checkNotNull(type);
                oA.I28 i28 = new oA.I28(orCreateKotlinClass, type, aCVar, pair.getFirst(), pair.getSecond());
                CN3 cn3 = new PropertyReference1Impl() { // from class: f0P.ZJ.n.j.CN3
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return ((KeyableUserParameterValue) obj).getQuatValue();
                    }
                };
                oA.aC aCVar2 = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), cn3.getReturnType(), i28, cn3);
                if (!iFVar.nr().isActivated()) {
                    SceneElement sceneElementNHg = HW.C.nHg(zj);
                    if (sceneElementNHg == null) {
                        return;
                    }
                    Quaternion quaternion = (Quaternion) KeyableKt.valueAtTime((Keyable) aCVar2.get(sceneElementNHg), SceneElementKt.fractionalTime(sceneElementNHg, HW.C.WPU(zj)));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((iF) it.next()).nr().setActivated(false);
                    }
                    view2.setActivated(true);
                    valueSpinner.setNeedleColor(iFVar.rl());
                    valueSpinner.setValue(MathKt.roundToInt(((Number) iFVar.n().invoke(quaternion)).floatValue()));
                    valueSpinner.invalidate();
                    L(zj, userParameter, nVar, textView, view, jVar, str);
                    return;
                }
                L(zj, userParameter, nVar, textView, view, jVar, str);
                if (zj.getContext() != null) {
                    KeyableUserParameterValue keyableUserParameterValue = nVar.ty().getParameters().get(orientation.getName());
                    if (keyableUserParameterValue == null || (quatValue = keyableUserParameterValue.getQuatValue()) == null || (defaultValue = (Quaternion) KeyableKt.valueAtTime(quatValue, HW.C.aYN(zj))) == null) {
                        defaultValue = orientation.getDefaultValue();
                    }
                    List listListOf = CollectionsKt.listOf((Object[]) new String[]{zj.getString(2132019803), zj.getString(2132019805), zj.getString(2132019804)});
                    int iRl = iFVar.rl();
                    char c2 = iRl == i2 ? (char) 1 : iRl == -1 ? (char) 2 : (char) 3;
                    ArrayList arrayList = new ArrayList();
                    if (userParameter instanceof UserParameter.FloatValue) {
                        Intrinsics.checkNotNull(defaultValue, "null cannot be cast to non-null type kotlin.Float");
                        arrayList.add(new C2348n(((Float) defaultValue).floatValue(), ((UserParameter.FloatValue) userParameter).getValue(), -1.0f, -1.0f, listListOf.isEmpty() ? "" : (String) listListOf.get(0), c2 == 1));
                    } else if (userParameter instanceof UserParameter.Angle) {
                        Intrinsics.checkNotNull(defaultValue, "null cannot be cast to non-null type kotlin.Float");
                        UserParameter.Angle angle = (UserParameter.Angle) userParameter;
                        arrayList.add(new C2348n(((Float) defaultValue).floatValue(), angle.getDefaultValue(), angle.getMinValue(), angle.getMaxValue(), listListOf.isEmpty() ? "" : (String) listListOf.get(0), c2 == 1));
                    } else if (!(userParameter instanceof UserParameter.Point)) {
                        if (userParameter instanceof UserParameter.Orientation) {
                            if (defaultValue != null) {
                                UserParameter.Orientation orientation2 = (UserParameter.Orientation) userParameter;
                                arrayList.add(new C2348n((float) defaultValue.getPitch(), (float) orientation2.getDefaultValue().getPitch(), -1.0f, -1.0f, listListOf.isEmpty() ? "" : (String) listListOf.get(0), c2 == 1));
                                arrayList.add(new C2348n((float) defaultValue.getYaw(), (float) orientation2.getDefaultValue().getYaw(), -1.0f, -1.0f, listListOf.size() < 2 ? "" : (String) listListOf.get(1), c2 == 2));
                                arrayList.add(new C2348n((float) defaultValue.getRoll(), (float) orientation2.getDefaultValue().getRoll(), -1.0f, -1.0f, listListOf.size() >= 3 ? (String) listListOf.get(2) : "", c2 == 3));
                            }
                        } else if (!(userParameter instanceof UserParameter.XYZ) && !(userParameter instanceof UserParameter.Spinner)) {
                            boolean z2 = userParameter instanceof UserParameter.Slider;
                        }
                    }
                    Ref.ObjectRef objectRef = new Ref.ObjectRef();
                    r.UGc uGc = new r.UGc();
                    uGc.v(arrayList);
                    uGc.bzg(new OU(objectRef, uGc, defaultValue, userParameter, zj, aCVar2));
                    uGc.rV9(new r.Ln(objectRef));
                    FragmentActivity activity = zj.getActivity();
                    SurfaceView surfaceView = activity != null ? (SurfaceView) activity.findViewById(2131363442) : null;
                    if (surfaceView != null) {
                        Resources resources = zj.getResources();
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
                    zj.getParentFragmentManager().o().KN("NumericKeypad").o(R.id.content, uGc).mUb();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void jO(Switch r42, View view) {
                Rect rect = new Rect();
                r42.getHitRect(rect);
                int iWidth = rect.width();
                int iHeight = rect.height();
                int i2 = iWidth / 2;
                rect.left -= i2;
                rect.right += i2;
                int i3 = iHeight / 2;
                rect.top -= i3;
                rect.bottom += i3;
                view.setTouchDelegate(new TouchDelegate(rect, r42));
            }

            private static final String kSg(float f3, UserParameter userParameter) {
                float step = ((UserParameter.Point) userParameter).getStep();
                int i2 = 0;
                while (step > 0.0f && step < 1.0f) {
                    step *= 10.000001f;
                    i2++;
                }
                String str = String.format("%." + i2 + InneractiveMediationDefs.GENDER_FEMALE, Arrays.copyOf(new Object[]{Float.valueOf(f3)}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                return str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Vector2D l(Vector2D a2, float f3) {
                Intrinsics.checkNotNullParameter(a2, "a");
                return Vector2D.copy$default(a2, 0.0f, f3, 1, null);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Quaternion lNy(Quaternion a2, float f3) {
                Intrinsics.checkNotNullParameter(a2, "a");
                return Quaternion.INSTANCE.fromEulerAngles(f3, a2.getYaw(), a2.getRoll());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final SceneElement mI(n nVar, oA.j jVar, final ZJ zj, final Vector3D vector3D, final Scene scene, final SceneElement el) {
                Intrinsics.checkNotNullParameter(scene, "scene");
                Intrinsics.checkNotNullParameter(el, "el");
                oA.j jVarAz = nVar.az();
                u uVar = new PropertyReference1Impl() { // from class: f0P.ZJ.n.j.u
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return Boolean.valueOf(((KeyableVisualEffectRef) obj).getLocallyApplied());
                    }
                };
                return (SceneElement) jVar.t((SceneElement) new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), uVar.getReturnType(), jVarAz, uVar).rl(el, Boolean.TRUE), new Function1() { // from class: f0P.jWj
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ZJ.n.j.T3L(scene, el, zj, vector3D, (Keyable) obj);
                    }
                });
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Keyable mx(Scene scene, SceneElement sceneElement, ZJ zj, Vector2D vector2D, Keyable it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return KeyableKt.copyWithValueForTime(it, scene, sceneElement, HW.C.aYN(zj), vector2D);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Map n7b(UserParameter userParameter, ChoiceInfo choiceInfo, Map it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return MapsKt.plus(it, new Pair(((UserParameter.Selector) userParameter).getName(), new KeyableUserParameterValue(choiceInfo.getValue())));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final SceneElement nO(n nVar, final UserParameter userParameter, final ChoiceInfo choiceInfo, Scene scene, SceneElement el) {
                Intrinsics.checkNotNullParameter(scene, "<unused var>");
                Intrinsics.checkNotNullParameter(el, "el");
                oA.j jVarAz = nVar.az();
                nKK nkk = new PropertyReference1Impl() { // from class: f0P.ZJ.n.j.nKK
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return Boolean.valueOf(((KeyableVisualEffectRef) obj).getLocallyApplied());
                    }
                };
                oA.aC aCVar = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), nkk.getReturnType(), jVarAz, nkk);
                oA.j jVarAz2 = nVar.az();
                DAz dAz = new PropertyReference1Impl() { // from class: f0P.ZJ.n.j.DAz
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return ((KeyableVisualEffectRef) obj).getParameters();
                    }
                };
                return (SceneElement) new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), dAz.getReturnType(), jVarAz2, dAz).t((SceneElement) aCVar.rl(el, Boolean.TRUE), new Function1() { // from class: f0P.Lzz
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ZJ.n.j.vl(userParameter, choiceInfo, (Map) obj);
                    }
                });
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final SceneElement o9(n nVar, final UserParameter userParameter, final ChoiceInfo choiceInfo, Scene scene, SceneElement el) {
                Intrinsics.checkNotNullParameter(scene, "<unused var>");
                Intrinsics.checkNotNullParameter(el, "el");
                oA.j jVarAz = nVar.az();
                psW psw = new PropertyReference1Impl() { // from class: f0P.ZJ.n.j.psW
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return Boolean.valueOf(((KeyableVisualEffectRef) obj).getLocallyApplied());
                    }
                };
                oA.aC aCVar = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), psw.getReturnType(), jVarAz, psw);
                oA.j jVarAz2 = nVar.az();
                Md md = new PropertyReference1Impl() { // from class: f0P.ZJ.n.j.Md
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return ((KeyableVisualEffectRef) obj).getParameters();
                    }
                };
                return (SceneElement) new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), md.getReturnType(), jVarAz2, md).t((SceneElement) aCVar.rl(el, Boolean.TRUE), new Function1() { // from class: f0P.pFX
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ZJ.n.j.n7b(userParameter, choiceInfo, (Map) obj);
                    }
                });
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final float oz(Vector3D it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getY();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void p0N(ZJ zj, UserParameter userParameter, n nVar, TextView textView, View view, j jVar, String str, View view2) {
                String string;
                CharSequence text;
                Keyable<Float> floatValue;
                L(zj, userParameter, nVar, textView, view, jVar, str);
                if (zj.getContext() != null) {
                    oA.j jVarAz = nVar.az();
                    lej lejVar = new PropertyReference1Impl() { // from class: f0P.ZJ.n.j.lej
                        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                        public Object get(Object obj) {
                            return ((KeyableVisualEffectRef) obj).getParameters();
                        }
                    };
                    oA.aC aCVar = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), lejVar.getReturnType(), jVarAz, lejVar);
                    UserParameter.Spinner spinner = (UserParameter.Spinner) userParameter;
                    Pair pair = TuplesKt.to(spinner.getName(), new KeyableUserParameterValue(0.0f));
                    KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SceneElement.class);
                    KType type = aCVar.nr().getArguments().get(0).getType();
                    Intrinsics.checkNotNull(type);
                    oA.I28 i28 = new oA.I28(orCreateKotlinClass, type, aCVar, pair.getFirst(), pair.getSecond());
                    iwV iwv = new PropertyReference1Impl() { // from class: f0P.ZJ.n.j.iwV
                        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                        public Object get(Object obj) {
                            return ((KeyableUserParameterValue) obj).getFloatValue();
                        }
                    };
                    oA.aC aCVar2 = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), iwv.getReturnType(), i28, iwv);
                    KeyableUserParameterValue keyableUserParameterValue = nVar.ty().getParameters().get(spinner.getName());
                    float defaultValue = (keyableUserParameterValue == null || (floatValue = keyableUserParameterValue.getFloatValue()) == null) ? spinner.getDefaultValue() : ((Number) KeyableKt.valueAtTime(floatValue, HW.C.aYN(zj))).floatValue();
                    Float fValueOf = Float.valueOf(defaultValue);
                    TextView textViewR = nVar.r();
                    if (textViewR == null || (text = textViewR.getText()) == null || (string = text.toString()) == null) {
                        string = "";
                    }
                    List listListOf = CollectionsKt.listOf(string);
                    ArrayList arrayList = new ArrayList();
                    if (userParameter instanceof UserParameter.FloatValue) {
                        arrayList.add(new C2348n(defaultValue, ((UserParameter.FloatValue) userParameter).getValue(), -1.0f, -1.0f, listListOf.isEmpty() ? "" : (String) listListOf.get(0), true));
                    } else if (userParameter instanceof UserParameter.Angle) {
                        UserParameter.Angle angle = (UserParameter.Angle) userParameter;
                        arrayList.add(new C2348n(defaultValue, angle.getDefaultValue(), angle.getMinValue(), angle.getMaxValue(), listListOf.isEmpty() ? "" : (String) listListOf.get(0), true));
                    } else if (!(userParameter instanceof UserParameter.Point) && !(userParameter instanceof UserParameter.Orientation) && !(userParameter instanceof UserParameter.XYZ)) {
                        if (userParameter instanceof UserParameter.Spinner) {
                            UserParameter.Spinner spinner2 = (UserParameter.Spinner) userParameter;
                            float fFloatValue = fValueOf.floatValue() * spinner2.getMultiplier();
                            SliderType sliderType = spinner2.getSliderType();
                            arrayList.add(new C2348n(UserParameterKt.calcSliderTypeValueForViewing(sliderType, fFloatValue), UserParameterKt.calcSliderTypeValueForViewing(sliderType, spinner2.getDefaultValue() * spinner2.getMultiplier()), UserParameterKt.calcSliderTypeValueForViewing(sliderType, spinner2.getMinValue() * spinner2.getMultiplier()), UserParameterKt.calcSliderTypeValueForViewing(sliderType, spinner2.getMaxValue() * spinner2.getMultiplier()), listListOf.isEmpty() ? spinner2.getLabel() : (String) listListOf.get(0), true));
                        } else if (userParameter instanceof UserParameter.Slider) {
                            UserParameter.Slider slider = (UserParameter.Slider) userParameter;
                            arrayList.add(new C2348n(UserParameterKt.calcSliderTypeValueForViewing(slider.getSliderType(), fValueOf.floatValue()), UserParameterKt.calcSliderTypeValueForViewing(slider.getSliderType(), slider.getDefaultValue()), UserParameterKt.calcSliderTypeValueForViewing(slider.getSliderType(), slider.getMinValue()), UserParameterKt.calcSliderTypeValueForViewing(slider.getSliderType(), slider.getMaxValue()), listListOf.isEmpty() ? slider.getLabel() : (String) listListOf.get(0), true));
                        }
                    }
                    Ref.ObjectRef objectRef = new Ref.ObjectRef();
                    r.UGc uGc = new r.UGc();
                    uGc.v(arrayList);
                    uGc.bzg(new l4Z(objectRef, uGc, fValueOf, userParameter, zj, aCVar2));
                    uGc.rV9(new r.Ln(objectRef));
                    FragmentActivity activity = zj.getActivity();
                    SurfaceView surfaceView = activity != null ? (SurfaceView) activity.findViewById(2131363442) : null;
                    if (surfaceView != null) {
                        Resources resources = zj.getResources();
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
                    zj.getParentFragmentManager().o().KN("NumericKeypad").o(R.id.content, uGc).mUb();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Vector3D qva(Vector3D a2, float f3) {
                Intrinsics.checkNotNullParameter(a2, "a");
                return Vector3D.copy$default(a2, 0.0f, f3, 0.0f, 5, null);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Vector3D rT(Vector3D a2, float f3) {
                Intrinsics.checkNotNullParameter(a2, "a");
                return Vector3D.copy$default(a2, 0.0f, 0.0f, f3, 3, null);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final float tEO(Vector2D it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getX();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit tFV(Ref.ObjectRef objectRef, ZJ zj) {
                Ml.j jVar = (Ml.j) objectRef.element;
                if (jVar != null) {
                    jVar.n();
                }
                zj.gestureInProgress = false;
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final SceneElement uG(n nVar, final UserParameter userParameter, final j jVar, Scene scene, SceneElement el) {
                Intrinsics.checkNotNullParameter(scene, "<unused var>");
                Intrinsics.checkNotNullParameter(el, "el");
                oA.j jVarAz = nVar.az();
                C0891n c0891n = new PropertyReference1Impl() { // from class: f0P.ZJ.n.j.n
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return Boolean.valueOf(((KeyableVisualEffectRef) obj).getLocallyApplied());
                    }
                };
                oA.aC aCVar = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), c0891n.getReturnType(), jVarAz, c0891n);
                oA.j jVarAz2 = nVar.az();
                w6 w6Var = new PropertyReference1Impl() { // from class: f0P.ZJ.n.j.w6
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return ((KeyableVisualEffectRef) obj).getParameters();
                    }
                };
                return (SceneElement) new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), w6Var.getReturnType(), jVarAz2, w6Var).t((SceneElement) aCVar.rl(el, Boolean.TRUE), new Function1() { // from class: f0P.HJh
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ZJ.n.j.Vvq(userParameter, jVar, (Map) obj);
                    }
                });
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void ub(Ref.ObjectRef objectRef, ZJ zj) {
                Ml.j jVar = (Ml.j) objectRef.element;
                if (jVar != null) {
                    jVar.n();
                }
                zj.gestureInProgress = false;
                SceneHolder sceneHolderE = HW.C.e(zj);
                if (sceneHolderE != null) {
                    sceneHolderE.setEditMode(0);
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Map vl(UserParameter userParameter, ChoiceInfo choiceInfo, Map it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return MapsKt.plus(it, new Pair(((UserParameter.Selector) userParameter).getName(), new KeyableUserParameterValue(choiceInfo.getValue())));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final SceneElement wKY(n nVar, oA.j jVar, final ZJ zj, final Vector2D vector2D, final Scene scene, final SceneElement el) {
                Intrinsics.checkNotNullParameter(scene, "scene");
                Intrinsics.checkNotNullParameter(el, "el");
                oA.j jVarAz = nVar.az();
                C2015c c2015c = new PropertyReference1Impl() { // from class: f0P.ZJ.n.j.c
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return Boolean.valueOf(((KeyableVisualEffectRef) obj).getLocallyApplied());
                    }
                };
                return (SceneElement) jVar.t((SceneElement) new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), c2015c.getReturnType(), jVarAz, c2015c).rl(el, Boolean.TRUE), new Function1() { // from class: f0P.szu
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ZJ.n.j.mx(scene, el, zj, vector2D, (Keyable) obj);
                    }
                });
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final SceneElement wKp(n nVar, final UserParameter.Switch r6, final Switch r7, Scene scene, SceneElement el) {
                Intrinsics.checkNotNullParameter(scene, "<unused var>");
                Intrinsics.checkNotNullParameter(el, "el");
                oA.j jVarAz = nVar.az();
                Ml ml = new PropertyReference1Impl() { // from class: f0P.ZJ.n.j.Ml
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return Boolean.valueOf(((KeyableVisualEffectRef) obj).getLocallyApplied());
                    }
                };
                oA.aC aCVar = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), ml.getReturnType(), jVarAz, ml);
                oA.j jVarAz2 = nVar.az();
                I28 i28 = new PropertyReference1Impl() { // from class: f0P.ZJ.n.j.I28
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return ((KeyableVisualEffectRef) obj).getParameters();
                    }
                };
                return (SceneElement) new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), i28.getReturnType(), jVarAz2, i28).t((SceneElement) aCVar.rl(el, Boolean.TRUE), new Function1() { // from class: f0P.prm
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ZJ.n.j.Th(r6, r7, (Map) obj);
                    }
                });
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final SceneElement wYi(n nVar, UserParameter.HueDisc hueDisc, final ZJ zj, final Vector3D vector3D, final Scene scene, final SceneElement el) {
                Intrinsics.checkNotNullParameter(scene, "scene");
                Intrinsics.checkNotNullParameter(el, "el");
                oA.j jVarAz = nVar.az();
                O o2 = new PropertyReference1Impl() { // from class: f0P.ZJ.n.j.O
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return Boolean.valueOf(((KeyableVisualEffectRef) obj).getLocallyApplied());
                    }
                };
                oA.aC aCVar = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), o2.getReturnType(), jVarAz, o2);
                oA.j jVarAz2 = nVar.az();
                LEl lEl = new PropertyReference1Impl() { // from class: f0P.ZJ.n.j.LEl
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return ((KeyableVisualEffectRef) obj).getParameters();
                    }
                };
                oA.aC aCVar2 = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), lEl.getReturnType(), jVarAz2, lEl);
                Pair pair = TuplesKt.to(hueDisc.getName(), new KeyableUserParameterValue(0.0f));
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SceneElement.class);
                KType type = aCVar2.nr().getArguments().get(0).getType();
                Intrinsics.checkNotNull(type);
                oA.I28 i28 = new oA.I28(orCreateKotlinClass, type, aCVar2, pair.getFirst(), pair.getSecond());
                gnv gnvVar = new PropertyReference1Impl() { // from class: f0P.ZJ.n.j.gnv
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return ((KeyableUserParameterValue) obj).getVec3DValue();
                    }
                };
                return (SceneElement) new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), gnvVar.getReturnType(), i28, gnvVar).t((SceneElement) aCVar.rl(el, Boolean.TRUE), new Function1() { // from class: f0P.s4q
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ZJ.n.j.TVk(scene, el, zj, vector3D, (Keyable) obj);
                    }
                });
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final SceneElement waP(n nVar, UserParameter userParameter, final ZJ zj, final Quaternion quaternion, final Scene scene, final SceneElement el) {
                Intrinsics.checkNotNullParameter(scene, "scene");
                Intrinsics.checkNotNullParameter(el, "el");
                oA.j jVarAz = nVar.az();
                fuX fux = new PropertyReference1Impl() { // from class: f0P.ZJ.n.j.fuX
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return Boolean.valueOf(((KeyableVisualEffectRef) obj).getLocallyApplied());
                    }
                };
                oA.aC aCVar = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), fux.getReturnType(), jVarAz, fux);
                oA.j jVarAz2 = nVar.az();
                Dsr dsr = new PropertyReference1Impl() { // from class: f0P.ZJ.n.j.Dsr
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return ((KeyableVisualEffectRef) obj).getParameters();
                    }
                };
                oA.aC aCVar2 = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), dsr.getReturnType(), jVarAz2, dsr);
                Pair pair = TuplesKt.to(((UserParameter.Orientation) userParameter).getName(), new KeyableUserParameterValue(0.0f));
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SceneElement.class);
                KType type = aCVar2.nr().getArguments().get(0).getType();
                Intrinsics.checkNotNull(type);
                oA.I28 i28 = new oA.I28(orCreateKotlinClass, type, aCVar2, pair.getFirst(), pair.getSecond());
                aC aCVar3 = new PropertyReference1Impl() { // from class: f0P.ZJ.n.j.aC
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return ((KeyableUserParameterValue) obj).getQuatValue();
                    }
                };
                return (SceneElement) new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), aCVar3.getReturnType(), i28, aCVar3).t((SceneElement) aCVar.rl(el, Boolean.TRUE), new Function1() { // from class: f0P.BcZ
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ZJ.n.j.LPV(scene, el, zj, quaternion, (Keyable) obj);
                    }
                });
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit xVH(View it) {
                Intrinsics.checkNotNullParameter(it, "it");
                it.setEnabled(false);
                it.setAlpha(0.2f);
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Vector2D yAc(Vector2D a2, float f3) {
                Intrinsics.checkNotNullParameter(a2, "a");
                return Vector2D.copy$default(a2, f3, 0.0f, 2, null);
            }

            public final void HE(List userParameters) {
                Vector3D defaultValue;
                View view;
                UserParameter.HueDisc hueDisc;
                TextView textView;
                Keyable<Vector3D> vec3DValue;
                j jVar = this;
                Intrinsics.checkNotNullParameter(userParameters, "userParameters");
                if (userParameters == null || !userParameters.isEmpty()) {
                    Iterator it = userParameters.iterator();
                    while (it.hasNext()) {
                        if (!(((UserParameter) it.next()) instanceof UserParameter.HueDisc)) {
                            return;
                        }
                    }
                }
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(userParameters, 10));
                Iterator it2 = userParameters.iterator();
                while (it2.hasNext()) {
                    UserParameter userParameter = (UserParameter) it2.next();
                    Intrinsics.checkNotNull(userParameter, "null cannot be cast to non-null type com.alightcreative.app.motion.scene.userparam.UserParameter.HueDisc");
                    arrayList.add((UserParameter.HueDisc) userParameter);
                }
                List listListOf = CollectionsKt.listOf((Object[]) new Integer[]{2131363477, 2131363478, 2131363479, 2131363480});
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listListOf, 10));
                Iterator it3 = listListOf.iterator();
                while (it3.hasNext()) {
                    arrayList2.add((TextView) jVar.itemView.findViewById(((Number) it3.next()).intValue()));
                }
                List listListOf2 = CollectionsKt.listOf((Object[]) new Integer[]{2131363060, 2131363061, 2131363062, 2131363063});
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listListOf2, 10));
                Iterator it4 = listListOf2.iterator();
                while (it4.hasNext()) {
                    arrayList3.add(jVar.itemView.findViewById(((Number) it4.next()).intValue()));
                }
                List listListOf3 = CollectionsKt.listOf((Object[]) new Integer[]{2131363484, 2131363486, 2131363488, 2131363489});
                ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listListOf3, 10));
                Iterator it5 = listListOf3.iterator();
                while (it5.hasNext()) {
                    arrayList4.add((TextView) jVar.itemView.findViewById(((Number) it5.next()).intValue()));
                }
                HueDiscView hueDiscView = (HueDiscView) jVar.itemView.findViewById(2131362935);
                YBiasView yBiasView = (YBiasView) jVar.itemView.findViewById(2131364088);
                for (View view2 : CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) arrayList2, (Iterable) arrayList4), (Iterable) arrayList3)) {
                    if (view2 != null) {
                        view2.setVisibility(8);
                    }
                }
                n nVar = jVar.rl;
                final ZJ zj = nVar.mUb;
                int i2 = 0;
                for (Object obj : arrayList) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    UserParameter.HueDisc hueDisc2 = (UserParameter.HueDisc) obj;
                    TextView textView2 = (TextView) arrayList2.get(i2);
                    final TextView textView3 = (TextView) arrayList4.get(i2);
                    View view3 = (View) arrayList3.get(i2);
                    Iy.n localizedStrings = nVar.qie().getLocalizedStrings();
                    Context context = jVar.itemView.getContext();
                    final YBiasView yBiasView2 = yBiasView;
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    textView2.setText(Iy.w6.n(localizedStrings, context, hueDisc2.getLabel()));
                    textView2.setVisibility(0);
                    textView3.setVisibility(0);
                    if (view3 != null) {
                        Keyable keyableL = zj.L(hueDisc2);
                        view3.setVisibility((keyableL == null || !keyableL.getKeyed()) ? 4 : 0);
                    }
                    if (Intrinsics.areEqual(hueDisc2.getName(), zj.paramName)) {
                        textView2.setActivated(true);
                        if (view3 != null) {
                            view3.setActivated(true);
                        }
                        nVar.te(textView2);
                        nVar.g(view3);
                        nVar.iF(jVar.getBindingAdapterPosition());
                    } else {
                        textView2.setActivated(false);
                        if (Intrinsics.areEqual(nVar.r(), textView2)) {
                            nVar.te(null);
                            nVar.g(null);
                            nVar.iF(-1);
                        }
                    }
                    KeyableUserParameterValue keyableUserParameterValue = nVar.ty().getParameters().get(hueDisc2.getName());
                    if (keyableUserParameterValue == null || (vec3DValue = keyableUserParameterValue.getVec3DValue()) == null || (defaultValue = (Vector3D) KeyableKt.valueAtTime(vec3DValue, HW.C.aYN(zj))) == null) {
                        defaultValue = hueDisc2.getDefaultValue();
                    }
                    w(hueDisc2, textView3, defaultValue);
                    if (zj.paramName == null) {
                        view = view3;
                        hueDisc = hueDisc2;
                        textView = textView2;
                        HueDiscView hueDiscView2 = hueDiscView;
                        GH3(zj, hueDisc, nVar, textView, view, jVar, yBiasView2, hueDiscView2, textView3);
                        hueDiscView = hueDiscView2;
                    } else {
                        view = view3;
                        hueDisc = hueDisc2;
                        textView = textView2;
                    }
                    final n nVar2 = nVar;
                    final UserParameter.HueDisc hueDisc3 = hueDisc;
                    final ZJ zj2 = zj;
                    final View view4 = view;
                    final TextView textView4 = textView;
                    final HueDiscView hueDiscView3 = hueDiscView;
                    View.OnClickListener onClickListener = new View.OnClickListener() { // from class: f0P.bd
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view5) {
                            ZJ.n.j.fW(zj2, hueDisc3, nVar2, textView4, view4, this, yBiasView2, hueDiscView3, textView3, view5);
                        }
                    };
                    zj = zj2;
                    yBiasView = yBiasView2;
                    hueDiscView = hueDiscView3;
                    textView4.setOnClickListener(onClickListener);
                    hueDiscView.setOnStartTrackingTouchListener(new Function0() { // from class: f0P.j8
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ZJ.n.j.c32(zj);
                        }
                    });
                    hueDiscView.setOnStopTrackingTouchListener(new Function0() { // from class: f0P.vE
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ZJ.n.j.l2(zj);
                        }
                    });
                    yBiasView.setOnStartTrackingTouchListener(new Function0() { // from class: f0P.YPr
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ZJ.n.j.Om(zj);
                        }
                    });
                    yBiasView.setOnStopTrackingTouchListener(new Function0() { // from class: f0P.AR
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ZJ.n.j.t1J(zj);
                        }
                    });
                    HFS(hueDisc3, zj, yBiasView, nVar2, hueDiscView, textView3);
                    nVar = nVar2;
                    i2 = i3;
                    jVar = this;
                }
            }

            public final ViewBinding lRt() {
                return this.f65188n;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void Aum(ZJ zj, UserParameter userParameter, n nVar, TextView textView, View view, j jVar, String str, View view2) {
                L(zj, userParameter, nVar, textView, view, jVar, str);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void Bu(ZJ zj, UserParameter userParameter, n nVar, TextView textView, View view, j jVar, String str, View view2) {
                L(zj, userParameter, nVar, textView, view, jVar, str);
            }

            private static final void GH3(ZJ zj, UserParameter.HueDisc hueDisc, n nVar, TextView textView, View view, j jVar, YBiasView yBiasView, HueDiscView hueDiscView, TextView textView2) {
                KeyableUserParameterValue defaultKeyableUserParameterValue;
                DataType dataType;
                if (!Intrinsics.areEqual(zj.paramName, hueDisc.getName()) && (defaultKeyableUserParameterValue = UserParameterKt.getDefaultKeyableUserParameterValue(hueDisc)) != null && (dataType = defaultKeyableUserParameterValue.getDataType()) != null && dataType.getIsKeyable()) {
                    zj.paramName = hueDisc.getName();
                    TextView textViewR = nVar.r();
                    if (textViewR != null) {
                        textViewR.setActivated(false);
                    }
                    View viewIk = nVar.Ik();
                    if (viewIk != null) {
                        viewIk.setActivated(false);
                    }
                    nVar.te(textView);
                    nVar.g(view);
                    nVar.iF(jVar.getBindingAdapterPosition());
                    textView.setActivated(true);
                    if (view != null) {
                        view.setActivated(true);
                    }
                    zj.W();
                    HFS(hueDisc, zj, yBiasView, nVar, hueDiscView, textView2);
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final boolean H(final n nVar, final UserParameter userParameter, final ZJ zj, iF iFVar, List list, View view) {
                oA.j jVarAz = nVar.az();
                C c2 = new PropertyReference1Impl() { // from class: f0P.ZJ.n.j.C
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return ((KeyableVisualEffectRef) obj).getParameters();
                    }
                };
                oA.aC aCVar = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), c2.getReturnType(), jVarAz, c2);
                Pair pair = TuplesKt.to(((UserParameter.Orientation) userParameter).getName(), new KeyableUserParameterValue(0.0f));
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SceneElement.class);
                KType type = aCVar.nr().getArguments().get(0).getType();
                Intrinsics.checkNotNull(type);
                oA.I28 i28 = new oA.I28(orCreateKotlinClass, type, aCVar, pair.getFirst(), pair.getSecond());
                C2017o c2017o = new PropertyReference1Impl() { // from class: f0P.ZJ.n.j.o
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return ((KeyableUserParameterValue) obj).getQuatValue();
                    }
                };
                oA.aC aCVar2 = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), c2017o.getReturnType(), i28, c2017o);
                SceneElement sceneElementNHg = HW.C.nHg(zj);
                if (sceneElementNHg == null) {
                    return false;
                }
                final Quaternion quaternion = (Quaternion) iFVar.t().invoke((Quaternion) KeyableKt.valueAtTime((Keyable) aCVar2.get(sceneElementNHg), SceneElementKt.fractionalTime(sceneElementNHg, HW.C.WPU(zj))), Float.valueOf(0.0f));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    iF iFVar2 = (iF) it.next();
                    iFVar2.nr().setText(String.valueOf(MathKt.roundToInt(((Number) iFVar2.n().invoke(quaternion)).floatValue())));
                }
                HW.C.D(zj, new Function2() { // from class: f0P.s9l
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ZJ.n.j.waP(nVar, userParameter, zj, quaternion, (Scene) obj, (SceneElement) obj2);
                    }
                });
                return true;
            }

            private static final void HFS(final UserParameter.HueDisc hueDisc, final ZJ zj, final YBiasView yBiasView, final n nVar, final HueDiscView hueDiscView, final TextView textView) {
                int i2;
                Vector3D defaultValue;
                Keyable<Vector3D> vec3DValue;
                if (Intrinsics.areEqual(hueDisc.getName(), zj.paramName)) {
                    if (hueDisc.getBias()) {
                        i2 = 0;
                    } else {
                        i2 = 8;
                    }
                    yBiasView.setVisibility(i2);
                    KeyableUserParameterValue keyableUserParameterValue = nVar.ty().getParameters().get(hueDisc.getName());
                    if (keyableUserParameterValue == null || (vec3DValue = keyableUserParameterValue.getVec3DValue()) == null || (defaultValue = (Vector3D) KeyableKt.valueAtTime(vec3DValue, HW.C.aYN(zj))) == null) {
                        defaultValue = hueDisc.getDefaultValue();
                    }
                    hueDiscView.n(defaultValue.getX(), defaultValue.getY());
                    yBiasView.setValue(defaultValue.getZ());
                    w(hueDisc, textView, defaultValue);
                    hueDiscView.setOnValueChangedListener(new Function2() { // from class: f0P.eUh
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ZJ.n.j.C7B(yBiasView, zj, hueDisc, textView, nVar, ((Float) obj).floatValue(), ((Float) obj2).floatValue());
                        }
                    });
                    yBiasView.setOnValueChangedListener(new Function1() { // from class: f0P.ivh
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ZJ.n.j.eb(zj, hueDiscView, nVar, hueDisc, textView, ((Float) obj).floatValue());
                        }
                    });
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit I4p(final n nVar, UserParameter userParameter, final ZJ zj, List list, int i2) {
                oA.j jVarAz = nVar.az();
                r rVar = new PropertyReference1Impl() { // from class: f0P.ZJ.n.j.r
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return ((KeyableVisualEffectRef) obj).getParameters();
                    }
                };
                oA.aC aCVar = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), rVar.getReturnType(), jVarAz, rVar);
                UserParameter.Point point = (UserParameter.Point) userParameter;
                Pair pair = TuplesKt.to(point.getName(), new KeyableUserParameterValue(0.0f));
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SceneElement.class);
                boolean z2 = false;
                KType type = aCVar.nr().getArguments().get(0).getType();
                Intrinsics.checkNotNull(type);
                oA.I28 i28 = new oA.I28(orCreateKotlinClass, type, aCVar, pair.getFirst(), pair.getSecond());
                SPz sPz = new PropertyReference1Impl() { // from class: f0P.ZJ.n.j.SPz
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return ((KeyableUserParameterValue) obj).getVec2DValue();
                    }
                };
                final oA.aC aCVar2 = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), sPz.getReturnType(), i28, sPz);
                SceneElement sceneElementNHg = HW.C.nHg(zj);
                if (sceneElementNHg == null) {
                    return Unit.INSTANCE;
                }
                Vector2D vector2D = (Vector2D) KeyableKt.valueAtTime((Keyable) aCVar2.get(sceneElementNHg), SceneElementKt.fractionalTime(sceneElementNHg, HW.C.WPU(zj)));
                Object obj = null;
                for (Object obj2 : list) {
                    if (((yg) obj2).nr().isActivated()) {
                        if (!z2) {
                            z2 = true;
                            obj = obj2;
                        } else {
                            throw new IllegalArgumentException("Collection contains more than one matching element.");
                        }
                    }
                }
                if (z2) {
                    final Vector2D vector2D2 = (Vector2D) ((yg) obj).t().invoke(vector2D, Float.valueOf(i2 * point.getStep()));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        yg ygVar = (yg) it.next();
                        ygVar.nr().setText(kSg(((Number) ygVar.n().invoke(vector2D2)).floatValue(), userParameter));
                    }
                    HW.C.D(zj, new Function2() { // from class: f0P.eMh
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            return ZJ.n.j.bZm(nVar, aCVar2, zj, vector2D2, (Scene) obj3, (SceneElement) obj4);
                        }
                    });
                    return Unit.INSTANCE;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void L(ZJ zj, UserParameter userParameter, n nVar, TextView textView, View view, j jVar, String str) {
                KeyableUserParameterValue defaultKeyableUserParameterValue;
                DataType dataType;
                EditActivity editActivity;
                if (!Intrinsics.areEqual(zj.paramName, userParameter.getName()) && (defaultKeyableUserParameterValue = UserParameterKt.getDefaultKeyableUserParameterValue(userParameter)) != null && (dataType = defaultKeyableUserParameterValue.getDataType()) != null && dataType.getIsKeyable()) {
                    zj.paramName = userParameter.getName();
                    TextView textViewR = nVar.r();
                    if (textViewR != null) {
                        textViewR.setActivated(false);
                    }
                    View viewIk = nVar.Ik();
                    if (viewIk != null) {
                        viewIk.setActivated(false);
                    }
                    nVar.te(textView);
                    nVar.g(view);
                    nVar.iF(jVar.getBindingAdapterPosition());
                    textView.setActivated(true);
                    if (view != null) {
                        view.setActivated(true);
                    }
                    zj.W();
                    if (userParameter.getDataType() == DataType.VEC2 || userParameter.getDataType() == DataType.QUAT) {
                        FragmentActivity activity = zj.getActivity();
                        if (activity instanceof EditActivity) {
                            editActivity = (EditActivity) activity;
                        } else {
                            editActivity = null;
                        }
                        if (editActivity != null) {
                            editActivity.vTq(str, zj.guideDuration);
                        }
                        zj.guideDuration = EditActivity.Wre.f44459n;
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void Lp6(ZJ zj, UserParameter userParameter, n nVar, TextView textView, View view, j jVar, String str, View view2) {
                L(zj, userParameter, nVar, textView, view, jVar, str);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void Mh(n nVar, UserParameter userParameter, View view, View view2) {
                UserParameter.StaticText staticText = (UserParameter.StaticText) userParameter;
                if (nVar.HI().contains(staticText.getName())) {
                    nVar.HI().remove(staticText.getName());
                    view.animate().rotation(0.0f).setDuration(300L).setInterpolator(new AccelerateDecelerateInterpolator()).start();
                } else {
                    nVar.HI().add(staticText.getName());
                    view.animate().rotation(90.0f).setDuration(300L).setInterpolator(new AccelerateDecelerateInterpolator()).start();
                }
                nVar.WPU();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit Om(ZJ zj) {
                zj.undoBatch = HW.C.xMQ(zj);
                zj.gestureInProgress = true;
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Type inference failed for: r2v1, types: [LdY.Ml$j, T] */
            public static final Unit QZ6(Ref.ObjectRef objectRef, ZJ zj, UserParameter userParameter, n nVar, TextView textView, View view, j jVar, String str) {
                L(zj, userParameter, nVar, textView, view, jVar, str);
                objectRef.element = HW.C.xMQ(zj);
                zj.gestureInProgress = true;
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final boolean RQ(final n nVar, UserParameter userParameter, final ZJ zj, pO pOVar, List list, View view) {
                oA.j jVarAz = nVar.az();
                Z z2 = new PropertyReference1Impl() { // from class: f0P.ZJ.n.j.Z
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return ((KeyableVisualEffectRef) obj).getParameters();
                    }
                };
                oA.aC aCVar = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), z2.getReturnType(), jVarAz, z2);
                Pair pair = TuplesKt.to(((UserParameter.XYZ) userParameter).getName(), new KeyableUserParameterValue(0.0f));
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SceneElement.class);
                KType type = aCVar.nr().getArguments().get(0).getType();
                Intrinsics.checkNotNull(type);
                oA.I28 i28 = new oA.I28(orCreateKotlinClass, type, aCVar, pair.getFirst(), pair.getSecond());
                Ew ew = new PropertyReference1Impl() { // from class: f0P.ZJ.n.j.Ew
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return ((KeyableUserParameterValue) obj).getVec3DValue();
                    }
                };
                final oA.aC aCVar2 = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), ew.getReturnType(), i28, ew);
                SceneElement sceneElementNHg = HW.C.nHg(zj);
                if (sceneElementNHg == null) {
                    return false;
                }
                final Vector3D vector3D = (Vector3D) pOVar.t().invoke((Vector3D) KeyableKt.valueAtTime((Keyable) aCVar2.get(sceneElementNHg), SceneElementKt.fractionalTime(sceneElementNHg, HW.C.WPU(zj))), Float.valueOf(0.0f));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    pO pOVar2 = (pO) it.next();
                    pOVar2.nr().setText(String.valueOf(MathKt.roundToInt(((Number) pOVar2.n().invoke(vector3D)).floatValue())));
                }
                HW.C.D(zj, new Function2() { // from class: f0P.Sm
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ZJ.n.j.a63(nVar, aCVar2, zj, vector3D, (Scene) obj, (SceneElement) obj2);
                    }
                });
                return true;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit Ro(final n nVar, UserParameter userParameter, final ZJ zj, List list, int i2) {
                oA.j jVarAz = nVar.az();
                eO eOVar = new PropertyReference1Impl() { // from class: f0P.ZJ.n.j.eO
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return ((KeyableVisualEffectRef) obj).getParameters();
                    }
                };
                oA.aC aCVar = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), eOVar.getReturnType(), jVarAz, eOVar);
                Pair pair = TuplesKt.to(((UserParameter.Orientation) userParameter).getName(), new KeyableUserParameterValue(0.0f));
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SceneElement.class);
                boolean z2 = false;
                KType type = aCVar.nr().getArguments().get(0).getType();
                Intrinsics.checkNotNull(type);
                oA.I28 i28 = new oA.I28(orCreateKotlinClass, type, aCVar, pair.getFirst(), pair.getSecond());
                C2019z c2019z = new PropertyReference1Impl() { // from class: f0P.ZJ.n.j.z
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return ((KeyableUserParameterValue) obj).getQuatValue();
                    }
                };
                final oA.aC aCVar2 = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), c2019z.getReturnType(), i28, c2019z);
                if (HW.C.nHg(zj) == null) {
                    return Unit.INSTANCE;
                }
                Quaternion quaternionCk = nVar.ck();
                Object obj = null;
                for (Object obj2 : list) {
                    if (((iF) obj2).nr().isActivated()) {
                        if (!z2) {
                            z2 = true;
                            obj = obj2;
                        } else {
                            throw new IllegalArgumentException("Collection contains more than one matching element.");
                        }
                    }
                }
                if (z2) {
                    final Quaternion quaternion = (Quaternion) ((iF) obj).t().invoke(quaternionCk, Float.valueOf(i2));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        iF iFVar = (iF) it.next();
                        iFVar.nr().setText(String.valueOf(MathKt.roundToInt(((Number) iFVar.n().invoke(quaternion)).floatValue())));
                    }
                    HW.C.D(zj, new Function2() { // from class: f0P.qrq
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            return ZJ.n.j.SR(nVar, aCVar2, zj, quaternion, (Scene) obj3, (SceneElement) obj4);
                        }
                    });
                    return Unit.INSTANCE;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Type inference failed for: r2v1, types: [LdY.Ml$j, T] */
            public static final Unit Uf(Ref.ObjectRef objectRef, ZJ zj, UserParameter userParameter, n nVar, TextView textView, View view, j jVar, String str) {
                L(zj, userParameter, nVar, textView, view, jVar, str);
                objectRef.element = HW.C.xMQ(zj);
                zj.gestureInProgress = true;
                SceneHolder sceneHolderE = HW.C.e(zj);
                if (sceneHolderE != null) {
                    sceneHolderE.setEditMode(2131362614);
                }
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit VwL(final n nVar, UserParameter userParameter, final ZJ zj, List list, int i2) {
                oA.j jVarAz = nVar.az();
                qf qfVar = new PropertyReference1Impl() { // from class: f0P.ZJ.n.j.qf
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return ((KeyableVisualEffectRef) obj).getParameters();
                    }
                };
                oA.aC aCVar = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), qfVar.getReturnType(), jVarAz, qfVar);
                Pair pair = TuplesKt.to(((UserParameter.XYZ) userParameter).getName(), new KeyableUserParameterValue(0.0f));
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SceneElement.class);
                boolean z2 = false;
                KType type = aCVar.nr().getArguments().get(0).getType();
                Intrinsics.checkNotNull(type);
                oA.I28 i28 = new oA.I28(orCreateKotlinClass, type, aCVar, pair.getFirst(), pair.getSecond());
                Ln ln2 = new PropertyReference1Impl() { // from class: f0P.ZJ.n.j.Ln
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return ((KeyableUserParameterValue) obj).getVec3DValue();
                    }
                };
                final oA.aC aCVar2 = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), ln2.getReturnType(), i28, ln2);
                SceneElement sceneElementNHg = HW.C.nHg(zj);
                if (sceneElementNHg == null) {
                    return Unit.INSTANCE;
                }
                Vector3D vector3D = (Vector3D) KeyableKt.valueAtTime((Keyable) aCVar2.get(sceneElementNHg), SceneElementKt.fractionalTime(sceneElementNHg, HW.C.WPU(zj)));
                Object obj = null;
                for (Object obj2 : list) {
                    if (((pO) obj2).nr().isActivated()) {
                        if (!z2) {
                            z2 = true;
                            obj = obj2;
                        } else {
                            throw new IllegalArgumentException("Collection contains more than one matching element.");
                        }
                    }
                }
                if (z2) {
                    final Vector3D vector3D2 = (Vector3D) ((pO) obj).t().invoke(vector3D, Float.valueOf(i2));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        pO pOVar = (pO) it.next();
                        pOVar.nr().setText(String.valueOf(MathKt.roundToInt(((Number) pOVar.n().invoke(vector3D2)).floatValue())));
                    }
                    HW.C.D(zj, new Function2() { // from class: f0P.X56
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            return ZJ.n.j.mI(nVar, aCVar2, zj, vector3D2, (Scene) obj3, (SceneElement) obj4);
                        }
                    });
                    return Unit.INSTANCE;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void X4T(ZJ zj, UserParameter userParameter, n nVar, TextView textView, View view, j jVar, String str, View view2) {
                L(zj, userParameter, nVar, textView, view, jVar, str);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c32(ZJ zj) {
                zj.undoBatch = HW.C.xMQ(zj);
                zj.gestureInProgress = true;
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void fW(ZJ zj, UserParameter.HueDisc hueDisc, n nVar, TextView textView, View view, j jVar, YBiasView yBiasView, HueDiscView hueDiscView, TextView textView2, View view2) {
                GH3(zj, hueDisc, nVar, textView, view, jVar, yBiasView, hueDiscView, textView2);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit l2(ZJ zj) {
                zj.undoBatch.n();
                zj.gestureInProgress = false;
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Type inference failed for: r2v1, types: [LdY.Ml$j, T] */
            public static final Unit lS(Ref.ObjectRef objectRef, ZJ zj, UserParameter userParameter, n nVar, TextView textView, View view, j jVar, String str) {
                L(zj, userParameter, nVar, textView, view, jVar, str);
                objectRef.element = HW.C.xMQ(zj);
                zj.gestureInProgress = true;
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void pS(ZJ zj, UserParameter userParameter, n nVar, TextView textView, View view, j jVar, String str, View view2) {
                L(zj, userParameter, nVar, textView, view, jVar, str);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void q9(ZJ zj, UserParameter userParameter, n nVar, TextView textView, View view, j jVar, String str, View view2) {
                L(zj, userParameter, nVar, textView, view, jVar, str);
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Type inference failed for: r11v1, types: [LdY.Ml$j, T] */
            public static final Unit rxp(ZJ zj, n nVar, UserParameter userParameter, Ref.ObjectRef objectRef, TextView textView, View view, j jVar, String str) {
                SceneElement sceneElementNHg = HW.C.nHg(zj);
                if (sceneElementNHg == null) {
                    return Unit.INSTANCE;
                }
                oA.j jVarAz = nVar.az();
                qz qzVar = new PropertyReference1Impl() { // from class: f0P.ZJ.n.j.qz
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return ((KeyableVisualEffectRef) obj).getParameters();
                    }
                };
                oA.aC aCVar = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), qzVar.getReturnType(), jVarAz, qzVar);
                Pair pair = TuplesKt.to(((UserParameter.Orientation) userParameter).getName(), new KeyableUserParameterValue(0.0f));
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SceneElement.class);
                KType type = aCVar.nr().getArguments().get(0).getType();
                Intrinsics.checkNotNull(type);
                oA.I28 i28 = new oA.I28(orCreateKotlinClass, type, aCVar, pair.getFirst(), pair.getSecond());
                Pl pl = new PropertyReference1Impl() { // from class: f0P.ZJ.n.j.Pl
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return ((KeyableUserParameterValue) obj).getQuatValue();
                    }
                };
                nVar.nY((Quaternion) KeyableKt.valueAtTime((Keyable) new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), pl.getReturnType(), i28, pl).get(sceneElementNHg), SceneElementKt.fractionalTime(sceneElementNHg, HW.C.WPU(zj))));
                L(zj, userParameter, nVar, textView, view, jVar, str);
                objectRef.element = HW.C.xMQ(zj);
                zj.gestureInProgress = true;
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit t1J(ZJ zj) {
                zj.undoBatch.n();
                zj.gestureInProgress = false;
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final boolean uQ(final n nVar, UserParameter userParameter, final ZJ zj, yg ygVar, List list, View view) {
                oA.j jVarAz = nVar.az();
                s4 s4Var = new PropertyReference1Impl() { // from class: f0P.ZJ.n.j.s4
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return ((KeyableVisualEffectRef) obj).getParameters();
                    }
                };
                oA.aC aCVar = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), s4Var.getReturnType(), jVarAz, s4Var);
                UserParameter.Point point = (UserParameter.Point) userParameter;
                Pair pair = TuplesKt.to(point.getName(), new KeyableUserParameterValue(0.0f));
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SceneElement.class);
                KType type = aCVar.nr().getArguments().get(0).getType();
                Intrinsics.checkNotNull(type);
                oA.I28 i28 = new oA.I28(orCreateKotlinClass, type, aCVar, pair.getFirst(), pair.getSecond());
                UGc uGc = new PropertyReference1Impl() { // from class: f0P.ZJ.n.j.UGc
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return ((KeyableUserParameterValue) obj).getVec2DValue();
                    }
                };
                final oA.aC aCVar2 = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), uGc.getReturnType(), i28, uGc);
                SceneElement sceneElementNHg = HW.C.nHg(zj);
                if (sceneElementNHg == null) {
                    return false;
                }
                final Vector2D vector2D = (Vector2D) ygVar.t().invoke((Vector2D) KeyableKt.valueAtTime((Keyable) aCVar2.get(sceneElementNHg), SceneElementKt.fractionalTime(sceneElementNHg, HW.C.WPU(zj))), ygVar.n().invoke(point.getDefaultValue()));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    yg ygVar2 = (yg) it.next();
                    ygVar2.nr().setText(kSg(((Number) ygVar2.n().invoke(vector2D)).floatValue(), userParameter));
                }
                HW.C.D(zj, new Function2() { // from class: f0P.LJ
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ZJ.n.j.wKY(nVar, aCVar2, zj, vector2D, (Scene) obj, (SceneElement) obj2);
                    }
                });
                return true;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void v0j(final ChoiceInfo choiceInfo, int i2, ZJ zj, final n nVar, final UserParameter userParameter, View view) {
                if (choiceInfo.getValue() != i2) {
                    HW.C.D(zj, new Function2() { // from class: f0P.GBq
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ZJ.n.j.o9(nVar, userParameter, choiceInfo, (Scene) obj, (SceneElement) obj2);
                        }
                    });
                }
            }

            private static final void w(UserParameter.HueDisc hueDisc, TextView textView, Vector3D vector3D) {
                if (hueDisc.getBias()) {
                    String str = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(vector3D.getX())}, 1));
                    Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                    String str2 = String.format("%.3f", Arrays.copyOf(new Object[]{Float.valueOf(vector3D.getY())}, 1));
                    Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
                    String str3 = String.format("%.3f", Arrays.copyOf(new Object[]{Float.valueOf(vector3D.getZ())}, 1));
                    Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
                    textView.setText(str + "º\n" + str2 + "\n" + str3);
                    return;
                }
                String str4 = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(vector3D.getX())}, 1));
                Intrinsics.checkNotNullExpressionValue(str4, "format(...)");
                String str5 = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(vector3D.getY() * 100)}, 1));
                Intrinsics.checkNotNullExpressionValue(str5, "format(...)");
                textView.setText(str4 + "º\n" + str5 + "%");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void xzo(ZJ zj, UserParameter userParameter, n nVar, TextView textView, View view, j jVar, String str, View view2) {
                L(zj, userParameter, nVar, textView, view, jVar, str);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void y(final ZJ zj, final UserParameter userParameter, final n nVar, j jVar, View view) {
                FragmentActivity activity = zj.getActivity();
                if (activity == null) {
                    return;
                }
                com.alightcreative.widget.nKK nkk = new com.alightcreative.widget.nKK(activity, zj.qva(), false, 4, null);
                for (final ChoiceInfo choiceInfo : ((UserParameter.Selector) userParameter).getChoices()) {
                    Iy.n localizedStrings = nVar.qie().getLocalizedStrings();
                    Context context = jVar.itemView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    com.alightcreative.widget.nKK.ck(nkk, Iy.w6.n(localizedStrings, context, choiceInfo.getLabel()), null, false, null, new Function0() { // from class: f0P.sVY
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ZJ.n.j.Zn(zj, nVar, userParameter, choiceInfo);
                        }
                    }, 14, null);
                }
                View itemView = jVar.itemView;
                Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                com.alightcreative.widget.nKK.N(nkk, itemView, 0, 0, null, 14, null);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i2) {
            return i2;
        }

        /* JADX INFO: renamed from: f0P.ZJ$n$n, reason: collision with other inner class name */
        public /* synthetic */ class C0894n {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[StaticTextStyle.values().length];
                try {
                    iArr[StaticTextStyle.TIP.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[StaticTextStyle.SECTION.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public n(ZJ zj, KeyableVisualEffectRef effectRef, oA.j effectLens, Set expandedSections) {
            Intrinsics.checkNotNullParameter(effectRef, "effectRef");
            Intrinsics.checkNotNullParameter(effectLens, "effectLens");
            Intrinsics.checkNotNullParameter(expandedSections, "expandedSections");
            this.mUb = zj;
            this.f65186n = effectRef;
            this.rl = effectLens;
            this.f65187t = expandedSections;
            VisualEffect visualEffectVisualEffectById = VisualEffectKt.visualEffectById(effectRef.getId());
            Intrinsics.checkNotNull(visualEffectVisualEffectById);
            this.nr = visualEffectVisualEffectById;
            this.f65185O = Z();
            this.KN = -1;
            this.xMQ = Quaternion.INSTANCE.getIDENTITY();
        }

        public final Set HI() {
            return this.f65187t;
        }

        public final View Ik() {
            return this.Uo;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
        public j onCreateViewHolder(ViewGroup parent, int i2) {
            ViewBinding viewBindingT;
            Intrinsics.checkNotNullParameter(parent, "parent");
            switch (i2) {
                case 2131558553:
                    viewBindingT = SJ0.kO4.t(LayoutInflater.from(parent.getContext()), parent, false);
                    Intrinsics.checkNotNull(viewBindingT);
                    break;
                case 2131558554:
                    viewBindingT = SJ0.hQ.t(LayoutInflater.from(parent.getContext()), parent, false);
                    Intrinsics.checkNotNull(viewBindingT);
                    break;
                case 2131558555:
                    viewBindingT = SJ0.qYU.t(LayoutInflater.from(parent.getContext()), parent, false);
                    Intrinsics.checkNotNull(viewBindingT);
                    break;
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
                case 2131558560:
                    viewBindingT = C1464t.t(LayoutInflater.from(parent.getContext()), parent, false);
                    Intrinsics.checkNotNull(viewBindingT);
                    break;
                case 2131558561:
                    viewBindingT = SJ0.cA.t(LayoutInflater.from(parent.getContext()), parent, false);
                    Intrinsics.checkNotNull(viewBindingT);
                    break;
                case 2131558562:
                    viewBindingT = SJ0.g9.t(LayoutInflater.from(parent.getContext()), parent, false);
                    Intrinsics.checkNotNull(viewBindingT);
                    break;
                case 2131558563:
                default:
                    throw new UnsupportedOperationException();
                case 2131558564:
                    viewBindingT = SJ0.CM.t(LayoutInflater.from(parent.getContext()), parent, false);
                    Intrinsics.checkNotNull(viewBindingT);
                    break;
            }
            return new j(this, viewBindingT);
        }

        public final void ViF(KeyableVisualEffectRef keyableVisualEffectRef) {
            Intrinsics.checkNotNullParameter(keyableVisualEffectRef, "<set-?>");
            this.f65186n = keyableVisualEffectRef;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: XQ, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(j holder, int i2) {
            boolean z2;
            Intrinsics.checkNotNullParameter(holder, "holder");
            List list = (List) this.f65185O.get(i2);
            List listTake = CollectionsKt.take(this.f65185O, i2);
            if (listTake == null || !listTake.isEmpty()) {
                Iterator it = listTake.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    UserParameter userParameter = (UserParameter) CollectionsKt.firstOrNull((List) it.next());
                    if (userParameter != null && UserParameterKt.isSection(userParameter)) {
                        UserParameter userParameter2 = (UserParameter) CollectionsKt.firstOrNull(list);
                        if (userParameter2 == null || UserParameterKt.isSection(userParameter2)) {
                            break;
                        } else {
                            z2 = true;
                        }
                    }
                }
            } else {
                z2 = false;
            }
            if (CollectionsKt.firstOrNull(list) instanceof UserParameter.HueDisc) {
                holder.HE(list);
                return;
            }
            if (list.size() == 2 && UserParameterKt.isSection((UserParameter) list.get(0)) && (list.get(1) instanceof UserParameter.Switch)) {
                UserParameter userParameter3 = (UserParameter) ((List) this.f65185O.get(i2)).get(0);
                Object obj = ((List) this.f65185O.get(i2)).get(1);
                holder.lLA(userParameter3, obj instanceof UserParameter.Switch ? (UserParameter.Switch) obj : null, z2);
            } else if (list.size() > 1) {
                holder.HE(list);
            } else if (list.size() == 1) {
                holder.lLA((UserParameter) ((List) this.f65185O.get(i2)).get(0), null, z2);
            }
        }

        public final List Z() {
            List<UserParameter> parameters = this.nr.getParameters();
            ArrayList arrayList = new ArrayList();
            for (Object obj : parameters) {
                if (UserParameterKt.getHasUI((UserParameter) obj)) {
                    arrayList.add(obj);
                }
            }
            List listAYN = aYN(arrayList, this.f65187t);
            List arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : listAYN) {
                if (arrayList2.isEmpty()) {
                    arrayList2.add(obj2);
                } else {
                    if (arrayList2.size() < 4) {
                        UserParameter userParameter = (UserParameter) obj2;
                        UserParameter userParameter2 = (UserParameter) CollectionsKt.last(arrayList2);
                        if (!(userParameter2 instanceof UserParameter.HueDisc) || !(userParameter instanceof UserParameter.HueDisc)) {
                            if (userParameter2 instanceof UserParameter.StaticText) {
                                UserParameter.StaticText staticText = (UserParameter.StaticText) userParameter2;
                                if (staticText.getStyle() != StaticTextStyle.SECTION || !(userParameter instanceof UserParameter.Switch) || !Intrinsics.areEqual(staticText.getText(), ((UserParameter.Switch) userParameter).getLabel())) {
                                }
                            }
                        }
                        arrayList2.add(obj2);
                    }
                    arrayList3.add(arrayList2);
                    arrayList2 = CollectionsKt.mutableListOf(obj2);
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList3.add(arrayList2);
            }
            return arrayList3;
        }

        public final List aYN(List list, Set expand) {
            Intrinsics.checkNotNullParameter(list, "<this>");
            Intrinsics.checkNotNullParameter(expand, "expand");
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                UserParameter userParameter = (UserParameter) it.next();
                if (UserParameterKt.isSection(userParameter)) {
                    arrayList.add(userParameter);
                    z2 = !expand.contains(userParameter.getName());
                } else {
                    if (userParameter instanceof UserParameter.Switch) {
                        UserParameter userParameter2 = (UserParameter) CollectionsKt.lastOrNull((List) arrayList);
                        if (userParameter2 instanceof UserParameter.StaticText) {
                            UserParameter.StaticText staticText = (UserParameter.StaticText) userParameter2;
                            if (staticText.getStyle() == StaticTextStyle.SECTION && Intrinsics.areEqual(staticText.getText(), ((UserParameter.Switch) userParameter).getLabel())) {
                                arrayList.add(userParameter);
                            }
                        }
                    }
                    if (!z2) {
                        arrayList.add(userParameter);
                    }
                }
            }
            return CollectionsKt.toList(arrayList);
        }

        public final oA.j az() {
            return this.rl;
        }

        public final Quaternion ck() {
            return this.xMQ;
        }

        public final void g(View view) {
            this.Uo = view;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f65185O.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i2) {
            UserParameter userParameter = (UserParameter) CollectionsKt.first((List) this.f65185O.get(i2));
            if (userParameter instanceof UserParameter.Switch) {
                return 2131558562;
            }
            if (userParameter instanceof UserParameter.Slider) {
                return 2131558558;
            }
            if (userParameter instanceof UserParameter.Spinner) {
                return 2131558559;
            }
            if (userParameter instanceof UserParameter.HueDisc) {
                return 2131558554;
            }
            if (userParameter instanceof UserParameter.HueRing) {
                throw new NotImplementedError(null, 1, null);
            }
            if (userParameter instanceof UserParameter.Color) {
                return 2131558553;
            }
            if (userParameter instanceof UserParameter.Selector) {
                return 2131558557;
            }
            if (userParameter instanceof UserParameter.Point) {
                return 2131558556;
            }
            if (userParameter instanceof UserParameter.Orientation) {
                return 2131558555;
            }
            if (userParameter instanceof UserParameter.XYZ) {
                return 2131558564;
            }
            if (!(userParameter instanceof UserParameter.StaticText)) {
                throw new UnsupportedOperationException();
            }
            int i3 = C0894n.$EnumSwitchMapping$0[((UserParameter.StaticText) userParameter).getStyle().ordinal()];
            if (i3 == 1) {
                return 2131558561;
            }
            if (i3 == 2) {
                return 2131558560;
            }
            throw new NoWhenBranchMatchedException();
        }

        public final void iF(int i2) {
            this.KN = i2;
        }

        public final void nY(Quaternion quaternion) {
            Intrinsics.checkNotNullParameter(quaternion, "<set-?>");
            this.xMQ = quaternion;
        }

        public final int o() {
            return this.KN;
        }

        public final VisualEffect qie() {
            return this.nr;
        }

        public final TextView r() {
            return this.J2;
        }

        public final void te(TextView textView) {
            this.J2 = textView;
        }

        public final KeyableVisualEffectRef ty() {
            return this.f65186n;
        }

        public final void WPU() {
            this.f65185O = Z();
            n nVar = this.mUb.adapter;
            if (nVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                nVar = null;
            }
            nVar.notifyDataSetChanged();
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    static final class nKK extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ SceneElement f65315O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f65316n;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(GJW.vd vdVar, Continuation continuation) {
            return ((nKK) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        nKK(SceneElement sceneElement, Continuation continuation) {
            super(2, continuation);
            this.f65315O = sceneElement;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ZJ.this.new nKK(this.f65315O, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f65316n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                InterfaceC2210n interfaceC2210nD = ZJ.this.d();
                Eu.I28 i28 = Eu.I28.f2377N;
                this.f65316n = 1;
                obj = Eu.Wre.n(interfaceC2210nD, i28, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            x0X.n nVar = (x0X.n) obj;
            SceneElement sceneElement = this.f65315O;
            if (!(nVar instanceof n.C1266n)) {
                if (nVar instanceof n.w6) {
                    if (((Boolean) ((n.w6) nVar).n()).booleanValue()) {
                        AbstractC2049kW.f65735n = SceneElementKt.getVisualEffectsInOrder(sceneElement);
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    public static final class rv6 extends ItemTouchHelper.SimpleCallback {
        private int J2;
        private int Uo;

        rv6() {
            super(3, 4);
            this.J2 = -1;
            this.Uo = -1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SceneElement T(int i2, Scene scene, SceneElement el) {
            Intrinsics.checkNotNullParameter(scene, "<unused var>");
            Intrinsics.checkNotNullParameter(el, "el");
            SceneElement sceneElementCopy$default = SceneElement.copy$default(el, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, MapsKt.minus(el.getVisualEffects(), el.getVisualEffectOrder().get(i2)), HI0.rv6.O(el.getVisualEffectOrder(), i2), null, null, null, null, null, null, false, null, null, false, null, null, -100663297, 127, null);
            AbstractC2049kW.mUb(sceneElementCopy$default, "swipeDelete", null, null, 6, null);
            return sceneElementCopy$default;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SceneElement X(rv6 rv6Var, Scene scene, SceneElement element) {
            Intrinsics.checkNotNullParameter(scene, "<unused var>");
            Intrinsics.checkNotNullParameter(element, "element");
            return SceneElement.copy$default(element, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, HI0.rv6.rl(element.getVisualEffectOrder(), rv6Var.J2, rv6Var.Uo), null, null, null, null, null, null, false, null, null, false, null, null, -67108865, 127, null);
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public boolean ViF(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
            Intrinsics.checkNotNullParameter(target, "target");
            SceneElement sceneElementNHg = HW.C.nHg(ZJ.this);
            if (sceneElementNHg == null) {
                return false;
            }
            if (this.J2 == -1) {
                this.J2 = viewHolder.getBindingAdapterPosition();
            }
            this.Uo = RangesKt.coerceAtMost(target.getBindingAdapterPosition(), CollectionsKt.getLastIndex(sceneElementNHg.getVisualEffectOrder()));
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            SF sf = adapter instanceof SF ? (SF) adapter : null;
            if (sf != null) {
                return sf.ViF(viewHolder.getBindingAdapterPosition(), target.getBindingAdapterPosition());
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.SimpleCallback, androidx.recyclerview.widget.ItemTouchHelper.Callback
        public int gh(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
            SF.j jVar = viewHolder instanceof SF.j ? (SF.j) viewHolder : null;
            if (jVar == null || jVar.getItemViewType() != 2131558545) {
                return super.gh(recyclerView, viewHolder);
            }
            return 0;
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public void t(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            int i2;
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
            SceneElement sceneElementNHg = HW.C.nHg(ZJ.this);
            if (sceneElementNHg != null && this.J2 != -1) {
                int size = sceneElementNHg.getVisualEffectOrder().size();
                int i3 = this.J2;
                if (i3 >= 0 && i3 < size && (i2 = this.Uo) != -1 && i3 != i2) {
                    HW.C.D(ZJ.this, new Function2() { // from class: f0P.G6
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ZJ.rv6.X(this.f64229n, (Scene) obj, (SceneElement) obj2);
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
            Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
            final int absoluteAdapterPosition = viewHolder.getAbsoluteAdapterPosition();
            if (absoluteAdapterPosition == -1) {
                RecyclerView.Adapter adapter = ZJ.this.q9().nr.getAdapter();
                if (adapter != null) {
                    adapter.notifyDataSetChanged();
                    return;
                }
                return;
            }
            RecyclerView.Adapter adapter2 = ZJ.this.q9().nr.getAdapter();
            SF sf = adapter2 instanceof SF ? (SF) adapter2 : null;
            if (sf != null) {
                sf.aYN(absoluteAdapterPosition);
            }
            HW.C.D(ZJ.this, new Function2() { // from class: f0P.zM
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ZJ.rv6.T(absoluteAdapterPosition, (Scene) obj, (SceneElement) obj2);
                }
            });
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    /* synthetic */ class vd extends FunctionReferenceImpl implements Function0 {
        vd(Object obj) {
            super(0, obj, ZJ.class, "onAddEffectClick", "onAddEffectClick()V", 0);
        }

        public final void n() {
            ((ZJ) this.receiver).fW();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            n();
            return Unit.INSTANCE;
        }
    }

    private final List WH(List effectTypes, Set layerAffinity) {
        List<KeyableVisualEffectRef> visualEffectsInOrder;
        SceneElement sceneElementNHg = HW.C.nHg(this);
        if (sceneElementNHg == null || (visualEffectsInOrder = SceneElementKt.getVisualEffectsInOrder(sceneElementNHg)) == null) {
            return CollectionsKt.emptyList();
        }
        List<VisualEffect> visualEffects = VisualEffectKt.getVisualEffects();
        String strIk = com.google.firebase.remoteconfig.j.az().Ik("effect_recommend_list");
        Intrinsics.checkNotNullExpressionValue(strIk, "getString(...)");
        List listSplit$default = StringsKt.split$default((CharSequence) StringsKt.trim((CharSequence) StringsKt.trimEnd(StringsKt.trimStart(strIk, '['), ']')).toString(), new char[]{',', ' '}, false, 0, 6, (Object) null);
        List arrayList = new ArrayList();
        Iterator it = listSplit$default.iterator();
        while (it.hasNext()) {
            String string = StringsKt.trim((CharSequence) StringsKt.trim((String) it.next(), Typography.quote)).toString();
            if (StringsKt.isBlank(string)) {
                string = null;
            }
            if (string != null) {
                arrayList.add(string);
            }
        }
        if (arrayList.isEmpty()) {
            arrayList = yc.DT.e();
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : visualEffects) {
            VisualEffect visualEffect = (VisualEffect) obj;
            if (arrayList.contains(visualEffect.getId())) {
                VisualEffect visualEffectVisualEffectById = VisualEffectKt.visualEffectById(visualEffect.getId());
                Intrinsics.checkNotNull(visualEffectVisualEffectById);
                if (effectTypes.contains(visualEffectVisualEffectById.getType()) && !visualEffect.getInternal() && !visualEffect.getDeprecated() && (!visualEffect.getExperimental() || com.alightcreative.app.motion.persist.j.INSTANCE.getExperimentalEffects())) {
                    arrayList2.add(obj);
                }
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            VisualEffect visualEffect2 = (VisualEffect) obj2;
            if (!visualEffectsInOrder.isEmpty()) {
                Iterator<T> it2 = visualEffectsInOrder.iterator();
                while (it2.hasNext()) {
                    if (Intrinsics.areEqual(((KeyableVisualEffectRef) it2.next()).getId(), visualEffect2.getId())) {
                        break;
                    }
                }
            }
            arrayList3.add(obj2);
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : arrayList3) {
            if (VisualEffectKt.affinityFor((VisualEffect) obj3, layerAffinity) > 0) {
                arrayList4.add(obj3);
            }
        }
        List mutableList = CollectionsKt.toMutableList((Collection) CollectionsKt.sortedWith(arrayList4, new Ml(layerAffinity)));
        if (mutableList.size() < 6) {
            CollectionsKt.addAll(mutableList, CollectionsKt.take(arrayList2, 6 - mutableList.size()));
        }
        List listTake = CollectionsKt.take(mutableList, 6);
        ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listTake, 10));
        Iterator it3 = listTake.iterator();
        while (it3.hasNext()) {
            arrayList5.add(((VisualEffect) it3.next()).getId());
        }
        return arrayList5;
    }

    private static final void t1J(ConstraintLayout constraintLayout, Rect rect, Rect rect2, View view, ZJ zj) {
        constraintLayout.setTranslationY(0.0f);
        ObjectAnimator duration = ObjectAnimator.ofObject(constraintLayout, "clipBounds", new RectEvaluator(new Rect()), rect, rect2).setDuration(200L);
        duration.addListener(zj.new Ew());
        duration.start();
        constraintLayout.animate().translationY((view.getY() - view.getPaddingTop()) - constraintLayout.getPaddingTop()).setDuration(200L).start();
        zj.settingEffectLens = null;
        zj.paramName = null;
        zj.W();
    }

    @Override // f0P.Ny
    protected boolean eF() {
        return true;
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    public /* synthetic */ class w6 {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[DataType.values().length];
            try {
                iArr[DataType.FLOAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DataType.INT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DataType.SOLID_COLOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DataType.VEC2.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DataType.VEC3.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DataType.VEC4.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DataType.QUAT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[DataType.BOOLEAN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[DataType.TEXTURE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[DataType.STRING.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[DataType.NONE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[SceneElementType.values().length];
            try {
                iArr2[SceneElementType.Shape.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[SceneElementType.Scene.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[SceneElementType.Drawing.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[SceneElementType.Text.ordinal()] = 4;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[SceneElementType.Camera.ordinal()] = 5;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[SceneElementType.NullObject.ordinal()] = 6;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[SceneElementType.Audio.ordinal()] = 7;
            } catch (NoSuchFieldError unused18) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void GH3(ZJ zj) {
        zj.guideDuration = EditActivity.Wre.f44459n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement GRh(int i2, Scene scene, SceneElement el) {
        Intrinsics.checkNotNullParameter(scene, "<unused var>");
        Intrinsics.checkNotNullParameter(el, "el");
        SceneElement sceneElementCopy$default = SceneElement.copy$default(el, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, MapsKt.plus(el.getVisualEffects(), TuplesKt.to(Long.valueOf(SceneElementKt.visualEffectAtPosition(el, i2).getInstanceId()), KeyableVisualEffectRef.copy$default(SceneElementKt.visualEffectAtPosition(el, i2), null, 0L, null, 0, !SceneElementKt.visualEffectAtPosition(el, i2).getHidden(), false, null, 111, null))), null, null, null, null, null, null, null, false, null, null, false, null, null, -33554433, 127, null);
        AbstractC2049kW.mUb(sceneElementCopy$default, "toggleVisible", null, null, 6, null);
        return sceneElementCopy$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement I4p(ZJ zj, VisualEffect visualEffect, EffectPreset effectPreset, Scene scene, SceneElement el) {
        Pair pair;
        Intrinsics.checkNotNullParameter(scene, "<unused var>");
        Intrinsics.checkNotNullParameter(el, "el");
        zj.jB().n(new j.psW(zj.rT(), visualEffect.getName(), kgE.Md.n().contains(visualEffect.getId()), rWZ.j.rl(el), effectPreset == null));
        Long l2 = (Long) CollectionsKt.maxOrNull((Iterable) el.getVisualEffects().keySet());
        long jMax = Math.max((l2 != null ? l2.longValue() : 0L) + 1, VisualEffectKt.nextEffectInstanceId());
        String id = visualEffect.getId();
        List<UserParameter> parameters = visualEffect.getParameters();
        ArrayList arrayList = new ArrayList();
        for (UserParameter userParameter : parameters) {
            if (UserParameterKt.getDefaultKeyableUserParameterValue(userParameter) == null) {
                pair = null;
            } else {
                String name = userParameter.getName();
                KeyableUserParameterValue defaultKeyableUserParameterValue = UserParameterKt.getDefaultKeyableUserParameterValue(userParameter);
                Intrinsics.checkNotNull(defaultKeyableUserParameterValue);
                pair = TuplesKt.to(name, defaultKeyableUserParameterValue);
            }
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        KeyableVisualEffectRef keyableVisualEffectRef = new KeyableVisualEffectRef(id, jMax, MapsKt.toMap(arrayList), 0, false, true, null, 88, null);
        SceneElement sceneElementCopy$default = SceneElement.copy$default(el, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, MapsKt.plus(el.getVisualEffects(), TuplesKt.to(Long.valueOf(jMax), effectPreset == null ? keyableVisualEffectRef : KeyableVisualEffectRef.copy$default(keyableVisualEffectRef, null, 0L, MapsKt.plus(keyableVisualEffectRef.getParameters(), VisualEffectKt.adjustForTiming(effectPreset.getProperties(), effectPreset.getTiming(), effectPreset.getTimescale(), el.getEndTime() - el.getStartTime())), 0, false, false, null, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE, null))), CollectionsKt.plus((Collection<? extends Long>) el.getVisualEffectOrder(), Long.valueOf(jMax)), null, null, null, null, null, null, false, null, null, false, null, null, -100663297, 127, null);
        AbstractC2049kW.mUb(sceneElementCopy$default, com.safedk.android.analytics.brandsafety.l.f62657l, null, null, 6, null);
        return sceneElementCopy$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement JI(oA.j jVar, oA.j jVar2, final ZJ zj, final Vector2D vector2D, final Scene scene, final SceneElement el) {
        Intrinsics.checkNotNullParameter(scene, "scene");
        Intrinsics.checkNotNullParameter(el, "el");
        DAz dAz = new PropertyReference1Impl() { // from class: f0P.ZJ.DAz
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Boolean.valueOf(((KeyableVisualEffectRef) obj).getLocallyApplied());
            }
        };
        return (SceneElement) jVar2.t((SceneElement) new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), dAz.getReturnType(), jVar, dAz).rl(el, Boolean.TRUE), new Function1() { // from class: f0P.xU
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ZJ.Of6(scene, el, zj, vector2D, (Keyable) obj);
            }
        });
    }

    private final oA.j Lu(UserParameter param) {
        oA.j jVar = this.settingEffectLens;
        if (jVar == null) {
            return null;
        }
        switch (w6.$EnumSwitchMapping$0[param.getDataType().ordinal()]) {
            case 1:
                fuX fux = new PropertyReference1Impl() { // from class: f0P.ZJ.fuX
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return ((KeyableVisualEffectRef) obj).getParameters();
                    }
                };
                oA.aC aCVar = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), fux.getReturnType(), jVar, fux);
                String name = param.getName();
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SceneElement.class);
                KType type = aCVar.nr().getArguments().get(0).getType();
                Intrinsics.checkNotNull(type);
                oA.Ml ml = new oA.Ml(orCreateKotlinClass, type, aCVar, name);
                Dsr dsr = new PropertyReference1Impl() { // from class: f0P.ZJ.Dsr
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return ((KeyableUserParameterValue) obj).getFloatValue();
                    }
                };
                return new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), dsr.getReturnType(), ml, dsr);
            case 2:
                return null;
            case 3:
                aC aCVar2 = new PropertyReference1Impl() { // from class: f0P.ZJ.aC
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return ((KeyableVisualEffectRef) obj).getParameters();
                    }
                };
                oA.aC aCVar3 = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), aCVar2.getReturnType(), jVar, aCVar2);
                String name2 = param.getName();
                KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(SceneElement.class);
                KType type2 = aCVar3.nr().getArguments().get(0).getType();
                Intrinsics.checkNotNull(type2);
                oA.Ml ml2 = new oA.Ml(orCreateKotlinClass2, type2, aCVar3, name2);
                C c2 = new PropertyReference1Impl() { // from class: f0P.ZJ.C
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return ((KeyableUserParameterValue) obj).getColorValue();
                    }
                };
                return new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), c2.getReturnType(), ml2, c2);
            case 4:
                o oVar = new PropertyReference1Impl() { // from class: f0P.ZJ.o
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return ((KeyableVisualEffectRef) obj).getParameters();
                    }
                };
                oA.aC aCVar4 = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), oVar.getReturnType(), jVar, oVar);
                String name3 = param.getName();
                KClass orCreateKotlinClass3 = Reflection.getOrCreateKotlinClass(SceneElement.class);
                KType type3 = aCVar4.nr().getArguments().get(0).getType();
                Intrinsics.checkNotNull(type3);
                oA.Ml ml3 = new oA.Ml(orCreateKotlinClass3, type3, aCVar4, name3);
                qz qzVar = new PropertyReference1Impl() { // from class: f0P.ZJ.qz
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return ((KeyableUserParameterValue) obj).getVec2DValue();
                    }
                };
                return new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), qzVar.getReturnType(), ml3, qzVar);
            case 5:
                Pl pl = new PropertyReference1Impl() { // from class: f0P.ZJ.Pl
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return ((KeyableVisualEffectRef) obj).getParameters();
                    }
                };
                oA.aC aCVar5 = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), pl.getReturnType(), jVar, pl);
                String name4 = param.getName();
                KClass orCreateKotlinClass4 = Reflection.getOrCreateKotlinClass(SceneElement.class);
                KType type4 = aCVar5.nr().getArguments().get(0).getType();
                Intrinsics.checkNotNull(type4);
                oA.Ml ml4 = new oA.Ml(orCreateKotlinClass4, type4, aCVar5, name4);
                Xo xo = new PropertyReference1Impl() { // from class: f0P.ZJ.Xo
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return ((KeyableUserParameterValue) obj).getVec3DValue();
                    }
                };
                return new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), xo.getReturnType(), ml4, xo);
            case 6:
                eO eOVar = new PropertyReference1Impl() { // from class: f0P.ZJ.eO
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return ((KeyableVisualEffectRef) obj).getParameters();
                    }
                };
                oA.aC aCVar6 = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), eOVar.getReturnType(), jVar, eOVar);
                String name5 = param.getName();
                KClass orCreateKotlinClass5 = Reflection.getOrCreateKotlinClass(SceneElement.class);
                KType type5 = aCVar6.nr().getArguments().get(0).getType();
                Intrinsics.checkNotNull(type5);
                oA.Ml ml5 = new oA.Ml(orCreateKotlinClass5, type5, aCVar6, name5);
                I28 i28 = new PropertyReference1Impl() { // from class: f0P.ZJ.I28
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return ((KeyableUserParameterValue) obj).getVec4DValue();
                    }
                };
                return new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), i28.getReturnType(), ml5, i28);
            case 7:
                Wre wre = new PropertyReference1Impl() { // from class: f0P.ZJ.Wre
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return ((KeyableVisualEffectRef) obj).getParameters();
                    }
                };
                oA.aC aCVar7 = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), wre.getReturnType(), jVar, wre);
                String name6 = param.getName();
                KClass orCreateKotlinClass6 = Reflection.getOrCreateKotlinClass(SceneElement.class);
                KType type6 = aCVar7.nr().getArguments().get(0).getType();
                Intrinsics.checkNotNull(type6);
                oA.Ml ml6 = new oA.Ml(orCreateKotlinClass6, type6, aCVar7, name6);
                CN3 cn3 = new PropertyReference1Impl() { // from class: f0P.ZJ.CN3
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return ((KeyableUserParameterValue) obj).getQuatValue();
                    }
                };
                return new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), cn3.getReturnType(), ml6, cn3);
            case 8:
            case 9:
            case 10:
            case 11:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MPw(ZJ zj, final List list) {
        HW.C.D(zj, new Function2() { // from class: f0P.dy
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ZJ.V5F(list, (Scene) obj, (SceneElement) obj2);
            }
        });
        zj.W();
        zj.s7N();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Keyable Of6(Scene scene, SceneElement sceneElement, ZJ zj, Vector2D vector2D, Keyable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return KeyableKt.copyWithValueForTime(it, scene, sceneElement, HW.C.aYN(zj), vector2D);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Keyable Qg8(Scene scene, SceneElement sceneElement, ZJ zj, Quaternion quaternion, Keyable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return KeyableKt.copyWithValueForTime(it, scene, sceneElement, HW.C.aYN(zj), quaternion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String Rc(int i2, Ref.IntRef intRef) {
        return "firstVisibleView firstPos=" + i2 + " scrollY=" + intRef.element;
    }

    private final void UR(SceneElement el) {
        Object next;
        oA.j jVar = this.settingEffectLens;
        if (jVar == null) {
            return;
        }
        KeyableVisualEffectRef keyableVisualEffectRef = (KeyableVisualEffectRef) jVar.O(el);
        n nVar = null;
        if (keyableVisualEffectRef == null) {
            if (this.settingEffectLens == null && this.paramName == null) {
                return;
            }
            q9().nr.setVisibility(0);
            q9().J2.setVisibility(4);
            this.settingEffectLens = null;
            this.paramName = null;
            W();
            return;
        }
        long instanceId = keyableVisualEffectRef.getInstanceId();
        Long l2 = this.adapterEffectId;
        if (l2 != null && instanceId == l2.longValue()) {
            n nVar2 = this.adapter;
            if (nVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                nVar2 = null;
            }
            nVar2.ViF(keyableVisualEffectRef);
            if (q9().Uo.isComputingLayout() || this.gestureInProgress) {
                return;
            }
            n nVar3 = this.adapter;
            if (nVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            } else {
                nVar = nVar3;
            }
            nVar.notifyDataSetChanged();
            return;
        }
        this.adapterEffectId = Long.valueOf(keyableVisualEffectRef.getInstanceId());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        VisualEffect visualEffectVisualEffectById = VisualEffectKt.visualEffectById(keyableVisualEffectRef.getId());
        if (visualEffectVisualEffectById == null) {
            return;
        }
        Iterator<T> it = visualEffectVisualEffectById.getParameters().iterator();
        while (true) {
            if (it.hasNext()) {
                next = it.next();
                if (UserParameterKt.isEditFirstHintedSection((UserParameter) next)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        UserParameter userParameter = (UserParameter) next;
        if (userParameter != null) {
            Map<String, KeyableUserParameterValue> parameters = keyableVisualEffectRef.getParameters();
            if (parameters.isEmpty()) {
                linkedHashSet.add(userParameter.getName());
            } else {
                for (Map.Entry<String, KeyableUserParameterValue> entry : parameters.entrySet()) {
                    KeyableUserParameterValue value = entry.getValue();
                    for (UserParameter userParameter2 : visualEffectVisualEffectById.getParameters()) {
                        if (Intrinsics.areEqual(userParameter2.getName(), entry.getKey())) {
                            if (!Intrinsics.areEqual(value, UserParameterKt.getDefaultKeyableUserParameterValue(userParameter2))) {
                                break;
                            }
                        }
                    }
                    throw new NoSuchElementException(JLZo.oxEU);
                }
                linkedHashSet.add(userParameter.getName());
            }
        }
        n nVar4 = new n(this, keyableVisualEffectRef, jVar, linkedHashSet);
        nVar4.setHasStableIds(true);
        this.adapter = nVar4;
        q9().Uo.setItemAnimator(new DefaultItemAnimator());
        RecyclerView recyclerView = q9().Uo;
        n nVar5 = this.adapter;
        if (nVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            nVar = nVar5;
        }
        recyclerView.setAdapter(nVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement V5F(List list, Scene scene, SceneElement el) {
        Intrinsics.checkNotNullParameter(scene, "<unused var>");
        Intrinsics.checkNotNullParameter(el, "el");
        Long l2 = (Long) CollectionsKt.maxOrNull((Iterable) el.getVisualEffects().keySet());
        long j2 = 1;
        long jMax = Math.max((l2 != null ? l2.longValue() : 0L) + 1, VisualEffectKt.nextEffectInstanceId());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (true) {
            long j3 = jMax;
            if (!it.hasNext()) {
                break;
            }
            jMax = j3 + j2;
            arrayList.add(TuplesKt.to(Long.valueOf(j3), KeyableVisualEffectRef.copy$default((KeyableVisualEffectRef) it.next(), null, j3, null, 0, false, false, null, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE, null)));
            j2 = 1;
        }
        Map mapPlus = MapsKt.plus(el.getVisualEffects(), arrayList);
        List<Long> visualEffectOrder = el.getVisualEffectOrder();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Long.valueOf(((Number) ((Pair) it2.next()).getFirst()).longValue()));
        }
        SceneElement sceneElementCopy$default = SceneElement.copy$default(el, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, mapPlus, CollectionsKt.plus((Collection) visualEffectOrder, (Iterable) arrayList2), null, null, null, null, null, null, false, null, null, false, null, null, -100663297, 127, null);
        AbstractC2049kW.mUb(sceneElementCopy$default, "pasteEffects", null, null, 6, null);
        return sceneElementCopy$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bZm(ZJ zj, ActivityResult it) {
        String stringExtra;
        EffectPreset effectPreset;
        Object next;
        List<EffectPreset> presets;
        Object obj;
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.getResultCode() == -1) {
            Intent data = it.getData();
            zj.showedTrialPopup = data != null ? data.getBooleanExtra("showedTrialPopup", false) : false;
            Intent data2 = it.getData();
            if (data2 == null || (stringExtra = data2.getStringExtra("addEffectId")) == null) {
                return;
            }
            List listSplit$default = StringsKt.split$default((CharSequence) (stringExtra + "/"), new String[]{"/"}, false, 0, 6, (Object) null);
            String str = (String) listSplit$default.get(0);
            String str2 = (String) listSplit$default.get(1);
            Iterator<T> it2 = VisualEffectKt.getVisualEffects().iterator();
            while (true) {
                effectPreset = null;
                obj = null;
                effectPreset = null;
                if (!it2.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it2.next();
                    if (Intrinsics.areEqual(((VisualEffect) next).getId(), str)) {
                        break;
                    }
                }
            }
            VisualEffect visualEffect = (VisualEffect) next;
            if (visualEffect != null && (presets = VisualEffectKt.getPresets(visualEffect)) != null) {
                Iterator<T> it3 = presets.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    Object next2 = it3.next();
                    if (Intrinsics.areEqual(((EffectPreset) next2).getId(), str2)) {
                        obj = next2;
                        break;
                    }
                }
                effectPreset = (EffectPreset) obj;
            }
            if (visualEffect != null) {
                zj.iV(visualEffect, effectPreset);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(SceneElement sceneElement, ComponentActivity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        AbstractC2049kW.f65735n = SceneElementKt.getVisualEffectsInOrder(sceneElement);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c32(ZJ zj, ComponentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        zj.lS(activity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement fq(long j2, int i2, VisualEffect visualEffect, Scene scene, SceneElement el) {
        Pair pair;
        Intrinsics.checkNotNullParameter(scene, "<unused var>");
        Intrinsics.checkNotNullParameter(el, "el");
        Map<Long, KeyableVisualEffectRef> visualEffects = el.getVisualEffects();
        Long lValueOf = Long.valueOf(j2);
        KeyableVisualEffectRef keyableVisualEffectRefVisualEffectAtPosition = SceneElementKt.visualEffectAtPosition(el, i2);
        List<UserParameter> parameters = visualEffect.getParameters();
        ArrayList arrayList = new ArrayList();
        for (UserParameter userParameter : parameters) {
            if (UserParameterKt.getDefaultKeyableUserParameterValue(userParameter) == null) {
                pair = null;
            } else {
                String name = userParameter.getName();
                KeyableUserParameterValue defaultKeyableUserParameterValue = UserParameterKt.getDefaultKeyableUserParameterValue(userParameter);
                Intrinsics.checkNotNull(defaultKeyableUserParameterValue);
                pair = TuplesKt.to(name, defaultKeyableUserParameterValue);
            }
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        SceneElement sceneElementCopy$default = SceneElement.copy$default(el, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, MapsKt.plus(visualEffects, TuplesKt.to(lValueOf, KeyableVisualEffectRef.copy$default(keyableVisualEffectRefVisualEffectAtPosition, null, 0L, MapsKt.toMap(arrayList), 0, false, false, null, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE, null))), null, null, null, null, null, null, null, false, null, null, false, null, null, -33554433, 127, null);
        AbstractC2049kW.mUb(sceneElementCopy$default, "resetToDefaults", Integer.valueOf(i2), null, 4, null);
        return sceneElementCopy$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement gxH(long j2, Scene scene, SceneElement el) {
        Intrinsics.checkNotNullParameter(scene, "<unused var>");
        Intrinsics.checkNotNullParameter(el, "el");
        SceneElement sceneElementCopy$default = SceneElement.copy$default(el, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, MapsKt.minus(el.getVisualEffects(), Long.valueOf(j2)), CollectionsKt.minus(el.getVisualEffectOrder(), Long.valueOf(j2)), null, null, null, null, null, null, false, null, null, false, null, null, -100663297, 127, null);
        AbstractC2049kW.mUb(sceneElementCopy$default, "deleteButton", null, Long.valueOf(j2), 2, null);
        return sceneElementCopy$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement iu(oA.j jVar, oA.j jVar2, final ZJ zj, final Quaternion quaternion, final Scene scene, final SceneElement el) {
        Intrinsics.checkNotNullParameter(scene, "scene");
        Intrinsics.checkNotNullParameter(el, "el");
        u uVar = new PropertyReference1Impl() { // from class: f0P.ZJ.u
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Boolean.valueOf(((KeyableVisualEffectRef) obj).getLocallyApplied());
            }
        };
        return (SceneElement) jVar2.t((SceneElement) new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), uVar.getReturnType(), jVar, uVar).rl(el, Boolean.TRUE), new Function1() { // from class: f0P.OSU
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ZJ.Qg8(scene, el, zj, quaternion, (Keyable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String jX(Quaternion quaternion, Quaternion quaternion2, Quaternion quaternion3) {
        return "OrientationDrag: curValue=" + quaternion + " newValue=" + quaternion2 + " orientation=" + quaternion3;
    }

    private final void lS(Activity activity) {
        SceneElement sceneElementT;
        List listListOf;
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        if (((AppCompatActivity) activity).getSupportFragmentManager().pJg("effectList") == null && (sceneElementT = HW.C.T(activity)) != null) {
            switch (w6.$EnumSwitchMapping$1[sceneElementT.getType().ordinal()]) {
                case 1:
                case 2:
                    listListOf = CollectionsKt.listOf(EffectType.SHADER);
                    break;
                case 3:
                    listListOf = CollectionsKt.listOf((Object[]) new EffectType[]{EffectType.DRAWING, EffectType.SHADER});
                    break;
                case 4:
                    listListOf = CollectionsKt.listOf((Object[]) new EffectType[]{EffectType.TEXT, EffectType.SHADER});
                    break;
                case 5:
                    listListOf = CollectionsKt.emptyList();
                    break;
                case 6:
                    listListOf = CollectionsKt.emptyList();
                    break;
                case 7:
                    throw new IllegalStateException();
                default:
                    throw new NoWhenBranchMatchedException();
            }
            List listWH = WH(listListOf, VisualEffectKt.getAffinityTypes(sceneElementT));
            Intent intent = new Intent(activity, (Class<?>) EffectBrowserActivity.class);
            intent.putExtra("showedTrialPopup", this.showedTrialPopup);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listListOf, 10));
            Iterator it = listListOf.iterator();
            while (it.hasNext()) {
                arrayList.add(((EffectType) it.next()).name());
            }
            intent.putExtra("effectTypes", (String[]) arrayList.toArray(new String[0]));
            intent.putExtra("recommendList", (String[]) listWH.toArray(new String[0]));
            intent.putExtra("projectId", rT());
            this.addEffectlauncher.n(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement n7u(int i2, KeyableVisualEffectRef keyableVisualEffectRef, Scene scene, SceneElement el) {
        Intrinsics.checkNotNullParameter(scene, "<unused var>");
        Intrinsics.checkNotNullParameter(el, "el");
        SceneElement sceneElementCopy$default = SceneElement.copy$default(el, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, MapsKt.plus(el.getVisualEffects(), TuplesKt.to(Long.valueOf(SceneElementKt.visualEffectAtPosition(el, i2).getInstanceId()), KeyableVisualEffectRef.copy$default(SceneElementKt.visualEffectAtPosition(el, i2), null, 0L, keyableVisualEffectRef.getParameters(), 0, false, false, null, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE, null))), null, null, null, null, null, null, null, false, null, null, false, null, null, -33554433, 127, null);
        AbstractC2049kW.mUb(sceneElementCopy$default, "pasteEffectSettings", Integer.valueOf(i2), null, 4, null);
        return sceneElementCopy$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SJ0.FPL q9() {
        return (SJ0.FPL) this.contentBinding.getValue();
    }

    private final boolean sFO(float dx, float dy, final Quaternion orientation, Quaternion invertedOrientation) {
        SceneElement sceneElementNHg;
        KeyableVisualEffectRef keyableVisualEffectRef;
        final oA.j jVar;
        VisualEffect visualEffectVisualEffectById;
        Object obj;
        Object next;
        Long l2 = this.adapterEffectId;
        if (l2 == null || (sceneElementNHg = HW.C.nHg(this)) == null || (keyableVisualEffectRef = sceneElementNHg.getVisualEffects().get(l2)) == null || (jVar = this.settingEffectLens) == null || (visualEffectVisualEffectById = VisualEffectKt.visualEffectById(keyableVisualEffectRef.getId())) == null) {
            return true;
        }
        Iterator<T> it = visualEffectVisualEffectById.getParameters().iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            UserParameter userParameter = (UserParameter) next;
            if (Intrinsics.areEqual(userParameter.getName(), this.paramName) && UserParameterKt.isDraggable(userParameter)) {
                break;
            }
        }
        UserParameter userParameter2 = (UserParameter) next;
        if (userParameter2 == null) {
            Iterator<T> it2 = visualEffectVisualEffectById.getParameters().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                if (UserParameterKt.isDraggable((UserParameter) next2)) {
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
            SceneHolder sceneHolderE = HW.C.e(this);
            if (sceneHolderE != null) {
                sceneHolderE.setEditMode(2131362614);
            }
            qf qfVar = new PropertyReference1Impl() { // from class: f0P.ZJ.qf
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public Object get(Object obj2) {
                    return ((KeyableVisualEffectRef) obj2).getParameters();
                }
            };
            oA.aC aCVar = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), qfVar.getReturnType(), jVar, qfVar);
            UserParameter.Point point = (UserParameter.Point) userParameter2;
            String name = point.getName();
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SceneElement.class);
            KType type = aCVar.nr().getArguments().get(0).getType();
            Intrinsics.checkNotNull(type);
            oA.Ml ml = new oA.Ml(orCreateKotlinClass, type, aCVar, name);
            Ln ln2 = new PropertyReference1Impl() { // from class: f0P.ZJ.Ln
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public Object get(Object obj2) {
                    return ((KeyableUserParameterValue) obj2).getVec2DValue();
                }
            };
            final oA.aC aCVar2 = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), ln2.getReturnType(), ml, ln2);
            final Vector2D vector2DCoerceIn = GeometryKt.coerceIn(GeometryKt.plus((Vector2D) KeyableKt.valueAtTime((Keyable) aCVar2.get(sceneElementNHg), SceneElementKt.fractionalTime(sceneElementNHg, HW.C.WPU(this))), GeometryKt.times(new Vector2D(dx, dy), point.getStep())), point.getMinOffset(), point.getMaxOffset());
            HW.C.D(this, new Function2() { // from class: f0P.td
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return ZJ.JI(jVar, aCVar2, this, vector2DCoerceIn, (Scene) obj2, (SceneElement) obj3);
                }
            });
        } else if (userParameter2 instanceof UserParameter.Orientation) {
            if (orientation.isNaN()) {
                return false;
            }
            lej lejVar = new PropertyReference1Impl() { // from class: f0P.ZJ.lej
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public Object get(Object obj2) {
                    return ((KeyableVisualEffectRef) obj2).getParameters();
                }
            };
            oA.aC aCVar3 = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), lejVar.getReturnType(), jVar, lejVar);
            UserParameter.Orientation orientation2 = (UserParameter.Orientation) userParameter2;
            String name2 = orientation2.getName();
            KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(SceneElement.class);
            KType type2 = aCVar3.nr().getArguments().get(0).getType();
            Intrinsics.checkNotNull(type2);
            oA.Ml ml2 = new oA.Ml(orCreateKotlinClass2, type2, aCVar3, name2);
            iwV iwv = new PropertyReference1Impl() { // from class: f0P.ZJ.iwV
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public Object get(Object obj2) {
                    return ((KeyableUserParameterValue) obj2).getQuatValue();
                }
            };
            final oA.aC aCVar4 = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), iwv.getReturnType(), ml2, iwv);
            final Quaternion quaternion = (Quaternion) KeyableKt.valueAtTime((Keyable) aCVar4.get(sceneElementNHg), SceneElementKt.fractionalTime(sceneElementNHg, HW.C.WPU(this)));
            final Quaternion quaternionNormalize = (orientation2.getInvert() ? invertedOrientation.times(quaternion) : orientation.times(quaternion)).normalize();
            XoT.C.Uo(this, new Function0() { // from class: f0P.vk
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ZJ.jX(quaternion, quaternionNormalize, orientation);
                }
            });
            HW.C.D(this, new Function2() { // from class: f0P.DG
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return ZJ.iu(jVar, aCVar4, this, quaternionNormalize, (Scene) obj2, (SceneElement) obj3);
                }
            });
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement wYi(int i2, Scene scene, SceneElement el) {
        Intrinsics.checkNotNullParameter(scene, "<unused var>");
        Intrinsics.checkNotNullParameter(el, "el");
        Long l2 = (Long) CollectionsKt.maxOrNull((Iterable) el.getVisualEffects().keySet());
        long jMax = Math.max((l2 != null ? l2.longValue() : 0L) + 1, VisualEffectKt.nextEffectInstanceId());
        SceneElement sceneElementCopy$default = SceneElement.copy$default(el, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, MapsKt.plus(el.getVisualEffects(), TuplesKt.to(Long.valueOf(jMax), KeyableVisualEffectRef.copy$default(SceneElementKt.visualEffectAtPosition(el, i2), null, jMax, null, 0, false, false, null, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE, null))), CollectionsKt.plus((Collection<? extends Long>) el.getVisualEffectOrder(), Long.valueOf(jMax)), null, null, null, null, null, null, false, null, null, false, null, null, -100663297, 127, null);
        AbstractC2049kW.mUb(sceneElementCopy$default, "duplicate", Integer.valueOf(i2), null, 4, null);
        return sceneElementCopy$default;
    }

    public final Q.fuX A() {
        Q.fuX fux = this.featureUnlockManager;
        if (fux != null) {
            return fux;
        }
        Intrinsics.throwUninitializedPropertyAccessException("featureUnlockManager");
        return null;
    }

    @Override // f0P.Ny
    protected void D(View view) {
        boolean z2;
        boolean z3;
        Intrinsics.checkNotNullParameter(view, "view");
        final SceneElement sceneElementNHg = HW.C.nHg(this);
        if (sceneElementNHg == null) {
            return;
        }
        final List listEmptyList = AbstractC2049kW.f65735n;
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        Collection<KeyableVisualEffectRef> collectionValues = sceneElementNHg.getVisualEffects().values();
        if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
            z2 = false;
        } else {
            Iterator<T> it = collectionValues.iterator();
            while (it.hasNext()) {
                if (kgE.Md.n().contains(((KeyableVisualEffectRef) it.next()).getId())) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
        }
        Collection<KeyableVisualEffectRef> collectionValues2 = sceneElementNHg.getVisualEffects().values();
        if ((collectionValues2 instanceof Collection) && collectionValues2.isEmpty()) {
            z3 = false;
        } else {
            Iterator<T> it2 = collectionValues2.iterator();
            while (it2.hasNext()) {
                if (!kgE.Md.n().contains(((KeyableVisualEffectRef) it2.next()).getId())) {
                    z3 = true;
                    break;
                }
            }
            z3 = false;
        }
        final Function0 function0 = new Function0() { // from class: f0P.KWv
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ZJ.YiW(this.f64426n, sceneElementNHg);
            }
        };
        com.alightcreative.widget.nKK nkk = new com.alightcreative.widget.nKK(activity, qva(), false, 4, null);
        Set setUo = qva().Uo();
        kgE.K k2 = kgE.K.f70072S;
        if (setUo.contains(k2)) {
            com.alightcreative.widget.nKK.HI(nkk, 2132017506, 0, false, null, new Function0() { // from class: f0P.RVT
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ZJ.Sax(sceneElementNHg);
                }
            }, 14, null);
        } else if (z2 && z3) {
            com.alightcreative.widget.nKK.S(nkk, SetsKt.setOf(k2), 2132017515, 0, new Function0() { // from class: f0P.q4d
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ZJ.kQ(function0);
                }
            }, 4, null);
            com.alightcreative.widget.nKK.HI(nkk, 2132017510, 0, false, null, new Function0() { // from class: f0P.OW
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ZJ.x(sceneElementNHg);
                }
            }, 14, null);
        } else if (z2) {
            com.alightcreative.widget.nKK.S(nkk, SetsKt.setOf(k2), 2132017506, 0, new Function0() { // from class: f0P.rXW
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ZJ.XUb(function0);
                }
            }, 4, null);
        } else {
            com.alightcreative.widget.nKK.HI(nkk, 2132017506, 0, false, null, new Function0() { // from class: f0P.BH
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ZJ.rR(sceneElementNHg);
                }
            }, 14, null);
        }
        if (sceneElementNHg.getVisualEffects().isEmpty()) {
            nkk.nY();
        }
        com.alightcreative.widget.nKK.HI(nkk, listEmptyList.size() == 1 ? 2132019830 : 2132019832, 0, false, null, new Function0() { // from class: f0P.NDx
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ZJ.MPw(this.f64505n, listEmptyList);
            }
        }, 14, null);
        if (listEmptyList.isEmpty()) {
            nkk.nY();
        }
        nkk.X(getResources().getDimensionPixelSize(2131166280));
        com.alightcreative.widget.nKK.N(nkk, view, 0, 0, null, 14, null);
    }

    @Override // f0P.Ny
    /* JADX INFO: renamed from: M7, reason: from getter */
    protected int getLayoutResource() {
        return this.layoutResource;
    }

    public final InterfaceC2210n d() {
        InterfaceC2210n interfaceC2210n = this.injet;
        if (interfaceC2210n != null) {
            return interfaceC2210n;
        }
        Intrinsics.throwUninitializedPropertyAccessException("injet");
        return null;
    }

    public final void iV(final VisualEffect effect, final EffectPreset preset) {
        String id;
        Map<Long, KeyableVisualEffectRef> visualEffects;
        Intrinsics.checkNotNullParameter(effect, "effect");
        if (getActivity() == null) {
            return;
        }
        XoT.C.nr("addEffect");
        QmE.iF iFVarJB = jB();
        Bundle bundle = new Bundle();
        bundle.putString("effect_id", effect.getId());
        bundle.putString("effect_name", effect.getName());
        if (preset == null || (id = preset.getId()) == null) {
            id = "default";
        }
        bundle.putString("preset_id", id);
        Unit unit = Unit.INSTANCE;
        iFVarJB.n(new j.fuX("add_effect", bundle));
        SceneElement sceneElementNHg = HW.C.nHg(this);
        boolean z2 = false;
        if (sceneElementNHg != null && (visualEffects = sceneElementNHg.getVisualEffects()) != null && visualEffects.isEmpty()) {
            z2 = true;
        }
        this.autoSelectEffect = z2;
        if (z2) {
            this.guideDuration = EditActivity.Wre.f44458O;
        }
        HW.C.D(this, new Function2() { // from class: f0P.Dq
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ZJ.I4p(this.f64154n, effect, preset, (Scene) obj, (SceneElement) obj2);
            }
        });
        s7N();
    }

    @Override // f0P.NO
    /* JADX INFO: renamed from: lLA */
    protected List getKeyableSettings() {
        String id;
        oA.j jVar = this.settingEffectLens;
        if (jVar == null) {
            return CollectionsKt.emptyList();
        }
        SceneElement sceneElementNHg = HW.C.nHg(this);
        if (sceneElementNHg == null) {
            return CollectionsKt.emptyList();
        }
        KeyableVisualEffectRef keyableVisualEffectRef = (KeyableVisualEffectRef) jVar.O(sceneElementNHg);
        if (keyableVisualEffectRef == null || (id = keyableVisualEffectRef.getId()) == null) {
            return CollectionsKt.emptyList();
        }
        VisualEffect visualEffectVisualEffectById = VisualEffectKt.visualEffectById(id);
        if (visualEffectVisualEffectById == null) {
            return CollectionsKt.emptyList();
        }
        List<UserParameter> parameters = visualEffectVisualEffectById.getParameters();
        ArrayList<UserParameter> arrayList = new ArrayList();
        for (Object obj : parameters) {
            if (Intrinsics.areEqual(((UserParameter) obj).getName(), this.paramName)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (UserParameter userParameter : arrayList) {
            F8 f8 = null;
            switch (w6.$EnumSwitchMapping$0[userParameter.getDataType().ordinal()]) {
                case 1:
                    AnimatorOf animatorOf = AnimatorOf.Float;
                    C2014c c2014c = new PropertyReference1Impl() { // from class: f0P.ZJ.c
                        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                        public Object get(Object obj2) {
                            return ((KeyableVisualEffectRef) obj2).getParameters();
                        }
                    };
                    oA.aC aCVar = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), c2014c.getReturnType(), jVar, c2014c);
                    String name = userParameter.getName();
                    KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SceneElement.class);
                    KType type = aCVar.nr().getArguments().get(0).getType();
                    Intrinsics.checkNotNull(type);
                    oA.Ml ml = new oA.Ml(orCreateKotlinClass, type, aCVar, name);
                    s4 s4Var = new PropertyReference1Impl() { // from class: f0P.ZJ.s4
                        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                        public Object get(Object obj2) {
                            return ((KeyableUserParameterValue) obj2).getFloatValue();
                        }
                    };
                    f8 = new F8(animatorOf, new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), s4Var.getReturnType(), ml, s4Var), null, 4, null);
                    break;
                case 2:
                case 8:
                case 9:
                case 10:
                case 11:
                    break;
                case 3:
                    AnimatorOf animatorOf2 = AnimatorOf.Color;
                    UGc uGc = new PropertyReference1Impl() { // from class: f0P.ZJ.UGc
                        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                        public Object get(Object obj2) {
                            return ((KeyableVisualEffectRef) obj2).getParameters();
                        }
                    };
                    oA.aC aCVar2 = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), uGc.getReturnType(), jVar, uGc);
                    String name2 = userParameter.getName();
                    KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(SceneElement.class);
                    KType type2 = aCVar2.nr().getArguments().get(0).getType();
                    Intrinsics.checkNotNull(type2);
                    oA.Ml ml2 = new oA.Ml(orCreateKotlinClass2, type2, aCVar2, name2);
                    Q q2 = new PropertyReference1Impl() { // from class: f0P.ZJ.Q
                        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                        public Object get(Object obj2) {
                            return ((KeyableUserParameterValue) obj2).getColorValue();
                        }
                    };
                    f8 = new F8(animatorOf2, new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), q2.getReturnType(), ml2, q2), null, 4, null);
                    break;
                case 4:
                    AnimatorOf animatorOf3 = AnimatorOf.Location;
                    r rVar = new PropertyReference1Impl() { // from class: f0P.ZJ.r
                        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                        public Object get(Object obj2) {
                            return ((KeyableVisualEffectRef) obj2).getParameters();
                        }
                    };
                    oA.aC aCVar3 = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), rVar.getReturnType(), jVar, rVar);
                    String name3 = userParameter.getName();
                    KClass orCreateKotlinClass3 = Reflection.getOrCreateKotlinClass(SceneElement.class);
                    KType type3 = aCVar3.nr().getArguments().get(0).getType();
                    Intrinsics.checkNotNull(type3);
                    oA.Ml ml3 = new oA.Ml(orCreateKotlinClass3, type3, aCVar3, name3);
                    SPz sPz = new PropertyReference1Impl() { // from class: f0P.ZJ.SPz
                        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                        public Object get(Object obj2) {
                            return ((KeyableUserParameterValue) obj2).getVec2DValue();
                        }
                    };
                    f8 = new F8(animatorOf3, new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), sPz.getReturnType(), ml3, sPz), null, 4, null);
                    break;
                case 5:
                    AnimatorOf animatorOf4 = AnimatorOf.Location;
                    ci ciVar = new PropertyReference1Impl() { // from class: f0P.ZJ.ci
                        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                        public Object get(Object obj2) {
                            return ((KeyableVisualEffectRef) obj2).getParameters();
                        }
                    };
                    oA.aC aCVar4 = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), ciVar.getReturnType(), jVar, ciVar);
                    String name4 = userParameter.getName();
                    KClass orCreateKotlinClass4 = Reflection.getOrCreateKotlinClass(SceneElement.class);
                    KType type4 = aCVar4.nr().getArguments().get(0).getType();
                    Intrinsics.checkNotNull(type4);
                    oA.Ml ml4 = new oA.Ml(orCreateKotlinClass4, type4, aCVar4, name4);
                    g9s g9sVar = new PropertyReference1Impl() { // from class: f0P.ZJ.g9s
                        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                        public Object get(Object obj2) {
                            return ((KeyableUserParameterValue) obj2).getVec3DValue();
                        }
                    };
                    f8 = new F8(animatorOf4, new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), g9sVar.getReturnType(), ml4, g9sVar), null, 4, null);
                    break;
                case 6:
                    AnimatorOf animatorOf5 = AnimatorOf.Location;
                    afx afxVar = new PropertyReference1Impl() { // from class: f0P.ZJ.afx
                        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                        public Object get(Object obj2) {
                            return ((KeyableVisualEffectRef) obj2).getParameters();
                        }
                    };
                    oA.aC aCVar5 = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), afxVar.getReturnType(), jVar, afxVar);
                    String name5 = userParameter.getName();
                    KClass orCreateKotlinClass5 = Reflection.getOrCreateKotlinClass(SceneElement.class);
                    KType type5 = aCVar5.nr().getArguments().get(0).getType();
                    Intrinsics.checkNotNull(type5);
                    oA.Ml ml5 = new oA.Ml(orCreateKotlinClass5, type5, aCVar5, name5);
                    C2020z c2020z = new PropertyReference1Impl() { // from class: f0P.ZJ.z
                        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                        public Object get(Object obj2) {
                            return ((KeyableUserParameterValue) obj2).getVec4DValue();
                        }
                    };
                    f8 = new F8(animatorOf5, new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), c2020z.getReturnType(), ml5, c2020z), null, 4, null);
                    break;
                case 7:
                    AnimatorOf animatorOf6 = AnimatorOf.Orientation;
                    QJ qj = new PropertyReference1Impl() { // from class: f0P.ZJ.QJ
                        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                        public Object get(Object obj2) {
                            return ((KeyableVisualEffectRef) obj2).getParameters();
                        }
                    };
                    oA.aC aCVar6 = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), qj.getReturnType(), jVar, qj);
                    String name6 = userParameter.getName();
                    KClass orCreateKotlinClass6 = Reflection.getOrCreateKotlinClass(SceneElement.class);
                    KType type6 = aCVar6.nr().getArguments().get(0).getType();
                    Intrinsics.checkNotNull(type6);
                    oA.Ml ml6 = new oA.Ml(orCreateKotlinClass6, type6, aCVar6, name6);
                    l3D l3d = new PropertyReference1Impl() { // from class: f0P.ZJ.l3D
                        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                        public Object get(Object obj2) {
                            return ((KeyableUserParameterValue) obj2).getQuatValue();
                        }
                    };
                    f8 = new F8(animatorOf6, new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), l3d.getReturnType(), ml6, l3d), null, 4, null);
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            if (f8 != null) {
                arrayList2.add(f8);
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00e5  */
    @Override // yc.Buf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean n(yc.a motionEvent) {
        Long l2;
        SceneElement sceneElementNHg;
        KeyableVisualEffectRef keyableVisualEffectRef;
        VisualEffect visualEffectVisualEffectById;
        Object next;
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        if (HW.C.iF(this) == null || (l2 = this.adapterEffectId) == null || (sceneElementNHg = HW.C.nHg(this)) == null || (keyableVisualEffectRef = sceneElementNHg.getVisualEffects().get(l2)) == null || (visualEffectVisualEffectById = VisualEffectKt.visualEffectById(keyableVisualEffectRef.getId())) == null) {
            return false;
        }
        Iterator<T> it = visualEffectVisualEffectById.getParameters().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            UserParameter userParameter = (UserParameter) next;
            if (Intrinsics.areEqual(userParameter.getName(), this.paramName) && UserParameterKt.isDraggable(userParameter)) {
                break;
            }
        }
        UserParameter userParameter2 = (UserParameter) next;
        if (userParameter2 == null || !UserParameterKt.isDraggable(userParameter2)) {
            return false;
        }
        Vector2D vector2DRl = motionEvent.rl();
        Vector2D vector2DMinus = GeometryKt.minus(GeometryKt.times(new Vector2D(vector2DRl.getX() / r0.getWidth(), (r0.getHeight() - vector2DRl.getY()) / r0.getHeight()), 2.0f), 1.0f);
        int actionMasked = motionEvent.n().getActionMasked();
        if (actionMasked == 0) {
            this.undoBatch = HW.C.xMQ(this);
            this.prevX = motionEvent.n().getRawX();
            this.prevY = motionEvent.n().getRawY();
            this.prevV = vector2DMinus;
        } else if (actionMasked == 1) {
            SceneHolder sceneHolderE = HW.C.e(this);
            if (sceneHolderE != null) {
                sceneHolderE.setEditMode(0);
            }
            this.undoBatch.n();
            this.undoBatch = LdY.Ml.Ik.n();
        } else {
            if (actionMasked == 2) {
                float rawX = motionEvent.n().getRawX() - this.prevX;
                float rawY = motionEvent.n().getRawY() - this.prevY;
                Quaternion quaternionTrackball_3d = TrackballKt.trackball_3d(vector2DMinus, this.prevV);
                Quaternion quaternionTrackball_3d2 = TrackballKt.trackball_3d(this.prevV, vector2DMinus);
                this.prevX = motionEvent.n().getRawX();
                this.prevY = motionEvent.n().getRawY();
                this.prevV = vector2DMinus;
                return sFO(rawX, rawY, quaternionTrackball_3d, quaternionTrackball_3d2);
            }
            if (actionMasked == 3) {
            }
        }
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 100) {
            HW.C.v(this, resultCode, data, false, 4, null);
        } else {
            super.onActivityResult(requestCode, resultCode, data);
        }
    }

    @Override // com.alightcreative.app.motion.activities.edit.fragments.j, f0P.sK, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        jB().n(new j.fuX("edit_effects", null, 2, null));
    }

    @Override // f0P.Ny, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(new rv6());
        UF(new M(this));
        itemTouchHelper.az(q9().nr);
        nr();
    }

    public final nYs.Ml oz() {
        nYs.Ml ml = this.getAlightSettingsUseCase;
        if (ml != null) {
            return ml;
        }
        Intrinsics.throwUninitializedPropertyAccessException("getAlightSettingsUseCase");
        return null;
    }

    @Override // f0P.Ny
    protected void piY(SceneElement el) {
        View viewJB;
        Intrinsics.checkNotNullParameter(el, "el");
        AbstractC2049kW.mUb(el, "refresh", null, null, 6, null);
        RecyclerView.LayoutManager layoutManager = q9().nr.getLayoutManager();
        Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        final int iLu = linearLayoutManager.Lu();
        final Ref.IntRef intRef = new Ref.IntRef();
        if (iLu != -1 && (viewJB = linearLayoutManager.jB(iLu)) != null) {
            int top = viewJB.getTop();
            ViewGroup.LayoutParams layoutParams = viewJB.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            intRef.element = top - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            XoT.C.Uo(this, new Function0() { // from class: f0P.wE9
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ZJ.Rc(iLu, intRef);
                }
            });
        }
        q9().nr.setAdapter(new SF(el, new vd(this), new Lu(this), new h(this), this.autoSelectEffect, A(), qva()));
        if (iLu != -1) {
            linearLayoutManager.rR(iLu, intRef.element);
        }
        UR(el);
    }

    public final kgE.fuX qva() {
        kgE.fuX fux = this.iapManager;
        if (fux != null) {
            return fux;
        }
        Intrinsics.throwUninitializedPropertyAccessException("iapManager");
        return null;
    }

    public ZJ() {
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: f0P.tq
            @Override // androidx.view.result.ActivityResultCallback
            public final void n(Object obj) {
                ZJ.bZm(this.f66237n, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.addEffectlauncher = activityResultLauncherRegisterForActivityResult;
        this.prevV = Vector2D.INSTANCE.getZERO();
        this.undoBatch = LdY.Ml.Ik.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C7B(ZJ zj, final int i2, ConstraintLayout constraintLayout, Rect rect, Rect rect2, View view) {
        zj.W();
        HW.C.D(zj, new Function2() { // from class: f0P.Ir
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ZJ.wYi(i2, (Scene) obj, (SceneElement) obj2);
            }
        });
        t1J(constraintLayout, rect, rect2, view, zj);
        zj.s7N();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SJ0.FPL Co(ZJ zj) {
        SJ0.FPL fplN = SJ0.FPL.n(zj.hRu().getChildAt(0));
        Intrinsics.checkNotNullExpressionValue(fplN, "bind(...)");
        return fplN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void HE() {
        if (q9().Uo.getAdapter() instanceof n) {
            RecyclerView.Adapter adapter = q9().Uo.getAdapter();
            Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.alightcreative.app.motion.activities.edit.fragments.EffectsFragment.EffectSettingsAdapter");
            int iO = ((n) adapter).o();
            if (iO != -1) {
                q9().Uo.smoothScrollToPosition(iO);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void HFS(final ZJ zj, final long j2, FragmentActivity fragmentActivity, final VisualEffect visualEffect, final ConstraintLayout constraintLayout, final Rect rect, final Rect rect2, final View view, View view2) {
        final int iIndexOf;
        final SceneElement sceneElementNHg = HW.C.nHg(zj);
        if (sceneElementNHg == null || (iIndexOf = sceneElementNHg.getVisualEffectOrder().indexOf(Long.valueOf(j2))) < 0) {
            return;
        }
        com.alightcreative.widget.nKK nkk = new com.alightcreative.widget.nKK(fragmentActivity, zj.qva(), false, 4, null);
        com.alightcreative.widget.nKK.HI(nkk, 2132017844, 0, false, null, new Function0() { // from class: f0P.G3H
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ZJ.eb(this.f64227n, sceneElementNHg, iIndexOf);
            }
        }, 14, null);
        com.alightcreative.widget.nKK.HI(nkk, 2132020045, 0, false, null, new Function0() { // from class: f0P.OG
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ZJ.Xli(this.f64544n, j2, iIndexOf, visualEffect);
            }
        }, 14, null);
        com.alightcreative.widget.nKK.HI(nkk, 2132017711, 0, false, null, new Function0() { // from class: f0P.OI
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ZJ.C7B(this.f64550n, iIndexOf, constraintLayout, rect, rect2, view);
            }
        }, 14, null);
        com.alightcreative.widget.nKK.HI(nkk, 2132017509, 0, false, null, new Function0() { // from class: f0P.tr
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ZJ.TVk(this.f66238n, iIndexOf);
            }
        }, 14, null);
        List list = AbstractC2049kW.f65735n;
        final KeyableVisualEffectRef keyableVisualEffectRef = null;
        Object obj = null;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (Intrinsics.areEqual(((KeyableVisualEffectRef) next).getId(), visualEffect.getId())) {
                    obj = next;
                    break;
                }
            }
            keyableVisualEffectRef = (KeyableVisualEffectRef) obj;
        }
        if (keyableVisualEffectRef != null) {
            com.alightcreative.widget.nKK.HI(nkk, 2132019831, 0, false, null, new Function0() { // from class: f0P.eG
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ZJ.lRt(this.f65512n, iIndexOf, keyableVisualEffectRef);
                }
            }, 14, null);
        }
        nkk.X(zj.getResources().getDimensionPixelSize(2131166280));
        ImageButton buttonFxOverflow = zj.q9().f9133t;
        Intrinsics.checkNotNullExpressionValue(buttonFxOverflow, "buttonFxOverflow");
        com.alightcreative.widget.nKK.N(nkk, buttonFxOverflow, 0, 0, null, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Keyable L(UserParameter param) {
        oA.j jVarLu;
        SceneElement sceneElementNHg = HW.C.nHg(this);
        if (sceneElementNHg == null || (jVarLu = Lu(param)) == null) {
            return null;
        }
        return (Keyable) jVarLu.O(sceneElementNHg);
    }

    private final void Om(final View listEntryView, int position) {
        final FragmentActivity activity;
        View view = getView();
        if (view != null && (activity = getActivity()) != null) {
            this.autoSelectEffect = false;
            listEntryView.postDelayed(new Runnable() { // from class: f0P.vr
                @Override // java.lang.Runnable
                public final void run() {
                    ZJ.GH3(this.f66277n);
                }
            }, 5L);
            SceneElement sceneElementNHg = HW.C.nHg(this);
            if (sceneElementNHg != null) {
                AbstractC2049kW.mUb(sceneElementNHg, "settingsClick", Integer.valueOf(position), null, 4, null);
                final long instanceId = SceneElementKt.visualEffectAtPosition(sceneElementNHg, position).getInstanceId();
                Z z2 = new PropertyReference1Impl() { // from class: f0P.ZJ.Z
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                    public Object get(Object obj) {
                        return ((SceneElement) obj).getVisualEffects();
                    }
                };
                oA.n nVar = new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), z2.getReturnType(), z2);
                Long lValueOf = Long.valueOf(instanceId);
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SceneElement.class);
                KType type = nVar.nr().getArguments().get(0).getType();
                Intrinsics.checkNotNull(type);
                this.settingEffectLens = new oA.Ml(orCreateKotlinClass, type, nVar, lValueOf);
                this.paramName = null;
                final VisualEffect visualEffectVisualEffectById = VisualEffectKt.visualEffectById(SceneElementKt.visualEffectAtPosition(sceneElementNHg, position).getId());
                if (visualEffectVisualEffectById == null) {
                    return;
                }
                UR(sceneElementNHg);
                W();
                q9().nr.setVisibility(4);
                q9().J2.setVisibility(0);
                final ConstraintLayout effectSettingsHolder = q9().J2;
                Intrinsics.checkNotNullExpressionValue(effectSettingsHolder, "effectSettingsHolder");
                final Rect rect = new Rect(0, 0, effectSettingsHolder.getWidth(), listEntryView.getHeight());
                final Rect rect2 = new Rect(0, 0, effectSettingsHolder.getWidth(), effectSettingsHolder.getHeight());
                effectSettingsHolder.setTranslationY((listEntryView.getY() - listEntryView.getPaddingTop()) - effectSettingsHolder.getPaddingTop());
                ObjectAnimator.ofObject(effectSettingsHolder, "clipBounds", new RectEvaluator(new Rect()), rect, rect2).setDuration(200L).start();
                effectSettingsHolder.animate().translationY(0.0f).setDuration(200L).start();
                TextView textView = q9().KN;
                Iy.n localizedStrings = visualEffectVisualEffectById.getLocalizedStrings();
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                textView.setText(Iy.w6.n(localizedStrings, context, visualEffectVisualEffectById.getName()));
                q9().f9131O.setOnClickListener(new View.OnClickListener() { // from class: f0P.xJ
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        ZJ.w(effectSettingsHolder, rect2, rect, listEntryView, this, view2);
                    }
                });
                q9().f9133t.setOnClickListener(new View.OnClickListener() { // from class: f0P.U8A
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        ZJ.HFS(this.f64762n, instanceId, activity, visualEffectVisualEffectById, effectSettingsHolder, rect2, rect, listEntryView, view2);
                    }
                });
                q9().rl.setOnClickListener(new View.OnClickListener() { // from class: f0P.Ze9
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        ZJ.yA(this.f65334n, instanceId, view2);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Sax(SceneElement sceneElement) {
        AbstractC2049kW.f65735n = SceneElementKt.getVisualEffectsInOrder(sceneElement);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TVk(ZJ zj, int i2) {
        SceneElement sceneElementNHg = HW.C.nHg(zj);
        if (sceneElementNHg != null) {
            AbstractC2049kW.f65735n = CollectionsKt.listOf(SceneElementKt.visualEffectAtPosition(sceneElementNHg, i2));
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit XUb(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Xli(ZJ zj, final long j2, final int i2, final VisualEffect visualEffect) {
        zj.W();
        HW.C.D(zj, new Function2() { // from class: f0P.T2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ZJ.fq(j2, i2, visualEffect, (Scene) obj, (SceneElement) obj2);
            }
        });
        zj.s7N();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object YiW(ZJ zj, final SceneElement sceneElement) {
        nYs.j jVarInvoke = zj.oz().invoke();
        if (jVarInvoke != null && jVarInvoke.Xw()) {
            return GJW.C.nr(LifecycleOwnerKt.n(zj), null, null, zj.new nKK(sceneElement, null), 3, null);
        }
        zj.bzg().r(xAo.QJ.f75266n, new Function1() { // from class: f0P.YUN
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ZJ.c(sceneElement, (ComponentActivity) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit eb(ZJ zj, SceneElement sceneElement, int i2) {
        if (zj.isAdded()) {
            FragmentManager parentFragmentManager = zj.getParentFragmentManager();
            Intrinsics.checkNotNull(parentFragmentManager);
            FragmentTransaction fragmentTransactionO = parentFragmentManager.o();
            Intrinsics.checkNotNullExpressionValue(fragmentTransactionO, "beginTransaction(...)");
            Fragment fragmentPJg = parentFragmentManager.pJg("EffectDetail");
            if (fragmentPJg != null) {
                fragmentTransactionO.r(fragmentPJg);
            }
            fragmentTransactionO.KN(null);
            fragmentTransactionO.rl(R.id.content, Y.M.INSTANCE.n(SceneElementKt.visualEffectAtPosition(sceneElement, i2).getId(), 0, 0, "", true)).KN("EffectDetail").mUb();
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fW() {
        jB().n(new j.DT(rT()));
        bzg().r(C2423z.f75313n, new Function1() { // from class: f0P.brv
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ZJ.c32(this.f65397n, (ComponentActivity) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit kQ(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l2(View listEntryView, int position) {
        Om(listEntryView, position);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lRt(ZJ zj, final int i2, final KeyableVisualEffectRef keyableVisualEffectRef) {
        zj.W();
        HW.C.D(zj, new Function2() { // from class: f0P.r6f
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ZJ.n7u(i2, keyableVisualEffectRef, (Scene) obj, (SceneElement) obj2);
            }
        });
        zj.s7N();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit rR(SceneElement sceneElement) {
        List<KeyableVisualEffectRef> visualEffectsInOrder = SceneElementKt.getVisualEffectsInOrder(sceneElement);
        ArrayList arrayList = new ArrayList();
        for (Object obj : visualEffectsInOrder) {
            if (!kgE.Md.n().contains(((KeyableVisualEffectRef) obj).getId())) {
                arrayList.add(obj);
            }
        }
        AbstractC2049kW.f65735n = arrayList;
        return Unit.INSTANCE;
    }

    private final String rT() {
        String string;
        Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("projectId")) != null) {
            return string;
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void tdZ(final int position) {
        if (HW.C.nHg(this) == null) {
            return;
        }
        jB().n(new j.fuX("effect_visibility", null, 2, null));
        HW.C.D(this, new Function2() { // from class: f0P.Kq
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ZJ.GRh(position, (Scene) obj, (SceneElement) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(ConstraintLayout constraintLayout, Rect rect, Rect rect2, View view, ZJ zj, View view2) {
        t1J(constraintLayout, rect, rect2, view, zj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x(SceneElement sceneElement) {
        List<KeyableVisualEffectRef> visualEffectsInOrder = SceneElementKt.getVisualEffectsInOrder(sceneElement);
        ArrayList arrayList = new ArrayList();
        for (Object obj : visualEffectsInOrder) {
            if (!kgE.Md.n().contains(((KeyableVisualEffectRef) obj).getId())) {
                arrayList.add(obj);
            }
        }
        AbstractC2049kW.f65735n = arrayList;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void yA(ZJ zj, final long j2, View view) {
        zj.q9().nr.setVisibility(0);
        zj.q9().J2.setVisibility(4);
        zj.settingEffectLens = null;
        zj.paramName = null;
        zj.W();
        HW.C.D(zj, new Function2() { // from class: f0P.QrA
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ZJ.gxH(j2, (Scene) obj, (SceneElement) obj2);
            }
        });
        zj.s7N();
    }

    @Override // f0P.NO
    protected boolean tUK() {
        return getKeyableSettings().isEmpty();
    }
}
