package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
class AlertController {
    private TextView E2;
    Button HI;
    Message Ik;
    private CharSequence J2;
    private View KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private CharSequence f13549O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private Drawable f13550S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    ListAdapter f13551T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    Handler f13552U;
    ListView Uo;
    Message ViF;
    Button WPU;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private View f13553X;
    Message XQ;
    private boolean Xw;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private CharSequence f13554Z;
    private CharSequence aYN;
    private int az;
    int bzg;
    private CharSequence ck;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private TextView f13555e;
    private ImageView fD;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    NestedScrollView f13556g;
    private int gh;
    private Drawable iF;
    private int mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f13557n;
    private int nHg;
    private Drawable nY;
    private final int nr;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    Button f13558o;
    private int qie;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Drawable f13559r;
    int rV9;
    final AppCompatDialog rl;
    private int s7N;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Window f13560t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    int f13561v;
    int wTp;
    private int xMQ;
    private boolean ty = false;
    private int te = 0;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    int f13548N = -1;
    private int jB = 0;
    private final View.OnClickListener P5 = new View.OnClickListener() { // from class: androidx.appcompat.app.AlertController.1
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message message;
            Message message2;
            Message message3;
            AlertController alertController = AlertController.this;
            Message messageObtain = (view != alertController.HI || (message3 = alertController.Ik) == null) ? (view != alertController.f13558o || (message2 = alertController.XQ) == null) ? (view != alertController.WPU || (message = alertController.ViF) == null) ? null : Message.obtain(message) : Message.obtain(message2) : Message.obtain(message3);
            if (messageObtain != null) {
                messageObtain.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.f13552U.obtainMessage(1, alertController2.rl).sendToTarget();
        }
    };

    /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$2, reason: invalid class name */
    class AnonymousClass2 implements NestedScrollView.OnScrollChangeListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ View f13563n;
        final /* synthetic */ View rl;

        @Override // androidx.core.widget.NestedScrollView.OnScrollChangeListener
        public void n(NestedScrollView nestedScrollView, int i2, int i3, int i5, int i7) {
            AlertController.Uo(nestedScrollView, this.f13563n, this.rl);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$3, reason: invalid class name */
    class AnonymousClass3 implements Runnable {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ AlertController f13564O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ View f13565n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ View f13566t;

        @Override // java.lang.Runnable
        public void run() {
            AlertController.Uo(this.f13564O.f13556g, this.f13565n, this.f13566t);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$4, reason: invalid class name */
    class AnonymousClass4 implements AbsListView.OnScrollListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ View f13567n;
        final /* synthetic */ View rl;

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i2) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i2, int i3, int i5) {
            AlertController.Uo(absListView, this.f13567n, this.rl);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$5, reason: invalid class name */
    class AnonymousClass5 implements Runnable {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ AlertController f13568O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ View f13569n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ View f13570t;

        @Override // java.lang.Runnable
        public void run() {
            AlertController.Uo(this.f13568O.Uo, this.f13569n, this.f13570t);
        }
    }

    public static class AlertParams {
        public CharSequence HI;
        public DialogInterface.OnClickListener Ik;
        public CharSequence J2;
        public CharSequence KN;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        public CharSequence[] f13573S;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        public boolean f13574T;
        public View Uo;
        public int ViF;
        public ListAdapter WPU;

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        public boolean f13575X;
        public DialogInterface.OnKeyListener XQ;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        public DialogInterface.OnDismissListener f13576Z;
        public DialogInterface.OnClickListener aYN;
        public Drawable az;
        public OnPrepareListViewListener bzg;
        public Drawable ck;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean[] f13577e;
        public int fD;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f13578g;
        public DialogInterface.OnClickListener gh;
        public int iF;
        public Drawable mUb;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final Context f13579n;
        public DialogInterface.OnMultiChoiceClickListener nHg;
        public View nY;
        public Drawable nr;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public DialogInterface.OnCancelListener f13580o;
        public CharSequence qie;
        public AdapterView.OnItemSelectedListener rV9;
        public final LayoutInflater rl;
        public Cursor s7N;
        public int te;
        public DialogInterface.OnClickListener ty;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public String f13583v;
        public String wTp;
        public CharSequence xMQ;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f13582t = 0;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public int f13572O = 0;
        public boolean E2 = false;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        public int f13571N = -1;
        public boolean Xw = true;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public boolean f13581r = true;

        public interface OnPrepareListViewListener {
            void n(ListView listView);
        }

        private void rl(AlertController alertController) {
            AlertParams alertParams;
            final AlertController alertController2;
            ListAdapter checkedItemAdapter;
            final RecycleListView recycleListView = (RecycleListView) this.rl.inflate(alertController.wTp, (ViewGroup) null);
            if (!this.f13575X) {
                alertParams = this;
                alertController2 = alertController;
                int i2 = alertParams.f13574T ? alertController2.rV9 : alertController2.bzg;
                if (alertParams.s7N != null) {
                    checkedItemAdapter = new SimpleCursorAdapter(alertParams.f13579n, i2, alertParams.s7N, new String[]{alertParams.wTp}, new int[]{R.id.text1});
                } else {
                    checkedItemAdapter = alertParams.WPU;
                    if (checkedItemAdapter == null) {
                        checkedItemAdapter = new CheckedItemAdapter(alertParams.f13579n, i2, R.id.text1, alertParams.f13573S);
                    }
                }
            } else if (this.s7N == null) {
                alertParams = this;
                checkedItemAdapter = new ArrayAdapter<CharSequence>(this.f13579n, alertController.f13561v, R.id.text1, this.f13573S) { // from class: androidx.appcompat.app.AlertController.AlertParams.1
                    @Override // android.widget.ArrayAdapter, android.widget.Adapter
                    public View getView(int i3, View view, ViewGroup viewGroup) {
                        View view2 = super.getView(i3, view, viewGroup);
                        boolean[] zArr = AlertParams.this.f13577e;
                        if (zArr != null && zArr[i3]) {
                            recycleListView.setItemChecked(i3, true);
                        }
                        return view2;
                    }
                };
                recycleListView = recycleListView;
                alertController2 = alertController;
            } else {
                alertParams = this;
                alertController2 = alertController;
                checkedItemAdapter = new CursorAdapter(alertParams.f13579n, alertParams.s7N, false) { // from class: androidx.appcompat.app.AlertController.AlertParams.2

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    private final int f13587n;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    private final int f13589t;

                    {
                        Cursor cursor = getCursor();
                        this.f13587n = cursor.getColumnIndexOrThrow(AlertParams.this.wTp);
                        this.f13589t = cursor.getColumnIndexOrThrow(AlertParams.this.f13583v);
                    }

                    @Override // android.widget.CursorAdapter
                    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                        return AlertParams.this.rl.inflate(alertController2.f13561v, viewGroup, false);
                    }

                    @Override // android.widget.CursorAdapter
                    public void bindView(View view, Context context, Cursor cursor) {
                        ((CheckedTextView) view.findViewById(R.id.text1)).setText(cursor.getString(this.f13587n));
                        RecycleListView recycleListView2 = recycleListView;
                        int position = cursor.getPosition();
                        boolean z2 = true;
                        if (cursor.getInt(this.f13589t) != 1) {
                            z2 = false;
                        }
                        recycleListView2.setItemChecked(position, z2);
                    }
                };
            }
            OnPrepareListViewListener onPrepareListViewListener = alertParams.bzg;
            if (onPrepareListViewListener != null) {
                onPrepareListViewListener.n(recycleListView);
            }
            alertController2.f13551T = checkedItemAdapter;
            alertController2.f13548N = alertParams.f13571N;
            if (alertParams.aYN != null) {
                recycleListView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: androidx.appcompat.app.AlertController.AlertParams.3
                    @Override // android.widget.AdapterView.OnItemClickListener
                    public void onItemClick(AdapterView adapterView, View view, int i3, long j2) {
                        AlertParams.this.aYN.onClick(alertController2.rl, i3);
                        if (AlertParams.this.f13574T) {
                            return;
                        }
                        alertController2.rl.dismiss();
                    }
                });
            } else if (alertParams.nHg != null) {
                recycleListView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: androidx.appcompat.app.AlertController.AlertParams.4
                    @Override // android.widget.AdapterView.OnItemClickListener
                    public void onItemClick(AdapterView adapterView, View view, int i3, long j2) {
                        boolean[] zArr = AlertParams.this.f13577e;
                        if (zArr != null) {
                            zArr[i3] = recycleListView.isItemChecked(i3);
                        }
                        AlertParams.this.nHg.onClick(alertController2.rl, i3, recycleListView.isItemChecked(i3));
                    }
                });
            }
            AdapterView.OnItemSelectedListener onItemSelectedListener = alertParams.rV9;
            if (onItemSelectedListener != null) {
                recycleListView.setOnItemSelectedListener(onItemSelectedListener);
            }
            if (alertParams.f13574T) {
                recycleListView.setChoiceMode(1);
            } else if (alertParams.f13575X) {
                recycleListView.setChoiceMode(2);
            }
            alertController2.Uo = recycleListView;
        }

        public void n(AlertController alertController) {
            AlertController alertController2;
            View view = this.Uo;
            if (view != null) {
                alertController.az(view);
            } else {
                CharSequence charSequence = this.J2;
                if (charSequence != null) {
                    alertController.r(charSequence);
                }
                Drawable drawable = this.nr;
                if (drawable != null) {
                    alertController.HI(drawable);
                }
                int i2 = this.f13582t;
                if (i2 != 0) {
                    alertController.ty(i2);
                }
                int i3 = this.f13572O;
                if (i3 != 0) {
                    alertController.ty(alertController.nr(i3));
                }
            }
            CharSequence charSequence2 = this.KN;
            if (charSequence2 != null) {
                alertController.ck(charSequence2);
            }
            CharSequence charSequence3 = this.xMQ;
            if (charSequence3 == null && this.mUb == null) {
                alertController2 = alertController;
            } else {
                alertController.qie(-1, charSequence3, this.gh, null, this.mUb);
                alertController2 = alertController;
            }
            CharSequence charSequence4 = this.qie;
            if (charSequence4 != null || this.az != null) {
                alertController2.qie(-2, charSequence4, this.ty, null, this.az);
            }
            CharSequence charSequence5 = this.HI;
            if (charSequence5 != null || this.ck != null) {
                alertController2.qie(-3, charSequence5, this.Ik, null, this.ck);
            }
            if (this.f13573S != null || this.s7N != null || this.WPU != null) {
                rl(alertController2);
            }
            View view2 = this.nY;
            if (view2 != null) {
                if (this.E2) {
                    alertController2.XQ(view2, this.f13578g, this.te, this.iF, this.fD);
                    return;
                } else {
                    alertController2.Z(view2);
                    return;
                }
            }
            int i5 = this.ViF;
            if (i5 != 0) {
                alertController2.o(i5);
            }
        }

        public AlertParams(Context context) {
            this.f13579n = context;
            this.rl = (LayoutInflater) context.getSystemService("layout_inflater");
        }
    }

    private static final class ButtonHandler extends Handler {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private WeakReference f13595n;

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == -3 || i2 == -2 || i2 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f13595n.get(), message.what);
            } else {
                if (i2 != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
            }
        }

        public ButtonHandler(DialogInterface dialogInterface) {
            this.f13595n = new WeakReference(dialogInterface);
        }
    }

    public static class RecycleListView extends ListView {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f13596n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final int f13597t;

        public void n(boolean z2, boolean z3) {
            if (z3 && z2) {
                return;
            }
            setPadding(getPaddingLeft(), z2 ? getPaddingTop() : this.f13596n, getPaddingRight(), z3 ? getPaddingBottom() : this.f13597t);
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.appcompat.R.styleable.iV);
            this.f13597t = typedArrayObtainStyledAttributes.getDimensionPixelOffset(androidx.appcompat.R.styleable.I4p, -1);
            this.f13596n = typedArrayObtainStyledAttributes.getDimensionPixelOffset(androidx.appcompat.R.styleable.bZm, -1);
        }
    }

    static void Uo(View view, View view2, View view3) {
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            view3.setVisibility(view.canScrollVertically(1) ? 0 : 4);
        }
    }

    public void o(int i2) {
        this.KN = null;
        this.xMQ = i2;
        this.ty = false;
    }

    public Button t(int i2) {
        if (i2 == -3) {
            return this.WPU;
        }
        if (i2 == -2) {
            return this.f13558o;
        }
        if (i2 != -1) {
            return null;
        }
        return this.HI;
    }

    public void ty(int i2) {
        this.iF = null;
        this.te = i2;
        ImageView imageView = this.fD;
        if (imageView != null) {
            if (i2 == 0) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.fD.setImageResource(this.te);
            }
        }
    }

    private static class CheckedItemAdapter extends ArrayAdapter<CharSequence> {
        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i2) {
            return i2;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }

        public CheckedItemAdapter(Context context, int i2, int i3, CharSequence[] charSequenceArr) {
            super(context, i2, i3, charSequenceArr);
        }
    }

    private void Ik(ViewGroup viewGroup, View view, int i2, int i3) {
        View viewFindViewById = this.f13560t.findViewById(androidx.appcompat.R.id.te);
        View viewFindViewById2 = this.f13560t.findViewById(androidx.appcompat.R.id.f13473g);
        ViewCompat.EWS(view, i2, i3);
        if (viewFindViewById != null) {
            viewGroup.removeView(viewFindViewById);
        }
        if (viewFindViewById2 != null) {
            viewGroup.removeView(viewFindViewById2);
        }
    }

    private void ViF(ViewGroup viewGroup) {
        if (this.f13553X != null) {
            viewGroup.addView(this.f13553X, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f13560t.findViewById(androidx.appcompat.R.id.wTp).setVisibility(8);
            return;
        }
        this.fD = (ImageView) this.f13560t.findViewById(R.id.icon);
        if (TextUtils.isEmpty(this.f13549O) || !this.Xw) {
            this.f13560t.findViewById(androidx.appcompat.R.id.wTp).setVisibility(8);
            this.fD.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.f13560t.findViewById(androidx.appcompat.R.id.gh);
        this.E2 = textView;
        textView.setText(this.f13549O);
        int i2 = this.te;
        if (i2 != 0) {
            this.fD.setImageResource(i2);
            return;
        }
        Drawable drawable = this.iF;
        if (drawable != null) {
            this.fD.setImageDrawable(drawable);
        } else {
            this.E2.setPadding(this.fD.getPaddingLeft(), this.fD.getPaddingTop(), this.fD.getPaddingRight(), this.fD.getPaddingBottom());
            this.fD.setVisibility(8);
        }
    }

    private void WPU(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f13560t.findViewById(androidx.appcompat.R.id.iF);
        this.f13556g = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.f13556g.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(R.id.message);
        this.f13555e = textView;
        if (textView == null) {
            return;
        }
        CharSequence charSequence = this.J2;
        if (charSequence != null) {
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(8);
        this.f13556g.removeView(this.f13555e);
        if (this.Uo == null) {
            viewGroup.setVisibility(8);
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.f13556g.getParent();
        int iIndexOfChild = viewGroup2.indexOfChild(this.f13556g);
        viewGroup2.removeViewAt(iIndexOfChild);
        viewGroup2.addView(this.Uo, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
    }

    private void aYN(ViewGroup viewGroup) {
        View viewInflate = this.KN;
        if (viewInflate == null) {
            viewInflate = this.xMQ != 0 ? LayoutInflater.from(this.f13557n).inflate(this.xMQ, viewGroup, false) : null;
        }
        boolean z2 = viewInflate != null;
        if (!z2 || !n(viewInflate)) {
            this.f13560t.setFlags(131072, 131072);
        }
        if (!z2) {
            viewGroup.setVisibility(8);
            return;
        }
        FrameLayout frameLayout = (FrameLayout) this.f13560t.findViewById(androidx.appcompat.R.id.HI);
        frameLayout.addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
        if (this.ty) {
            frameLayout.setPadding(this.mUb, this.gh, this.qie, this.az);
        }
        if (this.Uo != null) {
            ((LinearLayout.LayoutParams) ((LinearLayoutCompat.LayoutParams) viewGroup.getLayoutParams())).weight = 0.0f;
        }
    }

    private static boolean g(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(androidx.appcompat.R.attr.ty, typedValue, true);
        return typedValue.data != 0;
    }

    private int gh() {
        int i2 = this.s7N;
        return i2 == 0 ? this.nHg : this.jB == 1 ? i2 : this.nHg;
    }

    private ViewGroup mUb(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void nY() {
        View viewFindViewById;
        ListAdapter listAdapter;
        View viewFindViewById2;
        View viewFindViewById3 = this.f13560t.findViewById(androidx.appcompat.R.id.nY);
        int i2 = androidx.appcompat.R.id.f13478v;
        View viewFindViewById4 = viewFindViewById3.findViewById(i2);
        int i3 = androidx.appcompat.R.id.ty;
        View viewFindViewById5 = viewFindViewById3.findViewById(i3);
        int i5 = androidx.appcompat.R.id.qie;
        View viewFindViewById6 = viewFindViewById3.findViewById(i5);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById3.findViewById(androidx.appcompat.R.id.ck);
        aYN(viewGroup);
        View viewFindViewById7 = viewGroup.findViewById(i2);
        View viewFindViewById8 = viewGroup.findViewById(i3);
        View viewFindViewById9 = viewGroup.findViewById(i5);
        ViewGroup viewGroupMUb = mUb(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupMUb2 = mUb(viewFindViewById8, viewFindViewById5);
        ViewGroup viewGroupMUb3 = mUb(viewFindViewById9, viewFindViewById6);
        WPU(viewGroupMUb2);
        S(viewGroupMUb3);
        ViF(viewGroupMUb);
        boolean z2 = viewGroup.getVisibility() != 8;
        boolean z3 = (viewGroupMUb == null || viewGroupMUb.getVisibility() == 8) ? 0 : 1;
        boolean z4 = (viewGroupMUb3 == null || viewGroupMUb3.getVisibility() == 8) ? false : true;
        if (!z4 && viewGroupMUb2 != null && (viewFindViewById2 = viewGroupMUb2.findViewById(androidx.appcompat.R.id.f13469T)) != null) {
            viewFindViewById2.setVisibility(0);
        }
        if (z3 != 0) {
            NestedScrollView nestedScrollView = this.f13556g;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View viewFindViewById10 = (this.J2 == null && this.Uo == null) ? null : viewGroupMUb.findViewById(androidx.appcompat.R.id.s7N);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        } else if (viewGroupMUb2 != null && (viewFindViewById = viewGroupMUb2.findViewById(androidx.appcompat.R.id.f13466N)) != null) {
            viewFindViewById.setVisibility(0);
        }
        ListView listView = this.Uo;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).n(z3, z4);
        }
        if (!z2) {
            View view = this.Uo;
            if (view == null) {
                view = this.f13556g;
            }
            if (view != null) {
                Ik(viewGroupMUb2, view, z3 | (z4 ? 2 : 0), 3);
            }
        }
        ListView listView2 = this.Uo;
        if (listView2 == null || (listAdapter = this.f13551T) == null) {
            return;
        }
        listView2.setAdapter(listAdapter);
        int i7 = this.f13548N;
        if (i7 > -1) {
            listView2.setItemChecked(i7, true);
            listView2.setSelection(i7);
        }
    }

    public void HI(Drawable drawable) {
        this.iF = drawable;
        this.te = 0;
        ImageView imageView = this.fD;
        if (imageView != null) {
            if (drawable == null) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.fD.setImageDrawable(drawable);
            }
        }
    }

    public boolean KN(int i2, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f13556g;
        return nestedScrollView != null && nestedScrollView.Z(keyEvent);
    }

    public ListView O() {
        return this.Uo;
    }

    public void XQ(View view, int i2, int i3, int i5, int i7) {
        this.KN = view;
        this.xMQ = 0;
        this.ty = true;
        this.mUb = i2;
        this.gh = i3;
        this.qie = i5;
        this.az = i7;
    }

    public void Z(View view) {
        this.KN = view;
        this.xMQ = 0;
        this.ty = false;
    }

    public void az(View view) {
        this.f13553X = view;
    }

    public void ck(CharSequence charSequence) {
        this.J2 = charSequence;
        TextView textView = this.f13555e;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public int nr(int i2) {
        TypedValue typedValue = new TypedValue();
        this.f13557n.getTheme().resolveAttribute(i2, typedValue, true);
        return typedValue.resourceId;
    }

    public void qie(int i2, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.f13552U.obtainMessage(i2, onClickListener);
        }
        if (i2 == -3) {
            this.aYN = charSequence;
            this.ViF = message;
            this.nY = drawable;
        } else if (i2 == -2) {
            this.f13554Z = charSequence;
            this.XQ = message;
            this.f13550S = drawable;
        } else {
            if (i2 != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.ck = charSequence;
            this.Ik = message;
            this.f13559r = drawable;
        }
    }

    public void r(CharSequence charSequence) {
        this.f13549O = charSequence;
        TextView textView = this.E2;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public boolean xMQ(int i2, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f13556g;
        return nestedScrollView != null && nestedScrollView.Z(keyEvent);
    }

    public AlertController(Context context, AppCompatDialog appCompatDialog, Window window) {
        this.f13557n = context;
        this.rl = appCompatDialog;
        this.f13560t = window;
        this.f13552U = new ButtonHandler(appCompatDialog);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, androidx.appcompat.R.styleable.f13511T, androidx.appcompat.R.attr.HI, 0);
        this.nHg = typedArrayObtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.f13506N, 0);
        this.s7N = typedArrayObtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.s7N, 0);
        this.wTp = typedArrayObtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.f13536v, 0);
        this.f13561v = typedArrayObtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.rV9, 0);
        this.rV9 = typedArrayObtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.Xw, 0);
        this.bzg = typedArrayObtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.wTp, 0);
        this.Xw = typedArrayObtainStyledAttributes.getBoolean(androidx.appcompat.R.styleable.bzg, true);
        this.nr = typedArrayObtainStyledAttributes.getDimensionPixelSize(androidx.appcompat.R.styleable.nHg, 0);
        typedArrayObtainStyledAttributes.recycle();
        appCompatDialog.KN(1);
    }

    private void S(ViewGroup viewGroup) {
        int i2;
        Button button = (Button) viewGroup.findViewById(R.id.button1);
        this.HI = button;
        button.setOnClickListener(this.P5);
        if (TextUtils.isEmpty(this.ck) && this.f13559r == null) {
            this.HI.setVisibility(8);
            i2 = 0;
        } else {
            this.HI.setText(this.ck);
            Drawable drawable = this.f13559r;
            if (drawable != null) {
                int i3 = this.nr;
                drawable.setBounds(0, 0, i3, i3);
                this.HI.setCompoundDrawables(this.f13559r, null, null, null);
            }
            this.HI.setVisibility(0);
            i2 = 1;
        }
        Button button2 = (Button) viewGroup.findViewById(R.id.button2);
        this.f13558o = button2;
        button2.setOnClickListener(this.P5);
        if (TextUtils.isEmpty(this.f13554Z) && this.f13550S == null) {
            this.f13558o.setVisibility(8);
        } else {
            this.f13558o.setText(this.f13554Z);
            Drawable drawable2 = this.f13550S;
            if (drawable2 != null) {
                int i5 = this.nr;
                drawable2.setBounds(0, 0, i5, i5);
                this.f13558o.setCompoundDrawables(this.f13550S, null, null, null);
            }
            this.f13558o.setVisibility(0);
            i2 |= 2;
        }
        Button button3 = (Button) viewGroup.findViewById(R.id.button3);
        this.WPU = button3;
        button3.setOnClickListener(this.P5);
        if (TextUtils.isEmpty(this.aYN) && this.nY == null) {
            this.WPU.setVisibility(8);
        } else {
            this.WPU.setText(this.aYN);
            Drawable drawable3 = this.nY;
            if (drawable3 != null) {
                int i7 = this.nr;
                drawable3.setBounds(0, 0, i7, i7);
                this.WPU.setCompoundDrawables(this.nY, null, null, null);
            }
            this.WPU.setVisibility(0);
            i2 |= 4;
        }
        if (g(this.f13557n)) {
            if (i2 == 1) {
                rl(this.HI);
            } else if (i2 == 2) {
                rl(this.f13558o);
            } else if (i2 == 4) {
                rl(this.WPU);
            }
        }
        if (i2 != 0) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    static boolean n(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (n(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    private void rl(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    public void J2() {
        this.rl.setContentView(gh());
        nY();
    }
}
