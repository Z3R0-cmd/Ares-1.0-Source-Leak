package org.spongepowered.tools.obfuscation.interfaces;

import org.spongepowered.tools.obfuscation.mirror.TypeHandle;
import java.util.Collection;
import org.spongepowered.tools.obfuscation.mirror.AnnotationHandle;
import javax.lang.model.element.TypeElement;

public interface IMixinValidator
{
    boolean validate(ValidationPass p0, TypeElement p1, AnnotationHandle p2, Collection<TypeHandle> p3);
    
    public enum ValidationPass
    {
        EARLY, 
        LATE, 
        FINAL;
    }
}
