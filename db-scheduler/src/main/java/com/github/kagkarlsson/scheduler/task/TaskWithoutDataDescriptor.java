/**
 * Copyright (C) Gustav Karlsson
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.kagkarlsson.scheduler.task;

/**
 * Experimental
 */
public class TaskWithoutDataDescriptor implements TaskDescriptor<Void> {

    private final String taskName;

    public TaskWithoutDataDescriptor(String taskName) {
        this.taskName = taskName;
    }

    public TaskInstance<Void> instance(String id) {
        return new TaskInstance<>(taskName, id);
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public Class<Void> getDataClass() {
        return Void.class;
    }

    public TaskInstanceId instanceId(String id) {
        return TaskInstanceId.of(taskName, id);
    }
}
