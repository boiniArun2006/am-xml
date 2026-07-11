package com.alightcreative.app.motion.easing;

import com.caoccao.javet.values.reference.builtin.V8ValueBuiltInSymbol;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/alightcreative/app/motion/easing/SplittableEasing;", "Lcom/alightcreative/app/motion/easing/Easing;", V8ValueBuiltInSymbol.PROPERTY_SPLIT, "Lkotlin/Pair;", "t", "", "Lcom/alightcreative/app/motion/easing/CubicBezierEasing;", "Lcom/alightcreative/app/motion/easing/LinearEasing;", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface SplittableEasing extends Easing {
    Pair<SplittableEasing, SplittableEasing> split(float t3);
}
