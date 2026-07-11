package androidx.transition;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
class GhostViewPort extends ViewGroup implements GhostView {
    int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final View f42185O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    ViewGroup f42186n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final ViewTreeObserver.OnPreDrawListener f42187o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Matrix f42188r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    View f42189t;

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        CanvasUtils.n(canvas, true);
        canvas.setMatrix(this.f42188r);
        ViewUtils.Uo(this.f42185O, 0);
        this.f42185O.invalidate();
        ViewUtils.Uo(this.f42185O, 4);
        drawChild(canvas, this.f42185O, getDrawingTime());
        CanvasUtils.n(canvas, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i5, int i7) {
    }

    static GhostViewPort O(View view) {
        return (GhostViewPort) view.getTag(R.id.f42198n);
    }

    static void Uo(View view, GhostViewPort ghostViewPort) {
        view.setTag(R.id.f42198n, ghostViewPort);
    }

    void KN(Matrix matrix) {
        this.f42188r = matrix;
    }

    @Override // androidx.transition.GhostView
    public void n(ViewGroup viewGroup, View view) {
        this.f42186n = viewGroup;
        this.f42189t = view;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.f42185O.getViewTreeObserver().removeOnPreDrawListener(this.f42187o);
        ViewUtils.Uo(this.f42185O, 0);
        Uo(this.f42185O, null);
        if (this.f42185O.getParent() != null) {
            ((View) this.f42185O.getParent()).invalidate();
        }
        super.onDetachedFromWindow();
    }

    GhostViewPort(View view) {
        super(view.getContext());
        this.f42187o = new ViewTreeObserver.OnPreDrawListener() { // from class: androidx.transition.GhostViewPort.1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                View view2;
                GhostViewPort.this.postInvalidateOnAnimation();
                GhostViewPort ghostViewPort = GhostViewPort.this;
                ViewGroup viewGroup = ghostViewPort.f42186n;
                if (viewGroup == null || (view2 = ghostViewPort.f42189t) == null) {
                    return true;
                }
                viewGroup.endViewTransition(view2);
                GhostViewPort.this.f42186n.postInvalidateOnAnimation();
                GhostViewPort ghostViewPort2 = GhostViewPort.this;
                ghostViewPort2.f42186n = null;
                ghostViewPort2.f42189t = null;
                return true;
            }
        };
        this.f42185O = view;
        setWillNotDraw(false);
        setClipChildren(false);
        setLayerType(2, null);
    }

    static void J2(View view) {
        GhostViewPort ghostViewPortO = O(view);
        if (ghostViewPortO != null) {
            int i2 = ghostViewPortO.J2 - 1;
            ghostViewPortO.J2 = i2;
            if (i2 <= 0) {
                ((GhostViewHolder) ghostViewPortO.getParent()).removeView(ghostViewPortO);
            }
        }
    }

    static void nr(View view, View view2) {
        ViewUtils.O(view2, view2.getLeft(), view2.getTop(), view2.getLeft() + view.getWidth(), view2.getTop() + view.getHeight());
    }

    static GhostViewPort rl(View view, ViewGroup viewGroup, Matrix matrix) {
        int i2;
        GhostViewHolder ghostViewHolder;
        if (view.getParent() instanceof ViewGroup) {
            GhostViewHolder ghostViewHolderRl = GhostViewHolder.rl(viewGroup);
            GhostViewPort ghostViewPortO = O(view);
            if (ghostViewPortO != null && (ghostViewHolder = (GhostViewHolder) ghostViewPortO.getParent()) != ghostViewHolderRl) {
                i2 = ghostViewPortO.J2;
                ghostViewHolder.removeView(ghostViewPortO);
                ghostViewPortO = null;
            } else {
                i2 = 0;
            }
            if (ghostViewPortO == null) {
                if (matrix == null) {
                    matrix = new Matrix();
                    t(view, viewGroup, matrix);
                }
                ghostViewPortO = new GhostViewPort(view);
                ghostViewPortO.KN(matrix);
                if (ghostViewHolderRl == null) {
                    ghostViewHolderRl = new GhostViewHolder(viewGroup);
                } else {
                    ghostViewHolderRl.Uo();
                }
                nr(viewGroup, ghostViewHolderRl);
                nr(viewGroup, ghostViewPortO);
                ghostViewHolderRl.n(ghostViewPortO);
                ghostViewPortO.J2 = i2;
            } else if (matrix != null) {
                ghostViewPortO.KN(matrix);
            }
            ghostViewPortO.J2++;
            return ghostViewPortO;
        }
        throw new IllegalArgumentException("Ghosted views must be parented by a ViewGroup");
    }

    static void t(View view, ViewGroup viewGroup, Matrix matrix) {
        ViewGroup viewGroup2 = (ViewGroup) view.getParent();
        matrix.reset();
        ViewUtils.KN(viewGroup2, matrix);
        matrix.preTranslate(-viewGroup2.getScrollX(), -viewGroup2.getScrollY());
        ViewUtils.xMQ(viewGroup, matrix);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Uo(this.f42185O, this);
        this.f42185O.getViewTreeObserver().addOnPreDrawListener(this.f42187o);
        ViewUtils.Uo(this.f42185O, 4);
        if (this.f42185O.getParent() != null) {
            ((View) this.f42185O.getParent()).invalidate();
        }
    }

    @Override // android.view.View, androidx.transition.GhostView
    public void setVisibility(int i2) {
        int i3;
        super.setVisibility(i2);
        if (O(this.f42185O) == this) {
            if (i2 == 0) {
                i3 = 4;
            } else {
                i3 = 0;
            }
            ViewUtils.Uo(this.f42185O, i3);
        }
    }
}
