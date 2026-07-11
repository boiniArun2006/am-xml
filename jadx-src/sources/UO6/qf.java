package UO6;

import QmE.j;
import SJ0.T;
import UO6.qf;
import UO6.vd;
import android.animation.ObjectAnimator;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.os.StatFs;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alightcreative.account.LicenseInfo;
import com.alightcreative.account.LicenseType;
import com.alightcreative.app.motion.activities.R6;
import com.alightcreative.app.motion.activities.ResolutionDropdown;
import com.alightcreative.app.motion.activities.w6O;
import com.alightcreative.app.motion.persist.j;
import com.alightcreative.app.motion.scene.MediaUriInfo;
import com.alightcreative.app.motion.scene.Scene;
import com.alightcreative.app.motion.scene.SceneExporterKt;
import com.alightcreative.app.motion.scene.SceneHolder;
import com.alightcreative.app.motion.scene.SceneKt;
import com.alightcreative.app.motion.scene.VideoEncoding;
import com.alightcreative.app.motion.scene.serializer.MalformedSceneException;
import com.alightcreative.app.motion.scene.serializer.SceneSerializerKt;
import com.alightcreative.monorepo.settings.ExportUIMenuItem;
import com.alightcreative.widget.AlightSlider;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.google.firebase.auth.FirebaseAuth;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kgE.Sis;
import kgE.l4Z;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u000e\b\u0007\u0018\u0000 u2\u00020\u0001:\u0004¸\u0001¹\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\bJ%\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0019\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0003J\u0017\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001f\u0010\u0003J\u0017\u0010 \u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b \u0010\u001aJ\u0017\u0010!\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b!\u0010\u001aJ\u0013\u0010#\u001a\u00020\"*\u00020\u0017H\u0002¢\u0006\u0004\b#\u0010$J\u0013\u0010&\u001a\u00020%*\u00020\u0017H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b(\u0010\bJ\u0017\u0010*\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u000bH\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0004H\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0004H\u0002¢\u0006\u0004\b.\u0010-J\u000f\u0010/\u001a\u00020\u0004H\u0002¢\u0006\u0004\b/\u0010-J\u000f\u00100\u001a\u00020\u0006H\u0002¢\u0006\u0004\b0\u0010\u0003J\u000f\u00101\u001a\u00020\u0006H\u0016¢\u0006\u0004\b1\u0010\u0003J\u0019\u00104\u001a\u00020\u00062\b\u00103\u001a\u0004\u0018\u000102H\u0016¢\u0006\u0004\b4\u00105J+\u0010;\u001a\u00020:2\u0006\u00107\u001a\u0002062\b\u00109\u001a\u0004\u0018\u0001082\b\u00103\u001a\u0004\u0018\u000102H\u0016¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\u0006H\u0016¢\u0006\u0004\b=\u0010\u0003J\u000f\u0010>\u001a\u00020\u0006H\u0016¢\u0006\u0004\b>\u0010\u0003J!\u0010@\u001a\u00020\u00062\u0006\u0010?\u001a\u00020:2\b\u00103\u001a\u0004\u0018\u000102H\u0016¢\u0006\u0004\b@\u0010AR\u0018\u0010E\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\"\u0010M\u001a\u00020F8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\"\u0010U\u001a\u00020N8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\"\u0010]\u001a\u00020V8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\"\u0010e\u001a\u00020^8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\u0018\u0010i\u001a\u0004\u0018\u00010f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u0016\u0010m\u001a\u00020j8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bk\u0010lR \u0010q\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00040n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0016\u0010s\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010GR\u0016\u0010v\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010uR,\u0010\u007f\u001a\u0013\u0012\t\u0012\u00070x¢\u0006\u0002\by\u0012\u0004\u0012\u00020z0w8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~R0\u0010\u0083\u0001\u001a\u0014\u0012\t\u0012\u00070x¢\u0006\u0002\by\u0012\u0005\u0012\u00030\u0080\u00010w8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0081\u0001\u0010|\u001a\u0005\b\u0082\u0001\u0010~R0\u0010\u0087\u0001\u001a\u0014\u0012\t\u0012\u00070x¢\u0006\u0002\by\u0012\u0005\u0012\u00030\u0084\u00010w8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0085\u0001\u0010|\u001a\u0005\b\u0086\u0001\u0010~R\u0019\u0010\u008a\u0001\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0019\u0010\u008c\u0001\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u0089\u0001R\u0019\u0010\u008e\u0001\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u0089\u0001R\u0019\u0010\u0090\u0001\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0089\u0001R\u0019\u0010\u0092\u0001\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0089\u0001R\u0018\u0010\u0094\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0093\u0001\u0010GR\u0018\u0010\u0096\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0095\u0001\u0010GR!\u0010\u009b\u0001\u001a\n\u0012\u0005\u0012\u00030\u0098\u00010\u0097\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R!\u0010\u009f\u0001\u001a\n\u0012\u0005\u0012\u00030\u009d\u00010\u009c\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u009e\u0001R\u0018\u0010¡\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b \u0001\u0010GR\u0018\u0010¥\u0001\u001a\u00030¢\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b£\u0001\u0010¤\u0001R\u0017\u0010¨\u0001\u001a\u00020B8BX\u0082\u0004¢\u0006\b\u001a\u0006\b¦\u0001\u0010§\u0001R\u0017\u0010«\u0001\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\b\u001a\u0006\b©\u0001\u0010ª\u0001R\u0018\u0010¯\u0001\u001a\u00030¬\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u00ad\u0001\u0010®\u0001R\u0017\u0010±\u0001\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\b\u001a\u0006\b°\u0001\u0010ª\u0001R\u0017\u0010³\u0001\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\b\u001a\u0006\b²\u0001\u0010ª\u0001R\u0017\u0010µ\u0001\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\b\u001a\u0006\b´\u0001\u0010ª\u0001R\u0017\u0010·\u0001\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\b\u001a\u0006\b¶\u0001\u0010ª\u0001¨\u0006º\u0001"}, d2 = {"LUO6/qf;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "LUO6/w6;", "exportInfo", "", "QZ6", "(LUO6/w6;)V", "a63", "F", "", "shortDimension", "Lkotlin/Pair;", "Org", "(I)Lkotlin/Pair;", "n7b", "LUO6/vd$n;", "type", "X4T", "(LUO6/vd$n;)V", "ub", "Zmq", "LUO6/vd;", "item", "EWS", "(LUO6/vd;)V", "", "isSwitchedOn", "lLA", "(Z)V", InneractiveMediationDefs.GENDER_FEMALE, "UF", "Qu", "", "m", "(LUO6/vd;)Ljava/lang/String;", "", "ijL", "(LUO6/vd;)J", "HBN", "resolutionShortDimension", "ER", "(I)V", "Bu", "()LUO6/w6;", "mI", "T3L", "p0N", "onDestroy", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", TtmlNode.RUBY_CONTAINER, "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onResume", "onDestroyView", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "LSJ0/T;", "o", "LSJ0/T;", "_binding", "LQmE/iF;", "Z", "LQmE/iF;", "G7", "()LQmE/iF;", "setEventLogger", "(LQmE/iF;)V", "eventLogger", "LkgE/fuX;", "S", "LkgE/fuX;", "n1", "()LkgE/fuX;", "setIapManager", "(LkgE/fuX;)V", "iapManager", "LnYs/Ml;", "g", "LnYs/Ml;", "ul", "()LnYs/Ml;", "setGetAlightSettingsUseCase", "(LnYs/Ml;)V", "getAlightSettingsUseCase", "LxAo/I28;", "E2", "LxAo/I28;", "getCrisperManager", "()LxAo/I28;", "setCrisperManager", "(LxAo/I28;)V", "crisperManager", "Lcom/alightcreative/app/motion/scene/Scene;", "e", "Lcom/alightcreative/app/motion/scene/Scene;", "scene", "LUO6/Md;", "X", "LUO6/Md;", "adapter", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Ljava/util/Map;", "exportInfoPreferences", "N", "showOverflow", "v", "I", "customShortDimension", "", "Landroid/widget/Button;", "Lkotlin/jvm/internal/EnhancedNullability;", "Lcom/alightcreative/app/motion/persist/j$Pl;", "Xw", "Lkotlin/Lazy;", "C", "()Ljava/util/Map;", "codecs", "Lcom/alightcreative/app/motion/persist/j$fuX;", "jB", "fcU", "formats", "Lcom/alightcreative/app/motion/persist/j$Ml;", "U", "eWT", "frameRates", "P5", "J", "xmlSize", "M7", "multiSelectMediaSize", "p5", "videoSize", "eF", "imageSize", "E", "audioSize", "M", "isMultiSelect", "FX", "isSignInRequested", "", "Lcom/alightcreative/account/LicenseInfo;", "B", "Ljava/util/List;", "currentLicenses", "", "LkgE/K;", "Ljava/util/Set;", "currentBenefits", "D", "isLoading", "LkgE/l4Z;", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "LkgE/l4Z;", "purchaseStateObserver", "ofS", "()LSJ0/T;", "binding", "pJg", "()I", "baseFrameRate", "", "Mx", "()D", "durationInSeconds", "mYa", "sceneWidth", "Jk", "sceneHeight", "qm", "sceneShortDimension", "Rl", "sceneLongDimension", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "j", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nExportListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExportListFragment.kt\ncom/alightcreative/export/exportlist/ExportListFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,1070:1\n1#2:1071\n1#2:1100\n216#3,2:1072\n216#3,2:1132\n257#4,2:1074\n299#4,2:1079\n2632#5,3:1076\n1863#5,2:1081\n1863#5,2:1083\n1863#5,2:1085\n774#5:1087\n865#5,2:1088\n1611#5,9:1090\n1863#5:1099\n1864#5:1101\n1620#5:1102\n2632#5,3:1103\n1062#5:1106\n774#5:1111\n865#5,2:1112\n1557#5:1114\n1628#5,3:1115\n360#5,7:1118\n1863#5,2:1125\n1863#5,2:1127\n1863#5,2:1129\n1863#5:1131\n1864#5:1134\n1863#5,2:1135\n1863#5,2:1137\n1863#5,2:1139\n11158#6:1107\n11493#6,3:1108\n*S KotlinDebug\n*F\n+ 1 ExportListFragment.kt\ncom/alightcreative/export/exportlist/ExportListFragment\n*L\n464#1:1100\n217#1:1072,2\n242#1:1132,2\n319#1:1074,2\n342#1:1079,2\n338#1:1076,3\n347#1:1081,2\n360#1:1083,2\n373#1:1085,2\n448#1:1087\n448#1:1088,2\n464#1:1090,9\n464#1:1099\n464#1:1101\n464#1:1102\n470#1:1103,3\n477#1:1106\n483#1:1111\n483#1:1112,2\n485#1:1114\n485#1:1115,3\n747#1:1118,7\n753#1:1125,2\n754#1:1127,2\n755#1:1129,2\n241#1:1131\n241#1:1134\n353#1:1135,2\n367#1:1137,2\n394#1:1139,2\n481#1:1107\n481#1:1108,3\n*E\n"})
public final class qf extends yg {

    /* JADX INFO: renamed from: B, reason: collision with root package name and from kotlin metadata */
    private List currentLicenses;

    /* JADX INFO: renamed from: D, reason: collision with root package name and from kotlin metadata */
    private boolean isLoading;

    /* JADX INFO: renamed from: E, reason: collision with root package name and from kotlin metadata */
    private long audioSize;

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    public xAo.I28 crisperManager;

    /* JADX INFO: renamed from: FX, reason: collision with root package name and from kotlin metadata */
    private boolean isSignInRequested;

    /* JADX INFO: renamed from: J, reason: collision with root package name and from kotlin metadata */
    private Set currentBenefits;

    /* JADX INFO: renamed from: M, reason: collision with root package name and from kotlin metadata */
    private boolean isMultiSelect;

    /* JADX INFO: renamed from: M7, reason: from kotlin metadata */
    private long multiSelectMediaSize;

    /* JADX INFO: renamed from: P5, reason: from kotlin metadata */
    private long xmlSize;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    public kgE.fuX iapManager;

    /* JADX INFO: renamed from: X, reason: collision with root package name and from kotlin metadata */
    private Md adapter;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    public QmE.iF eventLogger;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Scene scene;

    /* JADX INFO: renamed from: eF, reason: from kotlin metadata */
    private long imageSize;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public nYs.Ml getAlightSettingsUseCase;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private T _binding;

    /* JADX INFO: renamed from: p5, reason: from kotlin metadata */
    private long videoSize;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private int customShortDimension;

    /* JADX INFO: renamed from: I, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: GR, reason: collision with root package name */
    public static final int f10695GR = 8;

    /* JADX INFO: renamed from: T, reason: collision with root package name and from kotlin metadata */
    private final Map exportInfoPreferences = new LinkedHashMap();

    /* JADX INFO: renamed from: N, reason: collision with root package name and from kotlin metadata */
    private boolean showOverflow = true;

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    private final Lazy codecs = LazyKt.lazy(new Function0() { // from class: UO6.I28
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return qf.piY(this.f10661n);
        }
    });

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private final Lazy formats = LazyKt.lazy(new Function0() { // from class: UO6.eO
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return qf.eTf(this.f10681n);
        }
    });

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
    private final Lazy frameRates = LazyKt.lazy(new Function0() { // from class: UO6.ci
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return qf.xg(this.f10680n);
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l4Z purchaseStateObserver = new l4Z() { // from class: UO6.g9s
        @Override // kgE.l4Z
        public final void n(com.alightcreative.account.o oVar) {
            qf.tFV(this.f10683n, oVar);
        }
    };

    /* synthetic */ class CN3 extends FunctionReferenceImpl implements Function1 {
        CN3(Object obj) {
            super(1, obj, qf.class, "onResolutionSelected", "onResolutionSelected(I)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            n(((Number) obj).intValue());
            return Unit.INSTANCE;
        }

        public final void n(int i2) {
            ((qf) this.receiver).ER(i2);
        }
    }

    /* synthetic */ class I28 extends FunctionReferenceImpl implements Function1 {
        I28(Object obj) {
            super(1, obj, qf.class, "updateMediaSizeDisplay", "updateMediaSizeDisplay(Lcom/alightcreative/export/exportlist/ExportModeItem;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            n((vd) obj);
            return Unit.INSTANCE;
        }

        public final void n(vd p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((qf) this.receiver).Qu(p0);
        }
    }

    public static final class Ml implements SeekBar.OnSeekBarChangeListener {
        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }

        public /* synthetic */ class j {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[vd.n.values().length];
                try {
                    iArr[vd.n.f10734t.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[vd.n.f10733r.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[vd.n.J2.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        Ml() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i2, boolean z2) {
            Md md = qf.this.adapter;
            if (md == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                md = null;
            }
            vd vdVarIk = md.Ik();
            int i3 = j.$EnumSwitchMapping$0[vdVarIk.xMQ().ordinal()];
            if (i3 == 1) {
                UO6.w6 w6VarN = vdVarIk.n();
                Intrinsics.checkNotNull(w6VarN);
                w6VarN.KN(i2);
                qf.this.HBN(w6VarN);
            } else if (i3 == 2) {
                UO6.w6 w6VarN2 = vdVarIk.n();
                Intrinsics.checkNotNull(w6VarN2);
                w6VarN2.KN(i2);
            } else {
                if (i3 != 3) {
                    return;
                }
                UO6.w6 w6VarN3 = vdVarIk.n();
                Intrinsics.checkNotNull(w6VarN3);
                w6VarN3.KN(i2);
                qf.this.ofS().eF.setText(String.valueOf(i2));
            }
            qf.this.ofS().f9351o.setText(qf.this.m(vdVarIk));
        }
    }

    /* synthetic */ class Wre extends FunctionReferenceImpl implements Function1 {
        Wre(Object obj) {
            super(1, obj, qf.class, "updateTrialToggleVisibility", "updateTrialToggleVisibility(Lcom/alightcreative/export/exportlist/ExportModeItem$Type;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            n((vd.n) obj);
            return Unit.INSTANCE;
        }

        public final void n(vd.n nVar) {
            ((qf) this.receiver).X4T(nVar);
        }
    }

    public static final class fuX implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ComparisonsKt.compareValues(Integer.valueOf(((w6O) obj2).t()), Integer.valueOf(((w6O) obj).t()));
        }
    }

    /* JADX INFO: renamed from: UO6.qf$j, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ qf rl(Companion companion, String str, boolean z2, ArrayList arrayList, int i2, long j2, long j3, List list, boolean z3, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = null;
            }
            if ((i3 & 2) != 0) {
                z2 = true;
            }
            if ((i3 & 8) != 0) {
                i2 = 0;
            }
            if ((i3 & 16) != 0) {
                j2 = 0;
            }
            if ((i3 & 32) != 0) {
                j3 = 0;
            }
            if ((i3 & 64) != 0) {
                list = CollectionsKt.emptyList();
            }
            return companion.n(str, z2, arrayList, i2, j2, j3, list, (i3 & 128) != 0 ? false : z3);
        }

        public final qf n(String str, boolean z2, ArrayList itemList, int i2, long j2, long j3, List selectedProjectIds, boolean z3) {
            Intrinsics.checkNotNullParameter(itemList, "itemList");
            Intrinsics.checkNotNullParameter(selectedProjectIds, "selectedProjectIds");
            qf qfVar = new qf();
            Bundle bundle = new Bundle();
            bundle.putString("ProjectID", str);
            bundle.putBoolean("ShowOverflow", z2);
            bundle.putIntegerArrayList("exportList", itemList);
            bundle.putInt("ListHeight", i2);
            bundle.putLong("xmlSize", j2);
            bundle.putLong("multiSelectMediaSize", j3);
            bundle.putStringArray("selectedProjectIds", (String[]) selectedProjectIds.toArray(new String[0]));
            bundle.putBoolean("isMultiProjectExport", z3);
            qfVar.setArguments(bundle);
            return qfVar;
        }
    }

    public interface n {

        public static final class j {
            /* JADX INFO: Access modifiers changed from: private */
            public static Unit O(FragmentActivity it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Unit nr(FragmentActivity it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Unit.INSTANCE;
            }

            public static /* synthetic */ void t(n nVar, int i2, UO6.w6 w6Var, boolean z2, Function1 function1, Function1 function12, int i3, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: export");
                }
                if ((i3 & 2) != 0) {
                    w6Var = null;
                }
                UO6.w6 w6Var2 = w6Var;
                if ((i3 & 4) != 0) {
                    z2 = false;
                }
                boolean z3 = z2;
                if ((i3 & 8) != 0) {
                    function1 = new Function1() { // from class: UO6.Ln
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return qf.n.j.nr((FragmentActivity) obj2);
                        }
                    };
                }
                Function1 function13 = function1;
                if ((i3 & 16) != 0) {
                    function12 = new Function1() { // from class: UO6.lej
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return qf.n.j.O((FragmentActivity) obj2);
                        }
                    };
                }
                nVar.E2(i2, w6Var2, z3, function13, function12);
            }
        }

        void E2(int i2, UO6.w6 w6Var, boolean z2, Function1 function1, Function1 function12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map GD(qf qfVar, String str) {
        String text$default;
        try {
            FragmentActivity activity = qfVar.getActivity();
            if (activity != null) {
                Intrinsics.checkNotNull(str);
                File fileO = HI0.afx.o(activity, str);
                if (fileO != null && (text$default = FilesKt.readText$default(fileO, null, 1, null)) != null) {
                    return SceneSerializerKt.unserializeScene$default(text$default, false, false, false, 14, null).getMediaInfo();
                }
            }
        } catch (MalformedSceneException unused) {
        }
        return null;
    }

    private final void f() {
        ObjectAnimator objectAnimatorOfFloat;
        Context context = getContext();
        if (context == null) {
            return;
        }
        if (ofS().wTp.getVisibility() == 0) {
            ofS().wTp.setVisibility(8);
            ofS().f9336FX.setVisibility(0);
            ofS().f9353t.setVisibility(0);
            ofS().nr.setVisibility(8);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(2131165483);
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(ofS().f9336FX, "translationX", XoT.fuX.XQ(context) ? -(dimensionPixelOffset * 0.5f) : dimensionPixelOffset * 0.5f, dimensionPixelOffset * 0.0f);
        } else {
            ofS().f9336FX.setVisibility(8);
            ofS().f9353t.setVisibility(8);
            ofS().nr.setVisibility(0);
            ofS().wTp.setVisibility(0);
            ofS().f9334D.setText(getResources().getString(2132019026));
            RecyclerView.Adapter adapter = ofS().Ik.getAdapter();
            if (adapter != null) {
                adapter.notifyDataSetChanged();
            }
            int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(2131165483);
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(ofS().Ik, "translationX", XoT.fuX.XQ(context) ? dimensionPixelOffset2 * 0.5f : -(dimensionPixelOffset2 * 0.5f), dimensionPixelOffset2 * 0.0f);
        }
        objectAnimatorOfFloat.setDuration(200L);
        objectAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        objectAnimatorOfFloat.start();
    }

    public /* synthetic */ class w6 {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[kgE.Zs.values().length];
            try {
                iArr[kgE.Zs.J2.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[kgE.Zs.f70101O.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[kgE.Zs.f70102n.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[kgE.Zs.f70105t.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[vd.n.values().length];
            try {
                iArr2[vd.n.f10734t.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[vd.n.f10733r.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[vd.n.J2.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[vd.n.f10727O.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[vd.n.f10728S.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[vd.n.f10729Z.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[vd.n.f10731g.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[vd.n.f10732o.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private final UO6.w6 Bu() {
        UO6.w6 w6VarRl;
        com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
        if (jVar.getVideoExportInfo().length() > 0) {
            w6VarRl = UO6.Ml.rl(jVar.getVideoExportInfo());
        } else {
            UO6.w6 w6Var = new UO6.w6(vd.n.f10734t.rl(), qm(), qm(), j.Pl.f45834n, j.fuX.f45849O, j.Ml.f45829O, 50, false, false, 256, null);
            jVar.setVideoExportInfo(w6Var.toString());
            w6VarRl = w6Var;
        }
        Pair pairN7b = n7b(qm());
        if (pairN7b != null) {
            int iIntValue = ((Number) pairN7b.component1()).intValue();
            int iIntValue2 = ((Number) pairN7b.component2()).intValue();
            w6VarRl.ty(iIntValue);
            w6VarRl.qie(iIntValue2);
        }
        return w6VarRl;
    }

    private final Map C() {
        return (Map) this.codecs.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void EF(qf qfVar, j.Ml ml, Button button, View view) {
        Md md = qfVar.adapter;
        if (md == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            md = null;
        }
        vd vdVarIk = md.Ik();
        int i2 = w6.$EnumSwitchMapping$1[vdVarIk.xMQ().ordinal()];
        if (i2 == 1) {
            UO6.w6 w6VarN = vdVarIk.n();
            Intrinsics.checkNotNull(w6VarN);
            w6VarN.gh(ml);
        } else if (i2 == 2) {
            UO6.w6 w6VarN2 = vdVarIk.n();
            Intrinsics.checkNotNull(w6VarN2);
            w6VarN2.gh(ml);
        } else {
            if (i2 != 3) {
                return;
            }
            UO6.w6 w6VarN3 = vdVarIk.n();
            Intrinsics.checkNotNull(w6VarN3);
            w6VarN3.gh(ml);
        }
        int iN = iF.n(qfVar.pJg(), (j.Ml) MapsKt.getValue(qfVar.eWT(), button)) / 100;
        qfVar.ofS().E2.setText(iN + "fps");
        for (Button button2 : qfVar.eWT().keySet()) {
            button2.setActivated(Intrinsics.areEqual(view, button2));
        }
        if (vdVarIk.xMQ() == vd.n.f10734t) {
            qfVar.HBN(vdVarIk.n());
        }
        qfVar.ofS().f9351o.setText(qfVar.m(vdVarIk));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ER(int resolutionShortDimension) {
        Md md = this.adapter;
        Md md2 = null;
        if (md == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            md = null;
        }
        vd vdVarIk = md.Ik();
        Pair pair = vdVarIk.xMQ() == vd.n.f10733r ? mYa() < Jk() ? TuplesKt.to(Integer.valueOf(resolutionShortDimension), Integer.valueOf((resolutionShortDimension * Rl()) / qm())) : TuplesKt.to(Integer.valueOf((Rl() * resolutionShortDimension) / qm()), Integer.valueOf(resolutionShortDimension)) : mYa() > Jk() ? TuplesKt.to(Integer.valueOf((mYa() * resolutionShortDimension) / Jk()), Integer.valueOf(resolutionShortDimension)) : TuplesKt.to(Integer.valueOf(resolutionShortDimension), Integer.valueOf((Jk() * resolutionShortDimension) / mYa()));
        int iIntValue = ((Number) pair.component1()).intValue();
        int iIntValue2 = ((Number) pair.component2()).intValue();
        int i2 = w6.$EnumSwitchMapping$1[vdVarIk.xMQ().ordinal()];
        if (i2 == 1) {
            UO6.w6 w6VarN = vdVarIk.n();
            Intrinsics.checkNotNull(w6VarN);
            w6VarN.ty(iIntValue);
            w6VarN.qie(iIntValue2);
            w6VarN.az(false);
            ofS().J2.setEnabled(SceneExporterKt.isEncoderSupported(VideoEncoding.HEVC, iIntValue, iIntValue2));
            HBN(w6VarN);
            Md md3 = this.adapter;
            if (md3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                md3 = null;
            }
            Md md4 = this.adapter;
            if (md4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            } else {
                md2 = md4;
            }
            md3.notifyItemChanged(md2.ck().indexOf(vdVarIk));
        } else if (i2 == 2 || i2 == 3) {
            UO6.w6 w6VarN2 = vdVarIk.n();
            Intrinsics.checkNotNull(w6VarN2);
            w6VarN2.ty(iIntValue);
            w6VarN2.qie(iIntValue2);
            w6VarN2.az(false);
            Md md5 = this.adapter;
            if (md5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                md5 = null;
            }
            Md md6 = this.adapter;
            if (md6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            } else {
                md2 = md6;
            }
            md5.notifyItemChanged(md2.ck().indexOf(vdVarIk));
        }
        Qu(vdVarIk);
        UF(vdVarIk);
        ofS().f9351o.setText(m(vdVarIk));
    }

    private final void EWS(vd item) {
        UO6.w6 w6VarN;
        if (this.isLoading) {
            return;
        }
        int iRl = item.xMQ().rl();
        boolean zIsChecked = ofS().f9333B.isChecked();
        int i2 = w6.$EnumSwitchMapping$1[item.xMQ().ordinal()];
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            w6VarN = item.n();
        } else {
            w6VarN = null;
            if (i2 == 5) {
                Context context = getContext();
                if (context == null) {
                    return;
                }
                if (FirebaseAuth.getInstance().getUid() == null) {
                    G7().n(new j.qfL(rWZ.Pl.f73064t));
                    new R6(context).mUb(2132020173).nr(2132020172).J2(2132017396, new Function1() { // from class: UO6.Pl
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return qf.hRu(this.f10667n, (DialogInterface) obj);
                        }
                    }).xMQ(2132020171, new Function1() { // from class: UO6.Xo
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return qf.UhV(this.f10674n, (DialogInterface) obj);
                        }
                    }).gh();
                    return;
                }
            } else if (i2 == 6) {
                Context context2 = getContext();
                if (context2 == null) {
                    return;
                }
                if (FirebaseAuth.getInstance().getUid() == null) {
                    G7().n(new j.qfL(rWZ.Pl.f73064t));
                    new R6(context2).mUb(2132020173).nr(2132020172).J2(2132017396, new Function1() { // from class: UO6.z
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return qf.i(this.f10743n, (DialogInterface) obj);
                        }
                    }).xMQ(2132020171, new Function1() { // from class: UO6.QJ
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return qf.K(this.f10669n, (DialogInterface) obj);
                        }
                    }).gh();
                    return;
                }
            }
        }
        UO6.w6 w6Var = w6VarN;
        this.isLoading = true;
        ofS().f9345X.setVisibility(0);
        KeyEventDispatcher.Component activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.alightcreative.export.exportlist.ExportListFragment.Exporter");
        ((n) activity).E2(iRl, w6Var, zIsChecked, new Function1() { // from class: UO6.l3D
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return qf.How((FragmentActivity) obj);
            }
        }, new Function1() { // from class: UO6.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return qf.tUK(this.f10679n, (FragmentActivity) obj);
            }
        });
    }

    private final void F(UO6.w6 exportInfo) {
        Pair pairN7b;
        int i2;
        com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
        UO6.w6 w6VarRl = UO6.Ml.rl(jVar.getImgSeExportInfo());
        if ((exportInfo.Uo() || ((i2 = this.customShortDimension) != 0 && i2 == UO6.Ml.n(exportInfo))) && (pairN7b = n7b(UO6.Ml.n(w6VarRl))) != null) {
            int iIntValue = ((Number) pairN7b.component1()).intValue();
            int iIntValue2 = ((Number) pairN7b.component2()).intValue();
            exportInfo.ty(iIntValue);
            exportInfo.qie(iIntValue2);
        }
        jVar.setImgSeExportInfo(exportInfo.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void HBN(UO6.w6 exportInfo) {
        Md md = this.adapter;
        if (md == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            md = null;
        }
        if (md.Ik().xMQ() == vd.n.f10734t) {
            ofS().eF.setText(com.alightcreative.app.motion.activities.lej.n(UO6.n.n(((mYa() * UO6.Ml.n(exportInfo)) / qm()) * ((Jk() * UO6.Ml.n(exportInfo)) / qm()), iF.n(pJg(), exportInfo.nr()) / 100, exportInfo), true));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit How(FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        activity.getSupportFragmentManager().Zmq();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void JVN(qf qfVar, j.Pl pl, View view) {
        Md md = qfVar.adapter;
        if (md == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            md = null;
        }
        vd vdVarIk = md.Ik();
        if (vdVarIk.xMQ() == vd.n.f10734t) {
            UO6.w6 w6VarN = vdVarIk.n();
            Intrinsics.checkNotNull(w6VarN);
            w6VarN.xMQ(pl);
            for (Button button : qfVar.C().keySet()) {
                button.setActivated(Intrinsics.areEqual(view, button));
            }
            qfVar.HBN(w6VarN);
            qfVar.ofS().f9351o.setText(qfVar.m(vdVarIk));
        }
    }

    private final int Jk() {
        Scene scene = this.scene;
        if (scene != null) {
            return scene.getHeight();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit K(qf qfVar, DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        qfVar.G7().n(new j.eh(rWZ.Xo.J2));
        qfVar.G7().n(new j.fuX("share_template_login", null, 2, 0 == true ? 1 : 0));
        dialog.dismiss();
        FragmentActivity activity = qfVar.getActivity();
        if (activity != null) {
            PJ9.DAz.E2(activity, null, 1, null);
        }
        return Unit.INSTANCE;
    }

    private final double Mx() {
        Scene scene = this.scene;
        if (scene != null) {
            return ((double) SceneKt.getDuration(scene)) / 1000.0d;
        }
        return 0.0d;
    }

    private final Pair Org(int shortDimension) {
        if (this.scene == null) {
            return null;
        }
        return mYa() < Jk() ? TuplesKt.to(Integer.valueOf(shortDimension), Integer.valueOf((shortDimension * Rl()) / qm())) : TuplesKt.to(Integer.valueOf((Rl() * shortDimension) / qm()), Integer.valueOf(shortDimension));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Po6(qf qfVar, List sceneMediaInfoList) {
        RecyclerView recyclerView;
        Intrinsics.checkNotNullParameter(sceneMediaInfoList, "sceneMediaInfoList");
        qfVar.isMultiSelect = true;
        ArrayList arrayList = new ArrayList();
        Iterator it = sceneMediaInfoList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            for (Map.Entry entry : ((Map) it.next()).entrySet()) {
                String mime = ((MediaUriInfo) entry.getValue()).getMime();
                if (mime == null) {
                    mime = "";
                }
                if (!arrayList.contains(entry.getKey())) {
                    if (StringsKt.startsWith$default(mime, "video", false, 2, (Object) null)) {
                        qfVar.videoSize += ((MediaUriInfo) entry.getValue()).getSize();
                        arrayList.add(entry.getKey());
                    } else if (StringsKt.startsWith$default(mime, "image", false, 2, (Object) null)) {
                        qfVar.imageSize += ((MediaUriInfo) entry.getValue()).getSize();
                        arrayList.add(entry.getKey());
                    } else if (StringsKt.startsWith$default(mime, "audio", false, 2, (Object) null)) {
                        qfVar.audioSize += ((MediaUriInfo) entry.getValue()).getSize();
                        arrayList.add(entry.getKey());
                    }
                }
            }
        }
        T t3 = qfVar._binding;
        RecyclerView.Adapter adapter = (t3 == null || (recyclerView = t3.Ik) == null) ? null : recyclerView.getAdapter();
        Md md = adapter instanceof Md ? (Md) adapter : null;
        if (md != null) {
            qfVar.Qu(md.Ik());
        }
        return Unit.INSTANCE;
    }

    private final void QZ6(UO6.w6 exportInfo) {
        com.alightcreative.app.motion.persist.j.INSTANCE.setVideoExportInfo(exportInfo.toString());
    }

    private final UO6.w6 T3L() {
        com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
        if (jVar.getImgSeExportInfo().length() <= 0) {
            UO6.w6 w6Var = new UO6.w6(vd.n.J2.rl(), 360, 360, j.Pl.f45833O, j.fuX.f45850n, j.Ml.f45832t, 80, false, false, 256, null);
            Pair pairN7b = n7b(360);
            if (pairN7b != null) {
                int iIntValue = ((Number) pairN7b.component1()).intValue();
                int iIntValue2 = ((Number) pairN7b.component2()).intValue();
                w6Var.ty(iIntValue);
                w6Var.qie(iIntValue2);
            }
            jVar.setImgSeExportInfo(w6Var.toString());
            return w6Var;
        }
        UO6.w6 w6VarRl = UO6.Ml.rl(jVar.getImgSeExportInfo());
        if (qm() >= UO6.Ml.n(w6VarRl)) {
            Pair pairN7b2 = n7b(UO6.Ml.n(w6VarRl));
            if (pairN7b2 != null) {
                int iIntValue3 = ((Number) pairN7b2.component1()).intValue();
                int iIntValue4 = ((Number) pairN7b2.component2()).intValue();
                w6VarRl.ty(iIntValue3);
                w6VarRl.qie(iIntValue4);
            }
            return w6VarRl;
        }
        Pair pairN7b3 = n7b(qm());
        if (pairN7b3 != null) {
            int iIntValue5 = ((Number) pairN7b3.component1()).intValue();
            int iIntValue6 = ((Number) pairN7b3.component2()).intValue();
            w6VarRl.ty(iIntValue5);
            w6VarRl.qie(iIntValue6);
        }
        w6VarRl.az(true);
        return w6VarRl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit UhV(qf qfVar, DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        qfVar.G7().n(new j.eh(rWZ.Xo.f73075t));
        qfVar.G7().n(new j.fuX("share_projectpkg_login", null, 2, 0 == true ? 1 : 0));
        dialog.dismiss();
        FragmentActivity activity = qfVar.getActivity();
        if (activity != null) {
            PJ9.DAz.E2(activity, null, 1, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Vvq(qf qfVar, CompoundButton button, boolean z2) {
        Intrinsics.checkNotNullParameter(button, "button");
        qfVar.lLA(button.isChecked());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String VwL() {
        return "Failed to query the purchase state.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit W(qf qfVar, DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        qfVar.isSignInRequested = true;
        qfVar.G7().n(new j.eh(rWZ.Xo.f73073o));
        qfVar.G7().n(new j.fuX("share_projectpkg_login", null));
        dialog.dismiss();
        FragmentActivity activity = qfVar.getActivity();
        if (activity != null) {
            PJ9.DAz.E2(activity, null, 1, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X4T(vd.n type) {
        boolean z2 = type == vd.n.f10734t;
        nYs.j jVarInvoke = ul().invoke();
        boolean z3 = (jVarInvoke == null || jVarInvoke.s7N()) ? false : true;
        LinearLayout templateExportToggleContainer = ofS().f9338J;
        Intrinsics.checkNotNullExpressionValue(templateExportToggleContainer, "templateExportToggleContainer");
        templateExportToggleContainer.setVisibility(z2 && !z3 ? 0 : 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void Zmq() {
        List listEmptyList;
        List<ExportUIMenuItem> listN;
        List listEmptyList2;
        List listEmptyList3;
        Object next;
        Context context = getContext();
        if (context == null) {
            return;
        }
        List list = this.currentLicenses;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("currentLicenses");
            list = null;
        }
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((LicenseInfo) it.next()).getType() == LicenseType.Subscription) {
                    break;
                }
            }
        }
        TextView exportWatchAnAdText = ofS().f9352r;
        Intrinsics.checkNotNullExpressionValue(exportWatchAnAdText, "exportWatchAnAdText");
        exportWatchAnAdText.setVisibility(8);
        QYU.j jVar = QYU.j.f8224t;
        for (Map.Entry entry : C().entrySet()) {
            Object key = entry.getKey();
            Intrinsics.checkNotNullExpressionValue(key, "component1(...)");
            final j.Pl pl = (j.Pl) entry.getValue();
            ((Button) key).setOnClickListener(new View.OnClickListener() { // from class: UO6.Ew
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    qf.JVN(this.f10659n, pl, view);
                }
            });
        }
        for (Map.Entry entry2 : fcU().entrySet()) {
            Object key2 = entry2.getKey();
            Intrinsics.checkNotNullExpressionValue(key2, "component1(...)");
            final j.fuX fux = (j.fuX) entry2.getValue();
            ((Button) key2).setOnClickListener(new View.OnClickListener() { // from class: UO6.DAz
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    qf.xVH(this.f10656n, fux, view);
                }
            });
        }
        for (Map.Entry entry3 : eWT().entrySet()) {
            Object key3 = entry3.getKey();
            Intrinsics.checkNotNullExpressionValue(key3, "component1(...)");
            final Button button = (Button) key3;
            final j.Ml ml = (j.Ml) entry3.getValue();
            button.setOnClickListener(new View.OnClickListener() { // from class: UO6.u
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    qf.EF(this.f10718n, ml, button, view);
                }
            });
        }
        ofS().M7.setOnSeekBarChangeListener(new Ml());
        if (this.scene != null) {
            UO6.w6 w6VarBu = Bu();
            UO6.w6 w6VarMI = mI();
            UO6.w6 w6VarT3L = T3L();
            Map map = this.exportInfoPreferences;
            map.put(vd.n.f10734t, w6VarBu);
            map.put(vd.n.f10733r, w6VarMI);
            map.put(vd.n.J2, w6VarT3L);
        }
        nYs.j jVarInvoke = ul().invoke();
        if (jVarInvoke == null || (listEmptyList = jVarInvoke.ck()) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        List listN2 = Lu.n(listEmptyList, this.exportInfoPreferences);
        Bundle arguments = getArguments();
        ArrayList<Integer> integerArrayList = arguments != null ? arguments.getIntegerArrayList("exportList") : null;
        if (integerArrayList != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : listN2) {
                if (integerArrayList.contains(Integer.valueOf(((vd) obj).xMQ().rl()))) {
                    arrayList.add(obj);
                }
            }
            listN2 = arrayList;
        }
        if (requireArguments().getBoolean("isMultiProjectExport")) {
            nYs.j jVarInvoke2 = ul().invoke();
            if (jVarInvoke2 == null || (listN = jVarInvoke2.ty()) == null) {
                listN = nYs.n.rl();
            } else {
                if (listN.isEmpty()) {
                    listN = nYs.n.rl();
                }
                if (listN == null) {
                }
            }
        } else {
            nYs.j jVarInvoke3 = ul().invoke();
            if (jVarInvoke3 == null || (listN = jVarInvoke3.az()) == null) {
                listN = nYs.n.n();
            } else {
                if (listN.isEmpty()) {
                    listN = nYs.n.n();
                }
                if (listN == null) {
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (ExportUIMenuItem exportUIMenuItem : listN) {
            Iterator it2 = listN2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (((vd) next).t() == exportUIMenuItem) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            vd vdVar = (vd) next;
            if (vdVar != null) {
                arrayList2.add(vdVar);
            }
        }
        Scene scene = this.scene;
        if (scene == null) {
            listEmptyList2 = CollectionsKt.emptyList();
        } else {
            List listRl = iwV.rl(SceneKt.hasAnyVideo(scene));
            if (listRl == null || !listRl.isEmpty()) {
                Iterator it3 = listRl.iterator();
                while (it3.hasNext()) {
                    if (((w6O) it3.next()).t() == qm()) {
                        break;
                    }
                }
                this.customShortDimension = qm();
                listRl = CollectionsKt.plus((Collection<? extends w6O>) listRl, new w6O(qm(), null, null, 6, null));
                listEmptyList2 = CollectionsKt.sortedWith(listRl, new fuX());
                if (listEmptyList2 == null) {
                }
            } else {
                this.customShortDimension = qm();
                listRl = CollectionsKt.plus((Collection<? extends w6O>) listRl, new w6O(qm(), null, null, 6, null));
                listEmptyList2 = CollectionsKt.sortedWith(listRl, new fuX());
                if (listEmptyList2 == null) {
                }
            }
        }
        final List list2 = listEmptyList2;
        if (this.scene != null) {
            j.o[] oVarArrValues = j.o.values();
            ArrayList arrayList3 = new ArrayList(oVarArrValues.length);
            for (j.o oVar : oVarArrValues) {
                arrayList3.add(Integer.valueOf(oVar.rl()));
            }
            Set setPlus = SetsKt.plus((Set<? extends Integer>) CollectionsKt.toSet(arrayList3), Integer.valueOf(qm()));
            ArrayList arrayList4 = new ArrayList();
            for (Object obj2 : setPlus) {
                if (((Number) obj2).intValue() <= qm()) {
                    arrayList4.add(obj2);
                }
            }
            List listSortedDescending = CollectionsKt.sortedDescending(arrayList4);
            listEmptyList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSortedDescending, 10));
            Iterator it4 = listSortedDescending.iterator();
            while (it4.hasNext()) {
                int iIntValue = ((Number) it4.next()).intValue();
                Pair pair = mYa() < Jk() ? TuplesKt.to(Integer.valueOf(iIntValue), Integer.valueOf((Rl() * iIntValue) / qm())) : TuplesKt.to(Integer.valueOf((Rl() * iIntValue) / qm()), Integer.valueOf(iIntValue));
                listEmptyList3.add(new w6O(iIntValue, ((Number) pair.component1()).intValue() + "x" + ((Number) pair.component2()).intValue(), null, 4, null));
            }
        } else {
            listEmptyList3 = CollectionsKt.emptyList();
        }
        final List list3 = listEmptyList3;
        ofS().Ik.setLayoutManager(new LinearLayoutManager(getActivity(), 1, false));
        Function1 function1 = new Function1() { // from class: UO6.Wre
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                return qf.uG(this.f10672n, list2, list3, (vd) obj3);
            }
        };
        I28 i28 = new I28(this);
        Wre wre = new Wre(this);
        CN3 cn3 = new CN3(this);
        int iPJg = pJg();
        Set set = this.currentBenefits;
        if (set == null) {
            Intrinsics.throwUninitializedPropertyAccessException("currentBenefits");
            set = null;
        }
        this.adapter = new Md(context, arrayList2, function1, i28, wre, cn3, iPJg, list3, list2, set);
        RecyclerView recyclerView = ofS().Ik;
        Md md = this.adapter;
        if (md == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            md = null;
        }
        recyclerView.setAdapter(md);
        ofS().f9333B.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: UO6.CN3
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                qf.Vvq(this.f10655n, compoundButton, z2);
            }
        });
        Md md2 = this.adapter;
        if (md2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            md2 = null;
        }
        Qu(md2.Ik());
        vd vdVar2 = (vd) CollectionsKt.firstOrNull((List) arrayList2);
        X4T(vdVar2 != null ? vdVar2.xMQ() : null);
        ofS().HI.setOnClickListener(new View.OnClickListener() { // from class: UO6.fuX
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                qf.y(this.f10682n, view);
            }
        });
        ofS().nr.setOnClickListener(new View.OnClickListener() { // from class: UO6.Dsr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                qf.Zn(this.f10658n, view);
            }
        });
        ofS().f9353t.setOnClickListener(new View.OnClickListener() { // from class: UO6.aC
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                qf.nO(this.f10676n, view);
            }
        });
        ofS().f9334D.setOnClickListener(new View.OnClickListener() { // from class: UO6.C
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                qf.vl(this.f10654n, view);
            }
        });
        File cacheDir = context.getCacheDir();
        Intrinsics.checkNotNullExpressionValue(cacheDir, "getCacheDir(...)");
        File fileResolve = FilesKt.resolve(cacheDir, "export");
        if (!fileResolve.exists()) {
            fileResolve.mkdir();
        }
        File cacheDir2 = context.getCacheDir();
        Intrinsics.checkNotNullExpressionValue(cacheDir2, "getCacheDir(...)");
        StatFs statFs = new StatFs(FilesKt.resolve(cacheDir2, "export").getAbsolutePath());
        long availableBlocksLong = statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
        ofS().rl.setText(com.alightcreative.app.motion.activities.lej.rl(availableBlocksLong, true));
        ofS().nHg.setText(com.alightcreative.app.motion.activities.lej.rl(availableBlocksLong, true));
        ofS().f9337I.setOnClickListener(new View.OnClickListener() { // from class: UO6.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                qf.v0j(this.f10691n, view);
            }
        });
        ResolutionDropdown resolutionDropdown = ofS().f9335E;
        resolutionDropdown.setItems(list2);
        resolutionDropdown.setOnItemSelectedListener(new Function1() { // from class: UO6.nKK
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                return qf.o9(this.f10690n, (w6O) obj3);
            }
        });
    }

    private final void a63(UO6.w6 exportInfo) {
        Pair pairOrg;
        int i2;
        com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
        UO6.w6 w6VarRl = UO6.Ml.rl(jVar.getGifExportInfo());
        if ((exportInfo.Uo() || ((i2 = this.customShortDimension) != 0 && i2 == UO6.Ml.n(exportInfo))) && (pairOrg = Org(UO6.Ml.n(w6VarRl))) != null) {
            int iIntValue = ((Number) pairOrg.component1()).intValue();
            int iIntValue2 = ((Number) pairOrg.component2()).intValue();
            exportInfo.ty(iIntValue);
            exportInfo.qie(iIntValue2);
        }
        jVar.setGifExportInfo(exportInfo.toString());
    }

    private final Map eWT() {
        return (Map) this.frameRates.getValue();
    }

    private final Map fcU() {
        return (Map) this.formats.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit hRu(qf qfVar, DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        qfVar.G7().n(new j.Z5b(rWZ.Pl.f73064t));
        qfVar.G7().n(new j.fuX("share_projectpkg_logincancel", null, 2, 0 == true ? 1 : 0));
        dialog.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(qf qfVar, DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        qfVar.G7().n(new j.Z5b(rWZ.Pl.f73064t));
        qfVar.G7().n(new j.fuX("share_template_logincancel", null));
        dialog.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit kSg(qf qfVar, DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        qfVar.G7().n(new j.Z5b(rWZ.Pl.f73060O));
        qfVar.G7().n(new j.fuX("share_projectpkg_logincancel", null));
        dialog.dismiss();
        return Unit.INSTANCE;
    }

    private final UO6.w6 mI() {
        com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
        if (jVar.getGifExportInfo().length() <= 0) {
            UO6.w6 w6Var = new UO6.w6(vd.n.f10733r.rl(), 180, 180, j.Pl.f45833O, j.fuX.f45849O, j.Ml.f45832t, 50, false, false, 256, null);
            Pair pairOrg = Org(180);
            if (pairOrg != null) {
                int iIntValue = ((Number) pairOrg.component1()).intValue();
                int iIntValue2 = ((Number) pairOrg.component2()).intValue();
                w6Var.ty(iIntValue);
                w6Var.qie(iIntValue2);
            }
            jVar.setGifExportInfo(w6Var.toString());
            return w6Var;
        }
        UO6.w6 w6VarRl = UO6.Ml.rl(jVar.getGifExportInfo());
        if (qm() >= UO6.Ml.n(w6VarRl)) {
            Pair pairOrg2 = Org(UO6.Ml.n(w6VarRl));
            if (pairOrg2 != null) {
                int iIntValue3 = ((Number) pairOrg2.component1()).intValue();
                int iIntValue4 = ((Number) pairOrg2.component2()).intValue();
                w6VarRl.ty(iIntValue3);
                w6VarRl.qie(iIntValue4);
            }
            return w6VarRl;
        }
        Pair pairOrg3 = Org(qm());
        if (pairOrg3 != null) {
            int iIntValue5 = ((Number) pairOrg3.component1()).intValue();
            int iIntValue6 = ((Number) pairOrg3.component2()).intValue();
            w6VarRl.ty(iIntValue5);
            w6VarRl.qie(iIntValue6);
        }
        w6VarRl.az(true);
        return w6VarRl;
    }

    private final int mYa() {
        Scene scene = this.scene;
        if (scene != null) {
            return scene.getWidth();
        }
        return 0;
    }

    private final Pair n7b(int shortDimension) {
        if (this.scene == null) {
            return null;
        }
        return mYa() > Jk() ? TuplesKt.to(Integer.valueOf((mYa() * shortDimension) / Jk()), Integer.valueOf(shortDimension)) : TuplesKt.to(Integer.valueOf(shortDimension), Integer.valueOf((Jk() * shortDimension) / mYa()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o9(qf qfVar, w6O resolution) {
        Intrinsics.checkNotNullParameter(resolution, "resolution");
        qfVar.ER(resolution.t());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T ofS() {
        T t3 = this._binding;
        Intrinsics.checkNotNull(t3);
        return t3;
    }

    private final void p0N() {
        new AlertDialog.Builder(getContext()).setTitle(2132019041).setMessage(2132019042).setPositiveButton(2132017378, new DialogInterface.OnClickListener() { // from class: UO6.SPz
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                qf.Uf(dialogInterface, i2);
            }
        }).create().show();
    }

    private final int pJg() {
        Scene scene = this.scene;
        return scene != null ? scene.getFramesPerHundredSeconds() : AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void tFV(qf qfVar, com.alightcreative.account.o it) {
        Intrinsics.checkNotNullParameter(it, "it");
        int i2 = w6.$EnumSwitchMapping$0[it.xMQ().ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                XoT.C.mUb(qfVar, new Function0() { // from class: UO6.qz
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return qf.VwL();
                    }
                });
                return;
            } else {
                if (i2 != 3 && i2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
        }
        Set setUo = qfVar.n1().Uo();
        Set set = qfVar.currentBenefits;
        List list = null;
        if (set == null) {
            Intrinsics.throwUninitializedPropertyAccessException("currentBenefits");
            set = null;
        }
        if (Intrinsics.areEqual(setUo, set)) {
            List listIk = qfVar.n1().Ik();
            List list2 = qfVar.currentLicenses;
            if (list2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("currentLicenses");
            } else {
                list = list2;
            }
            if (Intrinsics.areEqual(listIk, list)) {
                return;
            }
        }
        qfVar.ub();
        qfVar.Zmq();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit tUK(qf qfVar, FragmentActivity it) {
        FrameLayout frameLayout;
        Intrinsics.checkNotNullParameter(it, "it");
        T t3 = qfVar._binding;
        if (t3 != null && (frameLayout = t3.f9345X) != null) {
            frameLayout.setVisibility(8);
        }
        qfVar.isLoading = false;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit uG(qf qfVar, List list, List list2, vd it) {
        Intrinsics.checkNotNullParameter(it, "it");
        int i2 = w6.$EnumSwitchMapping$1[it.xMQ().ordinal()];
        if (i2 == 1) {
            qfVar.ofS().f9335E.setItems(list);
        } else if (i2 == 2) {
            qfVar.ofS().f9335E.setItems(list2);
        } else if (i2 == 4) {
        }
        qfVar.f();
        qfVar.UF(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void xVH(qf qfVar, j.fuX fux, View view) {
        Md md = qfVar.adapter;
        if (md == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            md = null;
        }
        vd vdVarIk = md.Ik();
        if (vdVarIk.xMQ() == vd.n.J2) {
            UO6.w6 w6VarN = vdVarIk.n();
            Intrinsics.checkNotNull(w6VarN);
            w6VarN.mUb(fux);
            qfVar.ofS().M7.setEnabled(fux != j.fuX.f45850n);
            for (Button button : qfVar.fcU().keySet()) {
                button.setActivated(Intrinsics.areEqual(view, button));
            }
            qfVar.ofS().f9351o.setText(qfVar.m(vdVarIk));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(qf qfVar, View view) {
        Md md = qfVar.adapter;
        if (md == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            md = null;
        }
        qfVar.EWS(md.Ik());
    }

    public final QmE.iF G7() {
        QmE.iF iFVar = this.eventLogger;
        if (iFVar != null) {
            return iFVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final kgE.fuX n1() {
        kgE.fuX fux = this.iapManager;
        if (fux != null) {
            return fux;
        }
        Intrinsics.throwUninitializedPropertyAccessException("iapManager");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this._binding = T.t(inflater, container, false);
        ConstraintLayout constraintLayoutRl = ofS().getRoot();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutRl, "getRoot(...)");
        return constraintLayoutRl;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        if (this.scene != null) {
            QZ6((UO6.w6) MapsKt.getValue(this.exportInfoPreferences, vd.n.f10734t));
            a63((UO6.w6) MapsKt.getValue(this.exportInfoPreferences, vd.n.f10733r));
            F((UO6.w6) MapsKt.getValue(this.exportInfoPreferences, vd.n.J2));
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ub();
        Zmq();
        Sis.gh(this.purchaseStateObserver);
    }

    public final nYs.Ml ul() {
        nYs.Ml ml = this.getAlightSettingsUseCase;
        if (ml != null) {
            return ml;
        }
        Intrinsics.throwUninitializedPropertyAccessException("getAlightSettingsUseCase");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List HV(String[] strArr, final qf qfVar) {
        return SequencesKt.toList(SequencesKt.mapNotNull(ArraysKt.asSequence(strArr), new Function1() { // from class: UO6.s4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return qf.GD(this.f10716n, (String) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Qu(vd item) {
        int i2 = w6.$EnumSwitchMapping$1[item.xMQ().ordinal()];
        if (i2 != 5 && i2 != 6 && i2 != 7) {
            ofS().bzg.setVisibility(8);
            ofS().s7N.setVisibility(0);
            ofS().f9354v.setText(m(item));
        } else {
            ofS().bzg.setVisibility(0);
            ofS().s7N.setVisibility(8);
            ofS().jB.setText(com.alightcreative.app.motion.activities.lej.rl(this.videoSize, true));
            ofS().rV9.setText(com.alightcreative.app.motion.activities.lej.rl(this.imageSize, true));
            ofS().f9340N.setText(com.alightcreative.app.motion.activities.lej.rl(this.audioSize, true));
            ofS().Xw.setText(m(item));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RQ(qf qfVar, DialogInterface dialogInterface) {
        qfVar.ofS().f9333B.setChecked(false);
    }

    private final int Rl() {
        return Math.max(mYa(), Jk());
    }

    private final void UF(vd item) {
        UO6.w6 w6VarN;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i2 = w6.$EnumSwitchMapping$1[item.xMQ().ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    w6VarN = item.n();
                    Intrinsics.checkNotNull(w6VarN);
                } else {
                    return;
                }
            } else {
                w6VarN = item.n();
                Intrinsics.checkNotNull(w6VarN);
            }
        } else {
            w6VarN = item.n();
            Intrinsics.checkNotNull(w6VarN);
        }
        ResolutionDropdown resolutionDropdown = ofS().f9335E;
        Iterator<Object> it = ofS().f9335E.getItems().iterator();
        int i3 = 0;
        while (true) {
            if (it.hasNext()) {
                if (((w6O) it.next()).t() == UO6.Ml.n(w6VarN)) {
                    break;
                } else {
                    i3++;
                }
            } else {
                i3 = -1;
                break;
            }
        }
        resolutionDropdown.setSelectedIndex(i3);
        ofS().E2.setText((iF.n(pJg(), w6VarN.nr()) / 100) + "fps");
        for (Map.Entry entry : C().entrySet()) {
            Button button = (Button) entry.getKey();
            if (entry.getValue() == w6VarN.rl()) {
                z5 = true;
            } else {
                z5 = false;
            }
            button.setActivated(z5);
        }
        for (Map.Entry entry2 : fcU().entrySet()) {
            Button button2 = (Button) entry2.getKey();
            if (entry2.getValue() == w6VarN.t()) {
                z4 = true;
            } else {
                z4 = false;
            }
            button2.setActivated(z4);
        }
        for (Map.Entry entry3 : eWT().entrySet()) {
            Button button3 = (Button) entry3.getKey();
            if (entry3.getValue() == w6VarN.nr()) {
                z3 = true;
            } else {
                z3 = false;
            }
            button3.setActivated(z3);
        }
        ofS().M7.setValue(w6VarN.n());
        if (item.xMQ() == vd.n.J2) {
            AlightSlider alightSlider = ofS().M7;
            if (w6VarN.t() == j.fuX.f45852t) {
                z2 = true;
            } else {
                z2 = false;
            }
            alightSlider.setEnabled(z2);
            ofS().M7.setMinValue(0);
            ofS().M7.setMaxValue(100);
            ofS().eF.setText(String.valueOf(w6VarN.n()));
        } else {
            ofS().M7.setEnabled(true);
            ofS().M7.setMinValue(1);
            ofS().M7.setMaxValue(100);
            HBN(w6VarN);
        }
        ofS().f9351o.setText(m(item));
        int i5 = w6.$EnumSwitchMapping$1[item.xMQ().ordinal()];
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 != 3) {
                    return;
                }
                ofS().f9334D.setText(getResources().getString(2132019400));
                ofS().az.setVisibility(0);
                ofS().KN.setVisibility(8);
                ofS().iF.setVisibility(0);
                ofS().P5.setVisibility(0);
                ofS().WPU.setVisibility(0);
                ofS().gh.setVisibility(8);
                return;
            }
            ofS().f9334D.setText(getResources().getString(2132019338));
            ofS().az.setVisibility(0);
            ofS().KN.setVisibility(8);
            ofS().iF.setVisibility(0);
            ofS().P5.setVisibility(4);
            ofS().WPU.setVisibility(8);
            ofS().gh.setVisibility(0);
            return;
        }
        ofS().f9334D.setText(getResources().getString(2132020422));
        ofS().az.setVisibility(0);
        ofS().KN.setVisibility(0);
        ofS().iF.setVisibility(0);
        ofS().P5.setVisibility(0);
        ofS().WPU.setVisibility(8);
        ofS().gh.setVisibility(8);
        ofS().J2.setEnabled(SceneExporterKt.isEncoderSupported(VideoEncoding.HEVC, w6VarN.J2(), w6VarN.O()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Uf(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Zn(qf qfVar, View view) {
        Vi.CN3 cn3;
        KeyEventDispatcher.Component activity = qfVar.getActivity();
        if (activity instanceof Vi.CN3) {
            cn3 = (Vi.CN3) activity;
        } else {
            cn3 = null;
        }
        if (cn3 != null) {
            cn3.T();
        }
        qfVar.getParentFragmentManager().Zmq();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map eTf(qf qfVar) {
        return MapsKt.mapOf(TuplesKt.to(qfVar.ofS().f9346Z, j.fuX.f45850n), TuplesKt.to(qfVar.ofS().XQ, j.fuX.f45852t));
    }

    private final long ijL(vd vdVar) {
        switch (w6.$EnumSwitchMapping$1[vdVar.xMQ().ordinal()]) {
            case 1:
                UO6.w6 w6VarN = vdVar.n();
                Intrinsics.checkNotNull(w6VarN);
                return AbstractC1473m.t(w6VarN, mYa(), Jk(), pJg(), Mx());
            case 2:
                UO6.w6 w6VarN2 = vdVar.n();
                Intrinsics.checkNotNull(w6VarN2);
                return AbstractC1473m.n(w6VarN2, pJg(), Mx());
            case 3:
                UO6.w6 w6VarN3 = vdVar.n();
                Intrinsics.checkNotNull(w6VarN3);
                return AbstractC1473m.rl(w6VarN3, pJg(), Mx());
            case 4:
                return ((long) mYa()) * ((long) Jk());
            case 5:
            case 6:
            case 7:
                return this.xmlSize + this.videoSize + this.imageSize + this.audioSize;
            case 8:
                return this.xmlSize;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final void lLA(boolean isSwitchedOn) {
        Context context = getContext();
        if (context != null) {
            FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
            Intrinsics.checkNotNullExpressionValue(firebaseAuth, "getInstance(...)");
            if (firebaseAuth.getUid() == null) {
                if (!isSwitchedOn) {
                    return;
                }
                G7().n(new j.qfL(rWZ.Pl.f73060O));
                new R6(context).mUb(2132020173).nr(2132020336).J2(2132017396, new Function1() { // from class: UO6.UGc
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return qf.kSg(this.f10670n, (DialogInterface) obj);
                    }
                }).xMQ(2132020171, new Function1() { // from class: UO6.Q
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return qf.W(this.f10668n, (DialogInterface) obj);
                    }
                }).KN(new DialogInterface.OnDismissListener() { // from class: UO6.r
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        qf.RQ(this.f10715n, dialogInterface);
                    }
                }).gh();
                return;
            }
            if (isSwitchedOn) {
                G7().n(j.e.f8495n);
            } else {
                G7().n(j.cF.f8486n);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String m(vd vdVar) {
        return com.alightcreative.app.motion.activities.lej.rl(ijL(vdVar), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nO(qf qfVar, View view) {
        qfVar.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map piY(qf qfVar) {
        return MapsKt.mapOf(TuplesKt.to(qfVar.ofS().f9341O, j.Pl.f45834n), TuplesKt.to(qfVar.ofS().J2, j.Pl.f45836t));
    }

    private final int qm() {
        return Math.min(mYa(), Jk());
    }

    private final void ub() {
        this.currentBenefits = n1().Uo();
        this.currentLicenses = n1().Ik();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v0j(qf qfVar, View view) {
        qfVar.p0N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void vl(qf qfVar, View view) {
        if (qfVar.ofS().f9353t.getVisibility() == 0) {
            qfVar.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map xg(qf qfVar) {
        return MapsKt.mapOf(TuplesKt.to(qfVar.ofS().ViF, j.Ml.f45830n), TuplesKt.to(qfVar.ofS().nY, j.Ml.f45832t), TuplesKt.to(qfVar.ofS().f9349g, j.Ml.f45829O));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onCreate(Bundle savedInstanceState) {
        Scene sceneUnserializeScene$default;
        String string;
        File fileO;
        long length;
        String text$default;
        final String[] stringArray;
        Map<Uri, MediaUriInfo> mediaInfo;
        long j2;
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        SceneHolder sceneHolderE = HW.C.e(this);
        long j3 = 0;
        if (sceneHolderE == null || (sceneUnserializeScene$default = sceneHolderE.getRootScene()) == null) {
            if (arguments != null && (string = arguments.getString("ProjectID")) != null) {
                try {
                    FragmentActivity activity = getActivity();
                    if (activity != null) {
                        fileO = HI0.afx.o(activity, string);
                    } else {
                        fileO = null;
                    }
                    if (fileO != null) {
                        length = fileO.length();
                    } else {
                        length = 0;
                    }
                    this.xmlSize = length;
                    if (fileO != null && (text$default = FilesKt.readText$default(fileO, null, 1, null)) != null) {
                        sceneUnserializeScene$default = SceneSerializerKt.unserializeScene$default(text$default, false, false, false, 14, null);
                    }
                } catch (MalformedSceneException unused) {
                }
            } else {
                sceneUnserializeScene$default = null;
            }
        }
        this.scene = sceneUnserializeScene$default;
        if (this.xmlSize == 0) {
            if (arguments != null) {
                j2 = arguments.getLong("xmlSize");
            } else {
                j2 = 0;
            }
            this.xmlSize = j2;
        }
        Scene scene = this.scene;
        boolean z2 = false;
        if (scene != null && (mediaInfo = scene.getMediaInfo()) != null) {
            for (Map.Entry<Uri, MediaUriInfo> entry : mediaInfo.entrySet()) {
                String mime = entry.getValue().getMime();
                if (mime == null) {
                    mime = "";
                }
                if (StringsKt.startsWith$default(mime, "video", false, 2, (Object) null)) {
                    this.videoSize += entry.getValue().getSize();
                } else if (StringsKt.startsWith$default(mime, "image", false, 2, (Object) null)) {
                    this.imageSize += entry.getValue().getSize();
                } else if (StringsKt.startsWith$default(mime, "audio", false, 2, (Object) null)) {
                    this.audioSize += entry.getValue().getSize();
                }
            }
        }
        if (arguments != null && (stringArray = arguments.getStringArray("selectedProjectIds")) != null) {
            HI0.qz.nr(null, new Function0() { // from class: UO6.afx
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return qf.HV(stringArray, this);
                }
            }, 1, null).Uo(new Function1() { // from class: UO6.Z
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return qf.Po6(this.f10675n, (List) obj);
                }
            });
        }
        if (arguments != null) {
            j3 = arguments.getLong("multiSelectMediaSize");
        }
        this.multiSelectMediaSize = j3;
        if (arguments != null) {
            z2 = arguments.getBoolean("ShowOverflow");
        }
        this.showOverflow = z2;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        Sis.ty(this.purchaseStateObserver);
        this._binding = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.isSignInRequested) {
            FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
            Intrinsics.checkNotNullExpressionValue(firebaseAuth, "getInstance(...)");
            if (firebaseAuth.getUid() != null) {
                ofS().f9333B.setChecked(true);
            }
            this.isSignInRequested = false;
        }
    }
}
