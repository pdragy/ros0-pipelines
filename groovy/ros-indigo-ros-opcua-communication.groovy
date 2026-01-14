node {
    git url: 'https://github.com/iirob/ros_opcua_communication.git', branch: 'indigo-devel'
    sh 'git submodule update --init --recursive'
    registerROS('ros:indigo-ros-base', [], [])
}
