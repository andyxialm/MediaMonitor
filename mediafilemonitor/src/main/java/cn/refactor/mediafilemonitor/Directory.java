/*
  Copyright 2017 andy (https://github.com/andyxialm)

  Licensed under the Apache License, Version 2.0 (the "License");
  you may not use this file except in compliance with the License.
  You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License.
 */
package cn.refactor.mediafilemonitor;

/**
 * Created by andy (https://github.com/andyxialm)
 * Creation time: 17/8/2 15:40
 * Description: Directory
 */
public class Directory {
    private String mDirectory;
    private @Rule int mRule;

    public Directory(String directory) {
        this(directory, Rule.LIKE);
    }

    public Directory(String directory, @Rule int rule) {
        this.mDirectory = directory;
        this.mRule = rule;
    }

    public String getDirectory() {
        return mDirectory;
    }

    public void setDirectory(String directory) {
        this.mDirectory = directory;
    }

    public @Rule int getRule() {
        return mRule;
    }

    public void setRule(@Rule int rule) {
        this.mRule = rule;
    }
}
