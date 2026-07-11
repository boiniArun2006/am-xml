package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class IntValue extends IntegerValueConstant<Integer> {
    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public SimpleType getType(ModuleDescriptor module) {
        Intrinsics.checkNotNullParameter(module, "module");
        SimpleType intType = module.getBuiltIns().getIntType();
        Intrinsics.checkNotNullExpressionValue(intType, "getIntType(...)");
        return intType;
    }

    public IntValue(int i2) {
        super(Integer.valueOf(i2));
    }
}
