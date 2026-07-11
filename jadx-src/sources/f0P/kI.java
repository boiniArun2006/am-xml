package f0P;

import LdY.Ml;
import QmE.j;
import ScC.FuwU.pTYaLzzmJSGAPQ;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.widget.TextViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.alightcreative.app.motion.scene.Scene;
import com.alightcreative.app.motion.scene.SceneElement;
import com.alightcreative.app.motion.scene.SceneElementKt;
import com.alightcreative.app.motion.scene.SceneType;
import com.alightcreative.app.motion.scene.UserElementProperty;
import com.alightcreative.app.motion.scene.animators.AnimatorOf;
import com.alightcreative.app.motion.scene.userparam.DataType;
import com.alightcreative.app.motion.scene.userparam.KeyableUserParameterValue;
import com.bendingspoons.spidersense.data.storageManager.internal.CV.jhotmBbwMbr;
import f0P.kI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u00018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0017¢\u0006\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010$\u001a\u00020\u00138\u0014X\u0094D¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010,\u001a\u00060)R\u00020\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u00100\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00102\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010!R\u001a\u00107\u001a\b\u0012\u0004\u0012\u000204038TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b5\u00106¨\u00069"}, d2 = {"Lf0P/kI;", "Lf0P/NO;", "<init>", "()V", "Landroid/content/Context;", "context", "", "onAttach", "(Landroid/content/Context;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lcom/alightcreative/app/motion/scene/SceneElement;", "el", "piY", "(Lcom/alightcreative/app/motion/scene/SceneElement;)V", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "LSJ0/ozJ;", "p5", "Lkotlin/Lazy;", "y", "()LSJ0/ozJ;", "contentBinding", "eF", "I", "M7", "()I", "layoutResource", "", "E", "Z", "gestureInProgress", "Lf0P/kI$j;", "M", "Lf0P/kI$j;", "adapter", "", "FX", "Ljava/lang/String;", "paramName", "B", "ignoreUpdates", "", "Lf0P/F8;", "lLA", "()Ljava/util/List;", "keyableSettings", "j", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nElementPropertiesFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ElementPropertiesFragment.kt\ncom/alightcreative/app/motion/activities/edit/fragments/ElementPropertiesFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Lens.kt\ncom/alightcreative/lens/LensKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,240:1\n774#2:241\n865#2,2:242\n1611#2,9:244\n1863#2:253\n1864#2:273\n1620#2:274\n143#3:254\n140#3:255\n124#3:256\n143#3:257\n140#3:258\n124#3:259\n143#3:260\n140#3:261\n124#3:262\n143#3:263\n140#3:264\n124#3:265\n143#3:266\n140#3:267\n124#3:268\n143#3:269\n140#3:270\n124#3:271\n1#4:272\n*S KotlinDebug\n*F\n+ 1 ElementPropertiesFragment.kt\ncom/alightcreative/app/motion/activities/edit/fragments/ElementPropertiesFragment\n*L\n61#1:241\n61#1:242,2\n61#1:244,9\n61#1:253\n61#1:273\n61#1:274\n65#1:254\n65#1:255\n65#1:256\n70#1:257\n70#1:258\n70#1:259\n74#1:260\n74#1:261\n74#1:262\n78#1:263\n78#1:264\n78#1:265\n82#1:266\n82#1:267\n82#1:268\n86#1:269\n86#1:270\n86#1:271\n61#1:272\n*E\n"})
public final class kI extends NO {

    /* JADX INFO: renamed from: B, reason: collision with root package name and from kotlin metadata */
    private int ignoreUpdates;

    /* JADX INFO: renamed from: E, reason: collision with root package name and from kotlin metadata */
    private boolean gestureInProgress;

    /* JADX INFO: renamed from: FX, reason: collision with root package name and from kotlin metadata */
    private String paramName;

    /* JADX INFO: renamed from: M, reason: collision with root package name and from kotlin metadata */
    private j adapter;

    /* JADX INFO: renamed from: p5, reason: from kotlin metadata */
    private final Lazy contentBinding = LazyKt.lazy(new Function0() { // from class: f0P.GS
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return kI.Vvq(this.f64242n);
        }
    });

    /* JADX INFO: renamed from: eF, reason: from kotlin metadata */
    private final int layoutResource = 2131558601;

    /* JADX INFO: Access modifiers changed from: private */
    final class j extends RecyclerView.Adapter {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final List f65720n;
        private TextView rl;

        /* JADX INFO: renamed from: f0P.kI$j$j, reason: collision with other inner class name */
        public final class C0895j extends RecyclerView.ViewHolder {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final ViewBinding f65722n;
            final /* synthetic */ j nr;
            private TextWatcher rl;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private Ml.j f65723t;

            /* JADX INFO: renamed from: f0P.kI$j$j$n */
            public static final class n implements TextWatcher {

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                final /* synthetic */ UserElementProperty f65724O;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ kI f65726t;

                @Override // android.text.TextWatcher
                public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i5) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(CharSequence charSequence, int i2, int i3, int i5) {
                }

                n(kI kIVar, UserElementProperty userElementProperty) {
                    this.f65726t = kIVar;
                    this.f65724O = userElementProperty;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final SceneElement rl(UserElementProperty userElementProperty, String str, Scene scene, SceneElement el) {
                    Intrinsics.checkNotNullParameter(scene, "<unused var>");
                    Intrinsics.checkNotNullParameter(el, "el");
                    return SceneElement.copy$default(el, null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, MapsKt.plus(el.getUserElementParamValues(), TuplesKt.to(userElementProperty.getId(), new KeyableUserParameterValue(str))), null, null, null, false, null, null, false, null, null, -536870913, 127, null);
                }

                /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
                @Override // android.text.TextWatcher
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public void afterTextChanged(Editable editable) {
                    String stringValue;
                    Map<String, KeyableUserParameterValue> userElementParamValues;
                    KeyableUserParameterValue keyableUserParameterValue;
                    if (C0895j.this.mUb() == null) {
                        C0895j.this.gh(HW.C.xMQ(this.f65726t));
                    }
                    final String string = ((SJ0.L0y) C0895j.this.xMQ()).f9193t.getText().toString();
                    SceneElement sceneElementNHg = HW.C.nHg(this.f65726t);
                    if (sceneElementNHg == null || (userElementParamValues = sceneElementNHg.getUserElementParamValues()) == null || (keyableUserParameterValue = userElementParamValues.get(this.f65724O.getId())) == null) {
                        stringValue = "";
                    } else {
                        stringValue = keyableUserParameterValue.getDataType() == DataType.STRING ? keyableUserParameterValue.getStringValue() : null;
                        if (stringValue == null) {
                        }
                    }
                    if (Intrinsics.areEqual(string, stringValue)) {
                        return;
                    }
                    this.f65726t.ignoreUpdates++;
                    kI kIVar = this.f65726t;
                    final UserElementProperty userElementProperty = this.f65724O;
                    HW.C.D(kIVar, new Function2() { // from class: f0P.ZY
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return kI.j.C0895j.n.rl(userElementProperty, string, (Scene) obj, (SceneElement) obj2);
                        }
                    });
                }
            }

            /* JADX INFO: renamed from: f0P.kI$j$j$j, reason: collision with other inner class name */
            public /* synthetic */ class C0896j {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[DataType.values().length];
                    try {
                        iArr[DataType.STRING.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0895j(j jVar, ViewBinding itemBinding) {
                super(itemBinding.getRoot());
                Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
                this.nr = jVar;
                this.f65722n = itemBinding;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void KN(C0895j c0895j, View view, boolean z2) {
                Ml.j jVar = c0895j.f65723t;
                if (jVar != null) {
                    jVar.n();
                }
                c0895j.f65723t = null;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final boolean Uo(C0895j c0895j, TextView textView, int i2, KeyEvent keyEvent) {
                Ml.j jVar = c0895j.f65723t;
                if (jVar != null) {
                    jVar.n();
                }
                c0895j.f65723t = null;
                ((SJ0.L0y) c0895j.f65722n).f9193t.clearFocus();
                View itemView = c0895j.itemView;
                Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                HI0.o7q.KN(itemView);
                return false;
            }

            /* JADX WARN: Removed duplicated region for block: B:21:0x00c6  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void J2(UserElementProperty userParameter) {
                String stringValue;
                Map<String, KeyableUserParameterValue> userElementParamValues;
                KeyableUserParameterValue keyableUserParameterValue;
                Intrinsics.checkNotNullParameter(userParameter, "userParameter");
                TextView textView = (TextView) this.itemView.findViewById(2131363477);
                textView.setText(userParameter.getLabel());
                if (Intrinsics.areEqual(userParameter.getId(), kI.this.paramName)) {
                    textView.setTextColor(-16711681);
                    this.nr.HI(textView);
                } else {
                    textView.setTextColor(-1);
                    if (Intrinsics.areEqual(this.nr.qie(), textView)) {
                        this.nr.HI(null);
                    }
                }
                TextViewCompat.KN(textView, kI.this.getResources().getDimensionPixelSize(2131165569), kI.this.getResources().getDimensionPixelSize(2131165568), kI.this.getResources().getDimensionPixelSize(2131165567), 0);
                if (C0896j.$EnumSwitchMapping$0[userParameter.getType().ordinal()] == 1) {
                    ViewBinding viewBinding = this.f65722n;
                    Intrinsics.checkNotNull(viewBinding, "null cannot be cast to non-null type com.alightcreative.app.motion.databinding.EffectSettingTextBinding");
                    EditText editText = ((SJ0.L0y) this.f65722n).f9193t;
                    SceneElement sceneElementNHg = HW.C.nHg(kI.this);
                    if (sceneElementNHg == null || (userElementParamValues = sceneElementNHg.getUserElementParamValues()) == null || (keyableUserParameterValue = userElementParamValues.get(userParameter.getId())) == null) {
                        stringValue = "";
                    } else {
                        stringValue = keyableUserParameterValue.getDataType() == DataType.STRING ? keyableUserParameterValue.getStringValue() : null;
                        if (stringValue == null) {
                        }
                    }
                    editText.setText(stringValue);
                    TextWatcher textWatcher = this.rl;
                    if (textWatcher != null) {
                        ((SJ0.L0y) this.f65722n).f9193t.removeTextChangedListener(textWatcher);
                        this.rl = null;
                    }
                    this.rl = new n(kI.this, userParameter);
                    ((SJ0.L0y) this.f65722n).f9193t.setImeOptions(6);
                    ((SJ0.L0y) this.f65722n).f9193t.setRawInputType(1);
                    ((SJ0.L0y) this.f65722n).f9193t.addTextChangedListener(this.rl);
                    ((SJ0.L0y) this.f65722n).f9193t.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: f0P.jc
                        @Override // android.widget.TextView.OnEditorActionListener
                        public final boolean onEditorAction(TextView textView2, int i2, KeyEvent keyEvent) {
                            return kI.j.C0895j.Uo(this.f65693n, textView2, i2, keyEvent);
                        }
                    });
                    ((SJ0.L0y) this.f65722n).f9193t.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: f0P.TJC
                        @Override // android.view.View.OnFocusChangeListener
                        public final void onFocusChange(View view, boolean z2) {
                            kI.j.C0895j.KN(this.f64745n, view, z2);
                        }
                    });
                }
            }

            public final void gh(Ml.j jVar) {
                this.f65723t = jVar;
            }

            public final Ml.j mUb() {
                return this.f65723t;
            }

            public final ViewBinding xMQ() {
                return this.f65722n;
            }
        }

        public /* synthetic */ class n {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[DataType.values().length];
                try {
                    iArr[DataType.STRING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[DataType.SOLID_COLOR.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0071, code lost:
        
            r2.add(r4);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public j() {
            SceneElement sceneElementNHg = HW.C.nHg(kI.this);
            List<UserElementProperty> listEmptyList = (sceneElementNHg == null || (listEmptyList = SceneElementKt.getSettableUserParams(sceneElementNHg)) == null) ? CollectionsKt.emptyList() : listEmptyList;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listEmptyList, 10));
            Iterator<T> it = listEmptyList.iterator();
            while (it.hasNext()) {
                arrayList.add(((UserElementProperty) it.next()).getId());
            }
            Set<String> set = CollectionsKt.toSet(arrayList);
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(set, 10));
            for (String str : set) {
                for (UserElementProperty userElementProperty : listEmptyList) {
                    if (Intrinsics.areEqual(userElementProperty.getId(), str)) {
                        break;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            this.f65720n = arrayList2;
        }

        public final void HI(TextView textView) {
            this.rl = textView;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: az, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(C0895j holder, int i2) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            holder.J2((UserElementProperty) this.f65720n.get(i2));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f65720n.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i2) {
            int i3 = n.$EnumSwitchMapping$0[((UserElementProperty) this.f65720n.get(i2)).getType().ordinal()];
            if (i3 == 1) {
                return 2131558563;
            }
            if (i3 == 2) {
                return 2131558553;
            }
            throw new UnsupportedOperationException();
        }

        public final TextView qie() {
            return this.rl;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: ty, reason: merged with bridge method [inline-methods] */
        public C0895j onCreateViewHolder(ViewGroup parent, int i2) {
            ViewBinding viewBindingT;
            Intrinsics.checkNotNullParameter(parent, "parent");
            if (i2 == 2131558553) {
                viewBindingT = SJ0.kO4.t(LayoutInflater.from(parent.getContext()), parent, false);
                Intrinsics.checkNotNull(viewBindingT);
            } else {
                if (i2 != 2131558563) {
                    throw new UnsupportedOperationException();
                }
                viewBindingT = SJ0.L0y.t(LayoutInflater.from(parent.getContext()), parent, false);
                Intrinsics.checkNotNull(viewBindingT);
            }
            return new C0895j(this, viewBindingT);
        }
    }

    public /* synthetic */ class n {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

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
        }
    }

    private final SJ0.ozJ y() {
        return (SJ0.ozJ) this.contentBinding.getValue();
    }

    @Override // f0P.Ny
    /* JADX INFO: renamed from: M7, reason: from getter */
    protected int getLayoutResource() {
        return this.layoutResource;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 100) {
            HW.C.v(this, resultCode, data, false, 4, null);
        } else {
            super.onActivityResult(requestCode, resultCode, data);
        }
    }

    @Override // f0P.sK, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        jB().n(new j.fuX("edit_effects", null, 2, null));
    }

    @Override // f0P.Ny, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        this.adapter = new j();
        RecyclerView recyclerView = y().nr;
        j jVar = this.adapter;
        if (jVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            jVar = null;
        }
        recyclerView.setAdapter(jVar);
        nr();
        SceneElement sceneElementNHg = HW.C.nHg(this);
        if (sceneElementNHg == null || sceneElementNHg.getNestedScene().getType() != SceneType.ELEMENT) {
            y().f9586t.setText(2132017748);
        } else {
            y().f9586t.setText(2132017747);
        }
        y().f9586t.setOnClickListener(new View.OnClickListener() { // from class: f0P.XX
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                kI.Zn(this.f65089n, view2);
            }
        });
        y().rl.setOnClickListener(new View.OnClickListener() { // from class: f0P.Bq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                kI.nO(this.f64104n, view2);
            }
        });
    }

    @Override // f0P.Ny
    protected void piY(SceneElement el) {
        Intrinsics.checkNotNullParameter(el, "el");
        int i2 = this.ignoreUpdates;
        if (i2 > 0) {
            this.ignoreUpdates = i2 - 1;
            return;
        }
        if (this.gestureInProgress) {
            return;
        }
        j jVar = this.adapter;
        if (jVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            jVar = null;
        }
        jVar.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SJ0.ozJ Vvq(kI kIVar) {
        SJ0.ozJ ozjN = SJ0.ozJ.n(kIVar.hRu().getChildAt(0));
        Intrinsics.checkNotNullExpressionValue(ozjN, "bind(...)");
        return ozjN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Zn(kI kIVar, View view) {
        HW.C.mUb(kIVar, 2131361909);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nO(kI kIVar, View view) {
        HW.C.mUb(kIVar, 2131361893);
    }

    @Override // f0P.NO
    /* JADX INFO: renamed from: lLA */
    protected List getKeyableSettings() {
        SceneElement sceneElementNHg = HW.C.nHg(this);
        if (sceneElementNHg == null) {
            return CollectionsKt.emptyList();
        }
        List<UserElementProperty> settableUserParams = SceneElementKt.getSettableUserParams(sceneElementNHg);
        ArrayList<UserElementProperty> arrayList = new ArrayList();
        for (Object obj : settableUserParams) {
            if (Intrinsics.areEqual(((UserElementProperty) obj).getId(), this.paramName)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (UserElementProperty userElementProperty : arrayList) {
            F8 f8 = null;
            switch (n.$EnumSwitchMapping$0[userElementProperty.getType().ordinal()]) {
                case 1:
                    AnimatorOf animatorOf = AnimatorOf.Float;
                    Wre wre = new PropertyReference1Impl() { // from class: f0P.kI.Wre
                        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                        public Object get(Object obj2) {
                            return ((SceneElement) obj2).getUserElementParamValues();
                        }
                    };
                    oA.n nVar = new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), wre.getReturnType(), wre);
                    String id = userElementProperty.getId();
                    KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SceneElement.class);
                    KType type = nVar.nr().getArguments().get(0).getType();
                    Intrinsics.checkNotNull(type);
                    oA.Ml ml = new oA.Ml(orCreateKotlinClass, type, nVar, id);
                    CN3 cn3 = new PropertyReference1Impl() { // from class: f0P.kI.CN3
                        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                        public Object get(Object obj2) {
                            return ((KeyableUserParameterValue) obj2).getFloatValue();
                        }
                    };
                    f8 = new F8(animatorOf, new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), cn3.getReturnType(), ml, cn3), null, 4, null);
                    break;
                case 2:
                case 8:
                case 9:
                case 10:
                case 11:
                    break;
                case 3:
                    AnimatorOf animatorOf2 = AnimatorOf.Color;
                    fuX fux = new PropertyReference1Impl() { // from class: f0P.kI.fuX
                        {
                            String str = pTYaLzzmJSGAPQ.NSj;
                        }

                        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                        public Object get(Object obj2) {
                            return ((SceneElement) obj2).getUserElementParamValues();
                        }
                    };
                    oA.n nVar2 = new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), fux.getReturnType(), fux);
                    String id2 = userElementProperty.getId();
                    KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(SceneElement.class);
                    KType type2 = nVar2.nr().getArguments().get(0).getType();
                    Intrinsics.checkNotNull(type2);
                    oA.Ml ml2 = new oA.Ml(orCreateKotlinClass2, type2, nVar2, id2);
                    Dsr dsr = new PropertyReference1Impl() { // from class: f0P.kI.Dsr
                        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                        public Object get(Object obj2) {
                            return ((KeyableUserParameterValue) obj2).getColorValue();
                        }
                    };
                    f8 = new F8(animatorOf2, new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), dsr.getReturnType(), ml2, dsr), null, 4, null);
                    break;
                case 4:
                    AnimatorOf animatorOf3 = AnimatorOf.Location;
                    aC aCVar = new PropertyReference1Impl() { // from class: f0P.kI.aC
                        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                        public Object get(Object obj2) {
                            return ((SceneElement) obj2).getUserElementParamValues();
                        }
                    };
                    oA.n nVar3 = new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), aCVar.getReturnType(), aCVar);
                    String id3 = userElementProperty.getId();
                    KClass orCreateKotlinClass3 = Reflection.getOrCreateKotlinClass(SceneElement.class);
                    KType type3 = nVar3.nr().getArguments().get(0).getType();
                    Intrinsics.checkNotNull(type3);
                    oA.Ml ml3 = new oA.Ml(orCreateKotlinClass3, type3, nVar3, id3);
                    C c2 = new PropertyReference1Impl() { // from class: f0P.kI.C
                        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                        public Object get(Object obj2) {
                            return ((KeyableUserParameterValue) obj2).getVec2DValue();
                        }
                    };
                    f8 = new F8(animatorOf3, new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), c2.getReturnType(), ml3, c2), null, 4, null);
                    break;
                case 5:
                    AnimatorOf animatorOf4 = AnimatorOf.Location;
                    o oVar = new PropertyReference1Impl() { // from class: f0P.kI.o
                        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                        public Object get(Object obj2) {
                            return ((SceneElement) obj2).getUserElementParamValues();
                        }
                    };
                    oA.n nVar4 = new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), oVar.getReturnType(), oVar);
                    String id4 = userElementProperty.getId();
                    KClass orCreateKotlinClass4 = Reflection.getOrCreateKotlinClass(SceneElement.class);
                    KType type4 = nVar4.nr().getArguments().get(0).getType();
                    Intrinsics.checkNotNull(type4);
                    oA.Ml ml4 = new oA.Ml(orCreateKotlinClass4, type4, nVar4, id4);
                    qz qzVar = new PropertyReference1Impl() { // from class: f0P.kI.qz
                        {
                            String str = jhotmBbwMbr.TxfKx;
                        }

                        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                        public Object get(Object obj2) {
                            return ((KeyableUserParameterValue) obj2).getVec3DValue();
                        }
                    };
                    f8 = new F8(animatorOf4, new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), qzVar.getReturnType(), ml4, qzVar), null, 4, null);
                    break;
                case 6:
                    AnimatorOf animatorOf5 = AnimatorOf.Location;
                    Pl pl = new PropertyReference1Impl() { // from class: f0P.kI.Pl
                        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                        public Object get(Object obj2) {
                            return ((SceneElement) obj2).getUserElementParamValues();
                        }
                    };
                    oA.n nVar5 = new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), pl.getReturnType(), pl);
                    String id5 = userElementProperty.getId();
                    KClass orCreateKotlinClass5 = Reflection.getOrCreateKotlinClass(SceneElement.class);
                    KType type5 = nVar5.nr().getArguments().get(0).getType();
                    Intrinsics.checkNotNull(type5);
                    oA.Ml ml5 = new oA.Ml(orCreateKotlinClass5, type5, nVar5, id5);
                    w6 w6Var = new PropertyReference1Impl() { // from class: f0P.kI.w6
                        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                        public Object get(Object obj2) {
                            return ((KeyableUserParameterValue) obj2).getVec4DValue();
                        }
                    };
                    f8 = new F8(animatorOf5, new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), w6Var.getReturnType(), ml5, w6Var), null, 4, null);
                    break;
                case 7:
                    AnimatorOf animatorOf6 = AnimatorOf.Orientation;
                    Ml ml6 = new PropertyReference1Impl() { // from class: f0P.kI.Ml
                        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                        public Object get(Object obj2) {
                            return ((SceneElement) obj2).getUserElementParamValues();
                        }
                    };
                    oA.n nVar6 = new oA.n(Reflection.getOrCreateKotlinClass(SceneElement.class), ml6.getReturnType(), ml6);
                    String id6 = userElementProperty.getId();
                    KClass orCreateKotlinClass6 = Reflection.getOrCreateKotlinClass(SceneElement.class);
                    KType type6 = nVar6.nr().getArguments().get(0).getType();
                    Intrinsics.checkNotNull(type6);
                    oA.Ml ml7 = new oA.Ml(orCreateKotlinClass6, type6, nVar6, id6);
                    I28 i28 = new PropertyReference1Impl() { // from class: f0P.kI.I28
                        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                        public Object get(Object obj2) {
                            return ((KeyableUserParameterValue) obj2).getQuatValue();
                        }
                    };
                    f8 = new F8(animatorOf6, new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), i28.getReturnType(), ml7, i28), null, 4, null);
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
}
