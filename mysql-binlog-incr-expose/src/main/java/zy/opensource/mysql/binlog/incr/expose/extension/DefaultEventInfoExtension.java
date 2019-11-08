package zy.opensource.mysql.binlog.incr.expose.extension;


import zy.opensource.mysql.binlog.incr.expose.build.BaseEventInfoMerge;

/**
 * @program: mysql-binlog-incr-expose
 * @description
 * @author: zy
 * @create: 2019-08-09 08:52
 **/
public class DefaultEventInfoExtension extends AbstractEventInfoExtension {

    private BaseEventInfoMerge eventInfoMerge;

    @Override
    public void setStepCount(int stepCount) {
        this.stepCount = stepCount;
    }

    @Override
    public void setCurrentStep(int currentStep) {
        this.currentStep = currentStep;
    }

    @Override
    public void setLastStep(boolean lastStep) {
        this.lastStep = lastStep;
    }

    @Override
    public void setFirstStep(boolean firstStep) {
        this.firstStep = firstStep;
    }

    public void setEventInfoMerge(BaseEventInfoMerge eventInfoMerge) {
        this.eventInfoMerge = eventInfoMerge;
    }
}
