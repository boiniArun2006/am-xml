package f0P;

import HI0.AbstractC1371m;
import LdY.Ml;
import QmE.j;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.RectEvaluator;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentTransaction;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.view.ComponentActivity;
import com.alightcreative.app.motion.scene.Keyable;
import com.alightcreative.app.motion.scene.KeyableKt;
import com.alightcreative.app.motion.scene.Keyframe;
import com.alightcreative.app.motion.scene.Scene;
import com.alightcreative.app.motion.scene.SceneElement;
import com.alightcreative.app.motion.scene.SceneElementKt;
import com.alightcreative.app.motion.scene.SceneHolder;
import com.alightcreative.app.motion.scene.TimeKt;
import com.alightcreative.app.motion.scene.animators.AnimatorInfo;
import com.alightcreative.app.motion.scene.animators.AnimatorKt;
import com.alightcreative.app.motion.scene.animators.AnimatorOf;
import f0P.Ny;
import f0P.P;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import yc.InterfaceC2452g;
import yc.tpM;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\n\b'\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\u0006J9\u0010\u0011\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u000f0\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\u0006J1\u0010\u0016\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00150\r0\u00142\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u0018\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00150\r0\u0014H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001a\u0010\u0006J\u0017\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u001e\u0010\u0006J\u000f\u0010\u001f\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u001f\u0010\u0006J\u000f\u0010 \u001a\u00020\u0007H\u0014¢\u0006\u0004\b \u0010\u0006J\u0017\u0010#\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020!H\u0014¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0007H\u0004¢\u0006\u0004\b%\u0010\u0006R$\u0010,\u001a\u00020&2\u0006\u0010'\u001a\u00020&8\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0016\u0010.\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010)R0\u00101\u001a\u001c\u0012\u0006\b\u0001\u0012\u00020\u000e\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u000f\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R*\u00109\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001028\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R \u0010=\u001a\b\u0012\u0004\u0012\u00020:0\u00148\u0014X\u0094\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b3\u0010\u0019R\u001a\u0010@\u001a\u00020&8\u0014X\u0094D¢\u0006\f\n\u0004\b>\u0010)\u001a\u0004\b?\u0010+R\u0014\u0010D\u001a\u00020A8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0014\u0010F\u001a\u00020A8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bE\u0010CR\u0014\u0010H\u001a\u00020A8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bG\u0010CR\u0014\u0010L\u001a\u00020I8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0014\u0010P\u001a\u00020M8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bN\u0010OR\u0014\u0010R\u001a\u00020M8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010OR\u001a\u0010U\u001a\b\u0012\u0004\u0012\u00020S0\u00148$X¤\u0004¢\u0006\u0006\u001a\u0004\bT\u0010\u0019R\u001a\u0010W\u001a\b\u0012\u0004\u0012\u00020S0\u00148DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bV\u0010\u0019R\u001a\u0010[\u001a\b\u0012\u0004\u0012\u00020\u000b0X8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bY\u0010ZR\u0014\u0010]\u001a\u00020&8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010+R\u0014\u0010_\u001a\u00020&8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b^\u0010+R\u0014\u0010a\u001a\u00020&8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b`\u0010+¨\u0006b"}, d2 = {"Lf0P/NO;", "Lyc/g;", "Lyc/tpM;", "", "Lf0P/Ny;", "<init>", "()V", "", "RQ", "Landroid/view/View;", "listEntryView", "Lcom/alightcreative/app/motion/scene/animators/AnimatorOf;", "animatorOf", "LoA/j;", "Lcom/alightcreative/app/motion/scene/SceneElement;", "Lcom/alightcreative/app/motion/scene/animators/Animator;", "animatorRef", "p0N", "(Landroid/view/View;Lcom/alightcreative/app/motion/scene/animators/AnimatorOf;LoA/j;)V", "HBN", "", "Lcom/alightcreative/app/motion/scene/Keyable;", "ER", "(Lcom/alightcreative/app/motion/scene/animators/AnimatorOf;)Ljava/util/List;", "rl", "()Ljava/util/List;", "gh", "el", "nHg", "(Lcom/alightcreative/app/motion/scene/SceneElement;)V", "B", "FX", "J", "", "tabId", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "(I)V", "W", "", "value", "v", "Z", "mYa", "()Z", "activeKeyframeAtCurrentTime", "Xw", "inflatedAnimatorSettings", "jB", "LoA/j;", "expandedAnimatorLens", "Lkotlin/Function0;", "U", "Lkotlin/jvm/functions/Function0;", "Org", "()Lkotlin/jvm/functions/Function0;", "UF", "(Lkotlin/jvm/functions/Function0;)V", "addKeyframeClickListener", "Lf0P/Ny$j;", "P5", "Ljava/util/List;", "extraTabs", "M7", "E", "supportsAnimation", "Landroid/widget/ImageButton;", "HV", "()Landroid/widget/ImageButton;", "addRemoveKeyframeButton", "kSg", "overflowButton", "How", "easingCurveButton", "Landroid/widget/ListView;", "Po6", "()Landroid/widget/ListView;", "animatorList", "Landroid/widget/FrameLayout;", "hRu", "()Landroid/widget/FrameLayout;", "contentView", "EWS", "animatorSettingsFrame", "Lf0P/F8;", "lLA", "keyableSettings", "UhV", "currentTabSettings", "", "GD", "()Ljava/util/Set;", "allTabAnimatorTypes", "tUK", "enableOverflow", CmcdData.OBJECT_TYPE_INIT_SEGMENT, "disableNonSplittableEasing", "K", "disableOvershoot", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSettingFragmentBase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SettingFragmentBase.kt\ncom/alightcreative/app/motion/activities/edit/fragments/KeyableSettingFragmentBase\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,658:1\n774#2:659\n865#2,2:660\n1557#2:662\n1628#2,3:663\n774#2:666\n865#2,2:667\n1557#2:669\n1628#2,3:670\n1557#2:673\n1628#2,3:674\n774#2:677\n865#2,2:678\n1368#2:680\n1454#2,2:681\n1557#2:683\n1628#2,3:684\n1456#2,3:687\n1557#2:690\n1628#2,3:691\n1611#2,9:694\n1863#2:703\n1864#2:705\n1620#2:706\n1755#2,2:707\n1755#2,3:709\n1757#2:712\n1368#2:713\n1454#2,2:714\n774#2:716\n865#2,2:717\n1557#2:719\n1628#2,3:720\n1456#2,3:723\n1557#2:726\n1628#2,3:727\n626#2,12:730\n774#2:742\n865#2,2:743\n774#2:745\n865#2,2:746\n774#2:748\n865#2,2:749\n774#2:751\n865#2,2:752\n2341#2,14:754\n1755#2,3:768\n1557#2:771\n1628#2,3:772\n1611#2,9:775\n1863#2:784\n1864#2:786\n1620#2:787\n1755#2,2:788\n1755#2,3:790\n1757#2:793\n1797#2,2:794\n295#2,2:796\n1799#2:798\n1797#2,2:799\n295#2,2:801\n1799#2:803\n1797#2,3:804\n1#3:704\n1#3:785\n*S KotlinDebug\n*F\n+ 1 SettingFragmentBase.kt\ncom/alightcreative/app/motion/activities/edit/fragments/KeyableSettingFragmentBase\n*L\n251#1:659\n251#1:660,2\n251#1:662\n251#1:663,3\n254#1:666\n254#1:667,2\n255#1:669\n255#1:670,3\n267#1:673\n267#1:674,3\n268#1:677\n268#1:678,2\n269#1:680\n269#1:681,2\n269#1:683\n269#1:684,3\n269#1:687,3\n272#1:690\n272#1:691,3\n283#1:694,9\n283#1:703\n283#1:705\n283#1:706\n283#1:707,2\n284#1:709,3\n283#1:712\n325#1:713\n325#1:714,2\n326#1:716\n326#1:717,2\n326#1:719\n326#1:720,3\n325#1:723,3\n328#1:726\n328#1:727,3\n362#1:730,12\n414#1:742\n414#1:743,2\n415#1:745\n415#1:746,2\n422#1:748\n422#1:749,2\n423#1:751\n423#1:752,2\n430#1:754,14\n521#1:768,3\n534#1:771\n534#1:772,3\n574#1:775,9\n574#1:784\n574#1:786\n574#1:787\n574#1:788,2\n575#1:790,3\n574#1:793\n450#1:794,2\n453#1:796,2\n450#1:798\n477#1:799,2\n480#1:801,2\n477#1:803\n503#1:804,3\n283#1:704\n574#1:785\n*E\n"})
public abstract class NO extends Ny implements InterfaceC2452g, yc.tpM {

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
    private Function0 addKeyframeClickListener;

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    private boolean inflatedAnimatorSettings;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private oA.j expandedAnimatorLens;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private boolean activeKeyframeAtCurrentTime;

    /* JADX INFO: renamed from: P5, reason: from kotlin metadata */
    private final List extraTabs = CollectionsKt.listOf(new Ny.j(2131363803, 2131231526, 0, 0, null, false, 60, null));

    /* JADX INFO: renamed from: M7, reason: from kotlin metadata */
    private final boolean supportsAnimation = true;

    public static final class Ml extends AnimatorListenerAdapter {
        Ml() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            NO.this.Po6().setVisibility(0);
            NO.this.EWS().setVisibility(4);
        }
    }

    /* synthetic */ class j extends FunctionReferenceImpl implements Function0 {
        j(Object obj) {
            super(0, obj, NO.class, "onAddAutoAnimatorClick", "onAddAutoAnimatorClick()V", 0);
        }

        public final void n() {
            ((NO) this.receiver).RQ();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            n();
            return Unit.INSTANCE;
        }
    }

    /* synthetic */ class n extends FunctionReferenceImpl implements Function3 {
        n(Object obj) {
            super(3, obj, NO.class, "onAnimatorSettingsClick", "onAnimatorSettingsClick(Landroid/view/View;Lcom/alightcreative/app/motion/scene/animators/AnimatorOf;Lcom/alightcreative/lens/Lens;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            n((View) obj, (AnimatorOf) obj2, (oA.j) obj3);
            return Unit.INSTANCE;
        }

        public final void n(View p0, AnimatorOf p1, oA.j p2) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            Intrinsics.checkNotNullParameter(p2, "p2");
            ((NO) this.receiver).p0N(p0, p1, p2);
        }
    }

    public static final class w6 extends ArrayAdapter {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ List f64515n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w6(List list, Context context, List list2) {
            super(context, 2131558673, 2131363108, list2);
            this.f64515n = list;
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i2, View view, ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            View view2 = super.getView(i2, view, parent);
            Intrinsics.checkNotNullExpressionValue(view2, "getView(...)");
            ((ImageView) view2.findViewById(2131362981)).setImageResource(AnimatorKt.getIconResource((AnimatorOf) ((Pair) this.f64515n.get(i2)).getFirst()));
            return view2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.alightcreative.app.motion.scene.animators.Animator ub(com.alightcreative.app.motion.scene.animators.Animator animator) {
        return animator;
    }

    protected boolean K() {
        return false;
    }

    protected boolean i() {
        return false;
    }

    /* JADX INFO: renamed from: lLA */
    protected abstract List getKeyableSettings();

    protected boolean tUK() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement F(oA.j jVar, com.alightcreative.app.motion.scene.animators.Animator animator, Scene scene, SceneElement el) {
        Intrinsics.checkNotNullParameter(scene, "<unused var>");
        Intrinsics.checkNotNullParameter(el, "el");
        Object obj = jVar.get(el);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.alightcreative.app.motion.scene.Keyable<kotlin.Any>");
        return (SceneElement) jVar.rl(el, KeyableKt.copyAddingAnimator((Keyable) obj, animator));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement QZ6(NO no, Scene scene, SceneElement element) {
        Object next;
        SceneElement sceneElement;
        Intrinsics.checkNotNullParameter(scene, "scene");
        Intrinsics.checkNotNullParameter(element, "element");
        for (F8 f8 : no.UhV()) {
            Keyable keyable = (Keyable) f8.rl().get(element);
            if (keyable.getKeyed()) {
                Iterator it = keyable.getKeyframes().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (TimeKt.frameNumberFromTime((int) (((double) element.getStartTime()) + ((double) (((Keyframe) next).getTime() * (element.getEndTime() - element.getStartTime())))), scene.getFramesPerHundredSeconds()) == HW.C.ck(no)) {
                        break;
                    }
                }
                Keyframe keyframe = (Keyframe) next;
                if (keyframe != null && (sceneElement = (SceneElement) f8.rl().rl(element, KeyableKt.copyRemovingKeyframe(keyable, scene, element, keyframe.getTime()))) != null) {
                    element = sceneElement;
                }
            }
        }
        return element;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Qu(NO no, oA.j jVar, SceneElement sceneElement, com.alightcreative.app.motion.scene.animators.Animator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        SceneHolder sceneHolderE = HW.C.e(no);
        if (sceneHolderE != null) {
            sceneHolderE.update((SceneElement) jVar.rl(sceneElement, it));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement T3L(NO no, Scene scene, SceneElement element) {
        Object next;
        SceneElement sceneElement;
        Intrinsics.checkNotNullParameter(scene, "scene");
        Intrinsics.checkNotNullParameter(element, "element");
        for (F8 f8 : no.UhV()) {
            Keyable keyable = (Keyable) f8.rl().get(element);
            if (keyable.getKeyed()) {
                Iterator it = keyable.getKeyframes().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (TimeKt.frameNumberFromTime((int) (((double) element.getStartTime()) + ((double) (((Keyframe) next).getTime() * (element.getEndTime() - element.getStartTime())))), scene.getFramesPerHundredSeconds()) == HW.C.ck(no)) {
                        break;
                    }
                }
                Keyframe keyframe = (Keyframe) next;
                if (keyframe != null && (sceneElement = (SceneElement) f8.rl().rl(element, KeyableKt.copyWithOnlyKeyframe(keyable, scene, element, keyframe.getTime()))) != null) {
                    element = sceneElement;
                }
            }
        }
        return element;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Uf(SJ0.Md md, NO no, View view, View view2) {
        ConstraintLayout animatorSettingsPanel = md.f9222O;
        Intrinsics.checkNotNullExpressionValue(animatorSettingsPanel, "animatorSettingsPanel");
        Rect rect = new Rect(0, 0, no.EWS().getWidth(), no.EWS().getHeight());
        Rect rect2 = new Rect(0, 0, no.EWS().getWidth(), view.getHeight());
        animatorSettingsPanel.setTranslationY(0.0f);
        ObjectAnimator duration = ObjectAnimator.ofObject(animatorSettingsPanel, "clipBounds", new RectEvaluator(new Rect()), rect, rect2).setDuration(200L);
        duration.addListener(no.new Ml());
        duration.start();
        animatorSettingsPanel.animate().translationY((view.getY() - view.getPaddingTop()) - animatorSettingsPanel.getPaddingTop()).setDuration(200L).start();
        no.expandedAnimatorLens = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SceneElement VwL(NO no, Scene scene, SceneElement element) {
        Intrinsics.checkNotNullParameter(scene, "scene");
        Intrinsics.checkNotNullParameter(element, "element");
        no.jB().n(new j.crp(HW.C.ViF(no), rWZ.j.rl(element)));
        for (F8 f8 : no.UhV()) {
            Keyable keyable = (Keyable) f8.rl().O(element);
            if (keyable != null) {
                element = (SceneElement) f8.rl().rl(element, KeyableKt.copyAddingNewKeyframe(keyable, scene, element, SceneElementKt.fractionalTime(element, HW.C.WPU(no))));
            }
        }
        return element;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit tFV(final NO no, ComponentActivity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        HW.C.D(no, new Function2() { // from class: f0P.Pf
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return NO.VwL(this.f64613n, (Scene) obj, (SceneElement) obj2);
            }
        });
        return Unit.INSTANCE;
    }

    @Override // f0P.Ny
    protected void B() {
        if (this.activeKeyframeAtCurrentTime) {
            new AlertDialog.Builder(getActivity()).setTitle(2132017661).setPositiveButton(2132017650, new DialogInterface.OnClickListener() { // from class: f0P.GJj
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    NO.mI(this.f64239n, dialogInterface, i2);
                }
            }).setNegativeButton(2132017396, new DialogInterface.OnClickListener() { // from class: f0P.E3
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    NO.Bu(dialogInterface, i2);
                }
            }).show();
        }
    }

    @Override // f0P.Ny
    /* JADX INFO: renamed from: E, reason: from getter */
    protected boolean getSupportsAnimation() {
        return this.supportsAnimation;
    }

    protected List ER(AnimatorOf animatorOf) {
        Intrinsics.checkNotNullParameter(animatorOf, "animatorOf");
        List keyableSettings = getKeyableSettings();
        ArrayList arrayList = new ArrayList();
        for (Object obj : keyableSettings) {
            if (((F8) obj).n() == animatorOf) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((F8) it.next()).rl());
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: Org, reason: from getter */
    protected final Function0 getAddKeyframeClickListener() {
        return this.addKeyframeClickListener;
    }

    @Override // f0P.Ny
    /* JADX INFO: renamed from: U, reason: from getter */
    protected List getExtraTabs() {
        return this.extraTabs;
    }

    protected final void UF(Function0 function0) {
        this.addKeyframeClickListener = function0;
    }

    /* JADX INFO: renamed from: mYa, reason: from getter */
    protected final boolean getActiveKeyframeAtCurrentTime() {
        return this.activeKeyframeAtCurrentTime;
    }

    @Override // f0P.Ny
    protected void nHg(SceneElement el) {
        List keyframes;
        Intrinsics.checkNotNullParameter(el, "el");
        Scene sceneIF = HW.C.iF(this);
        if (sceneIF != null) {
            int framesPerHundredSeconds = sceneIF.getFramesPerHundredSeconds();
            double endTime = el.getEndTime() - el.getStartTime();
            List listUhV = UhV();
            ArrayList arrayList = new ArrayList();
            Iterator it = listUhV.iterator();
            while (it.hasNext()) {
                Keyable keyable = (Keyable) ((F8) it.next()).rl().O(el);
                if (keyable != null) {
                    arrayList.add(keyable);
                }
            }
            boolean z2 = false;
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                loop1: while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Keyable keyable2 = (Keyable) it2.next();
                    if (keyable2.getKeyed() && ((keyframes = keyable2.getKeyframes()) == null || !keyframes.isEmpty())) {
                        Iterator it3 = keyframes.iterator();
                        while (it3.hasNext()) {
                            if (TimeKt.frameNumberFromTime((int) (((double) el.getStartTime()) + (((double) ((Keyframe) it3.next()).getTime()) * endTime)), framesPerHundredSeconds) == HW.C.ck(this)) {
                                z2 = true;
                                break loop1;
                            }
                        }
                    }
                }
            }
            this.activeKeyframeAtCurrentTime = z2;
            XoT.C.Uo(this, new Function0() { // from class: f0P.KK
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return NO.qm(this.f64424n);
                }
            });
            HV().setImageResource(this.activeKeyframeAtCurrentTime ? 2131231022 : 2131230998);
            Po6().setAdapter((ListAdapter) new Sis(el, getKeyableSettings(), new j(this), new n(this)));
            HBN();
            super.nHg(el);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Bu(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
    }

    private final void HBN() {
        boolean z2;
        float f3;
        if (!isAdded()) {
            return;
        }
        boolean zIsEmpty = getKeyableSettings().isEmpty();
        boolean z3 = !zIsEmpty;
        HV().setEnabled(z3);
        How().setEnabled(z3);
        ImageButton imageButtonKSg = kSg();
        if (eF() && tUK()) {
            z2 = true;
        } else {
            z2 = false;
        }
        imageButtonKSg.setEnabled(z2);
        ImageButton imageButtonHV = HV();
        float f4 = 0.15f;
        if (!zIsEmpty) {
            f3 = 1.0f;
        } else {
            f3 = 0.15f;
        }
        imageButtonHV.setAlpha(f3);
        ImageButton imageButtonHow = How();
        if (!zIsEmpty) {
            f4 = 1.0f;
        }
        imageButtonHow.setAlpha(f4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void RQ() {
        View view = getView();
        if (view == null) {
            return;
        }
        final PopupWindow popupWindowN = AbstractC1371m.n(2131558778, view).n();
        SJ0.a aVarN = SJ0.a.n(view);
        Intrinsics.checkNotNullExpressionValue(aVarN, "bind(...)");
        Set<AnimatorOf> setGD = GD();
        final ArrayList arrayList = new ArrayList();
        for (AnimatorOf animatorOf : setGD) {
            List<AnimatorInfo<Object>> all_animators = AnimatorKt.getALL_ANIMATORS();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : all_animators) {
                if (((AnimatorInfo) obj).getCategories().contains(animatorOf)) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(new Pair(animatorOf, (AnimatorInfo) it.next()));
            }
            CollectionsKt.addAll(arrayList, arrayList3);
        }
        ListView listView = aVarN.rl;
        Context context = view.getContext();
        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Function1<Context, String> getLabel = ((AnimatorInfo) ((Pair) it2.next()).getSecond()).getGetLabel();
            Context context2 = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            arrayList4.add(getLabel.invoke(context2));
        }
        listView.setAdapter((ListAdapter) new w6(arrayList, context, arrayList4));
        aVarN.rl.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: f0P.x6K
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view2, int i2, long j2) {
                NO.a63(popupWindowN, arrayList, this, adapterView, view2, i2, j2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a63(PopupWindow popupWindow, List list, NO no, AdapterView adapterView, View view, int i2, long j2) {
        popupWindow.dismiss();
        Pair pair = (Pair) list.get(i2);
        AnimatorOf animatorOf = (AnimatorOf) pair.component1();
        final com.alightcreative.app.motion.scene.animators.Animator animatorMakeInstance = ((AnimatorInfo) pair.component2()).makeInstance();
        final oA.j jVar = (oA.j) CollectionsKt.first(no.ER(animatorOf));
        HW.C.D(no, new Function2() { // from class: f0P.uQ
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return NO.F(jVar, animatorMakeInstance, (Scene) obj, (SceneElement) obj2);
            }
        });
        no.s7N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(NO no, oA.j jVar, SceneElement sceneElement, View view) {
        no.Po6().setVisibility(0);
        no.EWS().setVisibility(4);
        no.expandedAnimatorLens = null;
        SceneHolder sceneHolderE = HW.C.e(no);
        if (sceneHolderE != null) {
            sceneHolderE.update((SceneElement) jVar.n(sceneElement));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mI(final NO no, DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
        HW.C.D(no, new Function2() { // from class: f0P.Cw1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return NO.T3L(this.f64125n, (Scene) obj, (SceneElement) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p0N(final View listEntryView, AnimatorOf animatorOf, final oA.j animatorRef) {
        final SceneElement sceneElementNHg;
        View view = getView();
        if (view == null || (sceneElementNHg = HW.C.nHg(this)) == null) {
            return;
        }
        this.expandedAnimatorLens = animatorRef;
        Po6().setVisibility(4);
        EWS().setVisibility(0);
        if (!this.inflatedAnimatorSettings) {
            LayoutInflater.from(view.getContext()).inflate(2131558487, (ViewGroup) EWS(), true);
            this.inflatedAnimatorSettings = true;
        }
        final SJ0.Md mdN = SJ0.Md.n(view);
        Intrinsics.checkNotNullExpressionValue(mdN, "bind(...)");
        final com.alightcreative.app.motion.scene.animators.Animator animator = (com.alightcreative.app.motion.scene.animators.Animator) animatorRef.get(sceneElementNHg);
        Object obj = null;
        boolean z2 = false;
        for (Object obj2 : AnimatorKt.getALL_ANIMATORS()) {
            if (Intrinsics.areEqual(((AnimatorInfo) obj2).getAnimatorClass(), Reflection.getOrCreateKotlinClass(animator.getClass()))) {
                if (!z2) {
                    z2 = true;
                    obj = obj2;
                } else {
                    throw new IllegalArgumentException("Collection contains more than one matching element.");
                }
            }
        }
        if (z2) {
            TextView textView = mdN.rl;
            Function1<Context, String> getLabel = AnimatorKt.getInfo((com.alightcreative.app.motion.scene.animators.Animator) animatorRef.get(sceneElementNHg)).getGetLabel();
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            textView.setText(getLabel.invoke(context));
            mdN.J2.setImageResource(AnimatorKt.getIconResource(animatorOf));
            mdN.f9224t.setOnClickListener(new View.OnClickListener() { // from class: f0P.Bg5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    NO.Uf(mdN, this, listEntryView, view2);
                }
            });
            mdN.Uo.setOnClickListener(new View.OnClickListener() { // from class: f0P.GX
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    NO.f(this.f64244n, animatorRef, sceneElementNHg, view2);
                }
            });
            mdN.nr.setAdapter(new yc.nKK((AnimatorInfo) obj, new Function0() { // from class: f0P.wI
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return NO.ub(animator);
                }
            }, new Function1() { // from class: f0P.FP1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj3) {
                    return NO.Qu(this.f64204n, animatorRef, sceneElementNHg, (com.alightcreative.app.motion.scene.animators.Animator) obj3);
                }
            }));
            ConstraintLayout animatorSettingsPanel = mdN.f9222O;
            Intrinsics.checkNotNullExpressionValue(animatorSettingsPanel, "animatorSettingsPanel");
            Rect rect = new Rect(0, 0, EWS().getWidth(), listEntryView.getHeight());
            Rect rect2 = new Rect(0, 0, EWS().getWidth(), EWS().getHeight());
            animatorSettingsPanel.setTranslationY((listEntryView.getY() - listEntryView.getPaddingTop()) - animatorSettingsPanel.getPaddingTop());
            ObjectAnimator.ofObject(animatorSettingsPanel, "clipBounds", new RectEvaluator(new Rect()), rect, rect2).setDuration(200L).start();
            animatorSettingsPanel.animate().translationY(0.0f).setDuration(200L).start();
            return;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String qm(NO no) {
        return "baseRefresh : currentFrame=" + HW.C.ck(no) + " activeKeyframeAtCurrentTime=" + no.activeKeyframeAtCurrentTime;
    }

    protected final FrameLayout EWS() {
        FrameLayout frameLayout;
        if (P5()) {
            frameLayout = rV9().rl;
        } else {
            frameLayout = rV9().HI;
        }
        Intrinsics.checkNotNull(frameLayout);
        return frameLayout;
    }

    @Override // f0P.Ny
    protected void FX() {
        Ml.j jVarXMQ = HW.C.xMQ(this);
        if (this.activeKeyframeAtCurrentTime) {
            HW.C.D(this, new Function2() { // from class: f0P.xB
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return NO.QZ6(this.f66324n, (Scene) obj, (SceneElement) obj2);
                }
            });
        } else {
            bzg().r(xAo.Dsr.f75227n, new Function1() { // from class: f0P.Yl
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return NO.tFV(this.f65125n, (ComponentActivity) obj);
                }
            });
        }
        Function0 function0 = this.addKeyframeClickListener;
        if (function0 != null) {
            function0.invoke();
        }
        jVarXMQ.n();
    }

    protected final Set GD() {
        List keyableSettings = getKeyableSettings();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(keyableSettings, 10));
        Iterator it = keyableSettings.iterator();
        while (it.hasNext()) {
            arrayList.add(((F8) it.next()).n());
        }
        return CollectionsKt.toSet(arrayList);
    }

    protected final ImageButton HV() {
        ImageButton settingsTab5 = rV9().az;
        Intrinsics.checkNotNullExpressionValue(settingsTab5, "settingsTab5");
        return settingsTab5;
    }

    protected final ImageButton How() {
        ImageButton easingCurve = rV9().nr;
        Intrinsics.checkNotNullExpressionValue(easingCurve, "easingCurve");
        return easingCurve;
    }

    @Override // f0P.Ny
    protected void J() {
        SceneElement sceneElementNHg = HW.C.nHg(this);
        if (sceneElementNHg != null) {
            List listUhV = UhV();
            if (listUhV == null || !listUhV.isEmpty()) {
                Iterator it = listUhV.iterator();
                while (it.hasNext()) {
                    if (KeyableKt.getKeyframesIfKeyed((Keyable) ((F8) it.next()).rl().get(sceneElementNHg)).size() >= 2) {
                        if (isAdded()) {
                            FragmentTransaction fragmentTransactionO = getParentFragmentManager().o();
                            P.Companion companion = P.INSTANCE;
                            List listUhV2 = UhV();
                            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listUhV2, 10));
                            Iterator it2 = listUhV2.iterator();
                            while (it2.hasNext()) {
                                arrayList.add(((F8) it2.next()).rl());
                            }
                            fragmentTransactionO.rl(2131362650, companion.n(arrayList, i(), K())).KN(null).mUb();
                            return;
                        }
                        return;
                    }
                }
            }
            HI0.fuX.Uo(this, 2132019750, 2132019749);
        }
    }

    @Override // yc.tpM
    public int O() {
        return tpM.j.n(this);
    }

    protected final ListView Po6() {
        ListView listView;
        if (P5()) {
            listView = rV9().Uo;
        } else {
            listView = rV9().ty;
        }
        Intrinsics.checkNotNull(listView);
        return listView;
    }

    protected final List UhV() {
        if (P5()) {
            List keyableSettings = getKeyableSettings();
            ArrayList arrayList = new ArrayList();
            for (Object obj : keyableSettings) {
                if (((F8) obj).t().contains(Integer.valueOf(getCurrentTabId()))) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        return getKeyableSettings();
    }

    protected final void W() {
        int i2;
        Scene sceneIF;
        List keyframes;
        HW.C.p5(this);
        HW.C.eF(this);
        if (!isAdded()) {
            return;
        }
        SceneElement sceneElementNHg = HW.C.nHg(this);
        if (sceneElementNHg != null && (sceneIF = HW.C.iF(this)) != null) {
            int framesPerHundredSeconds = sceneIF.getFramesPerHundredSeconds();
            double endTime = sceneElementNHg.getEndTime() - sceneElementNHg.getStartTime();
            List listUhV = UhV();
            ArrayList arrayList = new ArrayList();
            Iterator it = listUhV.iterator();
            while (it.hasNext()) {
                Keyable keyable = (Keyable) ((F8) it.next()).rl().O(sceneElementNHg);
                if (keyable != null) {
                    arrayList.add(keyable);
                }
            }
            boolean z2 = false;
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                loop1: while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Keyable keyable2 = (Keyable) it2.next();
                    if (keyable2.getKeyed() && ((keyframes = keyable2.getKeyframes()) == null || !keyframes.isEmpty())) {
                        Iterator it3 = keyframes.iterator();
                        while (it3.hasNext()) {
                            if (TimeKt.frameNumberFromTime((int) (((double) sceneElementNHg.getStartTime()) + (((double) ((Keyframe) it3.next()).getTime()) * endTime)), framesPerHundredSeconds) == HW.C.ck(this)) {
                                z2 = true;
                                break loop1;
                            }
                        }
                    }
                }
            }
            this.activeKeyframeAtCurrentTime = z2;
        }
        ImageButton imageButtonHV = HV();
        if (this.activeKeyframeAtCurrentTime) {
            i2 = 2131231022;
        } else {
            i2 = 2131230998;
        }
        imageButtonHV.setImageResource(i2);
        HBN();
    }

    @Override // f0P.Ny
    protected void a(int tabId) {
        if (tabId == 2131363803) {
            if (this.expandedAnimatorLens != null) {
                Po6().setVisibility(4);
                EWS().setVisibility(0);
                hRu().setVisibility(4);
            } else {
                Po6().setVisibility(0);
                EWS().setVisibility(4);
                hRu().setVisibility(4);
            }
        } else {
            Po6().setVisibility(4);
            EWS().setVisibility(4);
            hRu().setVisibility(0);
        }
        super.a(tabId);
    }

    @Override // yc.InterfaceC2452g
    public void gh() {
        s7N();
    }

    protected final FrameLayout hRu() {
        FrameLayout frameLayout;
        if (P5()) {
            frameLayout = rV9().Ik;
        } else {
            frameLayout = rV9().ck;
        }
        Intrinsics.checkNotNull(frameLayout);
        return frameLayout;
    }

    protected final ImageButton kSg() {
        ImageButton overflow = rV9().KN;
        Intrinsics.checkNotNullExpressionValue(overflow, "overflow");
        return overflow;
    }

    @Override // yc.tpM
    public List rl() {
        List listUhV = UhV();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listUhV, 10));
        Iterator it = listUhV.iterator();
        while (it.hasNext()) {
            arrayList.add(((F8) it.next()).rl());
        }
        return arrayList;
    }
}
