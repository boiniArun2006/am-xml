package yc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.alightcreative.app.motion.scene.animators.Animator;
import com.alightcreative.app.motion.scene.animators.AnimatorInfo;
import com.alightcreative.app.motion.scene.animators.AnimatorKt;
import com.alightcreative.app.motion.scene.animators.AnimatorParamInfo;
import com.alightcreative.app.motion.scene.animators.UIControl;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class nKK extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final AnimatorInfo f76064n;
    private final Function0 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Function1 f76065t;

    public static final class j extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final ViewBinding f76066n;

        /* JADX INFO: renamed from: yc.nKK$j$j, reason: collision with other inner class name */
        public static final class C1286j implements SeekBar.OnSeekBarChangeListener {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ Function1 f76067O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ UIControl f76068n;
            final /* synthetic */ AnimatorParamInfo nr;
            final /* synthetic */ j rl;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ Function0 f76069t;

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(SeekBar seekBar, int i2, boolean z2) {
                float steps = (float) (((((double) i2) / ((double) ((UIControl.Slider) this.f76068n).getSteps())) * (((UIControl.Slider) this.f76068n).getMax() - ((UIControl.Slider) this.f76068n).getMin())) + ((UIControl.Slider) this.f76068n).getMin());
                TextView textView = ((SJ0.K) this.rl.O()).f9172t;
                String str = String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(steps)}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                textView.setText(str);
                if (z2) {
                    this.f76067O.invoke((Animator) HI0.iF.n(this.f76069t.invoke(), MapsKt.mapOf(TuplesKt.to(this.nr.getId(), Float.valueOf(steps)))));
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(SeekBar seekBar) {
            }

            C1286j(UIControl uIControl, j jVar, Function0 function0, AnimatorParamInfo animatorParamInfo, Function1 function1) {
                this.f76068n = uIControl;
                this.rl = jVar;
                this.f76069t = function0;
                this.nr = animatorParamInfo;
                this.f76067O = function1;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ViewBinding itemBinding) {
            super(itemBinding.getRoot());
            Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
            this.f76066n = itemBinding;
        }

        public final ViewBinding O() {
            return this.f76066n;
        }

        public final void nr(AnimatorParamInfo paramInfo, Function0 getAnimator, Function1 onAnimatorPropertyChanged) {
            Intrinsics.checkNotNullParameter(paramInfo, "paramInfo");
            Intrinsics.checkNotNullParameter(getAnimator, "getAnimator");
            Intrinsics.checkNotNullParameter(onAnimatorPropertyChanged, "onAnimatorPropertyChanged");
            UIControl control = paramInfo.getControl();
            if (!(control instanceof UIControl.Slider)) {
                if (!(control instanceof UIControl.Switch)) {
                    throw new NoWhenBranchMatchedException();
                }
                ViewBinding viewBinding = this.f76066n;
                Intrinsics.checkNotNull(viewBinding, "null cannot be cast to non-null type com.alightcreative.app.motion.databinding.AnimatorSettingSwitchBinding");
                TextView textView = ((SJ0.psW) this.f76066n).rl;
                Function1<Context, String> getLabel = paramInfo.getGetLabel();
                Context context = this.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                textView.setText(getLabel.invoke(context));
                throw new NotImplementedError(null, 1, null);
            }
            ViewBinding viewBinding2 = this.f76066n;
            Intrinsics.checkNotNull(viewBinding2, "null cannot be cast to non-null type com.alightcreative.app.motion.databinding.AnimatorSettingSliderBinding");
            TextView textView2 = ((SJ0.K) this.f76066n).rl;
            Function1<Context, String> getLabel2 = paramInfo.getGetLabel();
            Context context2 = this.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            textView2.setText(getLabel2.invoke(context2));
            double doubleParam = AnimatorKt.getDoubleParam(paramInfo, (Animator) getAnimator.invoke());
            SeekBar seekBar = ((SJ0.K) this.f76066n).nr;
            UIControl.Slider slider = (UIControl.Slider) control;
            seekBar.setMax(slider.getSteps());
            seekBar.setProgress(MathKt.roundToInt(((doubleParam - slider.getMin()) / (slider.getMax() - slider.getMin())) * ((double) slider.getSteps())));
            seekBar.setOnSeekBarChangeListener(new C1286j(control, this, getAnimator, paramInfo, onAnimatorPropertyChanged));
            TextView textView3 = ((SJ0.K) this.f76066n).f9172t;
            String str = String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(doubleParam)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            textView3.setText(str);
        }
    }

    public nKK(AnimatorInfo animatorInfo, Function0 getAnimator, Function1 onAnimatorPropertyChanged) {
        Intrinsics.checkNotNullParameter(animatorInfo, "animatorInfo");
        Intrinsics.checkNotNullParameter(getAnimator, "getAnimator");
        Intrinsics.checkNotNullParameter(onAnimatorPropertyChanged, "onAnimatorPropertyChanged");
        this.f76064n = animatorInfo;
        this.rl = getAnimator;
        this.f76065t = onAnimatorPropertyChanged;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: az, reason: merged with bridge method [inline-methods] */
    public j onCreateViewHolder(ViewGroup parent, int i2) {
        ViewBinding viewBindingT;
        Intrinsics.checkNotNullParameter(parent, "parent");
        switch (i2) {
            case 2131558485:
                viewBindingT = SJ0.K.t(LayoutInflater.from(parent.getContext()), parent, false);
                Intrinsics.checkNotNull(viewBindingT);
                break;
            case 2131558486:
                viewBindingT = SJ0.psW.t(LayoutInflater.from(parent.getContext()), parent, false);
                Intrinsics.checkNotNull(viewBindingT);
                break;
            default:
                throw new UnsupportedOperationException();
        }
        return new j(viewBindingT);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f76064n.getParameters().size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i2) {
        UIControl control = this.f76064n.getParameters().get(i2).getControl();
        if (control instanceof UIControl.Slider) {
            return 2131558485;
        }
        if (control instanceof UIControl.Switch) {
            return 2131558486;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: qie, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(j holder, int i2) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.nr(this.f76064n.getParameters().get(i2), this.rl, this.f76065t);
    }
}
