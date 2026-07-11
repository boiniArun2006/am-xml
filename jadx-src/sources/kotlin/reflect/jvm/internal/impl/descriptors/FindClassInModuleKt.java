package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.ResolutionAnchorProviderKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.sequences.SequencesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@SourceDebugExtension({"SMAP\nfindClassInModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 findClassInModule.kt\norg/jetbrains/kotlin/descriptors/FindClassInModuleKt\n*L\n1#1,66:1\n43#1,2:67\n*S KotlinDebug\n*F\n+ 1 findClassInModule.kt\norg/jetbrains/kotlin/descriptors/FindClassInModuleKt\n*L\n23#1:67,2\n*E\n"})
public final class FindClassInModuleKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int findNonGenericClassAcrossDependencies$lambda$1(ClassId it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return 0;
    }

    public static final ClassDescriptor findClassAcrossModuleDependencies(ModuleDescriptor moduleDescriptor, ClassId classId) {
        Intrinsics.checkNotNullParameter(moduleDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(classId, "classId");
        ClassifierDescriptor classifierDescriptorFindClassifierAcrossModuleDependencies = findClassifierAcrossModuleDependencies(moduleDescriptor, classId);
        if (classifierDescriptorFindClassifierAcrossModuleDependencies instanceof ClassDescriptor) {
            return (ClassDescriptor) classifierDescriptorFindClassifierAcrossModuleDependencies;
        }
        return null;
    }

    public static final ClassifierDescriptor findClassifierAcrossModuleDependencies(ModuleDescriptor moduleDescriptor, ClassId classId) {
        Intrinsics.checkNotNullParameter(moduleDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(classId, "classId");
        ModuleDescriptor resolutionAnchorIfAny = ResolutionAnchorProviderKt.getResolutionAnchorIfAny(moduleDescriptor);
        if (resolutionAnchorIfAny == null) {
            PackageViewDescriptor packageViewDescriptor = moduleDescriptor.getPackage(classId.getPackageFqName());
            List<Name> listPathSegments = classId.getRelativeClassName().pathSegments();
            Intrinsics.checkNotNullExpressionValue(listPathSegments, "pathSegments(...)");
            MemberScope memberScope = packageViewDescriptor.getMemberScope();
            Object objFirst = CollectionsKt.first((List<? extends Object>) listPathSegments);
            Intrinsics.checkNotNullExpressionValue(objFirst, "first(...)");
            ClassifierDescriptor classifierDescriptorMo1593getContributedClassifier = memberScope.mo1593getContributedClassifier((Name) objFirst, NoLookupLocation.FROM_DESERIALIZATION);
            if (classifierDescriptorMo1593getContributedClassifier == null) {
                return null;
            }
            for (Name name : listPathSegments.subList(1, listPathSegments.size())) {
                if (!(classifierDescriptorMo1593getContributedClassifier instanceof ClassDescriptor)) {
                    return null;
                }
                MemberScope unsubstitutedInnerClassesScope = ((ClassDescriptor) classifierDescriptorMo1593getContributedClassifier).getUnsubstitutedInnerClassesScope();
                Intrinsics.checkNotNull(name);
                ClassifierDescriptor classifierDescriptorMo1593getContributedClassifier2 = unsubstitutedInnerClassesScope.mo1593getContributedClassifier(name, NoLookupLocation.FROM_DESERIALIZATION);
                classifierDescriptorMo1593getContributedClassifier = classifierDescriptorMo1593getContributedClassifier2 instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo1593getContributedClassifier2 : null;
                if (classifierDescriptorMo1593getContributedClassifier == null) {
                    return null;
                }
            }
            return classifierDescriptorMo1593getContributedClassifier;
        }
        PackageViewDescriptor packageViewDescriptor2 = resolutionAnchorIfAny.getPackage(classId.getPackageFqName());
        List<Name> listPathSegments2 = classId.getRelativeClassName().pathSegments();
        Intrinsics.checkNotNullExpressionValue(listPathSegments2, "pathSegments(...)");
        MemberScope memberScope2 = packageViewDescriptor2.getMemberScope();
        Object objFirst2 = CollectionsKt.first((List<? extends Object>) listPathSegments2);
        Intrinsics.checkNotNullExpressionValue(objFirst2, "first(...)");
        ClassifierDescriptor classifierDescriptorMo1593getContributedClassifier3 = memberScope2.mo1593getContributedClassifier((Name) objFirst2, NoLookupLocation.FROM_DESERIALIZATION);
        if (classifierDescriptorMo1593getContributedClassifier3 == null) {
            classifierDescriptorMo1593getContributedClassifier3 = null;
            break;
        }
        for (Name name2 : listPathSegments2.subList(1, listPathSegments2.size())) {
            if (classifierDescriptorMo1593getContributedClassifier3 instanceof ClassDescriptor) {
                MemberScope unsubstitutedInnerClassesScope2 = ((ClassDescriptor) classifierDescriptorMo1593getContributedClassifier3).getUnsubstitutedInnerClassesScope();
                Intrinsics.checkNotNull(name2);
                ClassifierDescriptor classifierDescriptorMo1593getContributedClassifier4 = unsubstitutedInnerClassesScope2.mo1593getContributedClassifier(name2, NoLookupLocation.FROM_DESERIALIZATION);
                classifierDescriptorMo1593getContributedClassifier3 = classifierDescriptorMo1593getContributedClassifier4 instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo1593getContributedClassifier4 : null;
                if (classifierDescriptorMo1593getContributedClassifier3 != null) {
                }
            }
            classifierDescriptorMo1593getContributedClassifier3 = null;
        }
        if (classifierDescriptorMo1593getContributedClassifier3 != null) {
            return classifierDescriptorMo1593getContributedClassifier3;
        }
        PackageViewDescriptor packageViewDescriptor3 = moduleDescriptor.getPackage(classId.getPackageFqName());
        List<Name> listPathSegments3 = classId.getRelativeClassName().pathSegments();
        Intrinsics.checkNotNullExpressionValue(listPathSegments3, "pathSegments(...)");
        MemberScope memberScope3 = packageViewDescriptor3.getMemberScope();
        Object objFirst3 = CollectionsKt.first((List<? extends Object>) listPathSegments3);
        Intrinsics.checkNotNullExpressionValue(objFirst3, "first(...)");
        ClassifierDescriptor classifierDescriptorMo1593getContributedClassifier5 = memberScope3.mo1593getContributedClassifier((Name) objFirst3, NoLookupLocation.FROM_DESERIALIZATION);
        if (classifierDescriptorMo1593getContributedClassifier5 == null) {
            return null;
        }
        for (Name name3 : listPathSegments3.subList(1, listPathSegments3.size())) {
            if (!(classifierDescriptorMo1593getContributedClassifier5 instanceof ClassDescriptor)) {
                return null;
            }
            MemberScope unsubstitutedInnerClassesScope3 = ((ClassDescriptor) classifierDescriptorMo1593getContributedClassifier5).getUnsubstitutedInnerClassesScope();
            Intrinsics.checkNotNull(name3);
            ClassifierDescriptor classifierDescriptorMo1593getContributedClassifier6 = unsubstitutedInnerClassesScope3.mo1593getContributedClassifier(name3, NoLookupLocation.FROM_DESERIALIZATION);
            classifierDescriptorMo1593getContributedClassifier5 = classifierDescriptorMo1593getContributedClassifier6 instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo1593getContributedClassifier6 : null;
            if (classifierDescriptorMo1593getContributedClassifier5 == null) {
                return null;
            }
        }
        return classifierDescriptorMo1593getContributedClassifier5;
    }

    public static final ClassDescriptor findNonGenericClassAcrossDependencies(ModuleDescriptor moduleDescriptor, ClassId classId, NotFoundClasses notFoundClasses) {
        Intrinsics.checkNotNullParameter(moduleDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(classId, "classId");
        Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
        ClassDescriptor classDescriptorFindClassAcrossModuleDependencies = findClassAcrossModuleDependencies(moduleDescriptor, classId);
        return classDescriptorFindClassAcrossModuleDependencies != null ? classDescriptorFindClassAcrossModuleDependencies : notFoundClasses.getClass(classId, SequencesKt.toList(SequencesKt.map(SequencesKt.generateSequence(classId, new PropertyReference1() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt$findNonGenericClassAcrossDependencies$typeParametersCount$1
            @Override // kotlin.jvm.internal.CallableReference
            public KDeclarationContainer getOwner() {
                return Reflection.getOrCreateKotlinClass(ClassId.class);
            }

            @Override // kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((ClassId) obj).getOuterClassId();
            }

            @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
            public String getName() {
                return "outerClassId";
            }

            @Override // kotlin.jvm.internal.CallableReference
            public String getSignature() {
                return "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;";
            }
        }), new Function1() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt$$Lambda$0
            @Override // kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return Integer.valueOf(FindClassInModuleKt.findNonGenericClassAcrossDependencies$lambda$1((ClassId) obj));
            }
        })));
    }

    public static final TypeAliasDescriptor findTypeAliasAcrossModuleDependencies(ModuleDescriptor moduleDescriptor, ClassId classId) {
        Intrinsics.checkNotNullParameter(moduleDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(classId, "classId");
        ClassifierDescriptor classifierDescriptorFindClassifierAcrossModuleDependencies = findClassifierAcrossModuleDependencies(moduleDescriptor, classId);
        if (classifierDescriptorFindClassifierAcrossModuleDependencies instanceof TypeAliasDescriptor) {
            return (TypeAliasDescriptor) classifierDescriptorFindClassifierAcrossModuleDependencies;
        }
        return null;
    }
}
