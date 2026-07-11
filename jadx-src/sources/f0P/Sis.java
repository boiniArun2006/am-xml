package f0P;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.alightcreative.app.motion.scene.Keyable;
import com.alightcreative.app.motion.scene.SceneElement;
import com.alightcreative.app.motion.scene.animators.Animator;
import com.alightcreative.app.motion.scene.animators.AnimatorKt;
import com.alightcreative.app.motion.scene.animators.AnimatorOf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class Sis extends BaseAdapter {
    private final Function3 J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Function0 f64699O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final SceneElement f64700n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final List f64701r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final List f64702t;

    public static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final AnimatorOf f64703n;
        private final oA.j rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Animator f64704t;

        public j(AnimatorOf animatorOf, oA.j animatorRef, Animator animator) {
            Intrinsics.checkNotNullParameter(animatorOf, "animatorOf");
            Intrinsics.checkNotNullParameter(animatorRef, "animatorRef");
            Intrinsics.checkNotNullParameter(animator, "animator");
            this.f64703n = animatorOf;
            this.rl = animatorRef;
            this.f64704t = animator;
        }

        public final Animator n() {
            return this.f64704t;
        }

        public final AnimatorOf rl() {
            return this.f64703n;
        }

        public final oA.j t() {
            return this.rl;
        }
    }

    @Override // android.widget.Adapter
    public long getItemId(int i2) {
        return i2;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 2;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    public Sis(SceneElement element, List keyableSettings, Function0 onAddAnimatorClickListener, Function3 onAnimatorSettingsClickListener) {
        Iterator it;
        ArrayList arrayList;
        List animators;
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(keyableSettings, "keyableSettings");
        Intrinsics.checkNotNullParameter(onAddAnimatorClickListener, "onAddAnimatorClickListener");
        Intrinsics.checkNotNullParameter(onAnimatorSettingsClickListener, "onAnimatorSettingsClickListener");
        this.f64700n = element;
        this.f64702t = keyableSettings;
        this.f64699O = onAddAnimatorClickListener;
        this.J2 = onAnimatorSettingsClickListener;
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = keyableSettings.iterator();
        while (it2.hasNext()) {
            F8 f8 = (F8) it2.next();
            Keyable keyable = (Keyable) f8.rl().O(this.f64700n);
            if (keyable == null || (animators = keyable.getAnimators()) == null) {
                it = it2;
                arrayList = null;
            } else {
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(animators, 10));
                int i2 = 0;
                for (Object obj : animators) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    AnimatorOf animatorOfN = f8.n();
                    oA.j jVarRl = f8.rl();
                    n nVar = new PropertyReference1Impl() { // from class: f0P.Sis.n
                        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                        public Object get(Object obj2) {
                            return ((Keyable) obj2).getAnimators();
                        }
                    };
                    oA.aC aCVar = new oA.aC(Reflection.getOrCreateKotlinClass(SceneElement.class), nVar.getReturnType(), jVarRl, nVar);
                    KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SceneElement.class);
                    KType type = aCVar.nr().getArguments().get(0).getType();
                    Intrinsics.checkNotNull(type);
                    arrayList.add(new j(animatorOfN, new oA.w6(orCreateKotlinClass, type, aCVar, i2), (Animator) obj));
                    it2 = it2;
                    i2 = i3;
                }
                it = it2;
            }
            if (arrayList != null) {
                arrayList2.add(arrayList);
            }
            it2 = it;
        }
        this.f64701r = CollectionsKt.flatten(arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(Sis sis, View view, j jVar, View view2) {
        Function3 function3 = sis.J2;
        Intrinsics.checkNotNull(view);
        function3.invoke(view, jVar.rl(), jVar.t());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nr(Sis sis, View view) {
        sis.f64699O.invoke();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f64701r.size() + 1;
    }

    @Override // android.widget.Adapter
    public View getView(int i2, final View view, ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (i2 >= getCount() - 1) {
            if (view == null) {
                view = LayoutInflater.from(parent.getContext()).inflate(2131558483, parent, false);
            }
            view.setOnClickListener(new View.OnClickListener() { // from class: f0P.yg
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Sis.nr(this.f66376n, view2);
                }
            });
            Intrinsics.checkNotNull(view);
            return view;
        }
        if (view == null) {
            view = LayoutInflater.from(parent.getContext()).inflate(2131558484, parent, false);
        }
        final j jVar = (j) this.f64701r.get(i2);
        TextView textView = (TextView) view.findViewById(2131362061);
        Function1<Context, String> getLabel = AnimatorKt.getInfo(jVar.n()).getGetLabel();
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        textView.setText(getLabel.invoke(context));
        ((ImageView) view.findViewById(2131362066)).setImageResource(AnimatorKt.getIconResource(jVar.rl()));
        view.setOnClickListener(new View.OnClickListener() { // from class: f0P.pO
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Sis.O(this.f66031n, view, jVar, view2);
            }
        });
        Intrinsics.checkNotNull(view);
        return view;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public Void getItem(int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i2) {
        if (i2 >= getCount() - 1) {
            return 1;
        }
        return 0;
    }
}
