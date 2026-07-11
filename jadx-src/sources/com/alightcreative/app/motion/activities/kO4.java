package com.alightcreative.app.motion.activities;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alightcreative.app.motion.activities.xuv;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class kO4 extends ConstraintLayout {

    /* JADX INFO: renamed from: GR, reason: collision with root package name */
    private final TextView f45307GR;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final View f45308I;
    private Function1 Nxk;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SJ0.gnv f45309a;
    private List dR0;
    private int ijL;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private xuv f45310k;
    private int piY;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private String f45311z;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final j f45306m = new j(null);
    public static final int eTf = 8;
    private static final String xg = "Select an element";

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        protected final String n() {
            return kO4.xg;
        }
    }

    protected static final String getDEFAULT_LABEL() {
        return f45306m.n();
    }

    public abstract xuv.n T(int i2, Object obj);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kO4(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Intrinsics.checkNotNullParameter(context, "context");
        SJ0.gnv gnvVarRl = SJ0.gnv.rl(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(gnvVarRl, "inflate(...)");
        this.f45309a = gnvVarRl;
        LinearLayout dropdownMenu = gnvVarRl.nr;
        Intrinsics.checkNotNullExpressionValue(dropdownMenu, "dropdownMenu");
        this.f45308I = dropdownMenu;
        TextView dropdownText = gnvVarRl.f9461O;
        Intrinsics.checkNotNullExpressionValue(dropdownText, "dropdownText");
        this.f45307GR = dropdownText;
        this.Nxk = new Function1() { // from class: com.alightcreative.app.motion.activities.RzR
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return kO4.N(obj);
            }
        };
        this.dR0 = new ArrayList();
        this.f45311z = "";
        this.piY = -1;
        this.ijL = -16777216;
        int[] CustomDropdown = IvA.eO.rl;
        Intrinsics.checkNotNullExpressionValue(CustomDropdown, "CustomDropdown");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, CustomDropdown, 0, 0);
        setTextColor(typedArrayObtainStyledAttributes.getInt(4, -16777216));
        String string = typedArrayObtainStyledAttributes.getString(1);
        setDefaultText(string == null ? xg : string);
        gnvVarRl.f9463t.setRadius(typedArrayObtainStyledAttributes.getDimension(0, HI0.afx.t(this, 5.0f)));
        ImageView premiumBadge = gnvVarRl.Uo;
        Intrinsics.checkNotNullExpressionValue(premiumBadge, "premiumBadge");
        premiumBadge.setVisibility(typedArrayObtainStyledAttributes.getBoolean(2, false) ? 0 : 8);
        ImageView icon = gnvVarRl.J2;
        Intrinsics.checkNotNullExpressionValue(icon, "icon");
        icon.setVisibility(typedArrayObtainStyledAttributes.getBoolean(3, false) ? 0 : 8);
        typedArrayObtainStyledAttributes.recycle();
        dropdownMenu.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.pq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                kO4.e(this.f45588n, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit N(Object obj) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(kO4 ko4, View view) {
        xuv xuvVar = ko4.f45310k;
        if (xuvVar != null) {
            xuvVar.Uo(ko4.f45308I.getWidth());
        }
        xuv xuvVar2 = ko4.f45310k;
        if (xuvVar2 != null) {
            xuv.xMQ(xuvVar2, ko4.f45308I, 0, 0, null, 14, null);
        }
    }

    protected final SJ0.gnv getBinding() {
        return this.f45309a;
    }

    public final String getDefaultText() {
        return this.f45311z;
    }

    public List<Object> getItems() {
        return this.dR0;
    }

    protected final Function1<Object, Unit> getOnItemSelected() {
        return this.Nxk;
    }

    protected final xuv getPopup() {
        return this.f45310k;
    }

    public final int getSelectedIndex() {
        return this.piY;
    }

    protected final TextView getSelectionText() {
        return this.f45307GR;
    }

    public int getTextColor() {
        return this.ijL;
    }

    public final void setDefaultText(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f45311z = value;
        int size = getItems().size();
        int i2 = this.piY;
        if (i2 < 0 || i2 >= size) {
            this.f45307GR.setText(value);
        }
    }

    public final void setItems(Collection<Object> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.dR0.clear();
        this.dR0.addAll(items);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        xuv xuvVar = new xuv(context);
        Collection<Object> collection = items;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection, 10));
        int i2 = 0;
        for (Object obj : collection) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            arrayList.add(T(i2, obj));
            i2 = i3;
        }
        xuvVar.O(arrayList);
        this.f45310k = xuvVar;
    }

    protected final void setOnItemSelected(Function1<Object, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.Nxk = function1;
    }

    public final void setOnItemSelectedListener(Function1<Object, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.Nxk = listener;
    }

    protected final void setPopup(xuv xuvVar) {
        this.f45310k = xuvVar;
    }

    public void setSelectedIndex(int i2) {
        String strNr;
        this.piY = i2;
        TextView textView = this.f45307GR;
        Object orNull = CollectionsKt.getOrNull(getItems(), i2);
        if (orNull == null || (strNr = T(i2, orNull).nr()) == null) {
            strNr = this.f45311z;
        }
        textView.setText(strNr);
    }

    public void setTextColor(int i2) {
        this.ijL = i2;
        this.f45307GR.setTextColor(i2);
        ImageView arrow = this.f45309a.rl;
        Intrinsics.checkNotNullExpressionValue(arrow, "arrow");
        eVj.aC.mUb(arrow, i2, 0, 2, null);
    }
}
