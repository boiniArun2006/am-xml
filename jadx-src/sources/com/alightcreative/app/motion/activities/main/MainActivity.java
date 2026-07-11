package com.alightcreative.app.motion.activities.main;

import GJW.vd;
import GJW.xuv;
import GJW.yg;
import HI0.M5;
import KC.nr;
import KC.rrk;
import KC.s6u;
import KC.xTb;
import KC.z3w;
import M.Ogx;
import M.S;
import M.Sis;
import M.Um;
import M.V1;
import P0j.rYHL.xkISd;
import P1.GLd.KDyatQ;
import QmE.iF;
import QmE.j;
import SJ0.MKd;
import UO6.qf;
import Vi.CN3;
import aUP.QIQ.OAxfmSwmk;
import android.content.ClipData;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass;
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
import androidx.constraintlayout.core.dsl.kYF.obbPUqyhtS;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.media3.exoplayer.hls.offline.Oqje.QiDPjiOCZHDS;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.view.ComponentActivity;
import androidx.view.LifecycleOwnerKt;
import androidx.view.Observer;
import androidx.view.ViewModelKt;
import androidx.view.ViewModelLazy;
import androidx.view.ViewModelProvider;
import androidx.view.ViewModelStore;
import androidx.view.result.ActivityResultCaller;
import androidx.view.viewmodel.CreationExtras;
import androidx.work.impl.constraints.controllers.qRl.FijIa;
import com.airbnb.lottie.LottieAnimationView;
import com.alightcreative.app.motion.activities.AboutActivity;
import com.alightcreative.app.motion.activities.DevSettingsActivity;
import com.alightcreative.app.motion.activities.EditActivity;
import com.alightcreative.app.motion.activities.MyAccountActivity;
import com.alightcreative.app.motion.activities.R6;
import com.alightcreative.app.motion.activities.SettingsActivity;
import com.alightcreative.app.motion.activities.main.InterfaceC1725c;
import com.alightcreative.app.motion.activities.main.MainActivity;
import com.alightcreative.app.motion.activities.main.Wre;
import com.alightcreative.app.motion.activities.main.g9s;
import com.alightcreative.app.motion.activities.main.newfeature.NewFeaturePagerActivity;
import com.alightcreative.app.motion.activities.main.w6;
import com.alightcreative.app.motion.persist.j;
import com.alightcreative.app.motion.project.ProjectInfo;
import com.alightcreative.app.motion.ranking.ui.editprofile.EditProfileActivity;
import com.alightcreative.app.motion.scene.BitmapLruCache;
import com.alightcreative.app.motion.scene.ExportParams;
import com.alightcreative.app.motion.scene.Scene;
import com.alightcreative.app.motion.scene.SceneExporterKt;
import com.alightcreative.app.motion.scene.SceneKt;
import com.alightcreative.app.motion.scene.SceneThumbnailMaker;
import com.alightcreative.app.motion.scene.SceneType;
import com.alightcreative.app.motion.scene.VideoEncoding;
import com.alightcreative.app.motion.scene.serializer.MalformedSceneException;
import com.alightcreative.app.motion.scene.serializer.SceneSerializerKt;
import com.alightcreative.app.motion.scene.visualeffect.EffectDigestKt;
import com.alightcreative.app.motion.scene.visualeffect.VisualEffectKt;
import com.alightcreative.app.motion.tutorial.TutorialActivity;
import com.alightcreative.monorepo.settings.ExportedVideoAttachment;
import com.alightcreative.template.importpreview.ui.TemplateImportPreviewActivity;
import com.alightcreative.widget.fuX;
import com.alightcreative.widget.nKK;
import com.bendingspoons.uicomponent.opensource.OpenSourceLibrariesActivity;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.safedk.android.analytics.AppLovinBridge;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.l;
import com.safedk.android.utils.Logger;
import com.vungle.ads.internal.protos.Sdk;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import kP.InterfaceC2210n;
import kgE.l4Z;
import kotlin.Function;
import kotlin.Lazy;
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
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.reflect.KFunction;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import l.AbstractC2254j;
import l.Xo;
import w.InterfaceC2413n;
import x0X.n;
import xAo.C2422c;
import xAo.DAz;
import xAo.M;
import xhQ.Xo;
import xr.j;
import y.AbstractC2431fuX;
import zRY.g9s;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0084\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \u009f\u00032\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t:\u0002 \u0003B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u00020\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001c\u0010\u000bJ\u000f\u0010\u001d\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001d\u0010\u000bJ\u000f\u0010\u001e\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001e\u0010\u000bJ\u000f\u0010\u001f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001f\u0010\u000bJ\u0017\u0010\"\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u000eH\u0002¢\u0006\u0004\b$\u0010\u000bJ\u000f\u0010%\u001a\u00020\u000eH\u0002¢\u0006\u0004\b%\u0010\u000bJ\u000f\u0010&\u001a\u00020\u000eH\u0002¢\u0006\u0004\b&\u0010\u000bJ\u000f\u0010'\u001a\u00020\u000eH\u0002¢\u0006\u0004\b'\u0010\u000bJ\u000f\u0010(\u001a\u00020\u000eH\u0002¢\u0006\u0004\b(\u0010\u000bJ\u000f\u0010)\u001a\u00020\u0019H\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u000eH\u0002¢\u0006\u0004\b+\u0010\u000bJ1\u00101\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020,2\u0018\u00100\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u000e0.H\u0002¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u000eH\u0002¢\u0006\u0004\b3\u0010\u000bJ\u000f\u00104\u001a\u00020\u000eH\u0002¢\u0006\u0004\b4\u0010\u000bJ\u000f\u00105\u001a\u00020\u000eH\u0002¢\u0006\u0004\b5\u0010\u000bJ\u0017\u00108\u001a\u00020\u000e2\u0006\u00107\u001a\u000206H\u0002¢\u0006\u0004\b8\u00109J\u0017\u0010:\u001a\u00020\u000e2\u0006\u00107\u001a\u000206H\u0002¢\u0006\u0004\b:\u00109J\u0017\u0010;\u001a\u00020\u000e2\u0006\u00107\u001a\u000206H\u0002¢\u0006\u0004\b;\u00109J\u000f\u0010<\u001a\u00020\u000eH\u0002¢\u0006\u0004\b<\u0010\u000bJ\u001f\u0010?\u001a\u00020\u000e2\u0006\u0010=\u001a\u00020\u00112\u0006\u0010>\u001a\u00020/H\u0002¢\u0006\u0004\b?\u0010@J+\u0010D\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010B\u001a\u00020A2\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\bD\u0010EJ\u001f\u0010F\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010B\u001a\u00020AH\u0002¢\u0006\u0004\bF\u0010GJ\u0017\u0010J\u001a\u00020\u000e2\u0006\u0010I\u001a\u00020HH\u0002¢\u0006\u0004\bJ\u0010KJ\u0017\u0010N\u001a\u00020\u00192\u0006\u0010M\u001a\u00020LH\u0002¢\u0006\u0004\bN\u0010OJ1\u0010T\u001a\u00020\u000e2\u0006\u0010Q\u001a\u00020P2\u0018\u0010S\u001a\u0014\u0012\u0004\u0012\u00020R\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u000e0.H\u0002¢\u0006\u0004\bT\u0010UJ\u0019\u0010X\u001a\u00020\u000e2\b\u0010W\u001a\u0004\u0018\u00010VH\u0014¢\u0006\u0004\bX\u0010YJ!\u0010]\u001a\u00020\u000e2\u0006\u0010[\u001a\u00020Z2\b\u0010\\\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b]\u0010^J\u0017\u0010`\u001a\u00020\u000e2\u0006\u0010\\\u001a\u00020_H\u0016¢\u0006\u0004\b`\u0010aJ\u0017\u0010b\u001a\u00020\u000e2\u0006\u0010\\\u001a\u00020\fH\u0016¢\u0006\u0004\bb\u0010\u0010J!\u0010e\u001a\u00020\u000e2\u0006\u0010d\u001a\u00020c2\b\u0010\\\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\be\u0010fJ\u000f\u0010g\u001a\u00020\u0019H\u0016¢\u0006\u0004\bg\u0010*J\u0017\u0010h\u001a\u00020\u000e2\u0006\u0010\\\u001a\u00020\fH\u0016¢\u0006\u0004\bh\u0010\u0010J\r\u0010i\u001a\u00020\u000e¢\u0006\u0004\bi\u0010\u000bJ\u000f\u0010j\u001a\u00020\u000eH\u0016¢\u0006\u0004\bj\u0010\u000bJ\u0017\u0010k\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\bk\u0010lJ\u0017\u0010n\u001a\u00020\u000e2\u0006\u0010m\u001a\u00020\u0019H\u0016¢\u0006\u0004\bn\u0010oJ\u000f\u0010p\u001a\u00020\u000eH\u0016¢\u0006\u0004\bp\u0010\u000bJ\u0017\u0010q\u001a\u00020\u000e2\u0006\u00107\u001a\u000206H\u0014¢\u0006\u0004\bq\u00109J\u0017\u0010t\u001a\u00020\u000e2\u0006\u0010s\u001a\u00020rH\u0016¢\u0006\u0004\bt\u0010uJ\u000f\u0010v\u001a\u00020\u000eH\u0016¢\u0006\u0004\bv\u0010\u000bJ\u000f\u0010w\u001a\u00020\u000eH\u0016¢\u0006\u0004\bw\u0010\u000bJ\u000f\u0010x\u001a\u00020\u000eH\u0017¢\u0006\u0004\bx\u0010\u000bJ\u001f\u0010y\u001a\u00020\u000e2\u0006\u0010=\u001a\u00020\u00112\u0006\u0010>\u001a\u00020/H\u0016¢\u0006\u0004\by\u0010@J>\u0010\u007f\u001a\u00020\u000e2\u0006\u0010z\u001a\u00020L2\u0006\u0010=\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010{\u001a\u00020c2\u0006\u0010|\u001a\u00020\u00192\u0006\u0010~\u001a\u00020}¢\u0006\u0005\b\u007f\u0010\u0080\u0001J/\u0010\u0084\u0001\u001a\u00020\u000e2\u0007\u0010\u0081\u0001\u001a\u00020L2\u0007\u0010\u0082\u0001\u001a\u00020L2\t\u0010\u0083\u0001\u001a\u0004\u0018\u000106H\u0015¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\u0011\u0010\u0086\u0001\u001a\u00020\u000eH\u0014¢\u0006\u0005\b\u0086\u0001\u0010\u000bJ\u0011\u0010\u0087\u0001\u001a\u00020\u000eH\u0014¢\u0006\u0005\b\u0087\u0001\u0010\u000bJ\u0011\u0010\u0088\u0001\u001a\u00020\u000eH\u0014¢\u0006\u0005\b\u0088\u0001\u0010\u000bJ\u0011\u0010\u0089\u0001\u001a\u00020\u000eH\u0014¢\u0006\u0005\b\u0089\u0001\u0010\u000bJ\u0011\u0010\u008a\u0001\u001a\u00020\u000eH\u0014¢\u0006\u0005\b\u008a\u0001\u0010\u000bJ]\u0010\u0092\u0001\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020L2\n\u0010\u008c\u0001\u001a\u0005\u0018\u00010\u008b\u00012\u0007\u0010\u008d\u0001\u001a\u00020\u00192\u0015\u0010\u0090\u0001\u001a\u0010\u0012\u0005\u0012\u00030\u008f\u0001\u0012\u0004\u0012\u00020\u000e0\u008e\u00012\u0015\u0010\u0091\u0001\u001a\u0010\u0012\u0005\u0012\u00030\u008f\u0001\u0012\u0004\u0012\u00020\u000e0\u008e\u0001H\u0016¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001J\u001b\u0010\u0095\u0001\u001a\u00020\u000e2\u0007\u0010\u0094\u0001\u001a\u00020LH\u0016¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0019\u0010\u0099\u0001\u001a\u00030\u0097\u00018\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b]\u0010\u0098\u0001R*\u0010¡\u0001\u001a\u00030\u009a\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u009b\u0001\u0010\u009c\u0001\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001\"\u0006\b\u009f\u0001\u0010 \u0001R*\u0010©\u0001\u001a\u00030¢\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b£\u0001\u0010¤\u0001\u001a\u0006\b¥\u0001\u0010¦\u0001\"\u0006\b§\u0001\u0010¨\u0001R*\u0010±\u0001\u001a\u00030ª\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b«\u0001\u0010¬\u0001\u001a\u0006\b\u00ad\u0001\u0010®\u0001\"\u0006\b¯\u0001\u0010°\u0001R*\u0010¹\u0001\u001a\u00030²\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b³\u0001\u0010´\u0001\u001a\u0006\bµ\u0001\u0010¶\u0001\"\u0006\b·\u0001\u0010¸\u0001R*\u0010À\u0001\u001a\u00030º\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0092\u0001\u0010»\u0001\u001a\u0006\b¼\u0001\u0010½\u0001\"\u0006\b¾\u0001\u0010¿\u0001R)\u0010Ç\u0001\u001a\u00030Á\u00018\u0006@\u0006X\u0087.¢\u0006\u0017\n\u0005\bj\u0010Â\u0001\u001a\u0006\bÃ\u0001\u0010Ä\u0001\"\u0006\bÅ\u0001\u0010Æ\u0001R*\u0010Ï\u0001\u001a\u00030È\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÉ\u0001\u0010Ê\u0001\u001a\u0006\bË\u0001\u0010Ì\u0001\"\u0006\bÍ\u0001\u0010Î\u0001R'\u0010\u0018\u001a\u00020\u00178\u0006@\u0006X\u0087.¢\u0006\u0017\n\u0005\bg\u0010Ð\u0001\u001a\u0006\bÑ\u0001\u0010Ò\u0001\"\u0006\bÓ\u0001\u0010Ô\u0001R)\u0010Û\u0001\u001a\u00030Õ\u00018\u0006@\u0006X\u0087.¢\u0006\u0017\n\u0005\bw\u0010Ö\u0001\u001a\u0006\b×\u0001\u0010Ø\u0001\"\u0006\bÙ\u0001\u0010Ú\u0001R*\u0010ã\u0001\u001a\u00030Ü\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÝ\u0001\u0010Þ\u0001\u001a\u0006\bß\u0001\u0010à\u0001\"\u0006\bá\u0001\u0010â\u0001R*\u0010ë\u0001\u001a\u00030ä\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bå\u0001\u0010æ\u0001\u001a\u0006\bç\u0001\u0010è\u0001\"\u0006\bé\u0001\u0010ê\u0001R*\u0010ó\u0001\u001a\u00030ì\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bí\u0001\u0010î\u0001\u001a\u0006\bï\u0001\u0010ð\u0001\"\u0006\bñ\u0001\u0010ò\u0001R*\u0010û\u0001\u001a\u00030ô\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bõ\u0001\u0010ö\u0001\u001a\u0006\b÷\u0001\u0010ø\u0001\"\u0006\bù\u0001\u0010ú\u0001R*\u0010\u0083\u0002\u001a\u00030ü\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bý\u0001\u0010þ\u0001\u001a\u0006\bÿ\u0001\u0010\u0080\u0002\"\u0006\b\u0081\u0002\u0010\u0082\u0002R*\u0010\u008b\u0002\u001a\u00030\u0084\u00028\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0085\u0002\u0010\u0086\u0002\u001a\u0006\b\u0087\u0002\u0010\u0088\u0002\"\u0006\b\u0089\u0002\u0010\u008a\u0002R*\u0010\u0093\u0002\u001a\u00030\u008c\u00028\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u008d\u0002\u0010\u008e\u0002\u001a\u0006\b\u008f\u0002\u0010\u0090\u0002\"\u0006\b\u0091\u0002\u0010\u0092\u0002R*\u0010\u009b\u0002\u001a\u00030\u0094\u00028\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0095\u0002\u0010\u0096\u0002\u001a\u0006\b\u0097\u0002\u0010\u0098\u0002\"\u0006\b\u0099\u0002\u0010\u009a\u0002R*\u0010£\u0002\u001a\u00030\u009c\u00028\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u009d\u0002\u0010\u009e\u0002\u001a\u0006\b\u009f\u0002\u0010 \u0002\"\u0006\b¡\u0002\u0010¢\u0002R*\u0010«\u0002\u001a\u00030¤\u00028\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b¥\u0002\u0010¦\u0002\u001a\u0006\b§\u0002\u0010¨\u0002\"\u0006\b©\u0002\u0010ª\u0002R'\u0010°\u0002\u001a\u0010\u0012\u0004\u0012\u00020r\u0012\u0005\u0012\u00030\u00ad\u00020¬\u00028\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b®\u0002\u0010¯\u0002R2\u0010·\u0002\u001a\u00020r2\u0007\u0010±\u0002\u001a\u00020r8B@BX\u0082\u008e\u0002¢\u0006\u0017\n\u0006\b²\u0002\u0010³\u0002\u001a\u0006\b´\u0002\u0010µ\u0002\"\u0005\b¶\u0002\u0010uR5\u0010¾\u0002\u001a\u00030¸\u00022\b\u0010±\u0002\u001a\u00030¸\u00028V@VX\u0096\u008e\u0002¢\u0006\u0018\n\u0006\b¹\u0002\u0010³\u0002\u001a\u0006\bº\u0002\u0010»\u0002\"\u0006\b¼\u0002\u0010½\u0002R*\u0010Ã\u0002\u001a\u0004\u0018\u00010r8\u0016@\u0016X\u0096\u000e¢\u0006\u0017\n\u0006\b¿\u0002\u0010À\u0002\u001a\u0006\bÁ\u0002\u0010µ\u0002\"\u0005\bÂ\u0002\u0010uR,\u0010È\u0002\u001a\u0005\u0018\u00010¸\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0006\bÄ\u0002\u0010Å\u0002\u001a\u0006\bÆ\u0002\u0010»\u0002\"\u0006\bÇ\u0002\u0010½\u0002R*\u0010Ï\u0002\u001a\u00030É\u00028\u0016@\u0016X\u0096.¢\u0006\u0018\n\u0006\bÊ\u0002\u0010Ë\u0002\u001a\u0006\b«\u0001\u0010Ì\u0002\"\u0006\bÍ\u0002\u0010Î\u0002R\u001a\u0010Ñ\u0002\u001a\u00030É\u00028\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÐ\u0002\u0010Ë\u0002R\u001a\u0010Õ\u0002\u001a\u00030Ò\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÓ\u0002\u0010Ô\u0002R\u001e\u0010Ù\u0002\u001a\t\u0012\u0004\u0012\u00020\u000e0Ö\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b×\u0002\u0010Ø\u0002R!\u0010ß\u0002\u001a\u00030Ú\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÛ\u0002\u0010Ü\u0002\u001a\u0006\bÝ\u0002\u0010Þ\u0002R!\u0010ä\u0002\u001a\u00030à\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bá\u0002\u0010Ü\u0002\u001a\u0006\bâ\u0002\u0010ã\u0002R!\u0010é\u0002\u001a\u00030å\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bæ\u0002\u0010Ü\u0002\u001a\u0006\bç\u0002\u0010è\u0002R*\u0010ñ\u0002\u001a\u00030ê\u00028\u0016@\u0016X\u0096.¢\u0006\u0018\n\u0006\bë\u0002\u0010ì\u0002\u001a\u0006\bí\u0002\u0010î\u0002\"\u0006\bï\u0002\u0010ð\u0002R%\u0010õ\u0002\u001a\u0010\u0012\u0005\u0012\u00030ò\u0002\u0012\u0004\u0012\u00020\u000e0\u008e\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bó\u0002\u0010ô\u0002RA\u0010û\u0002\u001a\t\u0012\u0004\u0012\u00020\f0ö\u00022\u000e\u0010±\u0002\u001a\t\u0012\u0004\u0012\u00020\f0ö\u00028V@VX\u0096\u008e\u0002¢\u0006\u0018\n\u0006\b÷\u0002\u0010³\u0002\u001a\u0006\b³\u0001\u0010ø\u0002\"\u0006\bù\u0002\u0010ú\u0002R%\u0010þ\u0002\u001a\u0010\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020\f0ö\u00020ü\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bý\u0002\u0010³\u0002R0\u0010\u0085\u0003\u001a\t\u0012\u0004\u0012\u00020\u00110ÿ\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0006\b\u0080\u0003\u0010\u0081\u0003\u001a\u0006\bÝ\u0001\u0010\u0082\u0003\"\u0006\b\u0083\u0003\u0010\u0084\u0003R!\u0010\u008a\u0003\u001a\n\u0012\u0005\u0012\u00030\u0087\u00030\u0086\u00038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0003\u0010\u0089\u0003R!\u0010\u008d\u0003\u001a\n\u0012\u0005\u0012\u00030\u008b\u00030\u0086\u00038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0003\u0010\u0089\u0003R\u001a\u0010\u0090\u0003\u001a\u00030\u008b\u00038\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u008e\u0003\u0010\u008f\u0003R%\u0010\u0094\u0003\u001a\u0010\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020\f0ö\u00020\u0091\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0092\u0003\u0010\u0093\u0003R\u0018\u0010\u0098\u0003\u001a\u00030\u0095\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0096\u0003\u0010\u0097\u0003R\u0019\u0010\u009a\u0003\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0099\u0003\u0010£\u0001R8\u0010\u009e\u0003\u001a\t\u0012\u0004\u0012\u00020\f0ö\u00022\u000e\u0010\u009b\u0003\u001a\t\u0012\u0004\u0012\u00020\f0ö\u00028V@VX\u0096\u000e¢\u0006\u0010\u001a\u0006\b\u009c\u0003\u0010ø\u0002\"\u0006\b\u009d\u0003\u0010ú\u0002¨\u0006¡\u0003"}, d2 = {"Lcom/alightcreative/app/motion/activities/main/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "LVi/CN3;", "LUO6/qf$n;", "LKC/rrk;", "LM/V1;", "LM/Um;", "LVi/Wre;", "Lka/fuX;", "LPJ9/I28;", "<init>", "()V", "Lcom/alightcreative/app/motion/project/ProjectInfo$n;", "projectInfo", "", "rT", "(Lcom/alightcreative/app/motion/project/ProjectInfo$n;)V", "", "id", "qva", "(Ljava/lang/String;)V", "projectId", "A", "LnYs/Ml;", "getAlightSettingsUseCase", "", CmcdData.STREAMING_FORMAT_HLS, "(LnYs/Ml;)Z", "lH", "Om", "Hq", "ZZU", "LSJ0/MKd;", "hdrBinding", "Q", "(LSJ0/MKd;)V", "Co", "VK2", "eOa", "hu", "WT", "NC9", "()Z", "yAc", "Landroid/net/Uri;", "linkUri", "Lkotlin/Function2;", "LLM/aC;", "onImportComplete", "UR", "(Landroid/net/Uri;Lkotlin/jvm/functions/Function2;)V", "stS", "eo", "GN", "Landroid/content/Intent;", "intent", "Qg8", "(Landroid/content/Intent;)V", "iu", CmcdData.STREAM_TYPE_LIVE, "i7", "projectPackageId", "importResult", "tdZ", "(Ljava/lang/String;LLM/aC;)V", "LrWZ/eO;", "requestTriggerPoint", "overwritePrevious", "R3E", "(Lcom/alightcreative/app/motion/project/ProjectInfo$n;LrWZ/eO;Ljava/lang/Boolean;)V", "xSy", "(Lcom/alightcreative/app/motion/project/ProjectInfo$n;LrWZ/eO;)V", "Lcom/google/firebase/auth/FirebaseAuth;", "auth", "w", "(Lcom/google/firebase/auth/FirebaseAuth;)V", "", "actionId", "ex", "(I)Z", "LxAo/DAz;", "format", "Landroidx/activity/ComponentActivity;", "completion", "Mfw", "(LxAo/DAz;Lkotlin/jvm/functions/Function2;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lsix/fuX;", "projectType", "project", "r", "(Lsix/fuX;Lcom/alightcreative/app/motion/project/ProjectInfo$n;)V", "Lcom/alightcreative/app/motion/project/ProjectInfo;", "nr", "(Lcom/alightcreative/app/motion/project/ProjectInfo;)V", "ty", "Lcom/alightcreative/app/motion/scene/SceneType;", "selectedSceneType", "rl", "(Lcom/alightcreative/app/motion/scene/SceneType;Lcom/alightcreative/app/motion/project/ProjectInfo$n;)V", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "f11", "pE", "e", "KN", "(Landroid/net/Uri;)V", "isBlacklisted", "O", "(Z)V", "aYN", "onNewIntent", "LM/CN3;", "tab", "te", "(LM/CN3;)V", "az", "N", "onBackPressed", "WPU", "numberOfMedia", "sceneType", "showTemplateEditor", "Lxr/j;", "origin", "yUZ", "(ILjava/lang/String;Ljava/lang/String;Lcom/alightcreative/app/motion/scene/SceneType;ZLxr/j;)V", "requestCode", "resultCode", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "onPause", "onResume", "onDestroy", "onStart", "onStop", "LUO6/w6;", "exportInfo", "isTemplateToggledOn", "Lkotlin/Function1;", "Landroidx/fragment/app/FragmentActivity;", "onSuccess", "onFailure", "E2", "(ILUO6/w6;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "scrollY", "XQ", "(I)V", "LSJ0/UGc;", "LSJ0/UGc;", "binding", "LQmE/iF;", "o", "LQmE/iF;", "fq", "()LQmE/iF;", "setEventLogger", "(LQmE/iF;)V", "eventLogger", "LkgE/fuX;", "Z", "LkgE/fuX;", "YiW", "()LkgE/fuX;", "setIapManager", "(LkgE/fuX;)V", "iapManager", "LQ/Xo;", "S", "LQ/Xo;", "V5F", "()LQ/Xo;", "setRewardedAdUnlockUseCase", "(LQ/Xo;)V", "rewardedAdUnlockUseCase", "LxhQ/Ml;", "g", "LxhQ/Ml;", "yA", "()LxhQ/Ml;", "setGetTrialListItemsUseCase", "(LxhQ/Ml;)V", "getTrialListItemsUseCase", "LQ/fuX;", "LQ/fuX;", "wYi", "()LQ/fuX;", "setFeatureUnlockManager", "(LQ/fuX;)V", "featureUnlockManager", "LxAo/qf;", "LxAo/qf;", "C7B", "()LxAo/qf;", "setExportProFeatureManager", "(LxAo/qf;)V", "exportProFeatureManager", "LxAo/I28;", "X", "LxAo/I28;", "Xli", "()LxAo/I28;", "setCrisperManager", "(LxAo/I28;)V", "crisperManager", "LnYs/Ml;", "lRt", "()LnYs/Ml;", "setGetAlightSettingsUseCase", "(LnYs/Ml;)V", "LfVJ/w6;", "LfVJ/w6;", "gxH", "()LfVJ/w6;", "setGetWatermarkOptionsUseCase", "(LfVJ/w6;)V", "getWatermarkOptionsUseCase", "LbH/CN3;", "v", "LbH/CN3;", "getSecretMenu", "()LbH/CN3;", "setSecretMenu", "(LbH/CN3;)V", "secretMenu", "LmD/j;", "Xw", "LmD/j;", "Sax", "()LmD/j;", "setInstallSecretMenuUseCase", "(LmD/j;)V", "installSecretMenuUseCase", "LzRY/g9s$n;", "jB", "LzRY/g9s$n;", "MPw", "()LzRY/g9s$n;", "setPremadeContentViewModelFactory", "(LzRY/g9s$n;)V", "premadeContentViewModelFactory", "Lw/n;", "U", "Lw/n;", "n7u", "()Lw/n;", "setGetMonorepoLibUseCase", "(Lw/n;)V", "getMonorepoLibUseCase", "LDm5/n;", "P5", "LDm5/n;", "TVk", "()LDm5/n;", "setForceUpdater", "(LDm5/n;)V", "forceUpdater", "LCZF/I28;", "M7", "LCZF/I28;", "rR", "()LCZF/I28;", "setPico", "(LCZF/I28;)V", "pico", "LcKn/Wre;", "p5", "LcKn/Wre;", "Of6", "()LcKn/Wre;", "setTheirs", "(LcKn/Wre;)V", "theirs", "LWK/I28;", "eF", "LWK/I28;", "kQ", "()LWK/I28;", "setNewFeatureManager", "(LWK/I28;)V", "newFeatureManager", "LZs/n;", "E", "LZs/n;", "JI", "()LZs/n;", "setShowAdMobCMPPopupIfNeededUseCase", "(LZs/n;)V", "showAdMobCMPPopupIfNeededUseCase", "LkP/n;", "M", "LkP/n;", "c", "()LkP/n;", "setInjet", "(LkP/n;)V", "injet", "", "Lcom/alightcreative/app/motion/activities/main/Z;", "FX", "Ljava/util/Map;", "tabs", "<set-?>", "B", "Landroidx/compose/runtime/MutableState;", "sFO", "()LM/CN3;", "F6W", "selectedTab", "Lsix/CN3;", "J", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "()Lsix/CN3;", "s7N", "(Lsix/CN3;)V", "selectedSubTab", "D", "LM/CN3;", "XUb", "fD", "onResumeSelectTab", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "Lsix/CN3;", "x", "wTp", "onResumeSelectSubTab", "Lcom/alightcreative/app/motion/scene/SceneThumbnailMaker;", "I", "Lcom/alightcreative/app/motion/scene/SceneThumbnailMaker;", "()Lcom/alightcreative/app/motion/scene/SceneThumbnailMaker;", "q", "(Lcom/alightcreative/app/motion/scene/SceneThumbnailMaker;)V", "thumbnailMaker", "GR", "shareThumbnailMaker", "LKC/xTb;", "Nxk", "LKC/xTb;", "onboardingLauncher", "LGJW/r;", "Y", "LGJW/r;", "codecCheckComplete", "Lcom/alightcreative/app/motion/activities/main/ci;", "k", "Lkotlin/Lazy;", "jX", "()Lcom/alightcreative/app/motion/activities/main/ci;", "viewModel", "Ll/CN3;", "dR0", "eb", "()Ll/CN3;", "cloudBackupViewModel", "Lcom/alightcreative/app/motion/activities/main/r;", "z", "HFS", "()Lcom/alightcreative/app/motion/activities/main/r;", "bottomSheetViewModel", "LPJ9/Ml;", "piY", "LPJ9/Ml;", "ViF", "()LPJ9/Ml;", "u2n", "(LPJ9/Ml;)V", "signInLauncher", "Lcom/alightcreative/app/motion/activities/main/w6;", "ijL", "Lkotlin/jvm/functions/Function1;", "onElementLibraryLoaded", "", "m", "()Ljava/util/List;", "ENe", "(Ljava/util/List;)V", "allLocalProjects", "Landroidx/compose/runtime/MutableState;", "eTf", "_selectedProjects", "", "xg", "Ljava/util/Set;", "()Ljava/util/Set;", "Ai", "(Ljava/util/Set;)V", "projectTitles", "", "Lcom/alightcreative/app/motion/scene/Scene;", "pJg", "Ljava/util/List;", "scenes", "LrWZ/n;", "ofS", "snapshots", "C", "LrWZ/n;", "templateToggleExportSnapshot", "LHI0/l4Z;", "Mx", "LHI0/l4Z;", "projectListRefresher", "LkgE/l4Z;", "G7", "LkgE/l4Z;", "purchaseStateObserver", "fcU", "isPaused", "value", "Ik", "lvn", "selectedProjects", "eWT", "j", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMainActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainActivity.kt\ncom/alightcreative/app/motion/activities/main/MainActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 ContextUtil.kt\ncom/alightcreative/ext/ContextUtilKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 7 View.kt\nandroidx/core/view/ViewKt\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 9 FragmentManager.kt\nandroidx/fragment/app/FragmentManagerKt\n*L\n1#1,2057:1\n70#2,11:2058\n70#2,11:2069\n70#2,11:2080\n85#3:2091\n113#3,2:2092\n85#3:2094\n113#3,2:2095\n85#3:2154\n113#3,2:2155\n98#4:2097\n93#4,7:2098\n98#4:2127\n93#4,7:2128\n98#4:2171\n93#4,7:2172\n98#4:2179\n93#4,7:2180\n98#4:2187\n93#4,7:2188\n98#4:2195\n93#4,7:2196\n98#4:2203\n93#4,7:2204\n98#4:2211\n93#4,7:2212\n98#4:2219\n93#4,7:2220\n1557#5:2105\n1628#5,3:2106\n1557#5:2109\n1628#5,3:2110\n774#5:2113\n865#5,2:2114\n1863#5,2:2116\n1863#5,2:2120\n1755#5,3:2124\n1557#5:2135\n1628#5,3:2136\n1863#5,2:2139\n1863#5,2:2141\n1557#5:2143\n1628#5,3:2144\n1863#5:2148\n1864#5:2151\n1863#5,2:2157\n1863#5,2:2159\n1863#5,2:2161\n1863#5,2:2227\n1863#5,2:2229\n774#5:2231\n865#5,2:2232\n1782#5,4:2234\n1782#5,4:2238\n1557#5:2242\n1628#5,3:2243\n183#6,2:2118\n257#7,2:2122\n278#7,2:2149\n257#7,2:2152\n1#8:2147\n32#9,8:2163\n*S KotlinDebug\n*F\n+ 1 MainActivity.kt\ncom/alightcreative/app/motion/activities/main/MainActivity\n*L\n309#1:2058,11\n311#1:2069,11\n313#1:2080,11\n292#1:2091\n292#1:2092,2\n293#1:2094\n293#1:2095,2\n1329#1:2154\n1329#1:2155,2\n335#1:2097\n335#1:2098,7\n1178#1:2127\n1178#1:2128,7\n1510#1:2171\n1510#1:2172,7\n1516#1:2179\n1516#1:2180,7\n1691#1:2187\n1691#1:2188,7\n1695#1:2195\n1695#1:2196,7\n1699#1:2203\n1699#1:2204,7\n1703#1:2211\n1703#1:2212,7\n1707#1:2219\n1707#1:2220,7\n438#1:2105\n438#1:2106,3\n478#1:2109\n478#1:2110,3\n493#1:2113\n493#1:2114,2\n505#1:2116,2\n529#1:2120,2\n1176#1:2124,3\n1222#1:2135\n1222#1:2136,3\n1239#1:2139,2\n1240#1:2141,2\n1241#1:2143\n1241#1:2144,3\n1303#1:2148\n1303#1:2151\n1394#1:2157,2\n1404#1:2159,2\n1414#1:2161,2\n1760#1:2227,2\n1997#1:2229,2\n1184#1:2231\n1184#1:2232,2\n1346#1:2234,4\n1347#1:2238,4\n1348#1:2242\n1348#1:2243,3\n519#1:2118,2\n933#1:2122,2\n1303#1:2149,2\n1306#1:2152,2\n1426#1:2163,8\n*E\n"})
public final class MainActivity extends com.alightcreative.app.motion.activities.main.I28 implements V1, Um, rrk, Vi.Wre, ka.fuX, PJ9.I28, Vi.CN3, qf.n {

    /* JADX INFO: renamed from: C, reason: collision with root package name and from kotlin metadata */
    public rWZ.n templateToggleExportSnapshot;

    /* JADX INFO: renamed from: D, reason: collision with root package name and from kotlin metadata */
    public M.CN3 onResumeSelectTab;

    /* JADX INFO: renamed from: E, reason: collision with root package name and from kotlin metadata */
    public Zs.n showAdMobCMPPopupIfNeededUseCase;

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    public Q.fuX featureUnlockManager;

    /* JADX INFO: renamed from: FX, reason: collision with root package name and from kotlin metadata */
    public Map tabs;

    /* JADX INFO: renamed from: G7, reason: collision with root package name and from kotlin metadata */
    public final l4Z purchaseStateObserver;

    /* JADX INFO: renamed from: GR, reason: collision with root package name and from kotlin metadata */
    public SceneThumbnailMaker shareThumbnailMaker;

    /* JADX INFO: renamed from: I, reason: collision with root package name and from kotlin metadata */
    public SceneThumbnailMaker thumbnailMaker;

    /* JADX INFO: renamed from: M, reason: collision with root package name and from kotlin metadata */
    public InterfaceC2210n injet;

    /* JADX INFO: renamed from: M7, reason: from kotlin metadata */
    public CZF.I28 pico;

    /* JADX INFO: renamed from: Mx, reason: from kotlin metadata */
    public final HI0.l4Z projectListRefresher;

    /* JADX INFO: renamed from: N, reason: collision with root package name and from kotlin metadata */
    public fVJ.w6 getWatermarkOptionsUseCase;

    /* JADX INFO: renamed from: Nxk, reason: from kotlin metadata */
    public xTb onboardingLauncher;

    /* JADX INFO: renamed from: P5, reason: from kotlin metadata */
    public Dm5.n forceUpdater;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    public Q.Xo rewardedAdUnlockUseCase;

    /* JADX INFO: renamed from: T, reason: collision with root package name and from kotlin metadata */
    public nYs.Ml getAlightSettingsUseCase;

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
    public InterfaceC2413n getMonorepoLibUseCase;

    /* JADX INFO: renamed from: X, reason: collision with root package name and from kotlin metadata */
    public xAo.I28 crisperManager;

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    public mD.j installSecretMenuUseCase;

    /* JADX INFO: renamed from: Y, reason: collision with root package name and from kotlin metadata */
    public final GJW.r codecCheckComplete;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    public kgE.fuX iapManager;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public six.CN3 onResumeSelectSubTab;

    /* JADX INFO: renamed from: dR0, reason: from kotlin metadata */
    public final Lazy cloudBackupViewModel;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public xAo.qf exportProFeatureManager;

    /* JADX INFO: renamed from: eF, reason: from kotlin metadata */
    public WK.I28 newFeatureManager;

    /* JADX INFO: renamed from: eTf, reason: from kotlin metadata */
    public final MutableState _selectedProjects;

    /* JADX INFO: renamed from: fcU, reason: from kotlin metadata */
    public boolean isPaused;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public xhQ.Ml getTrialListItemsUseCase;

    /* JADX INFO: renamed from: ijL, reason: from kotlin metadata */
    public final Function1 onElementLibraryLoaded;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    public g9s.n premadeContentViewModelFactory;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public final Lazy viewModel;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public final MutableState allLocalProjects;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public iF eventLogger;

    /* JADX INFO: renamed from: ofS, reason: from kotlin metadata */
    public List snapshots;

    /* JADX INFO: renamed from: p5, reason: from kotlin metadata */
    public cKn.Wre theirs;

    /* JADX INFO: renamed from: pJg, reason: from kotlin metadata */
    public List scenes;

    /* JADX INFO: renamed from: piY, reason: from kotlin metadata */
    public PJ9.Ml signInLauncher;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public SJ0.UGc binding;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    public bH.CN3 secretMenu;

    /* JADX INFO: renamed from: xg, reason: from kotlin metadata */
    public Set projectTitles;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    public final Lazy bottomSheetViewModel;

    /* JADX INFO: renamed from: eWT, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int ul = 8;
    public static final Map n1 = MapsKt.mapOf(TuplesKt.to(1000, "1s"), TuplesKt.to(2000, "2s"), TuplesKt.to(Integer.valueOf(AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS), "3s"), TuplesKt.to(Integer.valueOf(Sdk.SDKError.Reason.VUNGLE_OIT_CREATION_ERROR_VALUE), "4s"), TuplesKt.to(5000, "5s"), TuplesKt.to(6000, "6s"), TuplesKt.to(7000, "7s"), TuplesKt.to(8000, "8s"), TuplesKt.to(9000, "9s"), TuplesKt.to(10000, "10s"), TuplesKt.to(15000, "15s"), TuplesKt.to(Integer.valueOf(BrandSafetyUtils.f61442h), "20s"), TuplesKt.to(25000, "25s"), TuplesKt.to(30000, "30s"), TuplesKt.to(45000, "45s"), TuplesKt.to(60000, "60s"));

    /* JADX INFO: renamed from: B, reason: collision with root package name and from kotlin metadata */
    public final MutableState selectedTab = SnapshotStateKt__SnapshotStateKt.O(M.CN3.f6258r, null, 2, null);

    /* JADX INFO: renamed from: J, reason: collision with root package name and from kotlin metadata */
    public final MutableState selectedSubTab = SnapshotStateKt__SnapshotStateKt.O(six.CN3.f73284t, null, 2, null);

    static final class C extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public final /* synthetic */ xuv f45362O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f45363n;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return MainActivity.this.new C(this.f45362O, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((C) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C(xuv xuvVar, Continuation continuation) {
            super(2, continuation);
            this.f45362O = xuvVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f45363n;
            boolean z2 = true;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                nYs.j jVarInvoke = MainActivity.this.lRt().invoke();
                if (jVarInvoke != null && jVarInvoke.e()) {
                    xuv xuvVar = this.f45362O;
                    this.f45363n = 1;
                    if (xuvVar.join(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
            SJ0.UGc uGc = MainActivity.this.binding;
            SJ0.UGc uGc2 = null;
            if (uGc == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                uGc = null;
            }
            LottieAnimationView setupOverlaySpinner = uGc.ty;
            Intrinsics.checkNotNullExpressionValue(setupOverlaySpinner, "setupOverlaySpinner");
            setupOverlaySpinner.setVisibility(4);
            SJ0.UGc uGc3 = MainActivity.this.binding;
            if (uGc3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                uGc3 = null;
            }
            RelativeLayout setupOverlay = uGc3.az;
            Intrinsics.checkNotNullExpressionValue(setupOverlay, "setupOverlay");
            eVj.aC.nr(setupOverlay, 0L, null, 3, null);
            SJ0.UGc uGc4 = MainActivity.this.binding;
            if (uGc4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                uGc2 = uGc4;
            }
            ImageButton buttonTutorial = uGc2.f9361O;
            Intrinsics.checkNotNullExpressionValue(buttonTutorial, "buttonTutorial");
            nYs.j jVarInvoke2 = MainActivity.this.lRt().invoke();
            int i3 = 0;
            if (jVarInvoke2 == null || !jVarInvoke2.xMQ()) {
                z2 = false;
            }
            if (!z2) {
                i3 = 8;
            }
            buttonTutorial.setVisibility(i3);
            MainActivity.this.JI().n(MainActivity.this);
            return Unit.INSTANCE;
        }
    }

    /* synthetic */ class Dsr extends FunctionReferenceImpl implements Function2 {
        public Dsr(Object obj) {
            super(2, obj, MainActivity.class, "onImportComplete", "onImportComplete(Ljava/lang/String;Lcom/alightcreative/app/motion/project/ProjectImportResult;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            n((String) obj, (LM.aC) obj2);
            return Unit.INSTANCE;
        }

        public final void n(String p0, LM.aC p1) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            ((MainActivity) this.receiver).WPU(p0, p1);
        }
    }

    /* synthetic */ class I28 extends FunctionReferenceImpl implements Function2 {
        public I28(Object obj) {
            super(2, obj, MainActivity.class, FijIa.YpjBcIcjMfDhT, "onImportComplete(Ljava/lang/String;Lcom/alightcreative/app/motion/project/ProjectImportResult;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            n((String) obj, (LM.aC) obj2);
            return Unit.INSTANCE;
        }

        public final void n(String p0, LM.aC p1) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            ((MainActivity) this.receiver).WPU(p0, p1);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
    static final class Pl implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Function1 f45370n;

        public Pl(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f45370n = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function getFunctionDelegate() {
            return this.f45370n;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.view.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f45370n.invoke(obj);
        }
    }

    public static final class Q extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Function0 f45371n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f45372t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Q(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f45371n = function0;
            this.f45372t = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f45371n;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f45372t.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
    public static final class QJ extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f45373n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QJ(ComponentActivity componentActivity) {
            super(0);
            this.f45373n = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final ViewModelProvider.Factory invoke() {
            return this.f45373n.getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
    static final class SPz implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final SPz f45374n = new SPz();

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Void invoke() throws com.alightcreative.app.motion.activities.main.n, InterruptedException {
            Thread.sleep(((long) 100) + (new Random().nextLong() % 15000));
            throw new com.alightcreative.app.motion.activities.main.n("Invalid sig. Got: " + VisualEffectKt.getEffectSig());
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
    public static final class UGc extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f45375n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UGc(ComponentActivity componentActivity) {
            super(0);
            this.f45375n = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final ViewModelStore invoke() {
            return this.f45375n.getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
    public static final class Xo extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f45379n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Xo(ComponentActivity componentActivity) {
            super(0);
            this.f45379n = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final ViewModelProvider.Factory invoke() {
            return this.f45379n.getDefaultViewModelProviderFactory();
        }
    }

    /* synthetic */ class aC extends FunctionReferenceImpl implements Function2 {
        public aC(Object obj) {
            super(2, obj, MainActivity.class, "onImportComplete", "onImportComplete(Ljava/lang/String;Lcom/alightcreative/app/motion/project/ProjectImportResult;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            n((String) obj, (LM.aC) obj2);
            return Unit.INSTANCE;
        }

        public final void n(String p0, LM.aC p1) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            ((MainActivity) this.receiver).WPU(p0, p1);
        }
    }

    /* JADX INFO: renamed from: com.alightcreative.app.motion.activities.main.MainActivity$c, reason: case insensitive filesystem */
    public static final class C1724c extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Function0 f45380n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f45381t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1724c(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f45380n = function0;
            this.f45381t = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f45380n;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f45381t.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public static final class eO extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f45382n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eO(ComponentActivity componentActivity) {
            super(0);
            this.f45382n = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final ViewModelStore invoke() {
            return this.f45382n.getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.alightcreative.app.motion.activities.main.MainActivity$j, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
            Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
            if (p1 == null) {
                return;
            }
            p0.startActivity(p1);
        }

        public Companion() {
        }

        public final void n(Context context, M.CN3 tab) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(tab, "tab");
            Intent intent = new Intent(context, (Class<?>) MainActivity.class);
            intent.putExtra("main_tab_ordinal", tab.ordinal());
            intent.setFlags(67239936);
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
        }
    }

    public static final class l3D extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f45385n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l3D(ComponentActivity componentActivity) {
            super(0);
            this.f45385n = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final ViewModelStore invoke() {
            return this.f45385n.getViewModelStore();
        }
    }

    public /* synthetic */ class n {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[six.fuX.values().length];
            try {
                iArr[six.fuX.f73288O.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[six.fuX.f73290n.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[six.fuX.f73293t.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[six.fuX.J2.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[six.fuX.f73292r.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[SceneType.values().length];
            try {
                iArr2[SceneType.SCENE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[SceneType.ELEMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[M.CN3.values().length];
            try {
                iArr3[M.CN3.f6258r.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[M.CN3.f6256g.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[DAz.values().length];
            try {
                iArr4[DAz.f75225t.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    static final class o extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public final /* synthetic */ MainActivity f45386O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f45387n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ xuv f45388t;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new o(this.f45388t, this.f45386O, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((o) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(xuv xuvVar, MainActivity mainActivity, Continuation continuation) {
            super(2, continuation);
            this.f45388t = xuvVar;
            this.f45386O = mainActivity;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
        
            if (r5.n(r4) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f45387n;
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
                xuv xuvVar = this.f45388t;
                this.f45387n = 1;
                if (xuvVar.join(this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            Dm5.n nVarTVk = this.f45386O.TVk();
            this.f45387n = 2;
        }
    }

    static final class r extends SuspendLambda implements Function2 {
        public final /* synthetic */ Function2 J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public final /* synthetic */ Eu.I28 f45391O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f45392n;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return MainActivity.this.new r(this.f45391O, this.J2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((r) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(Eu.I28 i28, Function2 function2, Continuation continuation) {
            super(2, continuation);
            this.f45391O = i28;
            this.J2 = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f45392n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                InterfaceC2210n interfaceC2210nC = MainActivity.this.c();
                Eu.I28 i28 = this.f45391O;
                this.f45392n = 1;
                obj = Eu.Wre.n(interfaceC2210nC, i28, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            x0X.n nVar = (x0X.n) obj;
            Function2 function2 = this.J2;
            MainActivity mainActivity = MainActivity.this;
            boolean z2 = nVar instanceof n.C1266n;
            if (!z2) {
                if (nVar instanceof n.w6) {
                    function2.invoke(mainActivity, Boxing.boxBoolean(((Boolean) ((n.w6) nVar).n()).booleanValue()));
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            Function2 function22 = this.J2;
            MainActivity mainActivity2 = MainActivity.this;
            if (z2) {
                function22.invoke(mainActivity2, Boxing.boxBoolean(false));
            } else if (!(nVar instanceof n.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class s4 extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f45394n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s4(ComponentActivity componentActivity) {
            super(0);
            this.f45394n = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final ViewModelProvider.Factory invoke() {
            return this.f45394n.getDefaultViewModelProviderFactory();
        }
    }

    static final class w6 implements Function2 {

        /* synthetic */ class CN3 extends FunctionReferenceImpl implements Function0 {
            public CN3(Object obj) {
                super(0, obj, com.alightcreative.app.motion.activities.main.r.class, "onBackPressed", "onBackPressed()V", 0);
            }

            public final void n() {
                ((com.alightcreative.app.motion.activities.main.r) this.receiver).ck();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                n();
                return Unit.INSTANCE;
            }
        }

        /* synthetic */ class Dsr extends FunctionReferenceImpl implements Function0 {
            public Dsr(Object obj) {
                super(0, obj, com.alightcreative.app.motion.activities.main.r.class, "onCloseButtonClick", "onCloseButtonClick()V", 0);
            }

            public final void n() {
                ((com.alightcreative.app.motion.activities.main.r) this.receiver).r();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                n();
                return Unit.INSTANCE;
            }
        }

        /* synthetic */ class I28 extends FunctionReferenceImpl implements Function0 {
            public I28(Object obj) {
                super(0, obj, com.alightcreative.app.motion.activities.main.r.class, "onRankingStayButtonClick", "onRankingStayButtonClick()V", 0);
            }

            public final void n() {
                ((com.alightcreative.app.motion.activities.main.r) this.receiver).g();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                n();
                return Unit.INSTANCE;
            }
        }

        /* synthetic */ class Ml extends AdaptedFunctionReference implements Function0 {
            public Ml(Object obj) {
                super(0, obj, com.alightcreative.app.motion.activities.main.r.class, "onRankingOptOutButtonClick", "onRankingOptOutButtonClick()Lkotlinx/coroutines/Job;", 8);
            }

            public final void n() {
                ((com.alightcreative.app.motion.activities.main.r) this.receiver).ViF();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                n();
                return Unit.INSTANCE;
            }
        }

        /* synthetic */ class fuX extends FunctionReferenceImpl implements Function1 {
            public fuX(Object obj) {
                super(1, obj, com.alightcreative.app.motion.activities.main.r.class, "onPremadeItemClick", "onPremadeItemClick(Lcom/alightcreative/app/motion/premade/domain/entities/LocalizedPremadeContentItem;)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                n((tN.n) obj);
                return Unit.INSTANCE;
            }

            public final void n(tN.n p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((com.alightcreative.app.motion.activities.main.r) this.receiver).XQ(p0);
            }
        }

        /* synthetic */ class j extends FunctionReferenceImpl implements Function0 {
            public j(Object obj) {
                super(0, obj, com.alightcreative.app.motion.activities.main.r.class, "onRankingAcceptButtonClick", "onRankingAcceptButtonClick()V", 0);
            }

            public final void n() {
                ((com.alightcreative.app.motion.activities.main.r) this.receiver).S();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                n();
                return Unit.INSTANCE;
            }
        }

        /* synthetic */ class n extends FunctionReferenceImpl implements Function0 {
            public n(Object obj) {
                super(0, obj, com.alightcreative.app.motion.activities.main.r.class, "onRankingTosLinkClick", "onRankingTosLinkClick()V", 0);
            }

            public final void n() {
                ((com.alightcreative.app.motion.activities.main.r) this.receiver).te();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                n();
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.alightcreative.app.motion.activities.main.MainActivity$w6$w6, reason: collision with other inner class name */
        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
        /* synthetic */ class C0637w6 extends FunctionReferenceImpl implements Function0 {
            public C0637w6(Object obj) {
                super(0, obj, com.alightcreative.app.motion.activities.main.r.class, "onRankingPPLinkClick", "onRankingPPLinkClick()V", 0);
            }

            public final void n() {
                ((com.alightcreative.app.motion.activities.main.r) this.receiver).nY();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                n();
                return Unit.INSTANCE;
            }
        }

        public w6() {
        }

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
        static final class Wre extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            public final /* synthetic */ MainActivity f45396O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public int f45397n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public final /* synthetic */ ModalBottomSheetState f45398t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Wre(ModalBottomSheetState modalBottomSheetState, MainActivity mainActivity, Continuation continuation) {
                super(2, continuation);
                this.f45398t = modalBottomSheetState;
                this.f45396O = mainActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new Wre(this.f45398t, this.f45396O, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(vd vdVar, Continuation continuation) {
                return ((Wre) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f45397n;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    ModalBottomSheetState modalBottomSheetState = this.f45398t;
                    this.f45397n = 1;
                    if (modalBottomSheetState.xMQ(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                this.f45396O.HFS().Ik();
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
        static final class aC extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public int f45399n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public final /* synthetic */ MainActivity f45400t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public aC(MainActivity mainActivity, Continuation continuation) {
                super(2, continuation);
                this.f45400t = mainActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new aC(this.f45400t, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(vd vdVar, Continuation continuation) {
                return ((aC) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f45399n;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    this.f45399n = 1;
                    if (yg.rl(500L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                this.f45400t.HFS().Ik();
                return Unit.INSTANCE;
            }
        }

        public static final Unit S(final MainActivity mainActivity, vd vdVar, ModalBottomSheetState modalBottomSheetState, InterfaceC1725c action) {
            Intrinsics.checkNotNullParameter(action, "action");
            if (action instanceof InterfaceC1725c.n) {
                mainActivity.UR(((InterfaceC1725c.n) action).n(), new Function2() { // from class: com.alightcreative.app.motion.activities.main.aC
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return MainActivity.w6.WPU(mainActivity, (String) obj, (LM.aC) obj2);
                    }
                });
            } else if (action instanceof InterfaceC1725c.j) {
                GJW.C.nr(vdVar, null, null, new Wre(modalBottomSheetState, mainActivity, null), 3, null);
            } else if (action instanceof InterfaceC1725c.Ml) {
                YgZ.Ml.rl(YgZ.Ml.f12213n, mainActivity, ((InterfaceC1725c.Ml) action).n(), null, 4, null);
            } else {
                if (!(action instanceof InterfaceC1725c.w6)) {
                    throw new NoWhenBranchMatchedException();
                }
                EditProfileActivity.INSTANCE.n(mainActivity);
            }
            return Unit.INSTANCE;
        }

        public static final Unit ViF(MainActivity mainActivity, AbstractC2254j action) {
            Intrinsics.checkNotNullParameter(action, "action");
            if (action instanceof AbstractC2254j.w6) {
                AbstractC2254j.w6 w6Var = (AbstractC2254j.w6) action;
                mainActivity.xSy(w6Var.n(), w6Var.rl());
            }
            return Unit.INSTANCE;
        }

        public static final Unit WPU(MainActivity mainActivity, String projectId, LM.aC importResult) {
            Intrinsics.checkNotNullParameter(projectId, "projectId");
            Intrinsics.checkNotNullParameter(importResult, "importResult");
            mainActivity.WPU(projectId, importResult);
            mainActivity.HFS().o();
            return Unit.INSTANCE;
        }

        public static final Unit XQ(MainActivity mainActivity, M.CN3 cn3, ComponentActivity it) {
            Intrinsics.checkNotNullParameter(it, "it");
            mainActivity.te(cn3);
            return Unit.INSTANCE;
        }

        public static final Unit Z(final MainActivity mainActivity, final M.CN3 tab) {
            Intrinsics.checkNotNullParameter(tab, "tab");
            mainActivity.Xli().r(new xAo.s4(tab), new Function1() { // from class: com.alightcreative.app.motion.activities.main.Dsr
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MainActivity.w6.XQ(mainActivity, tab, (ComponentActivity) obj);
                }
            });
            return Unit.INSTANCE;
        }

        public static final Unit nY(boolean z2, MainActivity mainActivity) {
            if (z2) {
                com.alightcreative.app.motion.activities.main.r rVarHFS = mainActivity.HFS();
                List listG = mainActivity.g();
                ArrayList arrayList = new ArrayList();
                for (Object obj : listG) {
                    if (!((ProjectInfo.n) obj).isTemplate()) {
                        arrayList.add(obj);
                    }
                }
                rVarHFS.iF(arrayList, new BitmapLruCache(0, "projectThumbnailCache", 1, null), mainActivity.S());
            } else {
                mainActivity.Co();
            }
            return Unit.INSTANCE;
        }

        public static final Unit o(MainActivity mainActivity, ProjectInfo.n it) {
            Intrinsics.checkNotNullParameter(it, "it");
            MainActivity.Yq(mainActivity, it, rWZ.eO.J2, null, 4, null);
            return Unit.INSTANCE;
        }

        public static final boolean r(vd vdVar, MainActivity mainActivity, ModalBottomSheetValue it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (it != ModalBottomSheetValue.f22291n) {
                return true;
            }
            GJW.C.nr(vdVar, null, null, new aC(mainActivity, null), 3, null);
            return true;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            ty((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        public final void ty(Composer composer, int i2) {
            List listG;
            if ((i2 & 3) == 2 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-1778790433, i2, -1, "com.alightcreative.app.motion.activities.main.MainActivity.addComposableContent.<anonymous> (MainActivity.kt:956)");
            }
            boolean zRl = MainActivity.this.kQ().rl(WK.Ml.f11456g);
            nYs.j jVarInvoke = MainActivity.this.lRt().invoke();
            final boolean z2 = true;
            M.CN3[] cn3Arr = (jVarInvoke == null || !jVarInvoke.xMQ()) ? new M.CN3[]{M.CN3.f6258r, M.CN3.f6257o, M.CN3.f6253S, M.CN3.f6256g} : new M.CN3[]{M.CN3.f6258r, M.CN3.f6254Z, M.CN3.f6253S, M.CN3.f6256g};
            if (MainActivity.this.sFO() == M.CN3.f6253S && MainActivity.this.n() == six.CN3.f73283r && ((listG = MainActivity.this.g()) == null || !listG.isEmpty())) {
                Iterator it = listG.iterator();
                while (it.hasNext()) {
                    if (!((ProjectInfo.n) it.next()).isTemplate()) {
                        break;
                    }
                }
                z2 = false;
            } else {
                z2 = false;
            }
            List listIk = MainActivity.this.Ik();
            M.CN3 cn3SFO = MainActivity.this.sFO();
            int i3 = z2 ? 2131232041 : 2131231634;
            composer.eF(1211561068);
            boolean zE2 = composer.E2(MainActivity.this);
            final MainActivity mainActivity = MainActivity.this;
            Object objIF = composer.iF();
            if (zE2 || objIF == Composer.INSTANCE.n()) {
                objIF = new Function1() { // from class: com.alightcreative.app.motion.activities.main.CN3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MainActivity.w6.Z(mainActivity, (M.CN3) obj);
                    }
                };
                composer.o(objIF);
            }
            Function1 function1 = (Function1) objIF;
            composer.Xw();
            composer.eF(1211567826);
            boolean zN = composer.n(z2) | composer.E2(MainActivity.this);
            final MainActivity mainActivity2 = MainActivity.this;
            Object objIF2 = composer.iF();
            if (zN || objIF2 == Composer.INSTANCE.n()) {
                objIF2 = new Function0() { // from class: com.alightcreative.app.motion.activities.main.o
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MainActivity.w6.nY(z2, mainActivity2);
                    }
                };
                composer.o(objIF2);
            }
            Function0 function0 = (Function0) objIF2;
            composer.Xw();
            composer.eF(1211584009);
            boolean zE22 = composer.E2(MainActivity.this);
            final MainActivity mainActivity3 = MainActivity.this;
            Object objIF3 = composer.iF();
            if (zE22 || objIF3 == Composer.INSTANCE.n()) {
                objIF3 = new Function0() { // from class: com.alightcreative.app.motion.activities.main.qz
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MainActivity.w6.g(mainActivity3);
                    }
                };
                composer.o(objIF3);
            }
            Function0 function02 = (Function0) objIF3;
            composer.Xw();
            composer.eF(1211586018);
            boolean zE23 = composer.E2(MainActivity.this);
            final MainActivity mainActivity4 = MainActivity.this;
            Object objIF4 = composer.iF();
            if (zE23 || objIF4 == Composer.INSTANCE.n()) {
                objIF4 = new Function0() { // from class: com.alightcreative.app.motion.activities.main.Pl
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MainActivity.w6.HI(mainActivity4);
                    }
                };
                composer.o(objIF4);
            }
            Function0 function03 = (Function0) objIF4;
            composer.Xw();
            composer.eF(1211587964);
            boolean zE24 = composer.E2(MainActivity.this);
            final MainActivity mainActivity5 = MainActivity.this;
            Object objIF5 = composer.iF();
            if (zE24 || objIF5 == Composer.INSTANCE.n()) {
                objIF5 = new Function0() { // from class: com.alightcreative.app.motion.activities.main.Xo
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MainActivity.w6.ck(mainActivity5);
                    }
                };
                composer.o(objIF5);
            }
            Function0 function04 = (Function0) objIF5;
            composer.Xw();
            composer.eF(1211591774);
            boolean zE25 = composer.E2(MainActivity.this);
            final MainActivity mainActivity6 = MainActivity.this;
            Object objIF6 = composer.iF();
            if (zE25 || objIF6 == Composer.INSTANCE.n()) {
                objIF6 = new Function0() { // from class: com.alightcreative.app.motion.activities.main.eO
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MainActivity.w6.Ik(mainActivity6);
                    }
                };
                composer.o(objIF6);
            }
            composer.Xw();
            z3w.rl(cn3Arr, listIk, cn3SFO, i3, zRl, function1, function0, function02, function03, function04, (Function0) objIF6, composer, 0, 0);
            Object objIF7 = composer.iF();
            Composer.Companion companion = Composer.INSTANCE;
            if (objIF7 == companion.n()) {
                objIF7 = EffectsKt.mUb(EmptyCoroutineContext.INSTANCE, composer);
                composer.o(objIF7);
            }
            final vd vdVar = (vd) objIF7;
            Density density = (Density) composer.ty(CompositionLocalsKt.J2());
            composer.eF(1211607737);
            final MainActivity mainActivity7 = MainActivity.this;
            Object objIF8 = composer.iF();
            if (objIF8 == companion.n()) {
                objIF8 = new ModalBottomSheetState(ModalBottomSheetValue.f22291n, density, new Function1() { // from class: com.alightcreative.app.motion.activities.main.z
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(MainActivity.w6.r(vdVar, mainActivity7, (ModalBottomSheetValue) obj));
                    }
                }, null, true, 8, null);
                composer.o(objIF8);
            }
            final ModalBottomSheetState modalBottomSheetState = (ModalBottomSheetState) objIF8;
            composer.Xw();
            com.alightcreative.app.motion.activities.main.SPz sPz = (com.alightcreative.app.motion.activities.main.SPz) LiveDataAdapterKt.n(MainActivity.this.HFS().t(), composer, 0).getValue();
            g9s.n nVarMPw = MainActivity.this.MPw();
            Object objHFS = MainActivity.this.HFS();
            composer.eF(1211637041);
            boolean zE26 = composer.E2(objHFS);
            Object objIF9 = composer.iF();
            if (zE26 || objIF9 == companion.n()) {
                objIF9 = new CN3(objHFS);
                composer.o(objIF9);
            }
            composer.Xw();
            Function0 function05 = (Function0) ((KFunction) objIF9);
            Object objHFS2 = MainActivity.this.HFS();
            composer.eF(1211639414);
            boolean zE27 = composer.E2(objHFS2);
            Object objIF10 = composer.iF();
            if (zE27 || objIF10 == companion.n()) {
                objIF10 = new fuX(objHFS2);
                composer.o(objIF10);
            }
            composer.Xw();
            Function1 function12 = (Function1) ((KFunction) objIF10);
            Object objHFS3 = MainActivity.this.HFS();
            composer.eF(1211641942);
            boolean zE28 = composer.E2(objHFS3);
            Object objIF11 = composer.iF();
            if (zE28 || objIF11 == companion.n()) {
                objIF11 = new Dsr(objHFS3);
                composer.o(objIF11);
            }
            composer.Xw();
            Function0 function06 = (Function0) ((KFunction) objIF11);
            Object objHFS4 = MainActivity.this.HFS();
            composer.eF(1211644734);
            boolean zE29 = composer.E2(objHFS4);
            Object objIF12 = composer.iF();
            if (zE29 || objIF12 == companion.n()) {
                objIF12 = new j(objHFS4);
                composer.o(objIF12);
            }
            composer.Xw();
            Function0 function07 = (Function0) ((KFunction) objIF12);
            Object objHFS5 = MainActivity.this.HFS();
            composer.eF(1211647609);
            boolean zE210 = composer.E2(objHFS5);
            Object objIF13 = composer.iF();
            if (zE210 || objIF13 == companion.n()) {
                objIF13 = new n(objHFS5);
                composer.o(objIF13);
            }
            composer.Xw();
            Function0 function08 = (Function0) ((KFunction) objIF13);
            Object objHFS6 = MainActivity.this.HFS();
            composer.eF(1211650296);
            boolean zE211 = composer.E2(objHFS6);
            Object objIF14 = composer.iF();
            if (zE211 || objIF14 == companion.n()) {
                objIF14 = new C0637w6(objHFS6);
                composer.o(objIF14);
            }
            composer.Xw();
            Function0 function09 = (Function0) ((KFunction) objIF14);
            Object objHFS7 = MainActivity.this.HFS();
            composer.eF(1211653150);
            boolean zE212 = composer.E2(objHFS7);
            Object objIF15 = composer.iF();
            if (zE212 || objIF15 == companion.n()) {
                objIF15 = new Ml(objHFS7);
                composer.o(objIF15);
            }
            Function0 function010 = (Function0) objIF15;
            composer.Xw();
            Object objHFS8 = MainActivity.this.HFS();
            composer.eF(1211656124);
            boolean zE213 = composer.E2(objHFS8);
            Object objIF16 = composer.iF();
            if (zE213 || objIF16 == companion.n()) {
                objIF16 = new I28(objHFS8);
                composer.o(objIF16);
            }
            composer.Xw();
            Function0 function011 = (Function0) ((KFunction) objIF16);
            composer.eF(1211659221);
            boolean zE214 = composer.E2(MainActivity.this);
            final MainActivity mainActivity8 = MainActivity.this;
            Object objIF17 = composer.iF();
            if (zE214 || objIF17 == companion.n()) {
                objIF17 = new Function1() { // from class: com.alightcreative.app.motion.activities.main.QJ
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MainActivity.w6.o(mainActivity8, (ProjectInfo.n) obj);
                    }
                };
                composer.o(objIF17);
            }
            composer.Xw();
            com.alightcreative.app.motion.activities.main.s4.rl(sPz, nVarMPw, modalBottomSheetState, function05, function12, function06, function07, function08, function09, function010, function011, (Function1) objIF17, composer, ModalBottomSheetState.f22280O << 6, 0);
            com.alightcreative.app.motion.activities.main.r rVarHFS = MainActivity.this.HFS();
            composer.eF(1211664477);
            boolean zE215 = composer.E2(MainActivity.this) | composer.E2(vdVar) | composer.E2(modalBottomSheetState);
            final MainActivity mainActivity9 = MainActivity.this;
            Object objIF18 = composer.iF();
            if (zE215 || objIF18 == companion.n()) {
                objIF18 = new Function1() { // from class: com.alightcreative.app.motion.activities.main.l3D
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MainActivity.w6.S(mainActivity9, vdVar, modalBottomSheetState, (InterfaceC1725c) obj);
                    }
                };
                composer.o(objIF18);
            }
            composer.Xw();
            uW.I28.rl(rVarHFS, (Function1) objIF18, composer, 0);
            l.Xo xo = (l.Xo) LiveDataAdapterKt.n(MainActivity.this.eb().t(), composer, 0).getValue();
            composer.eF(1211695732);
            if (xo instanceof Xo.n) {
                Xo.n nVar = (Xo.n) xo;
                okd.j jVarN = nVar.n();
                float fRl = nVar.rl();
                composer.eF(1211707120);
                boolean zE216 = composer.E2(MainActivity.this);
                final MainActivity mainActivity10 = MainActivity.this;
                Object objIF19 = composer.iF();
                if (zE216 || objIF19 == companion.n()) {
                    objIF19 = new Function0() { // from class: com.alightcreative.app.motion.activities.main.fuX
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MainActivity.w6.aYN(mainActivity10);
                        }
                    };
                    composer.o(objIF19);
                }
                composer.Xw();
                AbstractC2431fuX.nr(jVarN, fRl, (Function0) objIF19, composer, 0);
            }
            composer.Xw();
            l.CN3 cn3Eb = MainActivity.this.eb();
            composer.eF(1211715674);
            boolean zE217 = composer.E2(MainActivity.this);
            final MainActivity mainActivity11 = MainActivity.this;
            Object objIF20 = composer.iF();
            if (zE217 || objIF20 == companion.n()) {
                objIF20 = new Function1() { // from class: com.alightcreative.app.motion.activities.main.C
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MainActivity.w6.ViF(mainActivity11, (AbstractC2254j) obj);
                    }
                };
                composer.o(objIF20);
            }
            composer.Xw();
            uW.I28.rl(cn3Eb, (Function1) objIF20, composer, 0);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        public static final Unit HI(MainActivity mainActivity) {
            mainActivity.N();
            return Unit.INSTANCE;
        }

        public static final Unit Ik(MainActivity mainActivity) {
            ProjectInfo.n nVar = (ProjectInfo.n) CollectionsKt.firstOrNull(mainActivity.Ik());
            if (nVar != null) {
                CN3.j.n(mainActivity, six.Dsr.n(nVar.getType(), nVar.rl()), null, 2, null);
            }
            return Unit.INSTANCE;
        }

        public static final Unit aYN(MainActivity mainActivity) {
            String uid = mainActivity.YiW().getUid();
            if (uid != null) {
                mainActivity.eb().nY(uid);
            }
            return Unit.INSTANCE;
        }

        public static final Unit ck(MainActivity mainActivity) {
            ProjectInfo.n nVar = (ProjectInfo.n) CollectionsKt.firstOrNull(mainActivity.Ik());
            if (nVar != null) {
                CN3.j.rl(mainActivity, nVar.getType(), null, 2, null);
            }
            return Unit.INSTANCE;
        }

        public static final Unit g(MainActivity mainActivity) {
            mainActivity.T();
            return Unit.INSTANCE;
        }
    }

    public static final class z extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Function0 f45401n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f45402t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f45401n = function0;
            this.f45402t = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f45401n;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f45402t.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public static final void GHt() {
        System.exit(0);
        throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
    }

    public static final String d(Scene scene, int i2) {
        String title = scene.getTitle();
        if (i2 == 1) {
            return title + " Copy";
        }
        return title + " Copy " + i2;
    }

    private final boolean ex(int actionId) {
        SJ0.UGc uGc = null;
        switch (actionId) {
            case 2131361850:
                SJ0.UGc uGc2 = this.binding;
                if (uGc2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    uGc = uGc2;
                }
                uGc.xMQ.KN();
                Pair[] pairArr = (Pair[]) Arrays.copyOf(new Pair[0], 0);
                Intent intent = new Intent(this, (Class<?>) AboutActivity.class);
                intent.putExtras(BundleKt.n((Pair[]) Arrays.copyOf(pairArr, pairArr.length)));
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this, intent);
                return true;
            case 2131361852:
                SJ0.UGc uGc3 = this.binding;
                if (uGc3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    uGc = uGc3;
                }
                uGc.xMQ.KN();
                Pair[] pairArr2 = (Pair[]) Arrays.copyOf(new Pair[0], 0);
                Intent intent2 = new Intent(this, (Class<?>) DevSettingsActivity.class);
                intent2.putExtras(BundleKt.n((Pair[]) Arrays.copyOf(pairArr2, pairArr2.length)));
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this, intent2);
                return true;
            case 2131361942:
                SJ0.UGc uGc4 = this.binding;
                if (uGc4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    uGc = uGc4;
                }
                uGc.xMQ.KN();
                Pair[] pairArr3 = (Pair[]) Arrays.copyOf(new Pair[0], 0);
                Intent intent3 = new Intent(this, (Class<?>) MyAccountActivity.class);
                intent3.putExtras(BundleKt.n((Pair[]) Arrays.copyOf(pairArr3, pairArr3.length)));
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this, intent3);
                return true;
            case 2131361943:
                SJ0.UGc uGc5 = this.binding;
                if (uGc5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    uGc5 = null;
                }
                uGc5.xMQ.KN();
                OpenSourceLibrariesActivity.Companion.rl(OpenSourceLibrariesActivity.INSTANCE, this, null, 2, null);
                return true;
            case 2131361952:
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this, new Intent("android.intent.action.VIEW", Uri.parse("https://alightcreative.com/privacy/")));
                return true;
            case 2131361967:
                SJ0.UGc uGc6 = this.binding;
                if (uGc6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    uGc = uGc6;
                }
                uGc.xMQ.KN();
                Pair[] pairArr4 = (Pair[]) Arrays.copyOf(new Pair[0], 0);
                Intent intent4 = new Intent(this, (Class<?>) SettingsActivity.class);
                intent4.putExtras(BundleKt.n((Pair[]) Arrays.copyOf(pairArr4, pairArr4.length)));
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this, intent4);
                return true;
            case 2131361975:
                PJ9.DAz.E2(this, null, 1, null);
                return true;
            case 2131361976:
                PJ9.DAz.T(fq());
                return true;
            case 2131361986:
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this, new Intent("android.intent.action.VIEW", Uri.parse("https://www.alightcreative.com/tos")));
                return true;
            case 2131361991:
                SJ0.UGc uGc7 = this.binding;
                if (uGc7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    uGc = uGc7;
                }
                uGc.xMQ.KN();
                Pair[] pairArr5 = (Pair[]) Arrays.copyOf(new Pair[0], 0);
                Intent intent5 = new Intent(this, (Class<?>) TutorialActivity.class);
                intent5.putExtras(BundleKt.n((Pair[]) Arrays.copyOf(pairArr5, pairArr5.length)));
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this, intent5);
                return true;
            default:
                return false;
        }
    }

    public static final void lS(DialogInterface dialogInterface, int i2) {
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        p0.startActivity(p1);
    }

    @Override // com.alightcreative.app.motion.activities.main.I28, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) throws IllegalAccessException, InvocationTargetException {
        KDyatQ.PBSlRS.invoke(null, this, savedInstanceState);
    }

    @Override // com.alightcreative.app.motion.activities.main.I28, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() throws IllegalAccessException, InvocationTargetException {
        xkISd.nEMxZtIktN.invoke(null, this);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() throws IllegalAccessException, InvocationTargetException {
        KDyatQ.ZMClKvQ.invoke(null, this);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() throws IllegalAccessException, InvocationTargetException {
        OAxfmSwmk.DBkyctLEdU.invoke(null, this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStart() throws IllegalAccessException, InvocationTargetException {
        KDyatQ.EYOFMHHoF.invoke(null, this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStop() throws IllegalAccessException, InvocationTargetException {
        KDyatQ.AWYoSThvOO.invoke(null, this);
    }

    static final class CN3 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f45365n;

        public CN3(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return MainActivity.this.new CN3(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((CN3) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f45365n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                Q.Xo xoV5F = MainActivity.this.V5F();
                this.f45365n = 1;
                if (xoV5F.n(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    static final class Ml extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Object f45368n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f45369t;

        public Ml(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return MainActivity.this.new Ml(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((Ml) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List list;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f45369t;
            if (i2 != 0) {
                if (i2 == 1) {
                    list = (List) this.f45368n;
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                List listIk = MainActivity.this.Ik();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listIk, 10));
                Iterator it = listIk.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ProjectInfo.n) it.next()).getId());
                }
                xhQ.Ml mlYA = MainActivity.this.yA();
                this.f45368n = arrayList;
                this.f45369t = 1;
                obj = mlYA.n(arrayList, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                list = arrayList;
            }
            MainActivity.this.C7B().nr(MainActivity.this, list, (List) obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
    static final class Wre extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public final /* synthetic */ String f45376O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f45377n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Wre(String str, Continuation continuation) {
            super(2, continuation);
            this.f45376O = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return MainActivity.this.new Wre(this.f45376O, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((Wre) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f45377n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                this.f45377n = 1;
                if (yg.rl(2000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            MainActivity.this.fq().n(new j.iy(this.f45376O));
            return Unit.INSTANCE;
        }
    }

    static final class fuX extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f45383n;

        public fuX(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return MainActivity.this.new fuX(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((fuX) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f45383n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                GJW.r rVar = MainActivity.this.codecCheckComplete;
                this.f45383n = 1;
                if (rVar.await(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            MainActivity.this.jX().o();
            return Unit.INSTANCE;
        }
    }

    static final class qz extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f45389n;

        public qz(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return MainActivity.this.new qz(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((qz) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
        
            if (Eu.Wre.n(r1, r5, r4) == r0) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
        
            if (r5.ty(r4) == r0) goto L23;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Eu.I28 i28;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f45389n;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        ResultKt.throwOnFailure(obj);
                        Unit unit = Unit.INSTANCE;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                }
            } else {
                ResultKt.throwOnFailure(obj);
                nYs.j jVarInvoke = MainActivity.this.lRt().invoke();
                if (jVarInvoke != null && jVarInvoke.Xw()) {
                    if (com.alightcreative.app.motion.persist.j.INSTANCE.isFirstSession()) {
                        i28 = Eu.I28.f2378O;
                    } else {
                        i28 = Eu.I28.J2;
                    }
                    InterfaceC2210n interfaceC2210nC = MainActivity.this.c();
                    this.f45389n = 1;
                } else {
                    xAo.I28.o(MainActivity.this.Xli(), M.f75263n, null, 2, null);
                    xAo.I28 i28Xli = MainActivity.this.Xli();
                    this.f45389n = 2;
                }
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    private final void A(String projectId) {
        if (projectId == null) {
            Iterator it = Ik().iterator();
            while (it.hasNext()) {
                GWY.j.t(this, ((ProjectInfo.n) it.next()).getId());
            }
            lvn(CollectionsKt.emptyList());
        } else {
            GWY.j.t(this, projectId);
        }
        az();
    }

    public static final Unit Bha(MainActivity mainActivity, List localProjects) {
        int i2;
        Intrinsics.checkNotNullParameter(localProjects, "localProjects");
        mainActivity.ENe(localProjects);
        com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
        List listG = mainActivity.g();
        int i3 = 0;
        if (listG == null || !listG.isEmpty()) {
            Iterator it = listG.iterator();
            i2 = 0;
            while (it.hasNext()) {
                if (((ProjectInfo.n) it.next()).getType() == SceneType.ELEMENT && (i2 = i2 + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        } else {
            i2 = 0;
        }
        jVar.setLastSeenElementCount(i2);
        com.alightcreative.app.motion.persist.j jVar2 = com.alightcreative.app.motion.persist.j.INSTANCE;
        List listG2 = mainActivity.g();
        if (listG2 == null || !listG2.isEmpty()) {
            Iterator it2 = listG2.iterator();
            while (it2.hasNext()) {
                if (((ProjectInfo.n) it2.next()).getType() == SceneType.SCENE && (i3 = i3 + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        jVar2.setLastSeenProjectCount(i3);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(localProjects, 10));
        Iterator it3 = localProjects.iterator();
        while (it3.hasNext()) {
            arrayList.add(((ProjectInfo.n) it3.next()).getTitle());
        }
        mainActivity.Ai(CollectionsKt.toSet(arrayList));
        return Unit.INSTANCE;
    }

    public static final void CU(final MKd mKd, final MainActivity mainActivity, View view) {
        com.alightcreative.app.motion.persist.j.INSTANCE.setUseFirebaseEmulator(false);
        mKd.az.setVisibility(8);
        mKd.iF.setVisibility(0);
        mKd.ty.postDelayed(new Runnable() { // from class: KC.tI
            @Override // java.lang.Runnable
            public final void run() {
                MainActivity.Ep(this.f5236n, mKd);
            }
        }, 30L);
    }

    public static final void DtL(MainActivity mainActivity, CompoundButton compoundButton, boolean z2) {
        Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
        com.alightcreative.app.motion.persist.j.INSTANCE.setUserDemoMode(z2);
        if (z2) {
            new AlertDialog.Builder(mainActivity).o(2132017672).Uo(2132017673).setPositiveButton(2132017378, new DialogInterface.OnClickListener() { // from class: KC.hQ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    MainActivity.Pzf(dialogInterface, i2);
                }
            }).create().show();
        }
    }

    private final void F6W(M.CN3 cn3) {
        this.selectedTab.setValue(cn3);
    }

    private final void GN() {
        Set<String> installedAppVersions = com.alightcreative.app.motion.persist.j.INSTANCE.getInstalledAppVersions();
        if ((installedAppVersions instanceof Collection) && installedAppVersions.isEmpty()) {
            return;
        }
        Iterator<T> it = installedAppVersions.iterator();
        while (it.hasNext()) {
            if (StringsKt.startsWith$default((String) it.next(), "3.", false, 2, (Object) null)) {
                if (StringsKt.startsWith$default("5.0.273.1028425", "4.", false, 2, (Object) null)) {
                    com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
                    if (jVar.getShowNewFeaturePopup()) {
                        return;
                    }
                    Pair[] pairArr = (Pair[]) Arrays.copyOf(new Pair[0], 0);
                    Intent intent = new Intent(this, (Class<?>) NewFeaturePagerActivity.class);
                    intent.putExtras(BundleKt.n((Pair[]) Arrays.copyOf(pairArr, pairArr.length)));
                    safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this, intent);
                    jVar.setShowNewFeaturePopup(true);
                    return;
                }
                return;
            }
        }
    }

    public static final void H6M(MainActivity mainActivity, final com.alightcreative.account.o purchaseState) {
        Intrinsics.checkNotNullParameter(purchaseState, "purchaseState");
        if (!mainActivity.isPaused) {
            mainActivity.YiW().HI(mainActivity);
        }
        XoT.C.Uo(mainActivity, new Function0() { // from class: KC.rv6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MainActivity.YE(purchaseState);
            }
        });
    }

    public static final Unit HE(Function1 function1, MainActivity mainActivity, Function1 function12, UO6.w6 w6Var, ComponentActivity componentActivity, boolean z2) {
        Intrinsics.checkNotNullParameter(componentActivity, "<unused var>");
        if (!z2) {
            function1.invoke(mainActivity);
            return Unit.INSTANCE;
        }
        ProjectInfo.n nVar = (ProjectInfo.n) CollectionsKt.singleOrNull(mainActivity.Ik());
        if (nVar != null) {
            Scene sceneUnserializeScene$default = (Scene) CollectionsKt.firstOrNull(mainActivity.scenes);
            if (sceneUnserializeScene$default == null) {
                sceneUnserializeScene$default = SceneSerializerKt.unserializeScene$default(FilesKt.readText$default(HI0.afx.o(mainActivity, nVar.getId()), null, 1, null), false, false, false, 14, null);
            }
            Scene scene = sceneUnserializeScene$default;
            Scene sceneCopy$default = Scene.copy$default(scene, null, 0, 0, 0, 0, 0, null, UO6.iF.n(scene.getFramesPerHundredSeconds(), w6Var.nr()), null, null, null, null, null, 0, 0, 0, false, 0L, null, null, 1048447, null);
            if (w6Var.t() == j.fuX.f45850n) {
                UUID uuidFromString = UUID.fromString(nVar.getId());
                Intrinsics.checkNotNullExpressionValue(uuidFromString, "fromString(...)");
                ExportParams exportParamsExportParamsImageSeqInZip$default = SceneExporterKt.exportParamsImageSeqInZip$default(scene, w6Var, 0, 0, 0, Bitmap.CompressFormat.PNG, 0, 46, null);
                String string = mainActivity.getResources().getString(2132019051);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                String string2 = mainActivity.getResources().getString(2132020151);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                Qk.r.ViF(mainActivity, sceneCopy$default, null, uuidFromString, exportParamsExportParamsImageSeqInZip$default, "zip", "application/zip", string, string2, SceneKt.getSha1(scene), mainActivity.fq(), mainActivity.gxH().rl(nVar.getId()), mainActivity.Xli(), (rWZ.n) CollectionsKt.firstOrNull(mainActivity.snapshots));
            } else if (w6Var.t() == j.fuX.f45852t) {
                UUID uuidFromString2 = UUID.fromString(nVar.getId());
                Intrinsics.checkNotNullExpressionValue(uuidFromString2, "fromString(...)");
                ExportParams exportParamsExportParamsImageSeqInZip$default2 = SceneExporterKt.exportParamsImageSeqInZip$default(scene, w6Var, 0, 0, 0, Bitmap.CompressFormat.JPEG, 0, 46, null);
                String string3 = mainActivity.getResources().getString(2132019051);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                String string4 = mainActivity.getResources().getString(2132020151);
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                Qk.r.ViF(mainActivity, sceneCopy$default, null, uuidFromString2, exportParamsExportParamsImageSeqInZip$default2, "zip", "application/zip", string3, string4, SceneKt.getSha1(scene), mainActivity.fq(), mainActivity.gxH().rl(nVar.getId()), mainActivity.Xli(), (rWZ.n) CollectionsKt.firstOrNull(mainActivity.snapshots));
            }
        }
        mainActivity.T();
        function12.invoke(mainActivity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.alightcreative.app.motion.activities.main.r HFS() {
        return (com.alightcreative.app.motion.activities.main.r) this.bottomSheetViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Hq() {
        SJ0.UGc uGc = this.binding;
        SJ0.UGc uGc2 = null;
        if (uGc == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            uGc = null;
        }
        uGc.f9367t.setOnClickListener(new View.OnClickListener() { // from class: KC.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.p(this.f5182n, view);
            }
        });
        SJ0.UGc uGc3 = this.binding;
        if (uGc3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            uGc3 = null;
        }
        uGc3.f9361O.setOnClickListener(new View.OnClickListener() { // from class: KC.K
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.ep(this.f5083n, view);
            }
        });
        SJ0.UGc uGc4 = this.binding;
        if (uGc4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            uGc4 = null;
        }
        uGc4.nr.setOnClickListener(new View.OnClickListener() { // from class: KC.Md
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.X6(this.f5098n, view);
            }
        });
        SJ0.UGc uGc5 = this.binding;
        if (uGc5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            uGc5 = null;
        }
        uGc5.gh.setNavigationItemSelectedListener(new NavigationView.Ml() { // from class: KC.Zs
            @Override // com.google.android.material.navigation.NavigationView.Ml
            public final boolean n(MenuItem menuItem) {
                return MainActivity.fwz(this.f5162n, menuItem);
            }
        });
        SJ0.UGc uGc6 = this.binding;
        if (uGc6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            uGc2 = uGc6;
        }
        uGc2.ty.r();
    }

    public static final void NQ2(MainActivity mainActivity, MKd mKd, View view) {
        com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
        Mgn.j audioResamplerType = jVar.getAudioResamplerType();
        Mgn.j jVar2 = Mgn.j.f6648n;
        if (audioResamplerType != jVar2) {
            jVar.setAudioResamplerType(jVar2);
            iF iFVarFq = mainActivity.fq();
            Bundle bundle = new Bundle();
            bundle.putString("ui_type", l.aa);
            bundle.putString("algorithm", "neighbor");
            Unit unit = Unit.INSTANCE;
            iFVarFq.n(new j.fuX("audio_resampler_set", bundle));
        }
        mKd.J2.setActivated(true);
        mKd.nr.setActivated(false);
        mKd.KN.setActivated(false);
    }

    public static final Unit NUo(MainActivity mainActivity, ProjectInfo.n nVar, rWZ.eO eOVar, DialogInterface it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.dismiss();
        mainActivity.R3E(nVar, eOVar, Boolean.FALSE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q(final MKd hdrBinding) {
        TextView textView = hdrBinding.f9210S;
        Map map = n1;
        com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
        String str = (String) map.get(Integer.valueOf(jVar.getDefaultLayerDuration()));
        if (str == null) {
            str = "2s";
        }
        textView.setText(str);
        hdrBinding.f9210S.setOnClickListener(new View.OnClickListener() { // from class: KC.Sis
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.sYH(this.f5146n, hdrBinding, view);
            }
        });
        if (hdrBinding.fD.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.LayoutParams layoutParams = hdrBinding.fD.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int identifier = getResources().getIdentifier("status_bar_height", "dimen", AppLovinBridge.f61290h);
            if (identifier > 0) {
                marginLayoutParams.topMargin = getResources().getDimensionPixelSize(identifier);
                hdrBinding.fD.setLayoutParams(marginLayoutParams);
            }
        }
        hdrBinding.nY.setChecked(jVar.getLowQualityPreview());
        hdrBinding.nY.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: KC.gnv
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                MainActivity.eF0(compoundButton, z2);
            }
        });
        hdrBinding.mUb.setChecked(jVar.getUserDemoMode());
        hdrBinding.mUb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: KC.fg
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                MainActivity.DtL(this.f5172n, compoundButton, z2);
            }
        });
        hdrBinding.J2.setActivated(jVar.getAudioResamplerType() == Mgn.j.f6648n);
        hdrBinding.nr.setActivated(jVar.getAudioResamplerType() == Mgn.j.f6646O);
        hdrBinding.KN.setActivated(jVar.getAudioResamplerType() == Mgn.j.J2);
        hdrBinding.J2.setOnClickListener(new View.OnClickListener() { // from class: KC.KH
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.NQ2(this.f5084n, hdrBinding, view);
            }
        });
        hdrBinding.nr.setOnClickListener(new View.OnClickListener() { // from class: KC.Mf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.aJ(this.f5099n, hdrBinding, view);
            }
        });
        hdrBinding.KN.setOnClickListener(new View.OnClickListener() { // from class: KC.o7q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.taU(this.f5218n, hdrBinding, view);
            }
        });
        hdrBinding.rl.setOnClickListener(new View.OnClickListener() { // from class: KC.xZD
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.pt(this.f5245n, view);
            }
        });
        WT();
        hdrBinding.f9216g.setOnClickListener(new View.OnClickListener() { // from class: KC.M5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.Rf(this.f5096n, view);
            }
        });
        hdrBinding.ck.setOnClickListener(new View.OnClickListener() { // from class: KC.QaP
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.vMk(this.f5131n, view);
            }
        });
        hdrBinding.wTp.setOnClickListener(new View.OnClickListener() { // from class: KC.FKk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.z51(this.f5071n, view);
            }
        });
        hdrBinding.f9219r.setOnClickListener(new View.OnClickListener() { // from class: KC.l4Z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.tzr(this.f5199n, view);
            }
        });
        hdrBinding.Xw.setOnClickListener(new View.OnClickListener() { // from class: KC.mz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.q8(this.f5211n, view);
            }
        });
        hdrBinding.f9211T.setOnClickListener(new View.OnClickListener() { // from class: KC.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.cJ(this.f5223n, view);
            }
        });
        hdrBinding.qie.setOnClickListener(new View.OnClickListener() { // from class: KC.O
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.zv(this.f5104n, view);
            }
        });
        hdrBinding.ty.setOnClickListener(new View.OnClickListener() { // from class: KC.LEl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.CU(hdrBinding, this, view);
            }
        });
    }

    private final void Qg8(Intent intent) {
        if (intent.hasExtra("main_tab_ordinal")) {
            te(M.CN3.values()[intent.getIntExtra("main_tab_ordinal", 0)]);
        }
    }

    private final void R3E(final ProjectInfo.n projectInfo, final rWZ.eO requestTriggerPoint, final Boolean overwritePrevious) {
        PJ9.DAz.G7(this, new Function0() { // from class: KC.qYU
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MainActivity.G(this.f5227n, projectInfo, requestTriggerPoint, overwritePrevious);
            }
        });
    }

    public static final void Rc(MainActivity mainActivity, AlertDialog alertDialog, View view) {
        mainActivity.te(M.CN3.f6253S);
        alertDialog.dismiss();
    }

    public static final Unit Tuk(Function2 function2, MainActivity mainActivity, ComponentActivity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function2.invoke(mainActivity, Boolean.TRUE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UR(final Uri linkUri, final Function2 onImportComplete) {
        XoT.fuX.nY(this, new Function0() { // from class: KC.IG
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MainActivity.W5k(this.f5081n, linkUri, onImportComplete);
            }
        });
    }

    public static final Unit VmZ(DialogInterface it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.dismiss();
        return Unit.INSTANCE;
    }

    public static final Unit W5k(MainActivity mainActivity, Uri uri, Function2 function2) {
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        nYs.j jVarInvoke = mainActivity.lRt().invoke();
        Fg.afx.ViF(mainActivity, intent, true, jVarInvoke != null && jVarInvoke.te(), mainActivity.fq(), mainActivity.YiW(), mainActivity.Xli(), (64 & 64) != 0 ? false : false, function2, mainActivity.c(), mainActivity.lRt());
        return Unit.INSTANCE;
    }

    public static final Unit WKb(MainActivity mainActivity, g9s g9sVar) {
        if (Intrinsics.areEqual(g9sVar, g9s.j.f45438n)) {
            SJ0.UGc uGc = mainActivity.binding;
            if (uGc == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                uGc = null;
            }
            RelativeLayout setupOverlay = uGc.az;
            Intrinsics.checkNotNullExpressionValue(setupOverlay, "setupOverlay");
            eVj.aC.Uo(setupOverlay, 0L, null, 3, null);
        } else if (Intrinsics.areEqual(g9sVar, g9s.n.f45439n)) {
            mainActivity.VK2();
        } else if (g9sVar != null) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }

    public static final String YE(com.alightcreative.account.o oVar) {
        return "onPurchaseStateChanged: " + oVar;
    }

    public static final Unit YnA(MainActivity mainActivity, List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        XoT.C.Uo(mainActivity, new Function0() { // from class: KC.crp
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MainActivity.hr();
            }
        });
        if (!Intrinsics.areEqual(VisualEffectKt.getEffectSig(), EffectDigestKt.EXPECTED_EFFECT_DIGEST)) {
            XoT.C.nr("Got effect sig: " + VisualEffectKt.getEffectSig());
            HI0.qz.nr(null, SPz.f45374n, 1, null);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void Yq(MainActivity mainActivity, ProjectInfo.n nVar, rWZ.eO eOVar, Boolean bool, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            bool = null;
        }
        mainActivity.R3E(nVar, eOVar, bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ZZU() {
        M.CN3 cn3 = M.CN3.f6258r;
        SJ0.UGc uGc = this.binding;
        SJ0.UGc uGc2 = null;
        if (uGc == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            uGc = null;
        }
        FrameLayout tabHome = uGc.HI;
        Intrinsics.checkNotNullExpressionValue(tabHome, "tabHome");
        Pair pair = TuplesKt.to(cn3, new Z(tabHome, new Function0() { // from class: KC.P
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MainActivity.rqO(this.f5109n);
            }
        }));
        M.CN3 cn32 = M.CN3.f6254Z;
        SJ0.UGc uGc3 = this.binding;
        if (uGc3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            uGc3 = null;
        }
        FrameLayout tabRanking = uGc3.Ik;
        Intrinsics.checkNotNullExpressionValue(tabRanking, "tabRanking");
        Pair pair2 = TuplesKt.to(cn32, new Z(tabRanking, new Function0() { // from class: KC.m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MainActivity.x8();
            }
        }));
        M.CN3 cn33 = M.CN3.f6257o;
        SJ0.UGc uGc4 = this.binding;
        if (uGc4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            uGc4 = null;
        }
        FrameLayout tabTutorial = uGc4.f9365o;
        Intrinsics.checkNotNullExpressionValue(tabTutorial, "tabTutorial");
        Pair pair3 = TuplesKt.to(cn33, new Z(tabTutorial, new Function0() { // from class: KC.iF
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MainActivity.xJ();
            }
        }));
        M.CN3 cn34 = M.CN3.f6256g;
        SJ0.UGc uGc5 = this.binding;
        if (uGc5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            uGc5 = null;
        }
        FrameLayout tabTemplates = uGc5.f9366r;
        Intrinsics.checkNotNullExpressionValue(tabTemplates, "tabTemplates");
        Pair pair4 = TuplesKt.to(cn34, new Z(tabTemplates, new Function0() { // from class: KC.yg
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MainActivity.zB(this.f5249n);
            }
        }));
        M.CN3 cn35 = M.CN3.f6253S;
        SJ0.UGc uGc6 = this.binding;
        if (uGc6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            uGc2 = uGc6;
        }
        FrameLayout tabProjects = uGc2.ck;
        Intrinsics.checkNotNullExpressionValue(tabProjects, "tabProjects");
        this.tabs = MapsKt.mapOf(pair, pair2, pair3, pair4, TuplesKt.to(cn35, new Z(tabProjects, new Function0() { // from class: KC.pO
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MainActivity.g7();
            }
        })));
    }

    public static final Unit ZwA(MainActivity mainActivity, com.alightcreative.app.motion.activities.main.Wre action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof Wre.n) {
            s6u.O(mainActivity);
        } else if (Intrinsics.areEqual(action, Wre.w6.f45424n)) {
            mainActivity.onboardingLauncher.t();
        } else {
            SJ0.UGc uGc = null;
            if (Intrinsics.areEqual(action, Wre.C0639Wre.f45421n)) {
                SJ0.UGc uGc2 = mainActivity.binding;
                if (uGc2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    uGc = uGc2;
                }
                uGc.az.setBackgroundColor(mainActivity.getColor(2131099836));
                s6u.HI(mainActivity);
            } else {
                if (Intrinsics.areEqual(action, Wre.CN3.f45418n)) {
                    SJ0.UGc uGc3 = mainActivity.binding;
                    if (uGc3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        uGc = uGc3;
                    }
                    uGc.az.setBackgroundColor(mainActivity.getColor(2131100619));
                    s6u.ck(mainActivity, true);
                } else if (Intrinsics.areEqual(action, Wre.Ml.f45420n)) {
                    SJ0.UGc uGc4 = mainActivity.binding;
                    if (uGc4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        uGc = uGc4;
                    }
                    uGc.az.setBackgroundColor(mainActivity.getColor(2131099811));
                    nYs.j jVarInvoke = mainActivity.lRt().invoke();
                    s6u.J2(mainActivity, jVarInvoke != null && jVarInvoke.jB());
                } else if (Intrinsics.areEqual(action, Wre.I28.f45419n)) {
                    mainActivity.eOa();
                } else {
                    if (!Intrinsics.areEqual(action, Wre.j.f45422n)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    mainActivity.hu();
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static final void aJ(MainActivity mainActivity, MKd mKd, View view) {
        com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
        Mgn.j audioResamplerType = jVar.getAudioResamplerType();
        Mgn.j jVar2 = Mgn.j.f6646O;
        if (audioResamplerType != jVar2) {
            jVar.setAudioResamplerType(jVar2);
            iF iFVarFq = mainActivity.fq();
            Bundle bundle = new Bundle();
            bundle.putString("ui_type", "high");
            bundle.putString("algorithm", "sinc_low");
            Unit unit = Unit.INSTANCE;
            iFVarFq.n(new j.fuX("audio_resampler_set", bundle));
        }
        mKd.J2.setActivated(false);
        mKd.nr.setActivated(true);
        mKd.KN.setActivated(false);
    }

    public static final CharSequence bZm(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return "• " + it;
    }

    public static final Unit c2(MKd mKd, Map.Entry entry) {
        mKd.f9210S.setText((CharSequence) entry.getValue());
        com.alightcreative.app.motion.persist.j.INSTANCE.setDefaultLayerDuration(((Number) entry.getKey()).intValue());
        return Unit.INSTANCE;
    }

    public static final Unit c32(Function1 function1, MainActivity mainActivity, Function1 function12, UO6.w6 w6Var, ComponentActivity componentActivity, boolean z2) {
        Intrinsics.checkNotNullParameter(componentActivity, "<unused var>");
        if (!z2) {
            function1.invoke(mainActivity);
            return Unit.INSTANCE;
        }
        ProjectInfo.n nVar = (ProjectInfo.n) CollectionsKt.singleOrNull(mainActivity.Ik());
        if (nVar != null) {
            Scene sceneUnserializeScene$default = (Scene) CollectionsKt.firstOrNull(mainActivity.scenes);
            if (sceneUnserializeScene$default == null) {
                sceneUnserializeScene$default = SceneSerializerKt.unserializeScene$default(FilesKt.readText$default(HI0.afx.o(mainActivity, nVar.getId()), null, 1, null), false, false, false, 14, null);
            }
            Scene scene = sceneUnserializeScene$default;
            Scene sceneCopy$default = Scene.copy$default(scene, null, 0, 0, 0, 0, 0, null, UO6.iF.n(scene.getFramesPerHundredSeconds(), w6Var.nr()), null, null, null, null, null, 0, 0, 0, false, 0L, null, null, 1048447, null);
            UUID uuidFromString = UUID.fromString(nVar.getId());
            Intrinsics.checkNotNullExpressionValue(uuidFromString, "fromString(...)");
            ExportParams exportParamsExportParamsGif$default = SceneExporterKt.exportParamsGif$default(scene, w6Var, 0, 0, 0, 14, null);
            String string = mainActivity.getResources().getString(2132019050);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            String string2 = mainActivity.getResources().getString(2132020149);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            Qk.r.ViF(mainActivity, sceneCopy$default, null, uuidFromString, exportParamsExportParamsGif$default, "gif", "image/gif", string, string2, SceneKt.getSha1(scene), mainActivity.fq(), mainActivity.gxH().rl(nVar.getId()), mainActivity.Xli(), (rWZ.n) CollectionsKt.firstOrNull(mainActivity.snapshots));
        }
        mainActivity.T();
        function12.invoke(mainActivity);
        return Unit.INSTANCE;
    }

    public static final Unit cAB(com.alightcreative.widget.fuX it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.o();
        return Unit.INSTANCE;
    }

    public static final void cB(MainActivity mainActivity, View view) {
        SJ0.UGc uGc = mainActivity.binding;
        if (uGc == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            uGc = null;
        }
        uGc.xMQ.KN();
        s6u.ck(mainActivity, false);
    }

    public static final void cJ(MainActivity mainActivity, View view) {
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(mainActivity, new Intent("android.intent.action.VIEW", Uri.parse("https://tiktok.com/@alightmotion")));
    }

    public static final void eF0(CompoundButton compoundButton, boolean z2) {
        Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
        com.alightcreative.app.motion.persist.j.INSTANCE.setLowQualityPreview(z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l.CN3 eb() {
        return (l.CN3) this.cloudBackupViewModel.getValue();
    }

    private final void eo() {
        HI0.qz.nr(null, new Function0() { // from class: KC.Fl
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MainActivity.uQ();
            }
        }, 1, null).Uo(new Function1() { // from class: KC.R6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainActivity.wKY(this.f5143n, (List) obj);
            }
        });
    }

    public static final Unit fW(Function1 function1, MainActivity mainActivity, Function1 function12, UO6.w6 w6Var, boolean z2, ComponentActivity componentActivity, boolean z3) {
        ExportedVideoAttachment exportedVideoAttachmentHI;
        rWZ.n nVar;
        SceneThumbnailMaker sceneThumbnailMaker;
        Intrinsics.checkNotNullParameter(componentActivity, "<unused var>");
        if (!z3) {
            function1.invoke(mainActivity);
            return Unit.INSTANCE;
        }
        ProjectInfo.n nVar2 = (ProjectInfo.n) CollectionsKt.singleOrNull(mainActivity.Ik());
        if (nVar2 != null) {
            VideoEncoding videoEncoding = w6Var.rl() == j.Pl.f45834n ? VideoEncoding.AVC : VideoEncoding.HEVC;
            Scene sceneUnserializeScene$default = (Scene) CollectionsKt.firstOrNull(mainActivity.scenes);
            if (sceneUnserializeScene$default == null) {
                sceneUnserializeScene$default = SceneSerializerKt.unserializeScene$default(FilesKt.readText$default(HI0.afx.o(mainActivity, nVar2.getId()), null, 1, null), false, false, false, 14, null);
            }
            Scene scene = sceneUnserializeScene$default;
            Scene sceneCopy$default = Scene.copy$default(scene, null, 0, 0, 0, 0, 0, null, UO6.iF.n(scene.getFramesPerHundredSeconds(), w6Var.nr()), null, null, null, null, null, 0, 0, 0, false, 0L, null, null, 1048447, null);
            int iMin = Math.min(w6Var.J2(), w6Var.O());
            int iMin2 = Math.min(scene.getWidth(), scene.getHeight());
            int iN = UO6.n.n(((scene.getWidth() * iMin) / iMin2) * ((scene.getHeight() * iMin) / iMin2), UO6.iF.n(scene.getFramesPerHundredSeconds(), w6Var.nr()) / 100, w6Var);
            if (z2) {
                nYs.j jVarInvoke = mainActivity.lRt().invoke();
                if (jVarInvoke == null || (exportedVideoAttachmentHI = jVarInvoke.HI()) == null) {
                    exportedVideoAttachmentHI = ExportedVideoAttachment.NONE;
                }
                ExportedVideoAttachment exportedVideoAttachment = exportedVideoAttachmentHI;
                UUID uuidFromString = UUID.fromString(nVar2.getId());
                Intrinsics.checkNotNullExpressionValue(uuidFromString, "fromString(...)");
                ExportParams exportParamsExportParamsVideo$default = SceneExporterKt.exportParamsVideo$default(scene, w6Var, 0, 0, 0, 0, iN, 0, 0, videoEncoding, Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE, null);
                iF iFVarFq = mainActivity.fq();
                kgE.fuX fuxYiW = mainActivity.YiW();
                cBL.j jVarRl = mainActivity.gxH().rl(nVar2.getId());
                rWZ.n nVar3 = (rWZ.n) CollectionsKt.firstOrNull(mainActivity.snapshots);
                rWZ.n nVar4 = mainActivity.templateToggleExportSnapshot;
                if (nVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("templateToggleExportSnapshot");
                    nVar = null;
                } else {
                    nVar = nVar4;
                }
                SceneThumbnailMaker sceneThumbnailMaker2 = mainActivity.shareThumbnailMaker;
                if (sceneThumbnailMaker2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("shareThumbnailMaker");
                    sceneThumbnailMaker = null;
                } else {
                    sceneThumbnailMaker = sceneThumbnailMaker2;
                }
                gIX.afx.t(mainActivity, sceneCopy$default, null, uuidFromString, exportParamsExportParamsVideo$default, iFVarFq, fuxYiW, jVarRl, nVar3, nVar, sceneThumbnailMaker, exportedVideoAttachment);
            } else {
                UUID uuidFromString2 = UUID.fromString(nVar2.getId());
                Intrinsics.checkNotNullExpressionValue(uuidFromString2, "fromString(...)");
                ExportParams exportParamsExportParamsVideo$default2 = SceneExporterKt.exportParamsVideo$default(scene, w6Var, 0, 0, 0, 0, iN, 0, 0, videoEncoding, Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE, null);
                String string = mainActivity.getResources().getString(2132019052);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                String string2 = mainActivity.getResources().getString(2132020154);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                Qk.r.ViF(mainActivity, sceneCopy$default, null, uuidFromString2, exportParamsExportParamsVideo$default2, com.safedk.android.utils.n.f63223d, "video/mp4", string, string2, SceneKt.getSha1(scene), mainActivity.fq(), mainActivity.gxH().rl(nVar2.getId()), mainActivity.Xli(), (rWZ.n) CollectionsKt.firstOrNull(mainActivity.snapshots));
            }
        }
        mainActivity.T();
        function12.invoke(mainActivity);
        return Unit.INSTANCE;
    }

    public static final boolean fwz(MainActivity mainActivity, MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return mainActivity.ex(item.getItemId());
    }

    public static final Fragment g7() {
        return new Sis();
    }

    private final void iu(Intent intent) {
        qf qfVarRl;
        String action = intent.getAction();
        if (action != null) {
            int iHashCode = action.hashCode();
            SJ0.UGc uGc = null;
            if (iHashCode == -72545060) {
                if (action.equals("com.alightcreative.app.motion.action.OPEN_TRIAL_DIALOG")) {
                    int intExtra = intent.getIntExtra("numAdsToWatch", 0);
                    int intExtra2 = intent.getIntExtra("numAdsWatched", 0);
                    Xo.Companion jVar = xhQ.Xo.INSTANCE;
                    FragmentManager supportFragmentManager = getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                    SJ0.UGc uGc2 = this.binding;
                    if (uGc2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        uGc = uGc2;
                    }
                    int id = uGc.mUb.getId();
                    List listIk = Ik();
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listIk, 10));
                    Iterator it = listIk.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((ProjectInfo.n) it.next()).getId());
                    }
                    jVar.n(supportFragmentManager, id, arrayList, intExtra2, intExtra);
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
                if (Ik().size() > 1) {
                    Iterator it2 = Ik().iterator();
                    long jN = 0;
                    while (it2.hasNext()) {
                        jN += ((ProjectInfo.n) it2.next()).n();
                    }
                    Iterator it3 = Ik().iterator();
                    long fileSize = 0;
                    while (it3.hasNext()) {
                        fileSize += ((ProjectInfo.n) it3.next()).getFileSize();
                    }
                    List listIk2 = Ik();
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listIk2, 10));
                    Iterator it4 = listIk2.iterator();
                    while (it4.hasNext()) {
                        arrayList2.add(((ProjectInfo.n) it4.next()).getId());
                    }
                    qfVarRl = qf.Companion.rl(qf.INSTANCE, null, false, CollectionsKt.arrayListOf(2131361971, 2131361970, 2131361920), getResources().getDimensionPixelOffset(2131165478), fileSize, jN, arrayList2, true, 1, null);
                } else if (Ik().size() != 1) {
                    return;
                } else {
                    qfVarRl = qf.Companion.rl(qf.INSTANCE, ((ProjectInfo.n) Ik().get(0)).getId(), false, CollectionsKt.arrayListOf(2131361919, 2131361915, 2131361916, 2131361971, 2131361970, 2131361994, 2131361920), 0, 0L, 0L, null, false, 248, null);
                }
                SJ0.UGc uGc3 = this.binding;
                if (uGc3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    uGc = uGc3;
                }
                fragmentTransactionO.rl(uGc.mUb.getId(), qfVarRl).KN("ExportListFrag").mUb();
            }
        }
    }

    public static final Unit jE(MainActivity mainActivity, final com.alightcreative.app.motion.activities.main.w6 elementLibrary) {
        Intrinsics.checkNotNullParameter(elementLibrary, "elementLibrary");
        XoT.C.Uo(mainActivity, new Function0() { // from class: KC.kO4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MainActivity.kC(elementLibrary);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ci jX() {
        return (ci) this.viewModel.getValue();
    }

    public static final Unit kR(ProjectInfo.n nVar, MainActivity mainActivity, Scene scene, ComponentActivity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        boolean z2 = nVar.isTemplate() && mainActivity.h(mainActivity.lRt());
        String string = nVar.isTemplate() ? GWY.j.O(mainActivity, scene).toString() : nVar.getId();
        Intrinsics.checkNotNull(string);
        String strRl = nVar.rl();
        String str = "";
        if (strRl != null) {
            Fg.CN3 cn3P5 = Fg.afx.p5(strRl);
            String strN = cn3P5 != null ? cn3P5.n() : null;
            if (strN != null) {
                str = strN;
            }
        }
        mainActivity.yUZ(zd.w6.nr(mainActivity, string), str, string, nVar.getType(), z2, j.w6.f75491n);
        return Unit.INSTANCE;
    }

    public static final Unit kW(MainActivity mainActivity, ProjectInfo.n nVar, rWZ.eO eOVar, DialogInterface it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.dismiss();
        mainActivity.R3E(nVar, eOVar, Boolean.TRUE);
        return Unit.INSTANCE;
    }

    public static final Unit l2(Function1 function1, MainActivity mainActivity, Function1 function12, ComponentActivity componentActivity, boolean z2) {
        Intrinsics.checkNotNullParameter(componentActivity, "<unused var>");
        if (!z2) {
            function1.invoke(mainActivity);
            return Unit.INSTANCE;
        }
        List listIk = mainActivity.Ik();
        iF iFVarFq = mainActivity.fq();
        kgE.fuX fuxYiW = mainActivity.YiW();
        List list = mainActivity.scenes;
        List list2 = mainActivity.snapshots;
        SceneThumbnailMaker sceneThumbnailMaker = mainActivity.shareThumbnailMaker;
        if (sceneThumbnailMaker == null) {
            Intrinsics.throwUninitializedPropertyAccessException("shareThumbnailMaker");
            sceneThumbnailMaker = null;
        }
        gIX.Dsr.mUb(mainActivity, listIk, iFVarFq, fuxYiW, list, list2, sceneThumbnailMaker, false, 64, null);
        mainActivity.T();
        function12.invoke(mainActivity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void lH() {
        HI0.qz.nr(null, new Function0() { // from class: KC.vd
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MainActivity.Pn();
            }
        }, 1, null).Uo(new Function1() { // from class: KC.Lu
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainActivity.YnA(this.f5094n, (List) obj);
            }
        });
    }

    public static final CharSequence mx(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return "• " + it;
    }

    public static final void q8(MainActivity mainActivity, View view) {
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(mainActivity, new Intent("android.intent.action.VIEW", Uri.parse("https://www.youtube.com/alightmotion")));
    }

    public static final Unit q9(MainActivity mainActivity, ComponentActivity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mainActivity.pE();
        return Unit.INSTANCE;
    }

    private final void rT(ProjectInfo.n projectInfo) {
        if (projectInfo == null) {
            Iterator it = Ik().iterator();
            while (it.hasNext()) {
                qva(((ProjectInfo.n) it.next()).getId());
            }
        } else {
            qva(projectInfo.getId());
        }
        az();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final M.CN3 sFO() {
        return (M.CN3) this.selectedTab.getValue();
    }

    public static final void sYH(MainActivity mainActivity, final MKd mKd, View view) {
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        nKK nkk = new nKK(context, mainActivity.YiW(), false);
        nkk.X(view.getWidth());
        for (final Map.Entry entry : n1.entrySet()) {
            nKK.ck(nkk, (String) entry.getValue(), null, com.alightcreative.app.motion.persist.j.INSTANCE.getDefaultLayerDuration() == ((Number) entry.getKey()).intValue(), null, new Function0() { // from class: KC.U4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MainActivity.c2(mKd, entry);
                }
            }, 10, null);
        }
        Intrinsics.checkNotNull(view);
        nKK.N(nkk, view, 0, 0, null, 14, null);
    }

    private final void stS() {
        new R6(this).mUb(2132019855).nr(2132017603).Uo(2132017378, new Function1() { // from class: KC.dT
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainActivity.VmZ((DialogInterface) obj);
            }
        }).gh();
    }

    public static final void t1J(MainActivity mainActivity, com.google.firebase.remoteconfig.j jVar, final Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        XoT.C.Uo(mainActivity, new Function0() { // from class: KC.DC
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MainActivity.GH3(task);
            }
        });
        if (task.isSuccessful()) {
            jVar.Uo();
        }
    }

    public static final void taU(MainActivity mainActivity, MKd mKd, View view) {
        com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
        Mgn.j audioResamplerType = jVar.getAudioResamplerType();
        Mgn.j jVar2 = Mgn.j.J2;
        if (audioResamplerType != jVar2) {
            jVar.setAudioResamplerType(jVar2);
            iF iFVarFq = mainActivity.fq();
            Bundle bundle = new Bundle();
            bundle.putString("ui_type", "ultra");
            bundle.putString("algorithm", "sinc_mid");
            Unit unit = Unit.INSTANCE;
            iFVarFq.n(new j.fuX("audio_resampler_set", bundle));
        }
        mKd.J2.setActivated(false);
        mKd.nr.setActivated(false);
        mKd.KN.setActivated(true);
    }

    public static final void tzr(MainActivity mainActivity, View view) {
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(mainActivity, new Intent("android.intent.action.VIEW", Uri.parse("https://www.instagram.com/alightmotion")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w(FirebaseAuth auth) {
        SJ0.UGc uGc = this.binding;
        SJ0.UGc uGc2 = null;
        if (uGc == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            uGc = null;
        }
        MKd mKdN = MKd.n(uGc.gh.ty(0));
        Intrinsics.checkNotNullExpressionValue(mKdN, "bind(...)");
        mKdN.ty.setVisibility(IvA.n.rl().getUsingFirebaseEmulator() ? 0 : 8);
        if (com.alightcreative.app.motion.persist.j.INSTANCE.getUseFirebaseEmulator()) {
            mKdN.az.setVisibility(0);
            mKdN.iF.setVisibility(8);
        } else {
            mKdN.az.setVisibility(8);
            mKdN.iF.setVisibility(0);
        }
        FirebaseUser firebaseUserXMQ = auth.xMQ();
        if (firebaseUserXMQ == null) {
            SJ0.UGc uGc3 = this.binding;
            if (uGc3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                uGc3 = null;
            }
            ((Jff.j) uGc3.WPU.getHierarchy()).Z(2131231479);
            SJ0.UGc uGc4 = this.binding;
            if (uGc4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                uGc2 = uGc4;
            }
            uGc2.WPU.setActualImageResource(2131231479);
            mKdN.qie.setVisibility(8);
        } else {
            SJ0.UGc uGc5 = this.binding;
            if (uGc5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                uGc5 = null;
            }
            ((Jff.j) uGc5.WPU.getHierarchy()).Z(2131231478);
            SJ0.UGc uGc6 = this.binding;
            if (uGc6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                uGc6 = null;
            }
            uGc6.WPU.gh(firebaseUserXMQ.getPhotoUrl(), null);
            mKdN.qie.setVisibility(wQ.j.n(auth) ? 0 : 8);
        }
        eb().ViF(auth);
    }

    public static final Unit wKY(final MainActivity mainActivity, final List loadErrors) throws afx {
        Intrinsics.checkNotNullParameter(loadErrors, "loadErrors");
        if (!loadErrors.isEmpty()) {
            if (System.currentTimeMillis() >= 1607601600000L) {
                throw new afx("Preset load errors: " + CollectionsKt.joinToString$default(loadErrors, "; ", null, null, 0, null, null, 62, null));
            }
            AlertDialog alertDialogCreate = new AlertDialog.Builder(mainActivity).setTitle("Error loading presets").KN(CollectionsKt.joinToString$default(loadErrors, "\n", null, null, 0, null, new Function1() { // from class: KC.RGN
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MainActivity.mx((String) obj);
                }
            }, 30, null)).ck("Copy to Clipboard", new DialogInterface.OnClickListener() { // from class: KC.xuv
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    MainActivity.lS(dialogInterface, i2);
                }
            }).setNegativeButton(2132017436, new DialogInterface.OnClickListener() { // from class: KC.c7r
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    MainActivity.iV(dialogInterface, i2);
                }
            }).create();
            alertDialogCreate.show();
            alertDialogCreate.xMQ(-1).setOnClickListener(new View.OnClickListener() { // from class: KC.t
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainActivity.I4p(this.f5233n, loadErrors, view);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final Fragment x8() {
        return new Ogx();
    }

    public static final Fragment xJ() {
        return new M.xTb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void xSy(final ProjectInfo.n projectInfo, final rWZ.eO requestTriggerPoint) {
        new R6(this).mUb(2132020394).nr(2132020391).xMQ(2132020393, new Function1() { // from class: KC.h6y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainActivity.kW(this.f5184n, projectInfo, requestTriggerPoint, (DialogInterface) obj);
            }
        }).J2(2132020392, new Function1() { // from class: KC.lS
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainActivity.NUo(this.f5201n, projectInfo, requestTriggerPoint, (DialogInterface) obj);
            }
        }).gh();
    }

    public static final void z51(MainActivity mainActivity, View view) {
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(mainActivity, new Intent(obbPUqyhtS.HQAW, Uri.parse("https://www.twitter.com/alightcreative")));
    }

    public void Ai(Set set) {
        Intrinsics.checkNotNullParameter(set, "<set-?>");
        this.projectTitles = set;
    }

    public final xAo.qf C7B() {
        xAo.qf qfVar = this.exportProFeatureManager;
        if (qfVar != null) {
            return qfVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("exportProFeatureManager");
        return null;
    }

    @Override // UO6.qf.n
    public void E2(int id, final UO6.w6 exportInfo, final boolean isTemplateToggledOn, final Function1 onSuccess, final Function1 onFailure) {
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFailure, "onFailure");
        this.scenes.clear();
        this.snapshots.clear();
        Iterator it = Ik().iterator();
        while (true) {
            rWZ.n nVar = null;
            if (!it.hasNext()) {
                break;
            }
            ProjectInfo.n nVar2 = (ProjectInfo.n) it.next();
            File fileO = HI0.afx.o(this, nVar2.getId());
            Scene sceneUnserializeScene$default = SceneSerializerKt.unserializeScene$default(FilesKt.readText$default(fileO, null, 1, null), false, false, false, 14, null);
            String id2 = nVar2.getId();
            Context applicationContext = getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            rWZ.n nVarNr = rWZ.Wre.nr(id, id2, fileO, sceneUnserializeScene$default, applicationContext, exportInfo, YiW(), isTemplateToggledOn);
            this.scenes.add(sceneUnserializeScene$default);
            this.snapshots.add(nVarNr);
            fq().n(new j.YzO(nVarNr));
            if (isTemplateToggledOn) {
                String id3 = nVar2.getId();
                Context applicationContext2 = getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
                this.templateToggleExportSnapshot = rWZ.Wre.nr(2131361971, id3, fileO, sceneUnserializeScene$default, applicationContext2, exportInfo, YiW(), true);
                iF iFVarFq = fq();
                rWZ.n nVar3 = this.templateToggleExportSnapshot;
                if (nVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("templateToggleExportSnapshot");
                } else {
                    nVar = nVar3;
                }
                iFVarFq.n(new j.YzO(nVar));
            }
        }
        switch (id) {
            case 2131361915:
                if (exportInfo != null) {
                    Mfw(DAz.f75219S, new Function2() { // from class: KC.L0y
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return MainActivity.c32(onFailure, this, onSuccess, exportInfo, (ComponentActivity) obj, ((Boolean) obj2).booleanValue());
                        }
                    });
                } else {
                    onFailure.invoke(this);
                }
                break;
            case 2131361916:
                if (exportInfo != null) {
                    Mfw(DAz.f75223o, new Function2() { // from class: KC.cA
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return MainActivity.HE(onFailure, this, onSuccess, exportInfo, (ComponentActivity) obj, ((Boolean) obj2).booleanValue());
                        }
                    });
                } else {
                    onFailure.invoke(this);
                }
                break;
            case 2131361919:
                if (exportInfo != null) {
                    Mfw(DAz.f75224r, new Function2() { // from class: KC.g9
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return MainActivity.fW(onFailure, this, onSuccess, exportInfo, isTemplateToggledOn, (ComponentActivity) obj, ((Boolean) obj2).booleanValue());
                        }
                    });
                } else {
                    onFailure.invoke(this);
                }
                break;
            case 2131361920:
                lK.n.rl(this, Ik(), fq(), this.scenes, this.snapshots);
                Iterator<Integer> it2 = CollectionsKt.getIndices(Ik()).iterator();
                while (it2.hasNext()) {
                    rWZ.n nVar4 = (rWZ.n) CollectionsKt.getOrNull(this.snapshots, ((IntIterator) it2).nextInt());
                    if (nVar4 != null) {
                        fq().n(new j.M5(nVar4, false, 2, null));
                    }
                }
                T();
                onSuccess.invoke(this);
                break;
            case 2131361970:
                fq().n(new j.fuX("projectlist_export_click_package", null, 2, null));
                Mfw(DAz.f75225t, new Function2() { // from class: KC.CM
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return MainActivity.l2(onFailure, this, onSuccess, (ComponentActivity) obj, ((Boolean) obj2).booleanValue());
                    }
                });
                break;
            case 2131361971:
                fq().n(new j.fuX("projectlist_export_click_template", null, 2, null));
                List listIk = Ik();
                iF iFVarFq2 = fq();
                kgE.fuX fuxYiW = YiW();
                List list = this.scenes;
                List list2 = this.snapshots;
                SceneThumbnailMaker sceneThumbnailMaker = this.shareThumbnailMaker;
                if (sceneThumbnailMaker == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("shareThumbnailMaker");
                    sceneThumbnailMaker = null;
                }
                gIX.Dsr.xMQ(this, listIk, iFVarFq2, fuxYiW, list, list2, sceneThumbnailMaker, true);
                T();
                onSuccess.invoke(this);
                break;
            case 2131361994:
                fq().n(new j.fuX("projectlist_export_click_cloud", null, 2, null));
                rWZ.eO eOVar = getSupportFragmentManager().xg(2131362764) != null ? rWZ.eO.f73082n : rWZ.eO.f73081O;
                ProjectInfo.n nVar5 = (ProjectInfo.n) CollectionsKt.firstOrNull(Ik());
                if (nVar5 != null) {
                    Yq(this, nVar5, eOVar, null, 4, null);
                }
                T();
                onSuccess.invoke(this);
                break;
        }
    }

    public void ENe(List list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.allLocalProjects.setValue(list);
    }

    @Override // Vi.CN3
    public List Ik() {
        return (List) this._selectedProjects.getValue();
    }

    public final Zs.n JI() {
        Zs.n nVar = this.showAdMobCMPPopupIfNeededUseCase;
        if (nVar != null) {
            return nVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("showAdMobCMPPopupIfNeededUseCase");
        return null;
    }

    @Override // Vi.Wre
    public void KN(Uri linkUri) {
        Intrinsics.checkNotNullParameter(linkUri, "linkUri");
        UR(linkUri, new I28(this));
    }

    public final g9s.n MPw() {
        g9s.n nVar = this.premadeContentViewModelFactory;
        if (nVar != null) {
            return nVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("premadeContentViewModelFactory");
        return null;
    }

    @Override // ka.fuX
    public void O(boolean isBlacklisted) {
        if (isBlacklisted) {
            stS();
        } else {
            HFS().WPU();
        }
    }

    public final cKn.Wre Of6() {
        cKn.Wre wre = this.theirs;
        if (wre != null) {
            return wre;
        }
        Intrinsics.throwUninitializedPropertyAccessException("theirs");
        return null;
    }

    @Override // Vi.CN3
    public SceneThumbnailMaker S() {
        SceneThumbnailMaker sceneThumbnailMaker = this.thumbnailMaker;
        if (sceneThumbnailMaker != null) {
            return sceneThumbnailMaker;
        }
        Intrinsics.throwUninitializedPropertyAccessException("thumbnailMaker");
        return null;
    }

    public final mD.j Sax() {
        mD.j jVar = this.installSecretMenuUseCase;
        if (jVar != null) {
            return jVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("installSecretMenuUseCase");
        return null;
    }

    public final Dm5.n TVk() {
        Dm5.n nVar = this.forceUpdater;
        if (nVar != null) {
            return nVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("forceUpdater");
        return null;
    }

    public final Q.Xo V5F() {
        Q.Xo xo = this.rewardedAdUnlockUseCase;
        if (xo != null) {
            return xo;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rewardedAdUnlockUseCase");
        return null;
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

    @Override // Vi.CN3
    public void WPU(String projectPackageId, LM.aC importResult) {
        Intrinsics.checkNotNullParameter(projectPackageId, "projectPackageId");
        Intrinsics.checkNotNullParameter(importResult, "importResult");
        for (UUID uuid : importResult.O()) {
            com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
            jVar.setImportedProjectIds(SetsKt.plus(jVar.getImportedProjectIds(), uuid.toString()));
            iF iFVarFq = fq();
            String string = uuid.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            iFVarFq.n(new j.ya(string, projectPackageId, SceneType.SCENE));
        }
        for (UUID uuid2 : importResult.t()) {
            com.alightcreative.app.motion.persist.j jVar2 = com.alightcreative.app.motion.persist.j.INSTANCE;
            jVar2.setImportedProjectIds(SetsKt.plus(jVar2.getImportedProjectIds(), uuid2.toString()));
            iF iFVarFq2 = fq();
            String string2 = uuid2.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            iFVarFq2.n(new j.ya(string2, projectPackageId, SceneType.ELEMENT));
        }
        for (UUID uuid3 : importResult.nr()) {
            com.alightcreative.app.motion.persist.j jVar3 = com.alightcreative.app.motion.persist.j.INSTANCE;
            jVar3.setImportedProjectIds(SetsKt.plus(jVar3.getImportedProjectIds(), uuid3.toString()));
            iF iFVarFq3 = fq();
            String string3 = uuid3.toString();
            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
            iFVarFq3.n(new j.ya(string3, projectPackageId, SceneType.PRESET));
        }
        tdZ(projectPackageId, importResult);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        FragmentTransaction fragmentTransactionO = supportFragmentManager.o();
        Fragment fragmentPJg = getSupportFragmentManager().pJg("StoriesFragment");
        if (fragmentPJg != null) {
            fragmentTransactionO.r(fragmentPJg);
        }
        Fragment fragmentPJg2 = getSupportFragmentManager().pJg("ReelsFragment");
        if (fragmentPJg2 != null) {
            fragmentTransactionO.r(fragmentPJg2);
        }
        fragmentTransactionO.gh();
    }

    @Override // KC.rrk
    public void XQ(int scrollY) {
        SJ0.UGc uGc = this.binding;
        if (uGc == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            uGc = null;
        }
        uGc.f9362S.setVisibility(scrollY == 0 ? 4 : 0);
    }

    /* JADX INFO: renamed from: XUb, reason: from getter */
    public M.CN3 getOnResumeSelectTab() {
        return this.onResumeSelectTab;
    }

    public final xAo.I28 Xli() {
        xAo.I28 i28 = this.crisperManager;
        if (i28 != null) {
            return i28;
        }
        Intrinsics.throwUninitializedPropertyAccessException("crisperManager");
        return null;
    }

    public final kgE.fuX YiW() {
        kgE.fuX fux = this.iapManager;
        if (fux != null) {
            return fux;
        }
        Intrinsics.throwUninitializedPropertyAccessException("iapManager");
        return null;
    }

    @Override // Vi.Dsr
    public void az() {
        this.projectListRefresher.nr();
    }

    public final InterfaceC2210n c() {
        InterfaceC2210n interfaceC2210n = this.injet;
        if (interfaceC2210n != null) {
            return interfaceC2210n;
        }
        Intrinsics.throwUninitializedPropertyAccessException("injet");
        return null;
    }

    public void f11(final ProjectInfo.n project) {
        String str;
        Intrinsics.checkNotNullParameter(project, "project");
        if (!HI0.afx.o(this, project.getId()).exists()) {
            new fuX.j(this).t(2132019969).J2(2132017378, new Function1() { // from class: KC.FPL
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MainActivity.cAB((com.alightcreative.widget.fuX) obj);
                }
            }).n().nHg();
            return;
        }
        try {
            final Scene sceneUnserializeScene$default = SceneSerializerKt.unserializeScene$default(FilesKt.readText$default(HI0.afx.o(this, project.getId()), null, 1, null), false, false, false, 14, null);
            iF iFVarFq = fq();
            int i2 = n.$EnumSwitchMapping$1[project.getType().ordinal()];
            QmE.j m8hVar = (i2 == 1 || i2 != 2) ? new j.m8h(project.getId()) : new j.Mf(project.getId());
            iFVarFq.n(m8hVar);
            Xli().r(xAo.ci.f75274n, new Function1() { // from class: KC.Y5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MainActivity.kR(project, this, sceneUnserializeScene$default, (ComponentActivity) obj);
                }
            });
        } catch (MalformedSceneException e2) {
            if (YiW().rl()) {
                str = "\n\n" + e2.getLocalizedMessage();
            } else {
                str = "";
            }
            HI0.fuX.xMQ(this, QiDPjiOCZHDS.KHcSPLFgLwJr, "This file is in an unrecognized format or contains features not supported by the current version of Alight Motion.\n\nThis can happen if the file was tampered with by an external application, otherwise damaged in some way, or edited with an unsupported version of Alight Motion." + str, null, 4, null);
        }
    }

    @Override // M.V1
    public void fD(M.CN3 cn3) {
        this.onResumeSelectTab = cn3;
    }

    public final iF fq() {
        iF iFVar = this.eventLogger;
        if (iFVar != null) {
            return iFVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    @Override // Vi.Dsr
    public List g() {
        return (List) this.allLocalProjects.getValue();
    }

    public final fVJ.w6 gxH() {
        fVJ.w6 w6Var = this.getWatermarkOptionsUseCase;
        if (w6Var != null) {
            return w6Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("getWatermarkOptionsUseCase");
        return null;
    }

    public final WK.I28 kQ() {
        WK.I28 i28 = this.newFeatureManager;
        if (i28 != null) {
            return i28;
        }
        Intrinsics.throwUninitializedPropertyAccessException("newFeatureManager");
        return null;
    }

    public final nYs.Ml lRt() {
        nYs.Ml ml = this.getAlightSettingsUseCase;
        if (ml != null) {
            return ml;
        }
        Intrinsics.throwUninitializedPropertyAccessException("getAlightSettingsUseCase");
        return null;
    }

    public void lvn(List value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this._selectedProjects.setValue(value);
        i7();
    }

    @Override // M.Um
    public six.CN3 n() {
        return (six.CN3) this.selectedSubTab.getValue();
    }

    public final InterfaceC2413n n7u() {
        InterfaceC2413n interfaceC2413n = this.getMonorepoLibUseCase;
        if (interfaceC2413n != null) {
            return interfaceC2413n;
        }
        Intrinsics.throwUninitializedPropertyAccessException("getMonorepoLibUseCase");
        return null;
    }

    @Override // Vi.CN3
    public void nr(ProjectInfo project) {
        Intrinsics.checkNotNullParameter(project, "project");
        if (!(project instanceof ProjectInfo.n)) {
            if (!(project instanceof ProjectInfo.j)) {
                throw new NoWhenBranchMatchedException();
            }
        } else if (Ik().isEmpty()) {
            f11((ProjectInfo.n) project);
        } else {
            ty((ProjectInfo.n) project);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 4000) {
            if (resultCode == -1) {
                ex(2131361942);
            }
        } else if (requestCode != 12003) {
            super.onActivityResult(requestCode, resultCode, data);
        } else if (resultCode != -1) {
            fq().n(new j.J(Scopes.EMAIL, null));
        } else {
            GJW.C.nr(LifecycleOwnerKt.n(this), null, null, new Wre(Scopes.EMAIL, null), 3, null);
            ex(2131361942);
        }
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    protected void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        nYs.j jVarInvoke = lRt().invoke();
        boolean z2 = jVarInvoke != null && jVarInvoke.X();
        nYs.j jVarInvoke2 = lRt().invoke();
        Fg.afx.ViF(this, intent, z2, jVarInvoke2 != null && jVarInvoke2.te(), fq(), YiW(), Xli(), (64 & 64) != 0 ? false : false, new aC(this), c(), lRt());
        l(intent);
        iu(intent);
        Qg8(intent);
    }

    public void q(SceneThumbnailMaker sceneThumbnailMaker) {
        Intrinsics.checkNotNullParameter(sceneThumbnailMaker, "<set-?>");
        this.thumbnailMaker = sceneThumbnailMaker;
    }

    @Override // Vi.CN3
    public void r(six.fuX projectType, final ProjectInfo.n project) {
        int i2;
        String strRl;
        Intrinsics.checkNotNullParameter(projectType, "projectType");
        int i3 = n.$EnumSwitchMapping$0[projectType.ordinal()];
        if (i3 == 1) {
            i2 = 2131886089;
        } else if (i3 == 2) {
            i2 = 2131886088;
        } else if (i3 == 3) {
            i2 = 2131886087;
        } else {
            if (i3 != 4) {
                if (i3 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
            i2 = 2131886123;
        }
        int size = project == null ? Ik().size() : 1;
        if (project == null || (strRl = project.getTitle()) == null) {
            List listIk = Ik();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listIk, 10));
            Iterator it = listIk.iterator();
            while (it.hasNext()) {
                arrayList.add(((ProjectInfo.n) it.next()).getTitle());
            }
            strRl = GWY.j.rl(arrayList, 15, null, null, 12, null);
        }
        new AlertDialog.Builder(this).setTitle(getResources().getQuantityString(i2, size, Integer.valueOf(size))).KN(strRl).mUb(getString(2132017396), new DialogInterface.OnClickListener() { // from class: KC.V1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i5) {
                MainActivity.WH(dialogInterface, i5);
            }
        }).ck(getString(2132017650), new DialogInterface.OnClickListener() { // from class: KC.oXP
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i5) {
                MainActivity.oz(this.f5221n, project, dialogInterface, i5);
            }
        }).nr(2131231021).create().show();
    }

    public final CZF.I28 rR() {
        CZF.I28 i28 = this.pico;
        if (i28 != null) {
            return i28;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pico");
        return null;
    }

    @Override // Vi.CN3
    public void rl(SceneType selectedSceneType, final ProjectInfo.n project) {
        String strRl;
        Intrinsics.checkNotNullParameter(selectedSceneType, "selectedSceneType");
        int i2 = selectedSceneType == SceneType.SCENE ? 2131886092 : 2131886090;
        int size = project == null ? Ik().size() : 1;
        if (project == null || (strRl = project.getTitle()) == null) {
            List listIk = Ik();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listIk, 10));
            Iterator it = listIk.iterator();
            while (it.hasNext()) {
                arrayList.add(((ProjectInfo.n) it.next()).getTitle());
            }
            strRl = GWY.j.rl(arrayList, 15, null, null, 12, null);
        }
        new AlertDialog.Builder(this).setTitle(getResources().getQuantityString(i2, size, Integer.valueOf(size))).KN(strRl).mUb(getString(2132017396), new DialogInterface.OnClickListener() { // from class: KC.Pmq
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                MainActivity.L(dialogInterface, i3);
            }
        }).ck(getString(2132017711), new DialogInterface.OnClickListener() { // from class: KC.mrQ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                MainActivity.Lu(this.f5209n, project, dialogInterface, i3);
            }
        }).nr(2131231471).create().show();
    }

    @Override // M.Um
    public void s7N(six.CN3 cn3) {
        Intrinsics.checkNotNullParameter(cn3, "<set-?>");
        this.selectedSubTab.setValue(cn3);
    }

    @Override // M.V1
    public void te(M.CN3 tab) {
        Intrinsics.checkNotNullParameter(tab, "tab");
        fq().n(new j.C1439dc(tab));
        nYs.j jVarInvoke = lRt().invoke();
        if (jVarInvoke != null && jVarInvoke.U()) {
            int i2 = n.$EnumSwitchMapping$2[tab.ordinal()];
            QmE.j jVar = i2 != 1 ? i2 != 2 ? null : QmE.UGc.f8358n : QmE.qf.f8614n;
            if (jVar != null) {
                fq().n(jVar);
            }
        }
        T();
        Map map = this.tabs;
        if (map == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tabs");
            map = null;
        }
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((Z) it.next()).n().setVisibility(4);
        }
        F6W(tab);
        Map map2 = this.tabs;
        if (map2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tabs");
            map2 = null;
        }
        Z z2 = (Z) map2.get(tab);
        if (z2 == null) {
            return;
        }
        z2.n().setVisibility(0);
        if (z2.rl() == null) {
            FragmentTransaction fragmentTransactionO = getSupportFragmentManager().o();
            Intrinsics.checkNotNullExpressionValue(fragmentTransactionO, "beginTransaction(...)");
            Fragment fragmentPJg = getSupportFragmentManager().pJg(sFO().name());
            if (fragmentPJg != null) {
                fragmentTransactionO.r(fragmentPJg);
            }
            Fragment fragment = (Fragment) z2.t().invoke();
            fragmentTransactionO.t(z2.n().getId(), fragment, sFO().name()).qie();
            z2.nr(fragment);
        }
        SJ0.UGc uGc = this.binding;
        if (uGc == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            uGc = null;
        }
        uGc.xMQ.setBackgroundColor(getColor(2131100619));
        hu();
        if (tab == M.CN3.f6256g && NC9()) {
            com.alightcreative.app.motion.persist.j.INSTANCE.setShowNewTagForTemplates(false);
        }
        ActivityResultCaller activityResultCallerRl = z2.rl();
        KC.g9s g9sVar = activityResultCallerRl instanceof KC.g9s ? (KC.g9s) activityResultCallerRl : null;
        if (g9sVar != null) {
            g9sVar.Uo();
        }
    }

    @Override // Vi.CN3
    public void ty(ProjectInfo.n project) {
        Intrinsics.checkNotNullParameter(project, "project");
        lvn(Ik().contains(project) ? CollectionsKt.minus(Ik(), project) : CollectionsKt.plus((Collection<? extends ProjectInfo.n>) Ik(), project));
    }

    public void u2n(PJ9.Ml ml) {
        Intrinsics.checkNotNullParameter(ml, "<set-?>");
        this.signInLauncher = ml;
    }

    @Override // Vi.CN3
    /* JADX INFO: renamed from: v, reason: from getter */
    public Set getProjectTitles() {
        return this.projectTitles;
    }

    @Override // M.Um
    public void wTp(six.CN3 cn3) {
        this.onResumeSelectSubTab = cn3;
    }

    public final Q.fuX wYi() {
        Q.fuX fux = this.featureUnlockManager;
        if (fux != null) {
            return fux;
        }
        Intrinsics.throwUninitializedPropertyAccessException("featureUnlockManager");
        return null;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public six.CN3 getOnResumeSelectSubTab() {
        return this.onResumeSelectSubTab;
    }

    public final xhQ.Ml yA() {
        xhQ.Ml ml = this.getTrialListItemsUseCase;
        if (ml != null) {
            return ml;
        }
        Intrinsics.throwUninitializedPropertyAccessException("getTrialListItemsUseCase");
        return null;
    }

    public final void yUZ(int numberOfMedia, String projectPackageId, String projectId, SceneType sceneType, boolean showTemplateEditor, xr.j origin) {
        SceneType sceneType2;
        Intrinsics.checkNotNullParameter(projectPackageId, "projectPackageId");
        Intrinsics.checkNotNullParameter(projectId, "projectId");
        Intrinsics.checkNotNullParameter(sceneType, "sceneType");
        Intrinsics.checkNotNullParameter(origin, "origin");
        if (!showTemplateEditor || numberOfMedia <= 0) {
            sceneType2 = sceneType;
            Pair[] pairArr = (Pair[]) Arrays.copyOf(new Pair[]{TuplesKt.to("projectID", projectId)}, 1);
            Intent intent = new Intent(this, (Class<?>) EditActivity.class);
            intent.putExtras(BundleKt.n((Pair[]) Arrays.copyOf(pairArr, pairArr.length)));
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this, intent);
        } else {
            sceneType2 = sceneType;
            fq().n(new j.VY8(projectPackageId, projectId, sceneType2, numberOfMedia, origin));
            Pair[] pairArr2 = (Pair[]) Arrays.copyOf(new Pair[]{TuplesKt.to("projectID", projectId), TuplesKt.to("projectPackageID", projectPackageId), TuplesKt.to("template_editor_origin", origin)}, 3);
            Intent intent2 = new Intent(this, (Class<?>) TemplateImportPreviewActivity.class);
            intent2.putExtras(BundleKt.n((Pair[]) Arrays.copyOf(pairArr2, pairArr2.length)));
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this, intent2);
        }
        fD(M.CN3.f6253S);
        wTp(six.CN3.f73281n.rl(sceneType2));
    }

    public MainActivity() {
        xTb xtb = new xTb(getActivityResultRegistry());
        getLifecycleRegistry().n(xtb);
        this.onboardingLauncher = xtb;
        this.codecCheckComplete = GJW.ci.t(null, 1, null);
        this.viewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(ci.class), new eO(this), new Xo(this), new z(null, this));
        this.cloudBackupViewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(l.CN3.class), new l3D(this), new QJ(this), new C1724c(null, this));
        this.bottomSheetViewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(com.alightcreative.app.motion.activities.main.r.class), new UGc(this), new s4(this), new Q(null, this));
        this.onElementLibraryLoaded = new Function1() { // from class: KC.YzO
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainActivity.jE(this.f5161n, (com.alightcreative.app.motion.activities.main.w6) obj);
            }
        };
        this.allLocalProjects = SnapshotStateKt__SnapshotStateKt.O(CollectionsKt.emptyList(), null, 2, null);
        this._selectedProjects = SnapshotStateKt__SnapshotStateKt.O(CollectionsKt.emptyList(), null, 2, null);
        this.projectTitles = SetsKt.emptySet();
        this.scenes = new ArrayList();
        this.snapshots = new ArrayList();
        this.projectListRefresher = com.alightcreative.app.motion.project.j.gh(this, new Function1() { // from class: KC.B
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainActivity.Bha(this.f5035n, (List) obj);
            }
        });
        this.purchaseStateObserver = new l4Z() { // from class: KC.T
            @Override // kgE.l4Z
            public final void n(com.alightcreative.account.o oVar) {
                MainActivity.H6M(this.f5148n, oVar);
            }
        };
        this.isPaused = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Co() {
        fq().n(j.xuv.f8595n);
        Xli().r(C2422c.f75273n, new Function1() { // from class: KC.Ogx
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainActivity.q9(this.f5108n, (ComponentActivity) obj);
            }
        });
    }

    public static final void Ep(MainActivity mainActivity, MKd mKd) {
        PJ9.DAz.T(mainActivity.fq());
        mKd.ty.postDelayed(new Runnable() { // from class: KC.Pp
            @Override // java.lang.Runnable
            public final void run() {
                MainActivity.GHt();
            }
        }, 500L);
    }

    public static final Unit G(MainActivity mainActivity, ProjectInfo.n nVar, rWZ.eO eOVar, Boolean bool) {
        String uid = FirebaseAuth.getInstance().getUid();
        if (uid == null) {
            return Unit.INSTANCE;
        }
        mainActivity.eb().X(mainActivity, uid, nVar, mainActivity.S(), eOVar, bool);
        return Unit.INSTANCE;
    }

    public static final String GH3(Task task) {
        return "remoteConfig.fetch:isSuccessful=" + task.isSuccessful();
    }

    public static final void GRh(AlertDialog alertDialog, View view) {
        alertDialog.dismiss();
    }

    public static final Unit GT(MainActivity mainActivity, boolean z2) {
        mainActivity.jX().Z();
        return Unit.INSTANCE;
    }

    public static final void I4p(MainActivity mainActivity, List list, View view) {
        HI0.afx.O(mainActivity).setPrimaryClip(ClipData.newPlainText("Preset Errors", CollectionsKt.joinToString$default(list, "\n", null, null, 0, null, new Function1() { // from class: KC.ozJ
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainActivity.bZm((String) obj);
            }
        }, 30, null)));
        Toast.makeText(mainActivity, 2132017504, 0).show();
    }

    public static final void L(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
    }

    public static final void Lu(MainActivity mainActivity, ProjectInfo.n nVar, DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
        mainActivity.rT(nVar);
    }

    private final void Mfw(DAz format, final Function2 completion) {
        Eu.I28 i28;
        nYs.j jVarInvoke = lRt().invoke();
        if (jVarInvoke != null && jVarInvoke.Xw()) {
            if (n.$EnumSwitchMapping$3[format.ordinal()] == 1) {
                i28 = Eu.I28.f2385e;
            } else {
                i28 = Eu.I28.f2371B;
            }
            GJW.C.nr(LifecycleOwnerKt.n(this), null, null, new r(i28, completion, null), 3, null);
            return;
        }
        Xli().r(new xAo.afx(format), new Function1() { // from class: KC.nSC
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainActivity.Tuk(completion, this, (ComponentActivity) obj);
            }
        });
    }

    private final boolean NC9() {
        nYs.j jVarInvoke = lRt().invoke();
        if (jVarInvoke == null || !jVarInvoke.bzg()) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Om() {
        long j2;
        if (YiW().rl()) {
            j2 = 300;
        } else {
            j2 = 10800;
        }
        final com.google.firebase.remoteconfig.j jVarAz = com.google.firebase.remoteconfig.j.az();
        Intrinsics.checkNotNullExpressionValue(jVarAz, "getInstance(...)");
        jVarAz.xMQ(j2).addOnCompleteListener(new OnCompleteListener() { // from class: KC.pq
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                MainActivity.t1J(this.f5224n, jVarAz, task);
            }
        });
    }

    public static final List Pn() {
        return VisualEffectKt.getVisualEffects();
    }

    public static final void Pzf(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
    }

    public static final void Rf(MainActivity mainActivity, View view) {
        mainActivity.ex(2131361943);
    }

    private final void VK2() {
        xuv xuvVarNr = GJW.C.nr(LifecycleOwnerKt.n(this), null, null, new qz(null), 3, null);
        az();
        yAc();
        Sax().n(this);
        kgE.Sis.gh(this.purchaseStateObserver);
        GJW.C.nr(LifecycleOwnerKt.n(this), null, null, new C(xuvVarNr, null), 3, null);
        GJW.C.nr(ViewModelKt.n(jX()), null, null, new o(xuvVarNr, this, null), 3, null);
    }

    public static final String Vd(MainActivity mainActivity) {
        return "smallestScreenWidthDp = sw" + mainActivity.getResources().getConfiguration().smallestScreenWidthDp + "dp";
    }

    public static final Unit W1c(MainActivity mainActivity, boolean z2) {
        mainActivity.jX().WPU(z2);
        return Unit.INSTANCE;
    }

    public static final void WH(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
    }

    private final void WT() {
        if (n7u().n() != null) {
            SJ0.UGc uGc = this.binding;
            if (uGc == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                uGc = null;
            }
            MKd mKdN = MKd.n(uGc.gh.ty(0));
            Intrinsics.checkNotNullExpressionValue(mKdN, "bind(...)");
            ConstraintLayout privacySettingsHolder = mKdN.te;
            Intrinsics.checkNotNullExpressionValue(privacySettingsHolder, "privacySettingsHolder");
            privacySettingsHolder.setVisibility(0);
            mKdN.te.setOnClickListener(new View.OnClickListener() { // from class: KC.RzR
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainActivity.cB(this.f5144n, view);
                }
            });
        }
    }

    public static final void X6(MainActivity mainActivity, View view) {
        mainActivity.fq().n(j.Il5.f8407n);
        SJ0.UGc uGc = mainActivity.binding;
        if (uGc == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            uGc = null;
        }
        uGc.xMQ.s7N(8388611);
    }

    public static final Unit b(MainActivity mainActivity) {
        iF iFVarFq = mainActivity.fq();
        com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
        iFVarFq.n(new j.lS(jVar.getMaxResWithVideo(), jVar.getMaxRes()));
        GJW.r rVar = mainActivity.codecCheckComplete;
        Unit unit = Unit.INSTANCE;
        rVar.eF(unit);
        return unit;
    }

    private final void eOa() {
        boolean z2;
        Intent intent = getIntent();
        if (intent != null) {
            nYs.j jVarInvoke = lRt().invoke();
            boolean z3 = false;
            boolean z4 = true;
            if (jVarInvoke != null && jVarInvoke.X()) {
                z2 = false;
                z3 = true;
            } else {
                z2 = false;
            }
            nYs.j jVarInvoke2 = lRt().invoke();
            if (jVarInvoke2 == null || !jVarInvoke2.te()) {
                z4 = z2;
            }
            Fg.afx.ViF(this, intent, z3, z4, fq(), YiW(), Xli(), true, new Dsr(this), c(), lRt());
        }
        nr.Uo(this, n7u().rl(), fq());
        WT();
        Intent intent2 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent2, "getIntent(...)");
        l(intent2);
        GN();
        eo();
    }

    public static final void ep(MainActivity mainActivity, View view) {
        mainActivity.fq().n(j.wb.f8591n);
        mainActivity.ex(2131361991);
    }

    private final boolean h(nYs.Ml getAlightSettingsUseCase) {
        boolean zAreEqual;
        nYs.j jVarInvoke = getAlightSettingsUseCase.invoke();
        if (jVarInvoke != null) {
            zAreEqual = Intrinsics.areEqual(jVarInvoke.wTp(), Boolean.TRUE);
        } else {
            zAreEqual = false;
        }
        if (!zAreEqual || !WindowWidthSizeClass.qie(N.C.n(this), WindowWidthSizeClass.INSTANCE.nr())) {
            return false;
        }
        return true;
    }

    public static final String hr() {
        return "Effect Digest: " + VisualEffectKt.getEffectSig();
    }

    private final void hu() {
        Window window = getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        M5.n(window, getColor(2131100619), 0, true);
    }

    private final void i7() {
        SJ0.UGc uGc = null;
        if (Ik().isEmpty()) {
            SJ0.UGc uGc2 = this.binding;
            if (uGc2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                uGc = uGc2;
            }
            uGc.xMQ.setBackgroundColor(getColor(2131100619));
            return;
        }
        SJ0.UGc uGc3 = this.binding;
        if (uGc3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            uGc = uGc3;
        }
        uGc.xMQ.setBackgroundColor(getColor(2131100620));
    }

    public static final void iV(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
    }

    public static final String kC(com.alightcreative.app.motion.activities.main.w6 w6Var) {
        boolean zKN = com.alightcreative.app.motion.activities.main.Ml.KN(w6Var);
        List listRl = w6Var.rl();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listRl) {
            if (((w6.j) obj).n()) {
                arrayList.add(obj);
            }
        }
        return "elementLibrary : " + zKN + " NEW=" + arrayList;
    }

    private final void l(Intent intent) {
        if (PJ9.DAz.E(this, intent) || PJ9.DAz.Mx(this, intent)) {
            return;
        }
        PJ9.DAz.N(this, intent);
    }

    public static final Unit ni(MainActivity mainActivity, boolean z2) {
        mainActivity.jX().XQ();
        return Unit.INSTANCE;
    }

    public static final void oz(MainActivity mainActivity, ProjectInfo.n nVar, DialogInterface dialogInterface, int i2) {
        String id;
        dialogInterface.dismiss();
        if (nVar != null) {
            id = nVar.getId();
        } else {
            id = null;
        }
        mainActivity.A(id);
    }

    public static final void p(MainActivity mainActivity, View view) {
        mainActivity.fq().n(j.OA.f8432n);
        mainActivity.ex(2131361942);
    }

    public static final Unit poH(MainActivity mainActivity) {
        GJW.C.nr(LifecycleOwnerKt.n(mainActivity), null, null, mainActivity.new fuX(null), 3, null);
        return Unit.INSTANCE;
    }

    public static final Unit pr(MainActivity mainActivity, boolean z2, boolean z3) {
        mainActivity.jX().aYN(z2, z3);
        return Unit.INSTANCE;
    }

    public static final void pt(MainActivity mainActivity, View view) {
        mainActivity.ex(2131361850);
    }

    private final void qva(String id) {
        Object next;
        final Scene sceneUnserializeScene$default = SceneSerializerKt.unserializeScene$default(FilesKt.readText$default(HI0.afx.o(this, id), null, 1, null), false, false, false, 14, null);
        Iterator it = SequencesKt.map(CollectionsKt.asSequence(new IntRange(1, 1000)), new Function1() { // from class: KC.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainActivity.d(sceneUnserializeScene$default, ((Integer) obj).intValue());
            }
        }).iterator();
        while (true) {
            if (it.hasNext()) {
                next = it.next();
                if (!getProjectTitles().contains((String) next)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        String str = (String) next;
        if (str == null) {
            str = sceneUnserializeScene$default.getTitle() + " Copy";
        }
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.checkNotNull(uuidRandomUUID);
        FilesKt.writeText$default(HI0.afx.Z(this, uuidRandomUUID), SceneSerializerKt.serializeScene$default(Scene.copy$default(sceneUnserializeScene$default, str, 0, 0, 0, 0, 0, null, 0, null, null, null, null, null, 0, 0, 0, false, 0L, null, null, 1048574, null), false, null, false, false, null, 62, null), null, 2, null);
    }

    public static final Fragment rqO(MainActivity mainActivity) {
        nYs.j jVarInvoke = mainActivity.lRt().invoke();
        if (jVarInvoke != null && jVarInvoke.U()) {
            return new D3C.Ml();
        }
        return new M.qf();
    }

    private final void tdZ(String projectPackageId, LM.aC importResult) {
        SceneType sceneType;
        int size = importResult.O().size() + importResult.t().size();
        if (importResult.nr().size() != 0 && size == 0) {
            fq().n(new j.jL(projectPackageId));
            final AlertDialog alertDialogCreate = new AlertDialog.Builder(this).Z(2131558655).create();
            alertDialogCreate.show();
            Window window = alertDialogCreate.getWindow();
            if (window != null) {
                window.setBackgroundDrawable(new ColorDrawable(0));
            }
            ImageButton imageButton = (ImageButton) alertDialogCreate.findViewById(2131363007);
            if (imageButton != null) {
                imageButton.setOnClickListener(new View.OnClickListener() { // from class: KC.psW
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        MainActivity.GRh(alertDialogCreate, view);
                    }
                });
            }
            LottieAnimationView lottieAnimationView = (LottieAnimationView) alertDialogCreate.findViewById(2131363005);
            if (lottieAnimationView != null) {
                lottieAnimationView.setAnimation(2131951647);
                lottieAnimationView.r();
            }
            Button button = (Button) alertDialogCreate.findViewById(2131363006);
            if (button != null) {
                button.setOnClickListener(new View.OnClickListener() { // from class: KC.OU
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        MainActivity.Rc(this.f5106n, alertDialogCreate, view);
                    }
                });
            }
            Intrinsics.checkNotNull(alertDialogCreate);
            return;
        }
        boolean zH = h(lRt());
        if (size == 1) {
            UUID uuid = (UUID) CollectionsKt.singleOrNull(importResult.O());
            if (uuid == null) {
                uuid = (UUID) CollectionsKt.singleOrNull(importResult.t());
            }
            if (!CollectionsKt.contains(importResult.O(), uuid) && CollectionsKt.contains(importResult.t(), uuid)) {
                sceneType = SceneType.ELEMENT;
            } else {
                sceneType = SceneType.SCENE;
            }
            SceneType sceneType2 = sceneType;
            int iUo = importResult.Uo();
            String string = GWY.j.nr(this, String.valueOf(uuid)).toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            yUZ(iUo, projectPackageId, string, sceneType2, zH, j.n.f75490n);
            return;
        }
        az();
        te(M.CN3.f6256g);
    }

    public static final List uQ() {
        return VisualEffectKt.getPresetLoadErrors();
    }

    public static final void vMk(MainActivity mainActivity, View view) {
        mainActivity.fq().n(j.B.f8374n);
        HI0.Ml.J2(mainActivity, "https://alightcreative.com/amhelpcenter");
    }

    private final void yAc() {
        M.CN3 cn3;
        if (nYs.w6.n(lRt().invoke())) {
            cn3 = M.CN3.f6253S;
        } else {
            cn3 = M.CN3.f6258r;
        }
        te(cn3);
        SJ0.UGc uGc = this.binding;
        if (uGc == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            uGc = null;
        }
        uGc.J2.setContent(ComposableLambdaKt.rl(-1778790433, true, new w6()));
    }

    public static final Fragment zB(MainActivity mainActivity) {
        nYs.j jVarInvoke = mainActivity.lRt().invoke();
        if (jVarInvoke != null && jVarInvoke.U()) {
            return new f52.I28();
        }
        return new S();
    }

    public static final void zv(MainActivity mainActivity, View view) {
        mainActivity.ex(2131361852);
    }

    @Override // Vi.CN3
    public void N() {
        GJW.C.nr(LifecycleOwnerKt.n(this), null, null, new Ml(null), 3, null);
    }

    @Override // Vi.CN3
    public boolean T() {
        boolean z2 = !Ik().isEmpty();
        lvn(CollectionsKt.emptyList());
        return z2;
    }

    @Override // ka.fuX
    public void aYN() {
        HFS().aYN();
    }

    @Override // Vi.Wre
    public void e() {
        HFS().Z();
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (getOnBackPressedDispatcher().getHasEnabledCallbacks()) {
            super.onBackPressed();
            return;
        }
        if (getSupportFragmentManager().uG()) {
            hu();
            T();
            return;
        }
        SJ0.UGc uGc = this.binding;
        SJ0.UGc uGc2 = null;
        if (uGc == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            uGc = null;
        }
        if (uGc.xMQ.iF(8388611)) {
            SJ0.UGc uGc3 = this.binding;
            if (uGc3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                uGc2 = uGc3;
            }
            uGc2.xMQ.KN();
            return;
        }
        if (T()) {
            return;
        }
        super.onBackPressed();
    }

    public final void pE() {
        SJ0.UGc uGc = null;
        FragmentTransaction fragmentTransactionWPU = getSupportFragmentManager().o().KN(null).WPU(2130837507, 2130837506, 2130837507, 2130837506);
        SJ0.UGc uGc2 = this.binding;
        if (uGc2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            uGc2 = null;
        }
        FragmentTransaction fragmentTransactionWPU2 = fragmentTransactionWPU.rl(uGc2.Uo.getId(), j.INSTANCE.n(true)).WPU(2130837509, 2130837508, 2130837509, 2130837508);
        SJ0.UGc uGc3 = this.binding;
        if (uGc3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            uGc = uGc3;
        }
        fragmentTransactionWPU2.rl(uGc.KN.getId(), new KC.Q()).mUb();
    }
}
