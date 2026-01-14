node {
    git url: 'https://github.com/ros-industrial/kuka_experimental.git', branch: 'melodic-devel'
    registerROS('ros:melodic-desktop-full', [
        'ros-melodic-controller-manager',
        'ros-melodic-industrial-robot-client',
        'ros-melodic-joint-limits-interface'
    ], [])
}
