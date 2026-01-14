node {
    git url: 'https://github.com/ros-industrial/kuka_experimental.git', branch: 'melodic-devel'
    registerROS('ros:noetic-desktop-full', [
        'ros-noetic-controller-manager',
        'ros-noetic-industrial-robot-client',
        'ros-noetic-joint-limits-interface'
    ], [])
}
