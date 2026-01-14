node {
    git url: 'https://github.com/ros-industrial/abb_robot_driver.git', branch: 'master'
    registerROS('ros:noetic-ros-base', [
        'protobuf-compiler',
        'ros-noetic-abb-egm-msgs',
        'ros-noetic-abb-egm-rws-managers',
        'ros-noetic-abb-rapid-msgs',
        'ros-noetic-abb-rapid-sm-addin-msgs',
        'ros-noetic-abb-robot-msgs',
        'ros-noetic-controller-manager',
        'ros-noetic-joint-limits-interface',
        'ros-noetic-realtime-tools'
    ], ['ros-noetic-abb-egm-rws-managers'])
}
