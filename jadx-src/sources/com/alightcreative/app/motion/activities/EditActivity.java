package com.alightcreative.app.motion.activities;

import CHm.j;
import GK.j;
import IG.aC;
import IG.n;
import LdY.Ml;
import QmE.j;
import SJ0.C1462o;
import UO6.qf;
import Vil.I28;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.RectEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.database.sqlite.cL.PtsLKY;
import androidx.core.graphics.Insets;
import androidx.core.os.BundleKt;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentOnAttachListener;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentTransaction;
import androidx.media3.common.MimeTypes;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import androidx.view.ComponentActivity;
import androidx.view.LifecycleOwnerKt;
import androidx.view.ViewModelLazy;
import androidx.view.ViewModelProvider;
import androidx.view.ViewModelStore;
import androidx.view.result.ActivityResult;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultCaller;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.contract.ActivityResultContracts;
import androidx.view.viewmodel.CreationExtras;
import androidx.viewpager.widget.ViewPager;
import com.airbnb.lottie.LottieAnimationView;
import com.alightcreative.app.motion.activities.EditActivity;
import com.alightcreative.app.motion.activities.edit.NoScrollGridLayoutManager;
import com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager;
import com.alightcreative.app.motion.activities.mediabrowser.AddVisualMediaInfo;
import com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser;
import com.alightcreative.app.motion.fonts.AMTypefaceError;
import com.alightcreative.app.motion.persist.j;
import com.alightcreative.app.motion.project.ProjectInfo;
import com.alightcreative.app.motion.scene.BitmapLruCache;
import com.alightcreative.app.motion.scene.CameraProperties;
import com.alightcreative.app.motion.scene.CubicBSplineKt;
import com.alightcreative.app.motion.scene.EditCategory;
import com.alightcreative.app.motion.scene.ElementGroupingKt;
import com.alightcreative.app.motion.scene.ExportParams;
import com.alightcreative.app.motion.scene.GeometryKt;
import com.alightcreative.app.motion.scene.Keyable;
import com.alightcreative.app.motion.scene.KeyableCubicBSpline;
import com.alightcreative.app.motion.scene.KeyableFloat;
import com.alightcreative.app.motion.scene.KeyableKt;
import com.alightcreative.app.motion.scene.KeyableTransform;
import com.alightcreative.app.motion.scene.Keyframe;
import com.alightcreative.app.motion.scene.LayerParentingKt;
import com.alightcreative.app.motion.scene.Scene;
import com.alightcreative.app.motion.scene.SceneBookmark;
import com.alightcreative.app.motion.scene.SceneElement;
import com.alightcreative.app.motion.scene.SceneElementKt;
import com.alightcreative.app.motion.scene.SceneElementType;
import com.alightcreative.app.motion.scene.SceneExporterKt;
import com.alightcreative.app.motion.scene.SceneHolder;
import com.alightcreative.app.motion.scene.SceneHolderState;
import com.alightcreative.app.motion.scene.SceneKt;
import com.alightcreative.app.motion.scene.SceneOverlayKt;
import com.alightcreative.app.motion.scene.SceneSelection;
import com.alightcreative.app.motion.scene.SceneThumbnailMaker;
import com.alightcreative.app.motion.scene.SceneType;
import com.alightcreative.app.motion.scene.TimeKt;
import com.alightcreative.app.motion.scene.Transform;
import com.alightcreative.app.motion.scene.TransformKt;
import com.alightcreative.app.motion.scene.Vector2D;
import com.alightcreative.app.motion.scene.VideoEncoding;
import com.alightcreative.app.motion.scene.liveshape.LiveShape;
import com.alightcreative.app.motion.scene.liveshape.LiveShapeKt;
import com.alightcreative.app.motion.scene.liveshape.LiveShapeScriptKt;
import com.alightcreative.app.motion.scene.serializer.SceneSerializerKt;
import com.alightcreative.app.motion.scene.visualeffect.KeyableVisualEffectRef;
import com.alightcreative.maineditor.presetpreview.ui.PresetPreviewActivity;
import com.alightcreative.monorepo.settings.ExportedVideoAttachment;
import com.alightcreative.template.importpreview.ui.TemplateImportPreviewActivity;
import com.alightcreative.widget.AudioThumbnailView;
import com.alightcreative.widget.RecyclerViewEx;
import com.alightcreative.widget.SettingEditText;
import com.bendingspoons.spidersense.data.storageManager.internal.CV.jhotmBbwMbr;
import com.caoccao.javet.exceptions.JavetError;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import com.safedk.android.internal.SafeDKWebAppInterface;
import com.safedk.android.utils.Logger;
import com.vungle.ads.internal.protos.Sdk;
import f0P.iP;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kP.InterfaceC2210n;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KFunction;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import l.AbstractC2254j;
import l.Xo;
import org.json.JSONException;
import x0X.n;
import xhQ.Xo;
import xr.j;
import y.AbstractC2431fuX;
import yc.AbstractC2461t;
import yc.C2445Dt;
import yc.InterfaceC2452g;
import yc.Qik;
import zRY.g9s;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000¾\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u009d\u00052\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n:\f\u009e\u0005\u0084\u0005\u009f\u0005 \u0005¡\u0005¢\u0005B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0018¢\u0006\u0004\b\u001e\u0010\fJ\u0019\u0010!\u001a\u00020\u00182\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0015¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u00182\u0006\u0010$\u001a\u00020#H\u0014¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\u00182\u0006\u0010*\u001a\u00020'H\u0016¢\u0006\u0004\b+\u0010,J\u001d\u00100\u001a\u00020\u00182\u0006\u0010-\u001a\u00020'2\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b0\u00101J)\u00106\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u00103*\u0002022\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u000004H\u0016¢\u0006\u0004\b6\u00107J\r\u00108\u001a\u00020\u0018¢\u0006\u0004\b8\u0010\fJ\r\u00109\u001a\u00020\u0018¢\u0006\u0004\b9\u0010\fJ\u000f\u0010:\u001a\u00020\u0018H\u0016¢\u0006\u0004\b:\u0010\fJ\u0017\u0010=\u001a\u00020\u00182\b\b\u0002\u0010<\u001a\u00020;¢\u0006\u0004\b=\u0010>J\u0019\u0010A\u001a\u00020;2\b\u0010@\u001a\u0004\u0018\u00010?H\u0016¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020\u0018H\u0016¢\u0006\u0004\bC\u0010\fJ\u0017\u0010F\u001a\u00020\u00182\u0006\u0010E\u001a\u00020DH\u0016¢\u0006\u0004\bF\u0010GJ\u0017\u0010I\u001a\u00020\u00182\u0006\u0010H\u001a\u00020\u001fH\u0014¢\u0006\u0004\bI\u0010\"J\u000f\u0010J\u001a\u00020\u0018H\u0014¢\u0006\u0004\bJ\u0010\fJ\u0017\u0010L\u001a\u00020\u00182\u0006\u0010K\u001a\u00020DH\u0016¢\u0006\u0004\bL\u0010GJQ\u0010U\u001a\u00020\u00182\u0006\u0010M\u001a\u00020D2\b\u0010O\u001a\u0004\u0018\u00010N2\u0006\u0010P\u001a\u00020;2\u0012\u0010S\u001a\u000e\u0012\u0004\u0012\u00020R\u0012\u0004\u0012\u00020\u00180Q2\u0012\u0010T\u001a\u000e\u0012\u0004\u0012\u00020R\u0012\u0004\u0012\u00020\u00180QH\u0016¢\u0006\u0004\bU\u0010VJ\u001f\u0010Z\u001a\u00020\u00182\u0006\u0010X\u001a\u00020W2\u0006\u0010Y\u001a\u00020;H\u0016¢\u0006\u0004\bZ\u0010[J\u000f\u0010\\\u001a\u00020\u0018H\u0017¢\u0006\u0004\b\\\u0010\fJ\u000f\u0010]\u001a\u00020\u0018H\u0014¢\u0006\u0004\b]\u0010\fJ\u000f\u0010^\u001a\u00020\u0018H\u0014¢\u0006\u0004\b^\u0010\fJ\u000f\u0010_\u001a\u00020\u0018H\u0014¢\u0006\u0004\b_\u0010\fJ\u000f\u0010`\u001a\u00020\u0018H\u0014¢\u0006\u0004\b`\u0010\fJ)\u0010d\u001a\u00020\u00182\u0006\u0010a\u001a\u00020D2\u0006\u0010b\u001a\u00020D2\b\u0010c\u001a\u0004\u0018\u00010#H\u0015¢\u0006\u0004\bd\u0010eJ\u000f\u0010f\u001a\u00020\u0018H\u0016¢\u0006\u0004\bf\u0010\fJ\r\u0010h\u001a\u00020g¢\u0006\u0004\bh\u0010iJ\r\u0010j\u001a\u00020\u0018¢\u0006\u0004\bj\u0010\fJ\u000f\u0010k\u001a\u00020DH\u0016¢\u0006\u0004\bk\u0010lJ\u000f\u0010n\u001a\u00020mH\u0016¢\u0006\u0004\bn\u0010oJ/\u0010t\u001a\u00020\u00182\u0006\u0010a\u001a\u00020D2\u000e\u0010q\u001a\n\u0012\u0006\b\u0001\u0012\u00020'0p2\u0006\u0010s\u001a\u00020rH\u0016¢\u0006\u0004\bt\u0010uJ\u001d\u0010x\u001a\u00020\u00182\u0006\u0010v\u001a\u00020'2\u0006\u0010w\u001a\u00020'¢\u0006\u0004\bx\u0010yJ\u001f\u0010|\u001a\u00020\u00182\u0006\u0010z\u001a\u00020'2\u0006\u0010{\u001a\u00020'H\u0002¢\u0006\u0004\b|\u0010yJ\u0017\u0010}\u001a\u00020\u00182\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b}\u0010&J\u000f\u0010~\u001a\u00020\u0018H\u0002¢\u0006\u0004\b~\u0010\fJ\u0011\u0010\u007f\u001a\u00020\u0018H\u0082@¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\"\u0010\u0083\u0001\u001a\u00020\u00182\u000e\u0010\u0082\u0001\u001a\t\u0012\u0004\u0012\u00020\u00180\u0081\u0001H\u0002¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J\u001a\u0010\u0086\u0001\u001a\u00020\u00182\u0007\u0010\u0085\u0001\u001a\u00020;H\u0002¢\u0006\u0005\b\u0086\u0001\u0010>J\"\u0010\u0087\u0001\u001a\u00020\u00182\u000e\u0010\u0082\u0001\u001a\t\u0012\u0004\u0012\u00020\u00180\u0081\u0001H\u0002¢\u0006\u0006\b\u0087\u0001\u0010\u0084\u0001J\u0011\u0010\u0088\u0001\u001a\u00020\u0018H\u0002¢\u0006\u0005\b\u0088\u0001\u0010\fJ\u0011\u0010\u0089\u0001\u001a\u00020\u0018H\u0002¢\u0006\u0005\b\u0089\u0001\u0010\fJ\u0011\u0010\u008a\u0001\u001a\u00020\u0018H\u0002¢\u0006\u0005\b\u008a\u0001\u0010\fJ\u001c\u0010\u008d\u0001\u001a\u00020\u00182\b\u0010\u008c\u0001\u001a\u00030\u008b\u0001H\u0002¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J\u001c\u0010\u008f\u0001\u001a\u00020\u00182\b\u0010\u008c\u0001\u001a\u00030\u008b\u0001H\u0002¢\u0006\u0006\b\u008f\u0001\u0010\u008e\u0001J\u001b\u0010\u0090\u0001\u001a\u00020\u00182\b\b\u0002\u0010<\u001a\u00020;H\u0002¢\u0006\u0005\b\u0090\u0001\u0010>J\u0019\u0010\u0091\u0001\u001a\u00020;2\u0006\u0010@\u001a\u00020?H\u0002¢\u0006\u0005\b\u0091\u0001\u0010BJ\u0011\u0010\u0092\u0001\u001a\u00020\u0018H\u0002¢\u0006\u0005\b\u0092\u0001\u0010\fJ\u0019\u0010\u0093\u0001\u001a\u00020;2\u0006\u0010@\u001a\u00020?H\u0002¢\u0006\u0005\b\u0093\u0001\u0010BJ\u0011\u0010\u0094\u0001\u001a\u00020\u0018H\u0002¢\u0006\u0005\b\u0094\u0001\u0010\fJ\u0011\u0010\u0095\u0001\u001a\u00020\u0018H\u0002¢\u0006\u0005\b\u0095\u0001\u0010\fJ\u0011\u0010\u0096\u0001\u001a\u00020\u0018H\u0002¢\u0006\u0005\b\u0096\u0001\u0010\fJ\u0011\u0010\u0097\u0001\u001a\u00020\u0018H\u0002¢\u0006\u0005\b\u0097\u0001\u0010\fJ\u0011\u0010\u0098\u0001\u001a\u00020\u0018H\u0002¢\u0006\u0005\b\u0098\u0001\u0010\fJ\u0011\u0010\u0099\u0001\u001a\u00020\u0018H\u0002¢\u0006\u0005\b\u0099\u0001\u0010\fJ\u0011\u0010\u009a\u0001\u001a\u00020\u0018H\u0002¢\u0006\u0005\b\u009a\u0001\u0010\fJ&\u0010\u009d\u0001\u001a\u00020\u00182\u0007\u0010\u009b\u0001\u001a\u00020D2\t\b\u0002\u0010\u009c\u0001\u001a\u00020;H\u0002¢\u0006\u0006\b\u009d\u0001\u0010\u009e\u0001J\u001a\u0010\u009f\u0001\u001a\u00020\u00182\u0006\u0010X\u001a\u00020WH\u0002¢\u0006\u0006\b\u009f\u0001\u0010 \u0001J3\u0010¦\u0001\u001a\u00020\u00182\b\u0010¢\u0001\u001a\u00030¡\u00012\b\u0010¤\u0001\u001a\u00030£\u00012\u000b\b\u0002\u0010¥\u0001\u001a\u0004\u0018\u00010;H\u0002¢\u0006\u0006\b¦\u0001\u0010§\u0001J&\u0010¨\u0001\u001a\u00020\u00182\b\u0010¢\u0001\u001a\u00030¡\u00012\b\u0010¤\u0001\u001a\u00030£\u0001H\u0002¢\u0006\u0006\b¨\u0001\u0010©\u0001J\u0019\u0010«\u0001\u001a\t\u0012\u0004\u0012\u00020D0ª\u0001H\u0002¢\u0006\u0006\b«\u0001\u0010¬\u0001J\u0012\u0010\u00ad\u0001\u001a\u00020;H\u0002¢\u0006\u0006\b\u00ad\u0001\u0010®\u0001J\u001c\u0010¯\u0001\u001a\u00020\u00182\t\b\u0002\u0010\u009c\u0001\u001a\u00020;H\u0002¢\u0006\u0005\b¯\u0001\u0010>J\u001c\u0010±\u0001\u001a\u00020\u00182\t\b\u0002\u0010°\u0001\u001a\u00020;H\u0002¢\u0006\u0005\b±\u0001\u0010>J\u0011\u0010²\u0001\u001a\u00020\u0018H\u0002¢\u0006\u0005\b²\u0001\u0010\fJ\u0011\u0010³\u0001\u001a\u00020\u0018H\u0002¢\u0006\u0005\b³\u0001\u0010\fJ9\u0010¹\u0001\u001a\u00020\u00182\b\u0010µ\u0001\u001a\u00030´\u00012\u001b\u0010¸\u0001\u001a\u0016\u0012\u0005\u0012\u00030·\u0001\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\u00180¶\u0001H\u0002¢\u0006\u0006\b¹\u0001\u0010º\u0001J\"\u0010¼\u0001\u001a\u00020\u00182\u000e\u0010»\u0001\u001a\t\u0012\u0004\u0012\u00020\u00180\u0081\u0001H\u0002¢\u0006\u0006\b¼\u0001\u0010\u0084\u0001J\u0011\u0010½\u0001\u001a\u00020\u0018H\u0002¢\u0006\u0005\b½\u0001\u0010\fJ\u0011\u0010¾\u0001\u001a\u00020\u0018H\u0002¢\u0006\u0005\b¾\u0001\u0010\fJ\u001a\u0010À\u0001\u001a\u00020\u00182\u0007\u0010¿\u0001\u001a\u00020DH\u0002¢\u0006\u0005\bÀ\u0001\u0010GJ\u0011\u0010Á\u0001\u001a\u00020\u0018H\u0002¢\u0006\u0005\bÁ\u0001\u0010\fJ\u0011\u0010Â\u0001\u001a\u00020\u0018H\u0002¢\u0006\u0005\bÂ\u0001\u0010\fJ\"\u0010Ä\u0001\u001a\u00020\u00182\u000e\u0010Ã\u0001\u001a\t\u0012\u0004\u0012\u00020g0ª\u0001H\u0002¢\u0006\u0006\bÄ\u0001\u0010Å\u0001J\u001b\u0010Ç\u0001\u001a\u00020\u00182\u0007\u0010Æ\u0001\u001a\u00020gH\u0002¢\u0006\u0006\bÇ\u0001\u0010È\u0001J\"\u0010Ê\u0001\u001a\u00020\u00182\u000e\u0010É\u0001\u001a\t\u0012\u0004\u0012\u00020g0ª\u0001H\u0002¢\u0006\u0006\bÊ\u0001\u0010Å\u0001J\u0011\u0010Ë\u0001\u001a\u00020\u0018H\u0002¢\u0006\u0005\bË\u0001\u0010\fJ\u0011\u0010Ì\u0001\u001a\u00020\u0018H\u0002¢\u0006\u0005\bÌ\u0001\u0010\fJ\"\u0010Î\u0001\u001a\u00020\u00182\u0006\u0010v\u001a\u00020'2\u0007\u0010Í\u0001\u001a\u00020'H\u0002¢\u0006\u0005\bÎ\u0001\u0010yR\u001a\u0010Ò\u0001\u001a\u00030Ï\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÐ\u0001\u0010Ñ\u0001R*\u0010Ú\u0001\u001a\u00030Ó\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÔ\u0001\u0010Õ\u0001\u001a\u0006\bÖ\u0001\u0010×\u0001\"\u0006\bØ\u0001\u0010Ù\u0001R*\u0010â\u0001\u001a\u00030Û\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÜ\u0001\u0010Ý\u0001\u001a\u0006\bÞ\u0001\u0010ß\u0001\"\u0006\bà\u0001\u0010á\u0001R*\u0010ê\u0001\u001a\u00030ã\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bä\u0001\u0010å\u0001\u001a\u0006\bæ\u0001\u0010ç\u0001\"\u0006\bè\u0001\u0010é\u0001R*\u0010ò\u0001\u001a\u00030ë\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bì\u0001\u0010í\u0001\u001a\u0006\bî\u0001\u0010ï\u0001\"\u0006\bð\u0001\u0010ñ\u0001R)\u0010ù\u0001\u001a\u00030ó\u00018\u0006@\u0006X\u0087.¢\u0006\u0017\n\u0005\bU\u0010ô\u0001\u001a\u0006\bõ\u0001\u0010ö\u0001\"\u0006\b÷\u0001\u0010ø\u0001R*\u0010\u0081\u0002\u001a\u00030ú\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bû\u0001\u0010ü\u0001\u001a\u0006\bý\u0001\u0010þ\u0001\"\u0006\bÿ\u0001\u0010\u0080\u0002R)\u0010\u0088\u0002\u001a\u00030\u0082\u00028\u0006@\u0006X\u0087.¢\u0006\u0017\n\u0005\bZ\u0010\u0083\u0002\u001a\u0006\b\u0084\u0002\u0010\u0085\u0002\"\u0006\b\u0086\u0002\u0010\u0087\u0002R)\u0010\u008f\u0002\u001a\u00030\u0089\u00028\u0006@\u0006X\u0087.¢\u0006\u0017\n\u0005\b3\u0010\u008a\u0002\u001a\u0006\b\u008b\u0002\u0010\u008c\u0002\"\u0006\b\u008d\u0002\u0010\u008e\u0002R*\u0010\u0097\u0002\u001a\u00030\u0090\u00028\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0091\u0002\u0010\u0092\u0002\u001a\u0006\b\u0093\u0002\u0010\u0094\u0002\"\u0006\b\u0095\u0002\u0010\u0096\u0002R*\u0010\u009f\u0002\u001a\u00030\u0098\u00028\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0099\u0002\u0010\u009a\u0002\u001a\u0006\b\u009b\u0002\u0010\u009c\u0002\"\u0006\b\u009d\u0002\u0010\u009e\u0002R*\u0010§\u0002\u001a\u00030 \u00028\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b¡\u0002\u0010¢\u0002\u001a\u0006\b£\u0002\u0010¤\u0002\"\u0006\b¥\u0002\u0010¦\u0002R*\u0010¯\u0002\u001a\u00030¨\u00028\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b©\u0002\u0010ª\u0002\u001a\u0006\b«\u0002\u0010¬\u0002\"\u0006\b\u00ad\u0002\u0010®\u0002R*\u0010·\u0002\u001a\u00030°\u00028\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b±\u0002\u0010²\u0002\u001a\u0006\b³\u0002\u0010´\u0002\"\u0006\bµ\u0002\u0010¶\u0002R*\u0010¿\u0002\u001a\u00030¸\u00028\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b¹\u0002\u0010º\u0002\u001a\u0006\b»\u0002\u0010¼\u0002\"\u0006\b½\u0002\u0010¾\u0002R*\u0010Ç\u0002\u001a\u00030À\u00028\u0016@\u0016X\u0096.¢\u0006\u0018\n\u0006\bÁ\u0002\u0010Â\u0002\u001a\u0006\bÃ\u0002\u0010Ä\u0002\"\u0006\bÅ\u0002\u0010Æ\u0002R!\u0010Í\u0002\u001a\u00030È\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÉ\u0002\u0010Ê\u0002\u001a\u0006\bË\u0002\u0010Ì\u0002R!\u0010Ò\u0002\u001a\u00030Î\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÏ\u0002\u0010Ê\u0002\u001a\u0006\bÐ\u0002\u0010Ñ\u0002R\u001a\u0010Ö\u0002\u001a\u00030Ó\u00028\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÔ\u0002\u0010Õ\u0002R\u0019\u0010Ù\u0002\u001a\u00020m8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b×\u0002\u0010Ø\u0002R\u0019\u0010Ü\u0002\u001a\u00020g8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÚ\u0002\u0010Û\u0002R\u0019\u0010Þ\u0002\u001a\u00020g8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÝ\u0002\u0010Û\u0002R\u001d\u0010ã\u0002\u001a\u00030ß\u00028\u0006¢\u0006\u0010\n\u0006\bÛ\u0002\u0010à\u0002\u001a\u0006\bá\u0002\u0010â\u0002R\u0017\u0010æ\u0002\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\b\n\u0006\bä\u0002\u0010å\u0002R\u001a\u0010ê\u0002\u001a\u00030ç\u00028\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bè\u0002\u0010é\u0002R\u001a\u0010ì\u0002\u001a\u00030ç\u00028\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bë\u0002\u0010é\u0002R*\u0010ô\u0002\u001a\u00030í\u00028\u0016@\u0016X\u0096.¢\u0006\u0018\n\u0006\bî\u0002\u0010ï\u0002\u001a\u0006\bð\u0002\u0010ñ\u0002\"\u0006\bò\u0002\u0010ó\u0002R*\u0010ü\u0002\u001a\u00030õ\u00028\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bö\u0002\u0010÷\u0002\u001a\u0006\bø\u0002\u0010ù\u0002\"\u0006\bú\u0002\u0010û\u0002R\u001a\u0010þ\u0002\u001a\u00030Ó\u00028\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bý\u0002\u0010Õ\u0002R\u001a\u0010\u0080\u0003\u001a\u00030Ó\u00028\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÿ\u0002\u0010Õ\u0002R\u0018\u0010\u0084\u0003\u001a\u00030\u0081\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0003\u0010\u0083\u0003R!\u0010\u0089\u0003\u001a\u00030\u0085\u00038BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0086\u0003\u0010Ê\u0002\u001a\u0006\b\u0087\u0003\u0010\u0088\u0003RC\u0010\u0092\u0003\u001a\n\u0012\u0005\u0012\u00030¡\u00010\u008a\u00032\u000f\u0010\u008b\u0003\u001a\n\u0012\u0005\u0012\u00030¡\u00010\u008a\u00038V@VX\u0096\u008e\u0002¢\u0006\u0018\n\u0006\b\u008c\u0003\u0010\u008d\u0003\u001a\u0006\b\u008e\u0003\u0010\u008f\u0003\"\u0006\b\u0090\u0003\u0010\u0091\u0003R!\u0010\u0097\u0003\u001a\n\u0012\u0005\u0012\u00030\u0094\u00030\u0093\u00038\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0095\u0003\u0010\u0096\u0003R\u0019\u0010\u0099\u0003\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0098\u0003\u0010Ü\u0001R\u0019\u0010\u009b\u0003\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009a\u0003\u0010Ü\u0001R\u0017\u0010\u009d\u0003\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009c\u0003\u0010ë\u0002R\u001f\u0010 \u0003\u001a\u00020D8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0006\b\u009e\u0003\u0010Ê\u0002\u001a\u0005\b\u009f\u0003\u0010lR\u0019\u0010¢\u0003\u001a\u00020g8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¡\u0003\u0010Û\u0002R\u0018\u0010¦\u0003\u001a\u00030£\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¤\u0003\u0010¥\u0003R\u001b\u0010©\u0003\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b§\u0003\u0010¨\u0003R\u001b\u0010¬\u0003\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bª\u0003\u0010«\u0003R0\u0010²\u0003\u001a\u0005\u0018\u00010\u008b\u00012\n\u0010\u00ad\u0003\u001a\u0005\u0018\u00010\u008b\u00018\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b®\u0003\u0010¯\u0003\u001a\u0006\b°\u0003\u0010±\u0003R,\u0010º\u0003\u001a\u0005\u0018\u00010³\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b´\u0003\u0010µ\u0003\u001a\u0006\b¶\u0003\u0010·\u0003\"\u0006\b¸\u0003\u0010¹\u0003R\u0019\u0010¼\u0003\u001a\u00020D8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b»\u0003\u0010ë\u0002R\u0019\u0010¾\u0003\u001a\u00020D8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b½\u0003\u0010ë\u0002R\u0017\u0010À\u0003\u001a\u00020g8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¿\u0003\u0010Û\u0002R\u001c\u0010Ä\u0003\u001a\u0005\u0018\u00010Á\u00038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÂ\u0003\u0010Ã\u0003R\u001c\u0010Æ\u0003\u001a\u0005\u0018\u00010Á\u00038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÅ\u0003\u0010Ã\u0003R(\u0010Ê\u0003\u001a\u00020;8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bÇ\u0003\u0010Ü\u0001\u001a\u0006\bÈ\u0003\u0010®\u0001\"\u0005\bÉ\u0003\u0010>R!\u0010Ï\u0003\u001a\u00030Ë\u00038BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÌ\u0003\u0010Ê\u0002\u001a\u0006\bÍ\u0003\u0010Î\u0003R.\u0010Ô\u0003\u001a\u0010\u0012\u000b\u0012\t0Ð\u0003¢\u0006\u0003\bÑ\u00030\u008a\u00038BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÒ\u0003\u0010Ê\u0002\u001a\u0006\bÓ\u0003\u0010\u008f\u0003R.\u0010×\u0003\u001a\u0010\u0012\u000b\u0012\t0Ð\u0003¢\u0006\u0003\bÑ\u00030\u008a\u00038BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÕ\u0003\u0010Ê\u0002\u001a\u0006\bÖ\u0003\u0010\u008f\u0003R.\u0010Ú\u0003\u001a\u0010\u0012\u000b\u0012\t0Ð\u0003¢\u0006\u0003\bÑ\u00030\u008a\u00038BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bØ\u0003\u0010Ê\u0002\u001a\u0006\bÙ\u0003\u0010\u008f\u0003R(\u0010ß\u0003\u001a\u0011\u0012\u0005\u0012\u00030\u008b\u0001\u0012\u0005\u0012\u00030Ü\u00030Û\u00038\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÝ\u0003\u0010Þ\u0003R\u001e\u0010ã\u0003\u001a\t\u0012\u0004\u0012\u00020#0à\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\bá\u0003\u0010â\u0003R\u001e\u0010å\u0003\u001a\t\u0012\u0004\u0012\u00020#0à\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\bä\u0003\u0010â\u0003R\u0019\u0010ç\u0003\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bæ\u0003\u0010Ü\u0001R\u0018\u0010ë\u0003\u001a\u00030è\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\bé\u0003\u0010ê\u0003R\u0019\u0010î\u0003\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bì\u0003\u0010í\u0003R\u0019\u0010ð\u0003\u001a\u00020g8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bï\u0003\u0010Û\u0002R\u0018\u0010ò\u0003\u001a\u00030è\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\bñ\u0003\u0010ê\u0003R \u0010ø\u0003\u001a\u00030ó\u00038\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bô\u0003\u0010õ\u0003\u001a\u0006\bö\u0003\u0010÷\u0003R\u001c\u0010ü\u0003\u001a\u0005\u0018\u00010ù\u00038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bú\u0003\u0010û\u0003R\u0018\u0010\u0080\u0004\u001a\u00030ý\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\bþ\u0003\u0010ÿ\u0003R\u001a\u0010\u0084\u0004\u001a\u00030\u0081\u00048\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0004\u0010\u0083\u0004R\u0019\u0010\u0086\u0004\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0004\u0010Ü\u0001R$\u0010\u008a\u0004\u001a\n\u0012\u0005\u0012\u00030\u0087\u00040\u008a\u00038\u0006¢\u0006\u0010\n\u0006\bí\u0003\u0010\u0088\u0004\u001a\u0006\b\u0089\u0004\u0010\u008f\u0003RT\u0010\u0093\u0004\u001a:\u0012\u0016\u0012\u00140D¢\u0006\u000f\b\u008b\u0004\u0012\n\b\u008c\u0004\u0012\u0005\b\b(\u008d\u0004\u0012\u0017\u0012\u00150\u0087\u0004¢\u0006\u000f\b\u008b\u0004\u0012\n\b\u008c\u0004\u0012\u0005\b\b(\u008e\u0004\u0012\u0004\u0012\u00020\u00180¶\u00018\u0006¢\u0006\u0010\n\u0006\b\u008f\u0004\u0010\u0090\u0004\u001a\u0006\b\u0091\u0004\u0010\u0092\u0004R,\u0010\u009b\u0004\u001a\u0005\u0018\u00010\u0094\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0095\u0004\u0010\u0096\u0004\u001a\u0006\b\u0097\u0004\u0010\u0098\u0004\"\u0006\b\u0099\u0004\u0010\u009a\u0004R\u001f\u0010 \u0004\u001a\n\u0012\u0005\u0012\u00030\u009d\u00040\u009c\u00048\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009e\u0004\u0010\u009f\u0004R!\u0010¢\u0004\u001a\n\u0012\u0005\u0012\u00030¡\u00010\u008a\u00038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¡\u0004\u0010\u0088\u0004R!\u0010¤\u0004\u001a\n\u0012\u0005\u0012\u00030¡\u00010\u008a\u00038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b£\u0004\u0010\u0088\u0004R1\u0010¨\u0004\u001a\n\u0012\u0005\u0012\u00030¡\u00010\u008a\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¥\u0004\u0010\u0088\u0004\u001a\u0006\b¦\u0004\u0010\u008f\u0003\"\u0006\b§\u0004\u0010\u0091\u0003R&\u0010¬\u0004\u001a\u0011\u0012\f\u0012\n\u0012\u0005\u0012\u00030¡\u00010\u008a\u00030©\u00048\u0002X\u0082\u0004¢\u0006\b\n\u0006\bª\u0004\u0010«\u0004R)\u0010±\u0004\u001a\u0004\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0006\b\u00ad\u0004\u0010®\u0004\u001a\u0005\b¯\u0004\u0010)\"\u0005\b°\u0004\u0010,R)\u0010µ\u0004\u001a\u0004\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0006\b²\u0004\u0010®\u0004\u001a\u0005\b³\u0004\u0010)\"\u0005\b´\u0004\u0010,RR\u0010»\u0004\u001a4\u0012/\u0012-\u0012\f\u0012\n\u0012\u0005\u0012\u00030·\u00040\u008a\u0003\u0012\f\u0012\n\u0012\u0005\u0012\u00030·\u00040\u008a\u0003\u0012\f\u0012\n\u0012\u0005\u0012\u00030·\u00040\u008a\u00030¶\u00040©\u00048BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¸\u0004\u0010Ê\u0002\u001a\u0006\b¹\u0004\u0010º\u0004R\u0019\u0010½\u0004\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¼\u0004\u0010Ü\u0001R\u0019\u0010¿\u0004\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¾\u0004\u0010¨\u0003R\u0019\u0010Á\u0004\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÀ\u0004\u0010í\u0003R\u0019\u0010Ã\u0004\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÂ\u0004\u0010í\u0003R\u0019\u0010Å\u0004\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÄ\u0004\u0010í\u0003R\u0019\u0010Ç\u0004\u001a\u00020D8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÆ\u0004\u0010ë\u0002R\u0019\u0010É\u0004\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÈ\u0004\u0010í\u0003R\u0019\u0010Ë\u0004\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÊ\u0004\u0010í\u0003R\u0019\u0010Í\u0004\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÌ\u0004\u0010í\u0003R\u0019\u0010Ï\u0004\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÎ\u0004\u0010Ü\u0001R\u0019\u0010Ñ\u0004\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÐ\u0004\u0010Ü\u0001R\u0019\u0010Ó\u0004\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÒ\u0004\u0010Ü\u0001R.\u0010Õ\u0004\u001a\u0017\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u0018\u0018\u00010¶\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÔ\u0004\u0010\u0090\u0004R!\u0010Ú\u0004\u001a\u00030Ö\u00048BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b×\u0004\u0010Ê\u0002\u001a\u0006\bØ\u0004\u0010Ù\u0004R\u0019\u0010Ü\u0004\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÛ\u0004\u0010Ü\u0001R\u0018\u0010Þ\u0004\u001a\u00030è\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÝ\u0004\u0010ê\u0003R\u0019\u0010à\u0004\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bß\u0004\u0010í\u0003R\u0019\u0010â\u0004\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bá\u0004\u0010í\u0003R\u0019\u0010ä\u0004\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bã\u0004\u0010Ü\u0001R\u0019\u0010æ\u0004\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bå\u0004\u0010Ü\u0001R\u0019\u0010è\u0004\u001a\u00020g8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bç\u0004\u0010Û\u0002R\u0019\u0010ê\u0004\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bé\u0004\u0010Ü\u0001R\u0019\u0010ì\u0004\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bë\u0004\u0010Ü\u0001R!\u0010ï\u0004\u001a\u00030Ö\u00048BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bí\u0004\u0010Ê\u0002\u001a\u0006\bî\u0004\u0010Ù\u0004R\u001c\u0010ñ\u0004\u001a\u0005\u0018\u00010è\u00038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bð\u0004\u0010ê\u0003R\u0019\u0010ó\u0004\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bò\u0004\u0010Ü\u0001R\u0019\u0010õ\u0004\u001a\u00020g8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bô\u0004\u0010Û\u0002R\u0019\u0010÷\u0004\u001a\u00020g8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bö\u0004\u0010Û\u0002R\u0019\u0010ù\u0004\u001a\u00020g8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bø\u0004\u0010Û\u0002R\u0019\u0010û\u0004\u001a\u00020D8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bú\u0004\u0010ë\u0002R\u0018\u0010ÿ\u0004\u001a\u00030ü\u00048\u0002X\u0082\u0004¢\u0006\b\n\u0006\bý\u0004\u0010þ\u0004R\u0019\u0010\u0081\u0005\u001a\u00020D8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0005\u0010ë\u0002R\u0019\u0010\u0083\u0005\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0005\u0010Ü\u0001R\u0019\u0010\u0085\u0005\u001a\u00020g8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0005\u0010Û\u0002R\u0019\u0010\u0087\u0005\u001a\u00020D8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0005\u0010ë\u0002R\u0019\u0010\u0089\u0005\u001a\u00020D8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0005\u0010ë\u0002R$\u0010\u008d\u0005\u001a\u000f\u0012\u0005\u0012\u00030\u008a\u0005\u0012\u0004\u0012\u00020\u00180Q8\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u008b\u0005\u0010\u008c\u0005R%\u0010\u0091\u0005\u001a\u0010\u0012\u000b\u0012\t\u0012\u0004\u0012\u0002020\u008f\u00050\u008e\u00058\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0090\u0005\u0010\u0088\u0004R\u001b\u0010\u0093\u0005\u001a\t\u0012\u0004\u0012\u00020g0ª\u00018F¢\u0006\b\u001a\u0006\b\u0092\u0005\u0010¬\u0001R\u0017\u0010\u0095\u0005\u001a\u00020;8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0094\u0005\u0010®\u0001R\u0019\u0010\u0098\u0005\u001a\u0004\u0018\u0001028BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0096\u0005\u0010\u0097\u0005R\u0018\u0010\u009c\u0005\u001a\u00030\u0099\u00058BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u009a\u0005\u0010\u009b\u0005¨\u0006£\u0005"}, d2 = {"Lcom/alightcreative/app/motion/activities/EditActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lyc/Um;", "LHW/I28;", "LUO6/qf$n;", "LHW/n;", "", "Lyc/Qik;", "LVi/Dsr;", "LVil/Wre;", "LPJ9/I28;", "<init>", "()V", "LLdY/Ml$j;", "ck", "()LLdY/Ml$j;", "Lcom/alightcreative/app/motion/scene/SceneSelection;", "getSelection", "()Lcom/alightcreative/app/motion/scene/SceneSelection;", "Lcom/alightcreative/app/motion/scene/SceneHolder;", "J2", "()Lcom/alightcreative/app/motion/scene/SceneHolder;", "Lyc/iy;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "rnX", "(Lyc/iy;)V", "", "nHg", "()F", "Fu", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/content/Intent;", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "", "Uo", "()Ljava/lang/String;", "string", "mUb", "(Ljava/lang/String;)V", "propLabel", "Lcom/alightcreative/app/motion/activities/EditActivity$Wre;", "guideDuration", "vTq", "(Ljava/lang/String;Lcom/alightcreative/app/motion/activities/EditActivity$Wre;)V", "Landroidx/fragment/app/Fragment;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Ljava/lang/Class;", "clazz", "HI", "(Ljava/lang/Class;)Landroidx/fragment/app/Fragment;", "i0", "C6", "az", "", "animated", "UCQ", "(Z)V", "Landroid/view/MotionEvent;", com.safedk.android.analytics.events.a.f62811a, "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "qie", "", "time", "iF", "(I)V", "outState", "onSaveInstanceState", "onDestroy", "actionId", "rV9", "id", "LUO6/w6;", "exportInfo", "isTemplateToggledOn", "Lkotlin/Function1;", "Landroidx/fragment/app/FragmentActivity;", "onSuccess", "onFailure", "E2", "(ILUO6/w6;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Lcom/alightcreative/app/motion/scene/SceneElement;", "element", "select", "X", "(Lcom/alightcreative/app/motion/scene/SceneElement;Z)V", "onBackPressed", "onPause", "onResume", "onStart", "onStop", "requestCode", "resultCode", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "nY", "", "KWB", "()J", "cKA", "getCurrentTime", "()I", "LHW/o;", "xMQ", "()LHW/o;", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "presetId", "presetTitle", "yRW", "(Ljava/lang/String;Ljava/lang/String;)V", "projectId", "projectPackageId", "Fz", "vZY", "d1", "ce", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function0;", "continuation", "oKr", "(Lkotlin/jvm/functions/Function0;)V", "requestedVisible", "uB", "RWu", "eO", "M63", "Rd8", "Lcom/alightcreative/app/motion/activities/EditActivity$j;", "tab", "mG", "(Lcom/alightcreative/app/motion/activities/EditActivity$j;)V", "Fd", "E9K", "wH", "xy", "PeJ", "E0X", "uBv", "Pj7", "kNi", "ARa", "UJb", "JL", "frame", "force", "Zy", "(IZ)V", "Fv", "(Lcom/alightcreative/app/motion/scene/SceneElement;)V", "Lcom/alightcreative/app/motion/project/ProjectInfo$n;", "projectInfo", "LrWZ/eO;", "requestTriggerPoint", "overwritePrevious", "AW8", "(Lcom/alightcreative/app/motion/project/ProjectInfo$n;LrWZ/eO;Ljava/lang/Boolean;)V", "zK", "(Lcom/alightcreative/app/motion/project/ProjectInfo$n;LrWZ/eO;)V", "", "dSC", "()Ljava/util/Set;", "KJJ", "()Z", "E5K", "saveEvenIfEmpty", "fxm", "Hez", "NkL", "LxAo/DAz;", "format", "Lkotlin/Function2;", "Landroidx/activity/ComponentActivity;", "completion", "tsI", "(LxAo/DAz;Lkotlin/jvm/functions/Function2;)V", "unlocked", "Wl", "yJD", "O7", JavetError.PARAMETER_COUNT, "K0", "hxH", "Nnj", "selectedItemIds", "oW", "(Ljava/util/Set;)V", "itemId", "Tpq", "(J)V", "selectedItems", "RkF", "qE1", "aa", "defaultTitle", "gS", "LSJ0/CN3;", "r", "LSJ0/CN3;", "binding", "LkgE/fuX;", "o", "LkgE/fuX;", "rst", "()LkgE/fuX;", "setIapManager", "(LkgE/fuX;)V", "iapManager", "LWK/I28;", "Z", "LWK/I28;", "qd", "()LWK/I28;", "setNewFeatureManager", "(LWK/I28;)V", "newFeatureManager", "LQ/fuX;", "S", "LQ/fuX;", "AJ", "()LQ/fuX;", "setFeatureUnlockManager", "(LQ/fuX;)V", "featureUnlockManager", "LQ/Xo;", "g", "LQ/Xo;", "getRewardedAdUnlockUseCase", "()LQ/Xo;", "setRewardedAdUnlockUseCase", "(LQ/Xo;)V", "rewardedAdUnlockUseCase", "LxhQ/Ml;", "LxhQ/Ml;", "hep", "()LxhQ/Ml;", "setGetTrialListItemsUseCase", "(LxhQ/Ml;)V", "getTrialListItemsUseCase", "LfVJ/w6;", "e", "LfVJ/w6;", "CY", "()LfVJ/w6;", "setGetWatermarkOptionsUseCase", "(LfVJ/w6;)V", "getWatermarkOptionsUseCase", "LQmE/iF;", "LQmE/iF;", "lm1", "()LQmE/iF;", "setEventLogger", "(LQmE/iF;)V", "eventLogger", "LxAo/I28;", "LxAo/I28;", "uQo", "()LxAo/I28;", "setCrisperManager", "(LxAo/I28;)V", "crisperManager", "LxAo/qf;", "N", "LxAo/qf;", "R8", "()LxAo/qf;", "setExportProFeatureManager", "(LxAo/qf;)V", "exportProFeatureManager", "LCZF/I28;", "v", "LCZF/I28;", "S0", "()LCZF/I28;", "setPico", "(LCZF/I28;)V", "pico", "LcKn/Wre;", "Xw", "LcKn/Wre;", "bAP", "()LcKn/Wre;", "setTheirs", "(LcKn/Wre;)V", "theirs", "LnYs/Ml;", "jB", "LnYs/Ml;", "CX", "()LnYs/Ml;", "setGetAlightSettingsUseCase", "(LnYs/Ml;)V", "getAlightSettingsUseCase", "LzRY/g9s$n;", "U", "LzRY/g9s$n;", "utY", "()LzRY/g9s$n;", "setPremadeContentViewModelFactory", "(LzRY/g9s$n;)V", "premadeContentViewModelFactory", "LkP/n;", "P5", "LkP/n;", "oG8", "()LkP/n;", "setInjet", "(LkP/n;)V", "injet", "LPJ9/Ml;", "M7", "LPJ9/Ml;", "ViF", "()LPJ9/Ml;", "Xj", "(LPJ9/Ml;)V", "signInLauncher", "Ll/CN3;", "p5", "Lkotlin/Lazy;", "hJ4", "()Ll/CN3;", "cloudBackupViewModel", "LIG/Ml;", "eF", "xxL", "()LIG/Ml;", "viewModel", "Lcom/alightcreative/app/motion/scene/SceneThumbnailMaker;", "E", "Lcom/alightcreative/app/motion/scene/SceneThumbnailMaker;", "shareThumbnailMaker", "M", "LHW/o;", "infoBar", "FX", "J", "lastMediaCoordToastTime", "B", "lastMediaCoordPopupTime", "LLM/Wre;", "LLM/Wre;", "Nz", "()LLM/Wre;", "projectHolder", "D", "Lcom/alightcreative/app/motion/scene/SceneHolder;", "sceneHolder", "LrWZ/n;", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "LrWZ/n;", "exportSnapshot", "I", "templateToggleExportSnapshot", "LSi/Xo;", "GR", "LSi/Xo;", "j3I", "()LSi/Xo;", "Vzj", "(LSi/Xo;)V", "scenePlayer", "Lyc/mz;", "Nxk", "Lyc/mz;", "vH3", "()Lyc/mz;", "EAC", "(Lyc/mz;)V", "adapter", "Y", "trackThumbnailMaker", "k", "elementThumbnailMaker", "Lcom/alightcreative/app/motion/activities/VS;", "dR0", "Lcom/alightcreative/app/motion/activities/VS;", "editAddDelegate", "Lcom/alightcreative/app/motion/activities/nSC;", "z", "Im", "()Lcom/alightcreative/app/motion/activities/nSC;", "editActionDelegate", "", "<set-?>", "piY", "Landroidx/compose/runtime/MutableState;", "getAllLocalProjects", "()Ljava/util/List;", "oM", "(Ljava/util/List;)V", "allLocalProjects", "LLdY/Ml;", "Lcom/alightcreative/app/motion/scene/Scene;", "ijL", "LLdY/Ml;", "undoManager", "m", SafeDKWebAppInterface.f62917c, "eTf", "playPending", "xg", "longPressTime", "pJg", "JF7", "touchSlop", "ofS", "lastTapTime", "Landroid/os/Handler;", "C", "Landroid/os/Handler;", "handler", "Mx", "LLdY/Ml$j;", "projectNameUndoBatch", "G7", "Lyc/iy;", "spoidOnClickListener", "value", "fcU", "Lcom/alightcreative/app/motion/activities/EditActivity$j;", "Oe4", "()Lcom/alightcreative/app/motion/activities/EditActivity$j;", "selectedAddPopupTab", "Landroid/media/MediaPlayer;", "eWT", "Landroid/media/MediaPlayer;", "Q0", "()Landroid/media/MediaPlayer;", "Pt", "(Landroid/media/MediaPlayer;)V", "audioPreviewPlayer", "ul", "exportSerial", "n1", "lagFrames", "Jk", "lagFeedbackConfig", "Landroid/view/Surface;", "Rl", "Landroid/view/Surface;", "previewSurface", "qm", "fullScreenPreviewSurface", "mYa", "o3K", "gy", "fullScreenPreviewMode", "Lyc/Kk1;", "Org", "rmO", "()Lyc/Kk1;", "previewPanZoomHandler", "Landroid/widget/ImageButton;", "Lkotlin/jvm/internal/EnhancedNullability;", "HV", "Oo", "multiTrimButtons", "GD", "Nj", "multiRightExtendButtons", "Po6", "uCx", "multiLeftExtendButtons", "", "Lcom/alightcreative/app/motion/activities/EditActivity$n;", "EWS", "Ljava/util/Map;", "addTabs", "Landroidx/activity/result/ActivityResultLauncher;", "hRu", "Landroidx/activity/result/ActivityResultLauncher;", "templateEditorLauncher", "UhV", "presetPreviewLauncher", CmcdData.OBJECT_TYPE_INIT_SEGMENT, "lagNoticePending", "Ljava/lang/Runnable;", "K", "Ljava/lang/Runnable;", "lagNoticeRunnable", "How", "F", "audioPeak", "tUK", "audioPeakTime", "ER", "levelMeterUpdater", "LVil/I28;", "lLA", "LVil/I28;", "gh", "()LVil/I28;", "customToastMaker", "Landroid/animation/AnimatorSet;", "kSg", "Landroid/animation/AnimatorSet;", "curGuideAnim", "LkgE/l4Z;", "W", "LkgE/l4Z;", "purchaseStateObserver", "Lcom/alightcreative/account/o;", "RQ", "Lcom/alightcreative/account/o;", "purchaseState", "a63", "zoomViewShownOnPreview", "Lcom/alightcreative/app/motion/activities/E3;", "Ljava/util/List;", "obf", "shapeList", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "position", "option", "QZ6", "Lkotlin/jvm/functions/Function2;", "IL", "()Lkotlin/jvm/functions/Function2;", "addShapeListener", "Landroid/net/Uri;", "tFV", "Landroid/net/Uri;", "C5", "()Landroid/net/Uri;", "tp", "(Landroid/net/Uri;)V", "audioPreviewQueuedUri", "Lcom/alightcreative/app/motion/scene/BitmapLruCache;", "Lcom/alightcreative/app/motion/project/ProjectInfo;", "VwL", "Lcom/alightcreative/app/motion/scene/BitmapLruCache;", "elementThumbnailCache", "mI", "templatesList", "T3L", "projectsList", "Bu", "a9", "setPresetsList", "presetsList", "LHI0/l4Z;", "p0N", "LHI0/l4Z;", "compListLoader", "Uf", "Ljava/lang/String;", "IBF", "rH", "mediaBucketId", InneractiveMediationDefs.GENDER_FEMALE, "dwF", "aP", "mediaBucketName", "Lkotlin/Triple;", "Ltu/Z;", "ub", "mBA", "()LHI0/l4Z;", "mediaListLoader", "Qu", "isAddPopupCloseAnimating", "HBN", "undoBatch", "UF", "originalTouchX", "X4T", "originalTouchY", "Zmq", "prevTouchX", "JVN", "prevEditMode", "xVH", "prevTouchY", "EF", "prevFocusX", "uG", "prevFocusY", "Vvq", "inGesture", "y", "inDragGesture", "Zn", "inScaleGesture", "nO", "gestureHandler", "LGK/j;", "vl", "Wc", "()LGK/j;", "previewTouchGestureDetector", "v0j", "delayedClosePending", "o9", "delayedCloseAfterDoubleTapRunnable", "n7b", "initialTouchX", "Aum", "initialTouchY", CmcdData.STREAMING_FORMAT_SS, "pendingLongPress", "Lp6", "didLongPressSelect", "g6", "pendingLongPressId", "Mh", "multiSelectDragInProgress", "jO", "multiSelectScaleInProgress", "Toy", "dDe", "multiSelectScaleGestureDetector", "wKp", "selectionHintRunnable", "Th", "twoFingerGesture", "xzo", "lastFPSCheckCount", "XNZ", "lastFPSCheckTime", "lNy", "lastEstimatedFPS", "I9f", "originalScrollY", "Landroidx/fragment/app/FragmentManager$OnBackStackChangedListener;", "D76", "Landroidx/fragment/app/FragmentManager$OnBackStackChangedListener;", "onBackStackChangedListener", "NP", "initialSceneHash", "QgZ", "pauseEditTimer", "j", "projectEditStartTime", "H", "previewSurfaceWidth", "waP", "previewSurfaceHeight", "Lcom/alightcreative/app/motion/scene/SceneHolderState;", "LPV", "Lkotlin/jvm/functions/Function1;", "onSceneUpdate", "", "Ljava/lang/ref/WeakReference;", "rxp", "attachedFragments", "UpJ", "selectedElements", "NqA", "addPopupIsVisible", "ON", "()Landroidx/fragment/app/Fragment;", "activeEditFragment", "Lcom/alightcreative/app/motion/activities/edit/widgets/TimelineLayoutManager;", "GA", "()Lcom/alightcreative/app/motion/activities/edit/widgets/TimelineLayoutManager;", "timelineLayoutManager", "Fp", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "Wre", "I28", "Ml", "w6", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nEditActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditActivity.kt\ncom/alightcreative/app/motion/activities/EditActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 6 ViewUtils.kt\ncom/alightcreative/ext/ViewUtilsKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 Scene.kt\ncom/alightcreative/app/motion/scene/SceneKt\n+ 9 View.kt\nandroidx/core/view/ViewKt\n+ 10 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 11 ContextUtil.kt\ncom/alightcreative/ext/ContextUtilKt\n+ 12 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 13 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 14 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,4446:1\n70#2,11:4447\n70#2,11:4458\n774#3:4469\n865#3,2:4470\n1557#3:4472\n1628#3,3:4473\n1557#3:4476\n1628#3,3:4477\n1863#3,2:4496\n1611#3,9:4498\n1863#3:4507\n1864#3:4509\n1620#3:4510\n774#3:4511\n865#3,2:4512\n1863#3:4516\n1864#3:4523\n1863#3,2:4536\n1863#3,2:4538\n774#3:4544\n865#3,2:4545\n774#3:4547\n865#3,2:4548\n1863#3,2:4550\n1557#3:4552\n1628#3,3:4553\n1557#3:4556\n1628#3,3:4557\n1611#3,9:4560\n1863#3:4569\n1864#3:4571\n1620#3:4572\n1872#3,3:4573\n774#3:4576\n865#3,2:4577\n1863#3,2:4580\n1863#3,2:4582\n1611#3,9:4584\n1863#3:4593\n1864#3:4595\n1620#3:4596\n543#3,6:4597\n1368#3:4603\n1454#3,5:4604\n1557#3:4609\n1628#3,3:4610\n1557#3:4614\n1628#3,3:4615\n774#3:4618\n865#3,2:4619\n2341#3,14:4621\n774#3:4635\n865#3,2:4636\n1971#3,14:4638\n1863#3,2:4652\n1863#3,2:4654\n1863#3,2:4656\n1863#3,2:4658\n1863#3,2:4660\n1863#3,2:4662\n1863#3,2:4664\n1863#3,2:4666\n1863#3,2:4668\n1557#3:4689\n1628#3,3:4690\n1755#3,3:4701\n774#3:4720\n865#3,2:4721\n774#3:4723\n865#3,2:4724\n1611#3,9:4726\n1863#3:4735\n1864#3:4737\n1620#3:4738\n543#3,6:4739\n2341#3,14:4746\n774#3:4760\n865#3,2:4761\n774#3:4763\n865#3,2:4764\n1755#3,3:4768\n1863#3,2:4771\n1557#3:4773\n1628#3,3:4774\n1863#3,2:4777\n1755#3,3:4786\n3193#3,10:4791\n3193#3,10:4801\n1062#3:4811\n1062#3:4812\n774#3:4813\n865#3,2:4814\n1062#3:4816\n1755#3,3:4818\n1611#3,9:4821\n1863#3:4830\n1864#3:4832\n1620#3:4833\n1863#3,2:4834\n85#4:4480\n113#4,2:4481\n216#5,2:4483\n216#5,2:4542\n126#5:4712\n153#5,3:4713\n126#5:4716\n153#5,3:4717\n109#6,11:4485\n1#7:4508\n1#7:4518\n1#7:4570\n1#7:4579\n1#7:4594\n1#7:4613\n1#7:4736\n1#7:4745\n1#7:4831\n1#7:4836\n797#8,2:4514\n799#8:4517\n800#8,4:4519\n806#8,12:4524\n278#9,2:4540\n161#9,8:4704\n257#9,2:4766\n278#9,2:4789\n39#10:4670\n55#10,12:4671\n84#10,3:4683\n93#11,3:4686\n93#11,3:4697\n37#12:4693\n36#12,3:4694\n477#13:4700\n477#13:4817\n1350#14,2:4779\n2418#14,5:4781\n*S KotlinDebug\n*F\n+ 1 EditActivity.kt\ncom/alightcreative/app/motion/activities/EditActivity\n*L\n416#1:4447,11\n418#1:4458,11\n2374#1:4469\n2374#1:4470,2\n2374#1:4472\n2374#1:4473,3\n2375#1:4476\n2375#1:4477,3\n2088#1:4496,2\n2124#1:4498,9\n2124#1:4507\n2124#1:4509\n2124#1:4510\n2124#1:4511\n2124#1:4512,2\n2155#1:4516\n2155#1:4523\n2219#1:4536,2\n2308#1:4538,2\n2916#1:4544\n2916#1:4545,2\n2978#1:4547\n2978#1:4548,2\n2978#1:4550,2\n3039#1:4552\n3039#1:4553,3\n3119#1:4556\n3119#1:4557,3\n3145#1:4560,9\n3145#1:4569\n3145#1:4571\n3145#1:4572\n3147#1:4573,3\n3151#1:4576\n3151#1:4577,2\n3218#1:4580,2\n3231#1:4582,2\n3699#1:4584,9\n3699#1:4593\n3699#1:4595\n3699#1:4596\n3700#1:4597,6\n3712#1:4603\n3712#1:4604,5\n3712#1:4609\n3712#1:4610,3\n4230#1:4614\n4230#1:4615,3\n4335#1:4618\n4335#1:4619,2\n4335#1:4621,14\n4336#1:4635\n4336#1:4636,2\n4336#1:4638,14\n4339#1:4652,2\n4340#1:4654,2\n4341#1:4656,2\n4343#1:4658,2\n4344#1:4660,2\n4345#1:4662,2\n4347#1:4664,2\n4348#1:4666,2\n4349#1:4668,2\n604#1:4689\n604#1:4690,3\n706#1:4701,3\n806#1:4720\n806#1:4721,2\n811#1:4723\n811#1:4724,2\n878#1:4726,9\n878#1:4735\n878#1:4737\n878#1:4738\n879#1:4739,6\n963#1:4746,14\n969#1:4760\n969#1:4761,2\n972#1:4763\n972#1:4764,2\n1179#1:4768,3\n1316#1:4771,2\n1402#1:4773\n1402#1:4774,3\n1456#1:4777,2\n1737#1:4786,3\n2482#1:4791,10\n2484#1:4801,10\n2489#1:4811\n2500#1:4812\n2526#1:4813\n2526#1:4814,2\n2526#1:4816\n3623#1:4818,3\n4053#1:4821,9\n4053#1:4830\n4053#1:4832\n4053#1:4833\n4080#1:4834,2\n440#1:4480\n440#1:4481,2\n1040#1:4483,2\n2358#1:4542,2\n734#1:4712\n734#1:4713,3\n747#1:4716\n747#1:4717,3\n1483#1:4485,11\n2124#1:4508\n3145#1:4570\n3699#1:4594\n878#1:4736\n4053#1:4831\n2155#1:4514,2\n2155#1:4517\n2155#1:4519,4\n2155#1:4524,12\n2347#1:4540,2\n722#1:4704,8\n1098#1:4766,2\n2537#1:4789,2\n4421#1:4670\n4421#1:4671,12\n4421#1:4683,3\n529#1:4686,3\n601#1:4697,3\n604#1:4693\n604#1:4694,3\n646#1:4700\n3246#1:4817\n1648#1:4779,2\n1653#1:4781,5\n*E\n"})
public final class EditActivity extends prm implements yc.Um, HW.I28, qf.n, HW.n, yc.Qik, Vi.Dsr, Vil.Wre, PJ9.I28 {
    public static final int Ro = 8;

    /* JADX INFO: renamed from: Aum, reason: from kotlin metadata */
    private float initialTouchY;

    /* JADX INFO: renamed from: B, reason: collision with root package name and from kotlin metadata */
    private long lastMediaCoordPopupTime;

    /* JADX INFO: renamed from: Bu, reason: from kotlin metadata */
    private List presetsList;

    /* JADX INFO: renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final Handler handler;

    /* JADX INFO: renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final SceneHolder sceneHolder;

    /* JADX INFO: renamed from: D76, reason: from kotlin metadata */
    private final FragmentManager.OnBackStackChangedListener onBackStackChangedListener;

    /* JADX INFO: renamed from: E, reason: collision with root package name and from kotlin metadata */
    private SceneThumbnailMaker shareThumbnailMaker;

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    public xhQ.Ml getTrialListItemsUseCase;

    /* JADX INFO: renamed from: EF, reason: from kotlin metadata */
    private float prevFocusX;

    /* JADX INFO: renamed from: ER, reason: from kotlin metadata */
    private final Runnable levelMeterUpdater;

    /* JADX INFO: renamed from: EWS, reason: from kotlin metadata */
    private Map addTabs;

    /* JADX INFO: renamed from: F, reason: collision with root package name and from kotlin metadata */
    private final List shapeList;

    /* JADX INFO: renamed from: FX, reason: collision with root package name and from kotlin metadata */
    private long lastMediaCoordToastTime;

    /* JADX INFO: renamed from: G7, reason: collision with root package name and from kotlin metadata */
    private yc.iy spoidOnClickListener;

    /* JADX INFO: renamed from: GD, reason: from kotlin metadata */
    private final Lazy multiRightExtendButtons;

    /* JADX INFO: renamed from: GR, reason: collision with root package name and from kotlin metadata */
    public Si.Xo scenePlayer;

    /* JADX INFO: renamed from: H, reason: collision with root package name and from kotlin metadata */
    private int previewSurfaceWidth;

    /* JADX INFO: renamed from: HBN, reason: from kotlin metadata */
    private Ml.j undoBatch;

    /* JADX INFO: renamed from: HV, reason: from kotlin metadata */
    private final Lazy multiTrimButtons;

    /* JADX INFO: renamed from: How, reason: from kotlin metadata */
    private float audioPeak;

    /* JADX INFO: renamed from: I, reason: collision with root package name and from kotlin metadata */
    private rWZ.n templateToggleExportSnapshot;

    /* JADX INFO: renamed from: I9f, reason: from kotlin metadata */
    private int originalScrollY;

    /* JADX INFO: renamed from: J, reason: collision with root package name and from kotlin metadata */
    private final LM.Wre projectHolder;

    /* JADX INFO: renamed from: JVN, reason: from kotlin metadata */
    private int prevEditMode;

    /* JADX INFO: renamed from: Jk, reason: from kotlin metadata */
    private final long lagFeedbackConfig;

    /* JADX INFO: renamed from: K, reason: collision with root package name and from kotlin metadata */
    private final Runnable lagNoticeRunnable;

    /* JADX INFO: renamed from: LPV, reason: from kotlin metadata */
    private final Function1 onSceneUpdate;

    /* JADX INFO: renamed from: Lp6, reason: from kotlin metadata */
    private boolean didLongPressSelect;

    /* JADX INFO: renamed from: M7, reason: from kotlin metadata */
    public PJ9.Ml signInLauncher;

    /* JADX INFO: renamed from: Mh, reason: from kotlin metadata */
    private boolean multiSelectDragInProgress;

    /* JADX INFO: renamed from: Mx, reason: from kotlin metadata */
    private Ml.j projectNameUndoBatch;

    /* JADX INFO: renamed from: N, reason: collision with root package name and from kotlin metadata */
    public xAo.qf exportProFeatureManager;

    /* JADX INFO: renamed from: NP, reason: collision with root package name and from kotlin metadata */
    private int initialSceneHash;

    /* JADX INFO: renamed from: Nxk, reason: from kotlin metadata */
    public yc.mz adapter;

    /* JADX INFO: renamed from: Org, reason: from kotlin metadata */
    private final Lazy previewPanZoomHandler;

    /* JADX INFO: renamed from: P5, reason: from kotlin metadata */
    public InterfaceC2210n injet;

    /* JADX INFO: renamed from: Po6, reason: from kotlin metadata */
    private final Lazy multiLeftExtendButtons;

    /* JADX INFO: renamed from: QZ6, reason: from kotlin metadata */
    private final Function2 addShapeListener;

    /* JADX INFO: renamed from: QgZ, reason: from kotlin metadata */
    private boolean pauseEditTimer;

    /* JADX INFO: renamed from: Qu, reason: from kotlin metadata */
    private boolean isAddPopupCloseAnimating;

    /* JADX INFO: renamed from: RQ, reason: from kotlin metadata */
    private com.alightcreative.account.o purchaseState;

    /* JADX INFO: renamed from: Rl, reason: from kotlin metadata */
    private Surface previewSurface;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    public Q.fuX featureUnlockManager;

    /* JADX INFO: renamed from: T, reason: collision with root package name and from kotlin metadata */
    public xAo.I28 crisperManager;

    /* JADX INFO: renamed from: T3L, reason: from kotlin metadata */
    private List projectsList;

    /* JADX INFO: renamed from: Th, reason: from kotlin metadata */
    private boolean twoFingerGesture;

    /* JADX INFO: renamed from: Toy, reason: from kotlin metadata */
    private final Lazy multiSelectScaleGestureDetector;

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
    public g9s.n premadeContentViewModelFactory;

    /* JADX INFO: renamed from: UF, reason: from kotlin metadata */
    private float originalTouchX;

    /* JADX INFO: renamed from: Uf, reason: from kotlin metadata */
    private String mediaBucketId;

    /* JADX INFO: renamed from: UhV, reason: from kotlin metadata */
    private final ActivityResultLauncher presetPreviewLauncher;

    /* JADX INFO: renamed from: Vvq, reason: from kotlin metadata */
    private boolean inGesture;

    /* JADX INFO: renamed from: VwL, reason: from kotlin metadata */
    private final BitmapLruCache elementThumbnailCache;

    /* JADX INFO: renamed from: W, reason: collision with root package name and from kotlin metadata */
    private final kgE.l4Z purchaseStateObserver;

    /* JADX INFO: renamed from: X, reason: collision with root package name and from kotlin metadata */
    public QmE.iF eventLogger;

    /* JADX INFO: renamed from: X4T, reason: from kotlin metadata */
    private float originalTouchY;

    /* JADX INFO: renamed from: XNZ, reason: from kotlin metadata */
    private long lastFPSCheckTime;

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    public cKn.Wre theirs;

    /* JADX INFO: renamed from: Y, reason: collision with root package name and from kotlin metadata */
    private SceneThumbnailMaker trackThumbnailMaker;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    public WK.I28 newFeatureManager;

    /* JADX INFO: renamed from: Zmq, reason: from kotlin metadata */
    private float prevTouchX;

    /* JADX INFO: renamed from: Zn, reason: from kotlin metadata */
    private boolean inScaleGesture;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private rWZ.n exportSnapshot;

    /* JADX INFO: renamed from: a63, reason: from kotlin metadata */
    private boolean zoomViewShownOnPreview;

    /* JADX INFO: renamed from: dR0, reason: from kotlin metadata */
    private final VS editAddDelegate;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public fVJ.w6 getWatermarkOptionsUseCase;

    /* JADX INFO: renamed from: eTf, reason: from kotlin metadata */
    private boolean playPending;

    /* JADX INFO: renamed from: eWT, reason: from kotlin metadata */
    private MediaPlayer audioPreviewPlayer;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private String mediaBucketName;

    /* JADX INFO: renamed from: fcU, reason: from kotlin metadata */
    private j selectedAddPopupTab;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public Q.Xo rewardedAdUnlockUseCase;

    /* JADX INFO: renamed from: g6, reason: from kotlin metadata */
    private long pendingLongPressId;

    /* JADX INFO: renamed from: hRu, reason: from kotlin metadata */
    private final ActivityResultLauncher templateEditorLauncher;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean lagNoticePending;

    /* JADX INFO: renamed from: ijL, reason: from kotlin metadata */
    private LdY.Ml undoManager;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private long projectEditStartTime;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    public nYs.Ml getAlightSettingsUseCase;

    /* JADX INFO: renamed from: jO, reason: from kotlin metadata */
    private boolean multiSelectScaleInProgress;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private SceneThumbnailMaker elementThumbnailMaker;

    /* JADX INFO: renamed from: kSg, reason: from kotlin metadata */
    private AnimatorSet curGuideAnim;

    /* JADX INFO: renamed from: lLA, reason: from kotlin metadata */
    private final Vil.I28 customToastMaker;

    /* JADX INFO: renamed from: lNy, reason: from kotlin metadata */
    private long lastEstimatedFPS;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private boolean playing;

    /* JADX INFO: renamed from: mI, reason: from kotlin metadata */
    private List templatesList;

    /* JADX INFO: renamed from: mYa, reason: from kotlin metadata */
    private boolean fullScreenPreviewMode;

    /* JADX INFO: renamed from: n1, reason: from kotlin metadata */
    private int lagFrames;

    /* JADX INFO: renamed from: n7b, reason: from kotlin metadata */
    private float initialTouchX;

    /* JADX INFO: renamed from: nO, reason: from kotlin metadata */
    private Function2 gestureHandler;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public kgE.fuX iapManager;

    /* JADX INFO: renamed from: o9, reason: from kotlin metadata */
    private final Runnable delayedCloseAfterDoubleTapRunnable;

    /* JADX INFO: renamed from: ofS, reason: from kotlin metadata */
    private long lastTapTime;

    /* JADX INFO: renamed from: p0N, reason: from kotlin metadata */
    private final HI0.l4Z compListLoader;

    /* JADX INFO: renamed from: pJg, reason: from kotlin metadata */
    private final Lazy touchSlop;

    /* JADX INFO: renamed from: piY, reason: from kotlin metadata */
    private final MutableState allLocalProjects;

    /* JADX INFO: renamed from: qm, reason: from kotlin metadata */
    private Surface fullScreenPreviewSurface;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private SJ0.CN3 binding;

    /* JADX INFO: renamed from: rxp, reason: from kotlin metadata */
    private final List attachedFragments;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private boolean pendingLongPress;

    /* JADX INFO: renamed from: tFV, reason: from kotlin metadata */
    private Uri audioPreviewQueuedUri;

    /* JADX INFO: renamed from: tUK, reason: from kotlin metadata */
    private long audioPeakTime;

    /* JADX INFO: renamed from: uG, reason: from kotlin metadata */
    private float prevFocusY;

    /* JADX INFO: renamed from: ub, reason: from kotlin metadata */
    private final Lazy mediaListLoader;

    /* JADX INFO: renamed from: ul, reason: from kotlin metadata */
    private int exportSerial;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    public CZF.I28 pico;

    /* JADX INFO: renamed from: v0j, reason: from kotlin metadata */
    private boolean delayedClosePending;

    /* JADX INFO: renamed from: vl, reason: from kotlin metadata */
    private final Lazy previewTouchGestureDetector;

    /* JADX INFO: renamed from: wKp, reason: from kotlin metadata */
    private Runnable selectionHintRunnable;

    /* JADX INFO: renamed from: waP, reason: from kotlin metadata */
    private int previewSurfaceHeight;

    /* JADX INFO: renamed from: xVH, reason: from kotlin metadata */
    private float prevTouchY;

    /* JADX INFO: renamed from: xg, reason: from kotlin metadata */
    private final int longPressTime;

    /* JADX INFO: renamed from: xzo, reason: from kotlin metadata */
    private long lastFPSCheckCount;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private boolean inDragGesture;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final Lazy editActionDelegate;

    /* JADX INFO: renamed from: p5, reason: from kotlin metadata */
    private final Lazy cloudBackupViewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(l.CN3.class), new vd(this), new rv6(this), new Lu(null, this));

    /* JADX INFO: renamed from: eF, reason: from kotlin metadata */
    private final Lazy viewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(IG.Ml.class), new K(this), new h(this), new psW(null, this));

    /* JADX INFO: renamed from: M, reason: collision with root package name and from kotlin metadata */
    private HW.o infoBar = HW.Ml.f3896n;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public static final class C implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ComparisonsKt.compareValues(Long.valueOf(((ProjectInfo.n) obj2).getLastModified()), Long.valueOf(((ProjectInfo.n) obj).getLastModified()));
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public /* synthetic */ class CN3 {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;
        public static final /* synthetic */ int[] $EnumSwitchMapping$5;
        public static final /* synthetic */ int[] $EnumSwitchMapping$6;

        static {
            int[] iArr = new int[neA.j.values().length];
            try {
                iArr[neA.j.f71192S.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[j.values().length];
            try {
                iArr2[j.f44485t.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[j.f44480O.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[j.f44484r.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[yc.op.values().length];
            try {
                iArr3[yc.op.f76083n.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[yc.op.f76085t.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[yc.op.f76082O.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[Wre.values().length];
            try {
                iArr4[Wre.f44459n.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr4[Wre.f44461t.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr4[Wre.f44458O.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[SceneElementType.values().length];
            try {
                iArr5[SceneElementType.Shape.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr5[SceneElementType.Scene.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr5[SceneElementType.Text.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr5[SceneElementType.Drawing.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr5[SceneElementType.Audio.ordinal()] = 5;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr5[SceneElementType.Camera.ordinal()] = 6;
            } catch (NoSuchFieldError unused16) {
            }
            $EnumSwitchMapping$4 = iArr5;
            int[] iArr6 = new int[tu.Ew.values().length];
            try {
                iArr6[tu.Ew.J2.ordinal()] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr6[tu.Ew.f73884r.ordinal()] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr6[tu.Ew.f73883o.ordinal()] = 3;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr6[tu.Ew.f73880Z.ordinal()] = 4;
            } catch (NoSuchFieldError unused20) {
            }
            $EnumSwitchMapping$5 = iArr6;
            int[] iArr7 = new int[SceneType.values().length];
            try {
                iArr7[SceneType.SCENE.ordinal()] = 1;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr7[SceneType.ELEMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused22) {
            }
            $EnumSwitchMapping$6 = iArr7;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    /* synthetic */ class DAz extends FunctionReferenceImpl implements Function1 {
        DAz(Object obj) {
            super(1, obj, EditActivity.class, "onClickEditNavItem", "onClickEditNavItem(I)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            n(((Number) obj).intValue());
            return Unit.INSTANCE;
        }

        public final void n(int i2) {
            ((EditActivity) this.receiver).K0(i2);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public static final class Dsr implements Animator.AnimatorListener {
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
        }

        Dsr() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            EditActivity.this.isAddPopupCloseAnimating = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            SJ0.CN3 cn3 = EditActivity.this.binding;
            if (cn3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn3 = null;
            }
            cn3.nr.getRoot().setVisibility(4);
            EditActivity.this.isAddPopupCloseAnimating = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            EditActivity.this.isAddPopupCloseAnimating = true;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    private static final class I28 extends FragmentPagerAdapter {
        private final boolean KN;
        private final int gh;
        private final int mUb;
        private final int xMQ;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public I28(FragmentManager fm2, boolean z2, int i2, int i3, int i5) {
            super(fm2);
            Intrinsics.checkNotNullParameter(fm2, "fm");
            this.KN = z2;
            this.xMQ = i2;
            this.mUb = i3;
            this.gh = i5;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int O() {
            int i2 = this.mUb;
            int i3 = this.xMQ;
            return (i2 / i3) + (i2 % i3 > 0 ? 1 : 0);
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        public Fragment XQ(int i2) {
            int i3;
            int i5;
            int i7;
            int iO = this.KN ? (O() - 1) - i2 : i2;
            if (this.KN) {
                if (iO == 0) {
                    i7 = this.xMQ * i2;
                    i3 = this.mUb;
                } else {
                    int i8 = this.xMQ;
                    i3 = i8 + (i8 * i2);
                    i7 = i8 * i2;
                }
                if (i2 != 0) {
                    z = false;
                }
            } else {
                if (iO == O() - 1) {
                    i5 = this.xMQ * iO;
                    i3 = this.mUb;
                } else {
                    int i9 = this.xMQ;
                    int i10 = i9 * iO;
                    i3 = (i2 * i9) + i9;
                    i5 = i10;
                }
                z = iO == 0;
                i7 = i5;
            }
            Ml ml = new Ml();
            Bundle bundle = new Bundle();
            bundle.putInt("fromIndex", i7);
            bundle.putInt("toIndex", i3);
            bundle.putInt("decorationMargin", this.gh);
            bundle.putBoolean("showObjectList", z);
            ml.setArguments(bundle);
            return ml;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public static final class K extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f44437n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public K(ComponentActivity componentActivity) {
            super(0);
            this.f44437n = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final ViewModelStore invoke() {
            return this.f44437n.getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public static final class Ln implements HW.o {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f44438n;

        public /* synthetic */ class j {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[HW.w6.values().length];
                try {
                    iArr[HW.w6.f3904n.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[HW.w6.f3905t.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        Ln() {
            EditActivity.this.infoBar.t(HW.w6.f3904n);
            SJ0.CN3 cn3 = EditActivity.this.binding;
            SJ0.CN3 cn32 = null;
            if (cn3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn3 = null;
            }
            cn3.f9098S.getRoot().setVisibility(0);
            SJ0.CN3 cn33 = EditActivity.this.binding;
            if (cn33 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                cn32 = cn33;
            }
            cn32.iF.getRoot().setVisibility(4);
        }

        @Override // HW.o
        public void J2(String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            if (this.f44438n || !Intrinsics.areEqual(EditActivity.this.infoBar, this)) {
                return;
            }
            SJ0.CN3 cn3 = EditActivity.this.binding;
            if (cn3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn3 = null;
            }
            cn3.f9098S.f9442r.setText(text);
        }

        @Override // HW.o
        public void O(int i2, String s1, int i3, String s2, int i5, String s3, int i7, String s4, int i8, String s5, int i9, String s6) {
            Intrinsics.checkNotNullParameter(s1, "s1");
            Intrinsics.checkNotNullParameter(s2, "s2");
            Intrinsics.checkNotNullParameter(s3, "s3");
            Intrinsics.checkNotNullParameter(s4, "s4");
            Intrinsics.checkNotNullParameter(s5, "s5");
            Intrinsics.checkNotNullParameter(s6, "s6");
            SJ0.CN3 cn3 = EditActivity.this.binding;
            SJ0.CN3 cn32 = null;
            if (cn3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn3 = null;
            }
            cn3.f9098S.rl.setText(s1);
            SJ0.CN3 cn33 = EditActivity.this.binding;
            if (cn33 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn33 = null;
            }
            cn33.f9098S.nr.setText(s2);
            SJ0.CN3 cn34 = EditActivity.this.binding;
            if (cn34 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn34 = null;
            }
            cn34.f9098S.J2.setText(s3);
            SJ0.CN3 cn35 = EditActivity.this.binding;
            if (cn35 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn35 = null;
            }
            cn35.f9098S.KN.setText(s4);
            SJ0.CN3 cn36 = EditActivity.this.binding;
            if (cn36 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn36 = null;
            }
            cn36.f9098S.mUb.setText(s5);
            SJ0.CN3 cn37 = EditActivity.this.binding;
            if (cn37 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn37 = null;
            }
            cn37.f9098S.qie.setText(s6);
            SJ0.CN3 cn38 = EditActivity.this.binding;
            if (cn38 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn38 = null;
            }
            cn38.f9098S.f9443t.setText(i2);
            SJ0.CN3 cn39 = EditActivity.this.binding;
            if (cn39 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn39 = null;
            }
            cn39.f9098S.f9439O.setText(i3);
            SJ0.CN3 cn310 = EditActivity.this.binding;
            if (cn310 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn310 = null;
            }
            cn310.f9098S.Uo.setText(i5);
            SJ0.CN3 cn311 = EditActivity.this.binding;
            if (cn311 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn311 = null;
            }
            cn311.f9098S.xMQ.setText(i7);
            SJ0.CN3 cn312 = EditActivity.this.binding;
            if (cn312 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn312 = null;
            }
            cn312.f9098S.gh.setText(i8);
            SJ0.CN3 cn313 = EditActivity.this.binding;
            if (cn313 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                cn32 = cn313;
            }
            cn32.f9098S.az.setText(i9);
        }

        @Override // HW.o
        public void dismiss() {
            if (this.f44438n || !Intrinsics.areEqual(EditActivity.this.infoBar, this)) {
                return;
            }
            this.f44438n = true;
            SJ0.CN3 cn3 = EditActivity.this.binding;
            SJ0.CN3 cn32 = null;
            if (cn3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn3 = null;
            }
            cn3.f9098S.getRoot().setVisibility(4);
            SJ0.CN3 cn33 = EditActivity.this.binding;
            if (cn33 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                cn32 = cn33;
            }
            cn32.iF.getRoot().setVisibility(0);
        }

        @Override // HW.o
        public void n(String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            if (this.f44438n || !Intrinsics.areEqual(EditActivity.this.infoBar, this)) {
                return;
            }
            SJ0.CN3 cn3 = EditActivity.this.binding;
            if (cn3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn3 = null;
            }
            cn3.f9098S.f9441o.setText(text);
        }

        @Override // HW.o
        public void nr(int i2) {
            if (this.f44438n || !Intrinsics.areEqual(EditActivity.this.infoBar, this)) {
                return;
            }
            SJ0.CN3 cn3 = EditActivity.this.binding;
            if (cn3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn3 = null;
            }
            cn3.f9098S.Ik.setImageResource(i2);
        }

        @Override // HW.o
        public void rl(int i2) {
            if (this.f44438n || !Intrinsics.areEqual(EditActivity.this.infoBar, this)) {
                return;
            }
            SJ0.CN3 cn3 = EditActivity.this.binding;
            if (cn3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn3 = null;
            }
            cn3.f9098S.ck.setImageResource(i2);
        }

        @Override // HW.o
        public void t(HW.w6 mode) {
            Intrinsics.checkNotNullParameter(mode, "mode");
            int i2 = j.$EnumSwitchMapping$0[mode.ordinal()];
            SJ0.CN3 cn3 = null;
            if (i2 == 1) {
                SJ0.CN3 cn32 = EditActivity.this.binding;
                if (cn32 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    cn32 = null;
                }
                cn32.f9098S.ty.setVisibility(0);
                SJ0.CN3 cn33 = EditActivity.this.binding;
                if (cn33 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    cn3 = cn33;
                }
                cn3.f9098S.HI.setVisibility(4);
                return;
            }
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            SJ0.CN3 cn34 = EditActivity.this.binding;
            if (cn34 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn34 = null;
            }
            cn34.f9098S.ty.setVisibility(4);
            SJ0.CN3 cn35 = EditActivity.this.binding;
            if (cn35 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                cn3 = cn35;
            }
            cn3.f9098S.HI.setVisibility(0);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public static final class Lu extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function0 f44439n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f44440t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Lu(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f44439n = function0;
            this.f44440t = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f44439n;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f44440t.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public static final class M implements Animator.AnimatorListener {
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
        }

        M() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            SJ0.CN3 cn3 = EditActivity.this.binding;
            if (cn3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn3 = null;
            }
            cn3.f9099T.setVisibility(4);
            SJ0.CN3 cn32 = EditActivity.this.binding;
            if (cn32 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn32 = null;
            }
            cn32.f9096N.setVisibility(4);
            SJ0.CN3 cn33 = EditActivity.this.binding;
            if (cn33 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn33 = null;
            }
            cn33.nHg.setVisibility(4);
            EditActivity.this.curGuideAnim = null;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    static final class Md extends SuspendLambda implements Function2 {
        final /* synthetic */ Function2 J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ EditActivity f44442O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f44443n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ xAo.DAz f44444t;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new Md(this.f44444t, this.f44442O, this.J2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(GJW.vd vdVar, Continuation continuation) {
            return ((Md) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Md(xAo.DAz dAz, EditActivity editActivity, Function2 function2, Continuation continuation) {
            super(2, continuation);
            this.f44444t = dAz;
            this.f44442O = editActivity;
            this.J2 = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Eu.I28 i28;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f44443n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                if (this.f44444t == xAo.DAz.f75225t) {
                    i28 = Eu.I28.E2;
                } else {
                    i28 = Eu.I28.f2375J;
                }
                InterfaceC2210n interfaceC2210nOG8 = this.f44442O.oG8();
                this.f44443n = 1;
                obj = Eu.Wre.n(interfaceC2210nOG8, i28, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            x0X.n nVar = (x0X.n) obj;
            Function2 function2 = this.J2;
            EditActivity editActivity = this.f44442O;
            boolean z2 = nVar instanceof n.C1266n;
            if (!z2) {
                if (nVar instanceof n.w6) {
                    function2.invoke(editActivity, Boxing.boxBoolean(((Boolean) ((n.w6) nVar).n()).booleanValue()));
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            Function2 function22 = this.J2;
            EditActivity editActivity2 = this.f44442O;
            if (z2) {
                function22.invoke(editActivity2, Boxing.boxBoolean(false));
            } else if (!(nVar instanceof n.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0003R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/alightcreative/app/motion/activities/EditActivity$Ml;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", TtmlNode.RUBY_CONTAINER, "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "LSJ0/Ogx;", "o", "LSJ0/Ogx;", "_binding", "g", "()LSJ0/Ogx;", "binding", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Ml extends jWj {

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
        private SJ0.Ogx _binding;

        private final SJ0.Ogx g() {
            SJ0.Ogx ogx = this._binding;
            Intrinsics.checkNotNull(ogx);
            return ogx;
        }

        @Override // androidx.fragment.app.Fragment
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            Intrinsics.checkNotNullParameter(inflater, "inflater");
            this._binding = SJ0.Ogx.t(inflater, container, false);
            ConstraintLayout constraintLayoutRl = g().getRoot();
            Intrinsics.checkNotNullExpressionValue(constraintLayoutRl, "getRoot(...)");
            return constraintLayoutRl;
        }

        @Override // androidx.fragment.app.Fragment
        public void onViewCreated(View view, Bundle savedInstanceState) {
            Intrinsics.checkNotNullParameter(view, "view");
            if (getActivity() instanceof EditActivity) {
                FragmentActivity activity = getActivity();
                Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.alightcreative.app.motion.activities.EditActivity");
                List shapeList = ((EditActivity) activity).getShapeList();
                Bundle arguments = getArguments();
                int i2 = arguments != null ? arguments.getInt("fromIndex") : 0;
                Bundle arguments2 = getArguments();
                int i3 = arguments2 != null ? arguments2.getInt("toIndex") : 0;
                Bundle arguments3 = getArguments();
                int i5 = arguments3 != null ? arguments3.getInt("decorationMargin") : 0;
                g().rl.setLayoutManager(new NoScrollGridLayoutManager(getContext(), 3, 0, false));
                if (i5 > 0) {
                    g().rl.addItemDecoration(new yc.xq(i5, i5, 0, 0));
                }
                g().rl.setVisibility(0);
                RecyclerView recyclerView = g().rl;
                List listSubList = shapeList.subList(i2, i3);
                FragmentActivity activity2 = getActivity();
                Intrinsics.checkNotNull(activity2, "null cannot be cast to non-null type com.alightcreative.app.motion.activities.EditActivity");
                recyclerView.setAdapter(new yc.Ew(listSubList, ((EditActivity) activity2).getAddShapeListener()));
            }
            super.onViewCreated(view, savedInstanceState);
        }

        @Override // androidx.fragment.app.Fragment
        public void onDestroyView() {
            super.onDestroyView();
            this._binding = null;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public static final class P extends Animatable2.AnimationCallback {
        final /* synthetic */ Drawable rl;

        P(Drawable drawable) {
            this.rl = drawable;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void rl(Drawable drawable) {
            ((AnimatedVectorDrawable) drawable).start();
        }

        @Override // android.graphics.drawable.Animatable2.AnimationCallback
        public void onAnimationEnd(Drawable drawable) {
            super.onAnimationEnd(drawable);
            SJ0.CN3 cn3 = EditActivity.this.binding;
            if (cn3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn3 = null;
            }
            ImageButton imageButton = cn3.te.KN;
            final Drawable drawable2 = this.rl;
            imageButton.post(new Runnable() { // from class: com.alightcreative.app.motion.activities.rMg
                @Override // java.lang.Runnable
                public final void run() {
                    EditActivity.P.rl(drawable2);
                }
            });
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public static final class Pl extends j.w6 {
        Pl() {
        }

        @Override // GK.j.n
        public boolean O(GK.j detector) {
            Intrinsics.checkNotNullParameter(detector, "detector");
            final EditActivity editActivity = EditActivity.this;
            XoT.C.Uo(this, new Function0() { // from class: com.alightcreative.app.motion.activities.YUN
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EditActivity.Pl.KN(editActivity);
                }
            });
            if (EditActivity.this.multiSelectDragInProgress && EditActivity.this.rmO().o() && !EditActivity.this.sceneHolder.getSelection().isMultiSelect()) {
                return false;
            }
            EditActivity.this.rmO().qie();
            EditActivity editActivity2 = EditActivity.this;
            LdY.Ml ml = editActivity2.undoManager;
            if (ml == null) {
                Intrinsics.throwUninitializedPropertyAccessException("undoManager");
                ml = null;
            }
            editActivity2.undoBatch = ml.J2();
            EditActivity.this.sceneHolder.setEditMode(2131362616);
            EditActivity.this.multiSelectScaleInProgress = true;
            EditActivity.this.prevFocusX = detector.nr();
            EditActivity.this.prevFocusY = detector.O();
            return true;
        }

        @Override // GK.j.n
        public void nr(GK.j jVar) {
            EditActivity.this.undoBatch.n();
        }

        @Override // GK.j.n
        public boolean rl(final GK.j detector) {
            SceneElement sceneElementCopy$default;
            Intrinsics.checkNotNullParameter(detector, "detector");
            final EditActivity editActivity = EditActivity.this;
            XoT.C.Uo(this, new Function0() { // from class: com.alightcreative.app.motion.activities.Dq
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EditActivity.Pl.Uo(editActivity, detector);
                }
            });
            if (!EditActivity.this.multiSelectScaleInProgress || EditActivity.this.multiSelectDragInProgress) {
                return true;
            }
            float fNr = detector.nr() - EditActivity.this.prevFocusX;
            float fO = detector.O() - EditActivity.this.prevFocusY;
            SceneHolder sceneHolder = EditActivity.this.sceneHolder;
            float fNr2 = detector.nr();
            float fO2 = detector.O();
            SJ0.CN3 cn3 = EditActivity.this.binding;
            if (cn3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn3 = null;
            }
            SurfaceView previewView = cn3.wTp;
            Intrinsics.checkNotNullExpressionValue(previewView, "previewView");
            Vector2D vector2DNr = yc.RP.nr(sceneHolder, fNr2, fO2, previewView);
            float fComponent1 = vector2DNr.getX();
            float fComponent2 = vector2DNr.getY();
            EditActivity.this.prevFocusX = detector.nr();
            EditActivity.this.prevFocusY = detector.O();
            List<SceneElement> elements = EditActivity.this.sceneHolder.getScene().getElements();
            EditActivity editActivity2 = EditActivity.this;
            ArrayList<SceneElement> arrayList = new ArrayList();
            for (Object obj : elements) {
                if (editActivity2.sceneHolder.getSelection().getSelectedElements().contains(Long.valueOf(((SceneElement) obj).getId()))) {
                    arrayList.add(obj);
                }
            }
            EditActivity editActivity3 = EditActivity.this;
            for (SceneElement sceneElement : arrayList) {
                Vector2D vector2D = (Vector2D) KeyableKt.valueAtTime(sceneElement.getTransform().getPivot(), 0.0f);
                if (sceneElement.getType() == SceneElementType.Camera) {
                    CameraProperties cameraProperties = sceneElement.getCameraProperties();
                    Keyable<Float> keyableScaleBy = KeyableKt.scaleBy(sceneElement.getCameraProperties().getFov(), detector.J2());
                    Intrinsics.checkNotNull(keyableScaleBy, "null cannot be cast to non-null type com.alightcreative.app.motion.scene.KeyableFloat");
                    sceneElementCopy$default = SceneElement.copy$default(sceneElement, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, CameraProperties.copy$default(cameraProperties, null, (KeyableFloat) keyableScaleBy, false, null, null, null, false, null, null, null, 1021, null), null, false, null, null, -1, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE, null);
                } else {
                    sceneElementCopy$default = SceneElement.copy$default(sceneElement, null, 0, 0, 0L, null, null, TransformKt.scaledBy$default(sceneElement.getTransform(), detector.J2(), detector.J2(), 0.0f, 0.0f, 12, null), null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -65, 127, null);
                }
                SceneElement sceneElement2 = sceneElementCopy$default;
                editActivity3.sceneHolder.update(SceneElement.copy$default(sceneElement2, null, 0, 0, 0L, null, null, TransformKt.translatedBy(TransformKt.translatedBy(TransformKt.locationScaledBy(TransformKt.translatedBy(TransformKt.translatedBy(sceneElement2.getTransform(), -fComponent1, -fComponent2), vector2D), new Vector2D(detector.J2(), detector.J2())), GeometryKt.unaryMinus(vector2D)), fComponent1 + fNr, fComponent2 + fO), null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -65, 127, null));
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String KN(EditActivity editActivity) {
            return "previewTouchGestureDetector:onScaleBegin inDragGesture=" + editActivity.multiSelectDragInProgress + " inScaleGesture=" + editActivity.multiSelectScaleInProgress;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String Uo(EditActivity editActivity, GK.j jVar) {
            return "previewTouchGestureDetector:onScale multiSelectDragInProgress=" + editActivity.multiSelectDragInProgress + " multiSelectScaleInProgress=" + editActivity.multiSelectScaleInProgress + " detector.scaleFactor=" + jVar.J2();
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public static final class Q extends AnimatorListenerAdapter {
        Q() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            SJ0.CN3 cn3 = EditActivity.this.binding;
            if (cn3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn3 = null;
            }
            cn3.jB.setVisibility(4);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public static final class QJ implements SurfaceHolder.Callback {
        QJ() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String J2() {
            return "EditActivitySurfaceCB: surfaceDestroyed";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String O() {
            return "EditActivitySurfaceCB: surfaceCreated";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String nr(int i2, int i3) {
            return "EditActivitySurfaceCB: surfaceChanged " + i2 + "," + i3;
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder holder, int i2, final int i3, final int i5) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            XoT.C.Uo(this, new Function0() { // from class: com.alightcreative.app.motion.activities.OSU
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EditActivity.QJ.nr(i3, i5);
                }
            });
            EditActivity.this.previewSurface = holder.getSurface();
            EditActivity.this.cKA();
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder holder) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            XoT.C.Uo(this, new Function0() { // from class: com.alightcreative.app.motion.activities.CY
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EditActivity.QJ.O();
                }
            });
            EditActivity.this.previewSurface = holder.getSurface();
            EditActivity.this.cKA();
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder holder) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            XoT.C.Uo(this, new Function0() { // from class: com.alightcreative.app.motion.activities.tq
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EditActivity.QJ.J2();
                }
            });
            EditActivity.this.previewSurface = null;
            EditActivity.this.cKA();
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    static final class SPz implements Function2 {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ boolean f44451t;

        /* synthetic */ class I28 extends FunctionReferenceImpl implements Function1 {
            I28(Object obj) {
                super(1, obj, IG.Ml.class, "onPremadeItemClicked", "onPremadeItemClicked(Lcom/alightcreative/app/motion/premade/domain/entities/LocalizedPremadeContentItem;)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                n((tN.n) obj);
                return Unit.INSTANCE;
            }

            public final void n(tN.n p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((IG.Ml) this.receiver).E2(p0);
            }
        }

        /* synthetic */ class Ml extends FunctionReferenceImpl implements Function0 {
            Ml(Object obj) {
                super(0, obj, IG.Ml.class, "onCloseButtonClicked", "onCloseButtonClicked()V", 0);
            }

            public final void n() {
                ((IG.Ml) this.receiver).nY();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                n();
                return Unit.INSTANCE;
            }
        }

        /* synthetic */ class Wre extends FunctionReferenceImpl implements Function1 {
            Wre(Object obj) {
                super(1, obj, IG.Ml.class, "onTemplateSelected", "onTemplateSelected(Lcom/alightcreative/app/motion/project/ProjectInfo$Local;)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                n((ProjectInfo.n) obj);
                return Unit.INSTANCE;
            }

            public final void n(ProjectInfo.n p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((IG.Ml) this.receiver).X(p0);
            }
        }

        /* synthetic */ class j extends FunctionReferenceImpl implements Function0 {
            j(Object obj) {
                super(0, obj, IG.Ml.class, "onBackPressed", "onBackPressed()V", 0);
            }

            public final void n() {
                ((IG.Ml) this.receiver).aYN();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                n();
                return Unit.INSTANCE;
            }
        }

        /* synthetic */ class n extends FunctionReferenceImpl implements Function1 {
            n(Object obj) {
                super(1, obj, IG.Ml.class, "onSelectedSceneType", "onSelectedSceneType(Lcom/alightcreative/app/motion/scene/SceneType;)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                n((SceneType) obj);
                return Unit.INSTANCE;
            }

            public final void n(SceneType p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((IG.Ml) this.receiver).e(p0);
            }
        }

        /* synthetic */ class w6 extends FunctionReferenceImpl implements Function1 {
            w6(Object obj) {
                super(1, obj, IG.Ml.class, "onElementSelectedForAdding", "onElementSelectedForAdding(Ljava/lang/String;)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                n((String) obj);
                return Unit.INSTANCE;
            }

            public final void n(String p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((IG.Ml) this.receiver).g(p0);
            }
        }

        SPz(boolean z2) {
            this.f44451t = z2;
        }

        static final class CN3 extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ EditActivity f44452O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f44453n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ ModalBottomSheetState f44454t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            CN3(ModalBottomSheetState modalBottomSheetState, EditActivity editActivity, Continuation continuation) {
                super(2, continuation);
                this.f44454t = modalBottomSheetState;
                this.f44452O = editActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new CN3(this.f44454t, this.f44452O, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(GJW.vd vdVar, Continuation continuation) {
                return ((CN3) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f44453n;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    ModalBottomSheetState modalBottomSheetState = this.f44454t;
                    this.f44453n = 1;
                    if (modalBottomSheetState.xMQ(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                this.f44452O.xxL().ViF();
                return Unit.INSTANCE;
            }
        }

        static final class fuX extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f44455n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ EditActivity f44456t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            fuX(EditActivity editActivity, Continuation continuation) {
                super(2, continuation);
                this.f44456t = editActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new fuX(this.f44456t, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(GJW.vd vdVar, Continuation continuation) {
                return ((fuX) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f44455n;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    this.f44455n = 1;
                    if (GJW.yg.rl(500L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                this.f44456t.xxL().ViF();
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit HI(EditActivity editActivity, AbstractC2254j action) {
            Intrinsics.checkNotNullParameter(action, "action");
            if (action instanceof AbstractC2254j.w6) {
                AbstractC2254j.w6 w6Var = (AbstractC2254j.w6) action;
                editActivity.zK(w6Var.n(), w6Var.rl());
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit gh(IG.n nVar, final EditActivity editActivity) {
            Intent intent = new Intent("android.intent.action.VIEW", ((n.Ml) nVar).n());
            nYs.j jVarInvoke = editActivity.CX().invoke();
            Fg.afx.ViF(editActivity, intent, true, jVarInvoke != null && jVarInvoke.te(), editActivity.lm1(), editActivity.rst(), editActivity.uQo(), (64 & 64) != 0 ? false : false, new Function2() { // from class: com.alightcreative.app.motion.activities.vt
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EditActivity.SPz.qie(editActivity, (String) obj, (LM.aC) obj2);
                }
            }, editActivity.oG8(), editActivity.CX());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit mUb(final EditActivity editActivity, GJW.vd vdVar, ModalBottomSheetState modalBottomSheetState, final IG.n action) {
            Intrinsics.checkNotNullParameter(action, "action");
            if (action instanceof n.I28) {
                n.I28 i28 = (n.I28) action;
                editActivity.Fz(i28.n(), i28.rl());
            } else if (action instanceof n.C0141n) {
                n.C0141n c0141n = (n.C0141n) action;
                editActivity.editAddDelegate.s7N(c0141n.n(), c0141n.rl());
                GWY.j.t(editActivity, c0141n.n());
            } else if (action instanceof n.j) {
                VS vs = editActivity.editAddDelegate;
                UUID uuidFromString = UUID.fromString(((n.j) action).n());
                Intrinsics.checkNotNullExpressionValue(uuidFromString, "fromString(...)");
                vs.N(uuidFromString);
            } else if (action instanceof n.Ml) {
                XoT.fuX.nY(editActivity, new Function0() { // from class: com.alightcreative.app.motion.activities.bd
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return EditActivity.SPz.gh(action, editActivity);
                    }
                });
            } else {
                SJ0.CN3 cn3 = null;
                if (Intrinsics.areEqual(action, n.w6.f4143n)) {
                    GJW.C.nr(vdVar, null, null, new CN3(modalBottomSheetState, editActivity, null), 3, null);
                } else {
                    if (!Intrinsics.areEqual(action, n.Wre.f4140n)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    SJ0.CN3 cn32 = editActivity.binding;
                    if (cn32 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        cn32 = null;
                    }
                    LinearLayout presetToast = cn32.E2;
                    Intrinsics.checkNotNullExpressionValue(presetToast, "presetToast");
                    SJ0.CN3 cn33 = editActivity.binding;
                    if (cn33 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        cn3 = cn33;
                    }
                    TextView presetToastText = cn3.f9102e;
                    Intrinsics.checkNotNullExpressionValue(presetToastText, "presetToastText");
                    Vil.CN3.n(editActivity, 2132019894, presetToastText, presetToast, new I28.j.n(100L, 300L, 2000L, 300L, 0.0f, HI0.afx.rl(editActivity, 70.0f), 16, null));
                }
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit qie(final EditActivity editActivity, String str, final LM.aC projectImportResult) {
            Intrinsics.checkNotNullParameter(str, "<unused var>");
            Intrinsics.checkNotNullParameter(projectImportResult, "projectImportResult");
            editActivity.az();
            if (!projectImportResult.nr().isEmpty()) {
                editActivity.j3I().v(new Function0() { // from class: com.alightcreative.app.motion.activities.Jl
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return EditActivity.SPz.az(editActivity, projectImportResult);
                    }
                });
            }
            editActivity.xxL().te();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean xMQ(GJW.vd vdVar, EditActivity editActivity, ModalBottomSheetValue it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (it != ModalBottomSheetValue.f22291n) {
                return true;
            }
            GJW.C.nr(vdVar, null, null, new fuX(editActivity, null), 3, null);
            return true;
        }

        public final void KN(Composer composer, int i2) {
            if ((i2 & 3) == 2 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-750151642, i2, -1, "com.alightcreative.app.motion.activities.EditActivity.onCreate.<anonymous> (EditActivity.kt:1749)");
            }
            IG.aC aCVar = (IG.aC) LiveDataAdapterKt.n(EditActivity.this.xxL().t(), composer, 0).getValue();
            if (this.f44451t && (aCVar instanceof aC.Ml)) {
                if (((aC.Ml) aCVar).n()) {
                    SJ0.CN3 cn3 = EditActivity.this.binding;
                    if (cn3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        cn3 = null;
                    }
                    CardView cardView = cn3.iF.f9409t;
                    if (cardView != null) {
                        cardView.setVisibility(0);
                    }
                } else {
                    SJ0.CN3 cn32 = EditActivity.this.binding;
                    if (cn32 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        cn32 = null;
                    }
                    CardView cardView2 = cn32.iF.f9409t;
                    if (cardView2 != null) {
                        cardView2.setVisibility(4);
                    }
                }
            }
            Object objIF = composer.iF();
            Composer.Companion companion = Composer.INSTANCE;
            if (objIF == companion.n()) {
                objIF = EffectsKt.mUb(EmptyCoroutineContext.INSTANCE, composer);
                composer.o(objIF);
            }
            final GJW.vd vdVar = (GJW.vd) objIF;
            Density density = (Density) composer.ty(CompositionLocalsKt.J2());
            composer.eF(489638492);
            final EditActivity editActivity = EditActivity.this;
            Object objIF2 = composer.iF();
            if (objIF2 == companion.n()) {
                objIF2 = new ModalBottomSheetState(ModalBottomSheetValue.f22291n, density, new Function1() { // from class: com.alightcreative.app.motion.activities.brv
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(EditActivity.SPz.xMQ(vdVar, editActivity, (ModalBottomSheetValue) obj));
                    }
                }, null, true, 8, null);
                composer.o(objIF2);
            }
            final ModalBottomSheetState modalBottomSheetState = (ModalBottomSheetState) objIF2;
            composer.Xw();
            g9s.n nVarUtY = EditActivity.this.utY();
            Object objXxL = EditActivity.this.xxL();
            composer.eF(489662772);
            boolean zE2 = composer.E2(objXxL);
            Object objIF3 = composer.iF();
            if (zE2 || objIF3 == companion.n()) {
                objIF3 = new j(objXxL);
                composer.o(objIF3);
            }
            composer.Xw();
            Function0 function0 = (Function0) ((KFunction) objIF3);
            Object objXxL2 = EditActivity.this.xxL();
            composer.eF(489664826);
            boolean zE22 = composer.E2(objXxL2);
            Object objIF4 = composer.iF();
            if (zE22 || objIF4 == companion.n()) {
                objIF4 = new n(objXxL2);
                composer.o(objIF4);
            }
            composer.Xw();
            Function1 function1 = (Function1) ((KFunction) objIF4);
            Object objXxL3 = EditActivity.this.xxL();
            composer.eF(489667297);
            boolean zE23 = composer.E2(objXxL3);
            Object objIF5 = composer.iF();
            if (zE23 || objIF5 == companion.n()) {
                objIF5 = new w6(objXxL3);
                composer.o(objIF5);
            }
            composer.Xw();
            Function1 function12 = (Function1) ((KFunction) objIF5);
            Object objXxL4 = EditActivity.this.xxL();
            composer.eF(489669787);
            boolean zE24 = composer.E2(objXxL4);
            Object objIF6 = composer.iF();
            if (zE24 || objIF6 == companion.n()) {
                objIF6 = new Ml(objXxL4);
                composer.o(objIF6);
            }
            composer.Xw();
            Function0 function02 = (Function0) ((KFunction) objIF6);
            Object objXxL5 = EditActivity.this.xxL();
            composer.eF(489672091);
            boolean zE25 = composer.E2(objXxL5);
            Object objIF7 = composer.iF();
            if (zE25 || objIF7 == companion.n()) {
                objIF7 = new I28(objXxL5);
                composer.o(objIF7);
            }
            composer.Xw();
            Function1 function13 = (Function1) ((KFunction) objIF7);
            Object objXxL6 = EditActivity.this.xxL();
            composer.eF(489674329);
            boolean zE26 = composer.E2(objXxL6);
            Object objIF8 = composer.iF();
            if (zE26 || objIF8 == companion.n()) {
                objIF8 = new Wre(objXxL6);
                composer.o(objIF8);
            }
            composer.Xw();
            Function1 function14 = (Function1) ((KFunction) objIF8);
            List list = EditActivity.this.projectsList;
            List list2 = EditActivity.this.templatesList;
            BitmapLruCache bitmapLruCache = EditActivity.this.elementThumbnailCache;
            SceneThumbnailMaker sceneThumbnailMaker = EditActivity.this.elementThumbnailMaker;
            if (sceneThumbnailMaker == null) {
                Intrinsics.throwUninitializedPropertyAccessException("elementThumbnailMaker");
                sceneThumbnailMaker = null;
            }
            AbstractC2461t.rl(aCVar, nVarUtY, function0, function1, function12, function02, function13, function14, list, list2, bitmapLruCache, sceneThumbnailMaker, modalBottomSheetState, composer, 0, ModalBottomSheetState.f22280O << 6);
            IG.Ml mlXxL = EditActivity.this.xxL();
            composer.eF(489689775);
            boolean zE27 = composer.E2(EditActivity.this) | composer.E2(vdVar) | composer.E2(modalBottomSheetState);
            final EditActivity editActivity2 = EditActivity.this;
            Object objIF9 = composer.iF();
            if (zE27 || objIF9 == companion.n()) {
                objIF9 = new Function1() { // from class: com.alightcreative.app.motion.activities.Kq
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return EditActivity.SPz.mUb(editActivity2, vdVar, modalBottomSheetState, (IG.n) obj);
                    }
                };
                composer.o(objIF9);
            }
            composer.Xw();
            uW.I28.rl(mlXxL, (Function1) objIF9, composer, 0);
            l.Xo xo = (l.Xo) LiveDataAdapterKt.n(EditActivity.this.hJ4().t(), composer, 0).getValue();
            composer.eF(489831266);
            if (xo instanceof Xo.n) {
                Xo.n nVar = (Xo.n) xo;
                okd.j jVarN = nVar.n();
                float fRl = nVar.rl();
                composer.eF(489842654);
                boolean zE28 = composer.E2(EditActivity.this);
                final EditActivity editActivity3 = EditActivity.this;
                Object objIF10 = composer.iF();
                if (zE28 || objIF10 == companion.n()) {
                    objIF10 = new Function0() { // from class: com.alightcreative.app.motion.activities.KWv
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return EditActivity.SPz.ty(editActivity3);
                        }
                    };
                    composer.o(objIF10);
                }
                composer.Xw();
                AbstractC2431fuX.nr(jVarN, fRl, (Function0) objIF10, composer, 0);
            }
            composer.Xw();
            l.CN3 cn3HJ4 = EditActivity.this.hJ4();
            composer.eF(489851208);
            boolean zE29 = composer.E2(EditActivity.this);
            final EditActivity editActivity4 = EditActivity.this;
            Object objIF11 = composer.iF();
            if (zE29 || objIF11 == companion.n()) {
                objIF11 = new Function1() { // from class: com.alightcreative.app.motion.activities.ZJ
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return EditActivity.SPz.HI(editActivity4, (AbstractC2254j) obj);
                    }
                };
                composer.o(objIF11);
            }
            composer.Xw();
            uW.I28.rl(cn3HJ4, (Function1) objIF11, composer, 0);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            KN((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit az(EditActivity editActivity, LM.aC aCVar) {
            if (editActivity.isDestroyed()) {
                return Unit.INSTANCE;
            }
            SceneElement sceneElementT = HW.C.T(editActivity);
            if (sceneElementT == null) {
                return Unit.INSTANCE;
            }
            List<Long> editingNestedSceneIds = editActivity.sceneHolder.getEditingNestedSceneIds();
            ActivityResultLauncher activityResultLauncher = editActivity.presetPreviewLauncher;
            Pair pair = TuplesKt.to("projectID", editActivity.Uo());
            Pair pair2 = TuplesKt.to("nestedSceneIdPath", CollectionsKt.toLongArray(editingNestedSceneIds));
            List listNr = aCVar.nr();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listNr, 10));
            Iterator it = listNr.iterator();
            while (it.hasNext()) {
                arrayList.add(((UUID) it.next()).toString());
            }
            Pair[] pairArr = {pair, pair2, TuplesKt.to("presets", arrayList.toArray(new String[0])), TuplesKt.to("sceneElementID", Long.valueOf(sceneElementT.getId())), TuplesKt.to("appliesFirstPreset", Boolean.TRUE)};
            Intent intent = new Intent(editActivity, (Class<?>) PresetPreviewActivity.class);
            intent.putExtras(BundleKt.n((Pair[]) Arrays.copyOf(pairArr, 5)));
            activityResultLauncher.n(intent);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit ty(EditActivity editActivity) {
            String uid = editActivity.rst().getUid();
            if (uid != null) {
                editActivity.hJ4().nY(uid);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public static final class UGc implements TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i5) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i5) {
        }

        UGc() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (EditActivity.this.projectNameUndoBatch == null) {
                EditActivity editActivity = EditActivity.this;
                editActivity.projectNameUndoBatch = editActivity.ck();
            }
            SceneHolder sceneHolder = EditActivity.this.sceneHolder;
            Scene scene = EditActivity.this.sceneHolder.getScene();
            SJ0.CN3 cn3 = EditActivity.this.binding;
            if (cn3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn3 = null;
            }
            sceneHolder.setScene(Scene.copy$default(scene, String.valueOf(cn3.te.Uo.getText()), 0, 0, 0, 0, 0, null, 0, null, null, null, null, null, 0, 0, 0, false, 0L, null, null, 1048574, null));
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public static final class Wre {
        private static final /* synthetic */ Wre[] J2;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f44460r;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final Wre f44459n = new Wre("SHORT", 0);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final Wre f44461t = new Wre("MEDIUM", 1);

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final Wre f44458O = new Wre("LONG", 2);

        private static final /* synthetic */ Wre[] n() {
            return new Wre[]{f44459n, f44461t, f44458O};
        }

        static {
            Wre[] wreArrN = n();
            J2 = wreArrN;
            f44460r = EnumEntriesKt.enumEntries(wreArrN);
        }

        public static Wre valueOf(String str) {
            return (Wre) Enum.valueOf(Wre.class, str);
        }

        public static Wre[] values() {
            return (Wre[]) J2.clone();
        }

        private Wre(String str, int i2) {
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public static final class Xo implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ View f44462n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ EditActivity f44463t;

        public Xo(View view, EditActivity editActivity) {
            this.f44462n = view;
            this.f44463t = editActivity;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (this.f44462n.getMeasuredWidth() <= 0 || this.f44462n.getMeasuredHeight() <= 0) {
                return;
            }
            this.f44462n.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            ImageButton imageButton = (ImageButton) this.f44462n;
            SJ0.CN3 cn3 = this.f44463t.binding;
            SJ0.CN3 cn32 = null;
            if (cn3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn3 = null;
            }
            cn3.jB.getLayoutParams().width = imageButton.getWidth();
            SJ0.CN3 cn33 = this.f44463t.binding;
            if (cn33 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                cn32 = cn33;
            }
            cn32.jB.requestLayout();
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public static final class Z implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final Z f44464n = new Z();

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof yc.tpM);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public static final class Zs extends Animatable2Compat.AnimationCallback {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Drawable f44465t;

        Zs(Drawable drawable) {
            this.f44465t = drawable;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void O(Drawable drawable) {
            ((AnimatedVectorDrawableCompat) drawable).start();
        }

        @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
        public void rl(Drawable drawable) {
            super.rl(drawable);
            SJ0.CN3 cn3 = EditActivity.this.binding;
            if (cn3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn3 = null;
            }
            ImageButton imageButton = cn3.te.KN;
            final Drawable drawable2 = this.f44465t;
            imageButton.post(new Runnable() { // from class: com.alightcreative.app.motion.activities.wK
                @Override // java.lang.Runnable
                public final void run() {
                    EditActivity.Zs.O(drawable2);
                }
            });
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public static final class aC implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ComparisonsKt.compareValues(Long.valueOf(((ProjectInfo.n) obj2).getLastModified()), Long.valueOf(((ProjectInfo.n) obj).getLastModified()));
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    /* synthetic */ class afx extends FunctionReferenceImpl implements Function1 {
        afx(Object obj) {
            super(1, obj, EditActivity.class, "logMultiLayerSelected", "logMultiLayerSelected(Ljava/util/Set;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            n((Set) obj);
            return Unit.INSTANCE;
        }

        public final void n(Set p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((EditActivity) this.receiver).RkF(p0);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    /* synthetic */ class ci extends FunctionReferenceImpl implements Function1 {
        ci(Object obj) {
            super(1, obj, EditActivity.class, "onSelectionChanged", "onSelectionChanged(Ljava/util/Set;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            n((Set) obj);
            return Unit.INSTANCE;
        }

        public final void n(Set p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((EditActivity) this.receiver).oW(p0);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public static final class eO implements View.OnLayoutChangeListener {
        /* JADX INFO: Access modifiers changed from: private */
        public static final String t(View view) {
            return "onLayoutChange: size=" + (view != null ? Integer.valueOf(view.getWidth()) : null) + "," + (view != null ? Integer.valueOf(view.getHeight()) : null);
        }

        eO() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(final View view, int i2, int i3, int i5, int i7, int i8, int i9, int i10, int i11) {
            XoT.C.Uo(this, new Function0() { // from class: com.alightcreative.app.motion.activities.vk
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EditActivity.eO.t(view);
                }
            });
            EditActivity.this.cKA();
            SJ0.CN3 cn3 = EditActivity.this.binding;
            SJ0.CN3 cn32 = null;
            if (cn3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn3 = null;
            }
            SurfaceView surfaceView = cn3.wTp;
            final EditActivity editActivity = EditActivity.this;
            surfaceView.postDelayed(new Runnable() { // from class: com.alightcreative.app.motion.activities.T2
                @Override // java.lang.Runnable
                public final void run() {
                    EditActivity.eO.nr(editActivity);
                }
            }, 150L);
            SJ0.CN3 cn33 = EditActivity.this.binding;
            if (cn33 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                cn32 = cn33;
            }
            cn32.wTp.removeOnLayoutChangeListener(this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void nr(EditActivity editActivity) {
            SJ0.CN3 cn3 = editActivity.binding;
            if (cn3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn3 = null;
            }
            cn3.wTp.setVisibility(0);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    /* synthetic */ class g9s extends FunctionReferenceImpl implements Function1 {
        g9s(Object obj) {
            super(1, obj, EditActivity.class, "onItemTapped", "onItemTapped(J)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            n(((Number) obj).longValue());
            return Unit.INSTANCE;
        }

        public final void n(long j2) {
            ((EditActivity) this.receiver).Tpq(j2);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public static final class h extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f44478n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentActivity componentActivity) {
            super(0);
            this.f44478n = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final ViewModelProvider.Factory invoke() {
            return this.f44478n.getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public static final class iwV implements yU.LEl {

        public /* synthetic */ class j {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[yU.qf.values().length];
                try {
                    iArr[yU.qf.f75660O.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[yU.qf.f75663t.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[yU.qf.f75661n.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        iwV() {
        }

        @Override // yU.LEl
        public void n(yU.qf option) {
            Intrinsics.checkNotNullParameter(option, "option");
            int i2 = j.$EnumSwitchMapping$0[option.ordinal()];
            if (i2 == 1) {
                EditActivity.this.lm1().n(new j.f(EditActivity.this.Uo()));
                EditActivity.this.E0X();
                return;
            }
            if (i2 == 2) {
                com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
                j.Xo wmPosition = jVar.getWmPosition();
                j.Xo xo = j.Xo.f45844t;
                if (wmPosition != xo) {
                    jVar.setWmPosition(xo);
                    EditActivity.this.qie();
                    return;
                }
                return;
            }
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            com.alightcreative.app.motion.persist.j jVar2 = com.alightcreative.app.motion.persist.j.INSTANCE;
            j.Xo wmPosition2 = jVar2.getWmPosition();
            j.Xo xo2 = j.Xo.f45843n;
            if (wmPosition2 != xo2) {
                jVar2.setWmPosition(xo2);
                EditActivity.this.qie();
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public static final class j {

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f44481Z;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final /* synthetic */ j[] f44483o;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f44482n = new j("SHAPE", 0);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final j f44485t = new j("IMAGE_VIDEO", 1);

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final j f44480O = new j("AUDIO", 2);
        public static final j J2 = new j("OBJECT", 3);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final j f44484r = new j("TEMPLATE", 4);

        private static final /* synthetic */ j[] n() {
            return new j[]{f44482n, f44485t, f44480O, J2, f44484r};
        }

        static {
            j[] jVarArrN = n();
            f44483o = jVarArrN;
            f44481Z = EnumEntriesKt.enumEntries(jVarArrN);
        }

        public static j valueOf(String str) {
            return (j) Enum.valueOf(j.class, str);
        }

        public static j[] values() {
            return (j[]) f44483o.clone();
        }

        private j(String str, int i2) {
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public static final class lej implements TextWatcher {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ AlertDialog f44488n;

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i5) {
        }

        public lej(AlertDialog alertDialog) {
            this.f44488n = alertDialog;
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i5) {
            Button buttonXMQ = this.f44488n.xMQ(-1);
            if (buttonXMQ != null) {
                buttonXMQ.setEnabled(!(charSequence == null || StringsKt.isBlank(charSequence)) || charSequence == null || charSequence.length() == 0);
            }
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public static final class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final View f44489n;
        private final View rl;

        public n(View tabView, View contentView) {
            Intrinsics.checkNotNullParameter(tabView, "tabView");
            Intrinsics.checkNotNullParameter(contentView, "contentView");
            this.f44489n = tabView;
            this.rl = contentView;
        }

        public final View n() {
            return this.rl;
        }

        public final View rl() {
            return this.f44489n;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public static final class o implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ComparisonsKt.compareValues(Long.valueOf(((ProjectInfo.n) obj2).getLastModified()), Long.valueOf(((ProjectInfo.n) obj).getLastModified()));
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public static final class psW extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function0 f44492n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f44493t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public psW(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f44492n = function0;
            this.f44493t = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f44492n;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f44493t.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public static final class qf implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final qf f44494n = new qf();

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof yc.tpM);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public static final class qz implements Runnable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f44496n = 200;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final int f44497t = 800;

        qz() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SJ0.CN3 cn3 = EditActivity.this.binding;
            SJ0.CN3 cn32 = null;
            if (cn3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn3 = null;
            }
            cn3.iF.qie.removeCallbacks(this);
            float fPow = (float) (Math.pow(1.0d - RangesKt.coerceIn((((System.nanoTime() - EditActivity.this.audioPeakTime) / 1000000) - ((long) this.f44496n)) / ((double) this.f44497t), 0.0d, 1.0d), 0.3d) * ((double) EditActivity.this.audioPeak));
            float fUo = EditActivity.this.j3I().Uo(HW.C.HI(EditActivity.this));
            if (fUo > fPow) {
                EditActivity.this.audioPeak = fUo;
                EditActivity.this.audioPeakTime = System.nanoTime();
                fPow = fUo;
            }
            SJ0.CN3 cn33 = EditActivity.this.binding;
            if (cn33 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn33 = null;
            }
            double d2 = fPow;
            cn33.iF.qie.setPeakColor(d2 > 0.99d ? 1894868358 : d2 > 0.9d ? 1892777690 : d2 > 0.75d ? 1895486373 : d2 > 0.5d ? 1885598406 : 1885136383);
            SJ0.CN3 cn34 = EditActivity.this.binding;
            if (cn34 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn34 = null;
            }
            cn34.iF.qie.setPeakLevel(fPow);
            SJ0.CN3 cn35 = EditActivity.this.binding;
            if (cn35 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn35 = null;
            }
            cn35.iF.qie.setLevel(fUo);
            SJ0.CN3 cn36 = EditActivity.this.binding;
            if (cn36 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                cn32 = cn36;
            }
            cn32.iF.qie.postOnAnimation(this);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public static final class rv6 extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f44500n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public rv6(ComponentActivity componentActivity) {
            super(0);
            this.f44500n = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final ViewModelProvider.Factory invoke() {
            return this.f44500n.getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public static final class u extends j.w6 {
        @Override // GK.j.n
        public boolean rl(final GK.j detector) {
            SceneElement sceneElementT;
            EditActivity editActivity;
            float f3;
            float f4;
            SceneElementType sceneElementType;
            SceneElement sceneElementCopy$default;
            Intrinsics.checkNotNullParameter(detector, "detector");
            final EditActivity editActivity2 = EditActivity.this;
            XoT.C.Uo(this, new Function0() { // from class: com.alightcreative.app.motion.activities.x2T
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EditActivity.u.Uo(editActivity2, detector);
                }
            });
            if (!EditActivity.this.inScaleGesture || EditActivity.this.inDragGesture || (sceneElementT = HW.C.T(EditActivity.this)) == null) {
                return true;
            }
            EditActivity editActivity3 = EditActivity.this;
            float fNr = detector.nr() - editActivity3.prevFocusX;
            float fO = detector.O() - editActivity3.prevFocusY;
            editActivity3.prevFocusX = detector.nr();
            editActivity3.prevFocusY = detector.O();
            SceneElementType type = sceneElementT.getType();
            SceneElementType sceneElementType2 = SceneElementType.Camera;
            if (type == sceneElementType2) {
                CameraProperties cameraProperties = sceneElementT.getCameraProperties();
                Keyable<Float> keyableScaleBy = KeyableKt.scaleBy(sceneElementT.getCameraProperties().getFov(), detector.J2());
                Intrinsics.checkNotNull(keyableScaleBy, "null cannot be cast to non-null type com.alightcreative.app.motion.scene.KeyableFloat");
                editActivity = editActivity3;
                sceneElementType = sceneElementType2;
                f3 = fNr;
                f4 = fO;
                sceneElementCopy$default = SceneElement.copy$default(sceneElementT, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, CameraProperties.copy$default(cameraProperties, null, (KeyableFloat) keyableScaleBy, false, null, null, null, false, null, null, null, 1021, null), null, false, null, null, -1, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE, null);
            } else {
                editActivity = editActivity3;
                f3 = fNr;
                f4 = fO;
                sceneElementType = sceneElementType2;
                sceneElementCopy$default = SceneElement.copy$default(sceneElementT, null, 0, 0, 0L, null, null, TransformKt.scaledBy$default(sceneElementT.getTransform(), detector.J2(), detector.J2(), 0.0f, 0.0f, 12, null), null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -65, 127, null);
            }
            SceneElement sceneElement = sceneElementCopy$default;
            SceneElement sceneElementCopy$default2 = SceneElement.copy$default(sceneElement, null, 0, 0, 0L, null, null, TransformKt.translatedBy(sceneElement.getTransform(), f3, f4), null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -65, 127, null);
            if (sceneElementCopy$default2.getType() != sceneElementType) {
                SceneElement sceneElementCopy$default3 = SceneElement.copy$default(sceneElementCopy$default2, null, 0, 0, 0L, null, null, TransformKt.translatedBy(sceneElementCopy$default2.getTransform(), -editActivity.prevFocusX, -editActivity.prevFocusY), null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -65, 127, null);
                SceneElement sceneElementCopy$default4 = SceneElement.copy$default(sceneElementCopy$default3, null, 0, 0, 0L, null, null, TransformKt.locationScaledBy(sceneElementCopy$default3.getTransform(), detector.J2(), detector.J2()), null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -65, 127, null);
                sceneElementCopy$default2 = SceneElement.copy$default(sceneElementCopy$default4, null, 0, 0, 0L, null, null, TransformKt.translatedBy(sceneElementCopy$default4.getTransform(), editActivity.prevFocusX, editActivity.prevFocusY), null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -65, 127, null);
            }
            editActivity.sceneHolder.update(sceneElementCopy$default2);
            return true;
        }

        u() {
        }

        @Override // GK.j.n
        public boolean O(GK.j detector) {
            Intrinsics.checkNotNullParameter(detector, "detector");
            final EditActivity editActivity = EditActivity.this;
            XoT.C.Uo(this, new Function0() { // from class: com.alightcreative.app.motion.activities.cY
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EditActivity.u.KN(editActivity);
                }
            });
            if (EditActivity.this.inDragGesture) {
                return false;
            }
            EditActivity.this.sceneHolder.setEditMode(2131362616);
            EditActivity.this.inScaleGesture = true;
            EditActivity.this.prevFocusX = detector.nr();
            EditActivity.this.prevFocusY = detector.O();
            return true;
        }

        @Override // GK.j.n
        public void nr(GK.j jVar) {
            EditActivity.this.undoBatch.n();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String KN(EditActivity editActivity) {
            return "previewTouchGestureDetector:onScaleBegin inDragGesture=" + editActivity.inDragGesture + " inScaleGesture=" + editActivity.inScaleGesture;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String Uo(EditActivity editActivity, GK.j jVar) {
            return "previewTouchGestureDetector:onScale inDragGesture=" + editActivity.inDragGesture + " inScaleGesture=" + editActivity.inScaleGesture + " detector.scaleFactor=" + jVar.J2();
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public static final class vd extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f44504n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public vd(ComponentActivity componentActivity) {
            super(0);
            this.f44504n = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final ViewModelStore invoke() {
            return this.f44504n.getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.alightcreative.app.motion.activities.EditActivity$z, reason: case insensitive filesystem */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public static final class SurfaceHolderCallbackC1692z implements SurfaceHolder.Callback {
        SurfaceHolderCallbackC1692z() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String J2() {
            return "EditActivitySurfaceCB: fullScreenSurfaceChanged";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String O() {
            return "EditActivitySurfaceCB: fullScreenSurfaceChanged";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String nr(int i2, int i3) {
            return "EditActivitySurfaceCB: fullScreenSurfaceChanged " + i2 + "," + i3;
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder holder, int i2, final int i3, final int i5) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            XoT.C.Uo(this, new Function0() { // from class: com.alightcreative.app.motion.activities.DG
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EditActivity.SurfaceHolderCallbackC1692z.nr(i3, i5);
                }
            });
            EditActivity.this.fullScreenPreviewSurface = holder.getSurface();
            EditActivity.this.cKA();
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder holder) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            XoT.C.Uo(this, new Function0() { // from class: com.alightcreative.app.motion.activities.Ir
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EditActivity.SurfaceHolderCallbackC1692z.O();
                }
            });
            EditActivity.this.fullScreenPreviewSurface = holder.getSurface();
            EditActivity.this.cKA();
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder holder) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            XoT.C.Uo(this, new Function0() { // from class: com.alightcreative.app.motion.activities.r6f
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EditActivity.SurfaceHolderCallbackC1692z.J2();
                }
            });
            EditActivity.this.fullScreenPreviewSurface = null;
            EditActivity.this.cKA();
        }
    }

    private final void JL() {
        this.playPending = false;
        SJ0.CN3 cn3 = this.binding;
        SJ0.CN3 cn32 = null;
        if (cn3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn3 = null;
        }
        cn3.iF.J2.setAlpha(1.0f);
        if (this.playing) {
            getWindow().addFlags(128);
            SJ0.CN3 cn33 = this.binding;
            if (cn33 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                cn32 = cn33;
            }
            cn32.iF.J2.setImageResource(com.alightcreative.app.motion.persist.j.INSTANCE.getLoopingPlay() ? 2131231540 : 2131231866);
        } else {
            getWindow().clearFlags(128);
            SJ0.CN3 cn34 = this.binding;
            if (cn34 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                cn32 = cn34;
            }
            cn32.iF.J2.setImageResource(com.alightcreative.app.motion.persist.j.INSTANCE.getLoopingPlay() ? 2131231053 : 2131231879);
        }
        GA().VK2(this.playing);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K0(int count) {
        for (int i2 = 0; i2 < count; i2++) {
            if (SceneKt.isEditingNestedScene(this.sceneHolder)) {
                this.sceneHolder.endEditingNestedScene();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Pc(View view, MotionEvent motionEvent) {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean PeJ(MotionEvent event) {
        LdY.Ml ml;
        if (isFinishing()) {
            return false;
        }
        if (NqA()) {
            RzC(this, false, 1, null);
            return false;
        }
        if (this.sceneHolder.getSelection().getDirectSelection() != null) {
            return false;
        }
        dDe().KN(event);
        Scene scene = this.sceneHolder.getScene();
        SceneHolder sceneHolder = this.sceneHolder;
        float x2 = event.getX();
        float y2 = event.getY();
        SJ0.CN3 cn3 = this.binding;
        if (cn3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn3 = null;
        }
        SurfaceView previewView = cn3.wTp;
        Intrinsics.checkNotNullExpressionValue(previewView, "previewView");
        Vector2D vector2DNr = yc.RP.nr(sceneHolder, x2, y2, previewView);
        float fComponent1 = vector2DNr.getX();
        float fComponent2 = vector2DNr.getY();
        List<SceneElement> elements = scene.getElements();
        ArrayList arrayList = new ArrayList();
        for (Object obj : elements) {
            SceneElement sceneElement = (SceneElement) obj;
            if (HW.C.XQ(this) >= sceneElement.getStartTime() && HW.C.XQ(this) < sceneElement.getEndTime() && SceneElementKt.hitTestAtTime(sceneElement, this.sceneHolder.getScene(), fComponent1, fComponent2, SceneElementKt.fractionalTime(sceneElement, HW.C.XQ(this)), this.sceneHolder.getUserPreviewMode(), HW.C.HI(this), scene.getFramesPerHundredSeconds())) {
                arrayList.add(obj);
            }
        }
        fVJ.w6 w6VarCY = CY();
        String string = this.projectHolder.Uo().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        cBL.j jVarN = w6VarCY.n(string);
        boolean zContains = SceneOverlayKt.getCurrentSceneOverlay(jVarN.t()).getOverlayTouchBounds(scene.getWidth(), scene.getHeight(), false, jVarN.rl()).contains(fComponent1, fComponent2);
        final SceneElement sceneElement2 = zContains ? null : (SceneElement) CollectionsKt.lastOrNull((List) arrayList);
        int actionMasked = event.getActionMasked();
        if (actionMasked != 0) {
            int i2 = 2;
            if (actionMasked == 1) {
                this.sceneHolder.setEditMode(this.prevEditMode);
                this.pendingLongPress = false;
                this.handler.removeCallbacks(new rfW(this));
                this.lastTapTime = event.getEventTime();
                if (this.multiSelectDragInProgress || this.multiSelectScaleInProgress) {
                    this.multiSelectDragInProgress = false;
                    this.multiSelectScaleInProgress = false;
                    this.undoBatch.n();
                } else if (this.didLongPressSelect) {
                    SceneHolder sceneHolder2 = this.sceneHolder;
                    sceneHolder2.setSelection(SceneSelection.copy$default(sceneHolder2.getSelection(), null, null, null, null, null, null, null, null, false, null, null, null, 3967, null));
                } else if (zContains) {
                    this.sceneHolder.setSelection(SceneKt.getEMPTY_SCENE_SELECTION());
                    lm1().n(new j.fuX("delete_watermark_click", null, i2, 0 == true ? 1 : 0));
                    if (scene.getWidth() >= scene.getHeight()) {
                        lm1().n(new j.Vgd(Uo(), rWZ.z.f73112n));
                        uBv();
                    } else {
                        lm1().n(new j.Vgd(Uo(), rWZ.z.f73113t));
                        E0X();
                    }
                } else if (sceneElement2 != null) {
                    if (!this.sceneHolder.getSelection().isMultiSelect()) {
                        Fv(sceneElement2);
                        QmE.iF iFVarLm1 = lm1();
                        String string2 = this.projectHolder.Uo().toString();
                        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                        iFVarLm1.n(new j.din(string2, rWZ.j.rl(sceneElement2)));
                    } else if (UpJ().contains(Long.valueOf(sceneElement2.getId()))) {
                        SceneHolder sceneHolder3 = this.sceneHolder;
                        sceneHolder3.setSelection(SceneSelection.copy$default(sceneHolder3.getSelection(), SetsKt.minus((Set<? extends Long>) UpJ(), Long.valueOf(sceneElement2.getId())), null, null, null, null, null, null, null, false, null, null, null, 4094, null));
                    } else {
                        SceneHolder sceneHolder4 = this.sceneHolder;
                        sceneHolder4.setSelection(SceneSelection.copy$default(sceneHolder4.getSelection(), SetsKt.plus((Set<? extends Long>) UpJ(), Long.valueOf(sceneElement2.getId())), null, null, null, null, null, null, null, false, null, null, null, 4094, null));
                        QmE.iF iFVarLm12 = lm1();
                        String strUo = Uo();
                        Set<Long> selectedElements = this.sceneHolder.getSelection().getSelectedElements();
                        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(selectedElements, 10));
                        Iterator<T> it = selectedElements.iterator();
                        while (it.hasNext()) {
                            SceneElement sceneElementElementById = SceneKt.elementById(this.sceneHolder.getScene(), Long.valueOf(((Number) it.next()).longValue()));
                            arrayList2.add(sceneElementElementById != null ? rWZ.j.rl(sceneElementElementById) : null);
                        }
                        iFVarLm12.n(new j.z3w(strUo, arrayList2));
                    }
                    SceneHolder sceneHolder5 = this.sceneHolder;
                    sceneHolder5.setSelection(SceneSelection.copy$default(sceneHolder5.getSelection(), null, null, null, null, null, null, null, null, false, null, null, null, 3967, null));
                } else {
                    this.sceneHolder.setSelection(SceneKt.getEMPTY_SCENE_SELECTION());
                }
            } else if (actionMasked != 2) {
                if (actionMasked == 5) {
                    this.pendingLongPress = false;
                    this.multiSelectScaleInProgress = true;
                    this.twoFingerGesture = true;
                    Runnable runnable = this.selectionHintRunnable;
                    if (runnable != null) {
                        this.handler.removeCallbacks(runnable);
                        this.selectionHintRunnable = null;
                        Unit unit = Unit.INSTANCE;
                    }
                    SceneHolder sceneHolder6 = this.sceneHolder;
                    sceneHolder6.setSelection(SceneSelection.copy$default(sceneHolder6.getSelection(), null, null, null, null, null, null, null, null, false, null, null, null, 3967, null));
                }
            } else if (this.multiSelectDragInProgress) {
                float f3 = fComponent1 - this.prevTouchX;
                float f4 = fComponent2 - this.prevTouchY;
                this.prevTouchX = fComponent1;
                this.prevTouchY = fComponent2;
                List<SceneElement> elements2 = this.sceneHolder.getScene().getElements();
                ArrayList<SceneElement> arrayList3 = new ArrayList();
                for (Object obj2 : elements2) {
                    if (this.sceneHolder.getSelection().getSelectedElements().contains(Long.valueOf(((SceneElement) obj2).getId()))) {
                        arrayList3.add(obj2);
                    }
                }
                for (SceneElement sceneElement3 : arrayList3) {
                    this.sceneHolder.update(SceneElement.copy$default(sceneElement3, null, 0, 0, 0L, null, null, TransformKt.translatedBy(sceneElement3.getTransform(), f3, f4), null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -65, 127, null));
                }
            } else if (this.pendingLongPress && Math.max(Math.abs(this.initialTouchX - event.getRawX()), Math.abs(this.initialTouchY - event.getRawY())) > JF7()) {
                rmO().qie();
                this.handler.removeCallbacks(new rfW(this));
                this.pendingLongPress = false;
                if (!this.multiSelectDragInProgress && !this.multiSelectScaleInProgress && this.sceneHolder.getSelection().isMultiSelect()) {
                    this.prevTouchX = fComponent1;
                    this.prevTouchY = fComponent2;
                    this.multiSelectDragInProgress = true;
                    LdY.Ml ml2 = this.undoManager;
                    if (ml2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("undoManager");
                        ml = null;
                    } else {
                        ml = ml2;
                    }
                    this.undoBatch = ml.J2();
                    this.sceneHolder.setEditMode(2131362616);
                }
            } else if (!this.twoFingerGesture && !this.pendingLongPress && !this.didLongPressSelect && !this.sceneHolder.getSelection().isMultiSelect()) {
                this.sceneHolder.setSelection(zContains ? SceneKt.overlaySelectionHint() : sceneElement2 != null ? SceneKt.selectionHint(sceneElement2) : SceneKt.getEMPTY_SCENE_SELECTION());
            }
        } else {
            Runnable runnable2 = this.selectionHintRunnable;
            if (runnable2 != null) {
                this.handler.removeCallbacks(runnable2);
                Unit unit2 = Unit.INSTANCE;
            }
            this.selectionHintRunnable = null;
            this.prevEditMode = this.sceneHolder.getEditMode();
            this.multiSelectDragInProgress = false;
            this.multiSelectScaleInProgress = false;
            this.pendingLongPress = true;
            this.pendingLongPressId = sceneElement2 != null ? sceneElement2.getId() : 0L;
            this.didLongPressSelect = false;
            this.initialTouchX = event.getRawX();
            this.initialTouchY = event.getRawY();
            this.twoFingerGesture = false;
            if (!this.sceneHolder.getSelection().isMultiSelect()) {
                if (zContains) {
                    this.sceneHolder.setSelection(SceneKt.overlaySelectionHint());
                } else {
                    this.sceneHolder.setSelection(SceneKt.getEMPTY_SCENE_SELECTION());
                    if (sceneElement2 != null) {
                        Runnable runnable3 = new Runnable() { // from class: com.alightcreative.app.motion.activities.qiB
                            @Override // java.lang.Runnable
                            public final void run() {
                                EditActivity.m7(this.f45612n, sceneElement2);
                            }
                        };
                        this.selectionHintRunnable = runnable3;
                        this.handler.postDelayed(runnable3, 80L);
                    }
                }
            }
            this.handler.postDelayed(new rfW(this), ViewConfiguration.getLongPressTimeout());
        }
        return true;
    }

    public static /* synthetic */ void RzC(EditActivity editActivity, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = true;
        }
        editActivity.UCQ(z2);
    }

    private final Set dSC() {
        Set setMutableSetOf = SetsKt.mutableSetOf(0, Integer.valueOf(this.sceneHolder.getScene().getTotalTime()));
        ON();
        Set set = setMutableSetOf;
        CollectionsKt.addAll(set, this.sceneHolder.getScene().getBookmarks().keySet());
        SceneElement sceneElementElementById = SceneKt.elementById(this.sceneHolder.getScene(), this.sceneHolder.getSelection().getDirectSelection());
        if (sceneElementElementById != null) {
            set.add(Integer.valueOf(sceneElementElementById.getStartTime()));
            set.add(Integer.valueOf(sceneElementElementById.getEndTime()));
            List<Keyable<? extends Object>> keyableProperties = SceneElementKt.getKeyableProperties(sceneElementElementById);
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = keyableProperties.iterator();
            while (it.hasNext()) {
                CollectionsKt.addAll(arrayList, ((Keyable) it.next()).getKeyframes());
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Integer.valueOf(KeyableKt.sceneTimeFromLocalTime(sceneElementElementById, ((Keyframe) it2.next()).getTime())));
            }
            CollectionsKt.addAll(set, arrayList2);
        }
        return setMutableSetOf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void iDk(EditActivity editActivity, View view) {
        RzC(editActivity, false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean mv(EditActivity editActivity, TextView textView, int i2, KeyEvent keyEvent) {
        if (i2 == 6) {
            Ml.j jVar = editActivity.projectNameUndoBatch;
            if (jVar != null) {
                jVar.n();
            }
            SJ0.CN3 cn3 = null;
            editActivity.projectNameUndoBatch = null;
            SJ0.CN3 cn32 = editActivity.binding;
            if (cn32 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn32 = null;
            }
            cn32.te.Uo.clearFocus();
            Object systemService = editActivity.getSystemService("input_method");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            InputMethodManager inputMethodManager = (InputMethodManager) systemService;
            SJ0.CN3 cn33 = editActivity.binding;
            if (cn33 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                cn3 = cn33;
            }
            inputMethodManager.hideSoftInputFromWindow(cn3.te.Uo.getWindowToken(), 0);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit pzT(EditActivity editActivity, int i2) {
        PbL(editActivity, i2, false, 2, null);
        return Unit.INSTANCE;
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        p0.startActivity(p1);
    }

    static /* synthetic */ void su(EditActivity editActivity, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = true;
        }
        editActivity.E9K(z2);
    }

    public final void UCQ(boolean animated) {
        SJ0.CN3 cn3 = null;
        this.selectedAddPopupTab = null;
        SJ0.CN3 cn32 = this.binding;
        if (cn32 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn32 = null;
        }
        if (cn32.nr.getRoot().getVisibility() != 0 || this.isAddPopupCloseAnimating) {
            return;
        }
        C6();
        if (!animated) {
            SJ0.CN3 cn33 = this.binding;
            if (cn33 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn33 = null;
            }
            cn33.nr.HI.setRotation(0.0f);
            SJ0.CN3 cn34 = this.binding;
            if (cn34 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn34 = null;
            }
            cn34.J2.setRotation(0.0f);
            SJ0.CN3 cn35 = this.binding;
            if (cn35 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn35 = null;
            }
            cn35.J2.setTranslationX(0.0f);
            SJ0.CN3 cn36 = this.binding;
            if (cn36 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn36 = null;
            }
            cn36.J2.setTranslationY(0.0f);
            SJ0.CN3 cn37 = this.binding;
            if (cn37 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                cn3 = cn37;
            }
            cn3.nr.getRoot().setVisibility(4);
            return;
        }
        SJ0.CN3 cn38 = this.binding;
        if (cn38 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn38 = null;
        }
        ImageButton buttonAdd = cn38.J2;
        Intrinsics.checkNotNullExpressionValue(buttonAdd, "buttonAdd");
        Pair pairJ2 = HI0.o7q.J2(buttonAdd);
        int iIntValue = ((Number) pairJ2.component1()).intValue();
        int iIntValue2 = ((Number) pairJ2.component2()).intValue();
        float f3 = iIntValue;
        SJ0.CN3 cn39 = this.binding;
        if (cn39 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn39 = null;
        }
        float width = f3 + (cn39.J2.getWidth() / 2.0f);
        float f4 = iIntValue2;
        SJ0.CN3 cn310 = this.binding;
        if (cn310 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn310 = null;
        }
        Vector2D vector2D = new Vector2D(width, f4 + (cn310.J2.getHeight() / 2.0f));
        SJ0.CN3 cn311 = this.binding;
        if (cn311 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn311 = null;
        }
        ImageView buttonCloseAdd = cn311.nr.HI;
        Intrinsics.checkNotNullExpressionValue(buttonCloseAdd, "buttonCloseAdd");
        Pair pairJ22 = HI0.o7q.J2(buttonCloseAdd);
        int iIntValue3 = ((Number) pairJ22.component1()).intValue();
        int iIntValue4 = ((Number) pairJ22.component2()).intValue();
        float f5 = iIntValue3;
        SJ0.CN3 cn312 = this.binding;
        if (cn312 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn312 = null;
        }
        float width2 = f5 + (cn312.J2.getWidth() / 2.0f);
        float f6 = iIntValue4;
        SJ0.CN3 cn313 = this.binding;
        if (cn313 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn313 = null;
        }
        Vector2D vector2D2 = new Vector2D(width2, f6 + (cn313.J2.getHeight() / 2.0f));
        SJ0.CN3 cn314 = this.binding;
        if (cn314 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn314 = null;
        }
        ConstraintLayout constraintLayoutRl = cn314.nr.getRoot();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutRl, "getRoot(...)");
        Pair pairJ23 = HI0.o7q.J2(constraintLayoutRl);
        int iIntValue5 = ((Number) pairJ23.component1()).intValue();
        int iIntValue6 = ((Number) pairJ23.component2()).intValue();
        float f7 = iIntValue5;
        SJ0.CN3 cn315 = this.binding;
        if (cn315 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn315 = null;
        }
        float width3 = f7 + cn315.nr.getRoot().getWidth();
        float f8 = iIntValue6;
        SJ0.CN3 cn316 = this.binding;
        if (cn316 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn316 = null;
        }
        Vector2D vector2DMinus = GeometryKt.minus(new Vector2D(width3, f8 + cn316.nr.getRoot().getHeight()), vector2D);
        Vector2D vector2DMinus2 = GeometryKt.minus(vector2D2, vector2D);
        SJ0.CN3 cn317 = this.binding;
        if (cn317 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn317 = null;
        }
        ConstraintLayout constraintLayoutRl2 = cn317.nr.getRoot();
        SJ0.CN3 cn318 = this.binding;
        if (cn318 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn318 = null;
        }
        int width4 = cn318.nr.getRoot().getWidth() - ((int) vector2DMinus.getX());
        SJ0.CN3 cn319 = this.binding;
        if (cn319 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn319 = null;
        }
        int height = cn319.nr.getRoot().getHeight() - ((int) vector2DMinus.getY());
        SJ0.CN3 cn320 = this.binding;
        if (cn320 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn320 = null;
        }
        float width5 = cn320.nr.getRoot().getWidth() * 0.95f;
        SJ0.CN3 cn321 = this.binding;
        if (cn321 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn321 = null;
        }
        Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(constraintLayoutRl2, width4, height, width5, cn321.nr.getRoot().getHeight() / 2.0f);
        animatorCreateCircularReveal.setDuration(130L);
        animatorCreateCircularReveal.setInterpolator(new AccelerateInterpolator());
        animatorCreateCircularReveal.addListener(new Dsr());
        SJ0.CN3 cn322 = this.binding;
        if (cn322 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn322 = null;
        }
        cn322.J2.setRotation(-22.5f);
        SJ0.CN3 cn323 = this.binding;
        if (cn323 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn323 = null;
        }
        cn323.J2.setTranslationX((-vector2DMinus2.getX()) / 2.0f);
        SJ0.CN3 cn324 = this.binding;
        if (cn324 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn324 = null;
        }
        cn324.J2.setTranslationY(vector2DMinus2.getY() / 2.0f);
        SJ0.CN3 cn325 = this.binding;
        if (cn325 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            cn3 = cn325;
        }
        cn3.J2.animate().rotation(0.0f).translationX(0.0f).translationY(0.0f).setStartDelay(90L).setDuration(90L).setInterpolator(new DecelerateInterpolator()).start();
        animatorCreateCircularReveal.start();
    }

    @Override // com.alightcreative.app.motion.activities.prm, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) throws JSONException {
        super.onCreate(savedInstanceState);
        Xj(new PJ9.Ml(this, lm1()));
        Nnj();
        aO.z.r();
        if (com.alightcreative.app.motion.persist.j.INSTANCE.getGrayTheme()) {
            setTheme(2132082707);
        }
        uQo().Ik(this);
        boolean z2 = false;
        FirebaseCrashlytics.getInstance().setCustomKey(SafeDKWebAppInterface.f62917c, false);
        this.trackThumbnailMaker = new SceneThumbnailMaker("editActivityThumbnails", this, 256, 256);
        this.elementThumbnailMaker = new SceneThumbnailMaker("editActivityThumbnails", this, 512, 512);
        SceneHolder sceneHolder = this.sceneHolder;
        SceneThumbnailMaker sceneThumbnailMaker = this.trackThumbnailMaker;
        SJ0.CN3 cn3 = null;
        if (sceneThumbnailMaker == null) {
            Intrinsics.throwUninitializedPropertyAccessException("trackThumbnailMaker");
            sceneThumbnailMaker = null;
        }
        EAC(new yc.mz(sceneHolder, sceneThumbnailMaker, new Function0() { // from class: com.alightcreative.app.motion.activities.XK
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EditActivity.NU(this.f44821n);
            }
        }));
        XoT.C.Uo(this, new Function0() { // from class: com.alightcreative.app.motion.activities.tl
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EditActivity.z7();
            }
        });
        this.projectHolder.mUb(savedInstanceState, getIntent());
        GJW.C.nr(LifecycleOwnerKt.n(this), null, null, new s4(null), 3, null);
        xAo.I28 i28UQo = uQo();
        String string = this.projectHolder.Uo().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        i28UQo.HI(string);
        Vzj(Si.l3D.rl("editActivityPlayer", this, lm1(), this.sceneHolder, false, 16, null));
        j3I().XQ(new Function1() { // from class: com.alightcreative.app.motion.activities.USE
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EditActivity.pzT(this.f44789n, ((Integer) obj).intValue());
            }
        });
        j3I().ty(new Function1() { // from class: com.alightcreative.app.motion.activities.WE7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EditActivity.YR2(this.f44808n, ((Boolean) obj).booleanValue());
            }
        });
        j3I().fD(new Function1() { // from class: com.alightcreative.app.motion.activities.X
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                EditActivity editActivity = this.f44811n;
                android.support.v4.media.j.n(obj);
                return EditActivity.IZz(editActivity, null);
            }
        });
        vH3().P5(new ci(this));
        vH3().U(new g9s(this));
        vH3().jB(new afx(this));
        AJ().rl(this, this.projectHolder.Uo().toString());
        LdY.j jVar = new LdY.j(this, "scene", this.sceneHolder.getScene(), true, new Function1() { // from class: com.alightcreative.app.motion.activities.q4d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EditActivity.AUF(this.f45599n, (Scene) obj);
            }
        });
        this.undoManager = jVar;
        jVar.az(savedInstanceState);
        getSupportFragmentManager().ty(this.onBackStackChangedListener);
        SJ0.CN3 cn3T = SJ0.CN3.t(getLayoutInflater());
        this.binding = cn3T;
        if (cn3T == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn3T = null;
        }
        setContentView(cn3T.getRoot());
        SJ0.CN3 cn32 = this.binding;
        if (cn32 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn32 = null;
        }
        ViewCompat.Org(cn32.getRoot(), new OnApplyWindowInsetsListener() { // from class: com.alightcreative.app.motion.activities.OG
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat n(View view, WindowInsetsCompat windowInsetsCompat) {
                return EditActivity.dt(view, windowInsetsCompat);
            }
        });
        SJ0.CN3 cn33 = this.binding;
        if (cn33 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn33 = null;
        }
        cn33.fD.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.OA
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditActivity.Xf(this.f44706n, view);
            }
        });
        SJ0.CN3 cn34 = this.binding;
        if (cn34 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn34 = null;
        }
        cn34.fD.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.alightcreative.app.motion.activities.HcS
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return EditActivity.Ah(this.f44571n, view);
            }
        });
        SJ0.CN3 cn35 = this.binding;
        if (cn35 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn35 = null;
        }
        cn35.iF.xMQ.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.VoU
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditActivity.N4(this.f44804n, view);
            }
        });
        SJ0.CN3 cn36 = this.binding;
        if (cn36 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn36 = null;
        }
        cn36.iF.mUb.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.Dhl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditActivity.oeS(this.f44386n, view);
            }
        });
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        final Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
        final Ref.FloatRef floatRef = new Ref.FloatRef();
        final Ref.FloatRef floatRef2 = new Ref.FloatRef();
        SJ0.CN3 cn37 = this.binding;
        if (cn37 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn37 = null;
        }
        cn37.f9100X.setOnTouchListener(new View.OnTouchListener() { // from class: com.alightcreative.app.motion.activities.l3h
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return EditActivity.lwA(floatRef, floatRef2, this, view, motionEvent);
            }
        });
        SJ0.CN3 cn38 = this.binding;
        if (cn38 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn38 = null;
        }
        cn38.Xw.setVisibility(8);
        SJ0.CN3 cn39 = this.binding;
        if (cn39 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn39 = null;
        }
        cn39.wTp.setOnTouchListener(new View.OnTouchListener() { // from class: com.alightcreative.app.motion.activities.GC
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return EditActivity.yox(this.f44557n, booleanRef, booleanRef2, view, motionEvent);
            }
        });
        cKA();
        SJ0.CN3 cn310 = this.binding;
        if (cn310 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn310 = null;
        }
        cn310.wTp.setVisibility(4);
        SJ0.CN3 cn311 = this.binding;
        if (cn311 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn311 = null;
        }
        cn311.wTp.addOnLayoutChangeListener(new eO());
        SJ0.CN3 cn312 = this.binding;
        if (cn312 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn312 = null;
        }
        SurfaceView fullScreenPreviewView = cn312.f9105o;
        Intrinsics.checkNotNullExpressionValue(fullScreenPreviewView, "fullScreenPreviewView");
        HI0.o7q.gh(fullScreenPreviewView);
        SJ0.CN3 cn313 = this.binding;
        if (cn313 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn313 = null;
        }
        cn313.f9105o.getHolder().addCallback(new SurfaceHolderCallbackC1692z());
        SJ0.CN3 cn314 = this.binding;
        if (cn314 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn314 = null;
        }
        cn314.wTp.getHolder().addCallback(new QJ());
        GA().kC(new Function5() { // from class: com.alightcreative.app.motion.activities.S0R
            @Override // kotlin.jvm.functions.Function5
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                return EditActivity.f3(this.f44743n, (MotionEvent) obj, ((Integer) obj2).intValue(), ((Integer) obj3).intValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue());
            }
        });
        SJ0.CN3 cn315 = this.binding;
        if (cn315 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn315 = null;
        }
        ConstraintLayout constraintLayoutRl = cn315.nr.getRoot();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutRl, "getRoot(...)");
        HI0.o7q.gh(constraintLayoutRl);
        SJ0.CN3 cn316 = this.binding;
        if (cn316 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn316 = null;
        }
        View mediaAccessBg = cn316.ViF;
        Intrinsics.checkNotNullExpressionValue(mediaAccessBg, "mediaAccessBg");
        HI0.o7q.gh(mediaAccessBg);
        SJ0.CN3 cn317 = this.binding;
        if (cn317 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn317 = null;
        }
        ConstraintLayout miniBrowserStorageAccessNotice = cn317.nr.f9381S;
        Intrinsics.checkNotNullExpressionValue(miniBrowserStorageAccessNotice, "miniBrowserStorageAccessNotice");
        HI0.o7q.gh(miniBrowserStorageAccessNotice);
        SJ0.CN3 cn318 = this.binding;
        if (cn318 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn318 = null;
        }
        cn318.nr.f9381S.setVisibility(4);
        SJ0.CN3 cn319 = this.binding;
        if (cn319 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn319 = null;
        }
        cn319.WPU.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.uuz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditActivity.Nt(this.f45695n, view);
            }
        });
        SJ0.CN3 cn320 = this.binding;
        if (cn320 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn320 = null;
        }
        cn320.nr.mUb.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.G8Q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditActivity.Gh(this.f44555n, view);
            }
        });
        SJ0.CN3 cn321 = this.binding;
        if (cn321 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn321 = null;
        }
        cn321.J2.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.bj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditActivity.OQ(this.f44914n, view);
            }
        });
        SJ0.CN3 cn322 = this.binding;
        if (cn322 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn322 = null;
        }
        cn322.nr.HI.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.PS
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditActivity.iDk(this.f44716n, view);
            }
        });
        j jVar2 = j.f44482n;
        SJ0.CN3 cn323 = this.binding;
        if (cn323 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn323 = null;
        }
        LinearLayout tabAddShape = cn323.nr.te;
        Intrinsics.checkNotNullExpressionValue(tabAddShape, "tabAddShape");
        SJ0.CN3 cn324 = this.binding;
        if (cn324 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn324 = null;
        }
        FrameLayout tabContentAddShape = cn324.nr.E2;
        Intrinsics.checkNotNullExpressionValue(tabContentAddShape, "tabContentAddShape");
        Pair pair = TuplesKt.to(jVar2, new n(tabAddShape, tabContentAddShape));
        j jVar3 = j.f44485t;
        SJ0.CN3 cn325 = this.binding;
        if (cn325 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn325 = null;
        }
        LinearLayout tabAddImageVideo = cn325.nr.nY;
        Intrinsics.checkNotNullExpressionValue(tabAddImageVideo, "tabAddImageVideo");
        SJ0.CN3 cn326 = this.binding;
        if (cn326 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn326 = null;
        }
        FrameLayout mediaListHolder = cn326.nr.f9384Z;
        Intrinsics.checkNotNullExpressionValue(mediaListHolder, "mediaListHolder");
        Pair pair2 = TuplesKt.to(jVar3, new n(tabAddImageVideo, mediaListHolder));
        j jVar4 = j.f44480O;
        SJ0.CN3 cn327 = this.binding;
        if (cn327 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn327 = null;
        }
        LinearLayout tabAddAudio = cn327.nr.ViF;
        Intrinsics.checkNotNullExpressionValue(tabAddAudio, "tabAddAudio");
        SJ0.CN3 cn328 = this.binding;
        if (cn328 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn328 = null;
        }
        RecyclerView addAudioList = cn328.nr.rl;
        Intrinsics.checkNotNullExpressionValue(addAudioList, "addAudioList");
        Pair pair3 = TuplesKt.to(jVar4, new n(tabAddAudio, addAudioList));
        j jVar5 = j.J2;
        SJ0.CN3 cn329 = this.binding;
        if (cn329 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn329 = null;
        }
        LinearLayout tabAddObject = cn329.nr.f9386g;
        Intrinsics.checkNotNullExpressionValue(tabAddObject, "tabAddObject");
        SJ0.CN3 cn330 = this.binding;
        if (cn330 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn330 = null;
        }
        FrameLayout tabContentAddObject = cn330.nr.fD;
        Intrinsics.checkNotNullExpressionValue(tabContentAddObject, "tabContentAddObject");
        Pair pair4 = TuplesKt.to(jVar5, new n(tabAddObject, tabContentAddObject));
        j jVar6 = j.f44484r;
        SJ0.CN3 cn331 = this.binding;
        if (cn331 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn331 = null;
        }
        LinearLayout tabAddTemplates = cn331.nr.iF;
        Intrinsics.checkNotNullExpressionValue(tabAddTemplates, "tabAddTemplates");
        SJ0.CN3 cn332 = this.binding;
        if (cn332 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn332 = null;
        }
        RecyclerView addCompList = cn332.nr.nr;
        Intrinsics.checkNotNullExpressionValue(addCompList, "addCompList");
        Map mapMapOf = MapsKt.mapOf(pair, pair2, pair3, pair4, TuplesKt.to(jVar6, new n(tabAddTemplates, addCompList)));
        this.addTabs = mapMapOf;
        if (mapMapOf == null) {
            Intrinsics.throwUninitializedPropertyAccessException("addTabs");
            mapMapOf = null;
        }
        for (Map.Entry entry : mapMapOf.entrySet()) {
            final j jVar7 = (j) entry.getKey();
            ((n) entry.getValue()).rl().setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.CnF
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    EditActivity.Md(jVar7, this, view);
                }
            });
            if (jVar7 == j.J2) {
                boolean zContains = rst().Uo().contains(kgE.K.f70070N);
                boolean zKN = AJ().KN();
                SJ0.CN3 cn333 = this.binding;
                if (cn333 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    cn333 = null;
                }
                cn333.nr.XQ.setImageDrawable(AppCompatResources.rl(this, 2131230983));
                SJ0.CN3 cn334 = this.binding;
                if (cn334 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    cn334 = null;
                }
                cn334.nr.XQ.setVisibility((zContains || zKN) ? 0 : 8);
                SJ0.CN3 cn335 = this.binding;
                if (cn335 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    cn335 = null;
                }
                cn335.nr.f9382T.setVisibility((zContains || zKN) ? 8 : 0);
            }
        }
        SJ0.CN3 cn336 = this.binding;
        if (cn336 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn336 = null;
        }
        cn336.nr.f9390t.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditActivity.fz(this.f45696n, view);
            }
        });
        SJ0.CN3 cn337 = this.binding;
        if (cn337 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn337 = null;
        }
        cn337.nr.KN.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.XpT
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditActivity.KV3(this.f44827n, view);
            }
        });
        SJ0.CN3 cn338 = this.binding;
        if (cn338 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn338 = null;
        }
        cn338.nr.J2.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.ZI
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditActivity.bG(this.f44844n, view);
            }
        });
        SJ0.CN3 cn339 = this.binding;
        if (cn339 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn339 = null;
        }
        cn339.nr.f9380O.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.dip
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditActivity.Ieo(this.f45054n, view);
            }
        });
        SJ0.CN3 cn340 = this.binding;
        if (cn340 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn340 = null;
        }
        cn340.nr.az.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.KA5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditActivity.Oa(this.f44597n, view);
            }
        });
        SJ0.CN3 cn341 = this.binding;
        if (cn341 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn341 = null;
        }
        cn341.nr.qie.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.E6O
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditActivity.EpR(this.f44395n, view);
            }
        });
        SJ0.CN3 cn342 = this.binding;
        if (cn342 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn342 = null;
        }
        cn342.nr.ty.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.dB
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditActivity.Zh(this.f45044n, view);
            }
        });
        SJ0.CN3 cn343 = this.binding;
        if (cn343 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn343 = null;
        }
        cn343.iF.nr.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditActivity.a85(this.f45641n, view);
            }
        });
        SJ0.CN3 cn344 = this.binding;
        if (cn344 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn344 = null;
        }
        ImageButton imageButton = cn344.iF.J2;
        com.alightcreative.app.motion.persist.j jVar8 = com.alightcreative.app.motion.persist.j.INSTANCE;
        imageButton.setImageResource(jVar8.getLoopingPlay() ? 2131231053 : 2131231879);
        SJ0.CN3 cn345 = this.binding;
        if (cn345 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn345 = null;
        }
        cn345.iF.J2.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.vi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditActivity.x0p(this.f45702n, view);
            }
        });
        SJ0.CN3 cn346 = this.binding;
        if (cn346 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn346 = null;
        }
        cn346.iF.J2.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.alightcreative.app.motion.activities.ab
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return EditActivity.f14(this.f44865n, view);
            }
        });
        LdY.Ml ml = this.undoManager;
        if (ml == null) {
            Intrinsics.throwUninitializedPropertyAccessException("undoManager");
            ml = null;
        }
        ml.r(new Function2() { // from class: com.alightcreative.app.motion.activities.BNf
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return EditActivity.XT(this.f44341n, ((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
            }
        });
        SJ0.CN3 cn347 = this.binding;
        if (cn347 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn347 = null;
        }
        cn347.iF.gh.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.xe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditActivity.L3(this.f45731n, view);
            }
        });
        SJ0.CN3 cn348 = this.binding;
        if (cn348 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn348 = null;
        }
        cn348.iF.KN.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.ou
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditActivity.ILJ(this.f45568n, view);
            }
        });
        SJ0.CN3 cn349 = this.binding;
        if (cn349 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn349 = null;
        }
        cn349.te.Uo.setText(this.sceneHolder.getScene().getTitle());
        SJ0.CN3 cn350 = this.binding;
        if (cn350 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn350 = null;
        }
        cn350.te.Uo.setOnTouchListener(new View.OnTouchListener() { // from class: com.alightcreative.app.motion.activities.qW
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return EditActivity.FaL(this.f45604n, view, motionEvent);
            }
        });
        SJ0.CN3 cn351 = this.binding;
        if (cn351 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn351 = null;
        }
        cn351.te.Uo.addTextChangedListener(new UGc());
        SJ0.CN3 cn352 = this.binding;
        if (cn352 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn352 = null;
        }
        cn352.te.Uo.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.alightcreative.app.motion.activities.JF
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                return EditActivity.mv(this.f44587n, textView, i2, keyEvent);
            }
        });
        SJ0.CN3 cn353 = this.binding;
        if (cn353 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn353 = null;
        }
        cn353.te.Uo.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.alightcreative.app.motion.activities.r6h
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z3) {
                EditActivity.G0F(this.f45619n, view, z3);
            }
        });
        SJ0.CN3 cn354 = this.binding;
        if (cn354 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn354 = null;
        }
        cn354.te.nr.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.aXh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditActivity.azi(this.f44864n, view);
            }
        });
        SJ0.CN3 cn355 = this.binding;
        if (cn355 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn355 = null;
        }
        cn355.te.rl.setLayoutManager(new LinearLayoutManager(this, 0, false));
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(2131165967);
        SJ0.CN3 cn356 = this.binding;
        if (cn356 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn356 = null;
        }
        cn356.te.rl.addItemDecoration(new yc.xq(dimensionPixelOffset, dimensionPixelOffset, 0, 0));
        SJ0.CN3 cn357 = this.binding;
        if (cn357 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn357 = null;
        }
        final C1462o c1462o = cn357.rV9;
        ConstraintLayout constraintLayoutRl2 = c1462o.getRoot();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutRl2, "getRoot(...)");
        HI0.o7q.gh(constraintLayoutRl2);
        c1462o.ck.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.cDu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditActivity.sl(this.f44925n, view);
            }
        });
        c1462o.mUb.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.Dbq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditActivity.Mg(this.f44379n, view);
            }
        });
        c1462o.qie.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.r4t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditActivity.cm(this.f45618n, view);
            }
        });
        c1462o.gh.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.Xq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditActivity.f3k(this.f44828n, view);
            }
        });
        c1462o.HI.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.Z4b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditActivity.oh(c1462o, view);
            }
        });
        c1462o.ty.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.BW
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditActivity.ag(c1462o, view);
            }
        });
        c1462o.Uo.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditActivity.sPk(this.f45231n, view);
            }
        });
        c1462o.f9577t.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.ua
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditActivity.Eq(this.f45694n, view);
            }
        });
        c1462o.KN.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.FOg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditActivity.CUD(this.f44532n, view);
            }
        });
        c1462o.xMQ.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.dq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditActivity.WwU(this.f45055n, view);
            }
        });
        c1462o.nr.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.gW
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditActivity.Jeq(this.f45255n, view);
            }
        });
        c1462o.rl.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.Xtu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditActivity.flZ(this.f44829n, view);
            }
        });
        c1462o.J2.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.nBa
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditActivity.Gy(this.f45550n, view);
            }
        });
        c1462o.f9573O.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.kJ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditActivity.vF(this.f45305n, view);
            }
        });
        SJ0.CN3 cn358 = this.binding;
        if (cn358 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn358 = null;
        }
        SJ0.C c2 = cn358.f9108v;
        c2.f9092t.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.Wqz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditActivity.Kkh(this.f44809n, view);
            }
        });
        c2.rl.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.zU
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditActivity.Gd(this.f45764n, view);
            }
        });
        c2.nr.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.Lj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditActivity.aeB(this.f44622n, view);
            }
        });
        c2.mUb.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.yvO
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditActivity.WJ(this.f45753n, view);
            }
        });
        c2.xMQ.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.SUH
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditActivity.T6(this.f44747n, view);
            }
        });
        c2.gh.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.eD
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditActivity.LSw(this.f45058n, view);
            }
        });
        c2.f9090O.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.ng
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditActivity.TVz(this.f45561n, view);
            }
        });
        c2.J2.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.SF
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditActivity.LeN(this.f44745n, view);
            }
        });
        c2.KN.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.wE9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditActivity.Gx9(this.f45712n, view);
            }
        });
        c2.Uo.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.RVT
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditActivity.NT(this.f44740n, view);
            }
        });
        SJ0.CN3 cn359 = this.binding;
        if (cn359 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn359 = null;
        }
        cn359.te.f9118O.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.OW
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditActivity.tYa(this.f44713n, view);
            }
        });
        SJ0.CN3 cn360 = this.binding;
        if (cn360 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn360 = null;
        }
        cn360.te.J2.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.rXW
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditActivity.bGT(this.f45630n, view);
            }
        });
        SJ0.CN3 cn361 = this.binding;
        if (cn361 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn361 = null;
        }
        cn361.rV9.az.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.BH
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditActivity.kI(this.f44339n, view);
            }
        });
        SJ0.CN3 cn362 = this.binding;
        if (cn362 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn362 = null;
        }
        RecyclerViewEx timeline = cn362.bzg;
        Intrinsics.checkNotNullExpressionValue(timeline, "timeline");
        yc.fhj fhjVar = new yc.fhj(timeline);
        fhjVar.fD(new Function1() { // from class: com.alightcreative.app.motion.activities.NDx
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(EditActivity.HeJ(this.f44704n, ((Integer) obj).intValue()));
            }
        });
        fhjVar.te(new Function2() { // from class: com.alightcreative.app.motion.activities.xU
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return EditActivity.G8P(this.f45729n, ((Integer) obj).intValue(), ((Integer) obj2).intValue());
            }
        });
        fhjVar.iF(new Function0() { // from class: com.alightcreative.app.motion.activities.xJ
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EditActivity.D1(this.f45726n);
            }
        });
        SJ0.CN3 cn363 = this.binding;
        if (cn363 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn363 = null;
        }
        cn363.bzg.setItemAnimator(null);
        SJ0.CN3 cn364 = this.binding;
        if (cn364 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn364 = null;
        }
        cn364.bzg.setAdapter(vH3());
        final TimelineLayoutManager timelineLayoutManagerGA = GA();
        timelineLayoutManagerGA.cAB(this.sceneHolder.getScene().getTotalTime());
        timelineLayoutManagerGA.WKb(this.sceneHolder.getScene().getFramesPerHundredSeconds());
        timelineLayoutManagerGA.GT(this.sceneHolder.getScene().getBookmarks());
        if (!SceneKt.getHasActiveReTiming(this.sceneHolder) || (this.sceneHolder.getScene().getReTimingInMark() <= 0 && this.sceneHolder.getScene().getReTimingOutMark() <= 0)) {
            timelineLayoutManagerGA.R3E(null);
            timelineLayoutManagerGA.Yq(null);
        } else {
            timelineLayoutManagerGA.R3E(Integer.valueOf(this.sceneHolder.getScene().getReTimingInMark()));
            timelineLayoutManagerGA.Yq(Integer.valueOf((this.sceneHolder.getScene().getReTimingOutMark() == 0 || this.sceneHolder.getScene().getReTimingOutMark() < this.sceneHolder.getScene().getReTimingInMark()) ? this.sceneHolder.getScene().getTotalTime() : this.sceneHolder.getScene().getReTimingOutMark()));
        }
        timelineLayoutManagerGA.f11(Integer.valueOf(this.sceneHolder.getScene().getThumbnailTime()));
        timelineLayoutManagerGA.eOa(new Function1() { // from class: com.alightcreative.app.motion.activities.U8A
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EditActivity.RW(timelineLayoutManagerGA, this, ((Integer) obj).intValue());
            }
        });
        SJ0.CN3 cn365 = this.binding;
        if (cn365 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn365 = null;
        }
        cn365.jB.setOnTouchListener(new View.OnTouchListener() { // from class: com.alightcreative.app.motion.activities.td
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return EditActivity.Pc(view, motionEvent);
            }
        });
        SJ0.CN3 cn366 = this.binding;
        if (cn366 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn366 = null;
        }
        ImageButton imageButton2 = cn366.iF.Uo;
        imageButton2.getViewTreeObserver().addOnGlobalLayoutListener(new Xo(imageButton2, this));
        SJ0.CN3 cn367 = this.binding;
        if (cn367 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn367 = null;
        }
        cn367.iF.Uo.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.Ze9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditActivity.yl(this.f44851n, view);
            }
        });
        SJ0.CN3 cn368 = this.binding;
        if (cn368 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn368 = null;
        }
        cn368.KN.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.G3H
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditActivity.Kb(this.f44553n, view);
            }
        });
        SJ0.CN3 cn369 = this.binding;
        if (cn369 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn369 = null;
        }
        cn369.mUb.setActivated(this.sceneHolder.getUserPreviewMode().Ik());
        SJ0.CN3 cn370 = this.binding;
        if (cn370 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn370 = null;
        }
        cn370.mUb.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.OI
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditActivity.Jz1(this.f44708n, view);
            }
        });
        SJ0.CN3 cn371 = this.binding;
        if (cn371 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn371 = null;
        }
        cn371.xMQ.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.tr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditActivity.S2(this.f45689n, view);
            }
        });
        SJ0.CN3 cn372 = this.binding;
        if (cn372 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn372 = null;
        }
        cn372.gh.setEnabled(false);
        SJ0.CN3 cn373 = this.binding;
        if (cn373 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn373 = null;
        }
        cn373.gh.setImageDrawable(ResourcesCompat.J2(getResources(), 2131231906, getTheme()));
        SJ0.CN3 cn374 = this.binding;
        if (cn374 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn374 = null;
        }
        cn374.gh.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.eG
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditActivity.Rx(this.f45059n, view);
            }
        });
        SJ0.CN3 cn375 = this.binding;
        if (cn375 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn375 = null;
        }
        ImageButton imageButton3 = cn375.Uo;
        Scene sceneG = HW.C.g(this);
        imageButton3.setEnabled(sceneG != null ? SceneKt.hasCameraObject(sceneG) : false);
        SJ0.CN3 cn376 = this.binding;
        if (cn376 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn376 = null;
        }
        cn376.Uo.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.QrA
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditActivity.cT(this.f44731n, view);
            }
        });
        SJ0.CN3 cn377 = this.binding;
        if (cn377 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn377 = null;
        }
        cn377.qie.nr.setText(((int) (yc.RP.KN(this.sceneHolder.getUserPreviewMode()) * 100.0f)) + "%");
        SJ0.CN3 cn378 = this.binding;
        if (cn378 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn378 = null;
        }
        cn378.qie.rl.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.dT
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditActivity.drE(this.f45048n, view);
            }
        });
        SJ0.CN3 cn379 = this.binding;
        if (cn379 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn379 = null;
        }
        cn379.qie.f9122t.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.AZy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditActivity.OWw(this.f44323n, view);
            }
        });
        O7();
        SJ0.CN3 cn380 = this.binding;
        if (cn380 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn380 = null;
        }
        cn380.te.KN.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.S
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditActivity.s5a(this.f44742n, view);
            }
        });
        this.sceneHolder.subscribe(this.onSceneUpdate);
        this.levelMeterUpdater.run();
        GJW.C.nr(LifecycleOwnerKt.n(this), null, null, new r(null), 3, null);
        SJ0.CN3 cn381 = this.binding;
        if (cn381 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn381 = null;
        }
        cn381.f9100X.postDelayed(new Runnable() { // from class: com.alightcreative.app.motion.activities.V
            @Override // java.lang.Runnable
            public final void run() {
                EditActivity.E6J(this.f44792n);
            }
        }, 700L);
        SJ0.CN3 cn382 = this.binding;
        if (cn382 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn382 = null;
        }
        cn382.f9100X.postDelayed(new Runnable() { // from class: com.alightcreative.app.motion.activities.Qik
            @Override // java.lang.Runnable
            public final void run() {
                EditActivity.nfh(this.f44730n);
            }
        }, 410L);
        Zy(HW.C.HI(this), true);
        hxH();
        rst().n();
        rst().S();
        kgE.Sis.gh(this.purchaseStateObserver);
        SJ0.CN3 cn383 = this.binding;
        if (cn383 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn383 = null;
        }
        FrameLayout tabContentAddShape2 = cn383.nr.E2;
        Intrinsics.checkNotNullExpressionValue(tabContentAddShape2, "tabContentAddShape");
        HI0.o7q.mUb(tabContentAddShape2, new Function0() { // from class: com.alightcreative.app.motion.activities.z3w
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EditActivity.JP(this.f45756n);
            }
        });
        this.shareThumbnailMaker = new SceneThumbnailMaker("projectListThumbnails", this, 1200, 1200);
        SJ0.CN3 cn384 = this.binding;
        if (cn384 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn384 = null;
        }
        cn384.fD.postDelayed(new Runnable() { // from class: com.alightcreative.app.motion.activities.Mo
            @Override // java.lang.Runnable
            public final void run() {
                EditActivity.tWM(this.f44663n);
            }
        }, 3000L);
        jVar8.setTurnedOnCameraView(false);
        nYs.j jVarInvoke = CX().invoke();
        if (jVarInvoke != null && jVarInvoke.te()) {
            z2 = true;
        }
        SJ0.CN3 cn385 = this.binding;
        if (cn385 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            cn3 = cn385;
        }
        cn3.ty.setContent(ComposableLambdaKt.rl(-750151642, true, new SPz(z2)));
    }

    public final void vTq(String propLabel, final Wre guideDuration) {
        long j2;
        Intrinsics.checkNotNullParameter(propLabel, "propLabel");
        Intrinsics.checkNotNullParameter(guideDuration, "guideDuration");
        AnimatorSet animatorSet = this.curGuideAnim;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        SJ0.CN3 cn3 = null;
        this.curGuideAnim = null;
        XoT.C.Uo(this, new Function0() { // from class: com.alightcreative.app.motion.activities.Y2e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EditActivity.DJc(guideDuration);
            }
        });
        SJ0.CN3 cn32 = this.binding;
        if (cn32 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn32 = null;
        }
        cn32.f9099T.setVisibility(0);
        SJ0.CN3 cn33 = this.binding;
        if (cn33 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn33 = null;
        }
        cn33.f9096N.setVisibility(0);
        SJ0.CN3 cn34 = this.binding;
        if (cn34 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn34 = null;
        }
        cn34.nHg.setVisibility(0);
        SJ0.CN3 cn35 = this.binding;
        if (cn35 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn35 = null;
        }
        cn35.nHg.setText(propLabel);
        SJ0.CN3 cn36 = this.binding;
        if (cn36 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn36 = null;
        }
        cn36.f9099T.setAlpha(0.0f);
        SJ0.CN3 cn37 = this.binding;
        if (cn37 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn37 = null;
        }
        cn37.f9096N.setAlpha(0.0f);
        SJ0.CN3 cn38 = this.binding;
        if (cn38 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            cn3 = cn38;
        }
        cn3.nHg.setAlpha(0.0f);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        int[] iArr = CN3.$EnumSwitchMapping$3;
        int i2 = iArr[guideDuration.ordinal()];
        long j3 = 100;
        if (i2 != 1 && i2 != 2) {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            j3 = 300;
        }
        valueAnimatorOfFloat.setDuration(j3);
        int i3 = iArr[guideDuration.ordinal()];
        long j4 = 900;
        if (i3 == 1) {
            j2 = 900;
        } else if (i3 == 2) {
            j2 = 1400;
        } else {
            if (i3 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            j2 = 2000;
        }
        valueAnimatorOfFloat2.setDuration(j2);
        for (ValueAnimator valueAnimator : CollectionsKt.listOf((Object[]) new ValueAnimator[]{valueAnimatorOfFloat, valueAnimatorOfFloat2})) {
            if (valueAnimator != null) {
                valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.alightcreative.app.motion.activities.pi
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        EditActivity.tjg(this.f45578n, valueAnimator2);
                    }
                });
            }
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        AnimatorSet.Builder builderPlay = animatorSet2.play(valueAnimatorOfFloat2);
        int i5 = CN3.$EnumSwitchMapping$3[guideDuration.ordinal()];
        if (i5 == 1) {
            j4 = 500;
        } else if (i5 != 2) {
            if (i5 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            j4 = 1800;
        }
        builderPlay.after(j4).after(valueAnimatorOfFloat);
        animatorSet2.addListener(new M());
        animatorSet2.start();
        this.curGuideAnim = animatorSet2;
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    static final class Ew extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f44435n;

        Ew(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return EditActivity.this.new Ew(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(GJW.vd vdVar, Continuation continuation) {
            return ((Ew) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f44435n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                EditActivity editActivity = EditActivity.this;
                this.f44435n = 1;
                if (editActivity.ce(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.alightcreative.app.motion.activities.EditActivity$c, reason: case insensitive filesystem */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    static final class C1691c extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f44466n;

        C1691c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return EditActivity.this.new C1691c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(GJW.vd vdVar, Continuation continuation) {
            return ((C1691c) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
        
            if (LM.Dsr.O(r5, r1, r4) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f44466n;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                EditActivity editActivity = EditActivity.this;
                this.f44466n = 1;
                if (editActivity.ce(this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            SceneHolder sceneHolder = EditActivity.this.sceneHolder;
            EditActivity editActivity2 = EditActivity.this;
            this.f44466n = 2;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    static final class fuX extends SuspendLambda implements Function2 {
        int E2;
        Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f44469O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        Object f44470S;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        Object f44471Z;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f44473g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f44474n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f44475o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f44476r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        boolean f44477t;

        fuX(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return EditActivity.this.new fuX(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(GJW.vd vdVar, Continuation continuation) {
            return ((fuX) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0091  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0162  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0181  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x0250  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x0256  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00d3 -> B:42:0x013f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x010f -> B:42:0x013f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0113 -> B:42:0x013f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x011b -> B:42:0x013f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x013b -> B:42:0x013f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0160 -> B:80:0x0254). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x0162 -> B:48:0x017b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x01c4 -> B:76:0x0235). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x0203 -> B:76:0x0235). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x0206 -> B:76:0x0235). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x020e -> B:76:0x0235). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x0232 -> B:76:0x0235). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instruction units count: 620
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alightcreative.app.motion.activities.EditActivity.fuX.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    static final class l3D extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f44486n;

        l3D(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return EditActivity.this.new l3D(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(GJW.vd vdVar, Continuation continuation) {
            return ((l3D) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
        
            if (LM.Dsr.O(r5, r1, r4) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f44486n;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                EditActivity editActivity = EditActivity.this;
                this.f44486n = 1;
                if (editActivity.ce(this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            SceneHolder sceneHolder = EditActivity.this.sceneHolder;
            EditActivity editActivity2 = EditActivity.this;
            this.f44486n = 2;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    static final class nKK extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f44490n;

        nKK(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return EditActivity.this.new nKK(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(GJW.vd vdVar, Continuation continuation) {
            return ((nKK) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f44490n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                EditActivity editActivity = EditActivity.this;
                this.f44490n = 1;
                if (editActivity.ce(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    static final class r extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f44498n;

        r(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return EditActivity.this.new r(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(GJW.vd vdVar, Continuation continuation) {
            return ((r) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f44498n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                EditActivity editActivity = EditActivity.this;
                this.f44498n = 1;
                if (editActivity.ce(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    static final class s4 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f44501n;

        s4(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return EditActivity.this.new s4(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(GJW.vd vdVar, Continuation continuation) {
            return ((s4) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f44501n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                SceneHolder sceneHolder = EditActivity.this.sceneHolder;
                EditActivity editActivity = EditActivity.this;
                this.f44501n = 1;
                if (LM.Dsr.O(sceneHolder, editActivity, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public EditActivity() {
        DefaultConstructorMarker defaultConstructorMarker = null;
        LM.Wre wre = new LM.Wre(this);
        this.projectHolder = wre;
        this.sceneHolder = wre.KN();
        this.editAddDelegate = new VS(this);
        this.editActionDelegate = LazyKt.lazy(new Function0() { // from class: com.alightcreative.app.motion.activities.rCj
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EditActivity.gv8(this.f45620n);
            }
        });
        this.allLocalProjects = SnapshotStateKt__SnapshotStateKt.O(CollectionsKt.emptyList(), null, 2, null);
        this.longPressTime = ViewConfiguration.getLongPressTimeout();
        this.touchSlop = LazyKt.lazy(new Function0() { // from class: com.alightcreative.app.motion.activities.s6u
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(EditActivity.sh(this.f45648n));
            }
        });
        this.handler = new Handler(Looper.getMainLooper());
        this.lagFrames = -30;
        this.lagFeedbackConfig = com.google.firebase.remoteconfig.j.az().HI("lag_feedback");
        this.previewPanZoomHandler = LazyKt.lazy(new Function0() { // from class: com.alightcreative.app.motion.activities.Sw
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EditActivity.oCi(this.f44770n);
            }
        });
        this.multiTrimButtons = LazyKt.lazy(new Function0() { // from class: com.alightcreative.app.motion.activities.m8h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EditActivity.s6(this.f45327n);
            }
        });
        this.multiRightExtendButtons = LazyKt.lazy(new Function0() { // from class: com.alightcreative.app.motion.activities.I7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EditActivity.vqZ(this.f44575n);
            }
        });
        this.multiLeftExtendButtons = LazyKt.lazy(new Function0() { // from class: com.alightcreative.app.motion.activities.eh
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EditActivity.gUZ(this.f45225n);
            }
        });
        this.templateEditorLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: com.alightcreative.app.motion.activities.Mje
            @Override // androidx.view.result.ActivityResultCallback
            public final void n(Object obj) {
                EditActivity.Lt(this.f44662n, (ActivityResult) obj);
            }
        });
        this.presetPreviewLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: com.alightcreative.app.motion.activities.epX
            @Override // androidx.view.result.ActivityResultCallback
            public final void n(Object obj) {
                EditActivity.y9g(this.f45226n, (ActivityResult) obj);
            }
        });
        this.lagNoticeRunnable = new Runnable() { // from class: com.alightcreative.app.motion.activities.zO
            @Override // java.lang.Runnable
            public final void run() {
                EditActivity.f8(this.f45758n);
            }
        };
        this.levelMeterUpdater = new qz();
        this.customToastMaker = new Vil.I28();
        this.purchaseStateObserver = new kgE.l4Z() { // from class: com.alightcreative.app.motion.activities.Y
            @Override // kgE.l4Z
            public final void n(com.alightcreative.account.o oVar) {
                EditActivity.dI(this.f44830n, oVar);
            }
        };
        this.purchaseState = new com.alightcreative.account.o(null, null, null, null, false, null, null, null, null, false, 1023, null);
        List<LiveShape> liveShapes = LiveShapeKt.getLiveShapes();
        ArrayList<LiveShape> arrayList = new ArrayList();
        for (Object obj : liveShapes) {
            if (!((LiveShape) obj).getDeprecated()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (LiveShape liveShape : arrayList) {
            arrayList2.add(new E3(LiveShapeScriptKt.getShapeOutline(liveShape), liveShape, liveShape.getId()));
        }
        List listN = yc.lej.n();
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listN, 10));
        Iterator it = listN.iterator();
        while (true) {
            int i2 = 0;
            if (!it.hasNext()) {
                this.shapeList = CollectionsKt.plus((Collection) arrayList2, (Iterable) arrayList3);
                this.addShapeListener = new Function2() { // from class: com.alightcreative.app.motion.activities.RQi
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return EditActivity.XPq(this.f44739n, ((Integer) obj2).intValue(), (E3) obj3);
                    }
                };
                this.elementThumbnailCache = new BitmapLruCache(i2, "elementThumbnailCache", 1, defaultConstructorMarker);
                this.templatesList = CollectionsKt.emptyList();
                this.projectsList = CollectionsKt.emptyList();
                this.presetsList = CollectionsKt.emptyList();
                this.compListLoader = com.alightcreative.app.motion.project.j.gh(this, new Function1() { // from class: com.alightcreative.app.motion.activities.F2n
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return EditActivity.gVB(this.f44528n, (List) obj2);
                    }
                });
                com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
                this.mediaBucketId = jVar.getMediaBucketID();
                this.mediaBucketName = jVar.getMediaBucketName();
                this.mediaListLoader = LazyKt.lazy(new Function0() { // from class: com.alightcreative.app.motion.activities.BLY
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return EditActivity.Ftj(this.f44340n);
                    }
                });
                this.undoBatch = LdY.Ml.Ik.n();
                this.previewTouchGestureDetector = LazyKt.lazy(new Function0() { // from class: com.alightcreative.app.motion.activities.Zz
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return EditActivity.ln(this.f44859n);
                    }
                });
                this.delayedCloseAfterDoubleTapRunnable = new Runnable() { // from class: com.alightcreative.app.motion.activities.PXC
                    @Override // java.lang.Runnable
                    public final void run() {
                        EditActivity.tbd(this.f44717n);
                    }
                };
                this.multiSelectScaleGestureDetector = LazyKt.lazy(new Function0() { // from class: com.alightcreative.app.motion.activities.iB
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return EditActivity.vD(this.f45273n);
                    }
                });
                this.onBackStackChangedListener = new FragmentManager.OnBackStackChangedListener() { // from class: com.alightcreative.app.motion.activities.vr
                    @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
                    public final void O() {
                        EditActivity.sP(this.f45705n);
                    }
                };
                this.pauseEditTimer = true;
                this.onSceneUpdate = new Function1() { // from class: com.alightcreative.app.motion.activities.dy
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return EditActivity.t5(this.f45056n, (SceneHolderState) obj2);
                    }
                };
                this.attachedFragments = new ArrayList();
                return;
            }
            yc.qf qfVar = (yc.qf) it.next();
            arrayList3.add(new E3(CubicBSplineKt.cubicBSplineFromSVGAuto$default(qfVar.rl(), false, 2, null), null, qfVar.n(), 2, null));
        }
    }

    private final void ARa() {
        List list = this.attachedFragments;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Fragment fragment = (Fragment) ((WeakReference) it.next()).get();
            if (fragment != null) {
                arrayList.add(fragment);
            }
        }
        int iIntValue = 0;
        final int i2 = 0;
        for (Object obj : arrayList) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            final Fragment fragment2 = (Fragment) obj;
            XoT.C.Uo(this, new Function0() { // from class: com.alightcreative.app.motion.activities.fi
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EditActivity.zk(i2, fragment2);
                }
            });
            i2 = i3;
        }
        final ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            Fragment fragment3 = (Fragment) obj2;
            if (fragment3.isAdded() && fragment3.isVisible() && !fragment3.isRemoving() && !(fragment3 instanceof f0P.wl0) && (fragment3 instanceof yc.QhI)) {
                arrayList2.add(obj2);
            }
        }
        XoT.C.Uo(this, new Function0() { // from class: com.alightcreative.app.motion.activities.fmn
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EditActivity.QM(arrayList2);
            }
        });
        ActivityResultCaller activityResultCaller = (Fragment) CollectionsKt.lastOrNull((List) arrayList2);
        if (activityResultCaller != null) {
            yc.QhI qhI = activityResultCaller instanceof yc.QhI ? (yc.QhI) activityResultCaller : null;
            Integer numValueOf = qhI != null ? Integer.valueOf(qhI.t()) : null;
            if (numValueOf != null) {
                iIntValue = numValueOf.intValue();
            }
        }
        this.sceneHolder.setEditMode(iIntValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AUF(EditActivity editActivity, Scene newState) {
        Intrinsics.checkNotNullParameter(newState, "newState");
        editActivity.sceneHolder.setRootScene(newState);
        Set<Long> selectedElements = editActivity.sceneHolder.getSelection().getSelectedElements();
        if (!(selectedElements instanceof Collection) || !selectedElements.isEmpty()) {
            Iterator<T> it = selectedElements.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (SceneKt.elementById(editActivity.sceneHolder.getScene(), Long.valueOf(((Number) it.next()).longValue())) == null) {
                    editActivity.sceneHolder.setSelection(SceneKt.getEMPTY_SCENE_SELECTION());
                    while (editActivity.getSupportFragmentManager().Jk() > 0) {
                        editActivity.getSupportFragmentManager().uG();
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }

    private final void AW8(final ProjectInfo.n projectInfo, final rWZ.eO requestTriggerPoint, final Boolean overwritePrevious) {
        PJ9.DAz.G7(this, new Function0() { // from class: com.alightcreative.app.motion.activities.LIz
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EditActivity.pI5(this.f44618n, projectInfo, requestTriggerPoint, overwritePrevious);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Ah(final EditActivity editActivity, View view) {
        com.alightcreative.widget.Pl pl = new com.alightcreative.widget.Pl(editActivity, editActivity.rst(), new Function1() { // from class: com.alightcreative.app.motion.activities.Kk1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EditActivity.ch(this.f44602n, (com.alightcreative.widget.eO) obj);
            }
        });
        Intrinsics.checkNotNull(view);
        com.alightcreative.widget.Pl.Z(pl, view, 0, 0, 49, false, 22, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BAA(EditActivity editActivity) {
        editActivity.editAddDelegate.o();
        editActivity.NkL();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BUS(EditActivity editActivity) {
        SceneHolder sceneHolder = editActivity.sceneHolder;
        sceneHolder.setScene(Scene.copy$default(sceneHolder.getScene(), null, 0, 0, 0, 0, 0, null, 0, null, null, null, null, null, 0, 0, HW.C.o(editActivity), false, 0L, null, null, 1015807, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean CTr(WeakReference it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.get() == null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Cn5(Function1 function1, final EditActivity editActivity, final UO6.w6 w6Var, Function1 function12, final boolean z2, ComponentActivity componentActivity, boolean z3) {
        Intrinsics.checkNotNullParameter(componentActivity, "<unused var>");
        if (!z3) {
            function1.invoke(editActivity);
            return Unit.INSTANCE;
        }
        final int i2 = editActivity.exportSerial + 1;
        editActivity.exportSerial = i2;
        SceneExporterKt.lockForExport();
        final VideoEncoding videoEncoding = w6Var.rl() == j.Pl.f45834n ? VideoEncoding.AVC : VideoEncoding.HEVC;
        editActivity.j3I().v(new Function0() { // from class: com.alightcreative.app.motion.activities.ca
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EditActivity.sv(i2, editActivity, w6Var, videoEncoding, z2);
            }
        });
        function12.invoke(editActivity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String Cw() {
        return "closeAllPopups";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String DJc(Wre wre) {
        return "showSwipeGuide guideDuration=" + wre;
    }

    private final void E5K(boolean force) {
        this.projectHolder.qie(force);
    }

    private final void E9K(boolean animated) {
        SJ0.CN3 cn3 = this.binding;
        SJ0.CN3 cn32 = null;
        if (cn3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn3 = null;
        }
        if (cn3.nr.getRoot().getVisibility() != 0) {
            if (xxL().wTp()) {
                SJ0.CN3 cn33 = this.binding;
                if (cn33 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    cn33 = null;
                }
                cn33.nr.xMQ.setVisibility(0);
            }
            if (!animated) {
                SJ0.CN3 cn34 = this.binding;
                if (cn34 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    cn34 = null;
                }
                cn34.nr.HI.setRotation(0.0f);
                SJ0.CN3 cn35 = this.binding;
                if (cn35 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    cn35 = null;
                }
                cn35.nr.HI.setTranslationX(0.0f);
                SJ0.CN3 cn36 = this.binding;
                if (cn36 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    cn36 = null;
                }
                cn36.nr.HI.setTranslationY(0.0f);
                SJ0.CN3 cn37 = this.binding;
                if (cn37 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    cn32 = cn37;
                }
                cn32.nr.getRoot().setVisibility(4);
                mG(j.f44482n);
                return;
            }
            SJ0.CN3 cn38 = this.binding;
            if (cn38 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn38 = null;
            }
            ImageButton buttonAdd = cn38.J2;
            Intrinsics.checkNotNullExpressionValue(buttonAdd, "buttonAdd");
            Pair pairJ2 = HI0.o7q.J2(buttonAdd);
            int iIntValue = ((Number) pairJ2.component1()).intValue();
            int iIntValue2 = ((Number) pairJ2.component2()).intValue();
            float f3 = iIntValue;
            SJ0.CN3 cn39 = this.binding;
            if (cn39 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn39 = null;
            }
            float width = f3 + (cn39.J2.getWidth() / 2.0f);
            float f4 = iIntValue2;
            SJ0.CN3 cn310 = this.binding;
            if (cn310 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn310 = null;
            }
            Vector2D vector2D = new Vector2D(width, f4 + (cn310.J2.getHeight() / 2.0f));
            SJ0.CN3 cn311 = this.binding;
            if (cn311 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn311 = null;
            }
            ImageView buttonCloseAdd = cn311.nr.HI;
            Intrinsics.checkNotNullExpressionValue(buttonCloseAdd, "buttonCloseAdd");
            Pair pairJ22 = HI0.o7q.J2(buttonCloseAdd);
            int iIntValue3 = ((Number) pairJ22.component1()).intValue();
            int iIntValue4 = ((Number) pairJ22.component2()).intValue();
            float f5 = iIntValue3;
            SJ0.CN3 cn312 = this.binding;
            if (cn312 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn312 = null;
            }
            float width2 = f5 + (cn312.J2.getWidth() / 2.0f);
            float f6 = iIntValue4;
            SJ0.CN3 cn313 = this.binding;
            if (cn313 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn313 = null;
            }
            Vector2D vector2D2 = new Vector2D(width2, f6 + (cn313.J2.getHeight() / 2.0f));
            SJ0.CN3 cn314 = this.binding;
            if (cn314 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn314 = null;
            }
            ConstraintLayout constraintLayoutRl = cn314.nr.getRoot();
            Intrinsics.checkNotNullExpressionValue(constraintLayoutRl, "getRoot(...)");
            Pair pairJ23 = HI0.o7q.J2(constraintLayoutRl);
            int iIntValue5 = ((Number) pairJ23.component1()).intValue();
            int iIntValue6 = ((Number) pairJ23.component2()).intValue();
            float f7 = iIntValue5;
            SJ0.CN3 cn315 = this.binding;
            if (cn315 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn315 = null;
            }
            float width3 = f7 + cn315.nr.getRoot().getWidth();
            float f8 = iIntValue6;
            SJ0.CN3 cn316 = this.binding;
            if (cn316 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn316 = null;
            }
            Vector2D vector2DMinus = GeometryKt.minus(new Vector2D(width3, f8 + cn316.nr.getRoot().getHeight()), vector2D);
            Vector2D vector2DMinus2 = GeometryKt.minus(vector2D2, vector2D);
            SJ0.CN3 cn317 = this.binding;
            if (cn317 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn317 = null;
            }
            ConstraintLayout constraintLayoutRl2 = cn317.nr.getRoot();
            SJ0.CN3 cn318 = this.binding;
            if (cn318 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn318 = null;
            }
            int width4 = cn318.nr.getRoot().getWidth() - ((int) vector2DMinus.getX());
            SJ0.CN3 cn319 = this.binding;
            if (cn319 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn319 = null;
            }
            int height = cn319.nr.getRoot().getHeight() - ((int) vector2DMinus.getY());
            SJ0.CN3 cn320 = this.binding;
            if (cn320 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn320 = null;
            }
            float height2 = cn320.nr.getRoot().getHeight() / 3.0f;
            SJ0.CN3 cn321 = this.binding;
            if (cn321 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn321 = null;
            }
            Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(constraintLayoutRl2, width4, height, height2, cn321.nr.getRoot().getWidth() * 1.2f);
            animatorCreateCircularReveal.setDuration(150L);
            animatorCreateCircularReveal.setInterpolator(new DecelerateInterpolator());
            SJ0.CN3 cn322 = this.binding;
            if (cn322 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn322 = null;
            }
            cn322.nr.HI.setRotation(22.5f);
            SJ0.CN3 cn323 = this.binding;
            if (cn323 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn323 = null;
            }
            cn323.nr.HI.setTranslationX((-vector2DMinus2.getX()) / 2.0f);
            SJ0.CN3 cn324 = this.binding;
            if (cn324 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn324 = null;
            }
            cn324.nr.HI.setTranslationY((-vector2DMinus2.getY()) / 2.0f);
            SJ0.CN3 cn325 = this.binding;
            if (cn325 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn325 = null;
            }
            cn325.nr.HI.animate().rotation(0.0f).translationX(0.0f).translationY(0.0f).setStartDelay(10L).setInterpolator(new DecelerateInterpolator()).setDuration(140L).start();
            SJ0.CN3 cn326 = this.binding;
            if (cn326 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn326 = null;
            }
            cn326.J2.animate().translationX(vector2DMinus2.getX()).translationY(vector2DMinus2.getY()).setStartDelay(10L).setInterpolator(new AccelerateInterpolator()).setDuration(140L).rotation(45.0f).start();
            SJ0.CN3 cn327 = this.binding;
            if (cn327 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                cn32 = cn327;
            }
            cn32.nr.getRoot().setVisibility(0);
            animatorCreateCircularReveal.start();
            mG(j.f44482n);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Ek5(final EditActivity editActivity, com.alightcreative.widget.QJ item) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        item.t(new Function0() { // from class: com.alightcreative.app.motion.activities.KA
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EditActivity.G8(this.f44596n);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void EpR(EditActivity editActivity, View view) {
        editActivity.editAddDelegate.XQ();
        QmE.iF iFVarLm1 = editActivity.lm1();
        String string = editActivity.projectHolder.Uo().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        iFVarLm1.n(new j.T(string, rWZ.C.f73047g));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String FG8(EditActivity editActivity) {
        return "lagFeedbackConfig=" + editActivity.lagFeedbackConfig + " avgRender=" + (Si.QJ.KN() / 1000000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean FaL(EditActivity editActivity, View view, MotionEvent motionEvent) {
        if (view instanceof EditText) {
            EditText editText = (EditText) view;
            if (motionEvent.getX() >= editText.getWidth() - editText.getTotalPaddingEnd() && motionEvent.getAction() == 1) {
                SJ0.CN3 cn3 = editActivity.binding;
                if (cn3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    cn3 = null;
                }
                Editable text = cn3.te.Uo.getText();
                if (text != null) {
                    text.clear();
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    private final void Fd(j tab) {
        int i2 = 4;
        SJ0.CN3 cn3 = null;
        if (CN3.$EnumSwitchMapping$1[tab.ordinal()] == 3) {
            SJ0.CN3 cn32 = this.binding;
            if (cn32 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn32 = null;
            }
            if (cn32.nr.xMQ.getVisibility() == 0) {
                xxL().fD();
                SJ0.CN3 cn33 = this.binding;
                if (cn33 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    cn33 = null;
                }
                CardView addTemplateNewTag = cn33.nr.xMQ;
                Intrinsics.checkNotNullExpressionValue(addTemplateNewTag, "addTemplateNewTag");
                addTemplateNewTag.setVisibility(4);
            }
            az();
        }
        if (tab != j.f44480O) {
            C6();
        }
        Map map = this.addTabs;
        if (map == null) {
            Intrinsics.throwUninitializedPropertyAccessException("addTabs");
            map = null;
        }
        Iterator it = map.entrySet().iterator();
        while (true) {
            int i3 = 0;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            j jVar = (j) entry.getKey();
            n nVar = (n) entry.getValue();
            nVar.rl().setActivated(tab == jVar);
            View viewN = nVar.n();
            if (tab != jVar) {
                i3 = 4;
            }
            viewN.setVisibility(i3);
        }
        SJ0.CN3 cn34 = this.binding;
        if (cn34 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            cn3 = cn34;
        }
        ConstraintLayout constraintLayout = cn3.nr.f9381S;
        if ((!XoT.fuX.ck(this) && this.selectedAddPopupTab == j.f44485t) || (!XoT.fuX.ty(this) && this.selectedAddPopupTab == j.f44480O)) {
            i2 = 0;
        }
        constraintLayout.setVisibility(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HI0.l4Z Ftj(EditActivity editActivity) {
        SJ0.CN3 cn3 = editActivity.binding;
        if (cn3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn3 = null;
        }
        SJ0.Wre addPopup = cn3.nr;
        Intrinsics.checkNotNullExpressionValue(addPopup, "addPopup");
        return new yc.Y5(editActivity, addPopup, editActivity.editAddDelegate).WPU();
    }

    private final void Fv(SceneElement element) {
        SJ0.CN3 cn3 = this.binding;
        if (cn3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn3 = null;
        }
        RecyclerView.LayoutManager layoutManager = cn3.bzg.getLayoutManager();
        Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager");
        this.originalScrollY = ((TimelineLayoutManager) layoutManager).getInternalScrollY();
        vH3().te();
        UCQ(false);
        this.sceneHolder.setSelection(SceneKt.singleElementSelection(element));
        SJ0.CN3 cn32 = this.binding;
        if (cn32 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn32 = null;
        }
        RecyclerViewEx recyclerViewEx = cn32.bzg;
        SceneHolder sceneHolder = this.sceneHolder;
        SceneThumbnailMaker sceneThumbnailMaker = this.trackThumbnailMaker;
        if (sceneThumbnailMaker == null) {
            Intrinsics.throwUninitializedPropertyAccessException("trackThumbnailMaker");
            sceneThumbnailMaker = null;
        }
        recyclerViewEx.setAdapter(new yc.cF(sceneHolder, sceneThumbnailMaker, element.getId(), new Function0() { // from class: com.alightcreative.app.motion.activities.EB1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EditActivity.qB(this.f44396n);
            }
        }, new Function0() { // from class: com.alightcreative.app.motion.activities.A
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(EditActivity.vva(this.f44311n));
            }
        }, lm1()));
        SJ0.CN3 cn33 = this.binding;
        if (cn33 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn33 = null;
        }
        RecyclerView.LayoutManager layoutManager2 = cn33.bzg.getLayoutManager();
        Intrinsics.checkNotNull(layoutManager2, "null cannot be cast to non-null type com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager");
        ((TimelineLayoutManager) layoutManager2).ni();
        f0P.gn gnVar = new f0P.gn();
        SceneThumbnailMaker sceneThumbnailMaker2 = this.trackThumbnailMaker;
        if (sceneThumbnailMaker2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("trackThumbnailMaker");
            sceneThumbnailMaker2 = null;
        }
        gnVar.QZ6(sceneThumbnailMaker2);
        FragmentTransaction fragmentTransactionWPU = getSupportFragmentManager().o().WPU(2130837547, 2130837546, 2130837547, 2130837546);
        SJ0.CN3 cn34 = this.binding;
        if (cn34 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn34 = null;
        }
        FragmentTransaction fragmentTransactionWPU2 = fragmentTransactionWPU.rl(cn34.ck.getId(), new f0P.tC()).WPU(2130837505, 2130837504, 2130837505, 2130837504);
        SJ0.CN3 cn35 = this.binding;
        if (cn35 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn35 = null;
        }
        fragmentTransactionWPU2.rl(cn35.rl.getId(), gnVar).KN(null).gh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G0F(EditActivity editActivity, View view, boolean z2) {
        Ml.j jVar = editActivity.projectNameUndoBatch;
        if (jVar != null) {
            jVar.n();
        }
        SJ0.CN3 cn3 = null;
        editActivity.projectNameUndoBatch = null;
        if (!z2) {
            SJ0.CN3 cn32 = editActivity.binding;
            if (cn32 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                cn3 = cn32;
            }
            cn3.te.Uo.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            return;
        }
        SJ0.CN3 cn33 = editActivity.binding;
        if (cn33 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn33 = null;
        }
        cn33.te.Uo.setCompoundDrawablesWithIntrinsicBounds(0, 0, 2131231696, 0);
        SJ0.CN3 cn34 = editActivity.binding;
        if (cn34 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            cn3 = cn34;
        }
        SettingEditText projectTitle = cn3.te.Uo;
        Intrinsics.checkNotNullExpressionValue(projectTitle, "projectTitle");
        HI0.o7q.ck(projectTitle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G8(EditActivity editActivity) {
        SceneHolder sceneHolder = editActivity.sceneHolder;
        sceneHolder.setScene(Scene.copy$default(sceneHolder.getScene(), null, 0, 0, 0, 0, 0, null, 0, null, null, null, null, null, 0, 0, -1, false, 0L, null, null, 1015807, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G8P(EditActivity editActivity, int i2, int i3) {
        int size = editActivity.sceneHolder.getScene().getElements().size() - 1;
        final int iCoerceIn = RangesKt.coerceIn(size - i2, 0, editActivity.sceneHolder.getScene().getElements().size() - 1);
        final int iCoerceIn2 = RangesKt.coerceIn(size - i3, 0, editActivity.sceneHolder.getScene().getElements().size() - 1);
        if (iCoerceIn != iCoerceIn2) {
            XoT.C.Uo(editActivity, new Function0() { // from class: com.alightcreative.app.motion.activities.g62
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EditActivity.cL(iCoerceIn, iCoerceIn2);
                }
            });
            editActivity.sceneHolder.setEditCategory(new EditCategory.Reorder(iCoerceIn, iCoerceIn2));
            SceneHolder sceneHolder = editActivity.sceneHolder;
            sceneHolder.setScene(Scene.copy$default(sceneHolder.getScene(), null, 0, 0, 0, 0, 0, HI0.rv6.rl(editActivity.sceneHolder.getScene().getElements(), iCoerceIn, iCoerceIn2), 0, null, null, null, null, null, 0, 0, 0, false, 0L, null, null, 1048511, null));
            editActivity.sceneHolder.setEditCategory(null);
        }
        return Unit.INSTANCE;
    }

    private final TimelineLayoutManager GA() {
        SJ0.CN3 cn3 = this.binding;
        if (cn3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn3 = null;
        }
        RecyclerView.LayoutManager layoutManager = cn3.bzg.getLayoutManager();
        Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager");
        return (TimelineLayoutManager) layoutManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String GW() {
        return "refreshPreview calling updatePreviewEditMode";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Gh(final EditActivity editActivity, View view) {
        CHm.j jVar;
        j jVar2 = editActivity.selectedAddPopupTab;
        int i2 = jVar2 == null ? -1 : CN3.$EnumSwitchMapping$1[jVar2.ordinal()];
        if (i2 == 1) {
            jVar = j.Ml.KN;
        } else if (i2 != 2) {
            return;
        } else {
            jVar = j.n.KN;
        }
        HI0.Ml.ty(editActivity, jVar, 0, null, new Function0() { // from class: com.alightcreative.app.motion.activities.tpM
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EditActivity.u2(this.f45688n);
            }
        }, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Gi1(Fragment it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.isAdded() && !it.isRemoving();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean HeJ(EditActivity editActivity, int i2) {
        if (i2 < 0 || i2 >= editActivity.sceneHolder.getScene().getElements().size()) {
            return false;
        }
        SJ0.CN3 cn3 = editActivity.binding;
        if (cn3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn3 = null;
        }
        return cn3.bzg.getAdapter() == editActivity.vH3();
    }

    private final void Hez() {
        com.alightcreative.app.motion.persist.j.INSTANCE.getProjectEditTime().put(this.projectHolder.Uo().toString(), Long.valueOf(KWB()));
        this.pauseEditTimer = true;
        this.initialSceneHash = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I1(EditActivity editActivity) {
        LdY.Ml ml = editActivity.undoManager;
        LdY.Ml ml2 = null;
        if (ml == null) {
            Intrinsics.throwUninitializedPropertyAccessException("undoManager");
            ml = null;
        }
        ml.HI();
        SceneHolder sceneHolder = editActivity.sceneHolder;
        LdY.Ml ml3 = editActivity.undoManager;
        if (ml3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("undoManager");
        } else {
            ml2 = ml3;
        }
        sceneHolder.setEditingSerial(ml2.qie());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IO(EditActivity editActivity, long j2) {
        SJ0.CN3 cn3 = editActivity.binding;
        if (cn3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn3 = null;
        }
        RecyclerView.LayoutManager layoutManager = cn3.bzg.getLayoutManager();
        Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager");
        ((TimelineLayoutManager) layoutManager).G(editActivity.originalScrollY);
        editActivity.vH3().iF(j2);
        editActivity.originalScrollY = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IZz(EditActivity editActivity, ICC.Dsr err) {
        Intrinsics.checkNotNullParameter(err, "err");
        long j2 = 1000000;
        long jNanoTime = (System.nanoTime() - editActivity.lastMediaCoordToastTime) / j2;
        if ((System.nanoTime() - editActivity.lastMediaCoordPopupTime) / j2 > 300000) {
            throw null;
        }
        if (jNanoTime <= 5000) {
            return Unit.INSTANCE;
        }
        editActivity.lastMediaCoordToastTime = System.nanoTime();
        throw null;
    }

    private final nSC Im() {
        return (nSC) this.editActionDelegate.getValue();
    }

    private final int JF7() {
        return ((Number) this.touchSlop.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit JP(final EditActivity editActivity) {
        SJ0.CN3 cn3 = editActivity.binding;
        SJ0.CN3 cn32 = null;
        if (cn3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn3 = null;
        }
        if (cn3.nr.E2.getWidth() <= 0) {
            SJ0.CN3 cn33 = editActivity.binding;
            if (cn33 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                cn32 = cn33;
            }
            cn32.nr.E2.post(new Runnable() { // from class: com.alightcreative.app.motion.activities.DT
                @Override // java.lang.Runnable
                public final void run() {
                    EditActivity.Ubr(this.f44377n);
                }
            });
        } else {
            nRv(editActivity);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Fragment JR(WeakReference it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (Fragment) it.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Jz1(EditActivity editActivity, View view) {
        SceneHolder sceneHolder = editActivity.sceneHolder;
        yc.nKE userPreviewMode = sceneHolder.getUserPreviewMode();
        sceneHolder.setUserPreviewMode(userPreviewMode.rl((32703 & 1) != 0 ? userPreviewMode.f76062n : 0.0f, (32703 & 2) != 0 ? userPreviewMode.rl : null, (32703 & 4) != 0 ? userPreviewMode.f76063t : 0.0f, (32703 & 8) != 0 ? userPreviewMode.nr : null, (32703 & 16) != 0 ? userPreviewMode.f76061O : false, (32703 & 32) != 0 ? userPreviewMode.J2 : false, (32703 & 64) != 0 ? userPreviewMode.Uo : !editActivity.sceneHolder.getUserPreviewMode().Ik(), (32703 & 128) != 0 ? userPreviewMode.KN : 0.0f, (32703 & 256) != 0 ? userPreviewMode.xMQ : 0.0f, (32703 & 512) != 0 ? userPreviewMode.mUb : null, (32703 & 1024) != 0 ? userPreviewMode.gh : 0.0f, (32703 & 2048) != 0 ? userPreviewMode.qie : null, (32703 & 4096) != 0 ? userPreviewMode.az : false, (32703 & 8192) != 0 ? userPreviewMode.ty : false, (32703 & 16384) != 0 ? userPreviewMode.HI : null));
        SJ0.CN3 cn3 = editActivity.binding;
        if (cn3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn3 = null;
        }
        cn3.mUb.setActivated(editActivity.sceneHolder.getUserPreviewMode().Ik());
        QmE.iF iFVarLm1 = editActivity.lm1();
        Bundle bundle = new Bundle();
        bundle.putBoolean("enabled", editActivity.sceneHolder.getUserPreviewMode().Ik());
        Unit unit = Unit.INSTANCE;
        iFVarLm1.n(new j.fuX("viewmode_pixels", bundle));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void KV3(EditActivity editActivity, View view) {
        editActivity.editAddDelegate.T();
        QmE.iF iFVarLm1 = editActivity.lm1();
        String string = editActivity.projectHolder.Uo().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        iFVarLm1.n(new j.T(string, rWZ.C.f73049o));
        editActivity.lm1().n(new j.fuX("add_layer_nullobject", null, 2, 0 == true ? 1 : 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Kb(EditActivity editActivity, View view) {
        if (editActivity.UpJ().isEmpty()) {
            return;
        }
        SceneHolder sceneHolder = editActivity.sceneHolder;
        yc.nKE userPreviewMode = sceneHolder.getUserPreviewMode();
        sceneHolder.setUserPreviewMode(userPreviewMode.rl((32703 & 1) != 0 ? userPreviewMode.f76062n : 0.0f, (32703 & 2) != 0 ? userPreviewMode.rl : null, (32703 & 4) != 0 ? userPreviewMode.f76063t : 0.0f, (32703 & 8) != 0 ? userPreviewMode.nr : null, (32703 & 16) != 0 ? userPreviewMode.f76061O : !editActivity.sceneHolder.getUserPreviewMode().KN(), (32703 & 32) != 0 ? userPreviewMode.J2 : false, (32703 & 64) != 0 ? userPreviewMode.Uo : false, (32703 & 128) != 0 ? userPreviewMode.KN : 0.0f, (32703 & 256) != 0 ? userPreviewMode.xMQ : 0.0f, (32703 & 512) != 0 ? userPreviewMode.mUb : null, (32703 & 1024) != 0 ? userPreviewMode.gh : 0.0f, (32703 & 2048) != 0 ? userPreviewMode.qie : null, (32703 & 4096) != 0 ? userPreviewMode.az : false, (32703 & 8192) != 0 ? userPreviewMode.ty : false, (32703 & 16384) != 0 ? userPreviewMode.HI : null));
        SJ0.CN3 cn3 = editActivity.binding;
        if (cn3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn3 = null;
        }
        cn3.KN.setImageDrawable(ResourcesCompat.J2(editActivity.getResources(), editActivity.sceneHolder.getUserPreviewMode().KN() ? 2131232050 : 2131232049, editActivity.getTheme()));
        QmE.iF iFVarLm1 = editActivity.lm1();
        Bundle bundle = new Bundle();
        bundle.putBoolean("enabled", editActivity.sceneHolder.getUserPreviewMode().KN());
        Unit unit = Unit.INSTANCE;
        iFVarLm1.n(new j.fuX("preview_zoom_toggle", bundle));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String LDd() {
        return "RenderOPTI refreshTimelineAdapter";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Lt(EditActivity editActivity, ActivityResult it) {
        Intent intentN;
        String stringExtra;
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.getResultCode() != -1 || (intentN = it.getData()) == null || (stringExtra = intentN.getStringExtra("projectID")) == null) {
            return;
        }
        VS vs = editActivity.editAddDelegate;
        String stringExtra2 = intentN.getStringExtra("projectPackageID");
        if (stringExtra2 == null) {
            stringExtra2 = "lost_template_pp_id";
        }
        vs.s7N(stringExtra, stringExtra2);
        GWY.j.t(editActivity, stringExtra);
    }

    private final void M63() {
        SJ0.CN3 cn3 = this.binding;
        if (cn3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn3 = null;
        }
        cn3.f9097O.setVisibility(8);
    }

    static /* synthetic */ void MR(EditActivity editActivity, ProjectInfo.n nVar, rWZ.eO eOVar, Boolean bool, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            bool = null;
        }
        editActivity.AW8(nVar, eOVar, bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Md(j jVar, EditActivity editActivity, View view) {
        if (jVar == j.f44485t) {
            editActivity.lm1().n(new j.FPL(editActivity.Uo()));
        }
        if (jVar == j.f44484r) {
            editActivity.lm1().n(new j.CN3(editActivity.Uo()));
        }
        editActivity.mG(jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List NU(EditActivity editActivity) {
        List listRl;
        Sequence sequenceFilter = SequencesKt.filter(SequencesKt.filter(SequencesKt.mapNotNull(CollectionsKt.asSequence(editActivity.attachedFragments), new Function1() { // from class: com.alightcreative.app.motion.activities.giR
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EditActivity.JR((WeakReference) obj);
            }
        }), new Function1() { // from class: com.alightcreative.app.motion.activities.FP
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(EditActivity.yd((Fragment) obj));
            }
        }), Z.f44464n);
        Intrinsics.checkNotNull(sequenceFilter, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
        yc.tpM tpm = (yc.tpM) SequencesKt.firstOrNull(sequenceFilter);
        return (tpm == null || (listRl = tpm.rl()) == null) ? CollectionsKt.emptyList() : listRl;
    }

    private final List Nj() {
        return (List) this.multiRightExtendButtons.getValue();
    }

    private final boolean NqA() {
        SJ0.CN3 cn3 = this.binding;
        if (cn3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn3 = null;
        }
        return cn3.nr.getRoot().getVisibility() == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Nt(final EditActivity editActivity, View view) {
        HI0.Ml.ty(editActivity, j.w6.KN, 0, null, new Function0() { // from class: com.alightcreative.app.motion.activities.ibE
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EditActivity.Yi9(this.f45275n);
            }
        }, 6, null);
    }

    private final void O7() {
        String string = this.projectHolder.Uo().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        Scene sceneG = HW.C.g(this);
        if (sceneG == null) {
            return;
        }
        boolean zIsEmpty = hep().rl(string, sceneG).isEmpty();
        SJ0.CN3 cn3 = null;
        if (zIsEmpty) {
            SJ0.CN3 cn32 = this.binding;
            if (cn32 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                cn3 = cn32;
            }
            cn3.te.KN.setImageResource(2131231060);
            return;
        }
        SJ0.CN3 cn33 = this.binding;
        if (cn33 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn33 = null;
        }
        cn33.te.KN.setImageResource(2131231725);
        SJ0.CN3 cn34 = this.binding;
        if (cn34 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            cn3 = cn34;
        }
        Drawable drawable = cn3.te.KN.getDrawable();
        if (drawable instanceof AnimatedVectorDrawableCompat) {
            AnimatedVectorDrawableCompat animatedVectorDrawableCompat = (AnimatedVectorDrawableCompat) drawable;
            animatedVectorDrawableCompat.t(new Zs(drawable));
            animatedVectorDrawableCompat.start();
        } else if (drawable instanceof AnimatedVectorDrawable) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
            animatedVectorDrawable.registerAnimationCallback(new P(drawable));
            animatedVectorDrawable.start();
        }
    }

    private final Fragment ON() {
        Object objPrevious;
        List list = this.attachedFragments;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Fragment fragment = (Fragment) ((WeakReference) it.next()).get();
            if (fragment != null) {
                arrayList.add(fragment);
            }
        }
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            Fragment fragment2 = (Fragment) objPrevious;
            if (fragment2.isAdded() && fragment2.isVisible() && !(fragment2 instanceof f0P.wl0)) {
                break;
            }
        }
        return (Fragment) objPrevious;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Oa(EditActivity editActivity, View view) {
        editActivity.editAddDelegate.wTp();
        QmE.iF iFVarLm1 = editActivity.lm1();
        String string = editActivity.projectHolder.Uo().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        iFVarLm1.n(new j.T(string, rWZ.C.f73046e));
    }

    private final List Oo() {
        return (List) this.multiTrimButtons.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PHU(Function2 function2, EditActivity editActivity, ComponentActivity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function2.invoke(editActivity, Boolean.TRUE);
        return Unit.INSTANCE;
    }

    static /* synthetic */ void PbL(EditActivity editActivity, int i2, boolean z2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z2 = false;
        }
        editActivity.Zy(i2, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Pj7() {
        if (!this.pendingLongPress || rmO().o()) {
            return;
        }
        rmO().qie();
        this.pendingLongPress = false;
        this.didLongPressSelect = true;
        if (this.pendingLongPressId != 0) {
            Set<Long> selectedElements = this.sceneHolder.getSelection().getSelectedElements();
            if (selectedElements.contains(Long.valueOf(this.pendingLongPressId))) {
                SceneHolder sceneHolder = this.sceneHolder;
                sceneHolder.setSelection(SceneSelection.copy$default(sceneHolder.getSelection(), SetsKt.minus(selectedElements, Long.valueOf(this.pendingLongPressId)), null, null, null, null, null, null, null, false, null, null, null, 4094, null));
            } else {
                SceneHolder sceneHolder2 = this.sceneHolder;
                sceneHolder2.setSelection(SceneSelection.copy$default(sceneHolder2.getSelection(), SetsKt.plus(selectedElements, Long.valueOf(this.pendingLongPressId)), null, null, null, null, null, null, null, false, null, null, null, 4094, null));
                QmE.iF iFVarLm1 = lm1();
                String strUo = Uo();
                Set<Long> selectedElements2 = this.sceneHolder.getSelection().getSelectedElements();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(selectedElements2, 10));
                Iterator<T> it = selectedElements2.iterator();
                while (it.hasNext()) {
                    SceneElement sceneElementElementById = SceneKt.elementById(this.sceneHolder.getScene(), Long.valueOf(((Number) it.next()).longValue()));
                    arrayList.add(sceneElementElementById != null ? rWZ.j.rl(sceneElementElementById) : null);
                }
                iFVarLm1.n(new j.z3w(strUo, arrayList));
            }
            this.pendingLongPressId = 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String QM(List list) {
        return "updatePreviewEditMode eligible fragments: " + CollectionsKt.joinToString$default(list, ", ", null, null, 0, null, new Function1() { // from class: com.alightcreative.app.motion.activities.yLi
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EditActivity.i8z((Fragment) obj);
            }
        }, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RWT(com.alightcreative.widget.U4 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    private final void RWu(final Function0 continuation) {
        final Ref.IntRef intRef = new Ref.IntRef();
        final Ref.IntRef intRef2 = new Ref.IntRef();
        final Ref.IntRef intRef3 = new Ref.IntRef();
        for (final SceneElement sceneElement : this.sceneHolder.getRootScene().getElements()) {
            if (sceneElement.getType().getHasNestedScene() && sceneElement.getLinkedSceneUUID() != null) {
                File fileZ = HI0.afx.Z(this, sceneElement.getLinkedSceneUUID());
                if (fileZ.exists()) {
                    final Scene sceneUnserializeScene$default = SceneSerializerKt.unserializeScene$default(FilesKt.readText$default(fileZ, null, 1, null), false, false, false, 14, null);
                    if (sceneUnserializeScene$default.getModifiedTime() > sceneElement.getNestedScene().getModifiedTime()) {
                        XoT.C.Uo(this, new Function0() { // from class: com.alightcreative.app.motion.activities.iy
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return EditActivity.wY(sceneUnserializeScene$default, sceneElement);
                            }
                        });
                        intRef2.element++;
                    } else {
                        intRef.element++;
                    }
                } else {
                    intRef3.element++;
                }
            }
        }
        XoT.C.qie(this, new Function0() { // from class: com.alightcreative.app.motion.activities.J
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EditActivity.joB(intRef, intRef2, intRef3);
            }
        });
        int i2 = intRef2.element;
        if (i2 > 0 && intRef3.element > 0) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            Resources resources = getResources();
            int i3 = intRef3.element;
            builder.KN(resources.getQuantityString(2131886107, i3, Integer.valueOf(i3))).setNegativeButton(2132017378, new DialogInterface.OnClickListener() { // from class: com.alightcreative.app.motion.activities.Z5b
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i5) {
                    EditActivity.P(dialogInterface, i5);
                }
            }).ty(new DialogInterface.OnDismissListener() { // from class: com.alightcreative.app.motion.activities.qfL
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    EditActivity.vU(this.f45607n, intRef2, continuation, dialogInterface);
                }
            }).create().show();
            return;
        }
        if (i2 > 0) {
            AlertDialog.Builder builder2 = new AlertDialog.Builder(this);
            Resources resources2 = getResources();
            int i5 = intRef2.element;
            builder2.KN(resources2.getQuantityString(2131886106, i5, Integer.valueOf(i5))).setPositiveButton(2132020382, new DialogInterface.OnClickListener() { // from class: com.alightcreative.app.motion.activities.Su
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i7) {
                    EditActivity.RP(this.f44769n, dialogInterface, i7);
                }
            }).setNegativeButton(2132017694, new DialogInterface.OnClickListener() { // from class: com.alightcreative.app.motion.activities.I
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i7) {
                    EditActivity.ft(dialogInterface, i7);
                }
            }).ty(new DialogInterface.OnDismissListener() { // from class: com.alightcreative.app.motion.activities.dd
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    EditActivity.stI(continuation, dialogInterface);
                }
            }).create().show();
            return;
        }
        if (intRef3.element <= 0) {
            continuation.invoke();
            return;
        }
        AlertDialog.Builder builder3 = new AlertDialog.Builder(this);
        Resources resources3 = getResources();
        int i7 = intRef3.element;
        builder3.KN(resources3.getQuantityString(2131886107, i7, Integer.valueOf(i7))).setNegativeButton(2132017378, new DialogInterface.OnClickListener() { // from class: com.alightcreative.app.motion.activities.din
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                EditActivity.vI(dialogInterface, i8);
            }
        }).ty(new DialogInterface.OnDismissListener() { // from class: com.alightcreative.app.motion.activities.afV
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                EditActivity.vdt(continuation, dialogInterface);
            }
        }).create().show();
    }

    private final void Rd8() {
        ArrayList arrayList = new ArrayList();
        for (SceneElement sceneElement : this.sceneHolder.getRootScene().getElements()) {
            if (sceneElement.getType().getHasNestedScene() && sceneElement.getLinkedSceneUUID() != null) {
                File fileZ = HI0.afx.Z(this, sceneElement.getLinkedSceneUUID());
                if (fileZ.exists()) {
                    Scene sceneUnserializeScene$default = SceneSerializerKt.unserializeScene$default(FilesKt.readText$default(fileZ, null, 1, null), false, false, false, 14, null);
                    if (sceneUnserializeScene$default.getModifiedTime() > sceneElement.getNestedScene().getModifiedTime()) {
                        arrayList.add(SceneElement.copy$default(sceneElement, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, sceneUnserializeScene$default, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -8388609, 127, null));
                    }
                }
            }
        }
        SceneHolder sceneHolder = this.sceneHolder;
        sceneHolder.setRootScene(SceneKt.uniquifyIds(SceneKt.copyUpdatingElements(sceneHolder.getRootScene(), arrayList)));
        XoT.C.Uo(this, new Function0() { // from class: com.alightcreative.app.motion.activities.y
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EditActivity.cj();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Rx(EditActivity editActivity, View view) {
        yc.op opVar;
        int i2;
        int i3;
        int i5;
        String str;
        SceneHolder sceneHolder = editActivity.sceneHolder;
        yc.nKE userPreviewMode = sceneHolder.getUserPreviewMode();
        yc.op opVarHI = editActivity.sceneHolder.getUserPreviewMode().HI();
        int[] iArr = CN3.$EnumSwitchMapping$2;
        int i7 = iArr[opVarHI.ordinal()];
        if (i7 == 1) {
            opVar = yc.op.f76085t;
        } else if (i7 == 2) {
            opVar = yc.op.f76082O;
        } else {
            if (i7 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            opVar = yc.op.f76083n;
        }
        sceneHolder.setUserPreviewMode(userPreviewMode.rl((32703 & 1) != 0 ? userPreviewMode.f76062n : 0.0f, (32703 & 2) != 0 ? userPreviewMode.rl : null, (32703 & 4) != 0 ? userPreviewMode.f76063t : 0.0f, (32703 & 8) != 0 ? userPreviewMode.nr : null, (32703 & 16) != 0 ? userPreviewMode.f76061O : false, (32703 & 32) != 0 ? userPreviewMode.J2 : false, (32703 & 64) != 0 ? userPreviewMode.Uo : false, (32703 & 128) != 0 ? userPreviewMode.KN : 0.0f, (32703 & 256) != 0 ? userPreviewMode.xMQ : 0.0f, (32703 & 512) != 0 ? userPreviewMode.mUb : null, (32703 & 1024) != 0 ? userPreviewMode.gh : 0.0f, (32703 & 2048) != 0 ? userPreviewMode.qie : null, (32703 & 4096) != 0 ? userPreviewMode.az : false, (32703 & 8192) != 0 ? userPreviewMode.ty : false, (32703 & 16384) != 0 ? userPreviewMode.HI : opVar));
        SJ0.CN3 cn3 = editActivity.binding;
        if (cn3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn3 = null;
        }
        ImageButton imageButton = cn3.gh;
        Resources resources = editActivity.getResources();
        int i8 = iArr[editActivity.sceneHolder.getUserPreviewMode().HI().ordinal()];
        if (i8 != 1) {
            i3 = 2;
            if (i8 != 2) {
                i2 = 3;
                if (i8 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i5 = 2131231905;
            } else {
                i2 = 3;
                i5 = 2131231907;
            }
        } else {
            i2 = 3;
            i3 = 2;
            i5 = 2131231904;
        }
        imageButton.setImageDrawable(ResourcesCompat.J2(resources, i5, editActivity.getTheme()));
        QmE.iF iFVarLm1 = editActivity.lm1();
        Bundle bundle = new Bundle();
        int i9 = iArr[editActivity.sceneHolder.getUserPreviewMode().HI().ordinal()];
        if (i9 == 1) {
            str = "off";
        } else if (i9 == i3) {
            str = "solo";
        } else {
            if (i9 != i2) {
                throw new NoWhenBranchMatchedException();
            }
            str = "reduced_opacity";
        }
        bundle.putString("mode", str);
        Unit unit = Unit.INSTANCE;
        iFVarLm1.n(new j.fuX("viewmode_solo", bundle));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S2(final EditActivity editActivity, View view) {
        SceneHolder sceneHolder = editActivity.sceneHolder;
        yc.nKE userPreviewMode = sceneHolder.getUserPreviewMode();
        sceneHolder.setUserPreviewMode(userPreviewMode.rl((32703 & 1) != 0 ? userPreviewMode.f76062n : 0.0f, (32703 & 2) != 0 ? userPreviewMode.rl : null, (32703 & 4) != 0 ? userPreviewMode.f76063t : 0.0f, (32703 & 8) != 0 ? userPreviewMode.nr : null, (32703 & 16) != 0 ? userPreviewMode.f76061O : false, (32703 & 32) != 0 ? userPreviewMode.J2 : !editActivity.sceneHolder.getUserPreviewMode().ck(), (32703 & 64) != 0 ? userPreviewMode.Uo : false, (32703 & 128) != 0 ? userPreviewMode.KN : 0.0f, (32703 & 256) != 0 ? userPreviewMode.xMQ : 0.0f, (32703 & 512) != 0 ? userPreviewMode.mUb : null, (32703 & 1024) != 0 ? userPreviewMode.gh : 0.0f, (32703 & 2048) != 0 ? userPreviewMode.qie : null, (32703 & 4096) != 0 ? userPreviewMode.az : false, (32703 & 8192) != 0 ? userPreviewMode.ty : false, (32703 & 16384) != 0 ? userPreviewMode.HI : null));
        if (editActivity.sceneHolder.getUserPreviewMode().ck()) {
            int dimensionPixelSize = XoT.fuX.XQ(editActivity) ? editActivity.getResources().getDimensionPixelSize(2131166420) + editActivity.getResources().getDimensionPixelSize(2131165972) : -(editActivity.getResources().getDimensionPixelSize(2131166420) + editActivity.getResources().getDimensionPixelSize(2131165972));
            PopupWindow popupWindow = new PopupWindow(editActivity);
            popupWindow.setWidth(editActivity.getResources().getDimensionPixelSize(2131166420));
            popupWindow.setHeight(editActivity.getResources().getDimensionPixelSize(2131166419));
            popupWindow.setOutsideTouchable(true);
            popupWindow.setTouchable(true);
            popupWindow.setFocusable(true);
            popupWindow.setBackgroundDrawable(ResourcesCompat.J2(editActivity.getResources(), 2131232190, editActivity.getTheme()));
            final SJ0.qfL qflT = SJ0.qfL.t(LayoutInflater.from(editActivity));
            Intrinsics.checkNotNullExpressionValue(qflT, "inflate(...)");
            popupWindow.setContentView(qflT.getRoot());
            qflT.f9604t.setText(String.valueOf((int) editActivity.sceneHolder.getUserPreviewMode().Uo()));
            qflT.rl.setValue((int) editActivity.sceneHolder.getUserPreviewMode().Uo());
            qflT.rl.setMinValue(5);
            qflT.rl.setMaxValue(500);
            qflT.rl.setLimitRange(true);
            qflT.rl.setBrightMarks(CollectionsKt.listOf(40));
            qflT.rl.setOnSpinAbs(new Function1() { // from class: com.alightcreative.app.motion.activities.b
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return EditActivity.eLq(qflT, editActivity, ((Integer) obj).intValue());
                }
            });
            SJ0.CN3 cn3 = editActivity.binding;
            if (cn3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn3 = null;
            }
            popupWindow.showAsDropDown(cn3.xMQ, dimensionPixelSize, (-editActivity.getResources().getDimensionPixelSize(2131166419)) / 2);
        }
        view.setActivated(editActivity.sceneHolder.getUserPreviewMode().ck());
        QmE.iF iFVarLm1 = editActivity.lm1();
        Bundle bundle = new Bundle();
        bundle.putBoolean("enabled", editActivity.sceneHolder.getUserPreviewMode().ck());
        Unit unit = Unit.INSTANCE;
        iFVarLm1.n(new j.fuX("viewmode_grid", bundle));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Su(Function1 function1, final EditActivity editActivity, Function1 function12, ComponentActivity componentActivity, boolean z2) {
        Intrinsics.checkNotNullParameter(componentActivity, "<unused var>");
        if (!z2) {
            function1.invoke(editActivity);
            return Unit.INSTANCE;
        }
        final int i2 = editActivity.exportSerial + 1;
        editActivity.exportSerial = i2;
        SceneExporterKt.lockForExport();
        editActivity.j3I().v(new Function0() { // from class: com.alightcreative.app.motion.activities.Q6T
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EditActivity.ybf(i2, editActivity);
            }
        });
        function12.invoke(editActivity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Tpq(long itemId) {
        SceneElement sceneElementElementById = SceneKt.elementById(this.sceneHolder.getScene(), Long.valueOf(itemId));
        if (sceneElementElementById != null) {
            Fv(sceneElementElementById);
            QmE.iF iFVarLm1 = lm1();
            String string = this.projectHolder.Uo().toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            iFVarLm1.n(new j.din(string, rWZ.j.rl(sceneElementElementById)));
        }
    }

    private final void UJb() {
        if (this.playing) {
            j3I().pause();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String UV() {
        return "onStop";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Vm(Function1 function1, EditActivity editActivity, Function1 function12, ComponentActivity componentActivity, boolean z2) {
        SceneThumbnailMaker sceneThumbnailMaker;
        Intrinsics.checkNotNullParameter(componentActivity, "<unused var>");
        if (!z2) {
            function1.invoke(editActivity);
            return Unit.INSTANCE;
        }
        List listListOf = CollectionsKt.listOf(SceneKt.getProjectInfo(editActivity.sceneHolder.getScene(), editActivity.projectHolder.nr()));
        QmE.iF iFVarLm1 = editActivity.lm1();
        kgE.fuX fuxRst = editActivity.rst();
        List listMutableListOf = CollectionsKt.mutableListOf(editActivity.sceneHolder.getRootScene());
        rWZ.n nVar = editActivity.exportSnapshot;
        if (nVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("exportSnapshot");
            nVar = null;
        }
        List listMutableListOf2 = CollectionsKt.mutableListOf(nVar);
        SceneThumbnailMaker sceneThumbnailMaker2 = editActivity.shareThumbnailMaker;
        if (sceneThumbnailMaker2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("shareThumbnailMaker");
            sceneThumbnailMaker = null;
        } else {
            sceneThumbnailMaker = sceneThumbnailMaker2;
        }
        gIX.Dsr.mUb(editActivity, listListOf, iFVarLm1, fuxRst, listMutableListOf, listMutableListOf2, sceneThumbnailMaker, false, 64, null);
        function12.invoke(editActivity);
        return Unit.INSTANCE;
    }

    private final GK.j Wc() {
        return (GK.j) this.previewTouchGestureDetector.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String Wx(int i2, int i3) {
        return "updatePreviewSurface : Change Preview Size: " + i2 + ", " + i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit XPq(EditActivity editActivity, int i2, E3 clickedShape) {
        Intrinsics.checkNotNullParameter(clickedShape, "clickedShape");
        editActivity.editAddDelegate.nHg(clickedShape);
        QmE.iF iFVarLm1 = editActivity.lm1();
        String string = editActivity.projectHolder.Uo().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        iFVarLm1.n(new j.T(string, rWZ.C.f73048n));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit XT(EditActivity editActivity, boolean z2, boolean z3) {
        SJ0.CN3 cn3 = editActivity.binding;
        SJ0.CN3 cn32 = null;
        if (cn3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn3 = null;
        }
        cn3.iF.gh.setAlpha(z2 ? 1.0f : 0.3f);
        SJ0.CN3 cn33 = editActivity.binding;
        if (cn33 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            cn32 = cn33;
        }
        cn32.iF.KN.setAlpha(z3 ? 1.0f : 0.3f);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Xf(final EditActivity editActivity, View view) {
        final Map<Integer, SceneBookmark> bookmarks = editActivity.sceneHolder.getScene().getBookmarks();
        final int iTimeFromFrameNumber = TimeKt.timeFromFrameNumber(HW.C.HI(editActivity), editActivity.sceneHolder.getScene().getFramesPerHundredSeconds());
        SJ0.CN3 cn3 = null;
        if (bookmarks.containsKey(Integer.valueOf(iTimeFromFrameNumber))) {
            SceneHolder sceneHolder = editActivity.sceneHolder;
            sceneHolder.setScene(Scene.copy$default(sceneHolder.getScene(), null, 0, 0, 0, 0, 0, null, 0, null, null, null, MapsKt.minus(bookmarks, Integer.valueOf(iTimeFromFrameNumber)), null, 0, 0, 0, false, 0L, null, null, 1046527, null));
            XoT.C.Uo(editActivity, new Function0() { // from class: com.alightcreative.app.motion.activities.QhI
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EditActivity.RE(iTimeFromFrameNumber, editActivity, bookmarks);
                }
            });
            SJ0.CN3 cn32 = editActivity.binding;
            if (cn32 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn32 = null;
            }
            cn32.iF.rl.setActivated(false);
            SJ0.CN3 cn33 = editActivity.binding;
            if (cn33 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn33 = null;
            }
            ImageButton imageButton = cn33.iF.rl;
            SJ0.CN3 cn34 = editActivity.binding;
            if (cn34 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                cn3 = cn34;
            }
            imageButton.setImageResource(cn3.iF.rl.isActivated() ? 2131231551 : 2131231550);
            QmE.iF iFVarLm1 = editActivity.lm1();
            Bundle bundle = new Bundle();
            bundle.putString(FileUploadManager.f61572j, com.safedk.android.analytics.brandsafety.l.f62657l);
            Unit unit = Unit.INSTANCE;
            iFVarLm1.n(new j.fuX("add_remove_bookmark", bundle));
            return;
        }
        SceneHolder sceneHolder2 = editActivity.sceneHolder;
        sceneHolder2.setScene(Scene.copy$default(sceneHolder2.getScene(), null, 0, 0, 0, 0, 0, null, 0, null, null, null, MapsKt.plus(bookmarks, TuplesKt.to(Integer.valueOf(iTimeFromFrameNumber), new SceneBookmark(0))), null, 0, 0, 0, false, 0L, null, null, 1046527, null));
        XoT.C.Uo(editActivity, new Function0() { // from class: com.alightcreative.app.motion.activities.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EditActivity.Aq(iTimeFromFrameNumber, editActivity, bookmarks);
            }
        });
        SJ0.CN3 cn35 = editActivity.binding;
        if (cn35 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn35 = null;
        }
        cn35.iF.rl.setActivated(true);
        SJ0.CN3 cn36 = editActivity.binding;
        if (cn36 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn36 = null;
        }
        ImageButton imageButton2 = cn36.iF.rl;
        SJ0.CN3 cn37 = editActivity.binding;
        if (cn37 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            cn3 = cn37;
        }
        imageButton2.setImageResource(cn3.iF.rl.isActivated() ? 2131231551 : 2131231550);
        QmE.iF iFVarLm12 = editActivity.lm1();
        Bundle bundle2 = new Bundle();
        bundle2.putString(FileUploadManager.f61572j, "remove");
        Unit unit2 = Unit.INSTANCE;
        iFVarLm12.n(new j.fuX("add_remove_bookmark", bundle2));
    }

    private static final yc.tpM Xm(EditActivity editActivity) {
        Sequence sequenceFilter = SequencesKt.filter(SequencesKt.filter(SequencesKt.mapNotNull(CollectionsKt.asSequence(editActivity.attachedFragments), new Function1() { // from class: com.alightcreative.app.motion.activities.rd
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EditActivity.uMX((WeakReference) obj);
            }
        }), new Function1() { // from class: com.alightcreative.app.motion.activities.Il5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(EditActivity.Gi1((Fragment) obj));
            }
        }), qf.f44494n);
        Intrinsics.checkNotNull(sequenceFilter, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
        return (yc.tpM) SequencesKt.firstOrNull(sequenceFilter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit Xp(EditActivity editActivity) {
        SceneHolder sceneHolder = editActivity.sceneHolder;
        sceneHolder.setScene(Scene.copy$default(sceneHolder.getScene(), null, 0, 0, 0, 0, 0, null, 0, null, null, null, null, null, editActivity.sceneHolder.getScene().getReTimingInMark() > HW.C.Ik(editActivity) ? 0 : editActivity.sceneHolder.getScene().getReTimingInMark(), HW.C.Ik(editActivity), 0, false, 0L, null, null, 1023999, null));
        editActivity.lm1().n(new j.fuX("retiming_mark", null, 2, 0 == true ? 1 : 0));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit YR2(EditActivity editActivity, boolean z2) {
        if (editActivity.playing != z2) {
            editActivity.playing = z2;
            editActivity.JL();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ZVR(final EditActivity editActivity, com.alightcreative.widget.QJ item) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        if (!SceneKt.getHasActiveReTiming(editActivity.sceneHolder)) {
            item.Uo();
        }
        item.t(new Function0() { // from class: com.alightcreative.app.motion.activities.hWw
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EditActivity.nMV(this.f45262n);
            }
        });
        return Unit.INSTANCE;
    }

    private final void Zy(int frame, boolean force) {
        if (this.lastFPSCheckTime == 0) {
            this.lastFPSCheckTime = System.nanoTime();
            this.lastFPSCheckCount = Si.QJ.xMQ();
        } else {
            long jNanoTime = System.nanoTime();
            long jXMQ = Si.QJ.xMQ();
            long j2 = (jNanoTime - this.lastFPSCheckTime) / ((long) 1000000);
            long j3 = jXMQ - this.lastFPSCheckCount;
            if (j2 > 2000) {
                this.lastEstimatedFPS = ((j3 * ((long) 1000)) + ((long) 500)) / j2;
                this.lastFPSCheckTime = jNanoTime;
                this.lastFPSCheckCount = jXMQ;
            }
        }
        if (HW.C.HI(this) != frame || force) {
            GA().W1c(frame);
            SJ0.CN3 cn3 = this.binding;
            if (cn3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn3 = null;
            }
            cn3.bzg.invalidate();
            SJ0.CN3 cn32 = this.binding;
            if (cn32 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn32 = null;
            }
            cn32.iF.rl.setActivated(this.sceneHolder.getScene().getBookmarks().containsKey(Integer.valueOf(TimeKt.roundToFrame(HW.C.XQ(this), this.sceneHolder.getScene().getFramesPerHundredSeconds()))));
            SJ0.CN3 cn33 = this.binding;
            if (cn33 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn33 = null;
            }
            ImageButton imageButton = cn33.iF.rl;
            SJ0.CN3 cn34 = this.binding;
            if (cn34 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn34 = null;
            }
            imageButton.setImageResource(cn34.iF.rl.isActivated() ? 2131231551 : 2131231550);
            Iterator it = this.attachedFragments.iterator();
            while (it.hasNext()) {
                Object obj = ((WeakReference) it.next()).get();
                InterfaceC2452g interfaceC2452g = obj instanceof InterfaceC2452g ? (InterfaceC2452g) obj : null;
                if (interfaceC2452g != null) {
                    interfaceC2452g.gh();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String aYA() {
        return "onPause";
    }

    private final void aa() {
        LM.Wre wre = this.projectHolder;
        int i2 = CN3.$EnumSwitchMapping$6[this.sceneHolder.getRootScene().getType().ordinal()];
        if (i2 == 1) {
            QmE.iF iFVarLm1 = lm1();
            String string = wre.Uo().toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            iFVarLm1.n(new j.xTb(string));
            return;
        }
        if (i2 != 2) {
            return;
        }
        QmE.iF iFVarLm12 = lm1();
        String string2 = wre.Uo().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        iFVarLm12.n(new j.fg(string2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ag(C1462o c1462o, View view) {
        c1462o.f9576r.setVisibility(8);
        c1462o.Ik.setVisibility(0);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c1462o.Ik, "translationX", -(c1462o.Ik.getWidth() * 0.5f), 0.0f);
        objectAnimatorOfFloat.setDuration(200L);
        objectAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        objectAnimatorOfFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void bG(EditActivity editActivity, View view) {
        editActivity.editAddDelegate.Z();
        QmE.iF iFVarLm1 = editActivity.lm1();
        String string = editActivity.projectHolder.Uo().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        iFVarLm1.n(new j.T(string, rWZ.C.f73045Z));
        editActivity.lm1().n(new j.fuX("add_layer_emptygroup", null, 2, 0 == true ? 1 : 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String c52(MotionEvent motionEvent) {
        return "previewGuide/ACTION_UP: " + motionEvent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String cL(int i2, int i3) {
        return "onEndDragListener: " + i2 + " -> " + i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void cT(EditActivity editActivity, View view) {
        boolean zNr = editActivity.sceneHolder.getUserPreviewMode().nr();
        boolean z2 = !zNr;
        SceneHolder sceneHolder = editActivity.sceneHolder;
        yc.nKE userPreviewMode = sceneHolder.getUserPreviewMode();
        sceneHolder.setUserPreviewMode(!zNr ? userPreviewMode.rl((32703 & 1) != 0 ? userPreviewMode.f76062n : 0.0f, (32703 & 2) != 0 ? userPreviewMode.rl : null, (32703 & 4) != 0 ? userPreviewMode.f76063t : 0.0f, (32703 & 8) != 0 ? userPreviewMode.nr : null, (32703 & 16) != 0 ? userPreviewMode.f76061O : false, (32703 & 32) != 0 ? userPreviewMode.J2 : false, (32703 & 64) != 0 ? userPreviewMode.Uo : false, (32703 & 128) != 0 ? userPreviewMode.KN : 0.0f, (32703 & 256) != 0 ? userPreviewMode.xMQ : 0.0f, (32703 & 512) != 0 ? userPreviewMode.mUb : null, (32703 & 1024) != 0 ? userPreviewMode.gh : 0.0f, (32703 & 2048) != 0 ? userPreviewMode.qie : null, (32703 & 4096) != 0 ? userPreviewMode.az : true, (32703 & 8192) != 0 ? userPreviewMode.ty : false, (32703 & 16384) != 0 ? userPreviewMode.HI : null) : userPreviewMode.rl((32703 & 1) != 0 ? userPreviewMode.f76062n : 0.0f, (32703 & 2) != 0 ? userPreviewMode.rl : null, (32703 & 4) != 0 ? userPreviewMode.f76063t : 0.0f, (32703 & 8) != 0 ? userPreviewMode.nr : null, (32703 & 16) != 0 ? userPreviewMode.f76061O : false, (32703 & 32) != 0 ? userPreviewMode.J2 : false, (32703 & 64) != 0 ? userPreviewMode.Uo : false, (32703 & 128) != 0 ? userPreviewMode.KN : 0.0f, (32703 & 256) != 0 ? userPreviewMode.xMQ : 1.0f, (32703 & 512) != 0 ? userPreviewMode.mUb : Vector2D.INSTANCE.getZERO(), (32703 & 1024) != 0 ? userPreviewMode.gh : 0.0f, (32703 & 2048) != 0 ? userPreviewMode.qie : null, (32703 & 4096) != 0 ? userPreviewMode.az : false, (32703 & 8192) != 0 ? userPreviewMode.ty : false, (32703 & 16384) != 0 ? userPreviewMode.HI : null));
        view.setActivated(z2);
        if (zNr) {
            return;
        }
        com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
        if (jVar.getTurnedOnCameraView()) {
            return;
        }
        jVar.setTurnedOnCameraView(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ch(final EditActivity editActivity, com.alightcreative.widget.eO AlightMenu) {
        Intrinsics.checkNotNullParameter(AlightMenu, "$this$AlightMenu");
        if (SceneKt.isEditingNestedScene(editActivity.sceneHolder) || editActivity.sceneHolder.getRootScene().getType() == SceneType.ELEMENT) {
            AlightMenu.O(2132020117, new Function1() { // from class: com.alightcreative.app.motion.activities.cF
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return EditActivity.ZVR(this.f44927n, (com.alightcreative.widget.QJ) obj);
                }
            });
            AlightMenu.O(2132020118, new Function1() { // from class: com.alightcreative.app.motion.activities.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return EditActivity.kG(this.f45057n, (com.alightcreative.widget.QJ) obj);
                }
            });
        }
        if (editActivity.sceneHolder.getScene().getThumbnailTime() == HW.C.o(editActivity)) {
            AlightMenu.O(2132017435, new Function1() { // from class: com.alightcreative.app.motion.activities.QUT
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return EditActivity.Ek5(this.f44726n, (com.alightcreative.widget.QJ) obj);
                }
            });
        } else {
            AlightMenu.O(2132020119, new Function1() { // from class: com.alightcreative.app.motion.activities.wb
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return EditActivity.xY(this.f45716n, (com.alightcreative.widget.QJ) obj);
                }
            });
        }
        AlightMenu.n(editActivity.getResources().getDimensionPixelSize(2131166272));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String cj() {
        return "updateLinkedProjects OUT";
    }

    private final void d1() {
        if (com.alightcreative.app.motion.persist.j.INSTANCE.getTurnedOnCameraView()) {
            return;
        }
        SJ0.CN3 cn3 = this.binding;
        if (cn3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn3 = null;
        }
        ImageButton buttonPreviewMode = cn3.iF.Uo;
        Intrinsics.checkNotNullExpressionValue(buttonPreviewMode, "buttonPreviewMode");
        String string = getString(2132020337);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        HI0.o7q.HI(buttonPreviewMode, this, string, 2131558499, 0.87f, Sdk.SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE);
    }

    private final GK.j dDe() {
        return (GK.j) this.multiSelectScaleGestureDetector.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dI(EditActivity editActivity, com.alightcreative.account.o purchaseState) {
        Intrinsics.checkNotNullParameter(purchaseState, "purchaseState");
        editActivity.purchaseState = purchaseState;
        editActivity.qie();
        if (editActivity.isFinishing() || editActivity.isDestroyed()) {
            return;
        }
        editActivity.rst().HI(editActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit eLq(SJ0.qfL qfl, EditActivity editActivity, int i2) {
        qfl.f9604t.setText(String.valueOf(i2));
        SceneHolder sceneHolder = editActivity.sceneHolder;
        yc.nKE userPreviewMode = sceneHolder.getUserPreviewMode();
        sceneHolder.setUserPreviewMode(userPreviewMode.rl((32703 & 1) != 0 ? userPreviewMode.f76062n : 0.0f, (32703 & 2) != 0 ? userPreviewMode.rl : null, (32703 & 4) != 0 ? userPreviewMode.f76063t : 0.0f, (32703 & 8) != 0 ? userPreviewMode.nr : null, (32703 & 16) != 0 ? userPreviewMode.f76061O : false, (32703 & 32) != 0 ? userPreviewMode.J2 : false, (32703 & 64) != 0 ? userPreviewMode.Uo : false, (32703 & 128) != 0 ? userPreviewMode.KN : i2, (32703 & 256) != 0 ? userPreviewMode.xMQ : 0.0f, (32703 & 512) != 0 ? userPreviewMode.mUb : null, (32703 & 1024) != 0 ? userPreviewMode.gh : 0.0f, (32703 & 2048) != 0 ? userPreviewMode.qie : null, (32703 & 4096) != 0 ? userPreviewMode.az : false, (32703 & 8192) != 0 ? userPreviewMode.ty : false, (32703 & 16384) != 0 ? userPreviewMode.HI : null));
        return Unit.INSTANCE;
    }

    private final void eO() {
        SJ0.CN3 cn3 = this.binding;
        SJ0.CN3 cn32 = null;
        if (cn3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn3 = null;
        }
        cn3.f9097O.setText(getString(2132020383));
        SJ0.CN3 cn33 = this.binding;
        if (cn33 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            cn32 = cn33;
        }
        cn32.f9097O.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ef(EditActivity editActivity, ProjectInfo.n it) {
        Intrinsics.checkNotNullParameter(it, "it");
        editActivity.xxL().X(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f14(EditActivity editActivity, View view) {
        if (!editActivity.playing) {
            com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
            jVar.setLoopingPlay(!jVar.getLoopingPlay());
            SJ0.CN3 cn3 = editActivity.binding;
            if (cn3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn3 = null;
            }
            cn3.iF.J2.setImageResource(jVar.getLoopingPlay() ? 2131231053 : 2131231879);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f3(EditActivity editActivity, MotionEvent event, int i2, int i3, float f3, float f4) {
        Object next;
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getY() < editActivity.getResources().getDimension(2131166396)) {
            float dimension = editActivity.getResources().getDimension(2131166379) / 2.0f;
            Set<Integer> setKeySet = editActivity.sceneHolder.getScene().getBookmarks().keySet();
            if (!setKeySet.isEmpty()) {
                Set<Integer> set = setKeySet;
                Iterator<T> it = set.iterator();
                if (it.hasNext()) {
                    next = it.next();
                    if (it.hasNext()) {
                        int iAbs = Math.abs(((Number) next).intValue() - i2);
                        do {
                            Object next2 = it.next();
                            int iAbs2 = Math.abs(((Number) next2).intValue() - i2);
                            if (iAbs > iAbs2) {
                                next = next2;
                                iAbs = iAbs2;
                            }
                        } while (it.hasNext());
                    }
                } else {
                    next = null;
                }
                Integer num = (Integer) next;
                if (num != null && (Math.abs(num.intValue() - i2) * editActivity.GA().jX()) / 1000 < dimension) {
                    editActivity.iF(num.intValue());
                    return Unit.INSTANCE;
                }
                float x2 = event.getX();
                SJ0.CN3 cn3 = editActivity.binding;
                if (cn3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    cn3 = null;
                }
                if (x2 > cn3.bzg.getWidth() / 2.0f) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : set) {
                        if (((Number) obj).intValue() > editActivity.GA().MPw()) {
                            arrayList.add(obj);
                        }
                    }
                    Integer num2 = (Integer) CollectionsKt.minOrNull((Iterable) arrayList);
                    if (num2 != null) {
                        editActivity.iF(num2.intValue());
                    }
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : set) {
                        if (((Number) obj2).intValue() < editActivity.GA().MPw()) {
                            arrayList2.add(obj2);
                        }
                    }
                    Integer num3 = (Integer) CollectionsKt.maxOrNull((Iterable) arrayList2);
                    if (num3 != null) {
                        editActivity.iF(num3.intValue());
                    }
                }
            }
        }
        SJ0.CN3 cn32 = editActivity.binding;
        if (cn32 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn32 = null;
        }
        RecyclerView.Adapter adapter = cn32.bzg.getAdapter();
        yc.cF cFVar = adapter instanceof yc.cF ? (yc.cF) adapter : null;
        if (!(cFVar != null ? cFVar.nY() : false)) {
            editActivity.i0();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String fIU(int i2, EditActivity editActivity) {
        return "Seek to frame=" + i2 + " t=" + TimeKt.timeFromFrameNumber(i2, editActivity.sceneHolder.getScene().getFramesPerHundredSeconds());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fU(Function1 function1, final EditActivity editActivity, Function1 function12, final UO6.w6 w6Var, ComponentActivity componentActivity, boolean z2) {
        Intrinsics.checkNotNullParameter(componentActivity, "<unused var>");
        if (!z2) {
            function1.invoke(editActivity);
            return Unit.INSTANCE;
        }
        final int i2 = editActivity.exportSerial + 1;
        editActivity.exportSerial = i2;
        SceneExporterKt.lockForExport();
        editActivity.j3I().v(new Function0() { // from class: com.alightcreative.app.motion.activities.RP
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EditActivity.rVB(i2, editActivity, w6Var);
            }
        });
        function12.invoke(editActivity);
        return Unit.INSTANCE;
    }

    private final void fxm(boolean saveEvenIfEmpty) {
        this.projectHolder.az(saveEvenIfEmpty);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String g8() {
        return "onDestroy OUT";
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void gS(final String presetId, final String defaultTitle) {
        T t3;
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        AlertDialog alertDialogCreate = new AlertDialog.Builder(this).o(2132020037).Z(2131558660).setPositiveButton(2132020303, new DialogInterface.OnClickListener() { // from class: com.alightcreative.app.motion.activities.E
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                EditActivity.oJ(objectRef, this, presetId, defaultTitle, dialogInterface, i2);
            }
        }).setNegativeButton(2132017396, new DialogInterface.OnClickListener() { // from class: com.alightcreative.app.motion.activities.mf
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                EditActivity.UIA(dialogInterface, i2);
            }
        }).az(new DialogInterface.OnCancelListener() { // from class: com.alightcreative.app.motion.activities.cv
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                EditActivity.tDX(this.f45040n, dialogInterface);
            }
        }).create();
        alertDialogCreate.show();
        EditText editText = (EditText) alertDialogCreate.findViewById(2131362608);
        if (editText != null) {
            editText.setHint(defaultTitle);
            editText.addTextChangedListener(new lej(alertDialogCreate));
            t3 = editText;
        } else {
            t3 = 0;
        }
        objectRef.element = t3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List gUZ(EditActivity editActivity) {
        SJ0.CN3 cn3 = editActivity.binding;
        SJ0.CN3 cn32 = null;
        if (cn3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn3 = null;
        }
        ImageButton imageButton = cn3.f9108v.J2;
        SJ0.CN3 cn33 = editActivity.binding;
        if (cn33 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            cn32 = cn33;
        }
        return CollectionsKt.listOf((Object[]) new ImageButton[]{imageButton, cn32.f9108v.Uo});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit gVB(final EditActivity editActivity, List allLocalProjects) {
        SceneThumbnailMaker sceneThumbnailMaker;
        yc.Pl pl;
        SceneThumbnailMaker sceneThumbnailMaker2;
        Intrinsics.checkNotNullParameter(allLocalProjects, "allLocalProjects");
        editActivity.oM(allLocalProjects);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : allLocalProjects) {
            if (((ProjectInfo.n) obj).getType() == SceneType.PRESET) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        Pair pair = new Pair(arrayList, arrayList2);
        List list = (List) pair.component1();
        List list2 = (List) pair.component2();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : list2) {
            if (((ProjectInfo.n) obj2).isTemplate()) {
                arrayList3.add(obj2);
            } else {
                arrayList4.add(obj2);
            }
        }
        Pair pair2 = new Pair(arrayList3, arrayList4);
        editActivity.projectsList = (List) pair2.getSecond();
        editActivity.templatesList = (List) pair2.getFirst();
        editActivity.presetsList = CollectionsKt.sortedWith(list, new aC());
        SJ0.CN3 cn3 = editActivity.binding;
        if (cn3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn3 = null;
        }
        RecyclerView recyclerView = cn3.nr.nr;
        GridLayoutManager gridLayoutManager = new GridLayoutManager((Context) editActivity, 2, 0, false);
        gridLayoutManager.MPw(10);
        gridLayoutManager.Ro(true);
        recyclerView.setLayoutManager(gridLayoutManager);
        SJ0.CN3 cn32 = editActivity.binding;
        if (cn32 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn32 = null;
        }
        RecyclerView recyclerView2 = cn32.nr.nr;
        if (editActivity.selectedAddPopupTab == j.f44484r) {
            nYs.j jVarInvoke = editActivity.CX().invoke();
            boolean zXQ = jVarInvoke != null ? jVarInvoke.XQ() : false;
            HI0.Q q2 = new HI0.Q(editActivity);
            List listSortedWith = CollectionsKt.sortedWith(editActivity.templatesList, new C());
            BitmapLruCache bitmapLruCache = editActivity.elementThumbnailCache;
            SceneThumbnailMaker sceneThumbnailMaker3 = editActivity.elementThumbnailMaker;
            if (sceneThumbnailMaker3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("elementThumbnailMaker");
                sceneThumbnailMaker2 = null;
            } else {
                sceneThumbnailMaker2 = sceneThumbnailMaker3;
            }
            pl = new yc.Pl(q2, listSortedWith, bitmapLruCache, sceneThumbnailMaker2, new Function1() { // from class: com.alightcreative.app.motion.activities.Um
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj3) {
                    return EditActivity.ef(this.f44791n, (ProjectInfo.n) obj3);
                }
            }, new Function0() { // from class: com.alightcreative.app.motion.activities.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EditActivity.c3(this.f44860n);
                }
            }, zXQ ? Integer.valueOf(editActivity.qd().rl(WK.Ml.f11459t) ? 2131558719 : 2131558718) : null, new Function0() { // from class: com.alightcreative.app.motion.activities.Dt
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EditActivity.V4(this.f44389n);
                }
            });
        } else {
            HI0.Q q3 = new HI0.Q(editActivity);
            List list3 = editActivity.projectsList;
            ArrayList arrayList5 = new ArrayList();
            for (Object obj3 : list3) {
                if (((ProjectInfo.n) obj3).getType() == SceneType.ELEMENT) {
                    arrayList5.add(obj3);
                }
            }
            List listSortedWith2 = CollectionsKt.sortedWith(arrayList5, new o());
            BitmapLruCache bitmapLruCache2 = editActivity.elementThumbnailCache;
            SceneThumbnailMaker sceneThumbnailMaker4 = editActivity.elementThumbnailMaker;
            if (sceneThumbnailMaker4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("elementThumbnailMaker");
                sceneThumbnailMaker = null;
            } else {
                sceneThumbnailMaker = sceneThumbnailMaker4;
            }
            pl = new yc.Pl(q3, listSortedWith2, bitmapLruCache2, sceneThumbnailMaker, new Function1() { // from class: com.alightcreative.app.motion.activities.Buf
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    return EditActivity.iJ(this.f44349n, (ProjectInfo.n) obj4);
                }
            }, new Function0() { // from class: com.alightcreative.app.motion.activities.MKd
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EditActivity.xif(this.f44636n);
                }
            }, 2131558717, new Function0() { // from class: com.alightcreative.app.motion.activities.ya
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EditActivity.oD(this.f45748n);
                }
            });
        }
        recyclerView2.setAdapter(pl);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final nSC gv8(EditActivity editActivity) {
        IG.Ml mlXxL = editActivity.xxL();
        SJ0.CN3 cn3 = editActivity.binding;
        if (cn3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn3 = null;
        }
        return new nSC(editActivity, mlXxL, cn3, editActivity.editAddDelegate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l.CN3 hJ4() {
        return (l.CN3) this.cloudBackupViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence hmG(AMTypefaceError.AMMissingTypefaceError it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return "• " + it.getMissingTypefaceDisplayName();
    }

    private final void hxH() {
        SJ0.CN3 cn3 = null;
        if ((!SceneKt.getHasExternalMedia(this.sceneHolder.getScene()) || XoT.fuX.ck(this)) && (!SceneKt.getHasExternalAudio(this.sceneHolder.getScene()) || XoT.fuX.ty(this))) {
            SJ0.CN3 cn32 = this.binding;
            if (cn32 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn32 = null;
            }
            cn32.aYN.setVisibility(8);
            SJ0.CN3 cn33 = this.binding;
            if (cn33 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn33 = null;
            }
            cn33.nY.setVisibility(8);
            SJ0.CN3 cn34 = this.binding;
            if (cn34 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                cn3 = cn34;
            }
            cn3.ViF.setVisibility(8);
            return;
        }
        SJ0.CN3 cn35 = this.binding;
        if (cn35 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn35 = null;
        }
        cn35.aYN.setVisibility(0);
        SJ0.CN3 cn36 = this.binding;
        if (cn36 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn36 = null;
        }
        cn36.nY.setVisibility(0);
        SJ0.CN3 cn37 = this.binding;
        if (cn37 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            cn3 = cn37;
        }
        cn3.ViF.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence i8z(Fragment f3) {
        Intrinsics.checkNotNullParameter(f3, "f");
        String simpleName = f3.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        return simpleName;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit iJ(EditActivity editActivity, ProjectInfo.n it) {
        Intrinsics.checkNotNullParameter(it, "it");
        VS vs = editActivity.editAddDelegate;
        UUID uuidFromString = UUID.fromString(it.getId());
        Intrinsics.checkNotNullExpressionValue(uuidFromString, "fromString(...)");
        vs.N(uuidFromString);
        return Unit.INSTANCE;
    }

    static /* synthetic */ void jI(EditActivity editActivity, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        editActivity.fxm(z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void jT(EditActivity editActivity) {
        SJ0.CN3 cn3 = editActivity.binding;
        SJ0.CN3 cn32 = null;
        if (cn3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn3 = null;
        }
        cn3.KN.setAlpha(1.0f);
        SJ0.CN3 cn33 = editActivity.binding;
        if (cn33 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            cn32 = cn33;
        }
        cn32.KN.setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String joB(Ref.IntRef intRef, Ref.IntRef intRef2, Ref.IntRef intRef3) {
        return "askUpdateLinkedProjects: upToDate=" + intRef.element + " needUpdate=" + intRef2.element + " missing=" + intRef3.element;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit kG(final EditActivity editActivity, com.alightcreative.widget.QJ item) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        if (!SceneKt.getHasActiveReTiming(editActivity.sceneHolder)) {
            item.Uo();
        }
        item.t(new Function0() { // from class: com.alightcreative.app.motion.activities.nKE
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EditActivity.Xp(this.f45553n);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void kI0(EditActivity editActivity, FragmentManager fragmentManager, Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragmentManager, "<unused var>");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        editActivity.attachedFragments.add(new WeakReference(fragment));
        CollectionsKt.removeAll(editActivity.attachedFragments, new Function1() { // from class: com.alightcreative.app.motion.activities.Iuj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(EditActivity.CTr((WeakReference) obj));
            }
        });
        editActivity.ARa();
    }

    private final void kNi() {
        if (this.playing || this.playPending) {
            return;
        }
        this.playPending = true;
        Ogx.n().set(1);
        SJ0.CN3 cn3 = this.binding;
        SJ0.CN3 cn32 = null;
        if (cn3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn3 = null;
        }
        cn3.iF.J2.setImageResource(com.alightcreative.app.motion.persist.j.INSTANCE.getLoopingPlay() ? 2131231540 : 2131231866);
        SJ0.CN3 cn33 = this.binding;
        if (cn33 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn33 = null;
        }
        cn33.iF.J2.setAlpha(0.5f);
        SJ0.CN3 cn34 = this.binding;
        if (cn34 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            cn32 = cn34;
        }
        cn32.iF.J2.postDelayed(new Runnable() { // from class: com.alightcreative.app.motion.activities.oJ
            @Override // java.lang.Runnable
            public final void run() {
                EditActivity.yR(this.f45565n);
            }
        }, 10L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ke(EditActivity editActivity) {
        LdY.Ml ml = editActivity.undoManager;
        LdY.Ml ml2 = null;
        if (ml == null) {
            Intrinsics.throwUninitializedPropertyAccessException("undoManager");
            ml = null;
        }
        ml.o();
        SceneHolder sceneHolder = editActivity.sceneHolder;
        LdY.Ml ml3 = editActivity.undoManager;
        if (ml3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("undoManager");
        } else {
            ml2 = ml3;
        }
        sceneHolder.setEditingSerial(ml2.qie());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit kl6(EditActivity editActivity) {
        editActivity.oKr(new Function0() { // from class: com.alightcreative.app.motion.activities.tQj
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EditActivity.y8();
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GK.j ln(EditActivity editActivity) {
        return new GK.j(editActivity, editActivity.new u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lu4(EditActivity editActivity, ProjectInfo.n nVar, rWZ.eO eOVar, DialogInterface it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.dismiss();
        editActivity.AW8(nVar, eOVar, Boolean.FALSE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lv(Function1 function1, final EditActivity editActivity, UO6.w6 w6Var, Function1 function12, ComponentActivity componentActivity, boolean z2) {
        Intrinsics.checkNotNullParameter(componentActivity, "<unused var>");
        if (!z2) {
            function1.invoke(editActivity);
            return Unit.INSTANCE;
        }
        final int i2 = editActivity.exportSerial + 1;
        editActivity.exportSerial = i2;
        final Scene sceneCopy$default = Scene.copy$default(editActivity.sceneHolder.getScene(), null, 0, 0, 0, 0, 0, null, UO6.iF.n(editActivity.sceneHolder.getScene().getFramesPerHundredSeconds(), w6Var.nr()), null, null, null, null, null, 0, 0, 0, false, 0L, null, null, 1048447, null);
        final ExportParams exportParamsExportParamsGif$default = SceneExporterKt.exportParamsGif$default(editActivity.sceneHolder.getScene(), w6Var, 0, 0, 0, 14, null);
        SceneExporterKt.lockForExport();
        editActivity.j3I().v(new Function0() { // from class: com.alightcreative.app.motion.activities.I5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EditActivity.xn(i2, editActivity, sceneCopy$default, exportParamsExportParamsGif$default);
            }
        });
        function12.invoke(editActivity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m7(EditActivity editActivity, SceneElement sceneElement) {
        if (editActivity.pendingLongPress && !editActivity.twoFingerGesture) {
            editActivity.sceneHolder.setSelection(SceneKt.selectionHint(sceneElement));
        }
        editActivity.selectionHintRunnable = null;
    }

    private final HI0.l4Z mBA() {
        return (HI0.l4Z) this.mediaListLoader.getValue();
    }

    private final void mG(j tab) {
        if (this.selectedAddPopupTab != tab) {
            this.selectedAddPopupTab = tab;
            Fd(tab);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit nMV(EditActivity editActivity) {
        SceneHolder sceneHolder = editActivity.sceneHolder;
        sceneHolder.setScene(Scene.copy$default(sceneHolder.getScene(), null, 0, 0, 0, 0, 0, null, 0, null, null, null, null, null, HW.C.o(editActivity), editActivity.sceneHolder.getScene().getReTimingOutMark() < HW.C.o(editActivity) ? 0 : editActivity.sceneHolder.getScene().getReTimingOutMark(), 0, false, 0L, null, null, 1023999, null));
        editActivity.lm1().n(new j.fuX("retiming_mark", null, 2, 0 == true ? 1 : 0));
        return Unit.INSTANCE;
    }

    private static final void nRv(EditActivity editActivity) {
        SJ0.CN3 cn3 = editActivity.binding;
        SJ0.CN3 cn32 = null;
        if (cn3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn3 = null;
        }
        TabLayout tabLayout = cn3.nr.f9383X;
        SJ0.CN3 cn33 = editActivity.binding;
        if (cn33 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn33 = null;
        }
        tabLayout.bzg(cn33.nr.f9389r, true);
        int dimensionPixelOffset = editActivity.getResources().getDimensionPixelOffset(2131165277);
        int dimensionPixelOffset2 = editActivity.getResources().getDimensionPixelOffset(2131165278);
        SJ0.CN3 cn34 = editActivity.binding;
        if (cn34 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn34 = null;
        }
        int width = cn34.nr.E2.getWidth() - (dimensionPixelOffset * 2);
        int iCoerceAtLeast = RangesKt.coerceAtLeast(width / dimensionPixelOffset2, 4);
        int iCoerceAtLeast2 = RangesKt.coerceAtLeast(width - (dimensionPixelOffset2 * iCoerceAtLeast), 0) / iCoerceAtLeast;
        int i2 = width - ((dimensionPixelOffset2 + iCoerceAtLeast2) * iCoerceAtLeast);
        if (i2 > 0) {
            SJ0.CN3 cn35 = editActivity.binding;
            if (cn35 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn35 = null;
            }
            float width2 = (cn35.nr.E2.getWidth() - r3) / 2.0f;
            SJ0.CN3 cn36 = editActivity.binding;
            if (cn36 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn36 = null;
            }
            ViewPager viewPager = cn36.nr.f9389r;
            int i3 = (int) ((width2 + (iCoerceAtLeast2 / 2)) - i2);
            SJ0.CN3 cn37 = editActivity.binding;
            if (cn37 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn37 = null;
            }
            int paddingTop = cn37.nr.f9389r.getPaddingTop();
            SJ0.CN3 cn38 = editActivity.binding;
            if (cn38 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn38 = null;
            }
            viewPager.setPadding(i3, paddingTop, 0, cn38.nr.f9389r.getPaddingBottom());
        }
        SJ0.CN3 cn39 = editActivity.binding;
        if (cn39 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            cn32 = cn39;
        }
        ViewPager viewPager2 = cn32.nr.f9389r;
        FragmentManager supportFragmentManager = editActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        viewPager2.setAdapter(new I28(supportFragmentManager, XoT.fuX.XQ(editActivity), iCoerceAtLeast * 3, editActivity.shapeList.size(), iCoerceAtLeast2 > 0 ? iCoerceAtLeast2 / 2 : 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nfh(final EditActivity editActivity) {
        editActivity.RWu(new Function0() { // from class: com.alightcreative.app.motion.activities.nr
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EditActivity.kl6(this.f45562n);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yc.Kk1 oCi(EditActivity editActivity) {
        return new yc.Kk1(editActivity.sceneHolder, editActivity, editActivity.lm1());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit oD(EditActivity editActivity) {
        SJ0.CN3 cn3 = editActivity.binding;
        if (cn3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn3 = null;
        }
        RecyclerView addCompList = cn3.nr.nr;
        Intrinsics.checkNotNullExpressionValue(addCompList, "addCompList");
        addCompList.setVisibility(4);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void oJ(Ref.ObjectRef objectRef, EditActivity editActivity, String str, String str2, DialogInterface dialogInterface, int i2) {
        Editable text;
        EditText editText = (EditText) objectRef.element;
        String string = (editText == null || (text = editText.getText()) == null) ? null : text.toString();
        if (string == null) {
            string = "";
        }
        if (!StringsKt.isBlank(string)) {
            str2 = string;
        }
        editActivity.xxL().s7N(str, str2);
        dialogInterface.cancel();
    }

    private final void oKr(final Function0 continuation) {
        Pair pair;
        AMTypefaceError aMTypefaceErrorN;
        AMTypefaceError aMTypefaceErrorN2;
        ArrayList arrayList = new ArrayList();
        Scene rootScene = this.sceneHolder.getRootScene();
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = rootScene.getElements().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            SceneElement sceneElement = (SceneElement) it.next();
            CollectionsKt.emptyList();
            if (sceneElement.getType() == SceneElementType.Text && !StringsKt.isBlank(sceneElement.getText().getFont()) && (aMTypefaceErrorN2 = com.alightcreative.app.motion.fonts.w6.f45792t.t(sceneElement.getText().getFont()).n()) != null) {
                AMTypefaceError.AMMissingTypefaceError aMMissingTypefaceError = aMTypefaceErrorN2 instanceof AMTypefaceError.AMMissingTypefaceError ? (AMTypefaceError.AMMissingTypefaceError) aMTypefaceErrorN2 : null;
                if (aMMissingTypefaceError != null) {
                    arrayList.add(aMMissingTypefaceError);
                }
            }
            if (sceneElement.getType().getHasNestedScene()) {
                arrayList2.add(TuplesKt.to(CollectionsKt.listOf(sceneElement), sceneElement.getNestedScene()));
            }
        }
        do {
            pair = (Pair) XoT.qz.n(arrayList2);
            if (pair != null) {
                List list = (List) pair.component1();
                for (SceneElement sceneElement2 : ((Scene) pair.component2()).getElements()) {
                    if (sceneElement2.getType() == SceneElementType.Text && !StringsKt.isBlank(sceneElement2.getText().getFont()) && (aMTypefaceErrorN = com.alightcreative.app.motion.fonts.w6.f45792t.t(sceneElement2.getText().getFont()).n()) != null) {
                        AMTypefaceError.AMMissingTypefaceError aMMissingTypefaceError2 = aMTypefaceErrorN instanceof AMTypefaceError.AMMissingTypefaceError ? (AMTypefaceError.AMMissingTypefaceError) aMTypefaceErrorN : null;
                        if (aMMissingTypefaceError2 != null) {
                            arrayList.add(aMMissingTypefaceError2);
                        }
                    }
                    if (sceneElement2.getType().getHasNestedScene()) {
                        arrayList2.add(TuplesKt.to(CollectionsKt.plus((Collection<? extends SceneElement>) list, sceneElement2), sceneElement2.getNestedScene()));
                    }
                }
            }
        } while (pair != null);
        if (arrayList.isEmpty()) {
            continuation.invoke();
        } else {
            new AlertDialog.Builder(this).o(2132019623).KN(getString(2132019624, CollectionsKt.joinToString$default(arrayList, "\n", null, null, 0, null, new Function1() { // from class: com.alightcreative.app.motion.activities.kO
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return EditActivity.hmG((AMTypefaceError.AMMissingTypefaceError) obj);
                }
            }, 30, null))).setNegativeButton(2132017378, new DialogInterface.OnClickListener() { // from class: com.alightcreative.app.motion.activities.G
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    EditActivity.Kqf(dialogInterface, i2);
                }
            }).ty(new DialogInterface.OnDismissListener() { // from class: com.alightcreative.app.motion.activities.hzY
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    EditActivity.gv0(continuation, dialogInterface);
                }
            }).create().show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void oW(Set selectedItemIds) {
        SJ0.CN3 cn3 = this.binding;
        SJ0.CN3 cn32 = null;
        if (cn3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn3 = null;
        }
        cn3.rV9.getRoot().setVisibility(selectedItemIds.isEmpty() ? 4 : 0);
        SJ0.CN3 cn33 = this.binding;
        if (cn33 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn33 = null;
        }
        cn33.f9108v.getRoot().setVisibility(selectedItemIds.isEmpty() ? 4 : 0);
        SJ0.CN3 cn34 = this.binding;
        if (cn34 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn34 = null;
        }
        cn34.J2.setVisibility(selectedItemIds.isEmpty() ? 0 : 4);
        SJ0.CN3 cn35 = this.binding;
        if (cn35 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            cn32 = cn35;
        }
        cn32.rV9.f9575o.setText(getResources().getQuantityString(2131886105, selectedItemIds.size(), Integer.valueOf(selectedItemIds.size())));
        SceneHolder sceneHolder = this.sceneHolder;
        sceneHolder.setSelection(SceneSelection.copy$default(sceneHolder.getSelection(), selectedItemIds, null, null, null, null, null, null, null, false, null, null, null, 4092, null));
        qE1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void oh(C1462o c1462o, View view) {
        c1462o.f9576r.setVisibility(0);
        c1462o.Ik.setVisibility(8);
        Intrinsics.checkNotNull(view.getParent(), "null cannot be cast to non-null type android.view.View");
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c1462o.f9576r, "translationX", ((View) r4).getWidth() * 0.5f, 0.0f);
        objectAnimatorOfFloat.setDuration(200L);
        objectAnimatorOfFloat.setInterpolator(new AccelerateInterpolator());
        objectAnimatorOfFloat.start();
    }

    private final void qE1() {
        Object next;
        if (this.sceneHolder.getSelection().isMultiSelect()) {
            List<SceneElement> elements = this.sceneHolder.getScene().getElements();
            ArrayList arrayList = new ArrayList();
            for (Object obj : elements) {
                if (UpJ().contains(Long.valueOf(((SceneElement) obj).getId()))) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            Object next2 = null;
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int startTime = ((SceneElement) next).getStartTime();
                    do {
                        Object next3 = it.next();
                        int startTime2 = ((SceneElement) next3).getStartTime();
                        if (startTime > startTime2) {
                            next = next3;
                            startTime = startTime2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            SceneElement sceneElement = (SceneElement) next;
            List<SceneElement> elements2 = this.sceneHolder.getScene().getElements();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : elements2) {
                if (UpJ().contains(Long.valueOf(((SceneElement) obj2).getId()))) {
                    arrayList2.add(obj2);
                }
            }
            Iterator it2 = arrayList2.iterator();
            if (it2.hasNext()) {
                next2 = it2.next();
                if (it2.hasNext()) {
                    int endTime = ((SceneElement) next2).getEndTime();
                    do {
                        Object next4 = it2.next();
                        int endTime2 = ((SceneElement) next4).getEndTime();
                        if (endTime < endTime2) {
                            next2 = next4;
                            endTime = endTime2;
                        }
                    } while (it2.hasNext());
                }
            }
            SceneElement sceneElement2 = (SceneElement) next2;
            if (sceneElement != null && sceneElement.getStartTime() >= HW.C.o(this)) {
                Iterator it3 = Oo().iterator();
                while (it3.hasNext()) {
                    ((ImageButton) it3.next()).setVisibility(8);
                }
                Iterator it4 = uCx().iterator();
                while (it4.hasNext()) {
                    ((ImageButton) it4.next()).setVisibility(0);
                }
                Iterator it5 = Nj().iterator();
                while (it5.hasNext()) {
                    ((ImageButton) it5.next()).setVisibility(8);
                }
                return;
            }
            if (sceneElement2 == null || sceneElement2.getEndTime() > HW.C.Ik(this)) {
                Iterator it6 = Oo().iterator();
                while (it6.hasNext()) {
                    ((ImageButton) it6.next()).setVisibility(0);
                }
                Iterator it7 = uCx().iterator();
                while (it7.hasNext()) {
                    ((ImageButton) it7.next()).setVisibility(8);
                }
                Iterator it8 = Nj().iterator();
                while (it8.hasNext()) {
                    ((ImageButton) it8.next()).setVisibility(8);
                }
                return;
            }
            Iterator it9 = Oo().iterator();
            while (it9.hasNext()) {
                ((ImageButton) it9.next()).setVisibility(8);
            }
            Iterator it10 = uCx().iterator();
            while (it10.hasNext()) {
                ((ImageButton) it10.next()).setVisibility(8);
            }
            Iterator it11 = Nj().iterator();
            while (it11.hasNext()) {
                ((ImageButton) it11.next()).setVisibility(0);
            }
        }
    }

    static /* synthetic */ void qFG(EditActivity editActivity, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        editActivity.E5K(z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit rVB(int i2, EditActivity editActivity, UO6.w6 w6Var) {
        rWZ.n nVar;
        if (i2 != editActivity.exportSerial) {
            return Unit.INSTANCE;
        }
        if (w6Var.t() == j.fuX.f45850n) {
            Scene sceneCopy$default = Scene.copy$default(editActivity.sceneHolder.getScene(), null, 0, 0, 0, 0, 0, null, UO6.iF.n(editActivity.sceneHolder.getScene().getFramesPerHundredSeconds(), w6Var.nr()), null, null, null, null, null, 0, 0, 0, false, 0L, null, null, 1048447, null);
            ExportParams exportParamsExportParamsImageSeqInZip$default = SceneExporterKt.exportParamsImageSeqInZip$default(sceneCopy$default, w6Var, 0, 0, 0, Bitmap.CompressFormat.PNG, 0, 46, null);
            Si.Xo xoJ3I = editActivity.j3I();
            UUID uuidUo = editActivity.projectHolder.Uo();
            String string = editActivity.getResources().getString(2132019051);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            String string2 = editActivity.getResources().getString(2132020151);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            String sha1 = SceneKt.getSha1(editActivity.sceneHolder.getScene());
            QmE.iF iFVarLm1 = editActivity.lm1();
            fVJ.w6 w6VarCY = editActivity.CY();
            String string3 = editActivity.projectHolder.Uo().toString();
            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
            cBL.j jVarRl = w6VarCY.rl(string3);
            xAo.I28 i28UQo = editActivity.uQo();
            rWZ.n nVar2 = editActivity.exportSnapshot;
            if (nVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("exportSnapshot");
                nVar = null;
            } else {
                nVar = nVar2;
            }
            Qk.r.ViF(editActivity, sceneCopy$default, xoJ3I, uuidUo, exportParamsExportParamsImageSeqInZip$default, "zip", "application/zip", string, string2, sha1, iFVarLm1, jVarRl, i28UQo, nVar);
        } else if (w6Var.t() == j.fuX.f45852t) {
            ExportParams exportParamsExportParamsImageSeqInZip$default2 = SceneExporterKt.exportParamsImageSeqInZip$default(editActivity.sceneHolder.getScene(), w6Var, 0, 0, 0, Bitmap.CompressFormat.JPEG, 0, 46, null);
            Scene sceneCopy$default2 = Scene.copy$default(editActivity.sceneHolder.getScene(), null, 0, 0, 0, 0, 0, null, UO6.iF.n(editActivity.sceneHolder.getScene().getFramesPerHundredSeconds(), w6Var.nr()), null, null, null, null, null, 0, 0, 0, false, 0L, null, null, 1048447, null);
            Si.Xo xoJ3I2 = editActivity.j3I();
            UUID uuidUo2 = editActivity.projectHolder.Uo();
            String string4 = editActivity.getResources().getString(2132019051);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            String string5 = editActivity.getResources().getString(2132020151);
            Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
            String sha12 = SceneKt.getSha1(editActivity.sceneHolder.getScene());
            QmE.iF iFVarLm12 = editActivity.lm1();
            fVJ.w6 w6VarCY2 = editActivity.CY();
            String string6 = editActivity.projectHolder.Uo().toString();
            Intrinsics.checkNotNullExpressionValue(string6, "toString(...)");
            cBL.j jVarRl2 = w6VarCY2.rl(string6);
            xAo.I28 i28UQo2 = editActivity.uQo();
            rWZ.n nVar3 = editActivity.exportSnapshot;
            if (nVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("exportSnapshot");
                nVar3 = null;
            }
            Qk.r.ViF(editActivity, sceneCopy$default2, xoJ3I2, uuidUo2, exportParamsExportParamsImageSeqInZip$default2, "zip", "application/zip", string4, string5, sha12, iFVarLm12, jVarRl2, i28UQo2, nVar3);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final yc.Kk1 rmO() {
        return (yc.Kk1) this.previewPanZoomHandler.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List s6(EditActivity editActivity) {
        SJ0.CN3 cn3 = editActivity.binding;
        SJ0.CN3 cn32 = null;
        if (cn3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn3 = null;
        }
        ImageButton imageButton = cn3.f9108v.mUb;
        SJ0.CN3 cn33 = editActivity.binding;
        if (cn33 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn33 = null;
        }
        ImageButton imageButton2 = cn33.f9108v.gh;
        SJ0.CN3 cn34 = editActivity.binding;
        if (cn34 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            cn32 = cn34;
        }
        return CollectionsKt.listOf((Object[]) new ImageButton[]{imageButton, imageButton2, cn32.f9108v.xMQ});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sAr(EditActivity editActivity, ComponentActivity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        su(editActivity, false, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String sg(MotionEvent motionEvent) {
        return "onPreviewTouchWithSelection/ACTION_UP: " + motionEvent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sv(int i2, EditActivity editActivity, UO6.w6 w6Var, VideoEncoding videoEncoding, boolean z2) {
        ExportedVideoAttachment exportedVideoAttachmentHI;
        cBL.j jVar;
        UUID uuid;
        rWZ.n nVar;
        SceneThumbnailMaker sceneThumbnailMaker;
        rWZ.n nVar2;
        if (i2 != editActivity.exportSerial) {
            return Unit.INSTANCE;
        }
        Scene scene = editActivity.sceneHolder.getScene();
        int iMin = Math.min(w6Var.J2(), w6Var.O());
        int iMin2 = Math.min(scene.getWidth(), scene.getHeight());
        int iN = UO6.n.n(((scene.getWidth() * iMin) / iMin2) * ((scene.getHeight() * iMin) / iMin2), UO6.iF.n(scene.getFramesPerHundredSeconds(), w6Var.nr()) / 100, w6Var);
        Scene sceneCopy$default = Scene.copy$default(scene, null, 0, 0, 0, 0, 0, null, UO6.iF.n(scene.getFramesPerHundredSeconds(), w6Var.nr()), null, null, null, null, null, 0, 0, 0, false, 0L, null, null, 1048447, null);
        ExportParams exportParamsExportParamsVideo$default = SceneExporterKt.exportParamsVideo$default(scene, w6Var, 0, 0, 0, 0, iN, 0, 0, videoEncoding, Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE, null);
        if (z2) {
            nYs.j jVarInvoke = editActivity.CX().invoke();
            if (jVarInvoke == null || (exportedVideoAttachmentHI = jVarInvoke.HI()) == null) {
                exportedVideoAttachmentHI = ExportedVideoAttachment.NONE;
            }
            ExportedVideoAttachment exportedVideoAttachment = exportedVideoAttachmentHI;
            Si.Xo xoJ3I = editActivity.j3I();
            UUID uuidUo = editActivity.projectHolder.Uo();
            QmE.iF iFVarLm1 = editActivity.lm1();
            kgE.fuX fuxRst = editActivity.rst();
            fVJ.w6 w6VarCY = editActivity.CY();
            String string = editActivity.projectHolder.Uo().toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            cBL.j jVarRl = w6VarCY.rl(string);
            rWZ.n nVar3 = editActivity.exportSnapshot;
            if (nVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("exportSnapshot");
                nVar3 = null;
            }
            rWZ.n nVar4 = editActivity.templateToggleExportSnapshot;
            if (nVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("templateToggleExportSnapshot");
                nVar4 = null;
            }
            SceneThumbnailMaker sceneThumbnailMaker2 = editActivity.shareThumbnailMaker;
            if (sceneThumbnailMaker2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("shareThumbnailMaker");
                jVar = jVarRl;
                uuid = uuidUo;
                rWZ.n nVar5 = nVar3;
                sceneThumbnailMaker = null;
                nVar = nVar5;
            } else {
                jVar = jVarRl;
                uuid = uuidUo;
                nVar = nVar3;
                sceneThumbnailMaker = sceneThumbnailMaker2;
            }
            gIX.afx.t(editActivity, sceneCopy$default, xoJ3I, uuid, exportParamsExportParamsVideo$default, iFVarLm1, fuxRst, jVar, nVar, nVar4, sceneThumbnailMaker, exportedVideoAttachment);
        } else {
            Si.Xo xoJ3I2 = editActivity.j3I();
            UUID uuidUo2 = editActivity.projectHolder.Uo();
            String string2 = editActivity.getResources().getString(2132019052);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            String string3 = editActivity.getResources().getString(2132020154);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            String sha1 = SceneKt.getSha1(scene);
            QmE.iF iFVarLm12 = editActivity.lm1();
            fVJ.w6 w6VarCY2 = editActivity.CY();
            String string4 = editActivity.projectHolder.Uo().toString();
            Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
            cBL.j jVarRl2 = w6VarCY2.rl(string4);
            xAo.I28 i28UQo = editActivity.uQo();
            rWZ.n nVar6 = editActivity.exportSnapshot;
            if (nVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("exportSnapshot");
                nVar2 = null;
            } else {
                nVar2 = nVar6;
            }
            Qk.r.ViF(editActivity, sceneCopy$default, xoJ3I2, uuidUo2, exportParamsExportParamsVideo$default, com.safedk.android.utils.n.f63223d, "video/mp4", string2, string3, sha1, iFVarLm12, jVarRl2, i28UQo, nVar2);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t5(EditActivity editActivity, SceneHolderState it) {
        String str;
        Drawable drawableJ2;
        SceneElement sceneElementElementById;
        Intrinsics.checkNotNullParameter(it, "it");
        XoT.C.Uo(editActivity, new Function0() { // from class: com.alightcreative.app.motion.activities.D
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EditActivity.uj();
            }
        });
        if (editActivity.pauseEditTimer) {
            editActivity.yJD();
        }
        int iKN = (int) (yc.RP.KN(editActivity.sceneHolder.getUserPreviewMode()) * 100.0f);
        SJ0.CN3 cn3 = editActivity.binding;
        SJ0.CN3 cn32 = null;
        if (cn3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn3 = null;
        }
        AppCompatTextView appCompatTextView = cn3.qie.nr;
        if (iKN >= 99999) {
            str = "99999+";
        } else {
            str = iKN + "%";
        }
        appCompatTextView.setText(str);
        SJ0.CN3 cn33 = editActivity.binding;
        if (cn33 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn33 = null;
        }
        cn33.az.setText(((int) (yc.RP.KN(editActivity.sceneHolder.getUserPreviewMode()) * 100.0f)) + "%");
        editActivity.cKA();
        SJ0.CN3 cn34 = editActivity.binding;
        if (cn34 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn34 = null;
        }
        cn34.te.nr.setImageResource(SceneKt.isEditingNestedScene(editActivity.sceneHolder) ? 2131231029 : 2131231718);
        SJ0.CN3 cn35 = editActivity.binding;
        if (cn35 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn35 = null;
        }
        cn35.te.J2.setVisibility(SceneKt.isEditingNestedScene(editActivity.sceneHolder) ? 8 : 0);
        SJ0.CN3 cn36 = editActivity.binding;
        if (cn36 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn36 = null;
        }
        cn36.te.f9118O.setVisibility(SceneKt.isEditingNestedScene(editActivity.sceneHolder) ? 0 : 8);
        TimelineLayoutManager timelineLayoutManagerGA = editActivity.GA();
        timelineLayoutManagerGA.cAB(editActivity.sceneHolder.getScene().getTotalTime());
        timelineLayoutManagerGA.WKb(editActivity.sceneHolder.getScene().getFramesPerHundredSeconds());
        timelineLayoutManagerGA.GT(editActivity.sceneHolder.getScene().getBookmarks());
        if (!SceneKt.getHasActiveReTiming(editActivity.sceneHolder) || (editActivity.sceneHolder.getScene().getReTimingInMark() <= 0 && editActivity.sceneHolder.getScene().getReTimingOutMark() <= 0)) {
            timelineLayoutManagerGA.R3E(null);
            timelineLayoutManagerGA.Yq(null);
        } else {
            timelineLayoutManagerGA.R3E(Integer.valueOf(editActivity.sceneHolder.getScene().getReTimingInMark()));
            timelineLayoutManagerGA.Yq(Integer.valueOf((editActivity.sceneHolder.getScene().getReTimingOutMark() == 0 || editActivity.sceneHolder.getScene().getReTimingOutMark() < editActivity.sceneHolder.getScene().getReTimingInMark()) ? editActivity.sceneHolder.getScene().getTotalTime() : editActivity.sceneHolder.getScene().getReTimingOutMark()));
        }
        timelineLayoutManagerGA.f11(Integer.valueOf(editActivity.sceneHolder.getScene().getThumbnailTime()));
        SJ0.CN3 cn37 = editActivity.binding;
        if (cn37 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn37 = null;
        }
        cn37.iF.rl.setActivated(editActivity.sceneHolder.getScene().getBookmarks().containsKey(Integer.valueOf(TimeKt.roundToFrame(HW.C.XQ(editActivity), editActivity.sceneHolder.getScene().getFramesPerHundredSeconds()))));
        SJ0.CN3 cn38 = editActivity.binding;
        if (cn38 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn38 = null;
        }
        ImageButton imageButton = cn38.iF.rl;
        SJ0.CN3 cn39 = editActivity.binding;
        if (cn39 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn39 = null;
        }
        imageButton.setImageResource(cn39.iF.rl.isActivated() ? 2131231551 : 2131231550);
        LdY.Ml ml = editActivity.undoManager;
        if (ml == null) {
            Intrinsics.throwUninitializedPropertyAccessException("undoManager");
            ml = null;
        }
        ml.ck(editActivity.sceneHolder.getRootScene());
        SceneHolder sceneHolder = editActivity.sceneHolder;
        LdY.Ml ml2 = editActivity.undoManager;
        if (ml2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("undoManager");
            ml2 = null;
        }
        sceneHolder.setEditingSerial(ml2.qie());
        if (SceneKt.isEditingNestedScene(editActivity.sceneHolder)) {
            SJ0.CN3 cn310 = editActivity.binding;
            if (cn310 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn310 = null;
            }
            cn310.te.nr.setVisibility(8);
            SJ0.CN3 cn311 = editActivity.binding;
            if (cn311 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn311 = null;
            }
            cn311.te.rl.setVisibility(0);
            IntRange indices = CollectionsKt.getIndices(editActivity.sceneHolder.getEditingNestedSceneIds());
            ArrayList arrayList = new ArrayList();
            Iterator<Integer> it2 = indices.iterator();
            while (it2.hasNext()) {
                int iNextInt = ((IntIterator) it2).nextInt();
                Scene editingScene = SceneKt.getEditingScene(editActivity.sceneHolder, iNextInt);
                String label = (editingScene == null || (sceneElementElementById = SceneKt.elementById(editingScene, editActivity.sceneHolder.getEditingNestedSceneIds().get(iNextInt))) == null) ? null : sceneElementElementById.getLabel();
                if (label != null) {
                    arrayList.add(label);
                }
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList2.add(0, editActivity.sceneHolder.getRootScene().getTitle());
            SJ0.CN3 cn312 = editActivity.binding;
            if (cn312 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn312 = null;
            }
            if (cn312.te.rl.getAdapter() == null) {
                SJ0.CN3 cn313 = editActivity.binding;
                if (cn313 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    cn313 = null;
                }
                cn313.te.rl.setAdapter(new yc.ozJ(arrayList2, new DAz(editActivity)));
            } else {
                SJ0.CN3 cn314 = editActivity.binding;
                if (cn314 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    cn314 = null;
                }
                RecyclerView.Adapter adapter = cn314.te.rl.getAdapter();
                yc.ozJ ozj = adapter instanceof yc.ozJ ? (yc.ozJ) adapter : null;
                if (ozj != null) {
                    ozj.ty(arrayList2);
                    Unit unit = Unit.INSTANCE;
                }
                SJ0.CN3 cn315 = editActivity.binding;
                if (cn315 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    cn315 = null;
                }
                RecyclerView.Adapter adapter2 = cn315.te.rl.getAdapter();
                if (adapter2 != null) {
                    adapter2.notifyDataSetChanged();
                    Unit unit2 = Unit.INSTANCE;
                }
                SJ0.CN3 cn316 = editActivity.binding;
                if (cn316 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    cn316 = null;
                }
                cn316.te.rl.scrollToPosition(arrayList2.size() - 1);
            }
            SJ0.CN3 cn317 = editActivity.binding;
            if (cn317 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn317 = null;
            }
            cn317.te.Uo.setVisibility(8);
            SJ0.CN3 cn318 = editActivity.binding;
            if (cn318 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn318 = null;
            }
            cn318.te.KN.setVisibility(8);
        } else {
            SJ0.CN3 cn319 = editActivity.binding;
            if (cn319 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn319 = null;
            }
            cn319.te.nr.setVisibility(0);
            SJ0.CN3 cn320 = editActivity.binding;
            if (cn320 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn320 = null;
            }
            cn320.te.rl.setVisibility(8);
            SJ0.CN3 cn321 = editActivity.binding;
            if (cn321 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn321 = null;
            }
            cn321.te.Uo.setVisibility(0);
            SJ0.CN3 cn322 = editActivity.binding;
            if (cn322 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn322 = null;
            }
            cn322.te.KN.setVisibility(0);
            editActivity.O7();
            SJ0.CN3 cn323 = editActivity.binding;
            if (cn323 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn323 = null;
            }
            if (!Intrinsics.areEqual(String.valueOf(cn323.te.Uo.getText()), editActivity.sceneHolder.getScene().getTitle())) {
                SJ0.CN3 cn324 = editActivity.binding;
                if (cn324 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    cn324 = null;
                }
                cn324.te.Uo.setText(editActivity.sceneHolder.getScene().getTitle());
            }
        }
        AudioThumbnailView.INSTANCE.n(SceneKt.audioUris(editActivity.sceneHolder.getScene()));
        Iterator it3 = editActivity.attachedFragments.iterator();
        while (it3.hasNext()) {
            Object obj = ((WeakReference) it3.next()).get();
            yc.H h2 = obj instanceof yc.H ? (yc.H) obj : null;
            if (h2 != null) {
                h2.nr();
                Unit unit3 = Unit.INSTANCE;
            }
        }
        qFG(editActivity, false, 1, null);
        editActivity.vH3().M7(SceneKt.getMultiSelectionElements(editActivity.sceneHolder.getSelection()));
        if (HW.C.XQ(editActivity) > editActivity.sceneHolder.getScene().getTotalTime()) {
            editActivity.iF(editActivity.sceneHolder.getScene().getTotalTime());
        }
        if (editActivity.UpJ().isEmpty()) {
            SJ0.CN3 cn325 = editActivity.binding;
            if (cn325 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn325 = null;
            }
            cn325.KN.setImageDrawable(ResourcesCompat.J2(editActivity.getResources(), 2131232048, editActivity.getTheme()));
            SJ0.CN3 cn326 = editActivity.binding;
            if (cn326 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn326 = null;
            }
            cn326.gh.setEnabled(false);
            SJ0.CN3 cn327 = editActivity.binding;
            if (cn327 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn327 = null;
            }
            cn327.gh.setImageDrawable(ResourcesCompat.J2(editActivity.getResources(), 2131231906, editActivity.getTheme()));
        } else {
            SJ0.CN3 cn328 = editActivity.binding;
            if (cn328 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn328 = null;
            }
            cn328.KN.animate().cancel();
            SJ0.CN3 cn329 = editActivity.binding;
            if (cn329 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn329 = null;
            }
            cn329.KN.clearAnimation();
            SJ0.CN3 cn330 = editActivity.binding;
            if (cn330 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn330 = null;
            }
            cn330.KN.setAlpha(1.0f);
            SJ0.CN3 cn331 = editActivity.binding;
            if (cn331 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn331 = null;
            }
            cn331.KN.setVisibility(0);
            SJ0.CN3 cn332 = editActivity.binding;
            if (cn332 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn332 = null;
            }
            cn332.KN.setImageDrawable(ResourcesCompat.J2(editActivity.getResources(), editActivity.sceneHolder.getUserPreviewMode().KN() ? 2131232050 : 2131232049, editActivity.getTheme()));
            SJ0.CN3 cn333 = editActivity.binding;
            if (cn333 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn333 = null;
            }
            cn333.gh.setEnabled(true);
            SJ0.CN3 cn334 = editActivity.binding;
            if (cn334 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn334 = null;
            }
            ImageButton imageButton2 = cn334.gh;
            int i2 = CN3.$EnumSwitchMapping$2[editActivity.sceneHolder.getUserPreviewMode().HI().ordinal()];
            if (i2 == 1) {
                drawableJ2 = ResourcesCompat.J2(editActivity.getResources(), 2131231904, editActivity.getTheme());
            } else if (i2 == 2) {
                drawableJ2 = ResourcesCompat.J2(editActivity.getResources(), 2131231907, editActivity.getTheme());
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                drawableJ2 = ResourcesCompat.J2(editActivity.getResources(), 2131231905, editActivity.getTheme());
            }
            imageButton2.setImageDrawable(drawableJ2);
        }
        SJ0.CN3 cn335 = editActivity.binding;
        if (cn335 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            cn32 = cn335;
        }
        ImageButton imageButton3 = cn32.Uo;
        Scene sceneG = HW.C.g(editActivity);
        imageButton3.setEnabled(sceneG != null ? SceneKt.hasCameraObject(sceneG) : false);
        editActivity.hxH();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void tWM(EditActivity editActivity) {
        Set<String> installedAppVersions = com.alightcreative.app.motion.persist.j.INSTANCE.getInstalledAppVersions();
        if ((installedAppVersions instanceof Collection) && installedAppVersions.isEmpty()) {
            return;
        }
        Iterator<T> it = installedAppVersions.iterator();
        while (it.hasNext()) {
            SJ0.CN3 cn3 = null;
            if (StringsKt.startsWith$default((String) it.next(), "3.", false, 2, (Object) null)) {
                if (StringsKt.startsWith$default("5.0.273.1028425", "4.", false, 2, (Object) null)) {
                    com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
                    if (jVar.getShowBookmarkTooltip()) {
                        return;
                    }
                    SJ0.CN3 cn32 = editActivity.binding;
                    if (cn32 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        cn3 = cn32;
                    }
                    View playheadTouchZone = cn3.fD;
                    Intrinsics.checkNotNullExpressionValue(playheadTouchZone, "playheadTouchZone");
                    String string = editActivity.getString(2132020337);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    HI0.o7q.ty(playheadTouchZone, editActivity, string);
                    jVar.setShowBookmarkTooltip(true);
                    return;
                }
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void tjg(EditActivity editActivity, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float fFloatValue = ((Float) animatedValue).floatValue();
        SJ0.CN3 cn3 = editActivity.binding;
        SJ0.CN3 cn32 = null;
        if (cn3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn3 = null;
        }
        cn3.f9099T.setAlpha(fFloatValue);
        SJ0.CN3 cn33 = editActivity.binding;
        if (cn33 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn33 = null;
        }
        cn33.f9096N.setAlpha(fFloatValue);
        SJ0.CN3 cn34 = editActivity.binding;
        if (cn34 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            cn32 = cn34;
        }
        cn32.nHg.setAlpha(fFloatValue);
    }

    private final void uB(boolean requestedVisible) {
        if (this.zoomViewShownOnPreview == requestedVisible) {
            return;
        }
        this.zoomViewShownOnPreview = requestedVisible;
        SJ0.CN3 cn3 = null;
        if (!requestedVisible) {
            SJ0.CN3 cn32 = this.binding;
            if (cn32 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn32 = null;
            }
            cn32.az.animate().alpha(0.0f).setDuration(2000L).withEndAction(new Runnable() { // from class: com.alightcreative.app.motion.activities.yht
                @Override // java.lang.Runnable
                public final void run() {
                    EditActivity.vE(this.f45750n);
                }
            });
            if (UpJ().isEmpty()) {
                SJ0.CN3 cn33 = this.binding;
                if (cn33 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    cn33 = null;
                }
                if (cn33.KN.getVisibility() == 0) {
                    SJ0.CN3 cn34 = this.binding;
                    if (cn34 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        cn3 = cn34;
                    }
                    cn3.KN.animate().alpha(0.0f).setDuration(2000L).withEndAction(new Runnable() { // from class: com.alightcreative.app.motion.activities.Fo
                        @Override // java.lang.Runnable
                        public final void run() {
                            EditActivity.jT(this.f44540n);
                        }
                    });
                    return;
                }
                return;
            }
            return;
        }
        SJ0.CN3 cn35 = this.binding;
        if (cn35 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn35 = null;
        }
        cn35.KN.clearAnimation();
        SJ0.CN3 cn36 = this.binding;
        if (cn36 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn36 = null;
        }
        cn36.az.clearAnimation();
        SJ0.CN3 cn37 = this.binding;
        if (cn37 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn37 = null;
        }
        cn37.KN.animate().cancel();
        SJ0.CN3 cn38 = this.binding;
        if (cn38 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn38 = null;
        }
        cn38.az.animate().cancel();
        SJ0.CN3 cn39 = this.binding;
        if (cn39 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn39 = null;
        }
        cn39.KN.setAlpha(1.0f);
        SJ0.CN3 cn310 = this.binding;
        if (cn310 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn310 = null;
        }
        cn310.az.setAlpha(1.0f);
        SJ0.CN3 cn311 = this.binding;
        if (cn311 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn311 = null;
        }
        cn311.KN.setVisibility(0);
        SJ0.CN3 cn312 = this.binding;
        if (cn312 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            cn3 = cn312;
        }
        cn3.az.setVisibility(0);
    }

    private final void uBv() {
        yU.rv6 rv6Var = new yU.rv6(this, getResources().getDimensionPixelSize(2131166341), getResources().getDimensionPixelOffset(2131166340));
        rv6Var.KN(new iwV());
        SJ0.CN3 cn3 = this.binding;
        SJ0.CN3 cn32 = null;
        if (cn3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn3 = null;
        }
        SurfaceView surfaceView = cn3.wTp;
        SJ0.CN3 cn33 = this.binding;
        if (cn33 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn33 = null;
        }
        int width = (cn33.wTp.getWidth() / 2) - (rv6Var.getWidth() / 2);
        SJ0.CN3 cn34 = this.binding;
        if (cn34 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            cn32 = cn34;
        }
        rv6Var.showAsDropDown(surfaceView, width, -((cn32.wTp.getHeight() / 2) + (rv6Var.getHeight() / 2)));
    }

    private final List uCx() {
        return (List) this.multiLeftExtendButtons.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Fragment uMX(WeakReference it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (Fragment) it.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit uh(EditActivity editActivity, ProjectInfo.n nVar, rWZ.eO eOVar, DialogInterface it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.dismiss();
        editActivity.AW8(nVar, eOVar, Boolean.TRUE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String uj() {
        return "RenderOPTI onSceneUpdate";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String v58() {
        return "onDestroy IN";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GK.j vD(EditActivity editActivity) {
        return new GK.j(editActivity, editActivity.new Pl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void vE(EditActivity editActivity) {
        SJ0.CN3 cn3 = editActivity.binding;
        SJ0.CN3 cn32 = null;
        if (cn3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn3 = null;
        }
        cn3.az.setAlpha(1.0f);
        SJ0.CN3 cn33 = editActivity.binding;
        if (cn33 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            cn32 = cn33;
        }
        cn32.az.setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void vU(final EditActivity editActivity, Ref.IntRef intRef, final Function0 function0, DialogInterface dialogInterface) {
        AlertDialog.Builder builder = new AlertDialog.Builder(editActivity);
        Resources resources = editActivity.getResources();
        int i2 = intRef.element;
        builder.KN(resources.getQuantityString(2131886106, i2, Integer.valueOf(i2))).setPositiveButton(2132020382, new DialogInterface.OnClickListener() { // from class: com.alightcreative.app.motion.activities.jjk
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface2, int i3) {
                EditActivity.vp(this.f45300n, dialogInterface2, i3);
            }
        }).setNegativeButton(2132017694, new DialogInterface.OnClickListener() { // from class: com.alightcreative.app.motion.activities.hl
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface2, int i3) {
                EditActivity.Pd(dialogInterface2, i3);
            }
        }).ty(new DialogInterface.OnDismissListener() { // from class: com.alightcreative.app.motion.activities.FdJ
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface2) {
                EditActivity.u(function0, dialogInterface2);
            }
        }).create().show();
    }

    private final void vZY(Intent intent) {
        String action = intent.getAction();
        if (action != null) {
            int iHashCode = action.hashCode();
            if (iHashCode == -72545060) {
                if (action.equals("com.alightcreative.app.motion.action.OPEN_TRIAL_DIALOG")) {
                    Hez();
                    int intExtra = intent.getIntExtra("numAdsWatched", 0);
                    int intExtra2 = intent.getIntExtra("numAdsToWatch", 0);
                    Xo.Companion jVar = xhQ.Xo.INSTANCE;
                    FragmentManager supportFragmentManager = getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                    jVar.n(supportFragmentManager, 2131362855, CollectionsKt.listOf(this.projectHolder.Uo().toString()), intExtra, intExtra2);
                    return;
                }
                return;
            }
            if (iHashCode != 159773871) {
                if (iHashCode == 1170915874 && action.equals("com.alightcreative.app.motion.action.CLOSE_TRIAL_DIALOG")) {
                    Xo.Companion jVar2 = xhQ.Xo.INSTANCE;
                    FragmentManager supportFragmentManager2 = getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "getSupportFragmentManager(...)");
                    jVar2.rl(supportFragmentManager2);
                    return;
                }
                return;
            }
            if (action.equals("com.alightcreative.app.motion.action.OPEN_EXPORT_PAGE")) {
                FragmentTransaction fragmentTransactionO = getSupportFragmentManager().o();
                Intrinsics.checkNotNullExpressionValue(fragmentTransactionO, "beginTransaction(...)");
                Fragment fragmentPJg = getSupportFragmentManager().pJg("ExportListFrag");
                if (fragmentPJg != null) {
                    fragmentTransactionO.r(fragmentPJg);
                }
                fragmentTransactionO.KN(null);
                Hez();
                fragmentTransactionO.o(2131362855, qf.Companion.rl(UO6.qf.INSTANCE, null, false, CollectionsKt.arrayListOf(2131361919, 2131361915, 2131361916, 2131361971, 2131361970, 2131361994, 2131361914), 0, this.projectHolder.nr().length(), 0L, null, false, 235, null)).KN("ExportListFrag").mUb();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List vqZ(EditActivity editActivity) {
        SJ0.CN3 cn3 = editActivity.binding;
        SJ0.CN3 cn32 = null;
        if (cn3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn3 = null;
        }
        ImageButton imageButton = cn3.f9108v.f9090O;
        SJ0.CN3 cn33 = editActivity.binding;
        if (cn33 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            cn32 = cn33;
        }
        return CollectionsKt.listOf((Object[]) new ImageButton[]{imageButton, cn32.f9108v.KN});
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean wH(final MotionEvent event) {
        final boolean z2;
        XoT.C.Uo(this, new Function0() { // from class: com.alightcreative.app.motion.activities.VY8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EditActivity.rN(event, this);
            }
        });
        SceneElement sceneElementT = HW.C.T(this);
        if (sceneElementT == null) {
            return false;
        }
        if (event.getActionMasked() == 0) {
            this.prevEditMode = this.sceneHolder.getEditMode();
        }
        Wc().KN(event);
        SceneHolder sceneHolder = this.sceneHolder;
        float x2 = event.getX();
        float y2 = event.getY();
        SJ0.CN3 cn3 = this.binding;
        if (cn3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn3 = null;
        }
        SurfaceView previewView = cn3.wTp;
        Intrinsics.checkNotNullExpressionValue(previewView, "previewView");
        Vector2D vector2DNr = yc.RP.nr(sceneHolder, x2, y2, previewView);
        float fComponent1 = vector2DNr.getX();
        float fComponent2 = vector2DNr.getY();
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            this.undoBatch = ck();
            this.prevTouchX = fComponent1;
            this.prevTouchY = fComponent2;
            this.inGesture = true;
            this.inDragGesture = false;
            this.inScaleGesture = false;
            this.gestureHandler = new Function2() { // from class: com.alightcreative.app.motion.activities.tZ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EditActivity.K5(this.f45683n, ((Float) obj).floatValue(), ((Float) obj2).floatValue());
                }
            };
        } else if (actionMasked == 1) {
            this.undoBatch.n();
            this.inGesture = false;
            this.gestureHandler = null;
            this.sceneHolder.setEditMode(this.prevEditMode);
            if (!this.inDragGesture && !this.inScaleGesture) {
                if (HW.C.XQ(this) < sceneElementT.getStartTime() || HW.C.XQ(this) >= sceneElementT.getEndTime()) {
                    z2 = false;
                    final boolean z3 = ON() instanceof f0P.tC;
                    XoT.C.Uo(this, new Function0() { // from class: com.alightcreative.app.motion.activities.qhS
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return EditActivity.TQm(z2, z3, event, this);
                        }
                    });
                    if (!z2 && z3 && event.getDownTime() - this.lastTapTime < ViewConfiguration.getDoubleTapTimeout()) {
                        if (this.delayedClosePending) {
                            this.delayedClosePending = false;
                            this.handler.removeCallbacks(this.delayedCloseAfterDoubleTapRunnable);
                        }
                        int i2 = CN3.$EnumSwitchMapping$4[sceneElementT.getType().ordinal()];
                        if (i2 != 1) {
                            if (i2 != 2) {
                                if (i2 == 3) {
                                    rV9(2131361912);
                                } else if (i2 == 4) {
                                    rV9(2131361904);
                                }
                            } else if (sceneElementT.getLinkedSceneUUID() == null || SceneKt.getSettableUserParams(sceneElementT.getNestedScene()).isEmpty()) {
                                rV9(2131361908);
                            } else {
                                rV9(2131361905);
                            }
                        } else if (sceneElementT.getLiveShape().getId() == null) {
                            rV9(2131361910);
                        } else {
                            rV9(2131361906);
                        }
                    } else if (event.getEventTime() - event.getDownTime() < this.longPressTime) {
                        XoT.C.Uo(this, new Function0() { // from class: com.alightcreative.app.motion.activities.H9
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return EditActivity.sg(event);
                            }
                        });
                        if (!z2 || !z3) {
                            i0();
                        }
                    }
                } else {
                    Scene scene = this.sceneHolder.getScene();
                    float fFractionalTime = SceneElementKt.fractionalTime(sceneElementT, HW.C.XQ(this));
                    yc.nKE userPreviewMode = this.sceneHolder.getUserPreviewMode();
                    int iHI = HW.C.HI(this);
                    Scene sceneG = HW.C.g(this);
                    if (SceneElementKt.hitTestAtTime(sceneElementT, scene, fComponent1, fComponent2, fFractionalTime, userPreviewMode, iHI, sceneG != null ? sceneG.getFramesPerHundredSeconds() : 30)) {
                        z2 = true;
                    }
                    final boolean z32 = ON() instanceof f0P.tC;
                    XoT.C.Uo(this, new Function0() { // from class: com.alightcreative.app.motion.activities.qhS
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return EditActivity.TQm(z2, z32, event, this);
                        }
                    });
                    if (!z2) {
                        if (event.getEventTime() - event.getDownTime() < this.longPressTime) {
                        }
                    }
                }
            }
            this.lastTapTime = event.getEventTime();
            this.inDragGesture = false;
        } else if (actionMasked != 2) {
            if (actionMasked == 5) {
                this.inScaleGesture = true;
            }
        } else if (this.inGesture && !this.inScaleGesture) {
            final float f3 = fComponent1 - this.prevTouchX;
            final float f4 = fComponent2 - this.prevTouchY;
            if (Math.abs(f3) >= JF7() || Math.abs(f4) >= JF7() || this.inDragGesture || event.getEventTime() - event.getDownTime() > this.longPressTime) {
                XoT.C.Uo(this, new Function0() { // from class: com.alightcreative.app.motion.activities.pIF
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return EditActivity.gdQ(f3, f4, event, this);
                    }
                });
                this.inDragGesture = true;
                this.prevTouchX = fComponent1;
                this.prevTouchY = fComponent2;
                Function2 function2 = this.gestureHandler;
                if (function2 != null) {
                    function2.invoke(Float.valueOf(f3), Float.valueOf(f4));
                }
                this.sceneHolder.setEditMode(2131362616);
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x0p(EditActivity editActivity, View view) {
        if (editActivity.playing) {
            editActivity.UJb();
        } else {
            editActivity.kNi();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit xY(final EditActivity editActivity, com.alightcreative.widget.QJ item) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        item.t(new Function0() { // from class: com.alightcreative.app.motion.activities.hg
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EditActivity.BUS(this.f45263n);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String xYi() {
        return "onResume";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit xn(int i2, EditActivity editActivity, Scene scene, ExportParams exportParams) {
        if (i2 != editActivity.exportSerial) {
            return Unit.INSTANCE;
        }
        Si.Xo xoJ3I = editActivity.j3I();
        UUID uuidUo = editActivity.projectHolder.Uo();
        String string = editActivity.getResources().getString(2132019050);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = editActivity.getResources().getString(2132020149);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String sha1 = SceneKt.getSha1(editActivity.sceneHolder.getScene());
        QmE.iF iFVarLm1 = editActivity.lm1();
        fVJ.w6 w6VarCY = editActivity.CY();
        String string3 = editActivity.projectHolder.Uo().toString();
        Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
        cBL.j jVarRl = w6VarCY.rl(string3);
        xAo.I28 i28UQo = editActivity.uQo();
        rWZ.n nVar = editActivity.exportSnapshot;
        if (nVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("exportSnapshot");
            nVar = null;
        }
        Qk.r.ViF(editActivity, scene, xoJ3I, uuidUo, exportParams, "gif", "image/gif", string, string2, sha1, iFVarLm1, jVarRl, i28UQo, nVar);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IG.Ml xxL() {
        return (IG.Ml) this.viewModel.getValue();
    }

    private final void xy() {
        this.handler.removeCallbacks(this.delayedCloseAfterDoubleTapRunnable);
        if (this.delayedClosePending) {
            i0();
        }
        this.delayedClosePending = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y8() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y9g(EditActivity editActivity, ActivityResult it) {
        String stringExtra;
        SceneElement sceneElementT;
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.getResultCode() == -1) {
            Intent intentN = it.getData();
            if (intentN != null && (stringExtra = intentN.getStringExtra("selectedPresetID")) != null && (sceneElementT = HW.C.T(editActivity)) != null) {
                Ml.j jVarCk = editActivity.ck();
                editActivity.xxL().XQ(editActivity.Uo(), stringExtra, sceneElementT, editActivity.sceneHolder);
                jVarCk.n();
            }
            Intent intentN2 = it.getData();
            if (intentN2 != null && intentN2.getBooleanExtra("showDeleteToast", false)) {
                SJ0.CN3 cn3 = editActivity.binding;
                SJ0.CN3 cn32 = null;
                if (cn3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    cn3 = null;
                }
                LinearLayout presetToast = cn3.E2;
                Intrinsics.checkNotNullExpressionValue(presetToast, "presetToast");
                SJ0.CN3 cn33 = editActivity.binding;
                if (cn33 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    cn32 = cn33;
                }
                TextView presetToastText = cn32.f9102e;
                Intrinsics.checkNotNullExpressionValue(presetToastText, "presetToastText");
                Vil.CN3.n(editActivity, 2132019896, presetToastText, presetToast, new I28.j.n(100L, 300L, 2000L, 300L, 0.0f, HI0.afx.rl(editActivity, 70.0f), 16, null));
            }
        }
        editActivity.az();
    }

    private final void yJD() {
        String string = this.projectHolder.Uo().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
        if (jVar.getProjectEditTime().get(string) == null) {
            jVar.getProjectEditTime().put(string, 0L);
        }
        int i2 = this.initialSceneHash;
        if (i2 == 0) {
            this.initialSceneHash = this.sceneHolder.getRootScene().hashCode();
        } else {
            this.initialSceneHash = i2 + 1;
        }
        long jNanoTime = System.nanoTime();
        if (this.initialSceneHash != this.sceneHolder.getRootScene().hashCode()) {
            this.projectEditStartTime = jNanoTime;
            this.pauseEditTimer = false;
        }
        if (this.projectEditStartTime != 0) {
            jVar.getProjectEditTime().put(string, Long.valueOf(KWB()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ybf(int i2, EditActivity editActivity) {
        if (i2 != editActivity.exportSerial) {
            return Unit.INSTANCE;
        }
        ExportParams exportParamsExportParamsImage$default = SceneExporterKt.exportParamsImage$default(editActivity.sceneHolder.getScene(), HW.C.HI(editActivity), 0, Bitmap.CompressFormat.PNG, 0, 10, null);
        Scene scene = editActivity.sceneHolder.getScene();
        Si.Xo xoJ3I = editActivity.j3I();
        UUID uuidUo = editActivity.projectHolder.Uo();
        String string = editActivity.getResources().getString(2132019049);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = editActivity.getResources().getString(2132020145);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        QmE.iF iFVarLm1 = editActivity.lm1();
        fVJ.w6 w6VarCY = editActivity.CY();
        String string3 = editActivity.projectHolder.Uo().toString();
        Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
        cBL.j jVarRl = w6VarCY.rl(string3);
        xAo.I28 i28UQo = editActivity.uQo();
        rWZ.n nVar = editActivity.exportSnapshot;
        if (nVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("exportSnapshot");
            nVar = null;
        }
        Qk.r.ViF(editActivity, scene, xoJ3I, uuidUo, exportParamsExportParamsImage$default, "png", MimeTypes.IMAGE_PNG, string, string2, (256 & 256) != 0 ? SceneKt.getSha1(scene) : null, iFVarLm1, jVarRl, i28UQo, nVar);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean yd(Fragment it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.isAdded() && !it.isRemoving();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void yl(EditActivity editActivity, View view) {
        SJ0.CN3 cn3 = editActivity.binding;
        SJ0.CN3 cn32 = null;
        if (cn3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn3 = null;
        }
        if (cn3.jB.getVisibility() != 4) {
            SJ0.CN3 cn33 = editActivity.binding;
            if (cn33 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn33 = null;
            }
            int width = cn33.jB.getWidth();
            SJ0.CN3 cn34 = editActivity.binding;
            if (cn34 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn34 = null;
            }
            Rect rect = new Rect(0, 0, width, cn34.jB.getHeight());
            SJ0.CN3 cn35 = editActivity.binding;
            if (cn35 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn35 = null;
            }
            int height = (int) (cn35.jB.getHeight() * 0.5f);
            SJ0.CN3 cn36 = editActivity.binding;
            if (cn36 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn36 = null;
            }
            int width2 = cn36.jB.getWidth();
            SJ0.CN3 cn37 = editActivity.binding;
            if (cn37 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn37 = null;
            }
            Rect rect2 = new Rect(0, height, width2, cn37.jB.getHeight());
            SJ0.CN3 cn38 = editActivity.binding;
            if (cn38 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn38 = null;
            }
            ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(cn38.jB, "clipBounds", new RectEvaluator(new Rect()), rect, rect2);
            objectAnimatorOfObject.setDuration(100L);
            objectAnimatorOfObject.setInterpolator(new DecelerateInterpolator());
            objectAnimatorOfObject.start();
            objectAnimatorOfObject.addListener(editActivity.new Q());
            SJ0.CN3 cn39 = editActivity.binding;
            if (cn39 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                cn32 = cn39;
            }
            cn32.iF.Uo.setImageDrawable(ResourcesCompat.J2(editActivity.getResources(), editActivity.sceneHolder.getUserPreviewMode().nr() ? 2131232052 : 2131232051, editActivity.getTheme()));
            return;
        }
        SJ0.CN3 cn310 = editActivity.binding;
        if (cn310 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn310 = null;
        }
        cn310.jB.setVisibility(0);
        SJ0.CN3 cn311 = editActivity.binding;
        if (cn311 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn311 = null;
        }
        int height2 = (int) (cn311.jB.getHeight() * 0.5f);
        SJ0.CN3 cn312 = editActivity.binding;
        if (cn312 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn312 = null;
        }
        int width3 = cn312.jB.getWidth();
        SJ0.CN3 cn313 = editActivity.binding;
        if (cn313 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn313 = null;
        }
        Rect rect3 = new Rect(0, height2, width3, cn313.jB.getHeight());
        SJ0.CN3 cn314 = editActivity.binding;
        if (cn314 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn314 = null;
        }
        int width4 = cn314.jB.getWidth();
        SJ0.CN3 cn315 = editActivity.binding;
        if (cn315 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn315 = null;
        }
        Rect rect4 = new Rect(0, 0, width4, cn315.jB.getHeight());
        SJ0.CN3 cn316 = editActivity.binding;
        if (cn316 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn316 = null;
        }
        ObjectAnimator objectAnimatorOfObject2 = ObjectAnimator.ofObject(cn316.jB, "clipBounds", new RectEvaluator(new Rect()), rect3, rect4);
        objectAnimatorOfObject2.setDuration(100L);
        objectAnimatorOfObject2.setInterpolator(new AccelerateInterpolator());
        objectAnimatorOfObject2.start();
        SJ0.CN3 cn317 = editActivity.binding;
        if (cn317 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            cn32 = cn317;
        }
        cn32.iF.Uo.setImageDrawable(ResourcesCompat.J2(editActivity.getResources(), 2131232053, editActivity.getTheme()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean yox(EditActivity editActivity, Ref.BooleanRef booleanRef, Ref.BooleanRef booleanRef2, View view, MotionEvent motionEvent) {
        Object objPrevious;
        MotionEvent motionEventObtain;
        yc.Kk1 kk1RmO = editActivity.rmO();
        Intrinsics.checkNotNull(motionEvent);
        kk1RmO.WPU(motionEvent);
        editActivity.uB(editActivity.rmO().Z());
        boolean zWH = true;
        if (editActivity.rmO().o()) {
            if (editActivity.sceneHolder.getSelection().getSelectableHint() != null) {
                SceneHolder sceneHolder = editActivity.sceneHolder;
                sceneHolder.setSelection(SceneSelection.copy$default(sceneHolder.getSelection(), null, null, null, null, null, null, null, null, false, null, null, null, 3967, null));
            }
            if (editActivity.pendingLongPress) {
                editActivity.handler.removeCallbacks(new rfW(editActivity));
                editActivity.pendingLongPress = false;
            }
            return true;
        }
        yc.iy iyVar = editActivity.spoidOnClickListener;
        SJ0.CN3 cn3 = null;
        if (iyVar != null) {
            Intrinsics.checkNotNull(iyVar);
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            SJ0.CN3 cn32 = editActivity.binding;
            if (cn32 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn32 = null;
            }
            float width = cn32.wTp.getWidth();
            SJ0.CN3 cn33 = editActivity.binding;
            if (cn33 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                cn3 = cn33;
            }
            return iyVar.n(motionEvent, x2, y2, width, cn3.wTp.getHeight());
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            booleanRef.element = false;
            booleanRef2.element = false;
            editActivity.originalTouchX = motionEvent.getRawX();
            editActivity.originalTouchY = motionEvent.getRawY();
        } else if (actionMasked == 2) {
            float rawX = editActivity.originalTouchX - motionEvent.getRawX();
            float rawY = editActivity.originalTouchY - motionEvent.getRawY();
            if ((Math.abs(rawX) > editActivity.JF7() || Math.abs(rawY) > editActivity.JF7()) && booleanRef2.element && !booleanRef.element) {
                editActivity.rmO().qie();
            }
        }
        if (editActivity.sceneHolder.getSelection().isEmpty() || editActivity.sceneHolder.getSelection().isMultiSelect()) {
            return editActivity.PeJ(motionEvent);
        }
        List list = editActivity.attachedFragments;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Fragment fragment = (Fragment) ((WeakReference) it.next()).get();
            if (fragment != null) {
                arrayList.add(fragment);
            }
        }
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            Fragment fragment2 = (Fragment) objPrevious;
            if (fragment2.isAdded() && fragment2.isVisible() && fragment2.isResumed() && !(fragment2 instanceof f0P.wl0)) {
                break;
            }
        }
        ActivityResultCaller activityResultCaller = (Fragment) objPrevious;
        if (!(activityResultCaller instanceof yc.Buf) || booleanRef.element) {
            if (!booleanRef2.element && motionEvent.getActionMasked() != 0) {
                return false;
            }
            booleanRef2.element = true;
            return editActivity.wH(motionEvent);
        }
        if (editActivity.rmO().o()) {
            motionEventObtain = MotionEvent.obtain(motionEvent);
            motionEventObtain.setAction(3);
        } else {
            motionEventObtain = null;
        }
        MotionEvent motionEvent2 = motionEventObtain == null ? motionEvent : motionEventObtain;
        SceneHolder sceneHolder2 = editActivity.sceneHolder;
        SJ0.CN3 cn34 = editActivity.binding;
        if (cn34 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            cn3 = cn34;
        }
        SurfaceView previewView = cn3.wTp;
        Intrinsics.checkNotNullExpressionValue(previewView, "previewView");
        if (!((yc.Buf) activityResultCaller).n(new C2445Dt(motionEvent2, sceneHolder2, previewView))) {
            booleanRef.element = true;
            if (booleanRef2.element || motionEvent.getActionMasked() == 0) {
                booleanRef2.element = true;
                zWH = editActivity.wH(motionEvent);
            } else {
                zWH = false;
            }
        }
        if (motionEventObtain != null) {
            motionEventObtain.recycle();
        }
        return zWH;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String z7() {
        return "onCreate";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zK(final ProjectInfo.n projectInfo, final rWZ.eO requestTriggerPoint) {
        new R6(this).mUb(2132020394).nr(2132020391).xMQ(2132020393, new Function1() { // from class: com.alightcreative.app.motion.activities.tUY
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EditActivity.uh(this.f45681n, projectInfo, requestTriggerPoint, (DialogInterface) obj);
            }
        }).J2(2132020392, new Function1() { // from class: com.alightcreative.app.motion.activities.Jr
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EditActivity.lu4(this.f44593n, projectInfo, requestTriggerPoint, (DialogInterface) obj);
            }
        }).gh();
    }

    public final Q.fuX AJ() {
        Q.fuX fux = this.featureUnlockManager;
        if (fux != null) {
            return fux;
        }
        Intrinsics.throwUninitializedPropertyAccessException("featureUnlockManager");
        return null;
    }

    /* JADX INFO: renamed from: C5, reason: from getter */
    public final Uri getAudioPreviewQueuedUri() {
        return this.audioPreviewQueuedUri;
    }

    public final void C6() {
        MediaPlayer mediaPlayer = this.audioPreviewPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
        }
        MediaPlayer mediaPlayer2 = this.audioPreviewPlayer;
        if (mediaPlayer2 != null) {
            mediaPlayer2.release();
        }
        this.audioPreviewPlayer = null;
        this.audioPreviewQueuedUri = null;
        SJ0.CN3 cn3 = this.binding;
        if (cn3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn3 = null;
        }
        RecyclerView.Adapter adapter = cn3.nr.rl.getAdapter();
        yc.C c2 = adapter instanceof yc.C ? (yc.C) adapter : null;
        if (c2 != null) {
            c2.S(null);
        }
    }

    public final nYs.Ml CX() {
        nYs.Ml ml = this.getAlightSettingsUseCase;
        if (ml != null) {
            return ml;
        }
        Intrinsics.throwUninitializedPropertyAccessException("getAlightSettingsUseCase");
        return null;
    }

    public final fVJ.w6 CY() {
        fVJ.w6 w6Var = this.getWatermarkOptionsUseCase;
        if (w6Var != null) {
            return w6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("getWatermarkOptionsUseCase");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // UO6.qf.n
    public void E2(int id, final UO6.w6 exportInfo, final boolean isTemplateToggledOn, final Function1 onSuccess, final Function1 onFailure) {
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFailure, "onFailure");
        String string = this.projectHolder.Uo().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        File fileNr = this.projectHolder.nr();
        Scene rootScene = this.projectHolder.KN().getRootScene();
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.exportSnapshot = rWZ.Wre.nr(id, string, fileNr, rootScene, applicationContext, exportInfo, rst(), isTemplateToggledOn);
        QmE.iF iFVarLm1 = lm1();
        rWZ.n nVar = this.exportSnapshot;
        Bundle bundle = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        Object[] objArr8 = 0;
        Object[] objArr9 = 0;
        Object[] objArr10 = 0;
        Object[] objArr11 = 0;
        Object[] objArr12 = 0;
        Object[] objArr13 = 0;
        if (nVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("exportSnapshot");
            nVar = null;
        }
        iFVarLm1.n(new j.YzO(nVar));
        if (isTemplateToggledOn) {
            String string2 = this.projectHolder.Uo().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            File fileNr2 = this.projectHolder.nr();
            Scene rootScene2 = this.projectHolder.KN().getRootScene();
            Context applicationContext2 = getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
            this.templateToggleExportSnapshot = rWZ.Wre.nr(2131361971, string2, fileNr2, rootScene2, applicationContext2, exportInfo, rst(), true);
            QmE.iF iFVarLm12 = lm1();
            rWZ.n nVar2 = this.templateToggleExportSnapshot;
            if (nVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("templateToggleExportSnapshot");
                nVar2 = null;
            }
            iFVarLm12.n(new j.YzO(nVar2));
        }
        int i2 = 2;
        switch (id) {
            case 2131361914:
                lm1().n(new j.fuX("export_click_png", objArr2 == true ? 1 : 0, i2, objArr == true ? 1 : 0));
                tsI(xAo.DAz.f75220Z, new Function2() { // from class: com.alightcreative.app.motion.activities.tce
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return EditActivity.Su(onFailure, this, onSuccess, (ComponentActivity) obj, ((Boolean) obj2).booleanValue());
                    }
                });
                break;
            case 2131361915:
                if (exportInfo != null) {
                    lm1().n(new j.fuX("export_click_gif", objArr4 == true ? 1 : 0, i2, objArr3 == true ? 1 : 0));
                    tsI(xAo.DAz.f75219S, new Function2() { // from class: com.alightcreative.app.motion.activities.Vgd
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return EditActivity.lv(onFailure, this, exportInfo, onSuccess, (ComponentActivity) obj, ((Boolean) obj2).booleanValue());
                        }
                    });
                } else {
                    onFailure.invoke(this);
                }
                break;
            case 2131361916:
                if (exportInfo != null) {
                    lm1().n(new j.fuX("export_click_imgseq", objArr6 == true ? 1 : 0, i2, objArr5 == true ? 1 : 0));
                    tsI(xAo.DAz.f75223o, new Function2() { // from class: com.alightcreative.app.motion.activities.tB
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return EditActivity.fU(onFailure, this, onSuccess, exportInfo, (ComponentActivity) obj, ((Boolean) obj2).booleanValue());
                        }
                    });
                } else {
                    onFailure.invoke(this);
                }
                break;
            case 2131361919:
                if (exportInfo != null) {
                    lm1().n(new j.fuX("export_click_video", objArr8 == true ? 1 : 0, i2, objArr7 == true ? 1 : 0));
                    tsI(xAo.DAz.f75224r, new Function2() { // from class: com.alightcreative.app.motion.activities.f
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return EditActivity.Cn5(onFailure, this, exportInfo, onSuccess, isTemplateToggledOn, (ComponentActivity) obj, ((Boolean) obj2).booleanValue());
                        }
                    });
                } else {
                    onFailure.invoke(this);
                }
                break;
            case 2131361970:
                lm1().n(new j.fuX("export_click_package", objArr10 == true ? 1 : 0, i2, objArr9 == true ? 1 : 0));
                tsI(xAo.DAz.f75225t, new Function2() { // from class: com.alightcreative.app.motion.activities.xx
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return EditActivity.Vm(onFailure, this, onSuccess, (ComponentActivity) obj, ((Boolean) obj2).booleanValue());
                    }
                });
                break;
            case 2131361971:
                lm1().n(new j.fuX("export_click_template", objArr12 == true ? 1 : 0, i2, objArr11 == true ? 1 : 0));
                List listListOf = CollectionsKt.listOf(SceneKt.getProjectInfo(this.sceneHolder.getScene(), this.projectHolder.nr()));
                QmE.iF iFVarLm13 = lm1();
                kgE.fuX fuxRst = rst();
                List listMutableListOf = CollectionsKt.mutableListOf(this.sceneHolder.getRootScene());
                rWZ.n nVar3 = this.exportSnapshot;
                if (nVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("exportSnapshot");
                    nVar3 = null;
                }
                List listMutableListOf2 = CollectionsKt.mutableListOf(nVar3);
                SceneThumbnailMaker sceneThumbnailMaker = this.shareThumbnailMaker;
                if (sceneThumbnailMaker == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("shareThumbnailMaker");
                    sceneThumbnailMaker = null;
                }
                gIX.Dsr.xMQ(this, listListOf, iFVarLm13, fuxRst, listMutableListOf, listMutableListOf2, sceneThumbnailMaker, true);
                onSuccess.invoke(this);
                break;
            case 2131361994:
                lm1().n(new j.fuX("export_click_cloud", bundle, i2, objArr13 == true ? 1 : 0));
                MR(this, SceneKt.getProjectInfo(this.sceneHolder.getScene(), this.projectHolder.nr()), rWZ.eO.f73085t, null, 4, null);
                onSuccess.invoke(this);
                break;
        }
    }

    public final void EAC(yc.mz mzVar) {
        Intrinsics.checkNotNullParameter(mzVar, "<set-?>");
        this.adapter = mzVar;
    }

    public final void Fu() {
        if (!this.presetsList.isEmpty()) {
            j3I().v(new Function0() { // from class: com.alightcreative.app.motion.activities.Ch
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EditActivity.aeZ(this.f44356n);
                }
            });
            return;
        }
        lm1().n(j.oJ.f8540n);
        final AlertDialog alertDialogCreate = new AlertDialog.Builder(this).Z(2131558799).create();
        alertDialogCreate.show();
        Window window = alertDialogCreate.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        ImageButton imageButton = (ImageButton) alertDialogCreate.findViewById(2131362377);
        if (imageButton != null) {
            imageButton.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.ZX7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    EditActivity.ox(alertDialogCreate, view);
                }
            });
        }
        Button button = (Button) alertDialogCreate.findViewById(2131362556);
        if (button != null) {
            button.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.dc
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    EditActivity.v6b(this.f45049n, alertDialogCreate, view);
                }
            });
        }
        Button button2 = (Button) alertDialogCreate.findViewById(2131362375);
        if (button2 != null) {
            button2.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.OB3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    EditActivity.FWF(alertDialogCreate, view);
                }
            });
        }
    }

    @Override // HW.n
    public Fragment HI(Class clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        List list = this.attachedFragments;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Fragment fragment = (Fragment) ((WeakReference) it.next()).get();
            if (fragment != null) {
                arrayList.add(fragment);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            Fragment fragment2 = (Fragment) obj;
            if (fragment2.isAdded() && fragment2.isVisible() && fragment2.isResumed()) {
                arrayList2.add(obj);
            }
        }
        return (Fragment) CollectionsKt.firstOrNull(CollectionsKt.filterIsInstance(arrayList2, clazz));
    }

    /* JADX INFO: renamed from: IBF, reason: from getter */
    public final String getMediaBucketId() {
        return this.mediaBucketId;
    }

    /* JADX INFO: renamed from: IL, reason: from getter */
    public final Function2 getAddShapeListener() {
        return this.addShapeListener;
    }

    @Override // HW.I28
    /* JADX INFO: renamed from: J2, reason: from getter */
    public SceneHolder getSceneHolder() {
        return this.sceneHolder;
    }

    /* JADX INFO: renamed from: Nz, reason: from getter */
    public final LM.Wre getProjectHolder() {
        return this.projectHolder;
    }

    /* JADX INFO: renamed from: Oe4, reason: from getter */
    public final j getSelectedAddPopupTab() {
        return this.selectedAddPopupTab;
    }

    public final void Pt(MediaPlayer mediaPlayer) {
        this.audioPreviewPlayer = mediaPlayer;
    }

    /* JADX INFO: renamed from: Q0, reason: from getter */
    public final MediaPlayer getAudioPreviewPlayer() {
        return this.audioPreviewPlayer;
    }

    public final xAo.qf R8() {
        xAo.qf qfVar = this.exportProFeatureManager;
        if (qfVar != null) {
            return qfVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("exportProFeatureManager");
        return null;
    }

    public final CZF.I28 S0() {
        CZF.I28 i28 = this.pico;
        if (i28 != null) {
            return i28;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pico");
        return null;
    }

    @Override // HW.I28
    public String Uo() {
        String string = this.projectHolder.Uo().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final Set UpJ() {
        return this.sceneHolder.getSelection().getSelectedElements();
    }

    @Override // PJ9.I28
    public PJ9.Ml ViF() {
        PJ9.Ml ml = this.signInLauncher;
        if (ml != null) {
            return ml;
        }
        Intrinsics.throwUninitializedPropertyAccessException("signInLauncher");
        return null;
    }

    public void Vzj(Si.Xo xo) {
        Intrinsics.checkNotNullParameter(xo, "<set-?>");
        this.scenePlayer = xo;
    }

    @Override // yc.Qik
    public void X(SceneElement element, boolean select) {
        Intrinsics.checkNotNullParameter(element, "element");
        UCQ(false);
        if (!isFinishing() && !isDestroyed() && !getSupportFragmentManager().p0N()) {
            while (getSupportFragmentManager().Jk() > 0) {
                getSupportFragmentManager().uG();
            }
        }
        if (select) {
            Fv(element);
        }
        this.originalScrollY = 0;
        int i2 = CN3.$EnumSwitchMapping$4[element.getType().ordinal()];
        if (i2 == 1) {
            if (element.getLiveShape().getId() == null && element.getOutline().getContours().size() == 1 && ((KeyableCubicBSpline) CollectionsKt.first((List) element.getOutline().getContours())).getKnots().isEmpty()) {
                rV9(2131361910);
                return;
            }
            return;
        }
        if (i2 == 6) {
            d1();
        } else if (i2 == 3) {
            rV9(2131361912);
        } else {
            if (i2 != 4) {
                return;
            }
            rV9(2131361904);
        }
    }

    public void Xj(PJ9.Ml ml) {
        Intrinsics.checkNotNullParameter(ml, "<set-?>");
        this.signInLauncher = ml;
    }

    /* JADX INFO: renamed from: a9, reason: from getter */
    public final List getPresetsList() {
        return this.presetsList;
    }

    public final void aP(String str) {
        this.mediaBucketName = str;
    }

    @Override // Vi.Dsr
    public void az() {
        this.compListLoader.nr();
    }

    public final cKn.Wre bAP() {
        cKn.Wre wre = this.theirs;
        if (wre != null) {
            return wre;
        }
        Intrinsics.throwUninitializedPropertyAccessException("theirs");
        return null;
    }

    public final void cKA() {
        SurfaceView surfaceView;
        SJ0.CN3 cn3 = null;
        if (this.fullScreenPreviewMode) {
            SJ0.CN3 cn32 = this.binding;
            if (cn32 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn32 = null;
            }
            surfaceView = cn32.f9105o;
        } else {
            SJ0.CN3 cn33 = this.binding;
            if (cn33 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn33 = null;
            }
            surfaceView = cn33.wTp;
        }
        Intrinsics.checkNotNull(surfaceView);
        SurfaceHolder holder = surfaceView.getHolder();
        if (!Intrinsics.areEqual(j3I().rV9(), holder)) {
            j3I().iF(holder);
        }
        SJ0.CN3 cn34 = this.binding;
        if (cn34 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn34 = null;
        }
        cn34.wTp.setVisibility(this.fullScreenPreviewMode ? 8 : 0);
        SJ0.CN3 cn35 = this.binding;
        if (cn35 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn35 = null;
        }
        cn35.f9106r.setVisibility(this.fullScreenPreviewMode ? 0 : 8);
        SJ0.CN3 cn36 = this.binding;
        if (cn36 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            cn3 = cn36;
        }
        cn3.f9105o.setVisibility(this.fullScreenPreviewMode ? 0 : 8);
        final int width = surfaceView.getWidth();
        final int height = surfaceView.getHeight();
        if (this.previewSurfaceWidth == width && this.previewSurfaceHeight == height) {
            return;
        }
        XoT.C.Uo(this, new Function0() { // from class: com.alightcreative.app.motion.activities.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EditActivity.Wx(width, height);
            }
        });
        surfaceView.getHolder().setFixedSize(width, height);
        Rect surfaceFrame = surfaceView.getHolder().getSurfaceFrame();
        this.previewSurfaceWidth = surfaceFrame.width();
        this.previewSurfaceHeight = surfaceFrame.height();
    }

    @Override // HW.I28
    public Ml.j ck() {
        LdY.Ml ml = this.undoManager;
        if (ml == null) {
            Intrinsics.throwUninitializedPropertyAccessException("undoManager");
            ml = null;
        }
        return ml.J2();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent event) {
        if (event == null) {
            return false;
        }
        if (event.getAction() == 0) {
            View currentFocus = getCurrentFocus();
            if (currentFocus instanceof SettingEditText) {
                Rect rect = new Rect();
                SettingEditText settingEditText = (SettingEditText) currentFocus;
                settingEditText.getGlobalVisibleRect(rect);
                if (!rect.contains((int) event.getRawX(), (int) event.getRawY())) {
                    settingEditText.onEditorAction(6);
                    settingEditText.clearFocus();
                }
            }
        }
        return super.dispatchTouchEvent(event);
    }

    /* JADX INFO: renamed from: dwF, reason: from getter */
    public final String getMediaBucketName() {
        return this.mediaBucketName;
    }

    @Override // HW.I28
    public SceneSelection getSelection() {
        return this.sceneHolder.getSelection();
    }

    @Override // Vil.Wre
    /* JADX INFO: renamed from: gh, reason: from getter */
    public Vil.I28 getCustomToastMaker() {
        return this.customToastMaker;
    }

    public final void gy(boolean z2) {
        this.fullScreenPreviewMode = z2;
    }

    public final xhQ.Ml hep() {
        xhQ.Ml ml = this.getTrialListItemsUseCase;
        if (ml != null) {
            return ml;
        }
        Intrinsics.throwUninitializedPropertyAccessException("getTrialListItemsUseCase");
        return null;
    }

    public final void i0() {
        XoT.C.Uo(this, new Function0() { // from class: com.alightcreative.app.motion.activities.yr
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EditActivity.Cw();
            }
        });
        RzC(this, false, 1, null);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        I7a.nr(supportFragmentManager);
    }

    @Override // HW.I28
    public void iF(int time) {
        int iFrameNumberFromTime;
        if (this.playing || (iFrameNumberFromTime = TimeKt.frameNumberFromTime(time, this.sceneHolder.getScene().getFramesPerHundredSeconds())) == HW.C.HI(this)) {
            return;
        }
        j3I().HI(iFrameNumberFromTime, true);
        GA().W1c(iFrameNumberFromTime);
        SJ0.CN3 cn3 = this.binding;
        if (cn3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn3 = null;
        }
        cn3.bzg.invalidate();
        SJ0.CN3 cn32 = this.binding;
        if (cn32 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn32 = null;
        }
        cn32.iF.rl.setActivated(this.sceneHolder.getScene().getBookmarks().containsKey(Integer.valueOf(TimeKt.roundToFrame(HW.C.XQ(this), this.sceneHolder.getScene().getFramesPerHundredSeconds()))));
        SJ0.CN3 cn33 = this.binding;
        if (cn33 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn33 = null;
        }
        ImageButton imageButton = cn33.iF.rl;
        SJ0.CN3 cn34 = this.binding;
        if (cn34 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn34 = null;
        }
        imageButton.setImageResource(cn34.iF.rl.isActivated() ? 2131231551 : 2131231550);
        Iterator it = this.attachedFragments.iterator();
        while (it.hasNext()) {
            Object obj = ((WeakReference) it.next()).get();
            InterfaceC2452g interfaceC2452g = obj instanceof InterfaceC2452g ? (InterfaceC2452g) obj : null;
            if (interfaceC2452g != null) {
                interfaceC2452g.gh();
            }
        }
    }

    public Si.Xo j3I() {
        Si.Xo xo = this.scenePlayer;
        if (xo != null) {
            return xo;
        }
        Intrinsics.throwUninitializedPropertyAccessException("scenePlayer");
        return null;
    }

    public final QmE.iF lm1() {
        QmE.iF iFVar = this.eventLogger;
        if (iFVar != null) {
            return iFVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    @Override // HW.I28
    public void mUb(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        SJ0.CN3 cn3 = this.binding;
        if (cn3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn3 = null;
        }
        TextView previewToast = cn3.s7N;
        Intrinsics.checkNotNullExpressionValue(previewToast, "previewToast");
        Vil.CN3.rl(this, string, previewToast, (4 & 4) != 0 ? previewToast : null, (4 & 8) != 0 ? new I28.j.C0396j(0L, 0L, 0L, 0L, 15, null) : new I28.j.C0396j(0L, 0L, 1000L, 500L, 3, null));
    }

    @Override // HW.I28
    public float nHg() {
        float fRl = HI0.afx.rl(this, 1.0f);
        float width = this.sceneHolder.getScene().getWidth() * fRl;
        SJ0.CN3 cn3 = this.binding;
        SJ0.CN3 cn32 = null;
        if (cn3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn3 = null;
        }
        float width2 = width / cn3.wTp.getWidth();
        float height = fRl * this.sceneHolder.getScene().getHeight();
        SJ0.CN3 cn33 = this.binding;
        if (cn33 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            cn32 = cn33;
        }
        return (width2 + (height / cn32.wTp.getHeight())) / 2.0f;
    }

    @Override // HW.I28
    public void nY() {
        XoT.C.Uo(this, new Function0() { // from class: com.alightcreative.app.motion.activities.xq
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EditActivity.LDd();
            }
        });
        SJ0.CN3 cn3 = this.binding;
        if (cn3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn3 = null;
        }
        RecyclerView.Adapter adapter = cn3.bzg.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: o3K, reason: from getter */
    public final boolean getFullScreenPreviewMode() {
        return this.fullScreenPreviewMode;
    }

    public final InterfaceC2210n oG8() {
        InterfaceC2210n interfaceC2210n = this.injet;
        if (interfaceC2210n != null) {
            return interfaceC2210n;
        }
        Intrinsics.throwUninitializedPropertyAccessException("injet");
        return null;
    }

    public void oM(List list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.allLocalProjects.setValue(list);
    }

    /* JADX INFO: renamed from: obf, reason: from getter */
    public final List getShapeList() {
        return this.shapeList;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        Uri data2;
        Uri data3;
        Uri data4;
        SceneElement sceneElementElementById;
        SceneElement sceneElementElementById2;
        String stringExtra;
        String strNr;
        String stringExtra2;
        tu.Ew ew = null;
        switch (requestCode) {
            case 1:
                if (resultCode != -1 || data == null || (data2 = data.getData()) == null) {
                    return;
                }
                VS.WPU(this.editAddDelegate, data2, false, false, 0, 14, null);
                return;
            case 2:
                if (resultCode != -1 || data == null || (data3 = data.getData()) == null) {
                    return;
                }
                VS.ty(this.editAddDelegate, data3, false, 2, null);
                return;
            case 3:
                if (resultCode != -1 || data == null || (data4 = data.getData()) == null) {
                    return;
                }
                VS.bzg(this.editAddDelegate, data4, false, false, 0, 0, 0, 62, null);
                return;
            case 4:
            case 10:
            default:
                super.onActivityResult(requestCode, resultCode, data);
                return;
            case 5:
                if (resultCode != -1 || data == null) {
                    E5K(true);
                    return;
                }
                String stringExtra3 = data.getStringExtra("sceneHash");
                boolean booleanExtra = data.getBooleanExtra("newElement", false);
                long longExtra = data.getLongExtra("newElementId", 0L);
                if (stringExtra3 == null) {
                    E5K(true);
                    i0();
                    return;
                }
                this.projectHolder.xMQ();
                if (!booleanExtra || longExtra <= 0 || (sceneElementElementById = SceneKt.elementById(this.sceneHolder.getScene(), Long.valueOf(longExtra))) == null) {
                    return;
                }
                Qik.j.n(this, sceneElementElementById, false, 2, null);
                return;
            case 6:
                Rd8();
                return;
            case 7:
                if (resultCode != -1 || data == null) {
                    E5K(true);
                    return;
                }
                String stringExtra4 = data.getStringExtra("sceneHash");
                boolean booleanExtra2 = data.getBooleanExtra("newElement", false);
                long longExtra2 = data.getLongExtra("newElementId", 0L);
                if (stringExtra4 == null) {
                    E5K(true);
                    return;
                }
                this.projectHolder.xMQ();
                if (!booleanExtra2 || longExtra2 <= 0 || (sceneElementElementById2 = SceneKt.elementById(this.sceneHolder.getScene(), Long.valueOf(longExtra2))) == null) {
                    return;
                }
                Qik.j.n(this, sceneElementElementById2, false, 2, null);
                return;
            case 8:
                Uri uri = data != null ? (Uri) data.getParcelableExtra("selectedUri") : null;
                if (data != null && (stringExtra = data.getStringExtra("mediaType")) != null) {
                    ew = (tu.Ew) HI0.Ew.n(tu.Ew.values(), stringExtra);
                }
                if (resultCode != -1 || uri == null || ew == null) {
                    return;
                }
                int i2 = CN3.$EnumSwitchMapping$5[ew.ordinal()];
                if (i2 == 1) {
                    VS.WPU(this.editAddDelegate, uri, false, false, 0, 12, null);
                    return;
                }
                if (i2 == 2) {
                    VS.bzg(this.editAddDelegate, uri, false, false, 0, 0, 0, 60, null);
                    return;
                } else if (i2 == 3) {
                    this.editAddDelegate.az(uri, false);
                    return;
                } else {
                    if (i2 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return;
                }
            case 9:
                if (resultCode == 2) {
                    az();
                    return;
                }
                return;
            case 11:
                if (resultCode == -1) {
                    ArrayList parcelableArrayListExtra = data != null ? data.getParcelableArrayListExtra("AddMediaList") : null;
                    MediaBrowser.j jVar = (data == null || (stringExtra2 = data.getStringExtra("MultiMode")) == null) ? null : (MediaBrowser.j) HI0.Ew.n(MediaBrowser.j.values(), stringExtra2);
                    if (parcelableArrayListExtra != null && parcelableArrayListExtra.size() > 0 && jVar != null) {
                        this.editAddDelegate.te(parcelableArrayListExtra, jVar, false);
                        return;
                    }
                    AddVisualMediaInfo addVisualMediaInfo = data != null ? (AddVisualMediaInfo) data.getParcelableExtra("AddSingleMedia") : null;
                    if (addVisualMediaInfo != null && (strNr = addVisualMediaInfo.getTypeName()) != null) {
                        ew = (tu.Ew) HI0.Ew.n(tu.Ew.values(), strNr);
                    }
                    if (addVisualMediaInfo == null || ew == null) {
                        return;
                    }
                    int i3 = CN3.$EnumSwitchMapping$5[ew.ordinal()];
                    if (i3 == 1) {
                        VS.WPU(this.editAddDelegate, addVisualMediaInfo.getUri(), false, false, addVisualMediaInfo.getDuration(), 4, null);
                        return;
                    }
                    if (i3 == 2) {
                        VS.bzg(this.editAddDelegate, addVisualMediaInfo.getUri(), false, false, 0, (int) addVisualMediaInfo.getStartTrim(), (int) addVisualMediaInfo.getEndTrim(), 12, null);
                        return;
                    } else if (i3 == 3) {
                        this.editAddDelegate.az(addVisualMediaInfo.getUri(), false);
                        return;
                    } else {
                        if (i3 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        return;
                    }
                }
                return;
        }
    }

    @Override // com.alightcreative.app.motion.activities.prm, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        XoT.C.Uo(this, new Function0() { // from class: com.alightcreative.app.motion.activities.QGL
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EditActivity.v58();
            }
        });
        kgE.Sis.ty(this.purchaseStateObserver);
        SceneThumbnailMaker sceneThumbnailMaker = this.elementThumbnailMaker;
        SceneThumbnailMaker sceneThumbnailMaker2 = null;
        if (sceneThumbnailMaker == null) {
            Intrinsics.throwUninitializedPropertyAccessException("elementThumbnailMaker");
            sceneThumbnailMaker = null;
        }
        sceneThumbnailMaker.release();
        SceneThumbnailMaker sceneThumbnailMaker3 = this.trackThumbnailMaker;
        if (sceneThumbnailMaker3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("trackThumbnailMaker");
            sceneThumbnailMaker3 = null;
        }
        sceneThumbnailMaker3.release();
        GA().eOa(null);
        j3I().release();
        getSupportFragmentManager().Aum(this.onBackStackChangedListener);
        SceneThumbnailMaker sceneThumbnailMaker4 = this.shareThumbnailMaker;
        if (sceneThumbnailMaker4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("shareThumbnailMaker");
        } else {
            sceneThumbnailMaker2 = sceneThumbnailMaker4;
        }
        sceneThumbnailMaker2.release();
        super.onDestroy();
        XoT.C.Uo(this, new Function0() { // from class: com.alightcreative.app.motion.activities.jn
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EditActivity.g8();
            }
        });
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    protected void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        vZY(intent);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        XoT.C.Uo(this, new Function0() { // from class: com.alightcreative.app.motion.activities.ozJ
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EditActivity.aYA();
            }
        });
        j3I().pause();
        SceneThumbnailMaker sceneThumbnailMaker = this.trackThumbnailMaker;
        SceneThumbnailMaker sceneThumbnailMaker2 = null;
        if (sceneThumbnailMaker == null) {
            Intrinsics.throwUninitializedPropertyAccessException("trackThumbnailMaker");
            sceneThumbnailMaker = null;
        }
        sceneThumbnailMaker.releaseResources();
        SceneThumbnailMaker sceneThumbnailMaker3 = this.elementThumbnailMaker;
        if (sceneThumbnailMaker3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("elementThumbnailMaker");
            sceneThumbnailMaker3 = null;
        }
        sceneThumbnailMaker3.releaseResources();
        jI(this, false, 1, null);
        aO.z.r();
        j3I().r();
        SceneThumbnailMaker sceneThumbnailMaker4 = this.shareThumbnailMaker;
        if (sceneThumbnailMaker4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("shareThumbnailMaker");
        } else {
            sceneThumbnailMaker2 = sceneThumbnailMaker4;
        }
        sceneThumbnailMaker2.releaseResources();
        Hez();
        HI0.Ml.nr(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        if (requestCode == 1) {
            HI0.Zs.t(lm1(), !(grantResults.length == 0) && grantResults[0] == 0, rWZ.fuX.f73088n, new String[]{Uo()}, null, null, new Function0() { // from class: com.alightcreative.app.motion.activities.eZk
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EditActivity.Gr(this.f45064n);
                }
            }, 48, null);
        } else {
            super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        XoT.C.Uo(this, new Function0() { // from class: com.alightcreative.app.motion.activities.HI
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EditActivity.xYi();
            }
        });
        super.onResume();
        rst().KN();
        com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
        if (!Intrinsics.areEqual(jVar.getMediaBucketID(), this.mediaBucketId)) {
            this.mediaBucketId = jVar.getMediaBucketID();
            this.mediaBucketName = jVar.getMediaBucketName();
        }
        SJ0.CN3 cn3 = this.binding;
        if (cn3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn3 = null;
        }
        cn3.f9100X.postDelayed(new Runnable() { // from class: com.alightcreative.app.motion.activities.F
            @Override // java.lang.Runnable
            public final void run() {
                EditActivity.c7Q(this.f44527n);
            }
        }, 400L);
        GJW.C.nr(LifecycleOwnerKt.n(this), null, null, new nKK(null), 3, null);
        qie();
        this.projectEditStartTime = System.nanoTime();
    }

    @Override // androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        LdY.Ml ml = this.undoManager;
        if (ml == null) {
            Intrinsics.throwUninitializedPropertyAccessException("undoManager");
            ml = null;
        }
        ml.ty(outState);
        this.projectHolder.gh(outState, isFinishing());
        super.onSaveInstanceState(outState);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStop() {
        XoT.C.Uo(this, new Function0() { // from class: com.alightcreative.app.motion.activities.asi
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EditActivity.UV();
            }
        });
        MediaPlayer mediaPlayer = this.audioPreviewPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
        }
        MediaPlayer mediaPlayer2 = this.audioPreviewPlayer;
        if (mediaPlayer2 != null) {
            mediaPlayer2.release();
        }
        this.audioPreviewPlayer = null;
        this.audioPreviewQueuedUri = null;
        FirebaseAuth.getInstance().ck(new Al(rst()));
        super.onStop();
    }

    public final WK.I28 qd() {
        WK.I28 i28 = this.newFeatureManager;
        if (i28 != null) {
            return i28;
        }
        Intrinsics.throwUninitializedPropertyAccessException("newFeatureManager");
        return null;
    }

    @Override // HW.I28
    public void qie() {
        XoT.C.Uo(this, new Function0() { // from class: com.alightcreative.app.motion.activities.t6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EditActivity.GW();
            }
        });
        ARa();
        SJ0.CN3 cn3 = this.binding;
        if (cn3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn3 = null;
        }
        cn3.wTp.invalidate();
        Si.Xo xoJ3I = j3I();
        fVJ.w6 w6VarCY = CY();
        String string = this.projectHolder.Uo().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        xoJ3I.WPU(w6VarCY.n(string));
        j3I().wTp();
    }

    public final void rH(String str) {
        this.mediaBucketId = str;
    }

    public final void rnX(yc.iy listener) {
        this.spoidOnClickListener = listener;
    }

    public final kgE.fuX rst() {
        kgE.fuX fux = this.iapManager;
        if (fux != null) {
            return fux;
        }
        Intrinsics.throwUninitializedPropertyAccessException("iapManager");
        return null;
    }

    public final void tp(Uri uri) {
        this.audioPreviewQueuedUri = uri;
    }

    public final xAo.I28 uQo() {
        xAo.I28 i28 = this.crisperManager;
        if (i28 != null) {
            return i28;
        }
        Intrinsics.throwUninitializedPropertyAccessException("crisperManager");
        return null;
    }

    public final g9s.n utY() {
        g9s.n nVar = this.premadeContentViewModelFactory;
        if (nVar != null) {
            return nVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("premadeContentViewModelFactory");
        return null;
    }

    public final yc.mz vH3() {
        yc.mz mzVar = this.adapter;
        if (mzVar != null) {
            return mzVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("adapter");
        return null;
    }

    @Override // HW.I28
    public HW.o xMQ() {
        Ln ln2 = new Ln();
        this.infoBar = ln2;
        return ln2;
    }

    public final void yRW(final String presetId, final String presetTitle) {
        Intrinsics.checkNotNullParameter(presetId, "presetId");
        Intrinsics.checkNotNullParameter(presetTitle, "presetTitle");
        new AlertDialog.Builder(this).o(2132019919).setPositiveButton(2132019918, new DialogInterface.OnClickListener() { // from class: com.alightcreative.app.motion.activities.bwY
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                EditActivity.mh(this.f44918n, presetId, presetTitle, dialogInterface, i2);
            }
        }).setNegativeButton(2132019917, new DialogInterface.OnClickListener() { // from class: com.alightcreative.app.motion.activities.fhj
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                EditActivity.h5H(dialogInterface, i2);
            }
        }).az(new DialogInterface.OnCancelListener() { // from class: com.alightcreative.app.motion.activities.ZhI
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                EditActivity.piq(this.f44856n, dialogInterface);
            }
        }).create().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AKH(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String Aq(int i2, EditActivity editActivity, Map map) {
        int iHI = HW.C.HI(editActivity);
        int size = map.size();
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(((Number) entry.getKey()).intValue() + com.safedk.android.analytics.brandsafety.l.ae + ((SceneBookmark) entry.getValue()));
        }
        return "buttonBookmark : REMOVE(t=" + i2 + ", frame=" + iHI + ") bookmarks=" + size + " (" + CollectionsKt.joinToString$default(arrayList, ", ", null, null, 0, null, null, 62, null) + ")";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CUD(EditActivity editActivity, View view) {
        editActivity.rV9(2131361871);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D1(EditActivity editActivity) {
        editActivity.qie();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DW(EditActivity editActivity) {
        editActivity.Rd8();
        editActivity.M63();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E0X() {
        AJ().xMQ(this, new Function0() { // from class: com.alightcreative.app.motion.activities.JT
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EditActivity.lX5(this.f44588n);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E6J(EditActivity editActivity) {
        editActivity.az();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Eq(EditActivity editActivity, View view) {
        editActivity.rV9(2131361869);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void FWF(AlertDialog alertDialog, View view) {
        alertDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Fz(final String projectId, final String projectPackageId) {
        j3I().v(new Function0() { // from class: com.alightcreative.app.motion.activities.Pta
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EditActivity.L94(this.f44721n, projectId, projectPackageId);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Gd(EditActivity editActivity, View view) {
        editActivity.rV9(2131361900);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Gr(EditActivity editActivity) {
        editActivity.mBA().nr();
        GJW.C.nr(LifecycleOwnerKt.n(editActivity), null, null, editActivity.new Ew(null), 3, null);
        editActivity.hxH();
        editActivity.nY();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Gx9(EditActivity editActivity, View view) {
        editActivity.rV9(2131361941);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Gy(EditActivity editActivity, View view) {
        editActivity.rV9(2131361901);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void ILJ(final EditActivity editActivity, View view) {
        long j2;
        editActivity.lm1().n(new j.H(editActivity.Uo()));
        SJ0.CN3 cn3 = null;
        editActivity.lm1().n(new j.fuX("undoredo_redo", 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0));
        boolean zRl = com.alightcreative.widget.D.rl();
        SJ0.CN3 cn32 = editActivity.binding;
        if (cn32 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            cn3 = cn32;
        }
        ImageButton imageButton = cn3.iF.gh;
        Runnable runnable = new Runnable() { // from class: com.alightcreative.app.motion.activities.rrk
            @Override // java.lang.Runnable
            public final void run() {
                EditActivity.I1(this.f45632n);
            }
        };
        if (zRl) {
            j2 = 15;
        } else {
            j2 = 0;
        }
        imageButton.postDelayed(runnable, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IV(EditActivity editActivity) {
        editActivity.Rd8();
        editActivity.M63();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Ieo(EditActivity editActivity, View view) {
        editActivity.az();
        SJ0.CN3 cn3 = editActivity.binding;
        if (cn3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn3 = null;
        }
        RecyclerView addCompList = cn3.nr.nr;
        Intrinsics.checkNotNullExpressionValue(addCompList, "addCompList");
        addCompList.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Jeq(EditActivity editActivity, View view) {
        editActivity.rV9(2131361874);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit K5(EditActivity editActivity, float f3, float f4) {
        SceneElement sceneElementT = HW.C.T(editActivity);
        if (sceneElementT != null) {
            Vector2D vector2D = new Vector2D(f3, f4);
            Scene sceneG = HW.C.g(editActivity);
            if (sceneG != null) {
                SceneHolder sceneHolder = editActivity.sceneHolder;
                KeyableTransform transform = sceneElementT.getTransform();
                if (sceneElementT.getParent() != null) {
                    Transform parentTransform = LayerParentingKt.getParentTransform(sceneElementT, sceneG, SceneElementKt.fractionalTime(sceneElementT, HW.C.XQ(editActivity)));
                    vector2D = GeometryKt.div(GeometryKt.rot(vector2D, -parentTransform.getRotation()), parentTransform.getScale());
                }
                sceneHolder.update(SceneElement.copy$default(sceneElementT, null, 0, 0, 0L, null, null, TransformKt.translatedBy(transform, vector2D), null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, -65, 127, null));
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void KB(EditActivity editActivity, DialogInterface dialogInterface, int i2) {
        QmE.iF iFVarLm1 = editActivity.lm1();
        Bundle bundle = new Bundle();
        bundle.putLong("lag_feedback", editActivity.lagFeedbackConfig);
        Unit unit = Unit.INSTANCE;
        iFVarLm1.n(new j.fuX("lag_notice_show_guide", bundle));
        dialogInterface.dismiss();
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(editActivity, new Intent("android.intent.action.VIEW", Uri.parse("https://www.alightcreative.com/performanceguide")));
        com.alightcreative.app.motion.persist.j.INSTANCE.setShowedLagNotice(true);
    }

    private final boolean KJJ() {
        yc.DAz dAz;
        ActivityResultCaller activityResultCallerON = ON();
        if (HW.C.jB(this)) {
            return true;
        }
        if (activityResultCallerON instanceof yc.DAz) {
            dAz = (yc.DAz) activityResultCallerON;
        } else {
            dAz = null;
        }
        if ((dAz != null && dAz.onBackPressed()) || getSupportFragmentManager().uG()) {
            return true;
        }
        if (NqA()) {
            UCQ(true);
            return true;
        }
        if (SceneKt.isEditingNestedScene(this.sceneHolder)) {
            this.sceneHolder.endEditingNestedScene();
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Kkh(EditActivity editActivity, View view) {
        editActivity.rV9(2131361872);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Kqf(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void L3(final EditActivity editActivity, View view) {
        long j2;
        editActivity.lm1().n(new j.zO(editActivity.Uo()));
        SJ0.CN3 cn3 = null;
        editActivity.lm1().n(new j.fuX("undoredo_undo", 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0));
        boolean zRl = com.alightcreative.widget.D.rl();
        SJ0.CN3 cn32 = editActivity.binding;
        if (cn32 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            cn3 = cn32;
        }
        ImageButton imageButton = cn3.iF.gh;
        Runnable runnable = new Runnable() { // from class: com.alightcreative.app.motion.activities.H
            @Override // java.lang.Runnable
            public final void run() {
                EditActivity.ke(this.f44565n);
            }
        };
        if (zRl) {
            j2 = 15;
        } else {
            j2 = 0;
        }
        imageButton.postDelayed(runnable, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L94(EditActivity editActivity, String str, String str2) {
        if (editActivity.isDestroyed()) {
            return Unit.INSTANCE;
        }
        ActivityResultLauncher activityResultLauncher = editActivity.templateEditorLauncher;
        Pair[] pairArr = {TuplesKt.to("projectID", str), TuplesKt.to("projectPackageID", str2), TuplesKt.to("template_editor_origin", j.C1276j.f75489n)};
        Intent intent = new Intent(editActivity, (Class<?>) TemplateImportPreviewActivity.class);
        intent.putExtras(BundleKt.n((Pair[]) Arrays.copyOf(pairArr, 3)));
        activityResultLauncher.n(intent);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LSw(EditActivity editActivity, View view) {
        editActivity.rV9(2131361987);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LeN(EditActivity editActivity, View view) {
        editActivity.rV9(2131361939);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Mg(EditActivity editActivity, View view) {
        Ml.j jVarCk = editActivity.ck();
        for (SceneElement sceneElement : editActivity.sceneHolder.getScene().getElements()) {
            if (sceneElement.getParent() != null && editActivity.UpJ().contains(sceneElement.getParent())) {
                SceneHolder sceneHolder = editActivity.sceneHolder;
                sceneHolder.update(LayerParentingKt.updateParent(sceneElement, sceneHolder.getScene(), null, SceneElementKt.fractionalTime(sceneElement, HW.C.XQ(editActivity))));
            }
        }
        editActivity.sceneHolder.removeAll(editActivity.UpJ());
        editActivity.vH3().te();
        jVarCk.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N4(EditActivity editActivity, View view) {
        Set setDSC = editActivity.dSC();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setDSC) {
            if (((Number) obj).intValue() < HW.C.XQ(editActivity) - (50000 / editActivity.sceneHolder.getScene().getFramesPerHundredSeconds())) {
                arrayList.add(obj);
            }
        }
        Integer num = (Integer) CollectionsKt.maxOrNull((Iterable) arrayList);
        if (num != null) {
            editActivity.iF(num.intValue());
        }
        editActivity.qE1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void NT(EditActivity editActivity, View view) {
        editActivity.rV9(2131361940);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void NkL() {
        QmE.iF iFVarLm1 = lm1();
        String string = this.projectHolder.Uo().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        iFVarLm1.n(new j.T(string, rWZ.C.f73050r));
        lm1().n(new j.fuX("add_layer_camera", null, 2, 0 == true ? 1 : 0));
    }

    private final void Nnj() {
        getSupportFragmentManager().az(new FragmentOnAttachListener() { // from class: com.alightcreative.app.motion.activities.Ji
            @Override // androidx.fragment.app.FragmentOnAttachListener
            public final void n(FragmentManager fragmentManager, Fragment fragment) {
                EditActivity.kI0(this.f44589n, fragmentManager, fragment);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void OQ(final EditActivity editActivity, View view) {
        QmE.iF iFVarLm1 = editActivity.lm1();
        String string = editActivity.projectHolder.Uo().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        iFVarLm1.n(new j.Wre(string));
        editActivity.uQo().r(xAo.r.f75309n, new Function1() { // from class: com.alightcreative.app.motion.activities.tmw
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EditActivity.sAr(this.f45687n, (ComponentActivity) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void OWw(EditActivity editActivity, View view) {
        Float fValueOf;
        float fUo;
        boolean z2;
        float[] fArrO = yc.RP.O();
        int length = fArrO.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                float f3 = fArrO[length];
                if (yc.RP.KN(editActivity.sceneHolder.getUserPreviewMode()) > f3) {
                    fValueOf = Float.valueOf(f3);
                    break;
                } else if (i2 < 0) {
                    break;
                } else {
                    length = i2;
                }
            }
            fValueOf = null;
        } else {
            fValueOf = null;
        }
        if (fValueOf != null) {
            fUo = fValueOf.floatValue();
        } else {
            fUo = yc.RP.Uo();
        }
        SceneHolder sceneHolder = editActivity.sceneHolder;
        sceneHolder.setUserPreviewMode(yc.RP.qie(sceneHolder.getUserPreviewMode(), fUo));
        QmE.iF iFVarLm1 = editActivity.lm1();
        if (editActivity.sceneHolder.getSelection().getDirectSelection() != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        yc.giR.t(iFVarLm1, false, fUo, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Pd(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String RE(int i2, EditActivity editActivity, Map map) {
        int iHI = HW.C.HI(editActivity);
        int size = map.size();
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(((Number) entry.getKey()).intValue() + jhotmBbwMbr.aBAfAIQuepPAtd + ((SceneBookmark) entry.getValue()));
        }
        return "buttonBookmark : ADD(t=" + i2 + ", frame=" + iHI + ") bookmarks=" + size + " (" + CollectionsKt.joinToString$default(arrayList, ", ", null, null, 0, null, null, 62, null) + ")";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RP(final EditActivity editActivity, DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
        editActivity.eO();
        editActivity.handler.post(new Runnable() { // from class: com.alightcreative.app.motion.activities.xMz
            @Override // java.lang.Runnable
            public final void run() {
                EditActivity.IV(this.f45727n);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RW(TimelineLayoutManager timelineLayoutManager, final EditActivity editActivity, final int i2) {
        SJ0.CN3 cn3;
        int i3;
        SJ0.CN3 cn32;
        if (timelineLayoutManager.Qg8()) {
            editActivity.UJb();
        }
        XoT.C.Uo(timelineLayoutManager, new Function0() { // from class: com.alightcreative.app.motion.activities.nH
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EditActivity.fIU(i2, editActivity);
            }
        });
        editActivity.j3I().HI(i2, true);
        Iterator it = editActivity.attachedFragments.iterator();
        while (true) {
            cn3 = null;
            InterfaceC2452g interfaceC2452g = null;
            cn32 = null;
            if (!it.hasNext()) {
                break;
            }
            Object obj = ((WeakReference) it.next()).get();
            if (obj instanceof InterfaceC2452g) {
                interfaceC2452g = (InterfaceC2452g) obj;
            }
            if (interfaceC2452g != null) {
                interfaceC2452g.gh();
            }
        }
        SJ0.CN3 cn33 = editActivity.binding;
        if (cn33 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn33 = null;
        }
        cn33.iF.rl.setActivated(editActivity.sceneHolder.getScene().getBookmarks().containsKey(Integer.valueOf(TimeKt.roundToFrame(timelineLayoutManager.MPw(), editActivity.sceneHolder.getScene().getFramesPerHundredSeconds()))));
        SJ0.CN3 cn34 = editActivity.binding;
        if (cn34 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn34 = null;
        }
        ImageButton imageButton = cn34.iF.rl;
        SJ0.CN3 cn35 = editActivity.binding;
        if (cn35 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn35 = null;
        }
        if (cn35.iF.rl.isActivated()) {
            i3 = 2131231551;
        } else {
            i3 = 2131231550;
        }
        imageButton.setImageResource(i3);
        editActivity.qE1();
        XoT.C.Uo(timelineLayoutManager, new Function0() { // from class: com.alightcreative.app.motion.activities.Lc
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EditActivity.FG8(this.f44621n);
            }
        });
        if (editActivity.lagFeedbackConfig > 0 && Si.QJ.KN() / 1000000 > Math.max(50L, editActivity.lagFeedbackConfig)) {
            int i5 = editActivity.lagFrames + 1;
            editActivity.lagFrames = i5;
            if (i5 > 12) {
                editActivity.lagFrames = 0;
                SJ0.CN3 cn36 = editActivity.binding;
                if (cn36 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    cn36 = null;
                }
                cn36.bzg.removeCallbacks(editActivity.lagNoticeRunnable);
                SJ0.CN3 cn37 = editActivity.binding;
                if (cn37 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    cn32 = cn37;
                }
                cn32.bzg.postDelayed(editActivity.lagNoticeRunnable, 1500L);
                editActivity.lagNoticePending = true;
            }
        } else {
            if (editActivity.lagNoticePending) {
                SJ0.CN3 cn38 = editActivity.binding;
                if (cn38 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    cn38 = null;
                }
                cn38.bzg.removeCallbacks(editActivity.lagNoticeRunnable);
                SJ0.CN3 cn39 = editActivity.binding;
                if (cn39 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    cn3 = cn39;
                }
                cn3.bzg.postDelayed(editActivity.lagNoticeRunnable, 1500L);
            }
            editActivity.lagFrames--;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void RkF(Set selectedItems) {
        rWZ.C cRl;
        QmE.iF iFVarLm1 = lm1();
        String strUo = Uo();
        Set set = selectedItems;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            SceneElement sceneElementElementById = SceneKt.elementById(this.sceneHolder.getScene(), Long.valueOf(((Number) it.next()).longValue()));
            if (sceneElementElementById != null) {
                cRl = rWZ.j.rl(sceneElementElementById);
            } else {
                cRl = null;
            }
            arrayList.add(cRl);
        }
        iFVarLm1.n(new j.z3w(strUo, arrayList));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T6(EditActivity editActivity, View view) {
        editActivity.rV9(2131361980);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String TQm(boolean z2, boolean z3, MotionEvent motionEvent, EditActivity editActivity) {
        return "onPreviewTouchWithSelection:ACTION_UP inBounds=" + z2 + " isElementEditFrag=" + z3 + " (event.downTime - lastTapTime)=" + (motionEvent.getDownTime() - editActivity.lastTapTime) + " doubtTapTimeout=" + ViewConfiguration.getDoubleTapTimeout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TVz(EditActivity editActivity, View view) {
        editActivity.rV9(2131361938);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void UIA(DialogInterface dialogInterface, int i2) {
        dialogInterface.cancel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Ubr(EditActivity editActivity) {
        nRv(editActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit V4(EditActivity editActivity) {
        editActivity.az();
        editActivity.xxL().nHg(editActivity.Uo());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void WJ(EditActivity editActivity, View view) {
        editActivity.rV9(2131361990);
    }

    private final void Wl(final Function0 unlocked) {
        AJ().Uo(this, new Function0() { // from class: com.alightcreative.app.motion.activities.J2L
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EditActivity.AKH(unlocked);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void WwU(EditActivity editActivity, View view) {
        editActivity.rV9(2131361873);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit XN(EditActivity editActivity, int i2) {
        editActivity.rV9(i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Yi9(EditActivity editActivity) {
        editActivity.mBA().nr();
        GJW.C.nr(LifecycleOwnerKt.n(editActivity), null, null, editActivity.new l3D(null), 3, null);
        editActivity.hxH();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Zh(EditActivity editActivity, View view) {
        editActivity.rV9(2131361865);
        editActivity.UCQ(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a85(final EditActivity editActivity, View view) {
        int i2;
        int i3;
        String string;
        int size;
        int size2;
        int size3;
        String string2;
        Set setN;
        List listRl;
        SceneElement sceneElement;
        Map<Long, KeyableVisualEffectRef> visualEffects;
        Collection<KeyableVisualEffectRef> collectionValues;
        aC.Ml ml;
        boolean zRl;
        editActivity.xxL().iF(editActivity.Uo());
        com.alightcreative.widget.xuv xuvVar = new com.alightcreative.widget.xuv(editActivity, editActivity.rst(), false, 4, null);
        if (editActivity.UpJ().size() >= editActivity.sceneHolder.getScene().getElements().size() && !editActivity.UpJ().isEmpty()) {
            String string3 = editActivity.getResources().getString(2132017433);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            com.alightcreative.widget.xuv.ck(xuvVar, string3, 2131361888, 2131231794, false, null, false, null, false, 248, null);
            editActivity.sceneHolder.getScene().getElements().size();
        } else {
            String string4 = editActivity.getResources().getString(2132020110);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            com.alightcreative.widget.xuv.ck(xuvVar, string4, 2131361966, 2131231793, false, null, false, null, false, 248, null);
        }
        String quantityString = editActivity.getResources().getQuantityString(2131886091, editActivity.UpJ().size(), Integer.valueOf(editActivity.UpJ().size()));
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        com.alightcreative.widget.xuv.ck(xuvVar, quantityString, 2131361903, 2131231669, false, null, false, null, false, 248, null);
        if (editActivity.UpJ().isEmpty()) {
            xuvVar.o();
        }
        nYs.j jVarInvoke = editActivity.CX().invoke();
        int i5 = 0;
        if (jVarInvoke != null && jVarInvoke.te()) {
            String string5 = editActivity.getResources().getString(2132019916);
            Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
            Object objJ2 = editActivity.xxL().t().J2();
            if (objJ2 instanceof aC.Ml) {
                ml = (aC.Ml) objJ2;
            } else {
                ml = null;
            }
            if (ml != null) {
                zRl = ml.rl();
            } else {
                zRl = false;
            }
            i2 = 1;
            com.alightcreative.widget.xuv.ck(xuvVar, string5, 2131361965, 2131231945, false, null, false, null, zRl, com.safedk.android.analytics.brandsafety.b.f61769v, null);
            if (!editActivity.xxL().WPU(HW.C.T(editActivity))) {
                xuvVar.o();
            }
        } else {
            i2 = 1;
        }
        String quantityString2 = editActivity.getResources().getQuantityString(2131886082, editActivity.UpJ().size(), Integer.valueOf(editActivity.UpJ().size()));
        Intrinsics.checkNotNullExpressionValue(quantityString2, "getQuantityString(...)");
        if (editActivity.UpJ().size() <= i2) {
            i3 = 2131231633;
        } else {
            i3 = 2131231632;
        }
        int i7 = i3;
        if (editActivity.UpJ().size() <= i2) {
            string = editActivity.getResources().getString(2132019415);
        } else {
            string = null;
        }
        com.alightcreative.widget.xuv.ck(xuvVar, quantityString2, 2131361895, i7, false, null, false, string, false, 184, null);
        if (editActivity.UpJ().isEmpty()) {
            xuvVar.o();
        }
        Resources resources = editActivity.getResources();
        List listRl2 = I7a.rl();
        if (listRl2 != null) {
            size = listRl2.size();
        } else {
            size = i2;
        }
        List listRl3 = I7a.rl();
        if (listRl3 != null) {
            size2 = listRl3.size();
        } else {
            size2 = i2;
        }
        String quantityString3 = resources.getQuantityString(2131886122, size, Integer.valueOf(size2));
        Intrinsics.checkNotNullExpressionValue(quantityString3, "getQuantityString(...)");
        com.alightcreative.widget.xuv.ck(xuvVar, quantityString3, 2131361946, 2131231862, false, null, false, null, false, 248, null);
        if (I7a.rl() == null) {
            xuvVar.o();
        }
        List listRl4 = I7a.rl();
        if (listRl4 != null) {
            size3 = listRl4.size();
        } else {
            size3 = 0;
        }
        boolean zContains = xuvVar.WPU().Uo().contains(kgE.K.f70072S);
        if (size3 == i2 && (listRl = I7a.rl()) != null && (sceneElement = (SceneElement) CollectionsKt.first(listRl)) != null && (visualEffects = sceneElement.getVisualEffects()) != null && (collectionValues = visualEffects.values()) != null) {
            Collection<KeyableVisualEffectRef> collection = collectionValues;
            if (!(collection instanceof Collection) || !collection.isEmpty()) {
                Iterator<T> it = collection.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (kgE.Md.n().contains(((KeyableVisualEffectRef) it.next()).getId())) {
                        i5 = i2;
                        break;
                    }
                }
            }
        }
        String string6 = editActivity.getResources().getString(2132019841);
        Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
        if (size3 == i2 && !zContains && i5 != 0) {
            string2 = editActivity.getResources().getString(2132020447);
        } else {
            string2 = null;
        }
        com.alightcreative.widget.xuv.ck(xuvVar, string6, 2131361947, 2131231864, false, null, true, string2, false, ModuleDescriptor.MODULE_VERSION, null);
        if (editActivity.UpJ().isEmpty() || size3 != i2) {
            xuvVar.o();
        }
        xuvVar.aYN(new Function1() { // from class: com.alightcreative.app.motion.activities.IE
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EditActivity.XN(this.f44578n, ((Integer) obj).intValue());
            }
        });
        xuvVar.g(editActivity.getResources().getDimensionPixelSize(2131166272));
        Intrinsics.checkNotNull(view);
        com.alightcreative.widget.h6y h6yVarT = I7a.t();
        if (h6yVarT != null) {
            setN = h6yVarT.n();
        } else {
            setN = null;
        }
        xuvVar.te(view, setN, new Function1() { // from class: com.alightcreative.app.motion.activities.zpl
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EditActivity.RWT((com.alightcreative.widget.U4) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void aeB(EditActivity editActivity, View view) {
        editActivity.rV9(2131361868);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit aeZ(EditActivity editActivity) {
        if (editActivity.isDestroyed()) {
            return Unit.INSTANCE;
        }
        SceneElement sceneElementT = HW.C.T(editActivity);
        if (sceneElementT == null) {
            return Unit.INSTANCE;
        }
        List<Long> editingNestedSceneIds = editActivity.sceneHolder.getEditingNestedSceneIds();
        ActivityResultLauncher activityResultLauncher = editActivity.presetPreviewLauncher;
        Pair pair = TuplesKt.to("projectID", editActivity.Uo());
        Pair pair2 = TuplesKt.to("nestedSceneIdPath", CollectionsKt.toLongArray(editingNestedSceneIds));
        List list = editActivity.presetsList;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ProjectInfo.n) it.next()).getId());
        }
        Pair[] pairArr = {pair, pair2, TuplesKt.to(PtsLKY.kXvrmZADJWGh, arrayList.toArray(new String[0])), TuplesKt.to("sceneElementID", Long.valueOf(sceneElementT.getId()))};
        Intent intent = new Intent(editActivity, (Class<?>) PresetPreviewActivity.class);
        intent.putExtras(BundleKt.n((Pair[]) Arrays.copyOf(pairArr, 4)));
        activityResultLauncher.n(intent);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void azi(EditActivity editActivity, View view) {
        if (!editActivity.KJJ()) {
            editActivity.aa();
            editActivity.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bGT(EditActivity editActivity, View view) {
        FragmentTransaction fragmentTransactionO = editActivity.getSupportFragmentManager().o();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionO, "beginTransaction(...)");
        Fragment fragmentPJg = editActivity.getSupportFragmentManager().pJg("ProjectSettingsFragment");
        if (fragmentPJg != null) {
            fragmentTransactionO.r(fragmentPJg);
        }
        fragmentTransactionO.KN(null);
        fragmentTransactionO.rl(2131362855, iP.Companion.rl(iP.INSTANCE, false, 1, null)).KN("ProjectSettingsFragment").mUb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bIT(EditActivity editActivity, DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
        QmE.iF iFVarLm1 = editActivity.lm1();
        Bundle bundle = new Bundle();
        bundle.putLong("lag_feedback", editActivity.lagFeedbackConfig);
        Unit unit = Unit.INSTANCE;
        iFVarLm1.n(new j.fuX("lag_notice_dont_ask", bundle));
        com.alightcreative.app.motion.persist.j.INSTANCE.setShowedLagNotice(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c3(EditActivity editActivity) {
        editActivity.xxL().T(IG.j.f4137t);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c7Q(EditActivity editActivity) {
        editActivity.mBA().nr();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object ce(Continuation continuation) {
        Object objUo = GJW.Dsr.Uo(GJW.OU.rl(), new fuX(null), continuation);
        if (objUo == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objUo;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void cm(EditActivity editActivity, View view) {
        editActivity.rV9(2131361929);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void drE(EditActivity editActivity, View view) {
        Float fValueOf;
        float fJ2;
        boolean z2;
        float[] fArrO = yc.RP.O();
        int length = fArrO.length;
        int i2 = 0;
        while (true) {
            if (i2 < length) {
                float f3 = fArrO[i2];
                if (yc.RP.KN(editActivity.sceneHolder.getUserPreviewMode()) < f3) {
                    fValueOf = Float.valueOf(f3);
                    break;
                }
                i2++;
            } else {
                fValueOf = null;
                break;
            }
        }
        if (fValueOf != null) {
            fJ2 = fValueOf.floatValue();
        } else {
            fJ2 = yc.RP.J2();
        }
        SceneHolder sceneHolder = editActivity.sceneHolder;
        sceneHolder.setUserPreviewMode(yc.RP.qie(sceneHolder.getUserPreviewMode(), fJ2));
        QmE.iF iFVarLm1 = editActivity.lm1();
        if (editActivity.sceneHolder.getSelection().getDirectSelection() != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        yc.giR.t(iFVarLm1, false, fJ2, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsetsCompat dt(View view, WindowInsetsCompat windowInsetsCompat) {
        Insets insetsJ2 = windowInsetsCompat.J2(WindowInsetsCompat.Type.xMQ());
        Intrinsics.checkNotNull(view);
        view.setPadding(view.getPaddingLeft(), insetsJ2.rl, view.getPaddingRight(), insetsJ2.nr);
        return windowInsetsCompat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f3k(EditActivity editActivity, View view) {
        editActivity.rV9(2131361928);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f8(final EditActivity editActivity) {
        long jNanoTime = System.nanoTime() / ((long) 1000000);
        if (editActivity.lagNoticePending && editActivity.lagFeedbackConfig > 0) {
            editActivity.lagNoticePending = false;
            com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
            if (!jVar.getShowedLagNotice() && jNanoTime - jVar.getShowedLagNoticeDate() > 21600000) {
                jVar.setShowedLagNoticeDate(jNanoTime);
                QmE.iF iFVarLm1 = editActivity.lm1();
                Bundle bundle = new Bundle();
                bundle.putLong("lag_feedback", editActivity.lagFeedbackConfig);
                Unit unit = Unit.INSTANCE;
                iFVarLm1.n(new j.fuX("lag_notice_shown", bundle));
                new AlertDialog.Builder(editActivity).o(2132019870).Uo(2132019869).setPositiveButton(2132019867, new DialogInterface.OnClickListener() { // from class: com.alightcreative.app.motion.activities.ys8
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        EditActivity.KB(this.f45752n, dialogInterface, i2);
                    }
                }).az(new DialogInterface.OnCancelListener() { // from class: com.alightcreative.app.motion.activities.jL
                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface) {
                        EditActivity.q5J(this.f45288n, dialogInterface);
                    }
                }).gh(2132019868, new DialogInterface.OnClickListener() { // from class: com.alightcreative.app.motion.activities.l
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        EditActivity.nln(this.f45315n, dialogInterface, i2);
                    }
                }).setNegativeButton(2132019866, new DialogInterface.OnClickListener() { // from class: com.alightcreative.app.motion.activities.xTb
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        EditActivity.bIT(this.f45728n, dialogInterface, i2);
                    }
                }).create().show();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void flZ(EditActivity editActivity, View view) {
        editActivity.rV9(2131361867);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ft(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fz(final EditActivity editActivity, View view) {
        if (!editActivity.rst().Uo().contains(kgE.K.f70070N) && !editActivity.AJ().KN()) {
            editActivity.Wl(new Function0() { // from class: com.alightcreative.app.motion.activities.W
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EditActivity.BAA(this.f44807n);
                }
            });
        } else {
            editActivity.editAddDelegate.o();
            editActivity.NkL();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String gdQ(float f3, float f4, MotionEvent motionEvent, EditActivity editActivity) {
        return "onPreviewTouchWithSelection:dragGestureStart dx=" + f3 + " dy=" + f4 + " elapsed=" + (motionEvent.getEventTime() - motionEvent.getDownTime()) + " touchSlop=" + editActivity.JF7() + " longPressTime=" + editActivity.longPressTime;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void gv0(Function0 function0, DialogInterface dialogInterface) {
        function0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h5H(DialogInterface dialogInterface, int i2) {
        dialogInterface.cancel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void kI(EditActivity editActivity, View view) {
        rWZ.C cRl;
        QmE.iF iFVarLm1 = editActivity.lm1();
        String strUo = editActivity.Uo();
        Set setUpJ = editActivity.UpJ();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(setUpJ, 10));
        Iterator it = setUpJ.iterator();
        while (it.hasNext()) {
            SceneElement sceneElementElementById = SceneKt.elementById(editActivity.sceneHolder.getScene(), Long.valueOf(((Number) it.next()).longValue()));
            if (sceneElementElementById != null) {
                cRl = rWZ.j.rl(sceneElementElementById);
            } else {
                cRl = null;
            }
            arrayList.add(cRl);
        }
        iFVarLm1.n(new j.RGN(strUo, arrayList));
        SceneHolder sceneHolder = editActivity.sceneHolder;
        Scene scene = sceneHolder.getScene();
        Set setUpJ2 = editActivity.UpJ();
        int iXQ = HW.C.XQ(editActivity);
        String string = editActivity.getString(2132019347);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        sceneHolder.setScene(ElementGroupingKt.groupElementsById$default(scene, setUpJ2, iXQ, string, null, null, 24, null));
        editActivity.vH3().te();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lX5(EditActivity editActivity) {
        editActivity.qie();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean lwA(Ref.FloatRef floatRef, Ref.FloatRef floatRef2, EditActivity editActivity, View view, final MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                float x2 = motionEvent.getX() - floatRef.element;
                float y2 = motionEvent.getY() - floatRef2.element;
                if (motionEvent.getEventTime() - motionEvent.getDownTime() < editActivity.longPressTime && Math.abs(x2) < editActivity.JF7() && Math.abs(y2) < editActivity.JF7()) {
                    XoT.C.Uo(editActivity, new Function0() { // from class: com.alightcreative.app.motion.activities.op
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return EditActivity.c52(motionEvent);
                        }
                    });
                    editActivity.i0();
                }
            }
        } else {
            floatRef.element = motionEvent.getX();
            floatRef2.element = motionEvent.getY();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mh(EditActivity editActivity, String str, String str2, DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
        editActivity.gS(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nln(EditActivity editActivity, DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
        QmE.iF iFVarLm1 = editActivity.lm1();
        Bundle bundle = new Bundle();
        bundle.putLong("lag_feedback", editActivity.lagFeedbackConfig);
        Unit unit = Unit.INSTANCE;
        iFVarLm1.n(new j.fuX("lag_notice_remind_later", bundle));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void oeS(EditActivity editActivity, View view) {
        Set setDSC = editActivity.dSC();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setDSC) {
            if (((Number) obj).intValue() > HW.C.XQ(editActivity) + (50000 / editActivity.sceneHolder.getScene().getFramesPerHundredSeconds())) {
                arrayList.add(obj);
            }
        }
        Integer num = (Integer) CollectionsKt.minOrNull((Iterable) arrayList);
        if (num != null) {
            editActivity.iF(num.intValue());
        }
        editActivity.qE1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ox(AlertDialog alertDialog, View view) {
        alertDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit pI5(EditActivity editActivity, ProjectInfo.n nVar, rWZ.eO eOVar, Boolean bool) {
        String uid = FirebaseAuth.getInstance().getUid();
        if (uid == null) {
            return Unit.INSTANCE;
        }
        l.CN3 cn3HJ4 = editActivity.hJ4();
        SceneThumbnailMaker sceneThumbnailMaker = editActivity.shareThumbnailMaker;
        if (sceneThumbnailMaker == null) {
            Intrinsics.throwUninitializedPropertyAccessException("shareThumbnailMaker");
            sceneThumbnailMaker = null;
        }
        cn3HJ4.X(editActivity, uid, nVar, sceneThumbnailMaker, eOVar, bool);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void piq(EditActivity editActivity, DialogInterface dialogInterface) {
        LottieAnimationView lottieAnimationView = (LottieAnimationView) editActivity.findViewById(2131363421);
        if (lottieAnimationView != null) {
            lottieAnimationView.r();
        }
        editActivity.az();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q5J(EditActivity editActivity, DialogInterface dialogInterface) {
        QmE.iF iFVarLm1 = editActivity.lm1();
        Bundle bundle = new Bundle();
        bundle.putLong("lag_feedback", editActivity.lagFeedbackConfig);
        Unit unit = Unit.INSTANCE;
        iFVarLm1.n(new j.fuX("lag_notice_cancel", bundle));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List qB(EditActivity editActivity) {
        List listRl;
        yc.tpM tpmXm = Xm(editActivity);
        if (tpmXm != null && (listRl = tpmXm.rl()) != null) {
            return listRl;
        }
        return CollectionsKt.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String rN(MotionEvent motionEvent, EditActivity editActivity) {
        String str;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        str = "Other";
                    } else {
                        str = "Cancel";
                    }
                } else {
                    str = "Move";
                }
            } else {
                str = "Up";
            }
        } else {
            str = "Down";
        }
        return "onPreviewTouchWithSelection: E=" + str + " touchSlop=" + editActivity.JF7() + " longPressTime=" + editActivity.longPressTime + " elapsed=" + (motionEvent.getEventTime() - motionEvent.getDownTime()) + " inDragGesture=" + editActivity.inDragGesture + " inScaleGesture=" + editActivity.inScaleGesture;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s5a(EditActivity editActivity, View view) {
        editActivity.i0();
        String string = editActivity.projectHolder.Uo().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        Scene sceneG = HW.C.g(editActivity);
        if (sceneG != null) {
            editActivity.R8().nr(editActivity, CollectionsKt.listOf(string), editActivity.hep().rl(string, sceneG));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sP(final EditActivity editActivity) {
        editActivity.ARa();
        List listPo6 = editActivity.getSupportFragmentManager().Po6();
        Intrinsics.checkNotNullExpressionValue(listPo6, "getFragments(...)");
        boolean z2 = false;
        if (listPo6 == null || !listPo6.isEmpty()) {
            Iterator it = listPo6.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Fragment fragment = (Fragment) it.next();
                if (fragment instanceof f0P.tC) {
                    f0P.tC tCVar = (f0P.tC) fragment;
                    if (tCVar.isAdded() && !tCVar.isRemoving()) {
                        z2 = true;
                        break;
                    }
                }
            }
        }
        SJ0.CN3 cn3 = null;
        if (!z2) {
            SJ0.CN3 cn32 = editActivity.binding;
            if (cn32 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn32 = null;
            }
            cn32.KN.setVisibility(4);
        }
        if (!z2) {
            SJ0.CN3 cn33 = editActivity.binding;
            if (cn33 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn33 = null;
            }
            if (!Intrinsics.areEqual(cn33.bzg.getAdapter(), editActivity.vH3())) {
                SJ0.CN3 cn34 = editActivity.binding;
                if (cn34 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    cn34 = null;
                }
                RecyclerView.Adapter adapter = cn34.bzg.getAdapter();
                Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.alightcreative.app.motion.activities.edit.TimelineSingleElementAdapter");
                final long jAYN = ((yc.cF) adapter).aYN();
                editActivity.sceneHolder.setSelection(SceneKt.getEMPTY_SCENE_SELECTION());
                SJ0.CN3 cn35 = editActivity.binding;
                if (cn35 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    cn35 = null;
                }
                cn35.bzg.setAdapter(editActivity.vH3());
                SJ0.CN3 cn36 = editActivity.binding;
                if (cn36 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    cn3 = cn36;
                }
                cn3.bzg.post(new Runnable() { // from class: com.alightcreative.app.motion.activities.U
                    @Override // java.lang.Runnable
                    public final void run() {
                        EditActivity.IO(this.f44782n, jAYN);
                    }
                });
                return;
            }
        }
        SJ0.CN3 cn37 = editActivity.binding;
        if (cn37 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            cn3 = cn37;
        }
        RecyclerView.Adapter adapter2 = cn3.bzg.getAdapter();
        if (adapter2 != null) {
            adapter2.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sPk(EditActivity editActivity, View view) {
        editActivity.rV9(2131361870);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int sh(EditActivity editActivity) {
        return ViewConfiguration.get(editActivity).getScaledTouchSlop();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sl(EditActivity editActivity, View view) {
        editActivity.vH3().te();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void stI(Function0 function0, DialogInterface dialogInterface) {
        function0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void tDX(EditActivity editActivity, DialogInterface dialogInterface) {
        LottieAnimationView lottieAnimationView = (LottieAnimationView) editActivity.findViewById(2131363421);
        if (lottieAnimationView != null) {
            lottieAnimationView.r();
        }
        editActivity.az();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void tYa(EditActivity editActivity, View view) {
        FragmentTransaction fragmentTransactionO = editActivity.getSupportFragmentManager().o();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionO, "beginTransaction(...)");
        Fragment fragmentPJg = editActivity.getSupportFragmentManager().pJg("ProjectSettingsFragment");
        if (fragmentPJg != null) {
            fragmentTransactionO.r(fragmentPJg);
        }
        fragmentTransactionO.KN(null);
        fragmentTransactionO.rl(2131362855, iP.INSTANCE.n(SceneKt.isEditingNestedScene(editActivity.sceneHolder))).KN("ProjectSettingsFragment").mUb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void tbd(EditActivity editActivity) {
        editActivity.xy();
    }

    private final void tsI(xAo.DAz format, final Function2 completion) {
        nYs.j jVarInvoke = CX().invoke();
        if (jVarInvoke != null && jVarInvoke.Xw()) {
            GJW.C.nr(LifecycleOwnerKt.n(this), null, null, new Md(format, this, completion, null), 3, null);
        } else {
            uQo().r(new xAo.Q(format), new Function1() { // from class: com.alightcreative.app.motion.activities.z2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return EditActivity.PHU(completion, this, (ComponentActivity) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(Function0 function0, DialogInterface dialogInterface) {
        function0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u2(EditActivity editActivity) {
        editActivity.mBA().nr();
        GJW.C.nr(LifecycleOwnerKt.n(editActivity), null, null, editActivity.new C1691c(null), 3, null);
        editActivity.hxH();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v6b(EditActivity editActivity, AlertDialog alertDialog, View view) {
        editActivity.xxL().N(editActivity.Uo());
        alertDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void vF(EditActivity editActivity, View view) {
        editActivity.rV9(2131361899);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void vI(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void vdt(Function0 function0, DialogInterface dialogInterface) {
        function0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void vp(final EditActivity editActivity, DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
        editActivity.eO();
        editActivity.handler.post(new Runnable() { // from class: com.alightcreative.app.motion.activities.w
            @Override // java.lang.Runnable
            public final void run() {
                EditActivity.DW(this.f45707n);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int vva(EditActivity editActivity) {
        yc.tpM tpmXm = Xm(editActivity);
        if (tpmXm != null) {
            return tpmXm.O();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String wY(Scene scene, SceneElement sceneElement) {
        return "askUpdateLinkedProjects: " + scene.getModifiedTime() + ">" + sceneElement.getNestedScene().getModifiedTime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit xif(EditActivity editActivity) {
        editActivity.xxL().T(IG.j.f4134n);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void yR(EditActivity editActivity) {
        editActivity.j3I().nY(com.alightcreative.app.motion.persist.j.INSTANCE.getLoopingPlay());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String zk(int i2, Fragment fragment) {
        return "updatePreviewEditMode prefilter fragment [" + i2 + "]: " + fragment.getClass().getSimpleName() + " added=" + fragment.isAdded() + " visible=" + fragment.isVisible() + " resumed=" + fragment.isResumed() + " // hidden=" + fragment.isHidden() + " removing=" + fragment.isRemoving() + " inLayout=" + fragment.isInLayout() + " detached=" + fragment.isDetached();
    }

    public final long KWB() {
        long jLongValue;
        long jNanoTime = System.nanoTime();
        String string = this.projectHolder.Uo().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        Long l2 = com.alightcreative.app.motion.persist.j.INSTANCE.getProjectEditTime().get(string);
        if (l2 != null) {
            jLongValue = l2.longValue();
        } else {
            jLongValue = 0;
        }
        long j2 = (jNanoTime - this.projectEditStartTime) / ((long) 1000000);
        if (!this.pauseEditTimer && j2 > 1000) {
            return jLongValue + j2;
        }
        return jLongValue;
    }

    @Override // HW.I28
    public int getCurrentTime() {
        return GA().MPw();
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (getOnBackPressedDispatcher().getHasEnabledCallbacks()) {
            super.onBackPressed();
            return;
        }
        if (this.fullScreenPreviewMode) {
            this.fullScreenPreviewMode = false;
            cKA();
            return;
        }
        SJ0.CN3 cn3 = this.binding;
        SJ0.CN3 cn32 = null;
        if (cn3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            cn3 = null;
        }
        if (cn3.bzg.getAdapter() instanceof yc.cF) {
            SJ0.CN3 cn33 = this.binding;
            if (cn33 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                cn33 = null;
            }
            RecyclerView.Adapter adapter = cn33.bzg.getAdapter();
            Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.alightcreative.app.motion.activities.edit.TimelineSingleElementAdapter");
            if (((yc.cF) adapter).nY()) {
                return;
            }
        }
        SJ0.CN3 cn34 = this.binding;
        if (cn34 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            cn32 = cn34;
        }
        if (Intrinsics.areEqual(cn32.bzg.getAdapter(), vH3()) && vH3().T()) {
            vH3().te();
        } else if (!KJJ()) {
            aa();
            super.onBackPressed();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStart() {
        FirebaseAuth.getInstance().t(new Al(rst()));
        AB.eO.ck(this, rst(), S0(), bAP(), lm1());
        super.onStart();
    }

    @Override // yc.Um
    public void rV9(int actionId) {
        Im().rV9(actionId);
    }
}
