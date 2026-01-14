node {
    git url: "https://github.com/ros-industrial/abb_robot_driver.git", branch: "master"
    registerROS('ros:melodic-ros-base', [
        'libprotobuf-dev',
        'protobuf-compiler',
        'ros-melodic-realtime-tools',
        'ros-melodic-joint-limits-interface',
        'ros-melodic-controller-manager',
        'ros-melodic-abb-egm-msgs',
        'ros-melodic-abb-egm-rws-managers',
        'ros-melodic-abb-rapid-msgs',
        'ros-melodic-abb-rapid-sm-addin-msgs',
        'ros-melodic-abb-robot-msgs'
    ], ['ros-melodic-abb-egm-rws-managers'])
}
