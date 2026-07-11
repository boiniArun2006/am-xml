package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.widget.TintTypedArray;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@RestrictTo
public class ListMenuItemView extends LinearLayout implements MenuView.ItemView, AbsListView.SelectionBoundsAdjuster {
    private LinearLayout E2;
    private TextView J2;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private Context f13846N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private RadioButton f13847O;
    private boolean P5;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private ImageView f13848S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private int f13849T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private LayoutInflater f13850U;
    private Drawable Xw;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Drawable f13851e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ImageView f13852g;
    private boolean jB;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private MenuItemImpl f13853n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private TextView f13854o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private CheckBox f13855r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ImageView f13856t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f13857v;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f13433a);
    }

    private void n(View view) {
        rl(view, -1);
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public boolean O() {
        return false;
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet);
        TintTypedArray tintTypedArrayS = TintTypedArray.S(getContext(), attributeSet, R.styleable.tEO, i2, 0);
        this.f13851e = tintTypedArrayS.Uo(R.styleable.f13525h);
        this.f13849T = tintTypedArrayS.ty(R.styleable.yAc, -1);
        this.f13857v = tintTypedArrayS.n(R.styleable.f13529l, false);
        this.f13846N = context;
        this.Xw = tintTypedArrayS.Uo(R.styleable.f13522eo);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.f13418FX, 0);
        this.jB = typedArrayObtainStyledAttributes.hasValue(0);
        tintTypedArrayS.aYN();
        typedArrayObtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f13850U == null) {
            this.f13850U = LayoutInflater.from(getContext());
        }
        return this.f13850U;
    }

    private void rl(View view, int i2) {
        LinearLayout linearLayout = this.E2;
        if (linearLayout != null) {
            linearLayout.addView(view, i2);
        } else {
            addView(view, i2);
        }
    }

    private void setSubMenuArrowVisible(boolean z2) {
        ImageView imageView = this.f13848S;
        if (imageView != null) {
            imageView.setVisibility(z2 ? 0 : 8);
        }
    }

    public void KN(boolean z2, char c2) {
        int i2 = (z2 && this.f13853n.g()) ? 0 : 8;
        if (i2 == 0) {
            this.f13854o.setText(this.f13853n.KN());
        }
        if (this.f13854o.getVisibility() != i2) {
            this.f13854o.setVisibility(i2);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f13852g;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f13852g.getLayoutParams();
        rect.top += this.f13852g.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public MenuItemImpl getItemData() {
        return this.f13853n;
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        if (this.f13856t != null && this.f13857v) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f13856t.getLayoutParams();
            int i5 = layoutParams.height;
            if (i5 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i5;
            }
        }
        super.onMeasure(i2, i3);
    }

    public void setCheckable(boolean z2) {
        CompoundButton compoundButton;
        View view;
        if (!z2 && this.f13847O == null && this.f13855r == null) {
            return;
        }
        if (this.f13853n.az()) {
            if (this.f13847O == null) {
                Uo();
            }
            compoundButton = this.f13847O;
            view = this.f13855r;
        } else {
            if (this.f13855r == null) {
                nr();
            }
            compoundButton = this.f13855r;
            view = this.f13847O;
        }
        if (z2) {
            compoundButton.setChecked(this.f13853n.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f13855r;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f13847O;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z2) {
        CompoundButton compoundButton;
        if (this.f13853n.az()) {
            if (this.f13847O == null) {
                Uo();
            }
            compoundButton = this.f13847O;
        } else {
            if (this.f13855r == null) {
                nr();
            }
            compoundButton = this.f13855r;
        }
        compoundButton.setChecked(z2);
    }

    public void setForceShowIcon(boolean z2) {
        this.P5 = z2;
        this.f13857v = z2;
    }

    public void setGroupDividerEnabled(boolean z2) {
        ImageView imageView = this.f13852g;
        if (imageView != null) {
            imageView.setVisibility((this.jB || !z2) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z2 = this.f13853n.nY() || this.P5;
        if (z2 || this.f13857v) {
            ImageView imageView = this.f13856t;
            if (imageView == null && drawable == null && !this.f13857v) {
                return;
            }
            if (imageView == null) {
                J2();
            }
            if (drawable == null && !this.f13857v) {
                this.f13856t.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.f13856t;
            if (!z2) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.f13856t.getVisibility() != 0) {
                this.f13856t.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.J2.getVisibility() != 8) {
                this.J2.setVisibility(8);
            }
        } else {
            this.J2.setText(charSequence);
            if (this.J2.getVisibility() != 0) {
                this.J2.setVisibility(0);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void t(MenuItemImpl menuItemImpl, int i2) {
        this.f13853n = menuItemImpl;
        setVisibility(menuItemImpl.isVisible() ? 0 : 8);
        setTitle(menuItemImpl.xMQ(this));
        setCheckable(menuItemImpl.isCheckable());
        KN(menuItemImpl.g(), menuItemImpl.Uo());
        setIcon(menuItemImpl.getIcon());
        setEnabled(menuItemImpl.isEnabled());
        setSubMenuArrowVisible(menuItemImpl.hasSubMenu());
        setContentDescription(menuItemImpl.getContentDescription());
    }

    private void J2() {
        ImageView imageView = (ImageView) getInflater().inflate(R.layout.gh, (ViewGroup) this, false);
        this.f13856t = imageView;
        rl(imageView, 0);
    }

    private void Uo() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.az, (ViewGroup) this, false);
        this.f13847O = radioButton;
        n(radioButton);
    }

    private void nr() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.mUb, (ViewGroup) this, false);
        this.f13855r = checkBox;
        n(checkBox);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f13851e);
        TextView textView = (TextView) findViewById(R.id.nHg);
        this.J2 = textView;
        int i2 = this.f13849T;
        if (i2 != -1) {
            textView.setTextAppearance(this.f13846N, i2);
        }
        this.f13854o = (TextView) findViewById(R.id.fD);
        ImageView imageView = (ImageView) findViewById(R.id.f13470X);
        this.f13848S = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.Xw);
        }
        this.f13852g = (ImageView) findViewById(R.id.XQ);
        this.E2 = (LinearLayout) findViewById(R.id.az);
    }
}
